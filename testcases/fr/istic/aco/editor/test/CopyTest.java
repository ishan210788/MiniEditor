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

import fr.istic.aco.editor.core.*;
import fr.istic.aco.editor.commands.*;

public class CopyTest {
	
	private Copy copy;
	private MiniEditorEngine minieditor;
	
	@Before
	public void SetUp() throws Exception{
		minieditor = mock(MiniEditorEngine.class);
		copy =  new Copy(minieditor);
	}

	@Test
	public void test() {
		copy.execute();
		verify(minieditor).editorCopy();
	}

}
