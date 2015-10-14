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

import fr.istic.aco.editor.core.MiniEditorEngine;
import fr.istic.aco.editor.stub.MiniEditorEngineImpl;

// TODO: Auto-generated Javadoc
/**
 * The Class EngineTest.
 */
public class EngineTest {

	/** The engine. */
	private MiniEditorEngine engine;
	//private MiniEditorEngine engineReplica;
	/** The test string. */
	String testString;
	
	/**
	 * Sets the up.
	 *
	 * @throws Exception the exception
	 */
	@Before
	public void setUp() throws Exception 
	{
		engine = new MiniEditorEngineImpl();
	//	engineReplica = new MiniEditorEngineImpl();
		testString = "Testing the Engine";
	}

	/**
	 * Inits the test.
	 */
	@Test
	public void initTest() 
	{
		assertNotNull("Engine is not initialized", engine);
		assertNotNull("Buffer not initialized",engine.getBuffer());
		assertNotNull("Clipboard not initialized", engine.getClipboard());
		assertNotNull("Selection not initialized", engine.getSelection());
	}
	
	/**
	 * Test engine insert.
	 */
	@Test
	public void testEngineInsert()
	{
		engine.editorInsert(testString);
		assertEquals(testString, engine.getBuffer().read(0, testString.length()));
	}
	
	/**
	 * Test engine select.
	 */
	@Test
	public void testEngineSelect()
	{
		int sampleStart = 1;
		int sampleStop = 5;
		engine.editorInsert(testString);
		engine.editorSelect(sampleStart, sampleStop);
		assertEquals(sampleStop-sampleStart, engine.getSelection().getStop()-engine.getSelection().getStart());
	}
	
	/**
	 * Test engine copy.
	 */
	@Test
	public void testEngineCopy()
	{
		
		engine.getBuffer().setLine(testString);
		engine.getSelection().setStart(2);
		engine.getSelection().setStop(5);
		engine.editorCopy();
		assertEquals(testString.substring(2, 5), engine.getClipboard().getLine());
	}

	@Test
	public void testEnginePaste()
	{
		engine.getBuffer().setLine(testString);
		engine.getSelection().setStart(2);
		engine.getSelection().setStop(5);
		engine.editorCopy();
		engine.editorPaste();
		assertEquals(testString.concat(testString.substring(2, 5)), engine.getBuffer().getLine());
	}
	
	@Test
	public void testEngineCut()
	{
		engine.getBuffer().setLine(testString);
		engine.getSelection().setStart(2);
		engine.getSelection().setStop(5);
		String part = testString.substring(2, 5);
		engine.editorCut();
		assertEquals(testString.substring(2,5), engine.getClipboard().getLine());
		assertEquals(testString.substring(0, 2).concat(testString.substring(5, testString.length())),
				engine.getBuffer().getLine());
	}
	@Test
	public void testEngineCutPaste()
	{
		engine.getBuffer().setLine(testString);
		engine.getSelection().setStart(2);
		engine.getSelection().setStop(5);
		String part = testString.substring(2, 5);
		engine.editorCut();
		engine.editorPaste();
		assertEquals(testString.substring(0, 2).concat(testString.substring(5, testString.length())).concat(part),
				engine.getBuffer().getLine());
	}
	@Test
	public void testEngineCopyPaste()
	{
		engine.getBuffer().setLine(testString);
		engine.getSelection().setStart(2);
		engine.getSelection().setStop(5);
		engine.editorCopy();
		engine.editorPaste();
		assertEquals(testString.concat(testString.substring(2, 5)), engine.getBuffer().getLine());

	}
}
