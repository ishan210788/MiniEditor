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
 * The Class Insert.
 */
public class Insert implements Command{
	
	/** The engine. */
	private MiniEditorEngine engine;
	
	/** The input. */
	private String input;
	
	/**
	 * Instantiates a new insert.
	 *
	 * @param engine the engine
	 * @param str the str
	 */
	public Insert(MiniEditorEngine engine, String str)
	{
		this.input = str;
		this.engine= engine;
		
	}
	
	/**
	 * Gets the input.
	 *
	 * @return the input
	 */
	public String getInput() {
		return input;
	}
	
	/**
	 * Sets the input.
	 *
	 * @param input the new input
	 */
	public void setInput(String input) {
		this.input = input;
	}
	
	/* (non-Javadoc)
	 * @see fr.istic.aco.editor.commands.Command#execute()
	 */
	@Override
	public void execute() {
		engine.editorInsert(input);
		
	}

}
