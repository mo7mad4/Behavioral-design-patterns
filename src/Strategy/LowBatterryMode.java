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
public class LowBatterryMode implements MobileMode {

    @Override
    public void process() {
        System.out.println("Perform basic tasks");
    }

}
