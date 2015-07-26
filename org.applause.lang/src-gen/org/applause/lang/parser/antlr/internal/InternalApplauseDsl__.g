lexer grammar InternalApplauseDsl;
@header {
package org.applause.lang.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T11 : '[]' ;
T12 : '.' ;
T13 : 'section.id' ;
T14 : '(' ;
T15 : ')' ;
T16 : 'replace(' ;
T17 : ',' ;
T18 : 'urlconform(' ;
T19 : '[' ;
T20 : ']' ;
T21 : 'split(' ;
T22 : 'tabbarApp' ;
T23 : 'app' ;
T24 : '{' ;
T25 : 'appicon=' ;
T26 : 'splash=' ;
T27 : 'mainview=' ;
T28 : '}' ;
T29 : 'button' ;
T30 : 'title=' ;
T31 : 'icon=' ;
T32 : 'view=' ;
T33 : 'handler=' ;
T34 : 'const' ;
T35 : 'de=' ;
T36 : 'en=' ;
T37 : 'type' ;
T38 : 'mapsTo' ;
T39 : 'entity' ;
T40 : 'extends' ;
T41 : 'derived' ;
T42 : 'contentprovider' ;
T43 : 'returns' ;
T44 : 'resolves' ;
T45 : 'fetches' ;
T46 : 'XML' ;
T47 : 'HTML' ;
T48 : 'from' ;
T49 : 'selects' ;
T50 : 'tableview' ;
T51 : ':' ;
T52 : 'detailsview' ;
T53 : 'webview' ;
T54 : 'customview' ;
T55 : 'implementedBy' ;
T56 : 'header' ;
T57 : 'subtitle=' ;
T58 : 'details=' ;
T59 : 'image=' ;
T60 : 'section' ;
T61 : 'forAllSections' ;
T62 : 'content=' ;
T63 : 'cell' ;
T64 : 'foreach' ;
T65 : 'text=' ;
T66 : 'query=' ;
T67 : 'action=' ;
T68 : 'button=' ;
T69 : 'as' ;
T70 : 'delegate' ;
T71 : 'Default' ;
T72 : 'DefaultWithDisclosure' ;
T73 : 'Value2' ;
T74 : 'Double' ;
T75 : 'Subtitle' ;
T76 : 'Map' ;

// $ANTLR src "../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g" 4282
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g" 4284
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g" 4286
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g" 4288
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g" 4290
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g" 4292
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g" 4294
RULE_ANY_OTHER : .;


