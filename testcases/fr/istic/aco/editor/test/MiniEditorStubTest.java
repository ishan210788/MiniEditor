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

import fr.istic.aco.editor.core.MiniEditor;
import fr.istic.aco.editor.core.MiniEditorEngine;
import fr.istic.aco.editor.core.MiniEditorInvoker;
import fr.istic.aco.editor.stub.MiniEditorEngineImpl;
import fr.istic.aco.editor.stub.MiniEditorInvokerImpl;
import fr.istic.aco.editor.stub.MiniEditorStub;

// TODO: Auto-generated Javadoc
/**
 * The Class MiniEditorStubTest.
 */
public class MiniEditorStubTest {

	private MiniEditorEngine engine;
	private MiniEditor editor;
	private MiniEditorInvoker invoker;
	private String teststring = "Testing the stub";
	/**
	 * Sets the up.
	 *
	 * @throws Exception the exception
	 */
	@Before
	public void setUp() throws Exception 
	{
		engine = new MiniEditorEngineImpl();
		editor = new MiniEditorStub();
		invoker = new MiniEditorInvokerImpl();
	}

	/**
	 * Test.
	 */
	@Test
	public void stubInsert()
	{
		
		editor.editorInsert(teststring);
		
		assertEquals(teststring, editor.getBuffer());
	}

	@Test
	public void stubSelect()
	{
		int start = 2;
		int stop = 4;
		editor.editorSelect(start, stop);
		
		assertEquals(teststring.substring(start, stop), editor.getSelection());
	}
}
