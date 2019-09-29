/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package batteryapp;

import java.io.File;

/**
 *
 * @author MshzidanPC
 */
public class BatteryApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               
Kernel32.SYSTEM_POWER_STATUS batteryStatus = new Kernel32.SYSTEM_POWER_STATUS();
Kernel32.INSTANCE.GetSystemPowerStatus(batteryStatus);
File sound = new File("sound.wav");
batterySound bs = new batterySound();
System.out.println(batteryStatus);

byte batteryPresent= batteryStatus.getBatteryLifePercent();

      
if(batteryStatus.ACLineStatus == 1 && batteryPresent > 80 ){
    System.out.println("افصل الكهرباء");
    bs.run(sound);
    }

    bs.run(sound);


}

}
