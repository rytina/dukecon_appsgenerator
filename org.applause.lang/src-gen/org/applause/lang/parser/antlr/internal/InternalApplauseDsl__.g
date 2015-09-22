lexer grammar InternalApplauseDsl;
@header {
package org.applause.lang.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T11 : 'navigationBar.' ;
T12 : '=' ;
T13 : '{' ;
T14 : 'icon' ;
T15 : 'triggers' ;
T16 : ',' ;
T17 : '}' ;
T18 : '[]' ;
T19 : '.' ;
T20 : 'section.id' ;
T21 : '(' ;
T22 : ')' ;
T23 : 'replace(' ;
T24 : 'urlconform(' ;
T25 : '[' ;
T26 : ']' ;
T27 : 'split(' ;
T28 : 'tabbarApp' ;
T29 : 'app' ;
T30 : 'appicon' ;
T31 : 'splash' ;
T32 : 'mainview' ;
T33 : 'button' ;
T34 : 'title' ;
T35 : 'view' ;
T36 : 'handler' ;
T37 : 'const' ;
T38 : 'de=' ;
T39 : 'en=' ;
T40 : 'type' ;
T41 : 'mapsTo' ;
T42 : 'entity' ;
T43 : 'extends' ;
T44 : 'derived' ;
T45 : 'contentprovider' ;
T46 : 'returns' ;
T47 : 'resolves' ;
T48 : 'fetches' ;
T49 : 'XML' ;
T50 : 'HTML' ;
T51 : 'from' ;
T52 : 'selects' ;
T53 : 'tableview' ;
T54 : ':' ;
T55 : 'action' ;
T56 : 'detailsview' ;
T57 : 'webview' ;
T58 : 'customview' ;
T59 : 'implementedBy' ;
T60 : 'header' ;
T61 : 'subtitle' ;
T62 : 'details' ;
T63 : 'image' ;
T64 : 'section' ;
T65 : 'forAllSections' ;
T66 : 'content' ;
T67 : 'cell' ;
T68 : 'foreach' ;
T69 : 'text' ;
T70 : 'query' ;
T71 : 'as' ;
T72 : 'delegate' ;
T73 : 'Default' ;
T74 : 'DefaultWithDisclosure' ;
T75 : 'Value2' ;
T76 : 'Double' ;
T77 : 'Subtitle' ;
T78 : 'Map' ;
T79 : 'left' ;
T80 : 'center' ;
T81 : 'right' ;

// $ANTLR src "../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g" 4874
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g" 4876
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g" 4878
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g" 4880
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g" 4882
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g" 4884
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g" 4886
RULE_ANY_OTHER : .;


