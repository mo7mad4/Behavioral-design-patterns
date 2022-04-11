/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBus;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author AL_Qema
 */
public class eventBus {
    
    private static eventBus instance = null;

    private eventBus() {
    }
    
    public static synchronized eventBus getInstance(){
        if(instance == null)
            instance = new eventBus();
        return instance;
    }
    

    protected List<Subscriber> subscribers = new ArrayList<>();

    public void Subscriber(Subscriber s) {
        if (!subscribers.contains(s)) {
            subscribers.add(s);
        }
    }

    public void unSubscriber(Subscriber s) {
            subscribers.add(s);
    }
    
    public void publish(BusMessage msg){
        for(Subscriber s : subscribers){
            if(!s.equals(msg.getSender()))
            s.messageReceived(msg);
        }
    }

    public interface Subscriber {
        public void messageReceived(BusMessage busMessage);
    }

    public static abstract class BusMessage {

        protected Subscriber sender;

        public Subscriber getSender() {
            return sender;
        }

        public void setSender(Subscriber sender) {
            this.sender = sender;
        }

    }

}
