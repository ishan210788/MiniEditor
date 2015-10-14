/**
 * @author Ishan Tiwari and Ricardo Ernesto Martinez Ramirez
 *
 * @see MINI TEXT EDITOR
 * @see DSS - M1
 * @see EIT ICT Labs
 * 
 */
package fr.istic.aco.editor.core;

// TODO: Auto-generated Javadoc
/**
 * The Interface EditorSelection.
 */
public interface EditorSelection 
	{
		
		/**
		 * Sets the start.
		 *
		 * @param start the new start
		 */
		void setStart(int start);
		
		/**
		 * Sets the stop.
		 *
		 * @param stop the new stop
		 */
		void setStop(int stop);
		
		/**
		 * Gets the stop.
		 *
		 * @return the stop
		 */
		int getStop();
		
		/**
		 * Gets the start.
		 *
		 * @return the start
		 */
		int getStart();
	
	}
