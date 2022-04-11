/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerPattern;

import observerPattern.A.AListener;

/**
 *
 * @author AL_Qema
 */
public class B implements AListener{

    @Override
    public void setData(String data) {
        System.out.println("B received "+data);
    }
   
    
}
