package testdvprojekt;

import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 * kurze Beschreibung: Musik, Sound w�hrend dem Spiel
 * 
 * @author: Adham, Jonas
 * 
 */

public class PlayMusic {

	/**
	 * kurze Beschreibung: L�sst die Musik laufen
	 * 
	 * @author: Jonas
	 * @param: AudioSystem.getClip(zieht die File in die Variable), clip.open(�ffnet die Musik), clip.start(Startet die Musik)
	 * @return: Musik
	 */
	
public static void play() {

  try {
   File file = new File("Sounds/Steve Jablonsky - Arrival To Earth (Official Audio) (1).wav");
   Clip clip = AudioSystem.getClip();
   clip.open(AudioSystem.getAudioInputStream(file));
   clip.start();
   Thread.sleep(clip.getMicrosecondLength());
  } catch (Exception e) {
   System.err.println(e.getMessage());
  }
 }

/**
 * kurze Beschreibung: Sound, wenn man den Play Button bet�tigt
 * 
 * @author: Adham
 * @param: AudioSystem.getClip(zieht die File in die Variable), clip.open(�ffnet die Musik), clip.start(Startet die Musik)
 * @return: Musik
 */

public static void playButton() {

	  try {
	   File file = new File("Sounds/button-21.wav");
	   Clip clip = AudioSystem.getClip();
	   clip.open(AudioSystem.getAudioInputStream(file));
	   clip.start();
	  } catch (Exception e) {
	   System.err.println(e.getMessage());
	  }
	 }

/**
 * kurze Beschreibung: Sound, der bei einem Sieg l�uft
 * 
 * @author: Adham
 * @param: AudioSystem.getClip(zieht die File in die Variable), clip.open(�ffnet die Musik), clip.start(Startet die Musik)
 * @return: Musik
 * 
 */

public static void playWin() {

	  try {
	   File file = new File("Sounds/WinSound.wav");
	   Clip clip = AudioSystem.getClip();
	   clip.open(AudioSystem.getAudioInputStream(file));
	   clip.start();
	  } catch (Exception e) {
	   System.err.println(e.getMessage());
	  }
	 }

/**
 * kurze Beschreibung: Sound, der bei einer Niederlage l�uft
 * 
 * @author: Adham
 * @param: AudioSystem.getClip(zieht die File in die Variable), clip.open(�ffnet die Musik), clip.start(Startet die Musik)
 * @return: Musik
 * 
 */

public static void playLoose() {

	  try {
	   File file = new File("Sounds/LooseSound.wav");
	   Clip clip = AudioSystem.getClip();
	   clip.open(AudioSystem.getAudioInputStream(file));
	   clip.start();
	  } catch (Exception e) {
	   System.err.println(e.getMessage());
	  }
	 }

/**
 * kurze Beschreibung: Sound, der bei einem Unentschieden l�uft
 * 
 * @author: Adham
 * @param: AudioSystem.getClip(zieht die File in die Variable), clip.open(�ffnet die Musik), clip.start(Startet die Musik)
 * @return: Musik
 * 
 */

public static void playDraw() {

	  try {
	   File file = new File("Sounds/DrawSound.wav");
	   Clip clip = AudioSystem.getClip();
	   clip.open(AudioSystem.getAudioInputStream(file));
	   clip.start();
	  } catch (Exception e) {
	   System.err.println(e.getMessage());
	  }
	 }

}