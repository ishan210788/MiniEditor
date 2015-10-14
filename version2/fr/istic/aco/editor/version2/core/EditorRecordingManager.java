/**
 * @author Ishan Tiwari and Ricardo Ernesto Martinez Ramirez
 *
 * @see MINI TEXT EDITOR
 * @see DSS - M1
 * @see EIT ICT Labs
 * 
 */
package fr.istic.aco.editor.version2.core;
import java.util.List;

import fr.istic.aco.editor.commands.Command;

// TODO: Auto-generated Javadoc
/**
 * The Interface EditorRecordingManager.
 */
public interface EditorRecordingManager {

	/**
	 * Sets the trait.
	 *
	 * @param trait the new trait
	 */
	public void setTrait(List<Command> trait);
	
	/**
	 * Gets the trait.
	 *
	 * @return the trait
	 */
	public List<Command> getTrait();
	
	/**
	 * Editor start recording.
	 *
	 * @param command the command
	 * @param index the index
	 */
	public void editorStartRecording(Command command, int index);
	
	/**
	 * Editor play.
	 *
	 * @param index the index
	 */
	public void editorPlay(int index);
	
	/**
	 * Editor stop recording.
	 *
	 * @param index the index
	 */
	public void editorStopRecording(int index);
}
