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


public class UndoTest {
	
	private Undo undo;
	private EditorUndoRedoManager undoredoMngr;

	@Before
	public void SetUp() throws Exception{
		undoredoMngr = mock(EditorUndoRedoManager.class);
		undo =  new Undo(undoredoMngr);
	}
	
	@Test
	public void test() {
		undo.execute();
		verify(undoredoMngr).managerUndo();
	}

}