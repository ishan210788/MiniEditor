/**
 * @author Ishan Tiwari and Ricardo Ernesto Martinez Ramirez
 *
 * @see MINI TEXT EDITOR
 * @see DSS - M1
 * @see EIT ICT Labs
 * 
 */
package fr.istic.aco.editor.version3.core;

import java.util.List;

import fr.istic.aco.editor.commands.Command;

// TODO: Auto-generated Javadoc
/**
 * The Interface EditorUndoRedoManager.
 */
public interface EditorUndoRedoManager {

	/**
	 * Gets the cmdlist.
	 *
	 * @return the cmdlist
	 */
	public List<Command> getCmdlist();
	
	/**
	 * Sets the cmdlist.
	 *
	 * @param cmdlist the new cmdlist
	 */
	public void setCmdlist(List<Command> cmdlist);
	
	/**
	 * Gets the redolist.
	 *
	 * @return the redolist
	 */
	public List<Command> getRedolist();
	
	/**
	 * Sets the redolist.
	 *
	 * @param redolist the new redolist
	 */
	public void setRedolist(List<Command> redolist);
	
	/**
	 * Manager undo.
	 */
	public void managerUndo();
	
	/**
	 * Manager redo.
	 */
	public void managerRedo();
}
