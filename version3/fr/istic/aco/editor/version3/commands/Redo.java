/**
 * @author Ishan Tiwari and Ricardo Ernesto Martinez Ramirez
 *
 * @see MINI TEXT EDITOR
 * @see DSS - M1
 * @see EIT ICT Labs
 * 
 */
package fr.istic.aco.editor.version3.commands;

import fr.istic.aco.editor.commands.Command;
import fr.istic.aco.editor.version3.core.EditorUndoRedoManager;

// TODO: Auto-generated Javadoc
/**
 * The Class Redo.
 */
public class Redo implements Command {
	
	/** The U rmanager. */
	private EditorUndoRedoManager URmanager;
	
	/**
	 * Instantiates a new redo.
	 *
	 * @param URmanager the u rmanager
	 */
	public Redo(EditorUndoRedoManager URmanager) /* public constructor for Redo to initialize UR manager */
	{
		this.URmanager = URmanager;
		
	}
	
	/* (non-Javadoc)
	 * @see fr.istic.aco.editor.commands.Command#execute()
	 */
	@Override
	public void execute() {
		URmanager.managerRedo();
		
	}

}
