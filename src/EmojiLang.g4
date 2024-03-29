grammar EmojiLang;

prog: stat*
;

stat: ( declaration
    | assignment
    | read
    | print ) END_STAT
;

declaration: DEC_KW ID '=' expression0
;

assignment: ID '=' expression0
;

expression0: expression1            #single0
    | expression1 ADD expression1   #add
    | expression1 SUB expression1   #sub
;

expression1:  expression2			    #single1
      | expression2 MULT expression2	#mult
      | expression2 DIV expression2	    #div
;

expression2:   INT		        #int
       | REAL			        #real
       | '(' expression0 ')'	#par
;

read: READ '(' ID ')'
;

print: PRINT '(' (ID | INT | REAL)  ')'
;

READ: '📖'
;

PRINT: '🖨️'
;

OPEN_BRACKET: '👉'
;

CLOSE_BRACKET: '👈'
;

DEC_KW: '😀'
;

END_STAT: ';'
;

ID:   ('a'..'z'|'A'..'Z')+
;

REAL: '0'..'9'+'.''0'..'9'+
;

INT: '0'..'9'+
;

ADD: '+'
;

SUB: '-'
;

MULT: '*'
;

DIV: '\\'
;

WS: (' '|'\t'|'\n'|'\r')+ { skip(); }
;