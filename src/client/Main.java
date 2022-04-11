/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import DataBus.eventBus;

/**
 *
 * @author AL_Qema
 */
public class Main {

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        eventBus.getInstance().Subscriber(a);
        eventBus.getInstance().Subscriber(b);
        eventBus.getInstance().Subscriber(c);

        StudentMessage msg1 = new StudentMessage();
        msg1.setSender(a);
        msg1.setStudentID("120191424");
        msg1.setStudentName("Zeyad");
        a.sendToOther(msg1);

        msg1.setSender(b);
        msg1.setStudentID("120191424");
        msg1.setStudentName("Mohammed");

        b.sendToOther(msg1);

        msg1.setSender(c);
        msg1.setStudentID("120191424");
        msg1.setStudentName("Raida");
        c.sendToOther(msg1);
    }

}
