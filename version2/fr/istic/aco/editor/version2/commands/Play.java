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
 * The Class Play.
 */
public class Play implements Command{
	
/** The manager. */
private EditorRecordingManager manager;

/** The index. */
private int index;
	
	/**
	 * Instantiates a new play.
	 *
	 * @param manager the manager
	 * @param index the index
	 */
	public Play(EditorRecordingManager manager, int index) /*public constructor for Play to initialize manager */
	{
		this.manager = manager;
		this.index = index;
	}

	/* (non-Javadoc)
	 * @see fr.istic.aco.editor.commands.Command#execute()
	 */
	@Override
	public void execute() {
		System.out.println("inside replay");
		manager.editorPlay(index);
	}

}
