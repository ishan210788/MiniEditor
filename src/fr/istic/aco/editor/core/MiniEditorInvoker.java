/**
 * @author Ishan Tiwari and Ricardo Ernesto Martinez Ramirez
 *
 * @see MINI TEXT EDITOR
 * @see DSS - M1
 * @see EIT ICT Labs
 * 
 */
package fr.istic.aco.editor.core;

import fr.istic.aco.editor.commands.Command;

// TODO: Auto-generated Javadoc
/**
 * The Interface MiniEditorInvoker.
 */
public interface MiniEditorInvoker {

	/**
	 * Run.
	 *
	 * @param cmd the cmd
	 */
	void run(Command cmd);
	
	/**
	 * Undo redo.
	 *
	 * @param command the command
	 */
	public void UndoRedo(Command command);
}
