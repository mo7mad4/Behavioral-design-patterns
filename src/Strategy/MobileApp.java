/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategy;

/**
 *
 * @author AL_Qema
 */
public class MobileApp {

    MobileMode currentMode;

    public void setCurrentMode(MobileMode currentMode) {
        this.currentMode = currentMode;
    }
    
    public void operate(){
        currentMode.process();
    }
//    int currentMode = 1;
//
//    public void setMode(int currentMode) {
//        this.currentMode = currentMode;
//    }
//    public void operate() {
//        if (currentMode == 1) {
//            System.out.println("Perform heavy tasks");
//        } else if (currentMode == 2) {
//            System.out.println("Perform normal tasks");
//        } else if (currentMode == 3) {
//            System.out.println("Perform basic tasks");
//        } else if (currentMode == 4) {
//            System.out.println("stop all backround tasks and activate power saving mode");
//        }
//    }
}
