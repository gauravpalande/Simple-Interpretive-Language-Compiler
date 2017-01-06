/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GauravPalandeAss2;

/**
 *
 * @author gaura
 */

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;
import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

/**
 *
 * @author Daddy
 */
public class InterPretGap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, RecognitionException {
        SILLexer lexer = new SILLexer(new ANTLRFileStream("C:\\Users\\gaura\\Desktop\\Grammar\\output\\GauravPalandeAss2\\Test.s"));
        
	CommonTokenStream tokens = new CommonTokenStream(lexer);
        
	SILParser parser = new SILParser(tokens);
        
        parser.prog();
        
    }
    
}

