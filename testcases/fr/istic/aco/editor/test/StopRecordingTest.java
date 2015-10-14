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

import fr.istic.aco.editor.version2.core.*;
import fr.istic.aco.editor.version2.commands.*;

public class StopRecordingTest {
	
	private StopRecord stop;
	private EditorRecordingManager recordingMngr;
	private final int indexStop = 3;

	@Before
	public void SetUp() throws Exception{
		recordingMngr = mock(EditorRecordingManager.class);
		stop =  new StopRecord(recordingMngr, indexStop);
	}
	
	@Test
	public void test() {
		stop.execute();
		verify(recordingMngr).editorStopRecording(indexStop);
	}

}
