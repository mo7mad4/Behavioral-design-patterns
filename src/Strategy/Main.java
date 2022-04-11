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
public class Main {
    public static void main(String[] args) {
        ChargingMode cm = new ChargingMode();
        FullBaterryMode fbm = new FullBaterryMode();
        LowBatterryMode lbm = new LowBatterryMode();
        VeryLowBatteryMode vlbm = new VeryLowBatteryMode();
        MobileApp app = new MobileApp();
        
        app.setCurrentMode(cm);
        app.operate();
        
        app.setCurrentMode(fbm);
        app.operate();
        
        app.setCurrentMode(lbm);
        app.operate();
        
        app.setCurrentMode(vlbm);
        app.operate();
        
        
//        app.setMode(1);
//        app.operate();
//        
//        app.setMode(2);
//        app.operate();
//        
//        app.setMode(3);
//        app.operate();
    }
    
}
