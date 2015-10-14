/**
 * @author Ishan Tiwari and Ricardo Ernesto Martinez Ramirez
 *
 * @see MINI TEXT EDITOR
 * @see DSS - M1
 * @see EIT ICT Labs
 * 
 */
package fr.istic.aco.editor.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import fr.istic.aco.editor.core.EditorClipboard;
import fr.istic.aco.editor.stub.EditorClipboardImpl;

// TODO: Auto-generated Javadoc
/**
 * The Class ClipboardTest.
 */
public class ClipboardTest {

	/** The clipboard. */
	private EditorClipboard clipboard;
	
	/**
	 * Sets the up.
	 *
	 * @throws Exception the exception
	 */
	@Before
	public void setUp() throws Exception {
		clipboard = new EditorClipboardImpl();
	}

	/**
	 * Read test.
	 */
	@Test
	public void readTest() 
	{
		String hello = "Hello Clipboard";
		clipboard.setLine(hello);
		assertEquals(hello, clipboard.getLine());
	}
	
	/**
	 * Write test.
	 */
	@Test
	public void writeTest()
	{
		String hello = "Hello Clipboard";
		clipboard.setLine(hello);
		assertEquals(hello, clipboard.getLine());
		
	}

}
