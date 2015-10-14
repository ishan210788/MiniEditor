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
 * The Interface EditorBuffer.
 */
public interface EditorBuffer {

	/**
	 * Read.
	 *
	 * @param start the start
	 * @param stop the stop
	 * @return the string
	 */
	public String read(int start, int stop);
	
	/**
	 * Write.
	 *
	 * @param start the start
	 * @param stop the stop
	 * @param line the line
	 */
	public void write(int start, int stop, String line);
	
	/**
	 * Gets the line.
	 *
	 * @return the line
	 */
	public String getLine();
	
	/**
	 * Sets the line.
	 *
	 * @param line the new line
	 */
	public void setLine(String line);
}
