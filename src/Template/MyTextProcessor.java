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
public class MyTextProcessor extends TextProcessor{

    @Override
    public String[] tokenize(String text) {
        System.out.println("tokenize");
        return null;
    }

    @Override
    public String[] removeStopWorld(String[] tokens) {
        System.out.println("removeStopWorld");
        return null;
    }

    @Override
    public String[] stem(String[] tokens) {
        System.out.println("stem");
        return null;
    }

    @Override
    public String applysentimentAnalysis(String[] tokens) {
        System.out.println("applysentimentAnalysis");
        return null;
    }
    
}
