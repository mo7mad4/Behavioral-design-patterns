/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Template;

/**
 *
 * @author AL_Qema
 */
public class Main {
    public static void main(String[] args) {
        String text = "My name is Mohammed. I bought this coat last year. it has many defects and useless";
        
        MyTextProcessor mtP = new MyTextProcessor();
        mtP.processText(text);
        
    }
    
}
