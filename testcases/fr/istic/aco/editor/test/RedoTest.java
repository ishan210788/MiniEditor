/**
 * @author Ishan Tiwari and Ricardo Ernesto Martinez Ramirez
 *
 * @see MINI TEXT EDITOR
 * @see DSS - M1
 * @see EIT ICT Labs
 * 
 */
package fr.istic.aco.editor.test;

import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import fr.istic.aco.editor.version3.core.*;
import fr.istic.aco.editor.version3.commands.*;


public class RedoTest {
	
	private Redo redo;
	private EditorUndoRedoManager undoredoMngr;

	@Before
	public void SetUp() throws Exception{
		undoredoMngr = mock(EditorUndoRedoManager.class);
		redo =  new Redo(undoredoMngr);
	}
	
	@Test
	public void test() {
		redo.execute();
		verify(undoredoMngr).managerRedo();
	}

}