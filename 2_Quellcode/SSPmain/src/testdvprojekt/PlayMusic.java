package testdvprojekt;

import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class PlayMusic {
	



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

}