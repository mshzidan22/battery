/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package batteryapp;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import sun.applet.Main;

/**
 *
 * @author MshzidanPC
 */
public class batterySound {
     
    
    public void run(File sound) {
      try {
        Clip clip = AudioSystem.getClip();
        AudioInputStream inputStream = AudioSystem.getAudioInputStream(sound);
        clip.open(inputStream);
        clip.start(); 
        
        Thread.sleep(clip.getMicrosecondLength()/1000);
      } catch (Exception e) {
        System.err.println(e.getMessage());
      }
    }
  }