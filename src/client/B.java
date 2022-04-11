/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import DataBus.eventBus;
import DataBus.eventBus.Subscriber;

/**
 *
 * @author AL_Qema
 */
public class B implements Subscriber {

    public void sendToOther(StudentMessage msg) {
        eventBus.getInstance().publish(msg);

    }

    @Override
    public void messageReceived(eventBus.BusMessage busMessage) {
        if (busMessage instanceof StudentMessage) {
            StudentMessage sm = (StudentMessage) busMessage;
            System.out.println("B received message about student: " + sm.getStudentID() + "send from " + sm.getSender().getClass().getName());
        }
    }

}
