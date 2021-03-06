/**
 * @author Ishan Tiwari and Ricardo Ernesto Martinez Ramirez
 *
 * @see MINI TEXT EDITOR
 * @see DSS - M1
 * @see EIT ICT Labs
 * 
 */
package fr.istic.aco.editor.stub;

import fr.istic.aco.editor.core.EditorBuffer;

// TODO: Auto-generated Javadoc
/**
 * The Class EditorBufferImpl.
 */
public class EditorBufferImpl implements EditorBuffer{
	
	/** The line. */
	private String line;
	
	/* (non-Javadoc)
	 * @see fr.istic.aco.editor.core.EditorBuffer#read(int, int)
	 */
	public String read(int start, int stop) /* Reading from the buffer */
	{
		return this.line.substring(start, stop);
		
	}

	/* (non-Javadoc)
	 * @see fr.istic.aco.editor.core.EditorBuffer#write(int, int, java.lang.String)
	 */
	public void write(int start, int stop,String substr)   /* Writing in the buffer */
	{
		if(substr.equals(""))
		{
			this.line = getLine().substring(0, start).concat(substr).concat(getLine().substring(stop, line.length()));
		}
		else
		{
			if(line==null)
			this.line = line.concat(substr);
			else{
				//System.out.println("Redo error"+line.length());
				this.line = getLine().substring(0, start).concat(substr).concat(getLine().substring(stop, this.line.length()));
			}}
		
	}

	/* (non-Javadoc)
	 * @see fr.istic.aco.editor.core.EditorBuffer#getLine()
	 */
	public String getLine() {
		return line;
	}

	/* (non-Javadoc)
	 * @see fr.istic.aco.editor.core.EditorBuffer#setLine(java.lang.String)
	 */
	public void setLine(String line) {
		this.line = line;
	}
	
	
}
