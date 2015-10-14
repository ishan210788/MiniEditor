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
 * The Class Select.
 */
public class Select implements Command{

	/** The stop. */
	private int start,stop;
	
	/** The engine. */
	private MiniEditorEngine engine;
	
	/**
	 * Instantiates a new select.
	 *
	 * @param engine the engine
	 * @param start the start
	 * @param stop the stop
	 */
	public Select(MiniEditorEngine engine, int start, int stop)
	{
		this.engine = engine;
		this.start = start;
		this.stop = stop;
	}
	
	/**
	 * Gets the start.
	 *
	 * @return the start
	 */
	public int getStart() {
		return start;
	}

	/**
	 * Sets the start.
	 *
	 * @param start the new start
	 */
	public void setStart(int start) {
		this.start = start;
	}

	/**
	 * Gets the stop.
	 *
	 * @return the stop
	 */
	public int getStop() {
		return stop;
	}

	/**
	 * Sets the stop.
	 *
	 * @param stop the new stop
	 */
	public void setStop(int stop) {
		this.stop = stop;
	}
	
	/* (non-Javadoc)
	 * @see fr.istic.aco.editor.commands.Command#execute()
	 */
	public void execute()
	{
		engine.editorSelect(start, stop);
	}
	
	
}
