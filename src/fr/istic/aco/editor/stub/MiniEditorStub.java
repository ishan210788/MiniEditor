/**
 * @author Ishan Tiwari and Ricardo Ernesto Martinez Ramirez
 *
 * @see MINI TEXT EDITOR
 * @see DSS - M1
 * @see EIT ICT Labs
 * 
 */
package fr.istic.aco.editor.stub;

import fr.istic.aco.editor.commands.Command;
import fr.istic.aco.editor.commands.Copy;
import fr.istic.aco.editor.commands.Cut;
import fr.istic.aco.editor.commands.Insert;
import fr.istic.aco.editor.commands.Paste;
import fr.istic.aco.editor.commands.Select;
import fr.istic.aco.editor.core.MiniEditor;
import fr.istic.aco.editor.core.MiniEditorEngine;
import fr.istic.aco.editor.core.MiniEditorInvoker;
import fr.istic.aco.editor.version2.core.EditorRecordingManager;
import fr.istic.aco.editor.version2.commands.Play;
import fr.istic.aco.editor.version2.commands.StartRecord;
import fr.istic.aco.editor.version2.commands.StopRecord;
import fr.istic.aco.editor.version2.stub.EditorRecordingManagerImpl;
import fr.istic.aco.editor.version3.commands.Redo;
import fr.istic.aco.editor.version3.commands.Undo;
import fr.istic.aco.editor.version3.core.EditorUndoRedoManager;
import fr.istic.aco.editor.version3.stub.EditorUndoRedoManagerImpl;

// TODO: Auto-generated Javadoc
/**
 * The Class MiniEditorStub.
 */
public class MiniEditorStub implements MiniEditor
{
	
	/** The stop. */
	private int start,stop;
	
	/** The engine. */
	private MiniEditorEngine engine;
	
	/** The invoker. */
	private MiniEditorInvoker invoker;
	
	/** The manager. */
	private EditorRecordingManager manager;
	
	/** The U rmanager. */
	private EditorUndoRedoManager URmanager;
	
	/** The command. */
	private Command command;
	
