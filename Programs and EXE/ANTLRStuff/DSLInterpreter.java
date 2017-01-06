/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dslinterpreter;

import java.io.IOException;
import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

/**
 *
 * @author Daddy
 */
public class DSLInterpreter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, RecognitionException {
        duhLexer lexer = new duhLexer(new ANTLRFileStream(args[0]));
        
	CommonTokenStream tokens = new CommonTokenStream(lexer);
        
	duhParser parser = new duhParser(tokens);
        
        parser.program();
        
    }
    
}
