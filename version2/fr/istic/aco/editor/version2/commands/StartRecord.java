/**
 * @author Ishan Tiwari and Ricardo Ernesto Martinez Ramirez
 *
 * @see MINI TEXT EDITOR
 * @see DSS - M1
 * @see EIT ICT Labs
 * 
 */
package fr.istic.aco.editor.version2.commands;

import fr.istic.aco.editor.commands.Command;
import fr.istic.aco.editor.version2.core.EditorRecordingManager;


// TODO: Auto-generated Javadoc
/**
 * The Class StartRecord.
 */
public class StartRecord implements Command{

	
	/** The manager. */
	private EditorRecordingManager manager;
	
	/** The command. */
	private Command command;
	
	/** The index. */
	private int index;
	
	/**
	 * Instantiates a new start record.
	 *
	 * @param manager the manager
	 * @param index the index
	 */
	public StartRecord(EditorRecordingManager manager, int index)/*public constructor for StartRecord to initialize manager */
	{
		this.manager = manager;
	}

	/* (non-Javadoc)
	 * @see fr.istic.aco.editor.commands.Command#execute()
	 */
	@Override
	public void execute() {
		manager.editorStartRecording(command, index);
	}

}
