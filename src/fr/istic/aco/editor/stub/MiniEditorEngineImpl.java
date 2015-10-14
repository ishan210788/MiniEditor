/**
 * @author Ishan Tiwari and Ricardo Ernesto Martinez Ramirez
 *
 * @see MINI TEXT EDITOR
 * @see DSS - M1
 * @see EIT ICT Labs
 * 
 */
package fr.istic.aco.editor.stub;
import java.util.List;

import fr.istic.aco.editor.commands.Command;
import fr.istic.aco.editor.core.EditorBuffer;
import fr.istic.aco.editor.core.EditorClipboard;
import fr.istic.aco.editor.core.EditorSelection;
import fr.istic.aco.editor.core.MiniEditorEngine;

// TODO: Auto-generated Javadoc
/**
 * The Class MiniEditorEngineImpl.
 */
public class MiniEditorEngineImpl implements MiniEditorEngine{

	/** The buffer. */
	private EditorBuffer buffer;
	
	/** The selection. */
	private EditorSelection selection;
	
	/** The clipboard. */
	private EditorClipboard clipboard;
	
	/** The trait. */
	private List<Command> trait;
	
	/* Getters and Setters for selection, clipBoard, selection and trait list*/
	/* (non-Javadoc)
	 * @see fr.istic.aco.editor.core.MiniEditorEngine#getTrait()
	 */
	public List<Command> getTrait() {
		return trait;
	}

	/* (non-Javadoc)
	 * @see fr.istic.aco.editor.core.MiniEditorEngine#setTrait(java.util.List)
	 */
	public void setTrait(List<Command> trait) {
		this.trait = trait;
	}

	/* (non-Javadoc)
	 * @see fr.istic.aco.editor.core.MiniEditorEngine#getBuffer()
	 */
	public EditorBuffer getBuffer() {
		return buffer;
	}

	/**
	 * Sets the buffer.
	 *
	 * @param buffer the new buffer
	 */
	public void setBuffer(EditorBuffer buffer) {
		this.buffer = buffer;
	}

	/* (non-Javadoc)
	 * @see fr.istic.aco.editor.core.MiniEditorEngine#getSelection()
	 */
	public EditorSelection getSelection() {
		return selection;
	}

	/**
	 * Sets the selection.
	 *
	 * @param selection the new selection
	 */
	public void setSelection(EditorSelection selection) {
		this.selection = selection;
	}

	/* (non-Javadoc)
	 * @see fr.istic.aco.editor.core.MiniEditorEngine#getClipboard()
	 */
	public EditorClipboard getClipboard() {
		return clipboard;
	}

	/**
	 * Sets the clipboard.
	 *
	 * @param clipboard the new clipboard
	 */
	public void setClipboard(EditorClipboard clipboard) {
		this.clipboard = clipboard;
	}

	/**
	 * Instantiates a new mini editor engine impl.
	 */
	public MiniEditorEngineImpl()
	{
		this.buffer = new EditorBufferImpl();
		this.clipboard = new EditorClipboardImpl();
		this.selection = new EditorSelectionImpl();
	}
	
	/* For Insert operation*/
	/* (non-Javadoc)
	 * @see fr.istic.aco.editor.core.MiniEditorEngine#editorInsert(java.lang.String)
	 */
	@Override
	public void editorInsert(String substring) 
	{
		
		if((selection.getStop()-selection.getStart())==0)
		{
			
			if(buffer.getLine()!=null)
			{
				buffer.setLine(buffer.getLine().concat(substring));
			}
			else
			{
				
				buffer.setLine(substring);
				
			}
		}
		else
		{
			buffer.write(selection.getStart(), selection.getStop(), substring);
		}
		
	}
	/* For Select operation*/
	/* (non-Javadoc)
	 * @see fr.istic.aco.editor.core.MiniEditorEngine#editorSelect(int, int)
	 */
	@Override
	public void editorSelect(int start, int stop) 
	{
		if((start== 0 && stop ==0) || (stop<start))
		{
			System.out.println("<<<<ALERT : Invalid or no start and stop index>>>>");
		}
		selection.setStart(start);
		selection.setStop(stop);
	}
	/* For Copy operation*/
	/* (non-Javadoc)
	 * @see fr.istic.aco.editor.core.MiniEditorEngine#editorCopy()
	 */
	@Override
	public void editorCopy() 
	{
		if(selection.getStart()==0 && selection.getStop()==0)
		{
			System.out.println("<<<<ALERT : No Range selected to do copy operation>>>>");
		}
		else
		{
			clipboard.setLine(buffer.read(selection.getStart(),selection.getStop()));
			System.out.println("DEBUG: Copy Operation done : Now we have "+clipboard.getLine());
		}
	}
	/* For Cut operation*/
	/* (non-Javadoc)
	 * @see fr.istic.aco.editor.core.MiniEditorEngine#editorCut()
	 */
	@Override
	public void editorCut() 
	{
		/*if(selection.getStart()==0 && selection.getStop()==0)
		{
			System.out.println("<<<<ALERT : No Range selected to do cut operation>>>>");
		}
		else
		{*/
			clipboard.setLine(buffer.read(selection.getStart(), selection.getStop()));
			buffer.write(selection.getStart(), selection.getStop(), "");
			System.out.println("DEBUG: Cut Operation done : Now we have "+ clipboard.getLine());
		//}
		
	}
	/* For Paste operation*/
	/* (non-Javadoc)
	 * @see fr.istic.aco.editor.core.MiniEditorEngine#editorPaste()
	 */
	@Override
	public void editorPaste() {
		if(clipboard.getLine()!=null)
		buffer.write(selection.getStart(), selection.getStop(), clipboard.getLine());
		else
			System.out.println("<<<<ALERT : Nothing to Paste from ClipBoard>>>>");
		}
}
