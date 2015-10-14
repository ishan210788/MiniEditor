/**
 * @author Ishan Tiwari and Ricardo Ernesto Martinez Ramirez
 *
 * @see MINI TEXT EDITOR
 * @see DSS - M1
 * @see EIT ICT Labs
 * 
 */
package fr.istic.aco.editor.stub;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import fr.istic.aco.editor.core.MiniEditor;


// TODO: Auto-generated Javadoc
//Invoker
/**
 * The Class MiniEditorTextInterface.
 */
public class MiniEditorTextInterface
{
	
	/** The keyboard. */
	static BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args)
	{
		MiniEditor miniEditor = new MiniEditorStub() ;
		String inputLine;
		char commandLetter;
		
		System.out.println("Welcome to MiniEditor 9.99 (c) 2014 Smith & Jones") ;
		System.out.println("-----------------------------------------------------------") ;
				
		System.out.println("Enter command (I/S/C/X/V/D/R/E/P/Z/Y/Q) > ") ;
		try
		{
			inputLine = keyboard.readLine();
		} catch (IOException e)
		{
			System.out.println("Unable to read standard input");
			inputLine = "W";
		} 
		commandLetter = Character.toUpperCase(inputLine.charAt(0)) ;
		while (commandLetter != 'Q') /* Quit */
		{
			switch (commandLetter)
			{
				case 'I': /* Insert */
					
				try {
					if((inputLine.substring(2)!=null))
					miniEditor.editorInsert(inputLine.substring(2));
				
				} catch (Exception e1) {
					System.out.println("<<<ALERT : please enter some string to insert>>>");
				}
					break;
				case 'S': /* Select */
					String numberString="";
					try
					{
						String[] arguments = inputLine.substring(2).split("\\s+");
						numberString = arguments[0];
						int start  = Integer.parseInt(numberString);
						numberString = arguments[1];
						int stop  = Integer.parseInt(numberString);
						miniEditor.editorSelect(start, stop);
						System.out.println("Inside interface "+ start + " -- "+ stop);
					}
					catch (Exception e)
					{
						System.out.println("Invalid number: " + numberString);
					}
					break;
				case 'C': /* Copy */
					miniEditor.editorCopy();
					break;
				case 'X': /* cut */
					miniEditor.editorCut();
					break;
				case 'V': /* paste */
					miniEditor.editorPaste();
					break;
				case 'D': /* Delete, i.e. insert empty string */
					miniEditor.editorInsert("");
					break;
				case 'R': /* start Recording */
						miniEditor.editorStartRecording();
						//System.out.println("Command Implemented In Version 2");
					break;
				case 'E': /* End recording */
					miniEditor.editorEndRecording();
					//System.out.println("Command Implemented In Version 2");
					break;
				case 'P': /* Play recording */
					miniEditor.editorPlayRecording();
					//System.out.println("Command Implemented In Version 2");
					break;
				case 'Z': /* undo */
					miniEditor.editorUndo();
					//System.out.println("Command Implemented In Version 3");
					break;
				case 'Y': /* redo */
					miniEditor.editorRedo();
					//System.out.println("Command Implemented In Version 3");
					break;
				default: System.out.println("Unrecognized command, please try again:") ;
					break;
			}
			System.out.println("-----------------------------------------------------");
			System.out.println("[" + miniEditor.getBuffer() + "]");
			System.out.println("-----------------------------------------------------");
			System.out.println("[" + miniEditor.getSelection() + "]");
			System.out.println("-----------------------------------------------------");
			System.out.println("[" + miniEditor.getClipboard() + "]");
			System.out.println("-----------------------------------------------------");

			System.out.println("Enter command (I/S/C/X/V/D/R/E/P/Z/Y/Q) > ") ;	
			try
			{
				inputLine = keyboard.readLine();
			} catch (IOException e)
			{
				System.out.println("Unable to read standard input");
				inputLine = "W";
			} 
			commandLetter = Character.toUpperCase(inputLine.charAt(0)) ;
		}
		System.out.println ("Goodbye") ;
	}
}
