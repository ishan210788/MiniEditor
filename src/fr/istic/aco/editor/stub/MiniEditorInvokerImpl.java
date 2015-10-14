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
import fr.istic.aco.editor.commands.Select;
import fr.istic.aco.editor.core.MiniEditorInvoker;
import fr.istic.aco.editor.version2.commands.Play;
import fr.istic.aco.editor.version2.commands.StartRecord;
import fr.istic.aco.editor.version2.core.EditorRecordingManager;
import fr.istic.aco.editor.version2.stub.EditorRecordingManagerImpl;
import fr.istic.aco.editor.version3.core.EditorUndoRedoManager;
import fr.istic.aco.editor.version3.stub.EditorUndoRedoManagerImpl;

// TODO: Auto-generated Javadoc
/**
 * The Class MiniEditorInvokerImpl.
 */
public class MiniEditorInvokerImpl implements MiniEditorInvoker
{
	
	/** The record or not. */
	private static boolean recordOrNot;
	
	/** The manager. */
	private EditorRecordingManager manager;
	
	/** The U rmanager. */
	private EditorUndoRedoManager URmanager;
	
	/**
	 * Instantiates a new mini editor invoker impl.
	 */
	public MiniEditorInvokerImpl()
	{
		manager = new EditorRecordingManagerImpl();
		URmanager = new EditorUndoRedoManagerImpl();
	}

	/* (non-Javadoc)
	 * @see fr.istic.aco.editor.core.MiniEditorInvoker#run(fr.istic.aco.editor.commands.Command)
	 */
	public void run(Command cmd)
	{
		if(cmd.getClass().getName().equalsIgnoreCase("fr.istic.aco.editor.version2.commands.StartRecord"))
		{
			recordOrNot = true;
		}
		if(cmd.getClass().getName().equalsIgnoreCase("fr.istic.aco.editor.version2.commands.StopRecord"))
		{
			recordOrNot = false;
		}
		if(recordOrNot)
		{
			if(!(cmd.getClass().getName().equalsIgnoreCase("fr.istic.aco.editor.version2.commands.StartRecord")))
			{	
				if(!(cmd.getClass().getName().equalsIgnoreCase("fr.istic.aco.editor.version2.commands.StartRecord")) || !(cmd.getClass().getName().equalsIgnoreCase("fr.istic.aco.editor.version2.commands.StopRecord")))
				{
					manager.getTrait().add(cmd);
					System.out.println("Adding "+cmd.getClass().getName());
					
				}
			}
		}
		
		cmd.execute();
		/* By passing the Start record,stop record, play, copy 
		 * and select operation from it to the command list */
		if(!(cmd.getClass().getName().equalsIgnoreCase("fr.istic.aco.editor.version2.commands.StartRecord")))
		{
			if( !(cmd.getClass().getName().equalsIgnoreCase("fr.istic.aco.editor.version2.commands.StopRecord")))
			{
				if( !(cmd.getClass().getName().equalsIgnoreCase("fr.istic.aco.editor.commands.Play")))
				{
					if( !(cmd.getClass().getName().equalsIgnoreCase("fr.istic.aco.editor.commands.Select")))
					{
						if( !(cmd.getClass().getName().equalsIgnoreCase("fr.istic.aco.editor.commands.Copy")))
						{
							URmanager.getCmdlist().add(cmd);
							URmanager.getRedolist().clear();
						}
					}
					
				}
			}
		}
		
	}
	/* Inovker function for Undo-Redo operation */
	/* (non-Javadoc)
	 * @see fr.istic.aco.editor.core.MiniEditorInvoker#UndoRedo(fr.istic.aco.editor.commands.Command)
	 */
	public void UndoRedo(Command command)
	{
		command.execute();
	}
}
