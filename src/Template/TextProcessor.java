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
public abstract class TextProcessor {
    public abstract String[] tokenize(String text);
    public abstract String[] removeStopWorld(String[] tokens);
    public abstract String[] stem(String[] tokens);
    public abstract String applysentimentAnalysis(String[] tokens);
    
    final public String processText(String inputText){
        //tokenize
        String[] tokens = tokenize(inputText);
        //removeStopWorld
        String[]removeStopWorld = removeStopWorld(tokens);
        //stem
        String[] stem = stem(removeStopWorld);
        //sentimentAnalysis
        return applysentimentAnalysis(stem);
    }
    
}
