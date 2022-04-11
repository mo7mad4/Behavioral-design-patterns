/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerPattern;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author AL_Qema
 */
public class A {

    List<AListener> listeners;
    
    public A() {
        listeners = new ArrayList<>();
    }
    
    
    public void addAlistener(AListener listener){
        if(!listeners.contains(listener)){
            listeners.add(listener);
        }
    }
    
    public void sendData(String data){
        for(AListener L:listeners){
            L.setData(data);
            
        }

    }
    
    public interface AListener{
        public void setData(String data);
    }
  
}
