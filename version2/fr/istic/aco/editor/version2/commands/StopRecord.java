/**
 * @author Ishan Tiwari and Ricardo Ernesto Martinez Ramirez
 *
 * @see MINI TEXT EDITOR
 * @see DSS - M1
 * @see EIT ICT Labs
 * 
 */package fr.istic.aco.editor.version2.commands;

import fr.istic.aco.editor.commands.Command;
import fr.istic.aco.editor.version2.core.EditorRecordingManager;

// TODO: Auto-generated Javadoc
/**
 * The Class StopRecord.
 */
public class StopRecord implements Command{
	
	/** The manager. */
	private EditorRecordingManager manager;
	
	/** The index. */
	private int index;
	
	/*public constructor for StopRecord to initialize manager */
	
	/**
	 * Instantiates a new stop record.
	 *
	 * @param manager the manager
	 * @param index the index
	 */
	public StopRecord(EditorRecordingManager manager, int index)
	{
		this.manager = manager;
		this.index = index;
	}

	/* (non-Javadoc)
	 * @see fr.istic.aco.editor.commands.Command#execute()
	 */
	@Override
	public void execute() {
		manager.editorStopRecording(index);
		
	}

}
