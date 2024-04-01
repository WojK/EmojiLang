grammar EmojiLang;

prog: (stat|function)*
;

stat: ( declaration
    | assignment
    | read
    | print
    | functionExec ) END_STAT
    | if
    | loop
;

function: '🤙' retType fname '(' fargs ')' OPEN_BRACKET funBlock ret CLOSE_BRACKET
;

retType: 'int' | 'real'
;

functionExec: '🧨'fname'('fargsExec')'
;

fargsExec: (ID',')* (ID)?
;

funBlock: stat*
;

fname: ID
;

fargs: (fargsType ID ',')* (fargsType ID)?
;

fargsType: 'int' | 'real'
;

ret: 'ret:' ID END_STAT
;

if: IF '(' equal ')' OPEN_BRACKET blockif CLOSE_BRACKET
;

blockif: stat
;

equal: equalFactor '==' equalFactor
;

equalFactor: INT | REAL | ID
;

loop: FOR '(' repetitions ')' OPEN_BRACKET loopBlock CLOSE_BRACKET
;

repetitions: INT | ID
;

loopBlock: stat
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
       | ID                     #var
       | '(' expression0 ')'	#par
;

read: READ '(' ID ')'
;

print: PRINT '(' (ID | INT | REAL)  ')'
;

IF: '🤔'
;

FOR: '🔁'
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

DIV: '/'
;

WS: (' '|'\t'|'\n'|'\r')+ { skip(); }
;