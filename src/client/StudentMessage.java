/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import DataBus.eventBus;
import DataBus.eventBus.BusMessage;

/**
 *
 * @author AL_Qema
 */
public class StudentMessage extends BusMessage{
    String studentName;
    String studentID;

    public eventBus.Subscriber getSender() {
        return sender;
    }

    public void setSender(eventBus.Subscriber sender) {
        this.sender = sender;
    }

    
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }
    
    
}
