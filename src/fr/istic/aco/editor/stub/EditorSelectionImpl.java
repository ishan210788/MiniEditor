/**
 * @author Ishan Tiwari and Ricardo Ernesto Martinez Ramirez
 *
 * @see MINI TEXT EDITOR
 * @see DSS - M1
 * @see EIT ICT Labs
 * 
 */
package fr.istic.aco.editor.stub;

import fr.istic.aco.editor.core.EditorSelection;

// TODO: Auto-generated Javadoc
/**
 * The Class EditorSelectionImpl.
 */
public class EditorSelectionImpl implements EditorSelection{

	/*Getter and setter for start and stop */
	/** The start. */
	private int start;
	
	/* (non-Javadoc)
	 * @see fr.istic.aco.editor.core.EditorSelection#getStart()
	 */
	public int getStart() {
		return start;
	}
	
	/* (non-Javadoc)
	 * @see fr.istic.aco.editor.core.EditorSelection#setStart(int)
	 */
	public void setStart(int start) {
		this.start = start;
	}
	
	/* (non-Javadoc)
	 * @see fr.istic.aco.editor.core.EditorSelection#getStop()
	 */
	public int getStop() {
		return stop;
	}
	
	/* (non-Javadoc)
	 * @see fr.istic.aco.editor.core.EditorSelection#setStop(int)
	 */
	public void setStop(int stop) {
		this.stop = stop;
	}
	
	/** The stop. */
	private int stop;
		
}
