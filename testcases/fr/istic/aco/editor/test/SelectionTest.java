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

import fr.istic.aco.editor.core.EditorSelection;
import fr.istic.aco.editor.stub.EditorSelectionImpl;

// TODO: Auto-generated Javadoc
/**
 * The Class SelectionTest.
 */
public class SelectionTest {

	/** The selection. */
	private EditorSelection selection;
	
	/**
	 * Sets the up.
	 *
	 * @throws Exception the exception
	 */
	@Before
	public void setUp() throws Exception 
	{
		selection = new EditorSelectionImpl();
	}

	/**
	 * Start test.
	 */
	@Test
	public void startTest() 
	{
		int start = 1;
		selection.setStart(start);
		assertEquals(start, selection.getStart());
	}
	
	/**
	 * Stop test.
	 */
	@Test
	public void stopTest() 
	{
		int stop = 8;
		selection.setStop(stop);
		assertEquals(stop, selection.getStop());
	}

}
