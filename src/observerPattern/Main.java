/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerPattern;

/**
 *
 * @author AL_Qema
 */
public class Main {    
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d =new D();
        W w = new W();

        a.addAlistener(b);
        a.addAlistener(c);
        a.addAlistener(d);
        a.addAlistener(w);
        a.sendData("Hello world");
        
    }
    
}
