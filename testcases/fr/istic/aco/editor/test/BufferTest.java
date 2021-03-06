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

import fr.istic.aco.editor.core.EditorBuffer;
import fr.istic.aco.editor.stub.EditorBufferImpl;

// TODO: Auto-generated Javadoc
/**
 * The Class BufferTest.
 */
public class BufferTest {
	
	/** The buffer. */
	private EditorBuffer buffer;
	
	/**
	 * Sets the up.
	 *
	 * @throws Exception the exception
	 */
	@Before
	public void setUp() throws Exception {
		buffer = new EditorBufferImpl();
	}

	/**
	 * Test read.
	 */
	@Test
	public void testRead()
	{
		String hello = "Hello Buffer";
		buffer.setLine(hello);
		assertEquals(hello, buffer.read(0, buffer.getLine().length()));
	}
	
	/**
	 * Test write.
	 */
	@Test
	public void testWrite() {
		String hello = "Hello Buffer";
		buffer.setLine(hello);
		buffer.write(0,hello.length(),hello);
		assertEquals(hello, buffer.read(0, hello.length()));
	}

}
