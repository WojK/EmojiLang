grammar EmojiLang;

prog: globalStat*
;

globalStat: ( globalDeclatarion
    | functionExec ) END_STAT
    | function
    | structDef
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

structDef: '🏗️' ID OPEN_BRACKET structBlock CLOSE_BRACKET
;

structBlock: ( structValueTypes ID END_STAT)*
;

structValueTypes: 'int' | 'real'
;

stat: ( declaration
    | assignment
    | read
    | print
    | functionExec
    | structDeclaration
    | assignValueToStructure
    | arrayDeclaration
    | stringDeclaration
    | stringConcat) END_STAT
    | if
    | loop
;

structDeclaration: '🏗️' structName ID
;

arrayDeclaration: '🤠' ID '=' '{'arrayValues'}'
;

stringDeclaration: '🕸️' ID '=' STRING
;

stringConcat: '🕸️' ID '=' stringValue ADD stringValue
;

stringValue: (ID | STRING)
;

arrayValues: ((INT | REAL)',')* (INT|REAL)?
;

assignValueToStructure: ID '🫱' structProp '=' structPropValue
;

structProp: ID
;

structPropValue: INT | REAL
;

structName: ID
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

blockif: stat*
;

equal: equalFactor '==' equalFactor
;

equalFactor: INT | REAL | ID
;

loop: FOR '(' repetitions ')' OPEN_BRACKET loopBlock CLOSE_BRACKET
;

repetitions: INT | ID
;

loopBlock: stat*
;

globalDeclatarion: '🌍' ID '=' globalValue
;

globalValue: INT | REAL
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
       | valueFromStructProp    #valueFromStructProperty
       | arrValue               #valueFromArray
       | '(' expression0 ')'	#par
;

arrValue: ID '[' INT ']'
;

valueFromStructProp: ID '🫱' structProperty
;

structProperty: ID
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

STRING :  '"' ( ~('\\'|'"') )* '"'
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