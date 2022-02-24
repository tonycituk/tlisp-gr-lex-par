grammar arithLisp;

/* Allows us to input multiple expressions */
prog: tlisp+;
tlisp: exprS NEWLINE;
exprS: num | list_f;
list_f: '(' f empty exprS (empty exprS)+ ')';
f: '+' | '-' | '*' | '/';
num: neg | pos;
neg: '-' pos;
pos: INT | FLOAT;
empty: ' ';
FLOAT: DIGIT+ '.' DIGIT+;
INT: DIGIT+;
DIGIT: [0-9];
NEWLINE: '\r'? '\n';