	/**
	 * Instantiates a new mini editor stub.
	 */
	public MiniEditorStub()
	{
		engine = new MiniEditorEngineImpl();
		invoker = new MiniEditorInvokerImpl();
		manager = new EditorRecordingManagerImpl();
		URmanager = new EditorUndoRedoManagerImpl();
	}
	/* print the buffer for interface*/
	/* (non-Javadoc)
	 * @see fr.istic.aco.editor.core.MiniEditor#getBuffer()
	 */
	@Override
	public String getBuffer()
	{
		if(engine.getBuffer().getLine()==null)
		{
			return "Nothing in the Buffer";
		}
		else
		{
		return engine.getBuffer().getLine() ;
		}
	}
	/* Prints the selection for interface*/
	/* (non-Javadoc)
	 * @see fr.istic.aco.editor.core.MiniEditor#getSelection()
	 */
	@Override
	public String getSelection()
	{
		if( engine.getSelection().getStop()>engine.getBuffer().getLine().length())
		{
			//System.out.println("Index is out of bounds, choose a stop value which is smaller than the length of the text");
			return "Nothing in the Selection";
		}
		else{
			if(engine.getSelection().getStart()==0 && engine.getSelection().getStop() == 0)
			{
				return "Nothing in the Selection";
			}
			else
			{
				return engine.getBuffer().getLine().substring(engine.getSelection().getStart(), engine.getSelection().getStop());
			}
		}
	}
	/* Prints the clipboard for interface*/
	/* (non-Javadoc)
	 * @see fr.istic.aco.editor.core.MiniEditor#getClipboard()
	 */
	@Override
	public String getClipboard()
	{
		if(engine.getClipboard().getLine()==null)
		{
		return "Nothing in the Clipboard";
		}
		else
		{
			return engine.getClipboard().getLine();
		}
	}
	/* For Insert operation*/
	/* (non-Javadoc)
	 * @see fr.istic.aco.editor.core.MiniEditor#editorInsert(java.lang.String)
	 */
	@Override
	public void editorInsert(String substring)
	{
		System.out.println("HELLO: Performing Insert start") ;
		if(substring!=null)
		{
			command = new Insert(engine,substring);
			invoker.run(command);
		}
		else
		{
			System.out.println("<<<<ALERT : No String entered to insert>>>>");
		}

	}
	/* For Select operation*/
	/* (non-Javadoc)
	 * @see fr.istic.aco.editor.core.MiniEditor#editorSelect(int, int)
	 */
	@Override
	public void editorSelect(int start, int stop)
	{
		System.out.println("HELLO: Performing Select start") ;
		if(engine.getBuffer().getLine().length()>=stop && (start<=stop))
		{
			command = new Select(engine,start,stop);
			invoker.run(command);
		}
		else
		{
			System.out.println("<<<<ALERT : Please enter the correct range>>>> ");
		}
	}
	/* For Copy operation*/
	/* (non-Javadoc)
	 * @see fr.istic.aco.editor.core.MiniEditor#editorCopy()
	 */
	@Override
	public void editorCopy()
	{
		System.out.println("HELLO: Performing Paste start") ;
		if(engine.getSelection().getStart()==0 && engine.getSelection().getStop()==0)
		{
			System.out.println("<<<<ALERT : No Range selected to do copy operation>>>>");
		}
		else
		{
			command = new Copy(engine);
			invoker.run(command);
			
		}
	}
	/* For Cut operation*/
	/* (non-Javadoc)
	 * @see fr.istic.aco.editor.core.MiniEditor#editorCut()
	 */
	@Override
	public void editorCut() 
	{
		System.out.println("HELLO: Performing Cut start") ;
		
			command = new Cut(engine);
			invoker.run(command);
		
	}
	/* For Paste operation*/
	/* (non-Javadoc)
	 * @see fr.istic.aco.editor.core.MiniEditor#editorPaste()
	 */
	@Override
	public void editorPaste()
	{
		System.out.println("HELLO: Performing Paste start") ;
		if(engine.getClipboard().getLine()!=null)
		{
			command = new Paste(engine);
			invoker.run(command);
			System.out.println("DEBUG: performing Paste and the new string is "+ engine.getBuffer().getLine());
		}
		else
		{
				System.out.println("<<<<ALERT : Nothing to Paste from ClipBoard>>>>");
		}
		
	}
	/* For Start Recording operation*/
	/* (non-Javadoc)
	 * @see fr.istic.aco.editor.core.MiniEditor#editorStartRecording()
	 */
	@Override
	public void editorStartRecording()
	{	
		System.out.println("HELLO: Performing Record start") ;
		int index =1;
		Command startRec= new StartRecord(manager,index);
		invoker.run(startRec);
		
	}
	
	/* For End Recording operation*/
	/* (non-Javadoc)
	 * @see fr.istic.aco.editor.core.MiniEditor#editorEndRecording()
	 */
	@Override
	public void editorEndRecording()
	{
		System.out.println("HELLO: Performing Record end") ;
		int index = 0;
		Command stop = new StopRecord(manager, index);
		invoker.run(stop);
		
	}

	/* For Play Recording operation*/
	/* (non-Javadoc)
	 * @see fr.istic.aco.editor.core.MiniEditor#editorPlayRecording()
	 */
	@Override
	public void editorPlayRecording()
	{
		System.out.println("HELLO: Performing Play");
		int index = 1;
		Command play = new Play(manager, index);
		invoker.run(play);
		
	}

	/* For Undo operation*/
	/* (non-Javadoc)
	 * @see fr.istic.aco.editor.core.MiniEditor#editorUndo()
	 */
	@Override
	public void editorUndo()
	{
		System.out.println("HELLO: Performing Undo") ;
		Command undo = new Undo(URmanager);
		engine.getSelection().setStart(0);
		engine.getSelection().setStop(0);
		engine.getBuffer().setLine("");
		invoker.UndoRedo(undo);
	}

	/* For Redo operation*/
	/* (non-Javadoc)
	 * @see fr.istic.aco.editor.core.MiniEditor#editorRedo()
	 */
	@Override
	public void editorRedo()
	{
		System.out.println("HELLO: Performing Redo") ;
		Command redo = new Redo(URmanager);
		engine.getSelection().setStart(0);
		engine.getSelection().setStop(0);
		engine.getBuffer().setLine("");
		invoker.UndoRedo(redo);
	}
	
}
