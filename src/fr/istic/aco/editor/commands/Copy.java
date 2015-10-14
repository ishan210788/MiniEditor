/**
 * @author Ishan Tiwari and Ricardo Ernesto Martinez Ramirez
 *
 * @see MINI TEXT EDITOR
 * @see DSS - M1
 * @see EIT ICT Labs
 * 
 */

package fr.istic.aco.editor.commands;

import fr.istic.aco.editor.core.MiniEditorEngine;

// TODO: Auto-generated Javadoc
/**
 * The Class Copy.
 */
public class Copy implements Command{

	/** The engine. */
	MiniEditorEngine engine;
	
	/**
	 * Instantiates a new copy.
	 *
	 * @param engine the engine
	 */
	public Copy(MiniEditorEngine engine)
	{
		this.engine= engine;
	}
	
	/* (non-Javadoc)
	 * @see fr.istic.aco.editor.commands.Command#execute()
	 */
	@Override
	public void execute() {
		engine.editorCopy();
	}

	
}
