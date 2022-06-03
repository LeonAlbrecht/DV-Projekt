package testdvprojekt;

import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class PlayMusic {
	



public static void play() {
  try {
   File file = new File("src/testdvprojekt/Steve Jablonsky - Arrival To Earth (Official Audio) (1).wav");
   Clip clip = AudioSystem.getClip();
   clip.open(AudioSystem.getAudioInputStream(file));
   clip.start();
   Thread.sleep(clip.getMicrosecondLength());
  } catch (Exception e) {
   System.err.println(e.getMessage());
  }
 }

}