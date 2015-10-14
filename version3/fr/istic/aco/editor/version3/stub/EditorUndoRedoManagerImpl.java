/**
 * @author Ishan Tiwari and Ricardo Ernesto Martinez Ramirez
 *
 * @see MINI TEXT EDITOR
 * @see DSS - M1
 * @see EIT ICT Labs
 * 
 */
package fr.istic.aco.editor.version3.stub;

import java.util.ArrayList;
import java.util.List;

import fr.istic.aco.editor.commands.Command;
import fr.istic.aco.editor.version3.core.EditorUndoRedoManager;

// TODO: Auto-generated Javadoc
/**
 * The Class EditorUndoRedoManagerImpl.
 */
public class EditorUndoRedoManagerImpl implements EditorUndoRedoManager{

	/** The cmdlist. */
	private static List<Command> cmdlist = new ArrayList<Command>(); /*List to collect all Commands*/
	
	/** The redolist. */
	private static List<Command> redolist = new ArrayList<Command>(); /*List to collect Undo'ed Commands*/
	
	/* (non-Javadoc)
	 * @see fr.istic.aco.editor.version3.core.EditorUndoRedoManager#getCmdlist()
	 */
	public List<Command> getCmdlist() {
		return cmdlist;
	}

	/* (non-Javadoc)
	 * @see fr.istic.aco.editor.version3.core.EditorUndoRedoManager#setCmdlist(java.util.List)
	 */
	public void setCmdlist(List<Command> cmdlist) {
		EditorUndoRedoManagerImpl.cmdlist = cmdlist;
	}

		
	/* (non-Javadoc)
	 * @see fr.istic.aco.editor.version3.core.EditorUndoRedoManager#getRedolist()
	 */
	public List<Command> getRedolist() {
		return redolist;
	}

	/* (non-Javadoc)
	 * @see fr.istic.aco.editor.version3.core.EditorUndoRedoManager#setRedolist(java.util.List)
	 */
	public void setRedolist(List<Command> redolist) {
		EditorUndoRedoManagerImpl.redolist = redolist;
	}

	/* For Undo operation*/
	/* (non-Javadoc)
	 * @see fr.istic.aco.editor.version3.core.EditorUndoRedoManager#managerUndo()
	 */
	public void managerUndo()
	{		
		if(cmdlist.isEmpty()) /* Condition to check whether command list is empty or not */
		{
			System.out.println(">>>>>ALERT : NOTHING TO UNDO<<<<<");
			
		}
		else
		{
			redolist.add(cmdlist.get(cmdlist.size()-1)); /* Removing from the command list and adding it to Redo list */
			cmdlist.remove(cmdlist.size()-1);
			for (int i=0; i<cmdlist.size();i++)
			{
				Command command =(Command)cmdlist.get(i);
				command.execute();
			}
		}
	}

	/* For Redo operation*/
	/* (non-Javadoc)
	 * @see fr.istic.aco.editor.version3.core.EditorUndoRedoManager#managerRedo()
	 */
	public void managerRedo()
	{
		if(redolist.isEmpty())			/* Condition to check whether Redo list is empty or not */
		{
			System.out.println(">>>>>ALERT : NOTHING TO REDO<<<<<");
			for (int i=0; i<cmdlist.size();i++)
			{
				Command command =(Command)cmdlist.get(i);
				command.execute();
			}
		}
		else
		{
			cmdlist.add(redolist.get(redolist.size()-1));/* Removing from the Redo list and adding it to command list */
			redolist.remove(redolist.size()-1);
			for (int i=0;i<cmdlist.size();i++)
			{
				Command command =(Command)cmdlist.get(i);
				command.execute();
			}
		}
	}
}
