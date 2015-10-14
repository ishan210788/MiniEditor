/**
 * @author Ishan Tiwari and Ricardo Ernesto Martinez Ramirez
 *
 * @see MINI TEXT EDITOR
 * @see DSS - M1
 * @see EIT ICT Labs
 * 
 */

/* 
 * Author : Ishan & Ricardo
 * Description : Cut Command
 * 
 * 
 * */


package fr.istic.aco.editor.commands;

import fr.istic.aco.editor.core.MiniEditorEngine;

// TODO: Auto-generated Javadoc
/**
 * The Class Cut.
 */
public class Cut implements Command{

	/** The engine. */
	private MiniEditorEngine engine;
	
	/**
	 * Instantiates a new cut.
	 *
	 * @param engine the engine
	 */
	public Cut(MiniEditorEngine engine)
	{
		this.engine = engine;
	}
	
	/* (non-Javadoc)
	 * @see fr.istic.aco.editor.commands.Command#execute()
	 */
	@Override
	public void execute() {
		engine.editorCut();
	}
	

}
