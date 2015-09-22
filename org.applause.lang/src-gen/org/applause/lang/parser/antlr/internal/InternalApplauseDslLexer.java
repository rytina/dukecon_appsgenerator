package org.applause.lang.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalApplauseDslLexer extends Lexer {
    public static final int T75=75;
    public static final int T76=76;
    public static final int T73=73;
    public static final int RULE_ID=4;
    public static final int T74=74;
    public static final int T79=79;
    public static final int T77=77;
    public static final int T78=78;
    public static final int RULE_ANY_OTHER=10;
    public static final int T29=29;
    public static final int T28=28;
    public static final int T27=27;
    public static final int T26=26;
    public static final int T25=25;
    public static final int EOF=-1;
    public static final int T24=24;
    public static final int T23=23;
    public static final int T22=22;
    public static final int T72=72;
    public static final int T21=21;
    public static final int T71=71;
    public static final int T20=20;
    public static final int T70=70;
    public static final int T62=62;
    public static final int T63=63;
    public static final int T64=64;
    public static final int T65=65;
    public static final int T66=66;
    public static final int T67=67;
    public static final int T68=68;
    public static final int T69=69;
    public static final int RULE_INT=6;
    public static final int T38=38;
    public static final int T37=37;
    public static final int T39=39;
    public static final int T34=34;
    public static final int T33=33;
    public static final int T36=36;
    public static final int T35=35;
    public static final int T30=30;
    public static final int T61=61;
    public static final int T32=32;
    public static final int T60=60;
    public static final int T31=31;
    public static final int T49=49;
    public static final int T48=48;
    public static final int T43=43;
    public static final int Tokens=82;
    public static final int RULE_SL_COMMENT=8;
    public static final int T42=42;
    public static final int T41=41;
    public static final int T40=40;
    public static final int T47=47;
    public static final int T46=46;
    public static final int T45=45;
    public static final int RULE_ML_COMMENT=7;
    public static final int T44=44;
    public static final int RULE_STRING=5;
    public static final int T50=50;
    public static final int T59=59;
    public static final int T11=11;
    public static final int T12=12;
    public static final int T13=13;
    public static final int T14=14;
    public static final int T81=81;
    public static final int T52=52;
    public static final int T15=15;
    public static final int RULE_WS=9;
    public static final int T80=80;
    public static final int T51=51;
    public static final int T16=16;
    public static final int T54=54;
    public static final int T17=17;
    public static final int T53=53;
    public static final int T18=18;
    public static final int T56=56;
    public static final int T19=19;
    public static final int T55=55;
    public static final int T58=58;
    public static final int T57=57;
    public InternalApplauseDslLexer() {;} 
    public InternalApplauseDslLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g"; }

    // $ANTLR start T11
    public final void mT11() throws RecognitionException {
        try {
            int _type = T11;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:10:5: ( 'navigationBar.' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:10:7: 'navigationBar.'
            {
            match("navigationBar."); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T11

    // $ANTLR start T12
    public final void mT12() throws RecognitionException {
        try {
            int _type = T12;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:11:5: ( '=' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:11:7: '='
            {
            match('='); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T12

    // $ANTLR start T13
    public final void mT13() throws RecognitionException {
        try {
            int _type = T13;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:12:5: ( '{' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:12:7: '{'
            {
            match('{'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T13

    // $ANTLR start T14
    public final void mT14() throws RecognitionException {
        try {
            int _type = T14;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:13:5: ( 'icon' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:13:7: 'icon'
            {
            match("icon"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T14

    // $ANTLR start T15
    public final void mT15() throws RecognitionException {
        try {
            int _type = T15;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:14:5: ( 'triggers' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:14:7: 'triggers'
            {
            match("triggers"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T15

    // $ANTLR start T16
    public final void mT16() throws RecognitionException {
        try {
            int _type = T16;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:15:5: ( ',' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:15:7: ','
            {
            match(','); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T16

    // $ANTLR start T17
    public final void mT17() throws RecognitionException {
        try {
            int _type = T17;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:16:5: ( '}' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:16:7: '}'
            {
            match('}'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T17

    // $ANTLR start T18
    public final void mT18() throws RecognitionException {
        try {
            int _type = T18;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:17:5: ( '[]' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:17:7: '[]'
            {
            match("[]"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T18

    // $ANTLR start T19
    public final void mT19() throws RecognitionException {
        try {
            int _type = T19;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:18:5: ( '.' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:18:7: '.'
            {
            match('.'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T19

    // $ANTLR start T20
    public final void mT20() throws RecognitionException {
        try {
            int _type = T20;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:19:5: ( 'section.id' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:19:7: 'section.id'
            {
            match("section.id"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T20

    // $ANTLR start T21
    public final void mT21() throws RecognitionException {
        try {
            int _type = T21;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:20:5: ( '(' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:20:7: '('
            {
            match('('); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T21

    // $ANTLR start T22
    public final void mT22() throws RecognitionException {
        try {
            int _type = T22;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:21:5: ( ')' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:21:7: ')'
            {
            match(')'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T22

    // $ANTLR start T23
    public final void mT23() throws RecognitionException {
        try {
            int _type = T23;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:22:5: ( 'replace(' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:22:7: 'replace('
            {
            match("replace("); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T23

    // $ANTLR start T24
    public final void mT24() throws RecognitionException {
        try {
            int _type = T24;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:23:5: ( 'urlconform(' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:23:7: 'urlconform('
            {
            match("urlconform("); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T24

    // $ANTLR start T25
    public final void mT25() throws RecognitionException {
        try {
            int _type = T25;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:24:5: ( '[' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:24:7: '['
            {
            match('['); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T25

    // $ANTLR start T26
    public final void mT26() throws RecognitionException {
        try {
            int _type = T26;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:25:5: ( ']' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:25:7: ']'
            {
            match(']'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T26

    // $ANTLR start T27
    public final void mT27() throws RecognitionException {
        try {
            int _type = T27;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:26:5: ( 'split(' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:26:7: 'split('
            {
            match("split("); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T27

    // $ANTLR start T28
    public final void mT28() throws RecognitionException {
        try {
            int _type = T28;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:27:5: ( 'tabbarApp' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:27:7: 'tabbarApp'
            {
            match("tabbarApp"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T28

    // $ANTLR start T29
    public final void mT29() throws RecognitionException {
        try {
            int _type = T29;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:28:5: ( 'app' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:28:7: 'app'
            {
            match("app"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T29

    // $ANTLR start T30
    public final void mT30() throws RecognitionException {
        try {
            int _type = T30;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:29:5: ( 'appicon' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:29:7: 'appicon'
            {
            match("appicon"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T30

    // $ANTLR start T31
    public final void mT31() throws RecognitionException {
        try {
            int _type = T31;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:30:5: ( 'splash' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:30:7: 'splash'
            {
            match("splash"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T31

    // $ANTLR start T32
    public final void mT32() throws RecognitionException {
        try {
            int _type = T32;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:31:5: ( 'mainview' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:31:7: 'mainview'
            {
            match("mainview"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T32

    // $ANTLR start T33
    public final void mT33() throws RecognitionException {
        try {
            int _type = T33;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:32:5: ( 'button' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:32:7: 'button'
            {
            match("button"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T33

    // $ANTLR start T34
    public final void mT34() throws RecognitionException {
        try {
            int _type = T34;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:33:5: ( 'title' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:33:7: 'title'
            {
            match("title"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T34

    // $ANTLR start T35
    public final void mT35() throws RecognitionException {
        try {
            int _type = T35;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:34:5: ( 'view' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:34:7: 'view'
            {
            match("view"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T35

    // $ANTLR start T36
    public final void mT36() throws RecognitionException {
        try {
            int _type = T36;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:35:5: ( 'handler' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:35:7: 'handler'
            {
            match("handler"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T36

    // $ANTLR start T37
    public final void mT37() throws RecognitionException {
        try {
            int _type = T37;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:36:5: ( 'const' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:36:7: 'const'
            {
            match("const"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T37

    // $ANTLR start T38
    public final void mT38() throws RecognitionException {
        try {
            int _type = T38;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:37:5: ( 'de=' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:37:7: 'de='
            {
            match("de="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T38

    // $ANTLR start T39
    public final void mT39() throws RecognitionException {
        try {
            int _type = T39;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:38:5: ( 'en=' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:38:7: 'en='
            {
            match("en="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T39

    // $ANTLR start T40
    public final void mT40() throws RecognitionException {
        try {
            int _type = T40;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:39:5: ( 'type' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:39:7: 'type'
            {
            match("type"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T40

    // $ANTLR start T41
    public final void mT41() throws RecognitionException {
        try {
            int _type = T41;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:40:5: ( 'mapsTo' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:40:7: 'mapsTo'
            {
            match("mapsTo"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T41

    // $ANTLR start T42
    public final void mT42() throws RecognitionException {
        try {
            int _type = T42;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:41:5: ( 'entity' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:41:7: 'entity'
            {
            match("entity"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T42

    // $ANTLR start T43
    public final void mT43() throws RecognitionException {
        try {
            int _type = T43;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:42:5: ( 'extends' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:42:7: 'extends'
            {
            match("extends"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T43

    // $ANTLR start T44
    public final void mT44() throws RecognitionException {
        try {
            int _type = T44;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:43:5: ( 'derived' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:43:7: 'derived'
            {
            match("derived"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T44

    // $ANTLR start T45
    public final void mT45() throws RecognitionException {
        try {
            int _type = T45;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:44:5: ( 'contentprovider' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:44:7: 'contentprovider'
            {
            match("contentprovider"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T45

    // $ANTLR start T46
    public final void mT46() throws RecognitionException {
        try {
            int _type = T46;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:45:5: ( 'returns' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:45:7: 'returns'
            {
            match("returns"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T46

    // $ANTLR start T47
    public final void mT47() throws RecognitionException {
        try {
            int _type = T47;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:46:5: ( 'resolves' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:46:7: 'resolves'
            {
            match("resolves"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T47

    // $ANTLR start T48
    public final void mT48() throws RecognitionException {
        try {
            int _type = T48;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:47:5: ( 'fetches' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:47:7: 'fetches'
            {
            match("fetches"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T48

    // $ANTLR start T49
    public final void mT49() throws RecognitionException {
        try {
            int _type = T49;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:48:5: ( 'XML' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:48:7: 'XML'
            {
            match("XML"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T49

    // $ANTLR start T50
    public final void mT50() throws RecognitionException {
        try {
            int _type = T50;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:49:5: ( 'HTML' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:49:7: 'HTML'
            {
            match("HTML"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T50

    // $ANTLR start T51
    public final void mT51() throws RecognitionException {
        try {
            int _type = T51;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:50:5: ( 'from' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:50:7: 'from'
            {
            match("from"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T51

    // $ANTLR start T52
    public final void mT52() throws RecognitionException {
        try {
            int _type = T52;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:51:5: ( 'selects' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:51:7: 'selects'
            {
            match("selects"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T52

    // $ANTLR start T53
    public final void mT53() throws RecognitionException {
        try {
            int _type = T53;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:52:5: ( 'tableview' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:52:7: 'tableview'
            {
            match("tableview"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T53

    // $ANTLR start T54
    public final void mT54() throws RecognitionException {
        try {
            int _type = T54;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:53:5: ( ':' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:53:7: ':'
            {
            match(':'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T54

    // $ANTLR start T55
    public final void mT55() throws RecognitionException {
        try {
            int _type = T55;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:54:5: ( 'action' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:54:7: 'action'
            {
            match("action"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T55

    // $ANTLR start T56
    public final void mT56() throws RecognitionException {
        try {
            int _type = T56;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:55:5: ( 'detailsview' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:55:7: 'detailsview'
            {
            match("detailsview"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T56

    // $ANTLR start T57
    public final void mT57() throws RecognitionException {
        try {
            int _type = T57;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:56:5: ( 'webview' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:56:7: 'webview'
            {
            match("webview"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T57

    // $ANTLR start T58
    public final void mT58() throws RecognitionException {
        try {
            int _type = T58;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:57:5: ( 'customview' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:57:7: 'customview'
            {
            match("customview"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T58

    // $ANTLR start T59
    public final void mT59() throws RecognitionException {
        try {
            int _type = T59;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:58:5: ( 'implementedBy' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:58:7: 'implementedBy'
            {
            match("implementedBy"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T59

    // $ANTLR start T60
    public final void mT60() throws RecognitionException {
        try {
            int _type = T60;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:59:5: ( 'header' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:59:7: 'header'
            {
            match("header"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T60

    // $ANTLR start T61
    public final void mT61() throws RecognitionException {
        try {
            int _type = T61;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:60:5: ( 'subtitle' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:60:7: 'subtitle'
            {
            match("subtitle"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T61

    // $ANTLR start T62
    public final void mT62() throws RecognitionException {
        try {
            int _type = T62;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:61:5: ( 'details' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:61:7: 'details'
            {
            match("details"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T62

    // $ANTLR start T63
    public final void mT63() throws RecognitionException {
        try {
            int _type = T63;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:62:5: ( 'image' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:62:7: 'image'
            {
            match("image"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T63

    // $ANTLR start T64
    public final void mT64() throws RecognitionException {
        try {
            int _type = T64;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:63:5: ( 'section' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:63:7: 'section'
            {
            match("section"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T64

    // $ANTLR start T65
    public final void mT65() throws RecognitionException {
        try {
            int _type = T65;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:64:5: ( 'forAllSections' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:64:7: 'forAllSections'
            {
            match("forAllSections"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T65

    // $ANTLR start T66
    public final void mT66() throws RecognitionException {
        try {
            int _type = T66;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:65:5: ( 'content' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:65:7: 'content'
            {
            match("content"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T66

    // $ANTLR start T67
    public final void mT67() throws RecognitionException {
        try {
            int _type = T67;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:66:5: ( 'cell' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:66:7: 'cell'
            {
            match("cell"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T67

    // $ANTLR start T68
    public final void mT68() throws RecognitionException {
        try {
            int _type = T68;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:67:5: ( 'foreach' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:67:7: 'foreach'
            {
            match("foreach"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T68

    // $ANTLR start T69
    public final void mT69() throws RecognitionException {
        try {
            int _type = T69;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:68:5: ( 'text' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:68:7: 'text'
            {
            match("text"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T69

    // $ANTLR start T70
    public final void mT70() throws RecognitionException {
        try {
            int _type = T70;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:69:5: ( 'query' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:69:7: 'query'
            {
            match("query"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T70

    // $ANTLR start T71
    public final void mT71() throws RecognitionException {
        try {
            int _type = T71;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:70:5: ( 'as' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:70:7: 'as'
            {
            match("as"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T71

    // $ANTLR start T72
    public final void mT72() throws RecognitionException {
        try {
            int _type = T72;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:71:5: ( 'delegate' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:71:7: 'delegate'
            {
            match("delegate"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T72

    // $ANTLR start T73
    public final void mT73() throws RecognitionException {
        try {
            int _type = T73;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:72:5: ( 'Default' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:72:7: 'Default'
            {
            match("Default"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T73

    // $ANTLR start T74
    public final void mT74() throws RecognitionException {
        try {
            int _type = T74;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:73:5: ( 'DefaultWithDisclosure' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:73:7: 'DefaultWithDisclosure'
            {
            match("DefaultWithDisclosure"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T74

    // $ANTLR start T75
    public final void mT75() throws RecognitionException {
        try {
            int _type = T75;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:74:5: ( 'Value2' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:74:7: 'Value2'
            {
            match("Value2"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T75

    // $ANTLR start T76
    public final void mT76() throws RecognitionException {
        try {
            int _type = T76;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:75:5: ( 'Double' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:75:7: 'Double'
            {
            match("Double"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T76

    // $ANTLR start T77
    public final void mT77() throws RecognitionException {
        try {
            int _type = T77;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:76:5: ( 'Subtitle' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:76:7: 'Subtitle'
            {
            match("Subtitle"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T77

    // $ANTLR start T78
    public final void mT78() throws RecognitionException {
        try {
            int _type = T78;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:77:5: ( 'Map' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:77:7: 'Map'
            {
            match("Map"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T78

    // $ANTLR start T79
    public final void mT79() throws RecognitionException {
        try {
            int _type = T79;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:78:5: ( 'left' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:78:7: 'left'
            {
            match("left"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T79

    // $ANTLR start T80
    public final void mT80() throws RecognitionException {
        try {
            int _type = T80;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:79:5: ( 'center' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:79:7: 'center'
            {
            match("center"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T80

    // $ANTLR start T81
    public final void mT81() throws RecognitionException {
        try {
            int _type = T81;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:80:5: ( 'right' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:80:7: 'right'
            {
            match("right"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T81

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4874:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4874:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4874:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4874:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4874:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ID

    // $ANTLR start RULE_INT
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4876:10: ( ( '0' .. '9' )+ )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4876:12: ( '0' .. '9' )+
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4876:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4876:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_INT

    // $ANTLR start RULE_STRING
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4878:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4878:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4878:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("4878:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4878:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4878:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFE')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4878:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4878:62: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4878:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4878:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFE')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4878:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4878:129: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_STRING

    // $ANTLR start RULE_ML_COMMENT
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4880:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4880:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4880:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFE')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFE')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4880:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ML_COMMENT

    // $ANTLR start RULE_SL_COMMENT
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4882:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4882:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4882:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFE')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4882:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4882:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4882:41: ( '\\r' )? '\\n'
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4882:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4882:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_SL_COMMENT

    // $ANTLR start RULE_WS
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4884:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4884:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4884:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_WS

    // $ANTLR start RULE_ANY_OTHER
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4886:16: ( . )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4886:18: .
            {
            matchAny(); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ANY_OTHER

    public void mTokens() throws RecognitionException {
        // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:8: ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | T62 | T63 | T64 | T65 | T66 | T67 | T68 | T69 | T70 | T71 | T72 | T73 | T74 | T75 | T76 | T77 | T78 | T79 | T80 | T81 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=78;
        int LA12_0 = input.LA(1);

        if ( (LA12_0=='n') ) {
            int LA12_1 = input.LA(2);

            if ( (LA12_1=='a') ) {
                int LA12_43 = input.LA(3);

                if ( (LA12_43=='v') ) {
                    int LA12_101 = input.LA(4);

                    if ( (LA12_101=='i') ) {
                        int LA12_152 = input.LA(5);

                        if ( (LA12_152=='g') ) {
                            int LA12_205 = input.LA(6);

                            if ( (LA12_205=='a') ) {
                                int LA12_255 = input.LA(7);

                                if ( (LA12_255=='t') ) {
                                    int LA12_297 = input.LA(8);

                                    if ( (LA12_297=='i') ) {
                                        int LA12_333 = input.LA(9);

                                        if ( (LA12_333=='o') ) {
                                            int LA12_364 = input.LA(10);

                                            if ( (LA12_364=='n') ) {
                                                int LA12_380 = input.LA(11);

                                                if ( (LA12_380=='B') ) {
                                                    int LA12_390 = input.LA(12);

                                                    if ( (LA12_390=='a') ) {
                                                        int LA12_398 = input.LA(13);

                                                        if ( (LA12_398=='r') ) {
                                                            int LA12_404 = input.LA(14);

                                                            if ( (LA12_404=='.') ) {
                                                                alt12=1;
                                                            }
                                                            else {
                                                                alt12=72;}
                                                        }
                                                        else {
                                                            alt12=72;}
                                                    }
                                                    else {
                                                        alt12=72;}
                                                }
                                                else {
                                                    alt12=72;}
                                            }
                                            else {
                                                alt12=72;}
                                        }
                                        else {
                                            alt12=72;}
                                    }
                                    else {
                                        alt12=72;}
                                }
                                else {
                                    alt12=72;}
                            }
                            else {
                                alt12=72;}
                        }
                        else {
                            alt12=72;}
                    }
                    else {
                        alt12=72;}
                }
                else {
                    alt12=72;}
            }
            else {
                alt12=72;}
        }
        else if ( (LA12_0=='=') ) {
            alt12=2;
        }
        else if ( (LA12_0=='{') ) {
            alt12=3;
        }
        else if ( (LA12_0=='i') ) {
            switch ( input.LA(2) ) {
            case 'c':
                {
                int LA12_47 = input.LA(3);

                if ( (LA12_47=='o') ) {
                    int LA12_102 = input.LA(4);

                    if ( (LA12_102=='n') ) {
                        int LA12_153 = input.LA(5);

                        if ( ((LA12_153>='0' && LA12_153<='9')||(LA12_153>='A' && LA12_153<='Z')||LA12_153=='_'||(LA12_153>='a' && LA12_153<='z')) ) {
                            alt12=72;
                        }
                        else {
                            alt12=4;}
                    }
                    else {
                        alt12=72;}
                }
                else {
                    alt12=72;}
                }
                break;
            case 'm':
                {
                switch ( input.LA(3) ) {
                case 'a':
                    {
                    int LA12_103 = input.LA(4);

                    if ( (LA12_103=='g') ) {
                        int LA12_154 = input.LA(5);

                        if ( (LA12_154=='e') ) {
                            int LA12_207 = input.LA(6);

                            if ( ((LA12_207>='0' && LA12_207<='9')||(LA12_207>='A' && LA12_207<='Z')||LA12_207=='_'||(LA12_207>='a' && LA12_207<='z')) ) {
                                alt12=72;
                            }
                            else {
                                alt12=53;}
                        }
                        else {
                            alt12=72;}
                    }
                    else {
                        alt12=72;}
                    }
                    break;
                case 'p':
                    {
                    int LA12_104 = input.LA(4);

                    if ( (LA12_104=='l') ) {
                        int LA12_155 = input.LA(5);

                        if ( (LA12_155=='e') ) {
                            int LA12_208 = input.LA(6);

                            if ( (LA12_208=='m') ) {
                                int LA12_257 = input.LA(7);

                                if ( (LA12_257=='e') ) {
                                    int LA12_298 = input.LA(8);

                                    if ( (LA12_298=='n') ) {
                                        int LA12_334 = input.LA(9);

                                        if ( (LA12_334=='t') ) {
                                            int LA12_365 = input.LA(10);

                                            if ( (LA12_365=='e') ) {
                                                int LA12_381 = input.LA(11);

                                                if ( (LA12_381=='d') ) {
                                                    int LA12_391 = input.LA(12);

                                                    if ( (LA12_391=='B') ) {
                                                        int LA12_399 = input.LA(13);

                                                        if ( (LA12_399=='y') ) {
                                                            int LA12_405 = input.LA(14);

                                                            if ( ((LA12_405>='0' && LA12_405<='9')||(LA12_405>='A' && LA12_405<='Z')||LA12_405=='_'||(LA12_405>='a' && LA12_405<='z')) ) {
                                                                alt12=72;
                                                            }
                                                            else {
                                                                alt12=49;}
                                                        }
                                                        else {
                                                            alt12=72;}
                                                    }
                                                    else {
                                                        alt12=72;}
                                                }
                                                else {
                                                    alt12=72;}
                                            }
                                            else {
                                                alt12=72;}
                                        }
                                        else {
                                            alt12=72;}
                                    }
                                    else {
                                        alt12=72;}
                                }
                                else {
                                    alt12=72;}
                            }
                            else {
                                alt12=72;}
                        }
                        else {
                            alt12=72;}
                    }
                    else {
                        alt12=72;}
                    }
                    break;
                default:
                    alt12=72;}

                }
                break;
            default:
                alt12=72;}

        }
        else if ( (LA12_0=='t') ) {
            switch ( input.LA(2) ) {
            case 'e':
                {
                int LA12_49 = input.LA(3);

                if ( (LA12_49=='x') ) {
                    int LA12_105 = input.LA(4);

                    if ( (LA12_105=='t') ) {
                        int LA12_156 = input.LA(5);

                        if ( ((LA12_156>='0' && LA12_156<='9')||(LA12_156>='A' && LA12_156<='Z')||LA12_156=='_'||(LA12_156>='a' && LA12_156<='z')) ) {
                            alt12=72;
                        }
                        else {
                            alt12=59;}
                    }
                    else {
                        alt12=72;}
                }
                else {
                    alt12=72;}
                }
                break;
            case 'r':
                {
                int LA12_50 = input.LA(3);

                if ( (LA12_50=='i') ) {
                    int LA12_106 = input.LA(4);

                    if ( (LA12_106=='g') ) {
                        int LA12_157 = input.LA(5);

                        if ( (LA12_157=='g') ) {
                            int LA12_210 = input.LA(6);

                            if ( (LA12_210=='e') ) {
                                int LA12_258 = input.LA(7);

                                if ( (LA12_258=='r') ) {
                                    int LA12_299 = input.LA(8);

                                    if ( (LA12_299=='s') ) {
                                        int LA12_335 = input.LA(9);

                                        if ( ((LA12_335>='0' && LA12_335<='9')||(LA12_335>='A' && LA12_335<='Z')||LA12_335=='_'||(LA12_335>='a' && LA12_335<='z')) ) {
                                            alt12=72;
                                        }
                                        else {
                                            alt12=5;}
                                    }
                                    else {
                                        alt12=72;}
                                }
                                else {
                                    alt12=72;}
                            }
                            else {
                                alt12=72;}
                        }
                        else {
                            alt12=72;}
                    }
                    else {
                        alt12=72;}
                }
                else {
                    alt12=72;}
                }
                break;
            case 'i':
                {
                int LA12_51 = input.LA(3);

                if ( (LA12_51=='t') ) {
                    int LA12_107 = input.LA(4);

                    if ( (LA12_107=='l') ) {
                        int LA12_158 = input.LA(5);

                        if ( (LA12_158=='e') ) {
                            int LA12_211 = input.LA(6);

                            if ( ((LA12_211>='0' && LA12_211<='9')||(LA12_211>='A' && LA12_211<='Z')||LA12_211=='_'||(LA12_211>='a' && LA12_211<='z')) ) {
                                alt12=72;
                            }
                            else {
                                alt12=24;}
                        }
                        else {
                            alt12=72;}
                    }
                    else {
                        alt12=72;}
                }
                else {
                    alt12=72;}
                }
                break;
            case 'a':
                {
                int LA12_52 = input.LA(3);

                if ( (LA12_52=='b') ) {
                    switch ( input.LA(4) ) {
                    case 'b':
                        {
                        int LA12_159 = input.LA(5);

                        if ( (LA12_159=='a') ) {
                            int LA12_212 = input.LA(6);

                            if ( (LA12_212=='r') ) {
                                int LA12_260 = input.LA(7);

                                if ( (LA12_260=='A') ) {
                                    int LA12_300 = input.LA(8);

                                    if ( (LA12_300=='p') ) {
                                        int LA12_336 = input.LA(9);

                                        if ( (LA12_336=='p') ) {
                                            int LA12_367 = input.LA(10);

                                            if ( ((LA12_367>='0' && LA12_367<='9')||(LA12_367>='A' && LA12_367<='Z')||LA12_367=='_'||(LA12_367>='a' && LA12_367<='z')) ) {
                                                alt12=72;
                                            }
                                            else {
                                                alt12=18;}
                                        }
                                        else {
                                            alt12=72;}
                                    }
                                    else {
                                        alt12=72;}
                                }
                                else {
                                    alt12=72;}
                            }
                            else {
                                alt12=72;}
                        }
                        else {
                            alt12=72;}
                        }
                        break;
                    case 'l':
                        {
                        int LA12_160 = input.LA(5);

                        if ( (LA12_160=='e') ) {
                            int LA12_213 = input.LA(6);

                            if ( (LA12_213=='v') ) {
                                int LA12_261 = input.LA(7);

                                if ( (LA12_261=='i') ) {
                                    int LA12_301 = input.LA(8);

                                    if ( (LA12_301=='e') ) {
                                        int LA12_337 = input.LA(9);

                                        if ( (LA12_337=='w') ) {
                                            int LA12_368 = input.LA(10);

                                            if ( ((LA12_368>='0' && LA12_368<='9')||(LA12_368>='A' && LA12_368<='Z')||LA12_368=='_'||(LA12_368>='a' && LA12_368<='z')) ) {
                                                alt12=72;
                                            }
                                            else {
                                                alt12=43;}
                                        }
                                        else {
                                            alt12=72;}
                                    }
                                    else {
                                        alt12=72;}
                                }
                                else {
                                    alt12=72;}
                            }
                            else {
                                alt12=72;}
                        }
                        else {
                            alt12=72;}
                        }
                        break;
                    default:
                        alt12=72;}

                }
                else {
                    alt12=72;}
                }
                break;
            case 'y':
                {
                int LA12_53 = input.LA(3);

                if ( (LA12_53=='p') ) {
                    int LA12_109 = input.LA(4);

                    if ( (LA12_109=='e') ) {
                        int LA12_161 = input.LA(5);

                        if ( ((LA12_161>='0' && LA12_161<='9')||(LA12_161>='A' && LA12_161<='Z')||LA12_161=='_'||(LA12_161>='a' && LA12_161<='z')) ) {
                            alt12=72;
                        }
                        else {
                            alt12=30;}
                    }
                    else {
                        alt12=72;}
                }
                else {
                    alt12=72;}
                }
                break;
            default:
                alt12=72;}

        }
        else if ( (LA12_0==',') ) {
            alt12=6;
        }
        else if ( (LA12_0=='}') ) {
            alt12=7;
        }
        else if ( (LA12_0=='[') ) {
            int LA12_8 = input.LA(2);

            if ( (LA12_8==']') ) {
                alt12=8;
            }
            else {
                alt12=15;}
        }
        else if ( (LA12_0=='.') ) {
            alt12=9;
        }
        else if ( (LA12_0=='s') ) {
            switch ( input.LA(2) ) {
            case 'p':
                {
                int LA12_59 = input.LA(3);

                if ( (LA12_59=='l') ) {
                    switch ( input.LA(4) ) {
                    case 'i':
                        {
                        int LA12_162 = input.LA(5);

                        if ( (LA12_162=='t') ) {
                            int LA12_215 = input.LA(6);

                            if ( (LA12_215=='(') ) {
                                alt12=17;
                            }
                            else {
                                alt12=72;}
                        }
                        else {
                            alt12=72;}
                        }
                        break;
                    case 'a':
                        {
                        int LA12_163 = input.LA(5);

                        if ( (LA12_163=='s') ) {
                            int LA12_216 = input.LA(6);

                            if ( (LA12_216=='h') ) {
                                int LA12_263 = input.LA(7);

                                if ( ((LA12_263>='0' && LA12_263<='9')||(LA12_263>='A' && LA12_263<='Z')||LA12_263=='_'||(LA12_263>='a' && LA12_263<='z')) ) {
                                    alt12=72;
                                }
                                else {
                                    alt12=21;}
                            }
                            else {
                                alt12=72;}
                        }
                        else {
                            alt12=72;}
                        }
                        break;
                    default:
                        alt12=72;}

                }
                else {
                    alt12=72;}
                }
                break;
            case 'e':
                {
                switch ( input.LA(3) ) {
                case 'c':
                    {
                    int LA12_111 = input.LA(4);

                    if ( (LA12_111=='t') ) {
                        int LA12_164 = input.LA(5);

                        if ( (LA12_164=='i') ) {
                            int LA12_217 = input.LA(6);

                            if ( (LA12_217=='o') ) {
                                int LA12_264 = input.LA(7);

                                if ( (LA12_264=='n') ) {
                                    switch ( input.LA(8) ) {
                                    case '.':
                                        {
                                        alt12=10;
                                        }
                                        break;
                                    case '0':
                                    case '1':
                                    case '2':
                                    case '3':
                                    case '4':
                                    case '5':
                                    case '6':
                                    case '7':
                                    case '8':
                                    case '9':
                                    case 'A':
                                    case 'B':
                                    case 'C':
                                    case 'D':
                                    case 'E':
                                    case 'F':
                                    case 'G':
                                    case 'H':
                                    case 'I':
                                    case 'J':
                                    case 'K':
                                    case 'L':
                                    case 'M':
                                    case 'N':
                                    case 'O':
                                    case 'P':
                                    case 'Q':
                                    case 'R':
                                    case 'S':
                                    case 'T':
                                    case 'U':
                                    case 'V':
                                    case 'W':
                                    case 'X':
                                    case 'Y':
                                    case 'Z':
                                    case '_':
                                    case 'a':
                                    case 'b':
                                    case 'c':
                                    case 'd':
                                    case 'e':
                                    case 'f':
                                    case 'g':
                                    case 'h':
                                    case 'i':
                                    case 'j':
                                    case 'k':
                                    case 'l':
                                    case 'm':
                                    case 'n':
                                    case 'o':
                                    case 'p':
                                    case 'q':
                                    case 'r':
                                    case 's':
                                    case 't':
                                    case 'u':
                                    case 'v':
                                    case 'w':
                                    case 'x':
                                    case 'y':
                                    case 'z':
                                        {
                                        alt12=72;
                                        }
                                        break;
                                    default:
                                        alt12=54;}

                                }
                                else {
                                    alt12=72;}
                            }
                            else {
                                alt12=72;}
                        }
                        else {
                            alt12=72;}
                    }
                    else {
                        alt12=72;}
                    }
                    break;
                case 'l':
                    {
                    int LA12_112 = input.LA(4);

                    if ( (LA12_112=='e') ) {
                        int LA12_165 = input.LA(5);

                        if ( (LA12_165=='c') ) {
                            int LA12_218 = input.LA(6);

                            if ( (LA12_218=='t') ) {
                                int LA12_265 = input.LA(7);

                                if ( (LA12_265=='s') ) {
                                    int LA12_304 = input.LA(8);

                                    if ( ((LA12_304>='0' && LA12_304<='9')||(LA12_304>='A' && LA12_304<='Z')||LA12_304=='_'||(LA12_304>='a' && LA12_304<='z')) ) {
                                        alt12=72;
                                    }
                                    else {
                                        alt12=42;}
                                }
                                else {
                                    alt12=72;}
                            }
                            else {
                                alt12=72;}
                        }
                        else {
                            alt12=72;}
                    }
                    else {
                        alt12=72;}
                    }
                    break;
                default:
                    alt12=72;}

                }
                break;
            case 'u':
                {
                int LA12_61 = input.LA(3);

                if ( (LA12_61=='b') ) {
                    int LA12_113 = input.LA(4);

                    if ( (LA12_113=='t') ) {
                        int LA12_166 = input.LA(5);

                        if ( (LA12_166=='i') ) {
                            int LA12_219 = input.LA(6);

                            if ( (LA12_219=='t') ) {
                                int LA12_266 = input.LA(7);

                                if ( (LA12_266=='l') ) {
                                    int LA12_305 = input.LA(8);

                                    if ( (LA12_305=='e') ) {
                                        int LA12_341 = input.LA(9);

                                        if ( ((LA12_341>='0' && LA12_341<='9')||(LA12_341>='A' && LA12_341<='Z')||LA12_341=='_'||(LA12_341>='a' && LA12_341<='z')) ) {
                                            alt12=72;
                                        }
                                        else {
                                            alt12=51;}
                                    }
                                    else {
                                        alt12=72;}
                                }
                                else {
                                    alt12=72;}
                            }
                            else {
                                alt12=72;}
                        }
                        else {
                            alt12=72;}
                    }
                    else {
                        alt12=72;}
                }
                else {
                    alt12=72;}
                }
                break;
            default:
                alt12=72;}

        }
        else if ( (LA12_0=='(') ) {
            alt12=11;
        }
        else if ( (LA12_0==')') ) {
            alt12=12;
        }
        else if ( (LA12_0=='r') ) {
            switch ( input.LA(2) ) {
            case 'e':
                {
                switch ( input.LA(3) ) {
                case 's':
                    {
                    int LA12_114 = input.LA(4);

                    if ( (LA12_114=='o') ) {
                        int LA12_167 = input.LA(5);

                        if ( (LA12_167=='l') ) {
                            int LA12_220 = input.LA(6);

                            if ( (LA12_220=='v') ) {
                                int LA12_267 = input.LA(7);

                                if ( (LA12_267=='e') ) {
                                    int LA12_306 = input.LA(8);

                                    if ( (LA12_306=='s') ) {
                                        int LA12_342 = input.LA(9);

                                        if ( ((LA12_342>='0' && LA12_342<='9')||(LA12_342>='A' && LA12_342<='Z')||LA12_342=='_'||(LA12_342>='a' && LA12_342<='z')) ) {
                                            alt12=72;
                                        }
                                        else {
                                            alt12=37;}
                                    }
                                    else {
                                        alt12=72;}
                                }
                                else {
                                    alt12=72;}
                            }
                            else {
                                alt12=72;}
                        }
                        else {
                            alt12=72;}
                    }
                    else {
                        alt12=72;}
                    }
                    break;
                case 't':
                    {
                    int LA12_115 = input.LA(4);

                    if ( (LA12_115=='u') ) {
                        int LA12_168 = input.LA(5);

                        if ( (LA12_168=='r') ) {
                            int LA12_221 = input.LA(6);

                            if ( (LA12_221=='n') ) {
                                int LA12_268 = input.LA(7);

                                if ( (LA12_268=='s') ) {
                                    int LA12_307 = input.LA(8);

                                    if ( ((LA12_307>='0' && LA12_307<='9')||(LA12_307>='A' && LA12_307<='Z')||LA12_307=='_'||(LA12_307>='a' && LA12_307<='z')) ) {
                                        alt12=72;
                                    }
                                    else {
                                        alt12=36;}
                                }
                                else {
                                    alt12=72;}
                            }
                            else {
                                alt12=72;}
                        }
                        else {
                            alt12=72;}
                    }
                    else {
                        alt12=72;}
                    }
                    break;
                case 'p':
                    {
                    int LA12_116 = input.LA(4);

                    if ( (LA12_116=='l') ) {
                        int LA12_169 = input.LA(5);

                        if ( (LA12_169=='a') ) {
                            int LA12_222 = input.LA(6);

                            if ( (LA12_222=='c') ) {
                                int LA12_269 = input.LA(7);

                                if ( (LA12_269=='e') ) {
                                    int LA12_308 = input.LA(8);

                                    if ( (LA12_308=='(') ) {
                                        alt12=13;
                                    }
                                    else {
                                        alt12=72;}
                                }
                                else {
                                    alt12=72;}
                            }
                            else {
                                alt12=72;}
                        }
                        else {
                            alt12=72;}
                    }
                    else {
                        alt12=72;}
                    }
                    break;
                default:
                    alt12=72;}

                }
                break;
            case 'i':
                {
                int LA12_65 = input.LA(3);

                if ( (LA12_65=='g') ) {
                    int LA12_117 = input.LA(4);

                    if ( (LA12_117=='h') ) {
                        int LA12_170 = input.LA(5);

                        if ( (LA12_170=='t') ) {
                            int LA12_223 = input.LA(6);

                            if ( ((LA12_223>='0' && LA12_223<='9')||(LA12_223>='A' && LA12_223<='Z')||LA12_223=='_'||(LA12_223>='a' && LA12_223<='z')) ) {
                                alt12=72;
                            }
                            else {
                                alt12=71;}
                        }
                        else {
                            alt12=72;}
                    }
                    else {
                        alt12=72;}
                }
                else {
                    alt12=72;}
                }
                break;
            default:
                alt12=72;}

        }
        else if ( (LA12_0=='u') ) {
            int LA12_14 = input.LA(2);

            if ( (LA12_14=='r') ) {
                int LA12_66 = input.LA(3);

                if ( (LA12_66=='l') ) {
                    int LA12_118 = input.LA(4);

                    if ( (LA12_118=='c') ) {
                        int LA12_171 = input.LA(5);

                        if ( (LA12_171=='o') ) {
                            int LA12_224 = input.LA(6);

                            if ( (LA12_224=='n') ) {
                                int LA12_271 = input.LA(7);

                                if ( (LA12_271=='f') ) {
                                    int LA12_309 = input.LA(8);

                                    if ( (LA12_309=='o') ) {
                                        int LA12_345 = input.LA(9);

                                        if ( (LA12_345=='r') ) {
                                            int LA12_371 = input.LA(10);

                                            if ( (LA12_371=='m') ) {
                                                int LA12_384 = input.LA(11);

                                                if ( (LA12_384=='(') ) {
                                                    alt12=14;
                                                }
                                                else {
                                                    alt12=72;}
                                            }
                                            else {
                                                alt12=72;}
                                        }
                                        else {
                                            alt12=72;}
                                    }
                                    else {
                                        alt12=72;}
                                }
                                else {
                                    alt12=72;}
                            }
                            else {
                                alt12=72;}
                        }
                        else {
                            alt12=72;}
                    }
                    else {
                        alt12=72;}
                }
                else {
                    alt12=72;}
            }
            else {
                alt12=72;}
        }
        else if ( (LA12_0==']') ) {
            alt12=16;
        }
        else if ( (LA12_0=='a') ) {
            switch ( input.LA(2) ) {
            case 's':
                {
                int LA12_68 = input.LA(3);

                if ( ((LA12_68>='0' && LA12_68<='9')||(LA12_68>='A' && LA12_68<='Z')||LA12_68=='_'||(LA12_68>='a' && LA12_68<='z')) ) {
                    alt12=72;
                }
                else {
                    alt12=61;}
                }
                break;
            case 'p':
                {
                int LA12_69 = input.LA(3);

                if ( (LA12_69=='p') ) {
                    switch ( input.LA(4) ) {
                    case 'i':
                        {
                        int LA12_172 = input.LA(5);

                        if ( (LA12_172=='c') ) {
                            int LA12_225 = input.LA(6);

                            if ( (LA12_225=='o') ) {
                                int LA12_272 = input.LA(7);

                                if ( (LA12_272=='n') ) {
                                    int LA12_310 = input.LA(8);

                                    if ( ((LA12_310>='0' && LA12_310<='9')||(LA12_310>='A' && LA12_310<='Z')||LA12_310=='_'||(LA12_310>='a' && LA12_310<='z')) ) {
                                        alt12=72;
                                    }
                                    else {
                                        alt12=20;}
                                }
                                else {
                                    alt12=72;}
                            }
                            else {
                                alt12=72;}
                        }
                        else {
                            alt12=72;}
                        }
                        break;
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                    case 'A':
                    case 'B':
                    case 'C':
                    case 'D':
                    case 'E':
                    case 'F':
                    case 'G':
                    case 'H':
                    case 'I':
                    case 'J':
                    case 'K':
                    case 'L':
                    case 'M':
                    case 'N':
                    case 'O':
                    case 'P':
                    case 'Q':
                    case 'R':
                    case 'S':
                    case 'T':
                    case 'U':
                    case 'V':
                    case 'W':
                    case 'X':
                    case 'Y':
                    case 'Z':
                    case '_':
                    case 'a':
                    case 'b':
                    case 'c':
                    case 'd':
                    case 'e':
                    case 'f':
                    case 'g':
                    case 'h':
                    case 'j':
                    case 'k':
                    case 'l':
                    case 'm':
                    case 'n':
                    case 'o':
                    case 'p':
                    case 'q':
                    case 'r':
                    case 's':
                    case 't':
                    case 'u':
                    case 'v':
                    case 'w':
                    case 'x':
                    case 'y':
                    case 'z':
                        {
                        alt12=72;
                        }
                        break;
                    default:
                        alt12=19;}

                }
                else {
                    alt12=72;}
                }
                break;
            case 'c':
                {
                int LA12_70 = input.LA(3);

                if ( (LA12_70=='t') ) {
                    int LA12_121 = input.LA(4);

                    if ( (LA12_121=='i') ) {
                        int LA12_174 = input.LA(5);

                        if ( (LA12_174=='o') ) {
                            int LA12_226 = input.LA(6);

                            if ( (LA12_226=='n') ) {
                                int LA12_273 = input.LA(7);

                                if ( ((LA12_273>='0' && LA12_273<='9')||(LA12_273>='A' && LA12_273<='Z')||LA12_273=='_'||(LA12_273>='a' && LA12_273<='z')) ) {
                                    alt12=72;
                                }
                                else {
                                    alt12=45;}
                            }
                            else {
                                alt12=72;}
                        }
                        else {
                            alt12=72;}
                    }
                    else {
                        alt12=72;}
                }
                else {
                    alt12=72;}
                }
                break;
            default:
                alt12=72;}

        }
        else if ( (LA12_0=='m') ) {
            int LA12_17 = input.LA(2);

            if ( (LA12_17=='a') ) {
                switch ( input.LA(3) ) {
                case 'i':
                    {
                    int LA12_122 = input.LA(4);

                    if ( (LA12_122=='n') ) {
                        int LA12_175 = input.LA(5);

                        if ( (LA12_175=='v') ) {
                            int LA12_227 = input.LA(6);

                            if ( (LA12_227=='i') ) {
                                int LA12_274 = input.LA(7);

                                if ( (LA12_274=='e') ) {
                                    int LA12_312 = input.LA(8);

                                    if ( (LA12_312=='w') ) {
                                        int LA12_347 = input.LA(9);

                                        if ( ((LA12_347>='0' && LA12_347<='9')||(LA12_347>='A' && LA12_347<='Z')||LA12_347=='_'||(LA12_347>='a' && LA12_347<='z')) ) {
                                            alt12=72;
                                        }
                                        else {
                                            alt12=22;}
                                    }
                                    else {
                                        alt12=72;}
                                }
                                else {
                                    alt12=72;}
                            }
                            else {
                                alt12=72;}
                        }
                        else {
                            alt12=72;}
                    }
                    else {
                        alt12=72;}
                    }
                    break;
                case 'p':
                    {
                    int LA12_123 = input.LA(4);

                    if ( (LA12_123=='s') ) {
                        int LA12_176 = input.LA(5);

                        if ( (LA12_176=='T') ) {
                            int LA12_228 = input.LA(6);

                            if ( (LA12_228=='o') ) {
                                int LA12_275 = input.LA(7);

                                if ( ((LA12_275>='0' && LA12_275<='9')||(LA12_275>='A' && LA12_275<='Z')||LA12_275=='_'||(LA12_275>='a' && LA12_275<='z')) ) {
                                    alt12=72;
                                }
                                else {
                                    alt12=31;}
                            }
                            else {
                                alt12=72;}
                        }
                        else {
                            alt12=72;}
                    }
                    else {
                        alt12=72;}
                    }
                    break;
                default:
                    alt12=72;}

            }
            else {
                alt12=72;}
        }
        else if ( (LA12_0=='b') ) {
            int LA12_18 = input.LA(2);

            if ( (LA12_18=='u') ) {
                int LA12_72 = input.LA(3);

                if ( (LA12_72=='t') ) {
                    int LA12_124 = input.LA(4);

                    if ( (LA12_124=='t') ) {
                        int LA12_177 = input.LA(5);

                        if ( (LA12_177=='o') ) {
                            int LA12_229 = input.LA(6);

                            if ( (LA12_229=='n') ) {
                                int LA12_276 = input.LA(7);

                                if ( ((LA12_276>='0' && LA12_276<='9')||(LA12_276>='A' && LA12_276<='Z')||LA12_276=='_'||(LA12_276>='a' && LA12_276<='z')) ) {
                                    alt12=72;
                                }
                                else {
                                    alt12=23;}
                            }
                            else {
                                alt12=72;}
                        }
                        else {
                            alt12=72;}
                    }
                    else {
                        alt12=72;}
                }
                else {
                    alt12=72;}
            }
            else {
                alt12=72;}
        }
        else if ( (LA12_0=='v') ) {
            int LA12_19 = input.LA(2);

            if ( (LA12_19=='i') ) {
                int LA12_73 = input.LA(3);

                if ( (LA12_73=='e') ) {
                    int LA12_125 = input.LA(4);

                    if ( (LA12_125=='w') ) {
                        int LA12_178 = input.LA(5);

                        if ( ((LA12_178>='0' && LA12_178<='9')||(LA12_178>='A' && LA12_178<='Z')||LA12_178=='_'||(LA12_178>='a' && LA12_178<='z')) ) {
                            alt12=72;
                        }
                        else {
                            alt12=25;}
                    }
                    else {
                        alt12=72;}
                }
                else {
                    alt12=72;}
            }
            else {
                alt12=72;}
        }
        else if ( (LA12_0=='h') ) {
            switch ( input.LA(2) ) {
            case 'a':
                {
                int LA12_74 = input.LA(3);

                if ( (LA12_74=='n') ) {
                    int LA12_126 = input.LA(4);

                    if ( (LA12_126=='d') ) {
                        int LA12_179 = input.LA(5);

                        if ( (LA12_179=='l') ) {
                            int LA12_231 = input.LA(6);

                            if ( (LA12_231=='e') ) {
                                int LA12_277 = input.LA(7);

                                if ( (LA12_277=='r') ) {
                                    int LA12_315 = input.LA(8);

                                    if ( ((LA12_315>='0' && LA12_315<='9')||(LA12_315>='A' && LA12_315<='Z')||LA12_315=='_'||(LA12_315>='a' && LA12_315<='z')) ) {
                                        alt12=72;
                                    }
                                    else {
                                        alt12=26;}
                                }
                                else {
                                    alt12=72;}
                            }
                            else {
                                alt12=72;}
                        }
                        else {
                            alt12=72;}
                    }
                    else {
                        alt12=72;}
                }
                else {
                    alt12=72;}
                }
                break;
            case 'e':
                {
                int LA12_75 = input.LA(3);

                if ( (LA12_75=='a') ) {
                    int LA12_127 = input.LA(4);

                    if ( (LA12_127=='d') ) {
                        int LA12_180 = input.LA(5);

                        if ( (LA12_180=='e') ) {
                            int LA12_232 = input.LA(6);

                            if ( (LA12_232=='r') ) {
                                int LA12_278 = input.LA(7);

                                if ( ((LA12_278>='0' && LA12_278<='9')||(LA12_278>='A' && LA12_278<='Z')||LA12_278=='_'||(LA12_278>='a' && LA12_278<='z')) ) {
                                    alt12=72;
                                }
                                else {
                                    alt12=50;}
                            }
                            else {
                                alt12=72;}
                        }
                        else {
                            alt12=72;}
                    }
                    else {
                        alt12=72;}
                }
                else {
                    alt12=72;}
                }
                break;
            default:
                alt12=72;}

        }
        else if ( (LA12_0=='c') ) {
            switch ( input.LA(2) ) {
            case 'e':
                {
                switch ( input.LA(3) ) {
                case 'l':
                    {
                    int LA12_128 = input.LA(4);

                    if ( (LA12_128=='l') ) {
                        int LA12_181 = input.LA(5);

                        if ( ((LA12_181>='0' && LA12_181<='9')||(LA12_181>='A' && LA12_181<='Z')||LA12_181=='_'||(LA12_181>='a' && LA12_181<='z')) ) {
                            alt12=72;
                        }
                        else {
                            alt12=57;}
                    }
                    else {
                        alt12=72;}
                    }
                    break;
                case 'n':
                    {
                    int LA12_129 = input.LA(4);

                    if ( (LA12_129=='t') ) {
                        int LA12_182 = input.LA(5);

                        if ( (LA12_182=='e') ) {
                            int LA12_234 = input.LA(6);

                            if ( (LA12_234=='r') ) {
                                int LA12_279 = input.LA(7);

                                if ( ((LA12_279>='0' && LA12_279<='9')||(LA12_279>='A' && LA12_279<='Z')||LA12_279=='_'||(LA12_279>='a' && LA12_279<='z')) ) {
                                    alt12=72;
                                }
                                else {
                                    alt12=70;}
                            }
                            else {
                                alt12=72;}
                        }
                        else {
                            alt12=72;}
                    }
                    else {
                        alt12=72;}
                    }
                    break;
                default:
                    alt12=72;}

                }
                break;
            case 'o':
                {
                int LA12_77 = input.LA(3);

                if ( (LA12_77=='n') ) {
                    switch ( input.LA(4) ) {
                    case 't':
                        {
                        int LA12_183 = input.LA(5);

                        if ( (LA12_183=='e') ) {
                            int LA12_235 = input.LA(6);

                            if ( (LA12_235=='n') ) {
                                int LA12_280 = input.LA(7);

                                if ( (LA12_280=='t') ) {
                                    switch ( input.LA(8) ) {
                                    case 'p':
                                        {
                                        int LA12_349 = input.LA(9);

                                        if ( (LA12_349=='r') ) {
                                            int LA12_373 = input.LA(10);

                                            if ( (LA12_373=='o') ) {
                                                int LA12_385 = input.LA(11);

                                                if ( (LA12_385=='v') ) {
                                                    int LA12_393 = input.LA(12);

                                                    if ( (LA12_393=='i') ) {
                                                        int LA12_400 = input.LA(13);

                                                        if ( (LA12_400=='d') ) {
                                                            int LA12_406 = input.LA(14);

                                                            if ( (LA12_406=='e') ) {
                                                                int LA12_411 = input.LA(15);

                                                                if ( (LA12_411=='r') ) {
                                                                    int LA12_414 = input.LA(16);

                                                                    if ( ((LA12_414>='0' && LA12_414<='9')||(LA12_414>='A' && LA12_414<='Z')||LA12_414=='_'||(LA12_414>='a' && LA12_414<='z')) ) {
                                                                        alt12=72;
                                                                    }
                                                                    else {
                                                                        alt12=35;}
                                                                }
                                                                else {
                                                                    alt12=72;}
                                                            }
                                                            else {
                                                                alt12=72;}
                                                        }
                                                        else {
                                                            alt12=72;}
                                                    }
                                                    else {
                                                        alt12=72;}
                                                }
                                                else {
                                                    alt12=72;}
                                            }
                                            else {
                                                alt12=72;}
                                        }
                                        else {
                                            alt12=72;}
                                        }
                                        break;
                                    case '0':
                                    case '1':
                                    case '2':
                                    case '3':
                                    case '4':
                                    case '5':
                                    case '6':
                                    case '7':
                                    case '8':
                                    case '9':
                                    case 'A':
                                    case 'B':
                                    case 'C':
                                    case 'D':
                                    case 'E':
                                    case 'F':
                                    case 'G':
                                    case 'H':
                                    case 'I':
                                    case 'J':
                                    case 'K':
                                    case 'L':
                                    case 'M':
                                    case 'N':
                                    case 'O':
                                    case 'P':
                                    case 'Q':
                                    case 'R':
                                    case 'S':
                                    case 'T':
                                    case 'U':
                                    case 'V':
                                    case 'W':
                                    case 'X':
                                    case 'Y':
                                    case 'Z':
                                    case '_':
                                    case 'a':
                                    case 'b':
                                    case 'c':
                                    case 'd':
                                    case 'e':
                                    case 'f':
                                    case 'g':
                                    case 'h':
                                    case 'i':
                                    case 'j':
                                    case 'k':
                                    case 'l':
                                    case 'm':
                                    case 'n':
                                    case 'o':
                                    case 'q':
                                    case 'r':
                                    case 's':
                                    case 't':
                                    case 'u':
                                    case 'v':
                                    case 'w':
                                    case 'x':
                                    case 'y':
                                    case 'z':
                                        {
                                        alt12=72;
                                        }
                                        break;
                                    default:
                                        alt12=56;}

                                }
                                else {
                                    alt12=72;}
                            }
                            else {
                                alt12=72;}
                        }
                        else {
                            alt12=72;}
                        }
                        break;
                    case 's':
                        {
                        int LA12_184 = input.LA(5);

                        if ( (LA12_184=='t') ) {
                            int LA12_236 = input.LA(6);

                            if ( ((LA12_236>='0' && LA12_236<='9')||(LA12_236>='A' && LA12_236<='Z')||LA12_236=='_'||(LA12_236>='a' && LA12_236<='z')) ) {
                                alt12=72;
                            }
                            else {
                                alt12=27;}
                        }
                        else {
                            alt12=72;}
                        }
                        break;
                    default:
                        alt12=72;}

                }
                else {
                    alt12=72;}
                }
                break;
            case 'u':
                {
                int LA12_78 = input.LA(3);

                if ( (LA12_78=='s') ) {
                    int LA12_131 = input.LA(4);

                    if ( (LA12_131=='t') ) {
                        int LA12_185 = input.LA(5);

                        if ( (LA12_185=='o') ) {
                            int LA12_237 = input.LA(6);

                            if ( (LA12_237=='m') ) {
                                int LA12_282 = input.LA(7);

                                if ( (LA12_282=='v') ) {
                                    int LA12_319 = input.LA(8);

                                    if ( (LA12_319=='i') ) {
                                        int LA12_351 = input.LA(9);

                                        if ( (LA12_351=='e') ) {
                                            int LA12_374 = input.LA(10);

                                            if ( (LA12_374=='w') ) {
                                                int LA12_386 = input.LA(11);

                                                if ( ((LA12_386>='0' && LA12_386<='9')||(LA12_386>='A' && LA12_386<='Z')||LA12_386=='_'||(LA12_386>='a' && LA12_386<='z')) ) {
                                                    alt12=72;
                                                }
                                                else {
                                                    alt12=48;}
                                            }
                                            else {
                                                alt12=72;}
                                        }
                                        else {
                                            alt12=72;}
                                    }
                                    else {
                                        alt12=72;}
                                }
                                else {
                                    alt12=72;}
                            }
                            else {
                                alt12=72;}
                        }
                        else {
                            alt12=72;}
                    }
                    else {
                        alt12=72;}
                }
                else {
                    alt12=72;}
                }
                break;
            default:
                alt12=72;}

        }
        else if ( (LA12_0=='d') ) {
            int LA12_22 = input.LA(2);

            if ( (LA12_22=='e') ) {
                switch ( input.LA(3) ) {
                case 't':
                    {
                    int LA12_132 = input.LA(4);

                    if ( (LA12_132=='a') ) {
                        int LA12_186 = input.LA(5);

                        if ( (LA12_186=='i') ) {
                            int LA12_238 = input.LA(6);

                            if ( (LA12_238=='l') ) {
                                int LA12_283 = input.LA(7);

                                if ( (LA12_283=='s') ) {
                                    switch ( input.LA(8) ) {
                                    case 'v':
                                        {
                                        int LA12_352 = input.LA(9);

                                        if ( (LA12_352=='i') ) {
                                            int LA12_375 = input.LA(10);

                                            if ( (LA12_375=='e') ) {
                                                int LA12_387 = input.LA(11);

                                                if ( (LA12_387=='w') ) {
                                                    int LA12_395 = input.LA(12);

                                                    if ( ((LA12_395>='0' && LA12_395<='9')||(LA12_395>='A' && LA12_395<='Z')||LA12_395=='_'||(LA12_395>='a' && LA12_395<='z')) ) {
                                                        alt12=72;
                                                    }
                                                    else {
                                                        alt12=46;}
                                                }
                                                else {
                                                    alt12=72;}
                                            }
                                            else {
                                                alt12=72;}
                                        }
                                        else {
                                            alt12=72;}
                                        }
                                        break;
                                    case '0':
                                    case '1':
                                    case '2':
                                    case '3':
                                    case '4':
                                    case '5':
                                    case '6':
                                    case '7':
                                    case '8':
                                    case '9':
                                    case 'A':
                                    case 'B':
                                    case 'C':
                                    case 'D':
                                    case 'E':
                                    case 'F':
                                    case 'G':
                                    case 'H':
                                    case 'I':
                                    case 'J':
                                    case 'K':
                                    case 'L':
                                    case 'M':
                                    case 'N':
                                    case 'O':
                                    case 'P':
                                    case 'Q':
                                    case 'R':
                                    case 'S':
                                    case 'T':
                                    case 'U':
                                    case 'V':
                                    case 'W':
                                    case 'X':
                                    case 'Y':
                                    case 'Z':
                                    case '_':
                                    case 'a':
                                    case 'b':
                                    case 'c':
                                    case 'd':
                                    case 'e':
                                    case 'f':
                                    case 'g':
                                    case 'h':
                                    case 'i':
                                    case 'j':
                                    case 'k':
                                    case 'l':
                                    case 'm':
                                    case 'n':
                                    case 'o':
                                    case 'p':
                                    case 'q':
                                    case 'r':
                                    case 's':
                                    case 't':
                                    case 'u':
                                    case 'w':
                                    case 'x':
                                    case 'y':
                                    case 'z':
                                        {
                                        alt12=72;
                                        }
                                        break;
                                    default:
                                        alt12=52;}

                                }
                                else {
                                    alt12=72;}
                            }
                            else {
                                alt12=72;}
                        }
                        else {
                            alt12=72;}
                    }
                    else {
                        alt12=72;}
                    }
                    break;
                case '=':
                    {
                    alt12=28;
                    }
                    break;
                case 'l':
                    {
                    int LA12_134 = input.LA(4);

                    if ( (LA12_134=='e') ) {
                        int LA12_187 = input.LA(5);

                        if ( (LA12_187=='g') ) {
                            int LA12_239 = input.LA(6);

                            if ( (LA12_239=='a') ) {
                                int LA12_284 = input.LA(7);

                                if ( (LA12_284=='t') ) {
                                    int LA12_321 = input.LA(8);

                                    if ( (LA12_321=='e') ) {
                                        int LA12_354 = input.LA(9);

                                        if ( ((LA12_354>='0' && LA12_354<='9')||(LA12_354>='A' && LA12_354<='Z')||LA12_354=='_'||(LA12_354>='a' && LA12_354<='z')) ) {
                                            alt12=72;
                                        }
                                        else {
                                            alt12=62;}
                                    }
                                    else {
                                        alt12=72;}
                                }
                                else {
                                    alt12=72;}
                            }
                            else {
                                alt12=72;}
                        }
                        else {
                            alt12=72;}
                    }
                    else {
                        alt12=72;}
                    }
                    break;
                case 'r':
                    {
                    int LA12_135 = input.LA(4);

                    if ( (LA12_135=='i') ) {
                        int LA12_188 = input.LA(5);

                        if ( (LA12_188=='v') ) {
                            int LA12_240 = input.LA(6);

                            if ( (LA12_240=='e') ) {
                                int LA12_285 = input.LA(7);

                                if ( (LA12_285=='d') ) {
                                    int LA12_322 = input.LA(8);

                                    if ( ((LA12_322>='0' && LA12_322<='9')||(LA12_322>='A' && LA12_322<='Z')||LA12_322=='_'||(LA12_322>='a' && LA12_322<='z')) ) {
                                        alt12=72;
                                    }
                                    else {
                                        alt12=34;}
                                }
                                else {
                                    alt12=72;}
                            }
                            else {
                                alt12=72;}
                        }
                        else {
                            alt12=72;}
                    }
                    else {
                        alt12=72;}
                    }
                    break;
                default:
                    alt12=72;}

            }
            else {
                alt12=72;}
        }
        else if ( (LA12_0=='e') ) {
            switch ( input.LA(2) ) {
            case 'n':
                {
                switch ( input.LA(3) ) {
                case 't':
                    {
                    int LA12_136 = input.LA(4);

                    if ( (LA12_136=='i') ) {
                        int LA12_189 = input.LA(5);

                        if ( (LA12_189=='t') ) {
                            int LA12_241 = input.LA(6);

                            if ( (LA12_241=='y') ) {
                                int LA12_286 = input.LA(7);

                                if ( ((LA12_286>='0' && LA12_286<='9')||(LA12_286>='A' && LA12_286<='Z')||LA12_286=='_'||(LA12_286>='a' && LA12_286<='z')) ) {
                                    alt12=72;
                                }
                                else {
                                    alt12=32;}
                            }
                            else {
                                alt12=72;}
                        }
                        else {
                            alt12=72;}
                    }
                    else {
                        alt12=72;}
                    }
                    break;
                case '=':
                    {
                    alt12=29;
                    }
                    break;
                default:
                    alt12=72;}

                }
                break;
            case 'x':
                {
                int LA12_81 = input.LA(3);

                if ( (LA12_81=='t') ) {
                    int LA12_138 = input.LA(4);

                    if ( (LA12_138=='e') ) {
                        int LA12_190 = input.LA(5);

                        if ( (LA12_190=='n') ) {
                            int LA12_242 = input.LA(6);

                            if ( (LA12_242=='d') ) {
                                int LA12_287 = input.LA(7);

                                if ( (LA12_287=='s') ) {
                                    int LA12_324 = input.LA(8);

                                    if ( ((LA12_324>='0' && LA12_324<='9')||(LA12_324>='A' && LA12_324<='Z')||LA12_324=='_'||(LA12_324>='a' && LA12_324<='z')) ) {
                                        alt12=72;
                                    }
                                    else {
                                        alt12=33;}
                                }
                                else {
                                    alt12=72;}
                            }
                            else {
                                alt12=72;}
                        }
                        else {
                            alt12=72;}
                    }
                    else {
                        alt12=72;}
                }
                else {
                    alt12=72;}
                }
                break;
            default:
                alt12=72;}

        }
        else if ( (LA12_0=='f') ) {
            switch ( input.LA(2) ) {
            case 'o':
                {
                int LA12_82 = input.LA(3);

                if ( (LA12_82=='r') ) {
                    switch ( input.LA(4) ) {
                    case 'e':
                        {
                        int LA12_191 = input.LA(5);

                        if ( (LA12_191=='a') ) {
                            int LA12_243 = input.LA(6);

                            if ( (LA12_243=='c') ) {
                                int LA12_288 = input.LA(7);

                                if ( (LA12_288=='h') ) {
                                    int LA12_325 = input.LA(8);

                                    if ( ((LA12_325>='0' && LA12_325<='9')||(LA12_325>='A' && LA12_325<='Z')||LA12_325=='_'||(LA12_325>='a' && LA12_325<='z')) ) {
                                        alt12=72;
                                    }
                                    else {
                                        alt12=58;}
                                }
                                else {
                                    alt12=72;}
                            }
                            else {
                                alt12=72;}
                        }
                        else {
                            alt12=72;}
                        }
                        break;
                    case 'A':
                        {
                        int LA12_192 = input.LA(5);

                        if ( (LA12_192=='l') ) {
                            int LA12_244 = input.LA(6);

                            if ( (LA12_244=='l') ) {
                                int LA12_289 = input.LA(7);

                                if ( (LA12_289=='S') ) {
                                    int LA12_326 = input.LA(8);

                                    if ( (LA12_326=='e') ) {
                                        int LA12_358 = input.LA(9);

                                        if ( (LA12_358=='c') ) {
                                            int LA12_377 = input.LA(10);

                                            if ( (LA12_377=='t') ) {
                                                int LA12_388 = input.LA(11);

                                                if ( (LA12_388=='i') ) {
                                                    int LA12_396 = input.LA(12);

                                                    if ( (LA12_396=='o') ) {
                                                        int LA12_402 = input.LA(13);

                                                        if ( (LA12_402=='n') ) {
                                                            int LA12_407 = input.LA(14);

                                                            if ( (LA12_407=='s') ) {
                                                                int LA12_412 = input.LA(15);

                                                                if ( ((LA12_412>='0' && LA12_412<='9')||(LA12_412>='A' && LA12_412<='Z')||LA12_412=='_'||(LA12_412>='a' && LA12_412<='z')) ) {
                                                                    alt12=72;
                                                                }
                                                                else {
                                                                    alt12=55;}
                                                            }
                                                            else {
                                                                alt12=72;}
                                                        }
                                                        else {
                                                            alt12=72;}
                                                    }
                                                    else {
                                                        alt12=72;}
                                                }
                                                else {
                                                    alt12=72;}
                                            }
                                            else {
                                                alt12=72;}
                                        }
                                        else {
                                            alt12=72;}
                                    }
                                    else {
                                        alt12=72;}
                                }
                                else {
                                    alt12=72;}
                            }
                            else {
                                alt12=72;}
                        }
                        else {
                            alt12=72;}
                        }
                        break;
                    default:
                        alt12=72;}

                }
                else {
                    alt12=72;}
                }
                break;
            case 'e':
                {
                int LA12_83 = input.LA(3);

                if ( (LA12_83=='t') ) {
                    int LA12_140 = input.LA(4);

                    if ( (LA12_140=='c') ) {
                        int LA12_193 = input.LA(5);

                        if ( (LA12_193=='h') ) {
                            int LA12_245 = input.LA(6);

                            if ( (LA12_245=='e') ) {
                                int LA12_290 = input.LA(7);

                                if ( (LA12_290=='s') ) {
                                    int LA12_327 = input.LA(8);

                                    if ( ((LA12_327>='0' && LA12_327<='9')||(LA12_327>='A' && LA12_327<='Z')||LA12_327=='_'||(LA12_327>='a' && LA12_327<='z')) ) {
                                        alt12=72;
                                    }
                                    else {
                                        alt12=38;}
                                }
                                else {
                                    alt12=72;}
                            }
                            else {
                                alt12=72;}
                        }
                        else {
                            alt12=72;}
                    }
                    else {
                        alt12=72;}
                }
                else {
                    alt12=72;}
                }
                break;
            case 'r':
                {
                int LA12_84 = input.LA(3);

                if ( (LA12_84=='o') ) {
                    int LA12_141 = input.LA(4);

                    if ( (LA12_141=='m') ) {
                        int LA12_194 = input.LA(5);

                        if ( ((LA12_194>='0' && LA12_194<='9')||(LA12_194>='A' && LA12_194<='Z')||LA12_194=='_'||(LA12_194>='a' && LA12_194<='z')) ) {
                            alt12=72;
                        }
                        else {
                            alt12=41;}
                    }
                    else {
                        alt12=72;}
                }
                else {
                    alt12=72;}
                }
                break;
            default:
                alt12=72;}

        }
        else if ( (LA12_0=='X') ) {
            int LA12_25 = input.LA(2);

            if ( (LA12_25=='M') ) {
                int LA12_85 = input.LA(3);

                if ( (LA12_85=='L') ) {
                    int LA12_142 = input.LA(4);

                    if ( ((LA12_142>='0' && LA12_142<='9')||(LA12_142>='A' && LA12_142<='Z')||LA12_142=='_'||(LA12_142>='a' && LA12_142<='z')) ) {
                        alt12=72;
                    }
                    else {
                        alt12=39;}
                }
                else {
                    alt12=72;}
            }
            else {
                alt12=72;}
        }
        else if ( (LA12_0=='H') ) {
            int LA12_26 = input.LA(2);

            if ( (LA12_26=='T') ) {
                int LA12_86 = input.LA(3);

                if ( (LA12_86=='M') ) {
                    int LA12_143 = input.LA(4);

                    if ( (LA12_143=='L') ) {
                        int LA12_196 = input.LA(5);

                        if ( ((LA12_196>='0' && LA12_196<='9')||(LA12_196>='A' && LA12_196<='Z')||LA12_196=='_'||(LA12_196>='a' && LA12_196<='z')) ) {
                            alt12=72;
                        }
                        else {
                            alt12=40;}
                    }
                    else {
                        alt12=72;}
                }
                else {
                    alt12=72;}
            }
            else {
                alt12=72;}
        }
        else if ( (LA12_0==':') ) {
            alt12=44;
        }
        else if ( (LA12_0=='w') ) {
            int LA12_28 = input.LA(2);

            if ( (LA12_28=='e') ) {
                int LA12_88 = input.LA(3);

                if ( (LA12_88=='b') ) {
                    int LA12_144 = input.LA(4);

                    if ( (LA12_144=='v') ) {
                        int LA12_197 = input.LA(5);

                        if ( (LA12_197=='i') ) {
                            int LA12_248 = input.LA(6);

                            if ( (LA12_248=='e') ) {
                                int LA12_291 = input.LA(7);

                                if ( (LA12_291=='w') ) {
                                    int LA12_328 = input.LA(8);

                                    if ( ((LA12_328>='0' && LA12_328<='9')||(LA12_328>='A' && LA12_328<='Z')||LA12_328=='_'||(LA12_328>='a' && LA12_328<='z')) ) {
                                        alt12=72;
                                    }
                                    else {
                                        alt12=47;}
                                }
                                else {
                                    alt12=72;}
                            }
                            else {
                                alt12=72;}
                        }
                        else {
                            alt12=72;}
                    }
                    else {
                        alt12=72;}
                }
                else {
                    alt12=72;}
            }
            else {
                alt12=72;}
        }
        else if ( (LA12_0=='q') ) {
            int LA12_29 = input.LA(2);

            if ( (LA12_29=='u') ) {
                int LA12_89 = input.LA(3);

                if ( (LA12_89=='e') ) {
                    int LA12_145 = input.LA(4);

                    if ( (LA12_145=='r') ) {
                        int LA12_198 = input.LA(5);

                        if ( (LA12_198=='y') ) {
                            int LA12_249 = input.LA(6);

                            if ( ((LA12_249>='0' && LA12_249<='9')||(LA12_249>='A' && LA12_249<='Z')||LA12_249=='_'||(LA12_249>='a' && LA12_249<='z')) ) {
                                alt12=72;
                            }
                            else {
                                alt12=60;}
                        }
                        else {
                            alt12=72;}
                    }
                    else {
                        alt12=72;}
                }
                else {
                    alt12=72;}
            }
            else {
                alt12=72;}
        }
        else if ( (LA12_0=='D') ) {
            switch ( input.LA(2) ) {
            case 'o':
                {
                int LA12_90 = input.LA(3);

                if ( (LA12_90=='u') ) {
                    int LA12_146 = input.LA(4);

                    if ( (LA12_146=='b') ) {
                        int LA12_199 = input.LA(5);

                        if ( (LA12_199=='l') ) {
                            int LA12_250 = input.LA(6);

                            if ( (LA12_250=='e') ) {
                                int LA12_293 = input.LA(7);

                                if ( ((LA12_293>='0' && LA12_293<='9')||(LA12_293>='A' && LA12_293<='Z')||LA12_293=='_'||(LA12_293>='a' && LA12_293<='z')) ) {
                                    alt12=72;
                                }
                                else {
                                    alt12=66;}
                            }
                            else {
                                alt12=72;}
                        }
                        else {
                            alt12=72;}
                    }
                    else {
                        alt12=72;}
                }
                else {
                    alt12=72;}
                }
                break;
            case 'e':
                {
                int LA12_91 = input.LA(3);

                if ( (LA12_91=='f') ) {
                    int LA12_147 = input.LA(4);

                    if ( (LA12_147=='a') ) {
                        int LA12_200 = input.LA(5);

                        if ( (LA12_200=='u') ) {
                            int LA12_251 = input.LA(6);

                            if ( (LA12_251=='l') ) {
                                int LA12_294 = input.LA(7);

                                if ( (LA12_294=='t') ) {
                                    switch ( input.LA(8) ) {
                                    case 'W':
                                        {
                                        int LA12_361 = input.LA(9);

                                        if ( (LA12_361=='i') ) {
                                            int LA12_378 = input.LA(10);

                                            if ( (LA12_378=='t') ) {
                                                int LA12_389 = input.LA(11);

                                                if ( (LA12_389=='h') ) {
                                                    int LA12_397 = input.LA(12);

                                                    if ( (LA12_397=='D') ) {
                                                        int LA12_403 = input.LA(13);

                                                        if ( (LA12_403=='i') ) {
                                                            int LA12_408 = input.LA(14);

                                                            if ( (LA12_408=='s') ) {
                                                                int LA12_413 = input.LA(15);

                                                                if ( (LA12_413=='c') ) {
                                                                    int LA12_416 = input.LA(16);

                                                                    if ( (LA12_416=='l') ) {
                                                                        int LA12_418 = input.LA(17);

                                                                        if ( (LA12_418=='o') ) {
                                                                            int LA12_419 = input.LA(18);

                                                                            if ( (LA12_419=='s') ) {
                                                                                int LA12_420 = input.LA(19);

                                                                                if ( (LA12_420=='u') ) {
                                                                                    int LA12_421 = input.LA(20);

                                                                                    if ( (LA12_421=='r') ) {
                                                                                        int LA12_422 = input.LA(21);

                                                                                        if ( (LA12_422=='e') ) {
                                                                                            int LA12_423 = input.LA(22);

                                                                                            if ( ((LA12_423>='0' && LA12_423<='9')||(LA12_423>='A' && LA12_423<='Z')||LA12_423=='_'||(LA12_423>='a' && LA12_423<='z')) ) {
                                                                                                alt12=72;
                                                                                            }
                                                                                            else {
                                                                                                alt12=64;}
                                                                                        }
                                                                                        else {
                                                                                            alt12=72;}
                                                                                    }
                                                                                    else {
                                                                                        alt12=72;}
                                                                                }
                                                                                else {
                                                                                    alt12=72;}
                                                                            }
                                                                            else {
                                                                                alt12=72;}
                                                                        }
                                                                        else {
                                                                            alt12=72;}
                                                                    }
                                                                    else {
                                                                        alt12=72;}
                                                                }
                                                                else {
                                                                    alt12=72;}
                                                            }
                                                            else {
                                                                alt12=72;}
                                                        }
                                                        else {
                                                            alt12=72;}
                                                    }
                                                    else {
                                                        alt12=72;}
                                                }
                                                else {
                                                    alt12=72;}
                                            }
                                            else {
                                                alt12=72;}
                                        }
                                        else {
                                            alt12=72;}
                                        }
                                        break;
                                    case '0':
                                    case '1':
                                    case '2':
                                    case '3':
                                    case '4':
                                    case '5':
                                    case '6':
                                    case '7':
                                    case '8':
                                    case '9':
                                    case 'A':
                                    case 'B':
                                    case 'C':
                                    case 'D':
                                    case 'E':
                                    case 'F':
                                    case 'G':
                                    case 'H':
                                    case 'I':
                                    case 'J':
                                    case 'K':
                                    case 'L':
                                    case 'M':
                                    case 'N':
                                    case 'O':
                                    case 'P':
                                    case 'Q':
                                    case 'R':
                                    case 'S':
                                    case 'T':
                                    case 'U':
                                    case 'V':
                                    case 'X':
                                    case 'Y':
                                    case 'Z':
                                    case '_':
                                    case 'a':
                                    case 'b':
                                    case 'c':
                                    case 'd':
                                    case 'e':
                                    case 'f':
                                    case 'g':
                                    case 'h':
                                    case 'i':
                                    case 'j':
                                    case 'k':
                                    case 'l':
                                    case 'm':
                                    case 'n':
                                    case 'o':
                                    case 'p':
                                    case 'q':
                                    case 'r':
                                    case 's':
                                    case 't':
                                    case 'u':
                                    case 'v':
                                    case 'w':
                                    case 'x':
                                    case 'y':
                                    case 'z':
                                        {
                                        alt12=72;
                                        }
                                        break;
                                    default:
                                        alt12=63;}

                                }
                                else {
                                    alt12=72;}
                            }
                            else {
                                alt12=72;}
                        }
                        else {
                            alt12=72;}
                    }
                    else {
                        alt12=72;}
                }
                else {
                    alt12=72;}
                }
                break;
            default:
                alt12=72;}

        }
        else if ( (LA12_0=='V') ) {
            int LA12_31 = input.LA(2);

            if ( (LA12_31=='a') ) {
                int LA12_92 = input.LA(3);

                if ( (LA12_92=='l') ) {
                    int LA12_148 = input.LA(4);

                    if ( (LA12_148=='u') ) {
                        int LA12_201 = input.LA(5);

                        if ( (LA12_201=='e') ) {
                            int LA12_252 = input.LA(6);

                            if ( (LA12_252=='2') ) {
                                int LA12_295 = input.LA(7);

                                if ( ((LA12_295>='0' && LA12_295<='9')||(LA12_295>='A' && LA12_295<='Z')||LA12_295=='_'||(LA12_295>='a' && LA12_295<='z')) ) {
                                    alt12=72;
                                }
                                else {
                                    alt12=65;}
                            }
                            else {
                                alt12=72;}
                        }
                        else {
                            alt12=72;}
                    }
                    else {
                        alt12=72;}
                }
                else {
                    alt12=72;}
            }
            else {
                alt12=72;}
        }
        else if ( (LA12_0=='S') ) {
            int LA12_32 = input.LA(2);

            if ( (LA12_32=='u') ) {
                int LA12_93 = input.LA(3);

                if ( (LA12_93=='b') ) {
                    int LA12_149 = input.LA(4);

                    if ( (LA12_149=='t') ) {
                        int LA12_202 = input.LA(5);

                        if ( (LA12_202=='i') ) {
                            int LA12_253 = input.LA(6);

                            if ( (LA12_253=='t') ) {
                                int LA12_296 = input.LA(7);

                                if ( (LA12_296=='l') ) {
                                    int LA12_332 = input.LA(8);

                                    if ( (LA12_332=='e') ) {
                                        int LA12_363 = input.LA(9);

                                        if ( ((LA12_363>='0' && LA12_363<='9')||(LA12_363>='A' && LA12_363<='Z')||LA12_363=='_'||(LA12_363>='a' && LA12_363<='z')) ) {
                                            alt12=72;
                                        }
                                        else {
                                            alt12=67;}
                                    }
                                    else {
                                        alt12=72;}
                                }
                                else {
                                    alt12=72;}
                            }
                            else {
                                alt12=72;}
                        }
                        else {
                            alt12=72;}
                    }
                    else {
                        alt12=72;}
                }
                else {
                    alt12=72;}
            }
            else {
                alt12=72;}
        }
        else if ( (LA12_0=='M') ) {
            int LA12_33 = input.LA(2);

            if ( (LA12_33=='a') ) {
                int LA12_94 = input.LA(3);

                if ( (LA12_94=='p') ) {
                    int LA12_150 = input.LA(4);

                    if ( ((LA12_150>='0' && LA12_150<='9')||(LA12_150>='A' && LA12_150<='Z')||LA12_150=='_'||(LA12_150>='a' && LA12_150<='z')) ) {
                        alt12=72;
                    }
                    else {
                        alt12=68;}
                }
                else {
                    alt12=72;}
            }
            else {
                alt12=72;}
        }
        else if ( (LA12_0=='l') ) {
            int LA12_34 = input.LA(2);

            if ( (LA12_34=='e') ) {
                int LA12_95 = input.LA(3);

                if ( (LA12_95=='f') ) {
                    int LA12_151 = input.LA(4);

                    if ( (LA12_151=='t') ) {
                        int LA12_204 = input.LA(5);

                        if ( ((LA12_204>='0' && LA12_204<='9')||(LA12_204>='A' && LA12_204<='Z')||LA12_204=='_'||(LA12_204>='a' && LA12_204<='z')) ) {
                            alt12=72;
                        }
                        else {
                            alt12=69;}
                    }
                    else {
                        alt12=72;}
                }
                else {
                    alt12=72;}
            }
            else {
                alt12=72;}
        }
        else if ( (LA12_0=='^') ) {
            int LA12_35 = input.LA(2);

            if ( ((LA12_35>='A' && LA12_35<='Z')||LA12_35=='_'||(LA12_35>='a' && LA12_35<='z')) ) {
                alt12=72;
            }
            else {
                alt12=78;}
        }
        else if ( ((LA12_0>='A' && LA12_0<='C')||(LA12_0>='E' && LA12_0<='G')||(LA12_0>='I' && LA12_0<='L')||(LA12_0>='N' && LA12_0<='R')||(LA12_0>='T' && LA12_0<='U')||LA12_0=='W'||(LA12_0>='Y' && LA12_0<='Z')||LA12_0=='_'||LA12_0=='g'||(LA12_0>='j' && LA12_0<='k')||(LA12_0>='o' && LA12_0<='p')||(LA12_0>='x' && LA12_0<='z')) ) {
            alt12=72;
        }
        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {
            alt12=73;
        }
        else if ( (LA12_0=='\"') ) {
            int LA12_38 = input.LA(2);

            if ( ((LA12_38>='\u0000' && LA12_38<='\uFFFE')) ) {
                alt12=74;
            }
            else {
                alt12=78;}
        }
        else if ( (LA12_0=='\'') ) {
            int LA12_39 = input.LA(2);

            if ( ((LA12_39>='\u0000' && LA12_39<='\uFFFE')) ) {
                alt12=74;
            }
            else {
                alt12=78;}
        }
        else if ( (LA12_0=='/') ) {
            switch ( input.LA(2) ) {
            case '/':
                {
                alt12=76;
                }
                break;
            case '*':
                {
                alt12=75;
                }
                break;
            default:
                alt12=78;}

        }
        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
            alt12=77;
        }
        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='*' && LA12_0<='+')||LA12_0=='-'||(LA12_0>=';' && LA12_0<='<')||(LA12_0>='>' && LA12_0<='@')||LA12_0=='\\'||LA12_0=='`'||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFE')) ) {
            alt12=78;
        }
        else {
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | T62 | T63 | T64 | T65 | T66 | T67 | T68 | T69 | T70 | T71 | T72 | T73 | T74 | T75 | T76 | T77 | T78 | T79 | T80 | T81 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 12, 0, input);

            throw nvae;
        }
        switch (alt12) {
            case 1 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:10: T11
                {
                mT11(); 

                }
                break;
            case 2 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:14: T12
                {
                mT12(); 

                }
                break;
            case 3 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:18: T13
                {
                mT13(); 

                }
                break;
            case 4 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:22: T14
                {
                mT14(); 

                }
                break;
            case 5 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:26: T15
                {
                mT15(); 

                }
                break;
            case 6 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:30: T16
                {
                mT16(); 

                }
                break;
            case 7 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:34: T17
                {
                mT17(); 

                }
                break;
            case 8 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:38: T18
                {
                mT18(); 

                }
                break;
            case 9 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:42: T19
                {
                mT19(); 

                }
                break;
            case 10 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:46: T20
                {
                mT20(); 

                }
                break;
            case 11 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:50: T21
                {
                mT21(); 

                }
                break;
            case 12 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:54: T22
                {
                mT22(); 

                }
                break;
            case 13 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:58: T23
                {
                mT23(); 

                }
                break;
            case 14 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:62: T24
                {
                mT24(); 

                }
                break;
            case 15 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:66: T25
                {
                mT25(); 

                }
                break;
            case 16 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:70: T26
                {
                mT26(); 

                }
                break;
            case 17 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:74: T27
                {
                mT27(); 

                }
                break;
            case 18 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:78: T28
                {
                mT28(); 

                }
                break;
            case 19 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:82: T29
                {
                mT29(); 

                }
                break;
            case 20 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:86: T30
                {
                mT30(); 

                }
                break;
            case 21 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:90: T31
                {
                mT31(); 

                }
                break;
            case 22 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:94: T32
                {
                mT32(); 

                }
                break;
            case 23 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:98: T33
                {
                mT33(); 

                }
                break;
            case 24 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:102: T34
                {
                mT34(); 

                }
                break;
            case 25 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:106: T35
                {
                mT35(); 

                }
                break;
            case 26 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:110: T36
                {
                mT36(); 

                }
                break;
            case 27 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:114: T37
                {
                mT37(); 

                }
                break;
            case 28 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:118: T38
                {
                mT38(); 

                }
                break;
            case 29 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:122: T39
                {
                mT39(); 

                }
                break;
            case 30 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:126: T40
                {
                mT40(); 

                }
                break;
            case 31 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:130: T41
                {
                mT41(); 

                }
                break;
            case 32 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:134: T42
                {
                mT42(); 

                }
                break;
            case 33 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:138: T43
                {
                mT43(); 

                }
                break;
            case 34 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:142: T44
                {
                mT44(); 

                }
                break;
            case 35 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:146: T45
                {
                mT45(); 

                }
                break;
            case 36 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:150: T46
                {
                mT46(); 

                }
                break;
            case 37 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:154: T47
                {
                mT47(); 

                }
                break;
            case 38 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:158: T48
                {
                mT48(); 

                }
                break;
            case 39 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:162: T49
                {
                mT49(); 

                }
                break;
            case 40 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:166: T50
                {
                mT50(); 

                }
                break;
            case 41 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:170: T51
                {
                mT51(); 

                }
                break;
            case 42 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:174: T52
                {
                mT52(); 

                }
                break;
            case 43 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:178: T53
                {
                mT53(); 

                }
                break;
            case 44 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:182: T54
                {
                mT54(); 

                }
                break;
            case 45 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:186: T55
                {
                mT55(); 

                }
                break;
            case 46 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:190: T56
                {
                mT56(); 

                }
                break;
            case 47 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:194: T57
                {
                mT57(); 

                }
                break;
            case 48 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:198: T58
                {
                mT58(); 

                }
                break;
            case 49 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:202: T59
                {
                mT59(); 

                }
                break;
            case 50 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:206: T60
                {
                mT60(); 

                }
                break;
            case 51 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:210: T61
                {
                mT61(); 

                }
                break;
            case 52 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:214: T62
                {
                mT62(); 

                }
                break;
            case 53 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:218: T63
                {
                mT63(); 

                }
                break;
            case 54 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:222: T64
                {
                mT64(); 

                }
                break;
            case 55 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:226: T65
                {
                mT65(); 

                }
                break;
            case 56 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:230: T66
                {
                mT66(); 

                }
                break;
            case 57 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:234: T67
                {
                mT67(); 

                }
                break;
            case 58 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:238: T68
                {
                mT68(); 

                }
                break;
            case 59 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:242: T69
                {
                mT69(); 

                }
                break;
            case 60 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:246: T70
                {
                mT70(); 

                }
                break;
            case 61 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:250: T71
                {
                mT71(); 

                }
                break;
            case 62 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:254: T72
                {
                mT72(); 

                }
                break;
            case 63 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:258: T73
                {
                mT73(); 

                }
                break;
            case 64 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:262: T74
                {
                mT74(); 

                }
                break;
            case 65 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:266: T75
                {
                mT75(); 

                }
                break;
            case 66 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:270: T76
                {
                mT76(); 

                }
                break;
            case 67 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:274: T77
                {
                mT77(); 

                }
                break;
            case 68 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:278: T78
                {
                mT78(); 

                }
                break;
            case 69 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:282: T79
                {
                mT79(); 

                }
                break;
            case 70 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:286: T80
                {
                mT80(); 

                }
                break;
            case 71 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:290: T81
                {
                mT81(); 

                }
                break;
            case 72 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:294: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 73 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:302: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 74 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:311: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 75 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:323: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 76 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:339: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 77 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:355: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 78 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:363: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


 

}