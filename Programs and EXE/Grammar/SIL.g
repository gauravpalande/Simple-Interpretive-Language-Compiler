grammar SIL;

@header {
package GauravPalandeAss2;
import java.util.HashMap;
import java.util.Scanner;
}

@members {
/** Map variable name to Integer object holding value */
HashMap memory = new HashMap();
}

prog :   stat+ ;

stat :	'PRINT' STRING {System.out.print($STRING.text.replaceAll("\"", ""));}
	|
	'PRINT' expr {System.out.print($expr.value);}
	|
	'PRINTLN' STRING {System.out.println($STRING.text.replaceAll("\"", ""));}
	|
	'PRINTLN' expr {System.out.println($expr.value);}
	//|
	//'INPUT' ID {Scanner console = new Scanner(System.in);
        //  	int Identifier = console.nextInt();
        //  	memory.put($ID.text, Identifier);          			
        //  	}
        |
        'INPUT ' ID1 = ID {  Scanner in1 = new Scanner(System.in); Integer i = in1.nextInt(); memory.put($ID1.text, i);}
                (',' ID2 = ID { 
                Scanner in2 = new Scanner(System.in); Integer j = in2.nextInt(); memory.put($ID2.text, j);})* NEWLINE 
        |
        'INTEGER ' ID1 = ID {if( memory.containsKey(ID1.getText())){
                                            System.out.println(ID1.getText()+"is a duplicate element");
                                            System.exit(0);
                                        } memory.put($ID1.text, 0);}
                (',' ID2 = ID {if( memory.containsKey(ID2.getText())){
                                            System.out.println(ID2.getText()+"is a duplicate element");
                                            System.exit(0);
                                        }  memory.put($ID2.text, 0);})* NEWLINE 

        //|
        //'INTEGER' ID {int $ID.text; memory.put($ID.text, 0);} 		
	|
	'LET' ID '=' expr { memory.put($ID.text, new Integer($expr.value));}  
	|
	'//' {}
	|
	'END' {System.exit(0);}
	
expr NEWLINE {System.out.print($expr.value);}
    |   ID '=' expr NEWLINE
        {memory.put($ID.text, new Integer($expr.value));}
    |   NEWLINE {System.out.println("");}
    ;

expr returns [int value]
    :   e=multExpr {$value = $e.value;}
        (   '+' e= multExpr {$value += $e.value;}
        |   '-' e= multExpr {$value -= $e.value;}   	
        )*
    ;


//divExpr returns [int value]
//    :   e=atom {$value = $e.value;} ('/' e=atom {$value /= $e.value;})*
//    ; 

multExpr returns [int value]
    :   e=atom {$value = $e.value;} 
       
     (  ('*' e=atom {$value *= $e.value;})
    |
       ('/' e=atom {$value /= $e.value;})
     )*
    ; 


atom returns [int value]
    :   INT {$value = Integer.parseInt($INT.text);}
    |   ID
        {
        Integer v = (Integer)memory.get($ID.text);
        if ( v!=null ) $value = v.intValue();
        else System.err.println("undefined variable "+$ID.text);
        }
    |   '(' expr ')' {$value = $expr.value;}
    ;

ID  :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    ;

INT :	'0'..'9'+
    ;

COMMENT
    :   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    |   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;

STRING
    :  '"' ( ESC_SEQ | ~('\\'|'"') )* '"'
    ;

CHAR:  '\'' ( ESC_SEQ | ~('\''|'\\') ) '\''
    ;

fragment
HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F') ;

fragment
ESC_SEQ
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |   UNICODE_ESC
    |   OCTAL_ESC
    ;

fragment
OCTAL_ESC
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;

fragment
UNICODE_ESC
    :   '\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
    ;
NEWLINE:'\r'? '\n' ;