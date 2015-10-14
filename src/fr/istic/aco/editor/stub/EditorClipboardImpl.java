/**
 * @author Ishan Tiwari and Ricardo Ernesto Martinez Ramirez
 *
 * @see MINI TEXT EDITOR
 * @see DSS - M1
 * @see EIT ICT Labs
 * 
 */
package fr.istic.aco.editor.stub;

import fr.istic.aco.editor.core.EditorClipboard;

// TODO: Auto-generated Javadoc
/**
 * The Class EditorClipboardImpl.
 */
public class EditorClipboardImpl implements EditorClipboard{

	/* Getting and setting the clipboard string*/
	/* (non-Javadoc)
	 * @see fr.istic.aco.editor.core.EditorClipboard#getLine()
	 */
	public String getLine() {
		return line;
	}

	/* (non-Javadoc)
	 * @see fr.istic.aco.editor.core.EditorClipboard#setLine(java.lang.String)
	 */
	public void setLine(String line) {
		this.line = line;
	}
	
	/** The line. */
	private String line;




}
