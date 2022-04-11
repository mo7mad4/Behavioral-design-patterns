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
public class VeryLowBatteryMode implements MobileMode {

    @Override
    public void process() {
        System.out.println("stop all backround tasks and activate power saving mode");
    }

}
