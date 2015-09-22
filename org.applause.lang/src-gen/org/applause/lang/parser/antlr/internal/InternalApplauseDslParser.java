package org.applause.lang.parser.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.applause.lang.services.ApplauseDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalApplauseDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'navigationBar.'", "'='", "'{'", "'icon'", "'triggers'", "','", "'}'", "'[]'", "'.'", "'section.id'", "'('", "')'", "'replace('", "'urlconform('", "'['", "']'", "'split('", "'tabbarApp'", "'app'", "'appicon'", "'splash'", "'mainview'", "'button'", "'title'", "'view'", "'handler'", "'const'", "'de='", "'en='", "'type'", "'mapsTo'", "'entity'", "'extends'", "'derived'", "'contentprovider'", "'returns'", "'resolves'", "'fetches'", "'XML'", "'HTML'", "'from'", "'selects'", "'tableview'", "':'", "'action'", "'detailsview'", "'webview'", "'customview'", "'implementedBy'", "'header'", "'subtitle'", "'details'", "'image'", "'section'", "'forAllSections'", "'content'", "'cell'", "'foreach'", "'text'", "'query'", "'as'", "'delegate'", "'Default'", "'DefaultWithDisclosure'", "'Value2'", "'Double'", "'Subtitle'", "'Map'", "'left'", "'center'", "'right'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=5;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

        public InternalApplauseDslParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g"; }



     	private ApplauseDslGrammarAccess grammarAccess;
     	
        public InternalApplauseDslParser(TokenStream input, IAstFactory factory, ApplauseDslGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("org/applause/lang/parser/antlr/internal/InternalApplauseDsl.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "ApplauseModel";	
       	}
       	
       	@Override
       	protected ApplauseDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start entryRuleApplauseModel
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:78:1: entryRuleApplauseModel returns [EObject current=null] : iv_ruleApplauseModel= ruleApplauseModel EOF ;
    public final EObject entryRuleApplauseModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplauseModel = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:79:2: (iv_ruleApplauseModel= ruleApplauseModel EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:80:2: iv_ruleApplauseModel= ruleApplauseModel EOF
            {
             currentNode = createCompositeNode(grammarAccess.getApplauseModelRule(), currentNode); 
            pushFollow(FOLLOW_ruleApplauseModel_in_entryRuleApplauseModel75);
            iv_ruleApplauseModel=ruleApplauseModel();
            _fsp--;

             current =iv_ruleApplauseModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplauseModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleApplauseModel


    // $ANTLR start ruleApplauseModel
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:87:1: ruleApplauseModel returns [EObject current=null] : ( ( (lv_application_0_0= ruleApplication ) ) ( (lv_elements_1_0= ruleModelElement ) )* ) ;
    public final EObject ruleApplauseModel() throws RecognitionException {
        EObject current = null;

        EObject lv_application_0_0 = null;

        EObject lv_elements_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:92:6: ( ( ( (lv_application_0_0= ruleApplication ) ) ( (lv_elements_1_0= ruleModelElement ) )* ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:93:1: ( ( (lv_application_0_0= ruleApplication ) ) ( (lv_elements_1_0= ruleModelElement ) )* )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:93:1: ( ( (lv_application_0_0= ruleApplication ) ) ( (lv_elements_1_0= ruleModelElement ) )* )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:93:2: ( (lv_application_0_0= ruleApplication ) ) ( (lv_elements_1_0= ruleModelElement ) )*
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:93:2: ( (lv_application_0_0= ruleApplication ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:94:1: (lv_application_0_0= ruleApplication )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:94:1: (lv_application_0_0= ruleApplication )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:95:3: lv_application_0_0= ruleApplication
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getApplauseModelAccess().getApplicationApplicationParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleApplication_in_ruleApplauseModel131);
            lv_application_0_0=ruleApplication();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getApplauseModelRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"application",
            	        		lv_application_0_0, 
            	        		"Application", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:117:2: ( (lv_elements_1_0= ruleModelElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==37||LA1_0==40||LA1_0==42||LA1_0==45||LA1_0==53||(LA1_0>=56 && LA1_0<=58)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:118:1: (lv_elements_1_0= ruleModelElement )
            	    {
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:118:1: (lv_elements_1_0= ruleModelElement )
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:119:3: lv_elements_1_0= ruleModelElement
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getApplauseModelAccess().getElementsModelElementParserRuleCall_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleModelElement_in_ruleApplauseModel152);
            	    lv_elements_1_0=ruleModelElement();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getApplauseModelRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"elements",
            	    	        		lv_elements_1_0, 
            	    	        		"ModelElement", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleApplauseModel


    // $ANTLR start entryRuleModelElement
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:149:1: entryRuleModelElement returns [EObject current=null] : iv_ruleModelElement= ruleModelElement EOF ;
    public final EObject entryRuleModelElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelElement = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:150:2: (iv_ruleModelElement= ruleModelElement EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:151:2: iv_ruleModelElement= ruleModelElement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getModelElementRule(), currentNode); 
            pushFollow(FOLLOW_ruleModelElement_in_entryRuleModelElement189);
            iv_ruleModelElement=ruleModelElement();
            _fsp--;

             current =iv_ruleModelElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModelElement199); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleModelElement


    // $ANTLR start ruleModelElement
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:158:1: ruleModelElement returns [EObject current=null] : (this_Type_0= ruleType | this_ContentProvider_1= ruleContentProvider | this_View_2= ruleView | this_Constant_3= ruleConstant | this_NavigationBarItem_4= ruleNavigationBarItem ) ;
    public final EObject ruleModelElement() throws RecognitionException {
        EObject current = null;

        EObject this_Type_0 = null;

        EObject this_ContentProvider_1 = null;

        EObject this_View_2 = null;

        EObject this_Constant_3 = null;

        EObject this_NavigationBarItem_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:163:6: ( (this_Type_0= ruleType | this_ContentProvider_1= ruleContentProvider | this_View_2= ruleView | this_Constant_3= ruleConstant | this_NavigationBarItem_4= ruleNavigationBarItem ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:164:1: (this_Type_0= ruleType | this_ContentProvider_1= ruleContentProvider | this_View_2= ruleView | this_Constant_3= ruleConstant | this_NavigationBarItem_4= ruleNavigationBarItem )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:164:1: (this_Type_0= ruleType | this_ContentProvider_1= ruleContentProvider | this_View_2= ruleView | this_Constant_3= ruleConstant | this_NavigationBarItem_4= ruleNavigationBarItem )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 40:
            case 42:
                {
                alt2=1;
                }
                break;
            case 45:
                {
                alt2=2;
                }
                break;
            case 53:
            case 56:
            case 57:
            case 58:
                {
                alt2=3;
                }
                break;
            case 37:
                {
                alt2=4;
                }
                break;
            case 11:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("164:1: (this_Type_0= ruleType | this_ContentProvider_1= ruleContentProvider | this_View_2= ruleView | this_Constant_3= ruleConstant | this_NavigationBarItem_4= ruleNavigationBarItem )", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:165:5: this_Type_0= ruleType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getModelElementAccess().getTypeParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleType_in_ruleModelElement246);
                    this_Type_0=ruleType();
                    _fsp--;

                     
                            current = this_Type_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:175:5: this_ContentProvider_1= ruleContentProvider
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getModelElementAccess().getContentProviderParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleContentProvider_in_ruleModelElement273);
                    this_ContentProvider_1=ruleContentProvider();
                    _fsp--;

                     
                            current = this_ContentProvider_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:185:5: this_View_2= ruleView
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getModelElementAccess().getViewParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleView_in_ruleModelElement300);
                    this_View_2=ruleView();
                    _fsp--;

                     
                            current = this_View_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:195:5: this_Constant_3= ruleConstant
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getModelElementAccess().getConstantParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleConstant_in_ruleModelElement327);
                    this_Constant_3=ruleConstant();
                    _fsp--;

                     
                            current = this_Constant_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 5 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:205:5: this_NavigationBarItem_4= ruleNavigationBarItem
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getModelElementAccess().getNavigationBarItemParserRuleCall_4(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleNavigationBarItem_in_ruleModelElement354);
                    this_NavigationBarItem_4=ruleNavigationBarItem();
                    _fsp--;

                     
                            current = this_NavigationBarItem_4; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleModelElement


    // $ANTLR start entryRuleNavigationBarItem
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:221:1: entryRuleNavigationBarItem returns [EObject current=null] : iv_ruleNavigationBarItem= ruleNavigationBarItem EOF ;
    public final EObject entryRuleNavigationBarItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigationBarItem = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:222:2: (iv_ruleNavigationBarItem= ruleNavigationBarItem EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:223:2: iv_ruleNavigationBarItem= ruleNavigationBarItem EOF
            {
             currentNode = createCompositeNode(grammarAccess.getNavigationBarItemRule(), currentNode); 
            pushFollow(FOLLOW_ruleNavigationBarItem_in_entryRuleNavigationBarItem389);
            iv_ruleNavigationBarItem=ruleNavigationBarItem();
            _fsp--;

             current =iv_ruleNavigationBarItem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNavigationBarItem399); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleNavigationBarItem


    // $ANTLR start ruleNavigationBarItem
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:230:1: ruleNavigationBarItem returns [EObject current=null] : ( 'navigationBar.' ( (lv_position_1_0= rulePosition ) ) '=' '{' ( ( ( ( ({...}? => ( ( 'icon' '=' ( (lv_icon_7_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'triggers' '=' ( (lv_triggers_10_0= ruleScalarExpression ) ) ( ',' ( (lv_triggers_12_0= ruleScalarExpression ) ) )* ) ) ) )* ) ) ) '}' ) ;
    public final EObject ruleNavigationBarItem() throws RecognitionException {
        EObject current = null;

        Enumerator lv_position_1_0 = null;

        EObject lv_icon_7_0 = null;

        EObject lv_triggers_10_0 = null;

        EObject lv_triggers_12_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:235:6: ( ( 'navigationBar.' ( (lv_position_1_0= rulePosition ) ) '=' '{' ( ( ( ( ({...}? => ( ( 'icon' '=' ( (lv_icon_7_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'triggers' '=' ( (lv_triggers_10_0= ruleScalarExpression ) ) ( ',' ( (lv_triggers_12_0= ruleScalarExpression ) ) )* ) ) ) )* ) ) ) '}' ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:236:1: ( 'navigationBar.' ( (lv_position_1_0= rulePosition ) ) '=' '{' ( ( ( ( ({...}? => ( ( 'icon' '=' ( (lv_icon_7_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'triggers' '=' ( (lv_triggers_10_0= ruleScalarExpression ) ) ( ',' ( (lv_triggers_12_0= ruleScalarExpression ) ) )* ) ) ) )* ) ) ) '}' )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:236:1: ( 'navigationBar.' ( (lv_position_1_0= rulePosition ) ) '=' '{' ( ( ( ( ({...}? => ( ( 'icon' '=' ( (lv_icon_7_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'triggers' '=' ( (lv_triggers_10_0= ruleScalarExpression ) ) ( ',' ( (lv_triggers_12_0= ruleScalarExpression ) ) )* ) ) ) )* ) ) ) '}' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:236:3: 'navigationBar.' ( (lv_position_1_0= rulePosition ) ) '=' '{' ( ( ( ( ({...}? => ( ( 'icon' '=' ( (lv_icon_7_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'triggers' '=' ( (lv_triggers_10_0= ruleScalarExpression ) ) ( ',' ( (lv_triggers_12_0= ruleScalarExpression ) ) )* ) ) ) )* ) ) ) '}'
            {
            match(input,11,FOLLOW_11_in_ruleNavigationBarItem434); 

                    createLeafNode(grammarAccess.getNavigationBarItemAccess().getNavigationBarKeyword_0(), null); 
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:240:1: ( (lv_position_1_0= rulePosition ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:241:1: (lv_position_1_0= rulePosition )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:241:1: (lv_position_1_0= rulePosition )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:242:3: lv_position_1_0= rulePosition
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getNavigationBarItemAccess().getPositionPositionEnumRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_rulePosition_in_ruleNavigationBarItem455);
            lv_position_1_0=rulePosition();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getNavigationBarItemRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"position",
            	        		lv_position_1_0, 
            	        		"Position", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,12,FOLLOW_12_in_ruleNavigationBarItem465); 

                    createLeafNode(grammarAccess.getNavigationBarItemAccess().getEqualsSignKeyword_2(), null); 
                
            match(input,13,FOLLOW_13_in_ruleNavigationBarItem475); 

                    createLeafNode(grammarAccess.getNavigationBarItemAccess().getLeftCurlyBracketKeyword_3(), null); 
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:272:1: ( ( ( ( ({...}? => ( ( 'icon' '=' ( (lv_icon_7_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'triggers' '=' ( (lv_triggers_10_0= ruleScalarExpression ) ) ( ',' ( (lv_triggers_12_0= ruleScalarExpression ) ) )* ) ) ) )* ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:274:1: ( ( ( ({...}? => ( ( 'icon' '=' ( (lv_icon_7_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'triggers' '=' ( (lv_triggers_10_0= ruleScalarExpression ) ) ( ',' ( (lv_triggers_12_0= ruleScalarExpression ) ) )* ) ) ) )* ) )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:274:1: ( ( ( ({...}? => ( ( 'icon' '=' ( (lv_icon_7_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'triggers' '=' ( (lv_triggers_10_0= ruleScalarExpression ) ) ( ',' ( (lv_triggers_12_0= ruleScalarExpression ) ) )* ) ) ) )* ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:275:2: ( ( ({...}? => ( ( 'icon' '=' ( (lv_icon_7_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'triggers' '=' ( (lv_triggers_10_0= ruleScalarExpression ) ) ( ',' ( (lv_triggers_12_0= ruleScalarExpression ) ) )* ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getNavigationBarItemAccess().getUnorderedGroup_4());
            	
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:278:2: ( ( ({...}? => ( ( 'icon' '=' ( (lv_icon_7_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'triggers' '=' ( (lv_triggers_10_0= ruleScalarExpression ) ) ( ',' ( (lv_triggers_12_0= ruleScalarExpression ) ) )* ) ) ) )* )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:279:3: ( ({...}? => ( ( 'icon' '=' ( (lv_icon_7_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'triggers' '=' ( (lv_triggers_10_0= ruleScalarExpression ) ) ( ',' ( (lv_triggers_12_0= ruleScalarExpression ) ) )* ) ) ) )*
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:279:3: ( ({...}? => ( ( 'icon' '=' ( (lv_icon_7_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( 'triggers' '=' ( (lv_triggers_10_0= ruleScalarExpression ) ) ( ',' ( (lv_triggers_12_0= ruleScalarExpression ) ) )* ) ) ) )*
            loop4:
            do {
                int alt4=3;
                int LA4_0 = input.LA(1);

                if ( LA4_0 ==14 && getUnorderedGroupHelper().canSelect(grammarAccess.getNavigationBarItemAccess().getUnorderedGroup_4(), 0) ) {
                    alt4=1;
                }
                else if ( LA4_0 ==15 && getUnorderedGroupHelper().canSelect(grammarAccess.getNavigationBarItemAccess().getUnorderedGroup_4(), 1) ) {
                    alt4=2;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:281:4: ({...}? => ( ( 'icon' '=' ( (lv_icon_7_0= ruleScalarExpression ) ) ) ) )
            	    {
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:281:4: ({...}? => ( ( 'icon' '=' ( (lv_icon_7_0= ruleScalarExpression ) ) ) ) )
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:282:5: {...}? => ( ( 'icon' '=' ( (lv_icon_7_0= ruleScalarExpression ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNavigationBarItemAccess().getUnorderedGroup_4(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleNavigationBarItem", "getUnorderedGroupHelper().canSelect(grammarAccess.getNavigationBarItemAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:282:114: ( ( 'icon' '=' ( (lv_icon_7_0= ruleScalarExpression ) ) ) )
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:283:6: ( 'icon' '=' ( (lv_icon_7_0= ruleScalarExpression ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getNavigationBarItemAccess().getUnorderedGroup_4(), 0);
            	    	 				
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:286:6: ( 'icon' '=' ( (lv_icon_7_0= ruleScalarExpression ) ) )
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:286:8: 'icon' '=' ( (lv_icon_7_0= ruleScalarExpression ) )
            	    {
            	    match(input,14,FOLLOW_14_in_ruleNavigationBarItem528); 

            	            createLeafNode(grammarAccess.getNavigationBarItemAccess().getIconKeyword_4_0_0(), null); 
            	        
            	    match(input,12,FOLLOW_12_in_ruleNavigationBarItem538); 

            	            createLeafNode(grammarAccess.getNavigationBarItemAccess().getEqualsSignKeyword_4_0_1(), null); 
            	        
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:294:1: ( (lv_icon_7_0= ruleScalarExpression ) )
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:295:1: (lv_icon_7_0= ruleScalarExpression )
            	    {
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:295:1: (lv_icon_7_0= ruleScalarExpression )
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:296:3: lv_icon_7_0= ruleScalarExpression
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getNavigationBarItemAccess().getIconScalarExpressionParserRuleCall_4_0_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleScalarExpression_in_ruleNavigationBarItem559);
            	    lv_icon_7_0=ruleScalarExpression();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getNavigationBarItemRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"icon",
            	    	        		lv_icon_7_0, 
            	    	        		"ScalarExpression", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNavigationBarItemAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:325:4: ({...}? => ( ( 'triggers' '=' ( (lv_triggers_10_0= ruleScalarExpression ) ) ( ',' ( (lv_triggers_12_0= ruleScalarExpression ) ) )* ) ) )
            	    {
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:325:4: ({...}? => ( ( 'triggers' '=' ( (lv_triggers_10_0= ruleScalarExpression ) ) ( ',' ( (lv_triggers_12_0= ruleScalarExpression ) ) )* ) ) )
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:326:5: {...}? => ( ( 'triggers' '=' ( (lv_triggers_10_0= ruleScalarExpression ) ) ( ',' ( (lv_triggers_12_0= ruleScalarExpression ) ) )* ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNavigationBarItemAccess().getUnorderedGroup_4(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleNavigationBarItem", "getUnorderedGroupHelper().canSelect(grammarAccess.getNavigationBarItemAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:326:114: ( ( 'triggers' '=' ( (lv_triggers_10_0= ruleScalarExpression ) ) ( ',' ( (lv_triggers_12_0= ruleScalarExpression ) ) )* ) )
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:327:6: ( 'triggers' '=' ( (lv_triggers_10_0= ruleScalarExpression ) ) ( ',' ( (lv_triggers_12_0= ruleScalarExpression ) ) )* )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getNavigationBarItemAccess().getUnorderedGroup_4(), 1);
            	    	 				
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:330:6: ( 'triggers' '=' ( (lv_triggers_10_0= ruleScalarExpression ) ) ( ',' ( (lv_triggers_12_0= ruleScalarExpression ) ) )* )
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:330:8: 'triggers' '=' ( (lv_triggers_10_0= ruleScalarExpression ) ) ( ',' ( (lv_triggers_12_0= ruleScalarExpression ) ) )*
            	    {
            	    match(input,15,FOLLOW_15_in_ruleNavigationBarItem621); 

            	            createLeafNode(grammarAccess.getNavigationBarItemAccess().getTriggersKeyword_4_1_0(), null); 
            	        
            	    match(input,12,FOLLOW_12_in_ruleNavigationBarItem631); 

            	            createLeafNode(grammarAccess.getNavigationBarItemAccess().getEqualsSignKeyword_4_1_1(), null); 
            	        
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:338:1: ( (lv_triggers_10_0= ruleScalarExpression ) )
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:339:1: (lv_triggers_10_0= ruleScalarExpression )
            	    {
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:339:1: (lv_triggers_10_0= ruleScalarExpression )
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:340:3: lv_triggers_10_0= ruleScalarExpression
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getNavigationBarItemAccess().getTriggersScalarExpressionParserRuleCall_4_1_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleScalarExpression_in_ruleNavigationBarItem652);
            	    lv_triggers_10_0=ruleScalarExpression();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getNavigationBarItemRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"triggers",
            	    	        		lv_triggers_10_0, 
            	    	        		"ScalarExpression", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }

            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:362:2: ( ',' ( (lv_triggers_12_0= ruleScalarExpression ) ) )*
            	    loop3:
            	    do {
            	        int alt3=2;
            	        int LA3_0 = input.LA(1);

            	        if ( (LA3_0==16) ) {
            	            alt3=1;
            	        }


            	        switch (alt3) {
            	    	case 1 :
            	    	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:362:4: ',' ( (lv_triggers_12_0= ruleScalarExpression ) )
            	    	    {
            	    	    match(input,16,FOLLOW_16_in_ruleNavigationBarItem663); 

            	    	            createLeafNode(grammarAccess.getNavigationBarItemAccess().getCommaKeyword_4_1_3_0(), null); 
            	    	        
            	    	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:366:1: ( (lv_triggers_12_0= ruleScalarExpression ) )
            	    	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:367:1: (lv_triggers_12_0= ruleScalarExpression )
            	    	    {
            	    	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:367:1: (lv_triggers_12_0= ruleScalarExpression )
            	    	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:368:3: lv_triggers_12_0= ruleScalarExpression
            	    	    {
            	    	     
            	    	    	        currentNode=createCompositeNode(grammarAccess.getNavigationBarItemAccess().getTriggersScalarExpressionParserRuleCall_4_1_3_1_0(), currentNode); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleScalarExpression_in_ruleNavigationBarItem684);
            	    	    lv_triggers_12_0=ruleScalarExpression();
            	    	    _fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = factory.create(grammarAccess.getNavigationBarItemRule().getType().getClassifier());
            	    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	    	        }
            	    	    	        try {
            	    	    	       		add(
            	    	    	       			current, 
            	    	    	       			"triggers",
            	    	    	        		lv_triggers_12_0, 
            	    	    	        		"ScalarExpression", 
            	    	    	        		currentNode);
            	    	    	        } catch (ValueConverterException vce) {
            	    	    				handleValueConverterException(vce);
            	    	    	        }
            	    	    	        currentNode = currentNode.getParent();
            	    	    	    

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop3;
            	        }
            	    } while (true);


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNavigationBarItemAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getNavigationBarItemAccess().getUnorderedGroup_4());
            	

            }

            match(input,17,FOLLOW_17_in_ruleNavigationBarItem736); 

                    createLeafNode(grammarAccess.getNavigationBarItemAccess().getRightCurlyBracketKeyword_5(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleNavigationBarItem


    // $ANTLR start entryRuleTypeDescription
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:418:1: entryRuleTypeDescription returns [EObject current=null] : iv_ruleTypeDescription= ruleTypeDescription EOF ;
    public final EObject entryRuleTypeDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDescription = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:419:2: (iv_ruleTypeDescription= ruleTypeDescription EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:420:2: iv_ruleTypeDescription= ruleTypeDescription EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTypeDescriptionRule(), currentNode); 
            pushFollow(FOLLOW_ruleTypeDescription_in_entryRuleTypeDescription774);
            iv_ruleTypeDescription=ruleTypeDescription();
            _fsp--;

             current =iv_ruleTypeDescription; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeDescription784); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTypeDescription


    // $ANTLR start ruleTypeDescription
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:427:1: ruleTypeDescription returns [EObject current=null] : ( ( ( RULE_ID ) ) ( (lv_many_1_0= '[]' ) )? ) ;
    public final EObject ruleTypeDescription() throws RecognitionException {
        EObject current = null;

        Token lv_many_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:432:6: ( ( ( ( RULE_ID ) ) ( (lv_many_1_0= '[]' ) )? ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:433:1: ( ( ( RULE_ID ) ) ( (lv_many_1_0= '[]' ) )? )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:433:1: ( ( ( RULE_ID ) ) ( (lv_many_1_0= '[]' ) )? )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:433:2: ( ( RULE_ID ) ) ( (lv_many_1_0= '[]' ) )?
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:433:2: ( ( RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:434:1: ( RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:434:1: ( RULE_ID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:435:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getTypeDescriptionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTypeDescription827); 

            		createLeafNode(grammarAccess.getTypeDescriptionAccess().getTypeTypeCrossReference_0_0(), "type"); 
            	

            }


            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:447:2: ( (lv_many_1_0= '[]' ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:448:1: (lv_many_1_0= '[]' )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:448:1: (lv_many_1_0= '[]' )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:449:3: lv_many_1_0= '[]'
                    {
                    lv_many_1_0=(Token)input.LT(1);
                    match(input,18,FOLLOW_18_in_ruleTypeDescription845); 

                            createLeafNode(grammarAccess.getTypeDescriptionAccess().getManyLeftSquareBracketRightSquareBracketKeyword_1_0(), "many"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getTypeDescriptionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "many", true, "[]", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleTypeDescription


    // $ANTLR start entryRuleParameter
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:476:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:477:2: (iv_ruleParameter= ruleParameter EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:478:2: iv_ruleParameter= ruleParameter EOF
            {
             currentNode = createCompositeNode(grammarAccess.getParameterRule(), currentNode); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter895);
            iv_ruleParameter=ruleParameter();
            _fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter905); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleParameter


    // $ANTLR start ruleParameter
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:485:1: ruleParameter returns [EObject current=null] : ( ( (lv_description_0_0= ruleTypeDescription ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_description_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:490:6: ( ( ( (lv_description_0_0= ruleTypeDescription ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:491:1: ( ( (lv_description_0_0= ruleTypeDescription ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:491:1: ( ( (lv_description_0_0= ruleTypeDescription ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:491:2: ( (lv_description_0_0= ruleTypeDescription ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:491:2: ( (lv_description_0_0= ruleTypeDescription ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:492:1: (lv_description_0_0= ruleTypeDescription )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:492:1: (lv_description_0_0= ruleTypeDescription )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:493:3: lv_description_0_0= ruleTypeDescription
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getParameterAccess().getDescriptionTypeDescriptionParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleTypeDescription_in_ruleParameter951);
            lv_description_0_0=ruleTypeDescription();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getParameterRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"description",
            	        		lv_description_0_0, 
            	        		"TypeDescription", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:515:2: ( (lv_name_1_0= RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:516:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:516:1: (lv_name_1_0= RULE_ID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:517:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameter968); 

            			createLeafNode(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getParameterRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleParameter


    // $ANTLR start entryRuleObjectReference
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:547:1: entryRuleObjectReference returns [EObject current=null] : iv_ruleObjectReference= ruleObjectReference EOF ;
    public final EObject entryRuleObjectReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectReference = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:548:2: (iv_ruleObjectReference= ruleObjectReference EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:549:2: iv_ruleObjectReference= ruleObjectReference EOF
            {
             currentNode = createCompositeNode(grammarAccess.getObjectReferenceRule(), currentNode); 
            pushFollow(FOLLOW_ruleObjectReference_in_entryRuleObjectReference1009);
            iv_ruleObjectReference=ruleObjectReference();
            _fsp--;

             current =iv_ruleObjectReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectReference1019); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleObjectReference


    // $ANTLR start ruleObjectReference
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:556:1: ruleObjectReference returns [EObject current=null] : ( ( ( RULE_ID ) ) ( (lv_tail_1_0= ruleNestedObjectReference ) )? ) ;
    public final EObject ruleObjectReference() throws RecognitionException {
        EObject current = null;

        EObject lv_tail_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:561:6: ( ( ( ( RULE_ID ) ) ( (lv_tail_1_0= ruleNestedObjectReference ) )? ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:562:1: ( ( ( RULE_ID ) ) ( (lv_tail_1_0= ruleNestedObjectReference ) )? )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:562:1: ( ( ( RULE_ID ) ) ( (lv_tail_1_0= ruleNestedObjectReference ) )? )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:562:2: ( ( RULE_ID ) ) ( (lv_tail_1_0= ruleNestedObjectReference ) )?
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:562:2: ( ( RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:563:1: ( RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:563:1: ( RULE_ID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:564:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getObjectReferenceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleObjectReference1062); 

            		createLeafNode(grammarAccess.getObjectReferenceAccess().getObjectVariableDeclarationCrossReference_0_0(), "object"); 
            	

            }


            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:576:2: ( (lv_tail_1_0= ruleNestedObjectReference ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:577:1: (lv_tail_1_0= ruleNestedObjectReference )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:577:1: (lv_tail_1_0= ruleNestedObjectReference )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:578:3: lv_tail_1_0= ruleNestedObjectReference
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getObjectReferenceAccess().getTailNestedObjectReferenceParserRuleCall_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleNestedObjectReference_in_ruleObjectReference1083);
                    lv_tail_1_0=ruleNestedObjectReference();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getObjectReferenceRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"tail",
                    	        		lv_tail_1_0, 
                    	        		"NestedObjectReference", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleObjectReference


    // $ANTLR start entryRuleNestedObjectReference
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:608:1: entryRuleNestedObjectReference returns [EObject current=null] : iv_ruleNestedObjectReference= ruleNestedObjectReference EOF ;
    public final EObject entryRuleNestedObjectReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNestedObjectReference = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:609:2: (iv_ruleNestedObjectReference= ruleNestedObjectReference EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:610:2: iv_ruleNestedObjectReference= ruleNestedObjectReference EOF
            {
             currentNode = createCompositeNode(grammarAccess.getNestedObjectReferenceRule(), currentNode); 
            pushFollow(FOLLOW_ruleNestedObjectReference_in_entryRuleNestedObjectReference1120);
            iv_ruleNestedObjectReference=ruleNestedObjectReference();
            _fsp--;

             current =iv_ruleNestedObjectReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNestedObjectReference1130); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleNestedObjectReference


    // $ANTLR start ruleNestedObjectReference
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:617:1: ruleNestedObjectReference returns [EObject current=null] : ( '.' ( ( RULE_ID ) ) ( (lv_tail_2_0= ruleNestedObjectReference ) )? ) ;
    public final EObject ruleNestedObjectReference() throws RecognitionException {
        EObject current = null;

        EObject lv_tail_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:622:6: ( ( '.' ( ( RULE_ID ) ) ( (lv_tail_2_0= ruleNestedObjectReference ) )? ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:623:1: ( '.' ( ( RULE_ID ) ) ( (lv_tail_2_0= ruleNestedObjectReference ) )? )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:623:1: ( '.' ( ( RULE_ID ) ) ( (lv_tail_2_0= ruleNestedObjectReference ) )? )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:623:3: '.' ( ( RULE_ID ) ) ( (lv_tail_2_0= ruleNestedObjectReference ) )?
            {
            match(input,19,FOLLOW_19_in_ruleNestedObjectReference1165); 

                    createLeafNode(grammarAccess.getNestedObjectReferenceAccess().getFullStopKeyword_0(), null); 
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:627:1: ( ( RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:628:1: ( RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:628:1: ( RULE_ID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:629:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getNestedObjectReferenceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNestedObjectReference1183); 

            		createLeafNode(grammarAccess.getNestedObjectReferenceAccess().getObjectVariableDeclarationCrossReference_1_0(), "object"); 
            	

            }


            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:641:2: ( (lv_tail_2_0= ruleNestedObjectReference ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:642:1: (lv_tail_2_0= ruleNestedObjectReference )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:642:1: (lv_tail_2_0= ruleNestedObjectReference )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:643:3: lv_tail_2_0= ruleNestedObjectReference
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getNestedObjectReferenceAccess().getTailNestedObjectReferenceParserRuleCall_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleNestedObjectReference_in_ruleNestedObjectReference1204);
                    lv_tail_2_0=ruleNestedObjectReference();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getNestedObjectReferenceRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"tail",
                    	        		lv_tail_2_0, 
                    	        		"NestedObjectReference", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleNestedObjectReference


    // $ANTLR start entryRuleExpression
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:673:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:674:2: (iv_ruleExpression= ruleExpression EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:675:2: iv_ruleExpression= ruleExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression1241);
            iv_ruleExpression=ruleExpression();
            _fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression1251); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleExpression


    // $ANTLR start ruleExpression
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:682:1: ruleExpression returns [EObject current=null] : (this_StringLiteral_0= ruleStringLiteral | this_StringFunction_1= ruleStringFunction | this_CollectionLiteral_2= ruleCollectionLiteral | this_CollectionFunction_3= ruleCollectionFunction | this_ObjectReference_4= ruleObjectReference ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_StringLiteral_0 = null;

        EObject this_StringFunction_1 = null;

        EObject this_CollectionLiteral_2 = null;

        EObject this_CollectionFunction_3 = null;

        EObject this_ObjectReference_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:687:6: ( (this_StringLiteral_0= ruleStringLiteral | this_StringFunction_1= ruleStringFunction | this_CollectionLiteral_2= ruleCollectionLiteral | this_CollectionFunction_3= ruleCollectionFunction | this_ObjectReference_4= ruleObjectReference ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:688:1: (this_StringLiteral_0= ruleStringLiteral | this_StringFunction_1= ruleStringFunction | this_CollectionLiteral_2= ruleCollectionLiteral | this_CollectionFunction_3= ruleCollectionFunction | this_ObjectReference_4= ruleObjectReference )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:688:1: (this_StringLiteral_0= ruleStringLiteral | this_StringFunction_1= ruleStringFunction | this_CollectionLiteral_2= ruleCollectionLiteral | this_CollectionFunction_3= ruleCollectionFunction | this_ObjectReference_4= ruleObjectReference )
            int alt8=5;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt8=1;
                }
                break;
            case 21:
            case 23:
            case 24:
                {
                alt8=2;
                }
                break;
            case 25:
                {
                alt8=3;
                }
                break;
            case 27:
                {
                alt8=4;
                }
                break;
            case RULE_ID:
                {
                alt8=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("688:1: (this_StringLiteral_0= ruleStringLiteral | this_StringFunction_1= ruleStringFunction | this_CollectionLiteral_2= ruleCollectionLiteral | this_CollectionFunction_3= ruleCollectionFunction | this_ObjectReference_4= ruleObjectReference )", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:689:5: this_StringLiteral_0= ruleStringLiteral
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getStringLiteralParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleExpression1298);
                    this_StringLiteral_0=ruleStringLiteral();
                    _fsp--;

                     
                            current = this_StringLiteral_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:699:5: this_StringFunction_1= ruleStringFunction
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getStringFunctionParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleStringFunction_in_ruleExpression1325);
                    this_StringFunction_1=ruleStringFunction();
                    _fsp--;

                     
                            current = this_StringFunction_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:709:5: this_CollectionLiteral_2= ruleCollectionLiteral
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getCollectionLiteralParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleCollectionLiteral_in_ruleExpression1352);
                    this_CollectionLiteral_2=ruleCollectionLiteral();
                    _fsp--;

                     
                            current = this_CollectionLiteral_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:719:5: this_CollectionFunction_3= ruleCollectionFunction
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getCollectionFunctionParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleCollectionFunction_in_ruleExpression1379);
                    this_CollectionFunction_3=ruleCollectionFunction();
                    _fsp--;

                     
                            current = this_CollectionFunction_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 5 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:729:5: this_ObjectReference_4= ruleObjectReference
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getObjectReferenceParserRuleCall_4(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleObjectReference_in_ruleExpression1406);
                    this_ObjectReference_4=ruleObjectReference();
                    _fsp--;

                     
                            current = this_ObjectReference_4; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleExpression


    // $ANTLR start entryRuleScalarExpression
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:745:1: entryRuleScalarExpression returns [EObject current=null] : iv_ruleScalarExpression= ruleScalarExpression EOF ;
    public final EObject entryRuleScalarExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScalarExpression = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:746:2: (iv_ruleScalarExpression= ruleScalarExpression EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:747:2: iv_ruleScalarExpression= ruleScalarExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getScalarExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleScalarExpression_in_entryRuleScalarExpression1441);
            iv_ruleScalarExpression=ruleScalarExpression();
            _fsp--;

             current =iv_ruleScalarExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScalarExpression1451); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleScalarExpression


    // $ANTLR start ruleScalarExpression
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:754:1: ruleScalarExpression returns [EObject current=null] : (this_StringLiteral_0= ruleStringLiteral | this_StringFunction_1= ruleStringFunction | this_ObjectReference_2= ruleObjectReference ) ;
    public final EObject ruleScalarExpression() throws RecognitionException {
        EObject current = null;

        EObject this_StringLiteral_0 = null;

        EObject this_StringFunction_1 = null;

        EObject this_ObjectReference_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:759:6: ( (this_StringLiteral_0= ruleStringLiteral | this_StringFunction_1= ruleStringFunction | this_ObjectReference_2= ruleObjectReference ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:760:1: (this_StringLiteral_0= ruleStringLiteral | this_StringFunction_1= ruleStringFunction | this_ObjectReference_2= ruleObjectReference )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:760:1: (this_StringLiteral_0= ruleStringLiteral | this_StringFunction_1= ruleStringFunction | this_ObjectReference_2= ruleObjectReference )
            int alt9=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt9=1;
                }
                break;
            case 21:
            case 23:
            case 24:
                {
                alt9=2;
                }
                break;
            case RULE_ID:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("760:1: (this_StringLiteral_0= ruleStringLiteral | this_StringFunction_1= ruleStringFunction | this_ObjectReference_2= ruleObjectReference )", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:761:5: this_StringLiteral_0= ruleStringLiteral
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getScalarExpressionAccess().getStringLiteralParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleScalarExpression1498);
                    this_StringLiteral_0=ruleStringLiteral();
                    _fsp--;

                     
                            current = this_StringLiteral_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:771:5: this_StringFunction_1= ruleStringFunction
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getScalarExpressionAccess().getStringFunctionParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleStringFunction_in_ruleScalarExpression1525);
                    this_StringFunction_1=ruleStringFunction();
                    _fsp--;

                     
                            current = this_StringFunction_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:781:5: this_ObjectReference_2= ruleObjectReference
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getScalarExpressionAccess().getObjectReferenceParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleObjectReference_in_ruleScalarExpression1552);
                    this_ObjectReference_2=ruleObjectReference();
                    _fsp--;

                     
                            current = this_ObjectReference_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleScalarExpression


    // $ANTLR start entryRuleCollectionExpression
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:797:1: entryRuleCollectionExpression returns [EObject current=null] : iv_ruleCollectionExpression= ruleCollectionExpression EOF ;
    public final EObject entryRuleCollectionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionExpression = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:798:2: (iv_ruleCollectionExpression= ruleCollectionExpression EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:799:2: iv_ruleCollectionExpression= ruleCollectionExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCollectionExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleCollectionExpression_in_entryRuleCollectionExpression1587);
            iv_ruleCollectionExpression=ruleCollectionExpression();
            _fsp--;

             current =iv_ruleCollectionExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollectionExpression1597); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleCollectionExpression


    // $ANTLR start ruleCollectionExpression
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:806:1: ruleCollectionExpression returns [EObject current=null] : (this_CollectionLiteral_0= ruleCollectionLiteral | this_CollectionFunction_1= ruleCollectionFunction | this_ObjectReference_2= ruleObjectReference ) ;
    public final EObject ruleCollectionExpression() throws RecognitionException {
        EObject current = null;

        EObject this_CollectionLiteral_0 = null;

        EObject this_CollectionFunction_1 = null;

        EObject this_ObjectReference_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:811:6: ( (this_CollectionLiteral_0= ruleCollectionLiteral | this_CollectionFunction_1= ruleCollectionFunction | this_ObjectReference_2= ruleObjectReference ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:812:1: (this_CollectionLiteral_0= ruleCollectionLiteral | this_CollectionFunction_1= ruleCollectionFunction | this_ObjectReference_2= ruleObjectReference )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:812:1: (this_CollectionLiteral_0= ruleCollectionLiteral | this_CollectionFunction_1= ruleCollectionFunction | this_ObjectReference_2= ruleObjectReference )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt10=1;
                }
                break;
            case 27:
                {
                alt10=2;
                }
                break;
            case RULE_ID:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("812:1: (this_CollectionLiteral_0= ruleCollectionLiteral | this_CollectionFunction_1= ruleCollectionFunction | this_ObjectReference_2= ruleObjectReference )", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:813:5: this_CollectionLiteral_0= ruleCollectionLiteral
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getCollectionExpressionAccess().getCollectionLiteralParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleCollectionLiteral_in_ruleCollectionExpression1644);
                    this_CollectionLiteral_0=ruleCollectionLiteral();
                    _fsp--;

                     
                            current = this_CollectionLiteral_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:823:5: this_CollectionFunction_1= ruleCollectionFunction
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getCollectionExpressionAccess().getCollectionFunctionParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleCollectionFunction_in_ruleCollectionExpression1671);
                    this_CollectionFunction_1=ruleCollectionFunction();
                    _fsp--;

                     
                            current = this_CollectionFunction_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:833:5: this_ObjectReference_2= ruleObjectReference
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getCollectionExpressionAccess().getObjectReferenceParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleObjectReference_in_ruleCollectionExpression1698);
                    this_ObjectReference_2=ruleObjectReference();
                    _fsp--;

                     
                            current = this_ObjectReference_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleCollectionExpression


    // $ANTLR start entryRuleStringLiteral
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:849:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:850:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:851:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStringLiteralRule(), currentNode); 
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral1733);
            iv_ruleStringLiteral=ruleStringLiteral();
            _fsp--;

             current =iv_ruleStringLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral1743); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleStringLiteral


    // $ANTLR start ruleStringLiteral
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:858:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:863:6: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:864:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:864:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:865:1: (lv_value_0_0= RULE_STRING )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:865:1: (lv_value_0_0= RULE_STRING )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:866:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLiteral1784); 

            			createLeafNode(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0(), "value"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getStringLiteralRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"value",
            	        		lv_value_0_0, 
            	        		"STRING", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleStringLiteral


    // $ANTLR start entryRulePredefinedParameter
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:896:1: entryRulePredefinedParameter returns [EObject current=null] : iv_rulePredefinedParameter= rulePredefinedParameter EOF ;
    public final EObject entryRulePredefinedParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredefinedParameter = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:897:2: (iv_rulePredefinedParameter= rulePredefinedParameter EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:898:2: iv_rulePredefinedParameter= rulePredefinedParameter EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPredefinedParameterRule(), currentNode); 
            pushFollow(FOLLOW_rulePredefinedParameter_in_entryRulePredefinedParameter1824);
            iv_rulePredefinedParameter=rulePredefinedParameter();
            _fsp--;

             current =iv_rulePredefinedParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePredefinedParameter1834); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePredefinedParameter


    // $ANTLR start rulePredefinedParameter
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:905:1: rulePredefinedParameter returns [EObject current=null] : this_SectionId_0= ruleSectionId ;
    public final EObject rulePredefinedParameter() throws RecognitionException {
        EObject current = null;

        EObject this_SectionId_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:910:6: (this_SectionId_0= ruleSectionId )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:912:5: this_SectionId_0= ruleSectionId
            {
             
                    currentNode=createCompositeNode(grammarAccess.getPredefinedParameterAccess().getSectionIdParserRuleCall(), currentNode); 
                
            pushFollow(FOLLOW_ruleSectionId_in_rulePredefinedParameter1880);
            this_SectionId_0=ruleSectionId();
            _fsp--;

             
                    current = this_SectionId_0; 
                    currentNode = currentNode.getParent();
                

            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulePredefinedParameter


    // $ANTLR start entryRuleSectionId
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:928:1: entryRuleSectionId returns [EObject current=null] : iv_ruleSectionId= ruleSectionId EOF ;
    public final EObject entryRuleSectionId() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSectionId = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:929:2: (iv_ruleSectionId= ruleSectionId EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:930:2: iv_ruleSectionId= ruleSectionId EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSectionIdRule(), currentNode); 
            pushFollow(FOLLOW_ruleSectionId_in_entryRuleSectionId1914);
            iv_ruleSectionId=ruleSectionId();
            _fsp--;

             current =iv_ruleSectionId; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSectionId1924); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSectionId


    // $ANTLR start ruleSectionId
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:937:1: ruleSectionId returns [EObject current=null] : ( () 'section.id' ) ;
    public final EObject ruleSectionId() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:942:6: ( ( () 'section.id' ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:943:1: ( () 'section.id' )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:943:1: ( () 'section.id' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:943:2: () 'section.id'
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:943:2: ()
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:944:5: 
            {
             
                    temp=factory.create(grammarAccess.getSectionIdAccess().getSectionIdAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getSectionIdAccess().getSectionIdAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,20,FOLLOW_20_in_ruleSectionId1968); 

                    createLeafNode(grammarAccess.getSectionIdAccess().getSectionIdKeyword_1(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleSectionId


    // $ANTLR start entryRuleStringFunction
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:966:1: entryRuleStringFunction returns [EObject current=null] : iv_ruleStringFunction= ruleStringFunction EOF ;
    public final EObject entryRuleStringFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringFunction = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:967:2: (iv_ruleStringFunction= ruleStringFunction EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:968:2: iv_ruleStringFunction= ruleStringFunction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStringFunctionRule(), currentNode); 
            pushFollow(FOLLOW_ruleStringFunction_in_entryRuleStringFunction2004);
            iv_ruleStringFunction=ruleStringFunction();
            _fsp--;

             current =iv_ruleStringFunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringFunction2014); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleStringFunction


    // $ANTLR start ruleStringFunction
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:975:1: ruleStringFunction returns [EObject current=null] : ( ( () '(' ( (lv_values_2_0= ruleScalarExpression ) )+ ')' ) | ( () 'replace(' ( (lv_value_6_0= ruleScalarExpression ) ) ',' ( (lv_match_8_0= ruleScalarExpression ) ) ',' ( (lv_replacement_10_0= ruleScalarExpression ) ) ')' ) | ( () 'urlconform(' ( (lv_value_14_0= ruleScalarExpression ) ) ')' ) ) ;
    public final EObject ruleStringFunction() throws RecognitionException {
        EObject current = null;

        EObject lv_values_2_0 = null;

        EObject lv_value_6_0 = null;

        EObject lv_match_8_0 = null;

        EObject lv_replacement_10_0 = null;

        EObject lv_value_14_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:980:6: ( ( ( () '(' ( (lv_values_2_0= ruleScalarExpression ) )+ ')' ) | ( () 'replace(' ( (lv_value_6_0= ruleScalarExpression ) ) ',' ( (lv_match_8_0= ruleScalarExpression ) ) ',' ( (lv_replacement_10_0= ruleScalarExpression ) ) ')' ) | ( () 'urlconform(' ( (lv_value_14_0= ruleScalarExpression ) ) ')' ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:981:1: ( ( () '(' ( (lv_values_2_0= ruleScalarExpression ) )+ ')' ) | ( () 'replace(' ( (lv_value_6_0= ruleScalarExpression ) ) ',' ( (lv_match_8_0= ruleScalarExpression ) ) ',' ( (lv_replacement_10_0= ruleScalarExpression ) ) ')' ) | ( () 'urlconform(' ( (lv_value_14_0= ruleScalarExpression ) ) ')' ) )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:981:1: ( ( () '(' ( (lv_values_2_0= ruleScalarExpression ) )+ ')' ) | ( () 'replace(' ( (lv_value_6_0= ruleScalarExpression ) ) ',' ( (lv_match_8_0= ruleScalarExpression ) ) ',' ( (lv_replacement_10_0= ruleScalarExpression ) ) ')' ) | ( () 'urlconform(' ( (lv_value_14_0= ruleScalarExpression ) ) ')' ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt12=1;
                }
                break;
            case 23:
                {
                alt12=2;
                }
                break;
            case 24:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("981:1: ( ( () '(' ( (lv_values_2_0= ruleScalarExpression ) )+ ')' ) | ( () 'replace(' ( (lv_value_6_0= ruleScalarExpression ) ) ',' ( (lv_match_8_0= ruleScalarExpression ) ) ',' ( (lv_replacement_10_0= ruleScalarExpression ) ) ')' ) | ( () 'urlconform(' ( (lv_value_14_0= ruleScalarExpression ) ) ')' ) )", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:981:2: ( () '(' ( (lv_values_2_0= ruleScalarExpression ) )+ ')' )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:981:2: ( () '(' ( (lv_values_2_0= ruleScalarExpression ) )+ ')' )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:981:3: () '(' ( (lv_values_2_0= ruleScalarExpression ) )+ ')'
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:981:3: ()
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:982:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getStringFunctionAccess().getStringConcatAction_0_0().getType().getClassifier());
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getStringFunctionAccess().getStringConcatAction_0_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    match(input,21,FOLLOW_21_in_ruleStringFunction2059); 

                            createLeafNode(grammarAccess.getStringFunctionAccess().getLeftParenthesisKeyword_0_1(), null); 
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:996:1: ( (lv_values_2_0= ruleScalarExpression ) )+
                    int cnt11=0;
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( ((LA11_0>=RULE_ID && LA11_0<=RULE_STRING)||LA11_0==21||(LA11_0>=23 && LA11_0<=24)) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:997:1: (lv_values_2_0= ruleScalarExpression )
                    	    {
                    	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:997:1: (lv_values_2_0= ruleScalarExpression )
                    	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:998:3: lv_values_2_0= ruleScalarExpression
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getStringFunctionAccess().getValuesScalarExpressionParserRuleCall_0_2_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleScalarExpression_in_ruleStringFunction2080);
                    	    lv_values_2_0=ruleScalarExpression();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getStringFunctionRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"values",
                    	    	        		lv_values_2_0, 
                    	    	        		"ScalarExpression", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

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

                    match(input,22,FOLLOW_22_in_ruleStringFunction2091); 

                            createLeafNode(grammarAccess.getStringFunctionAccess().getRightParenthesisKeyword_0_3(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1025:6: ( () 'replace(' ( (lv_value_6_0= ruleScalarExpression ) ) ',' ( (lv_match_8_0= ruleScalarExpression ) ) ',' ( (lv_replacement_10_0= ruleScalarExpression ) ) ')' )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1025:6: ( () 'replace(' ( (lv_value_6_0= ruleScalarExpression ) ) ',' ( (lv_match_8_0= ruleScalarExpression ) ) ',' ( (lv_replacement_10_0= ruleScalarExpression ) ) ')' )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1025:7: () 'replace(' ( (lv_value_6_0= ruleScalarExpression ) ) ',' ( (lv_match_8_0= ruleScalarExpression ) ) ',' ( (lv_replacement_10_0= ruleScalarExpression ) ) ')'
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1025:7: ()
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1026:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getStringFunctionAccess().getStringReplaceAction_1_0().getType().getClassifier());
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getStringFunctionAccess().getStringReplaceAction_1_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    match(input,23,FOLLOW_23_in_ruleStringFunction2118); 

                            createLeafNode(grammarAccess.getStringFunctionAccess().getReplaceKeyword_1_1(), null); 
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1040:1: ( (lv_value_6_0= ruleScalarExpression ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1041:1: (lv_value_6_0= ruleScalarExpression )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1041:1: (lv_value_6_0= ruleScalarExpression )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1042:3: lv_value_6_0= ruleScalarExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getStringFunctionAccess().getValueScalarExpressionParserRuleCall_1_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleScalarExpression_in_ruleStringFunction2139);
                    lv_value_6_0=ruleScalarExpression();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getStringFunctionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"value",
                    	        		lv_value_6_0, 
                    	        		"ScalarExpression", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    match(input,16,FOLLOW_16_in_ruleStringFunction2149); 

                            createLeafNode(grammarAccess.getStringFunctionAccess().getCommaKeyword_1_3(), null); 
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1068:1: ( (lv_match_8_0= ruleScalarExpression ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1069:1: (lv_match_8_0= ruleScalarExpression )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1069:1: (lv_match_8_0= ruleScalarExpression )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1070:3: lv_match_8_0= ruleScalarExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getStringFunctionAccess().getMatchScalarExpressionParserRuleCall_1_4_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleScalarExpression_in_ruleStringFunction2170);
                    lv_match_8_0=ruleScalarExpression();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getStringFunctionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"match",
                    	        		lv_match_8_0, 
                    	        		"ScalarExpression", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    match(input,16,FOLLOW_16_in_ruleStringFunction2180); 

                            createLeafNode(grammarAccess.getStringFunctionAccess().getCommaKeyword_1_5(), null); 
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1096:1: ( (lv_replacement_10_0= ruleScalarExpression ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1097:1: (lv_replacement_10_0= ruleScalarExpression )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1097:1: (lv_replacement_10_0= ruleScalarExpression )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1098:3: lv_replacement_10_0= ruleScalarExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getStringFunctionAccess().getReplacementScalarExpressionParserRuleCall_1_6_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleScalarExpression_in_ruleStringFunction2201);
                    lv_replacement_10_0=ruleScalarExpression();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getStringFunctionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"replacement",
                    	        		lv_replacement_10_0, 
                    	        		"ScalarExpression", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    match(input,22,FOLLOW_22_in_ruleStringFunction2211); 

                            createLeafNode(grammarAccess.getStringFunctionAccess().getRightParenthesisKeyword_1_7(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1125:6: ( () 'urlconform(' ( (lv_value_14_0= ruleScalarExpression ) ) ')' )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1125:6: ( () 'urlconform(' ( (lv_value_14_0= ruleScalarExpression ) ) ')' )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1125:7: () 'urlconform(' ( (lv_value_14_0= ruleScalarExpression ) ) ')'
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1125:7: ()
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1126:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getStringFunctionAccess().getStringUrlConformAction_2_0().getType().getClassifier());
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getStringFunctionAccess().getStringUrlConformAction_2_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    match(input,24,FOLLOW_24_in_ruleStringFunction2238); 

                            createLeafNode(grammarAccess.getStringFunctionAccess().getUrlconformKeyword_2_1(), null); 
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1140:1: ( (lv_value_14_0= ruleScalarExpression ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1141:1: (lv_value_14_0= ruleScalarExpression )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1141:1: (lv_value_14_0= ruleScalarExpression )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1142:3: lv_value_14_0= ruleScalarExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getStringFunctionAccess().getValueScalarExpressionParserRuleCall_2_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleScalarExpression_in_ruleStringFunction2259);
                    lv_value_14_0=ruleScalarExpression();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getStringFunctionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"value",
                    	        		lv_value_14_0, 
                    	        		"ScalarExpression", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    match(input,22,FOLLOW_22_in_ruleStringFunction2269); 

                            createLeafNode(grammarAccess.getStringFunctionAccess().getRightParenthesisKeyword_2_3(), null); 
                        

                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleStringFunction


    // $ANTLR start entryRuleCollectionLiteral
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1176:1: entryRuleCollectionLiteral returns [EObject current=null] : iv_ruleCollectionLiteral= ruleCollectionLiteral EOF ;
    public final EObject entryRuleCollectionLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionLiteral = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1177:2: (iv_ruleCollectionLiteral= ruleCollectionLiteral EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1178:2: iv_ruleCollectionLiteral= ruleCollectionLiteral EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCollectionLiteralRule(), currentNode); 
            pushFollow(FOLLOW_ruleCollectionLiteral_in_entryRuleCollectionLiteral2306);
            iv_ruleCollectionLiteral=ruleCollectionLiteral();
            _fsp--;

             current =iv_ruleCollectionLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollectionLiteral2316); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleCollectionLiteral


    // $ANTLR start ruleCollectionLiteral
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1185:1: ruleCollectionLiteral returns [EObject current=null] : ( '[' ( (lv_items_1_0= ruleScalarExpression ) ) ( ',' ( (lv_items_3_0= ruleScalarExpression ) ) )* ']' ) ;
    public final EObject ruleCollectionLiteral() throws RecognitionException {
        EObject current = null;

        EObject lv_items_1_0 = null;

        EObject lv_items_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1190:6: ( ( '[' ( (lv_items_1_0= ruleScalarExpression ) ) ( ',' ( (lv_items_3_0= ruleScalarExpression ) ) )* ']' ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1191:1: ( '[' ( (lv_items_1_0= ruleScalarExpression ) ) ( ',' ( (lv_items_3_0= ruleScalarExpression ) ) )* ']' )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1191:1: ( '[' ( (lv_items_1_0= ruleScalarExpression ) ) ( ',' ( (lv_items_3_0= ruleScalarExpression ) ) )* ']' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1191:3: '[' ( (lv_items_1_0= ruleScalarExpression ) ) ( ',' ( (lv_items_3_0= ruleScalarExpression ) ) )* ']'
            {
            match(input,25,FOLLOW_25_in_ruleCollectionLiteral2351); 

                    createLeafNode(grammarAccess.getCollectionLiteralAccess().getLeftSquareBracketKeyword_0(), null); 
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1195:1: ( (lv_items_1_0= ruleScalarExpression ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1196:1: (lv_items_1_0= ruleScalarExpression )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1196:1: (lv_items_1_0= ruleScalarExpression )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1197:3: lv_items_1_0= ruleScalarExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getCollectionLiteralAccess().getItemsScalarExpressionParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleScalarExpression_in_ruleCollectionLiteral2372);
            lv_items_1_0=ruleScalarExpression();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getCollectionLiteralRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		add(
            	       			current, 
            	       			"items",
            	        		lv_items_1_0, 
            	        		"ScalarExpression", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1219:2: ( ',' ( (lv_items_3_0= ruleScalarExpression ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==16) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1219:4: ',' ( (lv_items_3_0= ruleScalarExpression ) )
            	    {
            	    match(input,16,FOLLOW_16_in_ruleCollectionLiteral2383); 

            	            createLeafNode(grammarAccess.getCollectionLiteralAccess().getCommaKeyword_2_0(), null); 
            	        
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1223:1: ( (lv_items_3_0= ruleScalarExpression ) )
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1224:1: (lv_items_3_0= ruleScalarExpression )
            	    {
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1224:1: (lv_items_3_0= ruleScalarExpression )
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1225:3: lv_items_3_0= ruleScalarExpression
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getCollectionLiteralAccess().getItemsScalarExpressionParserRuleCall_2_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleScalarExpression_in_ruleCollectionLiteral2404);
            	    lv_items_3_0=ruleScalarExpression();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getCollectionLiteralRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"items",
            	    	        		lv_items_3_0, 
            	    	        		"ScalarExpression", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            match(input,26,FOLLOW_26_in_ruleCollectionLiteral2416); 

                    createLeafNode(grammarAccess.getCollectionLiteralAccess().getRightSquareBracketKeyword_3(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleCollectionLiteral


    // $ANTLR start entryRuleCollectionFunction
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1259:1: entryRuleCollectionFunction returns [EObject current=null] : iv_ruleCollectionFunction= ruleCollectionFunction EOF ;
    public final EObject entryRuleCollectionFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionFunction = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1260:2: (iv_ruleCollectionFunction= ruleCollectionFunction EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1261:2: iv_ruleCollectionFunction= ruleCollectionFunction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCollectionFunctionRule(), currentNode); 
            pushFollow(FOLLOW_ruleCollectionFunction_in_entryRuleCollectionFunction2452);
            iv_ruleCollectionFunction=ruleCollectionFunction();
            _fsp--;

             current =iv_ruleCollectionFunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollectionFunction2462); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleCollectionFunction


    // $ANTLR start ruleCollectionFunction
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1268:1: ruleCollectionFunction returns [EObject current=null] : ( () 'split(' ( (lv_value_2_0= ruleScalarExpression ) ) ',' ( (lv_delimiter_4_0= ruleScalarExpression ) ) ')' ) ;
    public final EObject ruleCollectionFunction() throws RecognitionException {
        EObject current = null;

        EObject lv_value_2_0 = null;

        EObject lv_delimiter_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1273:6: ( ( () 'split(' ( (lv_value_2_0= ruleScalarExpression ) ) ',' ( (lv_delimiter_4_0= ruleScalarExpression ) ) ')' ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1274:1: ( () 'split(' ( (lv_value_2_0= ruleScalarExpression ) ) ',' ( (lv_delimiter_4_0= ruleScalarExpression ) ) ')' )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1274:1: ( () 'split(' ( (lv_value_2_0= ruleScalarExpression ) ) ',' ( (lv_delimiter_4_0= ruleScalarExpression ) ) ')' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1274:2: () 'split(' ( (lv_value_2_0= ruleScalarExpression ) ) ',' ( (lv_delimiter_4_0= ruleScalarExpression ) ) ')'
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1274:2: ()
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1275:5: 
            {
             
                    temp=factory.create(grammarAccess.getCollectionFunctionAccess().getStringSplitAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getCollectionFunctionAccess().getStringSplitAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,27,FOLLOW_27_in_ruleCollectionFunction2506); 

                    createLeafNode(grammarAccess.getCollectionFunctionAccess().getSplitKeyword_1(), null); 
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1289:1: ( (lv_value_2_0= ruleScalarExpression ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1290:1: (lv_value_2_0= ruleScalarExpression )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1290:1: (lv_value_2_0= ruleScalarExpression )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1291:3: lv_value_2_0= ruleScalarExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getCollectionFunctionAccess().getValueScalarExpressionParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleScalarExpression_in_ruleCollectionFunction2527);
            lv_value_2_0=ruleScalarExpression();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getCollectionFunctionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"value",
            	        		lv_value_2_0, 
            	        		"ScalarExpression", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,16,FOLLOW_16_in_ruleCollectionFunction2537); 

                    createLeafNode(grammarAccess.getCollectionFunctionAccess().getCommaKeyword_3(), null); 
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1317:1: ( (lv_delimiter_4_0= ruleScalarExpression ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1318:1: (lv_delimiter_4_0= ruleScalarExpression )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1318:1: (lv_delimiter_4_0= ruleScalarExpression )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1319:3: lv_delimiter_4_0= ruleScalarExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getCollectionFunctionAccess().getDelimiterScalarExpressionParserRuleCall_4_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleScalarExpression_in_ruleCollectionFunction2558);
            lv_delimiter_4_0=ruleScalarExpression();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getCollectionFunctionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"delimiter",
            	        		lv_delimiter_4_0, 
            	        		"ScalarExpression", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,22,FOLLOW_22_in_ruleCollectionFunction2568); 

                    createLeafNode(grammarAccess.getCollectionFunctionAccess().getRightParenthesisKeyword_5(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleCollectionFunction


    // $ANTLR start entryRuleApplication
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1353:1: entryRuleApplication returns [EObject current=null] : iv_ruleApplication= ruleApplication EOF ;
    public final EObject entryRuleApplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplication = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1354:2: (iv_ruleApplication= ruleApplication EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1355:2: iv_ruleApplication= ruleApplication EOF
            {
             currentNode = createCompositeNode(grammarAccess.getApplicationRule(), currentNode); 
            pushFollow(FOLLOW_ruleApplication_in_entryRuleApplication2604);
            iv_ruleApplication=ruleApplication();
            _fsp--;

             current =iv_ruleApplication; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplication2614); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleApplication


    // $ANTLR start ruleApplication
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1362:1: ruleApplication returns [EObject current=null] : ( ( ( (lv_tabbarApplication_0_0= 'tabbarApp' ) ) | 'app' ) ( (lv_name_2_0= RULE_ID ) ) '{' 'appicon' '=' ( (lv_appicon_6_0= ruleScalarExpression ) ) 'splash' '=' ( (lv_splash_9_0= ruleScalarExpression ) ) 'mainview' '=' ( (lv_mainview_12_0= ruleViewCall ) ) ( (lv_buttons_13_0= ruleButton ) )* '}' ) ;
    public final EObject ruleApplication() throws RecognitionException {
        EObject current = null;

        Token lv_tabbarApplication_0_0=null;
        Token lv_name_2_0=null;
        EObject lv_appicon_6_0 = null;

        EObject lv_splash_9_0 = null;

        EObject lv_mainview_12_0 = null;

        EObject lv_buttons_13_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1367:6: ( ( ( ( (lv_tabbarApplication_0_0= 'tabbarApp' ) ) | 'app' ) ( (lv_name_2_0= RULE_ID ) ) '{' 'appicon' '=' ( (lv_appicon_6_0= ruleScalarExpression ) ) 'splash' '=' ( (lv_splash_9_0= ruleScalarExpression ) ) 'mainview' '=' ( (lv_mainview_12_0= ruleViewCall ) ) ( (lv_buttons_13_0= ruleButton ) )* '}' ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1368:1: ( ( ( (lv_tabbarApplication_0_0= 'tabbarApp' ) ) | 'app' ) ( (lv_name_2_0= RULE_ID ) ) '{' 'appicon' '=' ( (lv_appicon_6_0= ruleScalarExpression ) ) 'splash' '=' ( (lv_splash_9_0= ruleScalarExpression ) ) 'mainview' '=' ( (lv_mainview_12_0= ruleViewCall ) ) ( (lv_buttons_13_0= ruleButton ) )* '}' )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1368:1: ( ( ( (lv_tabbarApplication_0_0= 'tabbarApp' ) ) | 'app' ) ( (lv_name_2_0= RULE_ID ) ) '{' 'appicon' '=' ( (lv_appicon_6_0= ruleScalarExpression ) ) 'splash' '=' ( (lv_splash_9_0= ruleScalarExpression ) ) 'mainview' '=' ( (lv_mainview_12_0= ruleViewCall ) ) ( (lv_buttons_13_0= ruleButton ) )* '}' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1368:2: ( ( (lv_tabbarApplication_0_0= 'tabbarApp' ) ) | 'app' ) ( (lv_name_2_0= RULE_ID ) ) '{' 'appicon' '=' ( (lv_appicon_6_0= ruleScalarExpression ) ) 'splash' '=' ( (lv_splash_9_0= ruleScalarExpression ) ) 'mainview' '=' ( (lv_mainview_12_0= ruleViewCall ) ) ( (lv_buttons_13_0= ruleButton ) )* '}'
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1368:2: ( ( (lv_tabbarApplication_0_0= 'tabbarApp' ) ) | 'app' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==28) ) {
                alt14=1;
            }
            else if ( (LA14_0==29) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1368:2: ( ( (lv_tabbarApplication_0_0= 'tabbarApp' ) ) | 'app' )", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1368:3: ( (lv_tabbarApplication_0_0= 'tabbarApp' ) )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1368:3: ( (lv_tabbarApplication_0_0= 'tabbarApp' ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1369:1: (lv_tabbarApplication_0_0= 'tabbarApp' )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1369:1: (lv_tabbarApplication_0_0= 'tabbarApp' )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1370:3: lv_tabbarApplication_0_0= 'tabbarApp'
                    {
                    lv_tabbarApplication_0_0=(Token)input.LT(1);
                    match(input,28,FOLLOW_28_in_ruleApplication2658); 

                            createLeafNode(grammarAccess.getApplicationAccess().getTabbarApplicationTabbarAppKeyword_0_0_0(), "tabbarApplication"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getApplicationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "tabbarApplication", true, "tabbarApp", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1390:7: 'app'
                    {
                    match(input,29,FOLLOW_29_in_ruleApplication2687); 

                            createLeafNode(grammarAccess.getApplicationAccess().getAppKeyword_0_1(), null); 
                        

                    }
                    break;

            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1394:2: ( (lv_name_2_0= RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1395:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1395:1: (lv_name_2_0= RULE_ID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1396:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleApplication2705); 

            			createLeafNode(grammarAccess.getApplicationAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getApplicationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_2_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,13,FOLLOW_13_in_ruleApplication2720); 

                    createLeafNode(grammarAccess.getApplicationAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            match(input,30,FOLLOW_30_in_ruleApplication2730); 

                    createLeafNode(grammarAccess.getApplicationAccess().getAppiconKeyword_3(), null); 
                
            match(input,12,FOLLOW_12_in_ruleApplication2740); 

                    createLeafNode(grammarAccess.getApplicationAccess().getEqualsSignKeyword_4(), null); 
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1430:1: ( (lv_appicon_6_0= ruleScalarExpression ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1431:1: (lv_appicon_6_0= ruleScalarExpression )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1431:1: (lv_appicon_6_0= ruleScalarExpression )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1432:3: lv_appicon_6_0= ruleScalarExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getApplicationAccess().getAppiconScalarExpressionParserRuleCall_5_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleScalarExpression_in_ruleApplication2761);
            lv_appicon_6_0=ruleScalarExpression();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getApplicationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"appicon",
            	        		lv_appicon_6_0, 
            	        		"ScalarExpression", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,31,FOLLOW_31_in_ruleApplication2771); 

                    createLeafNode(grammarAccess.getApplicationAccess().getSplashKeyword_6(), null); 
                
            match(input,12,FOLLOW_12_in_ruleApplication2781); 

                    createLeafNode(grammarAccess.getApplicationAccess().getEqualsSignKeyword_7(), null); 
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1462:1: ( (lv_splash_9_0= ruleScalarExpression ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1463:1: (lv_splash_9_0= ruleScalarExpression )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1463:1: (lv_splash_9_0= ruleScalarExpression )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1464:3: lv_splash_9_0= ruleScalarExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getApplicationAccess().getSplashScalarExpressionParserRuleCall_8_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleScalarExpression_in_ruleApplication2802);
            lv_splash_9_0=ruleScalarExpression();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getApplicationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"splash",
            	        		lv_splash_9_0, 
            	        		"ScalarExpression", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,32,FOLLOW_32_in_ruleApplication2812); 

                    createLeafNode(grammarAccess.getApplicationAccess().getMainviewKeyword_9(), null); 
                
            match(input,12,FOLLOW_12_in_ruleApplication2822); 

                    createLeafNode(grammarAccess.getApplicationAccess().getEqualsSignKeyword_10(), null); 
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1494:1: ( (lv_mainview_12_0= ruleViewCall ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1495:1: (lv_mainview_12_0= ruleViewCall )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1495:1: (lv_mainview_12_0= ruleViewCall )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1496:3: lv_mainview_12_0= ruleViewCall
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getApplicationAccess().getMainviewViewCallParserRuleCall_11_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleViewCall_in_ruleApplication2843);
            lv_mainview_12_0=ruleViewCall();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getApplicationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"mainview",
            	        		lv_mainview_12_0, 
            	        		"ViewCall", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1518:2: ( (lv_buttons_13_0= ruleButton ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( LA15_0 ==33 && getUnorderedGroupHelper().canSelect(grammarAccess.getButtonAccess().getUnorderedGroup(), 0) ) {
                    alt15=1;
                }
                else if ( LA15_0 ==14 && getUnorderedGroupHelper().canSelect(grammarAccess.getButtonAccess().getUnorderedGroup(), 1) ) {
                    alt15=1;
                }
                else if ( LA15_0 >=35 && LA15_0<=36 && getUnorderedGroupHelper().canSelect(grammarAccess.getButtonAccess().getUnorderedGroup(), 2) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1519:1: (lv_buttons_13_0= ruleButton )
            	    {
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1519:1: (lv_buttons_13_0= ruleButton )
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1520:3: lv_buttons_13_0= ruleButton
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getApplicationAccess().getButtonsButtonParserRuleCall_12_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleButton_in_ruleApplication2864);
            	    lv_buttons_13_0=ruleButton();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getApplicationRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"buttons",
            	    	        		lv_buttons_13_0, 
            	    	        		"Button", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            match(input,17,FOLLOW_17_in_ruleApplication2875); 

                    createLeafNode(grammarAccess.getApplicationAccess().getRightCurlyBracketKeyword_13(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleApplication


    // $ANTLR start entryRuleButton
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1554:1: entryRuleButton returns [EObject current=null] : iv_ruleButton= ruleButton EOF ;
    public final EObject entryRuleButton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleButton = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1555:2: (iv_ruleButton= ruleButton EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1556:2: iv_ruleButton= ruleButton EOF
            {
             currentNode = createCompositeNode(grammarAccess.getButtonRule(), currentNode); 
            pushFollow(FOLLOW_ruleButton_in_entryRuleButton2911);
            iv_ruleButton=ruleButton();
            _fsp--;

             current =iv_ruleButton; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleButton2921); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleButton


    // $ANTLR start ruleButton
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1563:1: ruleButton returns [EObject current=null] : ( ( ( ( ({...}? => ( ( 'button' '{' ( 'title' '=' ( (lv_title_5_0= ruleScalarExpression ) ) )? ) ) ) | ({...}? => ( ( 'icon' '=' ( (lv_icon_8_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( ( ( 'view' '=' ( (lv_view_11_0= ruleViewCall ) ) ) | ( 'handler' '=' ( (lv_handler_14_0= RULE_STRING ) ) ) ) '}' ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleButton() throws RecognitionException {
        EObject current = null;

        Token lv_handler_14_0=null;
        EObject lv_title_5_0 = null;

        EObject lv_icon_8_0 = null;

        EObject lv_view_11_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1568:6: ( ( ( ( ( ({...}? => ( ( 'button' '{' ( 'title' '=' ( (lv_title_5_0= ruleScalarExpression ) ) )? ) ) ) | ({...}? => ( ( 'icon' '=' ( (lv_icon_8_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( ( ( 'view' '=' ( (lv_view_11_0= ruleViewCall ) ) ) | ( 'handler' '=' ( (lv_handler_14_0= RULE_STRING ) ) ) ) '}' ) ) ) )+ {...}?) ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1569:1: ( ( ( ( ({...}? => ( ( 'button' '{' ( 'title' '=' ( (lv_title_5_0= ruleScalarExpression ) ) )? ) ) ) | ({...}? => ( ( 'icon' '=' ( (lv_icon_8_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( ( ( 'view' '=' ( (lv_view_11_0= ruleViewCall ) ) ) | ( 'handler' '=' ( (lv_handler_14_0= RULE_STRING ) ) ) ) '}' ) ) ) )+ {...}?) ) )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1569:1: ( ( ( ( ({...}? => ( ( 'button' '{' ( 'title' '=' ( (lv_title_5_0= ruleScalarExpression ) ) )? ) ) ) | ({...}? => ( ( 'icon' '=' ( (lv_icon_8_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( ( ( 'view' '=' ( (lv_view_11_0= ruleViewCall ) ) ) | ( 'handler' '=' ( (lv_handler_14_0= RULE_STRING ) ) ) ) '}' ) ) ) )+ {...}?) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1571:1: ( ( ( ({...}? => ( ( 'button' '{' ( 'title' '=' ( (lv_title_5_0= ruleScalarExpression ) ) )? ) ) ) | ({...}? => ( ( 'icon' '=' ( (lv_icon_8_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( ( ( 'view' '=' ( (lv_view_11_0= ruleViewCall ) ) ) | ( 'handler' '=' ( (lv_handler_14_0= RULE_STRING ) ) ) ) '}' ) ) ) )+ {...}?) )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1571:1: ( ( ( ({...}? => ( ( 'button' '{' ( 'title' '=' ( (lv_title_5_0= ruleScalarExpression ) ) )? ) ) ) | ({...}? => ( ( 'icon' '=' ( (lv_icon_8_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( ( ( 'view' '=' ( (lv_view_11_0= ruleViewCall ) ) ) | ( 'handler' '=' ( (lv_handler_14_0= RULE_STRING ) ) ) ) '}' ) ) ) )+ {...}?) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1572:2: ( ( ({...}? => ( ( 'button' '{' ( 'title' '=' ( (lv_title_5_0= ruleScalarExpression ) ) )? ) ) ) | ({...}? => ( ( 'icon' '=' ( (lv_icon_8_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( ( ( 'view' '=' ( (lv_view_11_0= ruleViewCall ) ) ) | ( 'handler' '=' ( (lv_handler_14_0= RULE_STRING ) ) ) ) '}' ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getButtonAccess().getUnorderedGroup());
            	
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1575:2: ( ( ({...}? => ( ( 'button' '{' ( 'title' '=' ( (lv_title_5_0= ruleScalarExpression ) ) )? ) ) ) | ({...}? => ( ( 'icon' '=' ( (lv_icon_8_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( ( ( 'view' '=' ( (lv_view_11_0= ruleViewCall ) ) ) | ( 'handler' '=' ( (lv_handler_14_0= RULE_STRING ) ) ) ) '}' ) ) ) )+ {...}?)
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1576:3: ( ({...}? => ( ( 'button' '{' ( 'title' '=' ( (lv_title_5_0= ruleScalarExpression ) ) )? ) ) ) | ({...}? => ( ( 'icon' '=' ( (lv_icon_8_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( ( ( 'view' '=' ( (lv_view_11_0= ruleViewCall ) ) ) | ( 'handler' '=' ( (lv_handler_14_0= RULE_STRING ) ) ) ) '}' ) ) ) )+ {...}?
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1576:3: ( ({...}? => ( ( 'button' '{' ( 'title' '=' ( (lv_title_5_0= ruleScalarExpression ) ) )? ) ) ) | ({...}? => ( ( 'icon' '=' ( (lv_icon_8_0= ruleScalarExpression ) ) ) ) ) | ({...}? => ( ( ( ( 'view' '=' ( (lv_view_11_0= ruleViewCall ) ) ) | ( 'handler' '=' ( (lv_handler_14_0= RULE_STRING ) ) ) ) '}' ) ) ) )+
            int cnt18=0;
            loop18:
            do {
                int alt18=4;
                int LA18_0 = input.LA(1);

                if ( LA18_0 ==33 && getUnorderedGroupHelper().canSelect(grammarAccess.getButtonAccess().getUnorderedGroup(), 0) ) {
                    int LA18_2 = input.LA(2);

                    if ( getUnorderedGroupHelper().canSelect(grammarAccess.getButtonAccess().getUnorderedGroup(), 0) ) {
                        alt18=1;
                    }


                }
                else if ( LA18_0 ==14 && getUnorderedGroupHelper().canSelect(grammarAccess.getButtonAccess().getUnorderedGroup(), 1) ) {
                    int LA18_3 = input.LA(2);

                    if ( getUnorderedGroupHelper().canSelect(grammarAccess.getButtonAccess().getUnorderedGroup(), 1) ) {
                        alt18=2;
                    }


                }
                else if ( LA18_0 ==35 && getUnorderedGroupHelper().canSelect(grammarAccess.getButtonAccess().getUnorderedGroup(), 2) ) {
                    int LA18_4 = input.LA(2);

                    if ( getUnorderedGroupHelper().canSelect(grammarAccess.getButtonAccess().getUnorderedGroup(), 2) ) {
                        alt18=3;
                    }


                }
                else if ( LA18_0 ==36 && getUnorderedGroupHelper().canSelect(grammarAccess.getButtonAccess().getUnorderedGroup(), 2) ) {
                    int LA18_5 = input.LA(2);

                    if ( getUnorderedGroupHelper().canSelect(grammarAccess.getButtonAccess().getUnorderedGroup(), 2) ) {
                        alt18=3;
                    }


                }


                switch (alt18) {
            	case 1 :
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1578:4: ({...}? => ( ( 'button' '{' ( 'title' '=' ( (lv_title_5_0= ruleScalarExpression ) ) )? ) ) )
            	    {
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1578:4: ({...}? => ( ( 'button' '{' ( 'title' '=' ( (lv_title_5_0= ruleScalarExpression ) ) )? ) ) )
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1579:5: {...}? => ( ( 'button' '{' ( 'title' '=' ( (lv_title_5_0= ruleScalarExpression ) ) )? ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getButtonAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleButton", "getUnorderedGroupHelper().canSelect(grammarAccess.getButtonAccess().getUnorderedGroup(), 0)");
            	    }
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1579:101: ( ( 'button' '{' ( 'title' '=' ( (lv_title_5_0= ruleScalarExpression ) ) )? ) )
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1580:6: ( 'button' '{' ( 'title' '=' ( (lv_title_5_0= ruleScalarExpression ) ) )? )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getButtonAccess().getUnorderedGroup(), 0);
            	    	 				
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1583:6: ( 'button' '{' ( 'title' '=' ( (lv_title_5_0= ruleScalarExpression ) ) )? )
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1583:8: 'button' '{' ( 'title' '=' ( (lv_title_5_0= ruleScalarExpression ) ) )?
            	    {
            	    match(input,33,FOLLOW_33_in_ruleButton2998); 

            	            createLeafNode(grammarAccess.getButtonAccess().getButtonKeyword_0_0(), null); 
            	        
            	    match(input,13,FOLLOW_13_in_ruleButton3008); 

            	            createLeafNode(grammarAccess.getButtonAccess().getLeftCurlyBracketKeyword_0_1(), null); 
            	        
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1591:1: ( 'title' '=' ( (lv_title_5_0= ruleScalarExpression ) ) )?
            	    int alt16=2;
            	    int LA16_0 = input.LA(1);

            	    if ( (LA16_0==34) ) {
            	        alt16=1;
            	    }
            	    switch (alt16) {
            	        case 1 :
            	            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1591:3: 'title' '=' ( (lv_title_5_0= ruleScalarExpression ) )
            	            {
            	            match(input,34,FOLLOW_34_in_ruleButton3019); 

            	                    createLeafNode(grammarAccess.getButtonAccess().getTitleKeyword_0_2_0(), null); 
            	                
            	            match(input,12,FOLLOW_12_in_ruleButton3029); 

            	                    createLeafNode(grammarAccess.getButtonAccess().getEqualsSignKeyword_0_2_1(), null); 
            	                
            	            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1599:1: ( (lv_title_5_0= ruleScalarExpression ) )
            	            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1600:1: (lv_title_5_0= ruleScalarExpression )
            	            {
            	            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1600:1: (lv_title_5_0= ruleScalarExpression )
            	            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1601:3: lv_title_5_0= ruleScalarExpression
            	            {
            	             
            	            	        currentNode=createCompositeNode(grammarAccess.getButtonAccess().getTitleScalarExpressionParserRuleCall_0_2_2_0(), currentNode); 
            	            	    
            	            pushFollow(FOLLOW_ruleScalarExpression_in_ruleButton3050);
            	            lv_title_5_0=ruleScalarExpression();
            	            _fsp--;


            	            	        if (current==null) {
            	            	            current = factory.create(grammarAccess.getButtonRule().getType().getClassifier());
            	            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	            	        }
            	            	        try {
            	            	       		set(
            	            	       			current, 
            	            	       			"title",
            	            	        		lv_title_5_0, 
            	            	        		"ScalarExpression", 
            	            	        		currentNode);
            	            	        } catch (ValueConverterException vce) {
            	            				handleValueConverterException(vce);
            	            	        }
            	            	        currentNode = currentNode.getParent();
            	            	    

            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getButtonAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1630:4: ({...}? => ( ( 'icon' '=' ( (lv_icon_8_0= ruleScalarExpression ) ) ) ) )
            	    {
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1630:4: ({...}? => ( ( 'icon' '=' ( (lv_icon_8_0= ruleScalarExpression ) ) ) ) )
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1631:5: {...}? => ( ( 'icon' '=' ( (lv_icon_8_0= ruleScalarExpression ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getButtonAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleButton", "getUnorderedGroupHelper().canSelect(grammarAccess.getButtonAccess().getUnorderedGroup(), 1)");
            	    }
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1631:101: ( ( 'icon' '=' ( (lv_icon_8_0= ruleScalarExpression ) ) ) )
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1632:6: ( 'icon' '=' ( (lv_icon_8_0= ruleScalarExpression ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getButtonAccess().getUnorderedGroup(), 1);
            	    	 				
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1635:6: ( 'icon' '=' ( (lv_icon_8_0= ruleScalarExpression ) ) )
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1635:8: 'icon' '=' ( (lv_icon_8_0= ruleScalarExpression ) )
            	    {
            	    match(input,14,FOLLOW_14_in_ruleButton3114); 

            	            createLeafNode(grammarAccess.getButtonAccess().getIconKeyword_1_0(), null); 
            	        
            	    match(input,12,FOLLOW_12_in_ruleButton3124); 

            	            createLeafNode(grammarAccess.getButtonAccess().getEqualsSignKeyword_1_1(), null); 
            	        
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1643:1: ( (lv_icon_8_0= ruleScalarExpression ) )
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1644:1: (lv_icon_8_0= ruleScalarExpression )
            	    {
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1644:1: (lv_icon_8_0= ruleScalarExpression )
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1645:3: lv_icon_8_0= ruleScalarExpression
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getButtonAccess().getIconScalarExpressionParserRuleCall_1_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleScalarExpression_in_ruleButton3145);
            	    lv_icon_8_0=ruleScalarExpression();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getButtonRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"icon",
            	    	        		lv_icon_8_0, 
            	    	        		"ScalarExpression", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getButtonAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1674:4: ({...}? => ( ( ( ( 'view' '=' ( (lv_view_11_0= ruleViewCall ) ) ) | ( 'handler' '=' ( (lv_handler_14_0= RULE_STRING ) ) ) ) '}' ) ) )
            	    {
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1674:4: ({...}? => ( ( ( ( 'view' '=' ( (lv_view_11_0= ruleViewCall ) ) ) | ( 'handler' '=' ( (lv_handler_14_0= RULE_STRING ) ) ) ) '}' ) ) )
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1675:5: {...}? => ( ( ( ( 'view' '=' ( (lv_view_11_0= ruleViewCall ) ) ) | ( 'handler' '=' ( (lv_handler_14_0= RULE_STRING ) ) ) ) '}' ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getButtonAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleButton", "getUnorderedGroupHelper().canSelect(grammarAccess.getButtonAccess().getUnorderedGroup(), 2)");
            	    }
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1675:101: ( ( ( ( 'view' '=' ( (lv_view_11_0= ruleViewCall ) ) ) | ( 'handler' '=' ( (lv_handler_14_0= RULE_STRING ) ) ) ) '}' ) )
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1676:6: ( ( ( 'view' '=' ( (lv_view_11_0= ruleViewCall ) ) ) | ( 'handler' '=' ( (lv_handler_14_0= RULE_STRING ) ) ) ) '}' )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getButtonAccess().getUnorderedGroup(), 2);
            	    	 				
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1679:6: ( ( ( 'view' '=' ( (lv_view_11_0= ruleViewCall ) ) ) | ( 'handler' '=' ( (lv_handler_14_0= RULE_STRING ) ) ) ) '}' )
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1679:7: ( ( 'view' '=' ( (lv_view_11_0= ruleViewCall ) ) ) | ( 'handler' '=' ( (lv_handler_14_0= RULE_STRING ) ) ) ) '}'
            	    {
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1679:7: ( ( 'view' '=' ( (lv_view_11_0= ruleViewCall ) ) ) | ( 'handler' '=' ( (lv_handler_14_0= RULE_STRING ) ) ) )
            	    int alt17=2;
            	    int LA17_0 = input.LA(1);

            	    if ( (LA17_0==35) ) {
            	        alt17=1;
            	    }
            	    else if ( (LA17_0==36) ) {
            	        alt17=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("1679:7: ( ( 'view' '=' ( (lv_view_11_0= ruleViewCall ) ) ) | ( 'handler' '=' ( (lv_handler_14_0= RULE_STRING ) ) ) )", 17, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt17) {
            	        case 1 :
            	            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1679:8: ( 'view' '=' ( (lv_view_11_0= ruleViewCall ) ) )
            	            {
            	            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1679:8: ( 'view' '=' ( (lv_view_11_0= ruleViewCall ) ) )
            	            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1679:10: 'view' '=' ( (lv_view_11_0= ruleViewCall ) )
            	            {
            	            match(input,35,FOLLOW_35_in_ruleButton3209); 

            	                    createLeafNode(grammarAccess.getButtonAccess().getViewKeyword_2_0_0_0(), null); 
            	                
            	            match(input,12,FOLLOW_12_in_ruleButton3219); 

            	                    createLeafNode(grammarAccess.getButtonAccess().getEqualsSignKeyword_2_0_0_1(), null); 
            	                
            	            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1687:1: ( (lv_view_11_0= ruleViewCall ) )
            	            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1688:1: (lv_view_11_0= ruleViewCall )
            	            {
            	            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1688:1: (lv_view_11_0= ruleViewCall )
            	            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1689:3: lv_view_11_0= ruleViewCall
            	            {
            	             
            	            	        currentNode=createCompositeNode(grammarAccess.getButtonAccess().getViewViewCallParserRuleCall_2_0_0_2_0(), currentNode); 
            	            	    
            	            pushFollow(FOLLOW_ruleViewCall_in_ruleButton3240);
            	            lv_view_11_0=ruleViewCall();
            	            _fsp--;


            	            	        if (current==null) {
            	            	            current = factory.create(grammarAccess.getButtonRule().getType().getClassifier());
            	            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	            	        }
            	            	        try {
            	            	       		set(
            	            	       			current, 
            	            	       			"view",
            	            	        		lv_view_11_0, 
            	            	        		"ViewCall", 
            	            	        		currentNode);
            	            	        } catch (ValueConverterException vce) {
            	            				handleValueConverterException(vce);
            	            	        }
            	            	        currentNode = currentNode.getParent();
            	            	    

            	            }


            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1712:6: ( 'handler' '=' ( (lv_handler_14_0= RULE_STRING ) ) )
            	            {
            	            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1712:6: ( 'handler' '=' ( (lv_handler_14_0= RULE_STRING ) ) )
            	            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1712:8: 'handler' '=' ( (lv_handler_14_0= RULE_STRING ) )
            	            {
            	            match(input,36,FOLLOW_36_in_ruleButton3258); 

            	                    createLeafNode(grammarAccess.getButtonAccess().getHandlerKeyword_2_0_1_0(), null); 
            	                
            	            match(input,12,FOLLOW_12_in_ruleButton3268); 

            	                    createLeafNode(grammarAccess.getButtonAccess().getEqualsSignKeyword_2_0_1_1(), null); 
            	                
            	            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1720:1: ( (lv_handler_14_0= RULE_STRING ) )
            	            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1721:1: (lv_handler_14_0= RULE_STRING )
            	            {
            	            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1721:1: (lv_handler_14_0= RULE_STRING )
            	            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1722:3: lv_handler_14_0= RULE_STRING
            	            {
            	            lv_handler_14_0=(Token)input.LT(1);
            	            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleButton3285); 

            	            			createLeafNode(grammarAccess.getButtonAccess().getHandlerSTRINGTerminalRuleCall_2_0_1_2_0(), "handler"); 
            	            		

            	            	        if (current==null) {
            	            	            current = factory.create(grammarAccess.getButtonRule().getType().getClassifier());
            	            	            associateNodeWithAstElement(currentNode, current);
            	            	        }
            	            	        try {
            	            	       		set(
            	            	       			current, 
            	            	       			"handler",
            	            	        		lv_handler_14_0, 
            	            	        		"STRING", 
            	            	        		lastConsumedNode);
            	            	        } catch (ValueConverterException vce) {
            	            				handleValueConverterException(vce);
            	            	        }
            	            	    

            	            }


            	            }


            	            }


            	            }
            	            break;

            	    }

            	    match(input,17,FOLLOW_17_in_ruleButton3302); 

            	            createLeafNode(grammarAccess.getButtonAccess().getRightCurlyBracketKeyword_2_1(), null); 
            	        

            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getButtonAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getButtonAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "ruleButton", "getUnorderedGroupHelper().canLeave(grammarAccess.getButtonAccess().getUnorderedGroup())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getButtonAccess().getUnorderedGroup());
            	

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleButton


    // $ANTLR start entryRuleConstant
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1771:1: entryRuleConstant returns [EObject current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final EObject entryRuleConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstant = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1772:2: (iv_ruleConstant= ruleConstant EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1773:2: iv_ruleConstant= ruleConstant EOF
            {
             currentNode = createCompositeNode(grammarAccess.getConstantRule(), currentNode); 
            pushFollow(FOLLOW_ruleConstant_in_entryRuleConstant3383);
            iv_ruleConstant=ruleConstant();
            _fsp--;

             current =iv_ruleConstant; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstant3393); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleConstant


    // $ANTLR start ruleConstant
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1780:1: ruleConstant returns [EObject current=null] : ( () 'const' ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_language_3_1= 'de=' | lv_language_3_2= 'en=' ) ) )? ( (lv_value_4_0= ruleScalarExpression ) ) ( ',' ( ( (lv_language_6_1= 'de=' | lv_language_6_2= 'en=' ) ) )? ( (lv_value_7_0= ruleScalarExpression ) ) )* ) ;
    public final EObject ruleConstant() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        Token lv_language_3_1=null;
        Token lv_language_3_2=null;
        Token lv_language_6_1=null;
        Token lv_language_6_2=null;
        EObject lv_value_4_0 = null;

        EObject lv_value_7_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1785:6: ( ( () 'const' ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_language_3_1= 'de=' | lv_language_3_2= 'en=' ) ) )? ( (lv_value_4_0= ruleScalarExpression ) ) ( ',' ( ( (lv_language_6_1= 'de=' | lv_language_6_2= 'en=' ) ) )? ( (lv_value_7_0= ruleScalarExpression ) ) )* ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1786:1: ( () 'const' ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_language_3_1= 'de=' | lv_language_3_2= 'en=' ) ) )? ( (lv_value_4_0= ruleScalarExpression ) ) ( ',' ( ( (lv_language_6_1= 'de=' | lv_language_6_2= 'en=' ) ) )? ( (lv_value_7_0= ruleScalarExpression ) ) )* )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1786:1: ( () 'const' ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_language_3_1= 'de=' | lv_language_3_2= 'en=' ) ) )? ( (lv_value_4_0= ruleScalarExpression ) ) ( ',' ( ( (lv_language_6_1= 'de=' | lv_language_6_2= 'en=' ) ) )? ( (lv_value_7_0= ruleScalarExpression ) ) )* )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1786:2: () 'const' ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_language_3_1= 'de=' | lv_language_3_2= 'en=' ) ) )? ( (lv_value_4_0= ruleScalarExpression ) ) ( ',' ( ( (lv_language_6_1= 'de=' | lv_language_6_2= 'en=' ) ) )? ( (lv_value_7_0= ruleScalarExpression ) ) )*
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1786:2: ()
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1787:5: 
            {
             
                    temp=factory.create(grammarAccess.getConstantAccess().getConstantAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getConstantAccess().getConstantAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,37,FOLLOW_37_in_ruleConstant3437); 

                    createLeafNode(grammarAccess.getConstantAccess().getConstKeyword_1(), null); 
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1801:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1802:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1802:1: (lv_name_2_0= RULE_ID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1803:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstant3454); 

            			createLeafNode(grammarAccess.getConstantAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getConstantRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_2_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1825:2: ( ( (lv_language_3_1= 'de=' | lv_language_3_2= 'en=' ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=38 && LA20_0<=39)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1826:1: ( (lv_language_3_1= 'de=' | lv_language_3_2= 'en=' ) )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1826:1: ( (lv_language_3_1= 'de=' | lv_language_3_2= 'en=' ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1827:1: (lv_language_3_1= 'de=' | lv_language_3_2= 'en=' )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1827:1: (lv_language_3_1= 'de=' | lv_language_3_2= 'en=' )
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==38) ) {
                        alt19=1;
                    }
                    else if ( (LA19_0==39) ) {
                        alt19=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1827:1: (lv_language_3_1= 'de=' | lv_language_3_2= 'en=' )", 19, 0, input);

                        throw nvae;
                    }
                    switch (alt19) {
                        case 1 :
                            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1828:3: lv_language_3_1= 'de='
                            {
                            lv_language_3_1=(Token)input.LT(1);
                            match(input,38,FOLLOW_38_in_ruleConstant3479); 

                                    createLeafNode(grammarAccess.getConstantAccess().getLanguageDeKeyword_3_0_0(), "language"); 
                                

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getConstantRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		add(current, "language", lv_language_3_1, null, lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }
                            break;
                        case 2 :
                            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1846:8: lv_language_3_2= 'en='
                            {
                            lv_language_3_2=(Token)input.LT(1);
                            match(input,39,FOLLOW_39_in_ruleConstant3508); 

                                    createLeafNode(grammarAccess.getConstantAccess().getLanguageEnKeyword_3_0_1(), "language"); 
                                

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getConstantRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		add(current, "language", lv_language_3_2, null, lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1867:3: ( (lv_value_4_0= ruleScalarExpression ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1868:1: (lv_value_4_0= ruleScalarExpression )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1868:1: (lv_value_4_0= ruleScalarExpression )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1869:3: lv_value_4_0= ruleScalarExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getConstantAccess().getValueScalarExpressionParserRuleCall_4_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleScalarExpression_in_ruleConstant3546);
            lv_value_4_0=ruleScalarExpression();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getConstantRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		add(
            	       			current, 
            	       			"value",
            	        		lv_value_4_0, 
            	        		"ScalarExpression", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1891:2: ( ',' ( ( (lv_language_6_1= 'de=' | lv_language_6_2= 'en=' ) ) )? ( (lv_value_7_0= ruleScalarExpression ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==16) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1891:4: ',' ( ( (lv_language_6_1= 'de=' | lv_language_6_2= 'en=' ) ) )? ( (lv_value_7_0= ruleScalarExpression ) )
            	    {
            	    match(input,16,FOLLOW_16_in_ruleConstant3557); 

            	            createLeafNode(grammarAccess.getConstantAccess().getCommaKeyword_5_0(), null); 
            	        
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1895:1: ( ( (lv_language_6_1= 'de=' | lv_language_6_2= 'en=' ) ) )?
            	    int alt22=2;
            	    int LA22_0 = input.LA(1);

            	    if ( ((LA22_0>=38 && LA22_0<=39)) ) {
            	        alt22=1;
            	    }
            	    switch (alt22) {
            	        case 1 :
            	            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1896:1: ( (lv_language_6_1= 'de=' | lv_language_6_2= 'en=' ) )
            	            {
            	            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1896:1: ( (lv_language_6_1= 'de=' | lv_language_6_2= 'en=' ) )
            	            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1897:1: (lv_language_6_1= 'de=' | lv_language_6_2= 'en=' )
            	            {
            	            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1897:1: (lv_language_6_1= 'de=' | lv_language_6_2= 'en=' )
            	            int alt21=2;
            	            int LA21_0 = input.LA(1);

            	            if ( (LA21_0==38) ) {
            	                alt21=1;
            	            }
            	            else if ( (LA21_0==39) ) {
            	                alt21=2;
            	            }
            	            else {
            	                NoViableAltException nvae =
            	                    new NoViableAltException("1897:1: (lv_language_6_1= 'de=' | lv_language_6_2= 'en=' )", 21, 0, input);

            	                throw nvae;
            	            }
            	            switch (alt21) {
            	                case 1 :
            	                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1898:3: lv_language_6_1= 'de='
            	                    {
            	                    lv_language_6_1=(Token)input.LT(1);
            	                    match(input,38,FOLLOW_38_in_ruleConstant3577); 

            	                            createLeafNode(grammarAccess.getConstantAccess().getLanguageDeKeyword_5_1_0_0(), "language"); 
            	                        

            	                    	        if (current==null) {
            	                    	            current = factory.create(grammarAccess.getConstantRule().getType().getClassifier());
            	                    	            associateNodeWithAstElement(currentNode, current);
            	                    	        }
            	                    	        
            	                    	        try {
            	                    	       		add(current, "language", lv_language_6_1, null, lastConsumedNode);
            	                    	        } catch (ValueConverterException vce) {
            	                    				handleValueConverterException(vce);
            	                    	        }
            	                    	    

            	                    }
            	                    break;
            	                case 2 :
            	                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1916:8: lv_language_6_2= 'en='
            	                    {
            	                    lv_language_6_2=(Token)input.LT(1);
            	                    match(input,39,FOLLOW_39_in_ruleConstant3606); 

            	                            createLeafNode(grammarAccess.getConstantAccess().getLanguageEnKeyword_5_1_0_1(), "language"); 
            	                        

            	                    	        if (current==null) {
            	                    	            current = factory.create(grammarAccess.getConstantRule().getType().getClassifier());
            	                    	            associateNodeWithAstElement(currentNode, current);
            	                    	        }
            	                    	        
            	                    	        try {
            	                    	       		add(current, "language", lv_language_6_2, null, lastConsumedNode);
            	                    	        } catch (ValueConverterException vce) {
            	                    				handleValueConverterException(vce);
            	                    	        }
            	                    	    

            	                    }
            	                    break;

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1937:3: ( (lv_value_7_0= ruleScalarExpression ) )
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1938:1: (lv_value_7_0= ruleScalarExpression )
            	    {
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1938:1: (lv_value_7_0= ruleScalarExpression )
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1939:3: lv_value_7_0= ruleScalarExpression
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getConstantAccess().getValueScalarExpressionParserRuleCall_5_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleScalarExpression_in_ruleConstant3644);
            	    lv_value_7_0=ruleScalarExpression();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getConstantRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"value",
            	    	        		lv_value_7_0, 
            	    	        		"ScalarExpression", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleConstant


    // $ANTLR start entryRuleType
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1969:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1970:2: (iv_ruleType= ruleType EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1971:2: iv_ruleType= ruleType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType3682);
            iv_ruleType=ruleType();
            _fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType3692); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleType


    // $ANTLR start ruleType
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1978:1: ruleType returns [EObject current=null] : (this_SimpleType_0= ruleSimpleType | this_Entity_1= ruleEntity ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleType_0 = null;

        EObject this_Entity_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1983:6: ( (this_SimpleType_0= ruleSimpleType | this_Entity_1= ruleEntity ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1984:1: (this_SimpleType_0= ruleSimpleType | this_Entity_1= ruleEntity )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1984:1: (this_SimpleType_0= ruleSimpleType | this_Entity_1= ruleEntity )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==40) ) {
                alt24=1;
            }
            else if ( (LA24_0==42) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1984:1: (this_SimpleType_0= ruleSimpleType | this_Entity_1= ruleEntity )", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1985:5: this_SimpleType_0= ruleSimpleType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeAccess().getSimpleTypeParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleSimpleType_in_ruleType3739);
                    this_SimpleType_0=ruleSimpleType();
                    _fsp--;

                     
                            current = this_SimpleType_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1995:5: this_Entity_1= ruleEntity
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeAccess().getEntityParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleEntity_in_ruleType3766);
                    this_Entity_1=ruleEntity();
                    _fsp--;

                     
                            current = this_Entity_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleType


    // $ANTLR start entryRuleSimpleType
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2011:1: entryRuleSimpleType returns [EObject current=null] : iv_ruleSimpleType= ruleSimpleType EOF ;
    public final EObject entryRuleSimpleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleType = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2012:2: (iv_ruleSimpleType= ruleSimpleType EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2013:2: iv_ruleSimpleType= ruleSimpleType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSimpleTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleSimpleType_in_entryRuleSimpleType3801);
            iv_ruleSimpleType=ruleSimpleType();
            _fsp--;

             current =iv_ruleSimpleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleType3811); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSimpleType


    // $ANTLR start ruleSimpleType
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2020:1: ruleSimpleType returns [EObject current=null] : ( 'type' ( (lv_name_1_0= RULE_ID ) ) 'mapsTo' ( (lv_platformType_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleSimpleType() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_platformType_3_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2025:6: ( ( 'type' ( (lv_name_1_0= RULE_ID ) ) 'mapsTo' ( (lv_platformType_3_0= RULE_STRING ) ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2026:1: ( 'type' ( (lv_name_1_0= RULE_ID ) ) 'mapsTo' ( (lv_platformType_3_0= RULE_STRING ) ) )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2026:1: ( 'type' ( (lv_name_1_0= RULE_ID ) ) 'mapsTo' ( (lv_platformType_3_0= RULE_STRING ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2026:3: 'type' ( (lv_name_1_0= RULE_ID ) ) 'mapsTo' ( (lv_platformType_3_0= RULE_STRING ) )
            {
            match(input,40,FOLLOW_40_in_ruleSimpleType3846); 

                    createLeafNode(grammarAccess.getSimpleTypeAccess().getTypeKeyword_0(), null); 
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2030:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2031:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2031:1: (lv_name_1_0= RULE_ID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2032:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSimpleType3863); 

            			createLeafNode(grammarAccess.getSimpleTypeAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSimpleTypeRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,41,FOLLOW_41_in_ruleSimpleType3878); 

                    createLeafNode(grammarAccess.getSimpleTypeAccess().getMapsToKeyword_2(), null); 
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2058:1: ( (lv_platformType_3_0= RULE_STRING ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2059:1: (lv_platformType_3_0= RULE_STRING )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2059:1: (lv_platformType_3_0= RULE_STRING )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2060:3: lv_platformType_3_0= RULE_STRING
            {
            lv_platformType_3_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSimpleType3895); 

            			createLeafNode(grammarAccess.getSimpleTypeAccess().getPlatformTypeSTRINGTerminalRuleCall_3_0(), "platformType"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSimpleTypeRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"platformType",
            	        		lv_platformType_3_0, 
            	        		"STRING", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleSimpleType


    // $ANTLR start entryRuleEntity
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2090:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2091:2: (iv_ruleEntity= ruleEntity EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2092:2: iv_ruleEntity= ruleEntity EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEntityRule(), currentNode); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity3936);
            iv_ruleEntity=ruleEntity();
            _fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity3946); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleEntity


    // $ANTLR start ruleEntity
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2099:1: ruleEntity returns [EObject current=null] : ( 'entity' ( (lv_name_1_0= RULE_ID ) ) ( 'extends' ( ( RULE_ID ) ) )? '{' ( (lv_properties_5_0= ruleProperty ) )* '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_properties_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2104:6: ( ( 'entity' ( (lv_name_1_0= RULE_ID ) ) ( 'extends' ( ( RULE_ID ) ) )? '{' ( (lv_properties_5_0= ruleProperty ) )* '}' ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2105:1: ( 'entity' ( (lv_name_1_0= RULE_ID ) ) ( 'extends' ( ( RULE_ID ) ) )? '{' ( (lv_properties_5_0= ruleProperty ) )* '}' )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2105:1: ( 'entity' ( (lv_name_1_0= RULE_ID ) ) ( 'extends' ( ( RULE_ID ) ) )? '{' ( (lv_properties_5_0= ruleProperty ) )* '}' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2105:3: 'entity' ( (lv_name_1_0= RULE_ID ) ) ( 'extends' ( ( RULE_ID ) ) )? '{' ( (lv_properties_5_0= ruleProperty ) )* '}'
            {
            match(input,42,FOLLOW_42_in_ruleEntity3981); 

                    createLeafNode(grammarAccess.getEntityAccess().getEntityKeyword_0(), null); 
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2109:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2110:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2110:1: (lv_name_1_0= RULE_ID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2111:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity3998); 

            			createLeafNode(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getEntityRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2133:2: ( 'extends' ( ( RULE_ID ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==43) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2133:4: 'extends' ( ( RULE_ID ) )
                    {
                    match(input,43,FOLLOW_43_in_ruleEntity4014); 

                            createLeafNode(grammarAccess.getEntityAccess().getExtendsKeyword_2_0(), null); 
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2137:1: ( ( RULE_ID ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2138:1: ( RULE_ID )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2138:1: ( RULE_ID )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2139:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getEntityRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity4032); 

                    		createLeafNode(grammarAccess.getEntityAccess().getExtendsEntityCrossReference_2_1_0(), "extends"); 
                    	

                    }


                    }


                    }
                    break;

            }

            match(input,13,FOLLOW_13_in_ruleEntity4044); 

                    createLeafNode(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3(), null); 
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2155:1: ( (lv_properties_5_0= ruleProperty ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_ID||LA26_0==44) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2156:1: (lv_properties_5_0= ruleProperty )
            	    {
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2156:1: (lv_properties_5_0= ruleProperty )
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2157:3: lv_properties_5_0= ruleProperty
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getEntityAccess().getPropertiesPropertyParserRuleCall_4_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleProperty_in_ruleEntity4065);
            	    lv_properties_5_0=ruleProperty();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getEntityRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"properties",
            	    	        		lv_properties_5_0, 
            	    	        		"Property", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            match(input,17,FOLLOW_17_in_ruleEntity4076); 

                    createLeafNode(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleEntity


    // $ANTLR start entryRuleProperty
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2191:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2192:2: (iv_ruleProperty= ruleProperty EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2193:2: iv_ruleProperty= ruleProperty EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPropertyRule(), currentNode); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty4112);
            iv_ruleProperty=ruleProperty();
            _fsp--;

             current =iv_ruleProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty4122); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleProperty


    // $ANTLR start ruleProperty
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2200:1: ruleProperty returns [EObject current=null] : ( ( (lv_derived_0_0= 'derived' ) )? ( (lv_description_1_0= ruleTypeDescription ) ) ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token lv_derived_0_0=null;
        Token lv_name_2_0=null;
        EObject lv_description_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2205:6: ( ( ( (lv_derived_0_0= 'derived' ) )? ( (lv_description_1_0= ruleTypeDescription ) ) ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2206:1: ( ( (lv_derived_0_0= 'derived' ) )? ( (lv_description_1_0= ruleTypeDescription ) ) ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2206:1: ( ( (lv_derived_0_0= 'derived' ) )? ( (lv_description_1_0= ruleTypeDescription ) ) ( (lv_name_2_0= RULE_ID ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2206:2: ( (lv_derived_0_0= 'derived' ) )? ( (lv_description_1_0= ruleTypeDescription ) ) ( (lv_name_2_0= RULE_ID ) )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2206:2: ( (lv_derived_0_0= 'derived' ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==44) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2207:1: (lv_derived_0_0= 'derived' )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2207:1: (lv_derived_0_0= 'derived' )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2208:3: lv_derived_0_0= 'derived'
                    {
                    lv_derived_0_0=(Token)input.LT(1);
                    match(input,44,FOLLOW_44_in_ruleProperty4165); 

                            createLeafNode(grammarAccess.getPropertyAccess().getDerivedDerivedKeyword_0_0(), "derived"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getPropertyRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "derived", true, "derived", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2227:3: ( (lv_description_1_0= ruleTypeDescription ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2228:1: (lv_description_1_0= ruleTypeDescription )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2228:1: (lv_description_1_0= ruleTypeDescription )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2229:3: lv_description_1_0= ruleTypeDescription
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPropertyAccess().getDescriptionTypeDescriptionParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleTypeDescription_in_ruleProperty4200);
            lv_description_1_0=ruleTypeDescription();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPropertyRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"description",
            	        		lv_description_1_0, 
            	        		"TypeDescription", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2251:2: ( (lv_name_2_0= RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2252:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2252:1: (lv_name_2_0= RULE_ID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2253:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProperty4217); 

            			createLeafNode(grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPropertyRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_2_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleProperty


    // $ANTLR start entryRuleContentProvider
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2283:1: entryRuleContentProvider returns [EObject current=null] : iv_ruleContentProvider= ruleContentProvider EOF ;
    public final EObject entryRuleContentProvider() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContentProvider = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2284:2: (iv_ruleContentProvider= ruleContentProvider EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2285:2: iv_ruleContentProvider= ruleContentProvider EOF
            {
             currentNode = createCompositeNode(grammarAccess.getContentProviderRule(), currentNode); 
            pushFollow(FOLLOW_ruleContentProvider_in_entryRuleContentProvider4258);
            iv_ruleContentProvider=ruleContentProvider();
            _fsp--;

             current =iv_ruleContentProvider; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContentProvider4268); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleContentProvider


    // $ANTLR start ruleContentProvider
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2292:1: ruleContentProvider returns [EObject current=null] : ( 'contentprovider' ( (lv_name_1_0= RULE_ID ) ) ( '(' ( (lv_parameter_3_0= ruleParameter ) ) ')' )? ( ( 'returns' | ( (lv_resolver_6_0= 'resolves' ) ) ) ( ( RULE_ID ) ) ( (lv_many_8_0= '[]' ) )? )? 'fetches' ( ( (lv_xml_10_0= 'XML' ) ) | ( (lv_html_11_0= 'HTML' ) ) ) 'from' ( (lv_url_13_0= ruleScalarExpression ) ) ( 'selects' ( (lv_selection_15_0= ruleScalarExpression ) ) )? ) ;
    public final EObject ruleContentProvider() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_resolver_6_0=null;
        Token lv_many_8_0=null;
        Token lv_xml_10_0=null;
        Token lv_html_11_0=null;
        EObject lv_parameter_3_0 = null;

        EObject lv_url_13_0 = null;

        EObject lv_selection_15_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2297:6: ( ( 'contentprovider' ( (lv_name_1_0= RULE_ID ) ) ( '(' ( (lv_parameter_3_0= ruleParameter ) ) ')' )? ( ( 'returns' | ( (lv_resolver_6_0= 'resolves' ) ) ) ( ( RULE_ID ) ) ( (lv_many_8_0= '[]' ) )? )? 'fetches' ( ( (lv_xml_10_0= 'XML' ) ) | ( (lv_html_11_0= 'HTML' ) ) ) 'from' ( (lv_url_13_0= ruleScalarExpression ) ) ( 'selects' ( (lv_selection_15_0= ruleScalarExpression ) ) )? ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2298:1: ( 'contentprovider' ( (lv_name_1_0= RULE_ID ) ) ( '(' ( (lv_parameter_3_0= ruleParameter ) ) ')' )? ( ( 'returns' | ( (lv_resolver_6_0= 'resolves' ) ) ) ( ( RULE_ID ) ) ( (lv_many_8_0= '[]' ) )? )? 'fetches' ( ( (lv_xml_10_0= 'XML' ) ) | ( (lv_html_11_0= 'HTML' ) ) ) 'from' ( (lv_url_13_0= ruleScalarExpression ) ) ( 'selects' ( (lv_selection_15_0= ruleScalarExpression ) ) )? )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2298:1: ( 'contentprovider' ( (lv_name_1_0= RULE_ID ) ) ( '(' ( (lv_parameter_3_0= ruleParameter ) ) ')' )? ( ( 'returns' | ( (lv_resolver_6_0= 'resolves' ) ) ) ( ( RULE_ID ) ) ( (lv_many_8_0= '[]' ) )? )? 'fetches' ( ( (lv_xml_10_0= 'XML' ) ) | ( (lv_html_11_0= 'HTML' ) ) ) 'from' ( (lv_url_13_0= ruleScalarExpression ) ) ( 'selects' ( (lv_selection_15_0= ruleScalarExpression ) ) )? )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2298:3: 'contentprovider' ( (lv_name_1_0= RULE_ID ) ) ( '(' ( (lv_parameter_3_0= ruleParameter ) ) ')' )? ( ( 'returns' | ( (lv_resolver_6_0= 'resolves' ) ) ) ( ( RULE_ID ) ) ( (lv_many_8_0= '[]' ) )? )? 'fetches' ( ( (lv_xml_10_0= 'XML' ) ) | ( (lv_html_11_0= 'HTML' ) ) ) 'from' ( (lv_url_13_0= ruleScalarExpression ) ) ( 'selects' ( (lv_selection_15_0= ruleScalarExpression ) ) )?
            {
            match(input,45,FOLLOW_45_in_ruleContentProvider4303); 

                    createLeafNode(grammarAccess.getContentProviderAccess().getContentproviderKeyword_0(), null); 
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2302:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2303:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2303:1: (lv_name_1_0= RULE_ID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2304:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContentProvider4320); 

            			createLeafNode(grammarAccess.getContentProviderAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getContentProviderRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2326:2: ( '(' ( (lv_parameter_3_0= ruleParameter ) ) ')' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==21) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2326:4: '(' ( (lv_parameter_3_0= ruleParameter ) ) ')'
                    {
                    match(input,21,FOLLOW_21_in_ruleContentProvider4336); 

                            createLeafNode(grammarAccess.getContentProviderAccess().getLeftParenthesisKeyword_2_0(), null); 
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2330:1: ( (lv_parameter_3_0= ruleParameter ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2331:1: (lv_parameter_3_0= ruleParameter )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2331:1: (lv_parameter_3_0= ruleParameter )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2332:3: lv_parameter_3_0= ruleParameter
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getContentProviderAccess().getParameterParameterParserRuleCall_2_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleParameter_in_ruleContentProvider4357);
                    lv_parameter_3_0=ruleParameter();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getContentProviderRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"parameter",
                    	        		lv_parameter_3_0, 
                    	        		"Parameter", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    match(input,22,FOLLOW_22_in_ruleContentProvider4367); 

                            createLeafNode(grammarAccess.getContentProviderAccess().getRightParenthesisKeyword_2_2(), null); 
                        

                    }
                    break;

            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2358:3: ( ( 'returns' | ( (lv_resolver_6_0= 'resolves' ) ) ) ( ( RULE_ID ) ) ( (lv_many_8_0= '[]' ) )? )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=46 && LA31_0<=47)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2358:4: ( 'returns' | ( (lv_resolver_6_0= 'resolves' ) ) ) ( ( RULE_ID ) ) ( (lv_many_8_0= '[]' ) )?
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2358:4: ( 'returns' | ( (lv_resolver_6_0= 'resolves' ) ) )
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==46) ) {
                        alt29=1;
                    }
                    else if ( (LA29_0==47) ) {
                        alt29=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("2358:4: ( 'returns' | ( (lv_resolver_6_0= 'resolves' ) ) )", 29, 0, input);

                        throw nvae;
                    }
                    switch (alt29) {
                        case 1 :
                            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2358:6: 'returns'
                            {
                            match(input,46,FOLLOW_46_in_ruleContentProvider4381); 

                                    createLeafNode(grammarAccess.getContentProviderAccess().getReturnsKeyword_3_0_0(), null); 
                                

                            }
                            break;
                        case 2 :
                            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2363:6: ( (lv_resolver_6_0= 'resolves' ) )
                            {
                            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2363:6: ( (lv_resolver_6_0= 'resolves' ) )
                            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2364:1: (lv_resolver_6_0= 'resolves' )
                            {
                            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2364:1: (lv_resolver_6_0= 'resolves' )
                            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2365:3: lv_resolver_6_0= 'resolves'
                            {
                            lv_resolver_6_0=(Token)input.LT(1);
                            match(input,47,FOLLOW_47_in_ruleContentProvider4405); 

                                    createLeafNode(grammarAccess.getContentProviderAccess().getResolverResolvesKeyword_3_0_1_0(), "resolver"); 
                                

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getContentProviderRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "resolver", true, "resolves", lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }


                            }


                            }
                            break;

                    }

                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2384:3: ( ( RULE_ID ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2385:1: ( RULE_ID )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2385:1: ( RULE_ID )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2386:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getContentProviderRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContentProvider4437); 

                    		createLeafNode(grammarAccess.getContentProviderAccess().getTypeTypeCrossReference_3_1_0(), "type"); 
                    	

                    }


                    }

                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2398:2: ( (lv_many_8_0= '[]' ) )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==18) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2399:1: (lv_many_8_0= '[]' )
                            {
                            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2399:1: (lv_many_8_0= '[]' )
                            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2400:3: lv_many_8_0= '[]'
                            {
                            lv_many_8_0=(Token)input.LT(1);
                            match(input,18,FOLLOW_18_in_ruleContentProvider4455); 

                                    createLeafNode(grammarAccess.getContentProviderAccess().getManyLeftSquareBracketRightSquareBracketKeyword_3_2_0(), "many"); 
                                

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getContentProviderRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "many", true, "[]", lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            match(input,48,FOLLOW_48_in_ruleContentProvider4481); 

                    createLeafNode(grammarAccess.getContentProviderAccess().getFetchesKeyword_4(), null); 
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2423:1: ( ( (lv_xml_10_0= 'XML' ) ) | ( (lv_html_11_0= 'HTML' ) ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==49) ) {
                alt32=1;
            }
            else if ( (LA32_0==50) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("2423:1: ( ( (lv_xml_10_0= 'XML' ) ) | ( (lv_html_11_0= 'HTML' ) ) )", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2423:2: ( (lv_xml_10_0= 'XML' ) )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2423:2: ( (lv_xml_10_0= 'XML' ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2424:1: (lv_xml_10_0= 'XML' )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2424:1: (lv_xml_10_0= 'XML' )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2425:3: lv_xml_10_0= 'XML'
                    {
                    lv_xml_10_0=(Token)input.LT(1);
                    match(input,49,FOLLOW_49_in_ruleContentProvider4500); 

                            createLeafNode(grammarAccess.getContentProviderAccess().getXmlXMLKeyword_5_0_0(), "xml"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getContentProviderRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "xml", true, "XML", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2445:6: ( (lv_html_11_0= 'HTML' ) )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2445:6: ( (lv_html_11_0= 'HTML' ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2446:1: (lv_html_11_0= 'HTML' )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2446:1: (lv_html_11_0= 'HTML' )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2447:3: lv_html_11_0= 'HTML'
                    {
                    lv_html_11_0=(Token)input.LT(1);
                    match(input,50,FOLLOW_50_in_ruleContentProvider4537); 

                            createLeafNode(grammarAccess.getContentProviderAccess().getHtmlHTMLKeyword_5_1_0(), "html"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getContentProviderRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "html", true, "HTML", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;

            }

            match(input,51,FOLLOW_51_in_ruleContentProvider4561); 

                    createLeafNode(grammarAccess.getContentProviderAccess().getFromKeyword_6(), null); 
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2470:1: ( (lv_url_13_0= ruleScalarExpression ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2471:1: (lv_url_13_0= ruleScalarExpression )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2471:1: (lv_url_13_0= ruleScalarExpression )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2472:3: lv_url_13_0= ruleScalarExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getContentProviderAccess().getUrlScalarExpressionParserRuleCall_7_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleScalarExpression_in_ruleContentProvider4582);
            lv_url_13_0=ruleScalarExpression();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getContentProviderRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"url",
            	        		lv_url_13_0, 
            	        		"ScalarExpression", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2494:2: ( 'selects' ( (lv_selection_15_0= ruleScalarExpression ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==52) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2494:4: 'selects' ( (lv_selection_15_0= ruleScalarExpression ) )
                    {
                    match(input,52,FOLLOW_52_in_ruleContentProvider4593); 

                            createLeafNode(grammarAccess.getContentProviderAccess().getSelectsKeyword_8_0(), null); 
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2498:1: ( (lv_selection_15_0= ruleScalarExpression ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2499:1: (lv_selection_15_0= ruleScalarExpression )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2499:1: (lv_selection_15_0= ruleScalarExpression )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2500:3: lv_selection_15_0= ruleScalarExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getContentProviderAccess().getSelectionScalarExpressionParserRuleCall_8_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleScalarExpression_in_ruleContentProvider4614);
                    lv_selection_15_0=ruleScalarExpression();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getContentProviderRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"selection",
                    	        		lv_selection_15_0, 
                    	        		"ScalarExpression", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleContentProvider


    // $ANTLR start entryRuleProviderConstruction
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2530:1: entryRuleProviderConstruction returns [EObject current=null] : iv_ruleProviderConstruction= ruleProviderConstruction EOF ;
    public final EObject entryRuleProviderConstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProviderConstruction = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2531:2: (iv_ruleProviderConstruction= ruleProviderConstruction EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2532:2: iv_ruleProviderConstruction= ruleProviderConstruction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getProviderConstructionRule(), currentNode); 
            pushFollow(FOLLOW_ruleProviderConstruction_in_entryRuleProviderConstruction4652);
            iv_ruleProviderConstruction=ruleProviderConstruction();
            _fsp--;

             current =iv_ruleProviderConstruction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProviderConstruction4662); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleProviderConstruction


    // $ANTLR start ruleProviderConstruction
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2539:1: ruleProviderConstruction returns [EObject current=null] : ( ( ( RULE_ID ) ) '(' ( ( (lv_argument_2_0= ruleExpression ) ) | ( (lv_predefinedParameter_3_0= rulePredefinedParameter ) ) )? ')' ) ;
    public final EObject ruleProviderConstruction() throws RecognitionException {
        EObject current = null;

        EObject lv_argument_2_0 = null;

        EObject lv_predefinedParameter_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2544:6: ( ( ( ( RULE_ID ) ) '(' ( ( (lv_argument_2_0= ruleExpression ) ) | ( (lv_predefinedParameter_3_0= rulePredefinedParameter ) ) )? ')' ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2545:1: ( ( ( RULE_ID ) ) '(' ( ( (lv_argument_2_0= ruleExpression ) ) | ( (lv_predefinedParameter_3_0= rulePredefinedParameter ) ) )? ')' )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2545:1: ( ( ( RULE_ID ) ) '(' ( ( (lv_argument_2_0= ruleExpression ) ) | ( (lv_predefinedParameter_3_0= rulePredefinedParameter ) ) )? ')' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2545:2: ( ( RULE_ID ) ) '(' ( ( (lv_argument_2_0= ruleExpression ) ) | ( (lv_predefinedParameter_3_0= rulePredefinedParameter ) ) )? ')'
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2545:2: ( ( RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2546:1: ( RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2546:1: ( RULE_ID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2547:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getProviderConstructionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProviderConstruction4705); 

            		createLeafNode(grammarAccess.getProviderConstructionAccess().getProviderContentProviderCrossReference_0_0(), "provider"); 
            	

            }


            }

            match(input,21,FOLLOW_21_in_ruleProviderConstruction4715); 

                    createLeafNode(grammarAccess.getProviderConstructionAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2563:1: ( ( (lv_argument_2_0= ruleExpression ) ) | ( (lv_predefinedParameter_3_0= rulePredefinedParameter ) ) )?
            int alt34=3;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=RULE_ID && LA34_0<=RULE_STRING)||LA34_0==21||(LA34_0>=23 && LA34_0<=25)||LA34_0==27) ) {
                alt34=1;
            }
            else if ( (LA34_0==20) ) {
                alt34=2;
            }
            switch (alt34) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2563:2: ( (lv_argument_2_0= ruleExpression ) )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2563:2: ( (lv_argument_2_0= ruleExpression ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2564:1: (lv_argument_2_0= ruleExpression )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2564:1: (lv_argument_2_0= ruleExpression )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2565:3: lv_argument_2_0= ruleExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getProviderConstructionAccess().getArgumentExpressionParserRuleCall_2_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleProviderConstruction4737);
                    lv_argument_2_0=ruleExpression();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getProviderConstructionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"argument",
                    	        		lv_argument_2_0, 
                    	        		"Expression", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2588:6: ( (lv_predefinedParameter_3_0= rulePredefinedParameter ) )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2588:6: ( (lv_predefinedParameter_3_0= rulePredefinedParameter ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2589:1: (lv_predefinedParameter_3_0= rulePredefinedParameter )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2589:1: (lv_predefinedParameter_3_0= rulePredefinedParameter )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2590:3: lv_predefinedParameter_3_0= rulePredefinedParameter
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getProviderConstructionAccess().getPredefinedParameterPredefinedParameterParserRuleCall_2_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_rulePredefinedParameter_in_ruleProviderConstruction4764);
                    lv_predefinedParameter_3_0=rulePredefinedParameter();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getProviderConstructionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"predefinedParameter",
                    	        		lv_predefinedParameter_3_0, 
                    	        		"PredefinedParameter", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            match(input,22,FOLLOW_22_in_ruleProviderConstruction4776); 

                    createLeafNode(grammarAccess.getProviderConstructionAccess().getRightParenthesisKeyword_3(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleProviderConstruction


    // $ANTLR start entryRuleView
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2624:1: entryRuleView returns [EObject current=null] : iv_ruleView= ruleView EOF ;
    public final EObject entryRuleView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleView = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2625:2: (iv_ruleView= ruleView EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2626:2: iv_ruleView= ruleView EOF
            {
             currentNode = createCompositeNode(grammarAccess.getViewRule(), currentNode); 
            pushFollow(FOLLOW_ruleView_in_entryRuleView4812);
            iv_ruleView=ruleView();
            _fsp--;

             current =iv_ruleView; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleView4822); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleView


    // $ANTLR start ruleView
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2633:1: ruleView returns [EObject current=null] : (this_SectionedView_0= ruleSectionedView | this_CustomView_1= ruleCustomView | this_WebView_2= ruleWebView ) ;
    public final EObject ruleView() throws RecognitionException {
        EObject current = null;

        EObject this_SectionedView_0 = null;

        EObject this_CustomView_1 = null;

        EObject this_WebView_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2638:6: ( (this_SectionedView_0= ruleSectionedView | this_CustomView_1= ruleCustomView | this_WebView_2= ruleWebView ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2639:1: (this_SectionedView_0= ruleSectionedView | this_CustomView_1= ruleCustomView | this_WebView_2= ruleWebView )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2639:1: (this_SectionedView_0= ruleSectionedView | this_CustomView_1= ruleCustomView | this_WebView_2= ruleWebView )
            int alt35=3;
            switch ( input.LA(1) ) {
            case 53:
            case 56:
                {
                alt35=1;
                }
                break;
            case 58:
                {
                alt35=2;
                }
                break;
            case 57:
                {
                alt35=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("2639:1: (this_SectionedView_0= ruleSectionedView | this_CustomView_1= ruleCustomView | this_WebView_2= ruleWebView )", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2640:5: this_SectionedView_0= ruleSectionedView
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getViewAccess().getSectionedViewParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleSectionedView_in_ruleView4869);
                    this_SectionedView_0=ruleSectionedView();
                    _fsp--;

                     
                            current = this_SectionedView_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2650:5: this_CustomView_1= ruleCustomView
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getViewAccess().getCustomViewParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleCustomView_in_ruleView4896);
                    this_CustomView_1=ruleCustomView();
                    _fsp--;

                     
                            current = this_CustomView_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2660:5: this_WebView_2= ruleWebView
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getViewAccess().getWebViewParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleWebView_in_ruleView4923);
                    this_WebView_2=ruleWebView();
                    _fsp--;

                     
                            current = this_WebView_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleView


    // $ANTLR start entryRuleSectionedView
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2676:1: entryRuleSectionedView returns [EObject current=null] : iv_ruleSectionedView= ruleSectionedView EOF ;
    public final EObject entryRuleSectionedView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSectionedView = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2677:2: (iv_ruleSectionedView= ruleSectionedView EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2678:2: iv_ruleSectionedView= ruleSectionedView EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSectionedViewRule(), currentNode); 
            pushFollow(FOLLOW_ruleSectionedView_in_entryRuleSectionedView4958);
            iv_ruleSectionedView=ruleSectionedView();
            _fsp--;

             current =iv_ruleSectionedView; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSectionedView4968); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSectionedView


    // $ANTLR start ruleSectionedView
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2685:1: ruleSectionedView returns [EObject current=null] : (this_TableView_0= ruleTableView | this_DetailsView_1= ruleDetailsView ) ;
    public final EObject ruleSectionedView() throws RecognitionException {
        EObject current = null;

        EObject this_TableView_0 = null;

        EObject this_DetailsView_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2690:6: ( (this_TableView_0= ruleTableView | this_DetailsView_1= ruleDetailsView ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2691:1: (this_TableView_0= ruleTableView | this_DetailsView_1= ruleDetailsView )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2691:1: (this_TableView_0= ruleTableView | this_DetailsView_1= ruleDetailsView )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==53) ) {
                alt36=1;
            }
            else if ( (LA36_0==56) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("2691:1: (this_TableView_0= ruleTableView | this_DetailsView_1= ruleDetailsView )", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2692:5: this_TableView_0= ruleTableView
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getSectionedViewAccess().getTableViewParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleTableView_in_ruleSectionedView5015);
                    this_TableView_0=ruleTableView();
                    _fsp--;

                     
                            current = this_TableView_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2702:5: this_DetailsView_1= ruleDetailsView
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getSectionedViewAccess().getDetailsViewParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDetailsView_in_ruleSectionedView5042);
                    this_DetailsView_1=ruleDetailsView();
                    _fsp--;

                     
                            current = this_DetailsView_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleSectionedView


    // $ANTLR start entryRuleTableView
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2718:1: entryRuleTableView returns [EObject current=null] : iv_ruleTableView= ruleTableView EOF ;
    public final EObject entryRuleTableView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableView = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2719:2: (iv_ruleTableView= ruleTableView EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2720:2: iv_ruleTableView= ruleTableView EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTableViewRule(), currentNode); 
            pushFollow(FOLLOW_ruleTableView_in_entryRuleTableView5077);
            iv_ruleTableView=ruleTableView();
            _fsp--;

             current =iv_ruleTableView; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTableView5087); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTableView


    // $ANTLR start ruleTableView
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2727:1: ruleTableView returns [EObject current=null] : ( 'tableview' ( (lv_name_1_0= RULE_ID ) ) ( '(' ( (lv_content_3_0= ruleParameter ) ) ')' )? ( ':' ( ( RULE_ID ) ) )? '{' ( 'title' '=' ( (lv_title_10_0= ruleScalarExpression ) ) )? ( (lv_buttons_11_0= ruleButton ) )* ( (lv_forAllSections_12_0= ruleViewForAllSections ) )? ( (lv_sections_13_0= ruleViewSection ) )* ( 'action' '=' ( (lv_actions_16_0= ruleAction ) ) ( ',' ( (lv_actions_18_0= ruleAction ) ) )* )? '}' ) ;
    public final EObject ruleTableView() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_content_3_0 = null;

        EObject lv_title_10_0 = null;

        EObject lv_buttons_11_0 = null;

        EObject lv_forAllSections_12_0 = null;

        EObject lv_sections_13_0 = null;

        EObject lv_actions_16_0 = null;

        EObject lv_actions_18_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2732:6: ( ( 'tableview' ( (lv_name_1_0= RULE_ID ) ) ( '(' ( (lv_content_3_0= ruleParameter ) ) ')' )? ( ':' ( ( RULE_ID ) ) )? '{' ( 'title' '=' ( (lv_title_10_0= ruleScalarExpression ) ) )? ( (lv_buttons_11_0= ruleButton ) )* ( (lv_forAllSections_12_0= ruleViewForAllSections ) )? ( (lv_sections_13_0= ruleViewSection ) )* ( 'action' '=' ( (lv_actions_16_0= ruleAction ) ) ( ',' ( (lv_actions_18_0= ruleAction ) ) )* )? '}' ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2733:1: ( 'tableview' ( (lv_name_1_0= RULE_ID ) ) ( '(' ( (lv_content_3_0= ruleParameter ) ) ')' )? ( ':' ( ( RULE_ID ) ) )? '{' ( 'title' '=' ( (lv_title_10_0= ruleScalarExpression ) ) )? ( (lv_buttons_11_0= ruleButton ) )* ( (lv_forAllSections_12_0= ruleViewForAllSections ) )? ( (lv_sections_13_0= ruleViewSection ) )* ( 'action' '=' ( (lv_actions_16_0= ruleAction ) ) ( ',' ( (lv_actions_18_0= ruleAction ) ) )* )? '}' )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2733:1: ( 'tableview' ( (lv_name_1_0= RULE_ID ) ) ( '(' ( (lv_content_3_0= ruleParameter ) ) ')' )? ( ':' ( ( RULE_ID ) ) )? '{' ( 'title' '=' ( (lv_title_10_0= ruleScalarExpression ) ) )? ( (lv_buttons_11_0= ruleButton ) )* ( (lv_forAllSections_12_0= ruleViewForAllSections ) )? ( (lv_sections_13_0= ruleViewSection ) )* ( 'action' '=' ( (lv_actions_16_0= ruleAction ) ) ( ',' ( (lv_actions_18_0= ruleAction ) ) )* )? '}' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2733:3: 'tableview' ( (lv_name_1_0= RULE_ID ) ) ( '(' ( (lv_content_3_0= ruleParameter ) ) ')' )? ( ':' ( ( RULE_ID ) ) )? '{' ( 'title' '=' ( (lv_title_10_0= ruleScalarExpression ) ) )? ( (lv_buttons_11_0= ruleButton ) )* ( (lv_forAllSections_12_0= ruleViewForAllSections ) )? ( (lv_sections_13_0= ruleViewSection ) )* ( 'action' '=' ( (lv_actions_16_0= ruleAction ) ) ( ',' ( (lv_actions_18_0= ruleAction ) ) )* )? '}'
            {
            match(input,53,FOLLOW_53_in_ruleTableView5122); 

                    createLeafNode(grammarAccess.getTableViewAccess().getTableviewKeyword_0(), null); 
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2737:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2738:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2738:1: (lv_name_1_0= RULE_ID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2739:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTableView5139); 

            			createLeafNode(grammarAccess.getTableViewAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getTableViewRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2761:2: ( '(' ( (lv_content_3_0= ruleParameter ) ) ')' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==21) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2761:4: '(' ( (lv_content_3_0= ruleParameter ) ) ')'
                    {
                    match(input,21,FOLLOW_21_in_ruleTableView5155); 

                            createLeafNode(grammarAccess.getTableViewAccess().getLeftParenthesisKeyword_2_0(), null); 
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2765:1: ( (lv_content_3_0= ruleParameter ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2766:1: (lv_content_3_0= ruleParameter )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2766:1: (lv_content_3_0= ruleParameter )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2767:3: lv_content_3_0= ruleParameter
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getTableViewAccess().getContentParameterParserRuleCall_2_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleParameter_in_ruleTableView5176);
                    lv_content_3_0=ruleParameter();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getTableViewRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"content",
                    	        		lv_content_3_0, 
                    	        		"Parameter", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    match(input,22,FOLLOW_22_in_ruleTableView5186); 

                            createLeafNode(grammarAccess.getTableViewAccess().getRightParenthesisKeyword_2_2(), null); 
                        

                    }
                    break;

            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2793:3: ( ':' ( ( RULE_ID ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==54) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2793:5: ':' ( ( RULE_ID ) )
                    {
                    match(input,54,FOLLOW_54_in_ruleTableView5199); 

                            createLeafNode(grammarAccess.getTableViewAccess().getColonKeyword_3_0(), null); 
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2797:1: ( ( RULE_ID ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2798:1: ( RULE_ID )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2798:1: ( RULE_ID )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2799:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getTableViewRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTableView5217); 

                    		createLeafNode(grammarAccess.getTableViewAccess().getSuperViewSectionedViewCrossReference_3_1_0(), "superView"); 
                    	

                    }


                    }


                    }
                    break;

            }

            match(input,13,FOLLOW_13_in_ruleTableView5229); 

                    createLeafNode(grammarAccess.getTableViewAccess().getLeftCurlyBracketKeyword_4(), null); 
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2815:1: ( 'title' '=' ( (lv_title_10_0= ruleScalarExpression ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==34) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2815:3: 'title' '=' ( (lv_title_10_0= ruleScalarExpression ) )
                    {
                    match(input,34,FOLLOW_34_in_ruleTableView5240); 

                            createLeafNode(grammarAccess.getTableViewAccess().getTitleKeyword_5_0(), null); 
                        
                    match(input,12,FOLLOW_12_in_ruleTableView5250); 

                            createLeafNode(grammarAccess.getTableViewAccess().getEqualsSignKeyword_5_1(), null); 
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2823:1: ( (lv_title_10_0= ruleScalarExpression ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2824:1: (lv_title_10_0= ruleScalarExpression )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2824:1: (lv_title_10_0= ruleScalarExpression )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2825:3: lv_title_10_0= ruleScalarExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getTableViewAccess().getTitleScalarExpressionParserRuleCall_5_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleScalarExpression_in_ruleTableView5271);
                    lv_title_10_0=ruleScalarExpression();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getTableViewRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"title",
                    	        		lv_title_10_0, 
                    	        		"ScalarExpression", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2847:4: ( (lv_buttons_11_0= ruleButton ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( LA40_0 ==33 && getUnorderedGroupHelper().canSelect(grammarAccess.getButtonAccess().getUnorderedGroup(), 0) ) {
                    alt40=1;
                }
                else if ( LA40_0 ==14 && getUnorderedGroupHelper().canSelect(grammarAccess.getButtonAccess().getUnorderedGroup(), 1) ) {
                    alt40=1;
                }
                else if ( LA40_0 >=35 && LA40_0<=36 && getUnorderedGroupHelper().canSelect(grammarAccess.getButtonAccess().getUnorderedGroup(), 2) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2848:1: (lv_buttons_11_0= ruleButton )
            	    {
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2848:1: (lv_buttons_11_0= ruleButton )
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2849:3: lv_buttons_11_0= ruleButton
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getTableViewAccess().getButtonsButtonParserRuleCall_6_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleButton_in_ruleTableView5294);
            	    lv_buttons_11_0=ruleButton();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getTableViewRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"buttons",
            	    	        		lv_buttons_11_0, 
            	    	        		"Button", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2871:3: ( (lv_forAllSections_12_0= ruleViewForAllSections ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==65) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2872:1: (lv_forAllSections_12_0= ruleViewForAllSections )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2872:1: (lv_forAllSections_12_0= ruleViewForAllSections )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2873:3: lv_forAllSections_12_0= ruleViewForAllSections
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getTableViewAccess().getForAllSectionsViewForAllSectionsParserRuleCall_7_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleViewForAllSections_in_ruleTableView5316);
                    lv_forAllSections_12_0=ruleViewForAllSections();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getTableViewRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"forAllSections",
                    	        		lv_forAllSections_12_0, 
                    	        		"ViewForAllSections", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2895:3: ( (lv_sections_13_0= ruleViewSection ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==64) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2896:1: (lv_sections_13_0= ruleViewSection )
            	    {
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2896:1: (lv_sections_13_0= ruleViewSection )
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2897:3: lv_sections_13_0= ruleViewSection
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getTableViewAccess().getSectionsViewSectionParserRuleCall_8_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleViewSection_in_ruleTableView5338);
            	    lv_sections_13_0=ruleViewSection();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getTableViewRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"sections",
            	    	        		lv_sections_13_0, 
            	    	        		"ViewSection", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2919:3: ( 'action' '=' ( (lv_actions_16_0= ruleAction ) ) ( ',' ( (lv_actions_18_0= ruleAction ) ) )* )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==55) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2919:5: 'action' '=' ( (lv_actions_16_0= ruleAction ) ) ( ',' ( (lv_actions_18_0= ruleAction ) ) )*
                    {
                    match(input,55,FOLLOW_55_in_ruleTableView5350); 

                            createLeafNode(grammarAccess.getTableViewAccess().getActionKeyword_9_0(), null); 
                        
                    match(input,12,FOLLOW_12_in_ruleTableView5360); 

                            createLeafNode(grammarAccess.getTableViewAccess().getEqualsSignKeyword_9_1(), null); 
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2927:1: ( (lv_actions_16_0= ruleAction ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2928:1: (lv_actions_16_0= ruleAction )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2928:1: (lv_actions_16_0= ruleAction )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2929:3: lv_actions_16_0= ruleAction
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getTableViewAccess().getActionsActionParserRuleCall_9_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleAction_in_ruleTableView5381);
                    lv_actions_16_0=ruleAction();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getTableViewRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"actions",
                    	        		lv_actions_16_0, 
                    	        		"Action", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2951:2: ( ',' ( (lv_actions_18_0= ruleAction ) ) )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==16) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2951:4: ',' ( (lv_actions_18_0= ruleAction ) )
                    	    {
                    	    match(input,16,FOLLOW_16_in_ruleTableView5392); 

                    	            createLeafNode(grammarAccess.getTableViewAccess().getCommaKeyword_9_3_0(), null); 
                    	        
                    	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2955:1: ( (lv_actions_18_0= ruleAction ) )
                    	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2956:1: (lv_actions_18_0= ruleAction )
                    	    {
                    	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2956:1: (lv_actions_18_0= ruleAction )
                    	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2957:3: lv_actions_18_0= ruleAction
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getTableViewAccess().getActionsActionParserRuleCall_9_3_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAction_in_ruleTableView5413);
                    	    lv_actions_18_0=ruleAction();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getTableViewRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"actions",
                    	    	        		lv_actions_18_0, 
                    	    	        		"Action", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop43;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,17,FOLLOW_17_in_ruleTableView5427); 

                    createLeafNode(grammarAccess.getTableViewAccess().getRightCurlyBracketKeyword_10(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleTableView


    // $ANTLR start entryRuleDetailsView
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2991:1: entryRuleDetailsView returns [EObject current=null] : iv_ruleDetailsView= ruleDetailsView EOF ;
    public final EObject entryRuleDetailsView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDetailsView = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2992:2: (iv_ruleDetailsView= ruleDetailsView EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2993:2: iv_ruleDetailsView= ruleDetailsView EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDetailsViewRule(), currentNode); 
            pushFollow(FOLLOW_ruleDetailsView_in_entryRuleDetailsView5463);
            iv_ruleDetailsView=ruleDetailsView();
            _fsp--;

             current =iv_ruleDetailsView; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDetailsView5473); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDetailsView


    // $ANTLR start ruleDetailsView
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3000:1: ruleDetailsView returns [EObject current=null] : ( 'detailsview' ( (lv_name_1_0= RULE_ID ) ) ( '(' ( (lv_content_3_0= ruleParameter ) ) ')' )? ( ':' ( ( RULE_ID ) ) )? '{' 'title' '=' ( (lv_title_10_0= ruleScalarExpression ) ) ( (lv_buttons_11_0= ruleButton ) )* ( (lv_header_12_0= ruleViewHeader ) )? ( (lv_forAllSections_13_0= ruleViewForAllSections ) )? ( (lv_sections_14_0= ruleViewSection ) )* ( 'action' '=' ( (lv_actions_17_0= ruleAction ) ) ( ',' ( (lv_actions_19_0= ruleAction ) ) )* )? '}' ) ;
    public final EObject ruleDetailsView() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_content_3_0 = null;

        EObject lv_title_10_0 = null;

        EObject lv_buttons_11_0 = null;

        EObject lv_header_12_0 = null;

        EObject lv_forAllSections_13_0 = null;

        EObject lv_sections_14_0 = null;

        EObject lv_actions_17_0 = null;

        EObject lv_actions_19_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3005:6: ( ( 'detailsview' ( (lv_name_1_0= RULE_ID ) ) ( '(' ( (lv_content_3_0= ruleParameter ) ) ')' )? ( ':' ( ( RULE_ID ) ) )? '{' 'title' '=' ( (lv_title_10_0= ruleScalarExpression ) ) ( (lv_buttons_11_0= ruleButton ) )* ( (lv_header_12_0= ruleViewHeader ) )? ( (lv_forAllSections_13_0= ruleViewForAllSections ) )? ( (lv_sections_14_0= ruleViewSection ) )* ( 'action' '=' ( (lv_actions_17_0= ruleAction ) ) ( ',' ( (lv_actions_19_0= ruleAction ) ) )* )? '}' ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3006:1: ( 'detailsview' ( (lv_name_1_0= RULE_ID ) ) ( '(' ( (lv_content_3_0= ruleParameter ) ) ')' )? ( ':' ( ( RULE_ID ) ) )? '{' 'title' '=' ( (lv_title_10_0= ruleScalarExpression ) ) ( (lv_buttons_11_0= ruleButton ) )* ( (lv_header_12_0= ruleViewHeader ) )? ( (lv_forAllSections_13_0= ruleViewForAllSections ) )? ( (lv_sections_14_0= ruleViewSection ) )* ( 'action' '=' ( (lv_actions_17_0= ruleAction ) ) ( ',' ( (lv_actions_19_0= ruleAction ) ) )* )? '}' )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3006:1: ( 'detailsview' ( (lv_name_1_0= RULE_ID ) ) ( '(' ( (lv_content_3_0= ruleParameter ) ) ')' )? ( ':' ( ( RULE_ID ) ) )? '{' 'title' '=' ( (lv_title_10_0= ruleScalarExpression ) ) ( (lv_buttons_11_0= ruleButton ) )* ( (lv_header_12_0= ruleViewHeader ) )? ( (lv_forAllSections_13_0= ruleViewForAllSections ) )? ( (lv_sections_14_0= ruleViewSection ) )* ( 'action' '=' ( (lv_actions_17_0= ruleAction ) ) ( ',' ( (lv_actions_19_0= ruleAction ) ) )* )? '}' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3006:3: 'detailsview' ( (lv_name_1_0= RULE_ID ) ) ( '(' ( (lv_content_3_0= ruleParameter ) ) ')' )? ( ':' ( ( RULE_ID ) ) )? '{' 'title' '=' ( (lv_title_10_0= ruleScalarExpression ) ) ( (lv_buttons_11_0= ruleButton ) )* ( (lv_header_12_0= ruleViewHeader ) )? ( (lv_forAllSections_13_0= ruleViewForAllSections ) )? ( (lv_sections_14_0= ruleViewSection ) )* ( 'action' '=' ( (lv_actions_17_0= ruleAction ) ) ( ',' ( (lv_actions_19_0= ruleAction ) ) )* )? '}'
            {
            match(input,56,FOLLOW_56_in_ruleDetailsView5508); 

                    createLeafNode(grammarAccess.getDetailsViewAccess().getDetailsviewKeyword_0(), null); 
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3010:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3011:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3011:1: (lv_name_1_0= RULE_ID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3012:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDetailsView5525); 

            			createLeafNode(grammarAccess.getDetailsViewAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDetailsViewRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3034:2: ( '(' ( (lv_content_3_0= ruleParameter ) ) ')' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==21) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3034:4: '(' ( (lv_content_3_0= ruleParameter ) ) ')'
                    {
                    match(input,21,FOLLOW_21_in_ruleDetailsView5541); 

                            createLeafNode(grammarAccess.getDetailsViewAccess().getLeftParenthesisKeyword_2_0(), null); 
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3038:1: ( (lv_content_3_0= ruleParameter ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3039:1: (lv_content_3_0= ruleParameter )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3039:1: (lv_content_3_0= ruleParameter )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3040:3: lv_content_3_0= ruleParameter
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getDetailsViewAccess().getContentParameterParserRuleCall_2_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleParameter_in_ruleDetailsView5562);
                    lv_content_3_0=ruleParameter();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDetailsViewRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"content",
                    	        		lv_content_3_0, 
                    	        		"Parameter", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    match(input,22,FOLLOW_22_in_ruleDetailsView5572); 

                            createLeafNode(grammarAccess.getDetailsViewAccess().getRightParenthesisKeyword_2_2(), null); 
                        

                    }
                    break;

            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3066:3: ( ':' ( ( RULE_ID ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==54) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3066:5: ':' ( ( RULE_ID ) )
                    {
                    match(input,54,FOLLOW_54_in_ruleDetailsView5585); 

                            createLeafNode(grammarAccess.getDetailsViewAccess().getColonKeyword_3_0(), null); 
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3070:1: ( ( RULE_ID ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3071:1: ( RULE_ID )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3071:1: ( RULE_ID )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3072:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getDetailsViewRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDetailsView5603); 

                    		createLeafNode(grammarAccess.getDetailsViewAccess().getSuperViewSectionedViewCrossReference_3_1_0(), "superView"); 
                    	

                    }


                    }


                    }
                    break;

            }

            match(input,13,FOLLOW_13_in_ruleDetailsView5615); 

                    createLeafNode(grammarAccess.getDetailsViewAccess().getLeftCurlyBracketKeyword_4(), null); 
                
            match(input,34,FOLLOW_34_in_ruleDetailsView5625); 

                    createLeafNode(grammarAccess.getDetailsViewAccess().getTitleKeyword_5(), null); 
                
            match(input,12,FOLLOW_12_in_ruleDetailsView5635); 

                    createLeafNode(grammarAccess.getDetailsViewAccess().getEqualsSignKeyword_6(), null); 
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3096:1: ( (lv_title_10_0= ruleScalarExpression ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3097:1: (lv_title_10_0= ruleScalarExpression )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3097:1: (lv_title_10_0= ruleScalarExpression )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3098:3: lv_title_10_0= ruleScalarExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getDetailsViewAccess().getTitleScalarExpressionParserRuleCall_7_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleScalarExpression_in_ruleDetailsView5656);
            lv_title_10_0=ruleScalarExpression();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDetailsViewRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"title",
            	        		lv_title_10_0, 
            	        		"ScalarExpression", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3120:2: ( (lv_buttons_11_0= ruleButton ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( LA47_0 ==33 && getUnorderedGroupHelper().canSelect(grammarAccess.getButtonAccess().getUnorderedGroup(), 0) ) {
                    alt47=1;
                }
                else if ( LA47_0 ==14 && getUnorderedGroupHelper().canSelect(grammarAccess.getButtonAccess().getUnorderedGroup(), 1) ) {
                    alt47=1;
                }
                else if ( LA47_0 >=35 && LA47_0<=36 && getUnorderedGroupHelper().canSelect(grammarAccess.getButtonAccess().getUnorderedGroup(), 2) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3121:1: (lv_buttons_11_0= ruleButton )
            	    {
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3121:1: (lv_buttons_11_0= ruleButton )
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3122:3: lv_buttons_11_0= ruleButton
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getDetailsViewAccess().getButtonsButtonParserRuleCall_8_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleButton_in_ruleDetailsView5677);
            	    lv_buttons_11_0=ruleButton();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getDetailsViewRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"buttons",
            	    	        		lv_buttons_11_0, 
            	    	        		"Button", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3144:3: ( (lv_header_12_0= ruleViewHeader ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==60) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3145:1: (lv_header_12_0= ruleViewHeader )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3145:1: (lv_header_12_0= ruleViewHeader )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3146:3: lv_header_12_0= ruleViewHeader
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getDetailsViewAccess().getHeaderViewHeaderParserRuleCall_9_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleViewHeader_in_ruleDetailsView5699);
                    lv_header_12_0=ruleViewHeader();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDetailsViewRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"header",
                    	        		lv_header_12_0, 
                    	        		"ViewHeader", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3168:3: ( (lv_forAllSections_13_0= ruleViewForAllSections ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==65) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3169:1: (lv_forAllSections_13_0= ruleViewForAllSections )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3169:1: (lv_forAllSections_13_0= ruleViewForAllSections )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3170:3: lv_forAllSections_13_0= ruleViewForAllSections
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getDetailsViewAccess().getForAllSectionsViewForAllSectionsParserRuleCall_10_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleViewForAllSections_in_ruleDetailsView5721);
                    lv_forAllSections_13_0=ruleViewForAllSections();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDetailsViewRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"forAllSections",
                    	        		lv_forAllSections_13_0, 
                    	        		"ViewForAllSections", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3192:3: ( (lv_sections_14_0= ruleViewSection ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==64) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3193:1: (lv_sections_14_0= ruleViewSection )
            	    {
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3193:1: (lv_sections_14_0= ruleViewSection )
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3194:3: lv_sections_14_0= ruleViewSection
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getDetailsViewAccess().getSectionsViewSectionParserRuleCall_11_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleViewSection_in_ruleDetailsView5743);
            	    lv_sections_14_0=ruleViewSection();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getDetailsViewRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"sections",
            	    	        		lv_sections_14_0, 
            	    	        		"ViewSection", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3216:3: ( 'action' '=' ( (lv_actions_17_0= ruleAction ) ) ( ',' ( (lv_actions_19_0= ruleAction ) ) )* )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==55) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3216:5: 'action' '=' ( (lv_actions_17_0= ruleAction ) ) ( ',' ( (lv_actions_19_0= ruleAction ) ) )*
                    {
                    match(input,55,FOLLOW_55_in_ruleDetailsView5755); 

                            createLeafNode(grammarAccess.getDetailsViewAccess().getActionKeyword_12_0(), null); 
                        
                    match(input,12,FOLLOW_12_in_ruleDetailsView5765); 

                            createLeafNode(grammarAccess.getDetailsViewAccess().getEqualsSignKeyword_12_1(), null); 
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3224:1: ( (lv_actions_17_0= ruleAction ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3225:1: (lv_actions_17_0= ruleAction )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3225:1: (lv_actions_17_0= ruleAction )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3226:3: lv_actions_17_0= ruleAction
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getDetailsViewAccess().getActionsActionParserRuleCall_12_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleAction_in_ruleDetailsView5786);
                    lv_actions_17_0=ruleAction();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDetailsViewRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"actions",
                    	        		lv_actions_17_0, 
                    	        		"Action", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3248:2: ( ',' ( (lv_actions_19_0= ruleAction ) ) )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==16) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3248:4: ',' ( (lv_actions_19_0= ruleAction ) )
                    	    {
                    	    match(input,16,FOLLOW_16_in_ruleDetailsView5797); 

                    	            createLeafNode(grammarAccess.getDetailsViewAccess().getCommaKeyword_12_3_0(), null); 
                    	        
                    	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3252:1: ( (lv_actions_19_0= ruleAction ) )
                    	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3253:1: (lv_actions_19_0= ruleAction )
                    	    {
                    	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3253:1: (lv_actions_19_0= ruleAction )
                    	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3254:3: lv_actions_19_0= ruleAction
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getDetailsViewAccess().getActionsActionParserRuleCall_12_3_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAction_in_ruleDetailsView5818);
                    	    lv_actions_19_0=ruleAction();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getDetailsViewRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"actions",
                    	    	        		lv_actions_19_0, 
                    	    	        		"Action", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop51;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,17,FOLLOW_17_in_ruleDetailsView5832); 

                    createLeafNode(grammarAccess.getDetailsViewAccess().getRightCurlyBracketKeyword_13(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleDetailsView


    // $ANTLR start entryRuleWebView
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3288:1: entryRuleWebView returns [EObject current=null] : iv_ruleWebView= ruleWebView EOF ;
    public final EObject entryRuleWebView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWebView = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3289:2: (iv_ruleWebView= ruleWebView EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3290:2: iv_ruleWebView= ruleWebView EOF
            {
             currentNode = createCompositeNode(grammarAccess.getWebViewRule(), currentNode); 
            pushFollow(FOLLOW_ruleWebView_in_entryRuleWebView5868);
            iv_ruleWebView=ruleWebView();
            _fsp--;

             current =iv_ruleWebView; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWebView5878); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleWebView


    // $ANTLR start ruleWebView
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3297:1: ruleWebView returns [EObject current=null] : ( 'webview' ( (lv_name_1_0= RULE_ID ) ) '{' 'title' '=' ( (lv_title_5_0= ruleScalarExpression ) ) ( (lv_buttons_6_0= ruleButton ) )* ( (lv_header_7_0= ruleViewHeader ) )? ( (lv_forAllSections_8_0= ruleViewForAllSections ) )? ( (lv_sections_9_0= ruleViewSection ) )* ( 'action' '=' ( (lv_actions_12_0= ruleAction ) ) ( ',' ( (lv_actions_14_0= ruleAction ) ) )* )? '}' ) ;
    public final EObject ruleWebView() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_title_5_0 = null;

        EObject lv_buttons_6_0 = null;

        EObject lv_header_7_0 = null;

        EObject lv_forAllSections_8_0 = null;

        EObject lv_sections_9_0 = null;

        EObject lv_actions_12_0 = null;

        EObject lv_actions_14_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3302:6: ( ( 'webview' ( (lv_name_1_0= RULE_ID ) ) '{' 'title' '=' ( (lv_title_5_0= ruleScalarExpression ) ) ( (lv_buttons_6_0= ruleButton ) )* ( (lv_header_7_0= ruleViewHeader ) )? ( (lv_forAllSections_8_0= ruleViewForAllSections ) )? ( (lv_sections_9_0= ruleViewSection ) )* ( 'action' '=' ( (lv_actions_12_0= ruleAction ) ) ( ',' ( (lv_actions_14_0= ruleAction ) ) )* )? '}' ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3303:1: ( 'webview' ( (lv_name_1_0= RULE_ID ) ) '{' 'title' '=' ( (lv_title_5_0= ruleScalarExpression ) ) ( (lv_buttons_6_0= ruleButton ) )* ( (lv_header_7_0= ruleViewHeader ) )? ( (lv_forAllSections_8_0= ruleViewForAllSections ) )? ( (lv_sections_9_0= ruleViewSection ) )* ( 'action' '=' ( (lv_actions_12_0= ruleAction ) ) ( ',' ( (lv_actions_14_0= ruleAction ) ) )* )? '}' )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3303:1: ( 'webview' ( (lv_name_1_0= RULE_ID ) ) '{' 'title' '=' ( (lv_title_5_0= ruleScalarExpression ) ) ( (lv_buttons_6_0= ruleButton ) )* ( (lv_header_7_0= ruleViewHeader ) )? ( (lv_forAllSections_8_0= ruleViewForAllSections ) )? ( (lv_sections_9_0= ruleViewSection ) )* ( 'action' '=' ( (lv_actions_12_0= ruleAction ) ) ( ',' ( (lv_actions_14_0= ruleAction ) ) )* )? '}' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3303:3: 'webview' ( (lv_name_1_0= RULE_ID ) ) '{' 'title' '=' ( (lv_title_5_0= ruleScalarExpression ) ) ( (lv_buttons_6_0= ruleButton ) )* ( (lv_header_7_0= ruleViewHeader ) )? ( (lv_forAllSections_8_0= ruleViewForAllSections ) )? ( (lv_sections_9_0= ruleViewSection ) )* ( 'action' '=' ( (lv_actions_12_0= ruleAction ) ) ( ',' ( (lv_actions_14_0= ruleAction ) ) )* )? '}'
            {
            match(input,57,FOLLOW_57_in_ruleWebView5913); 

                    createLeafNode(grammarAccess.getWebViewAccess().getWebviewKeyword_0(), null); 
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3307:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3308:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3308:1: (lv_name_1_0= RULE_ID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3309:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWebView5930); 

            			createLeafNode(grammarAccess.getWebViewAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getWebViewRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,13,FOLLOW_13_in_ruleWebView5945); 

                    createLeafNode(grammarAccess.getWebViewAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            match(input,34,FOLLOW_34_in_ruleWebView5955); 

                    createLeafNode(grammarAccess.getWebViewAccess().getTitleKeyword_3(), null); 
                
            match(input,12,FOLLOW_12_in_ruleWebView5965); 

                    createLeafNode(grammarAccess.getWebViewAccess().getEqualsSignKeyword_4(), null); 
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3343:1: ( (lv_title_5_0= ruleScalarExpression ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3344:1: (lv_title_5_0= ruleScalarExpression )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3344:1: (lv_title_5_0= ruleScalarExpression )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3345:3: lv_title_5_0= ruleScalarExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getWebViewAccess().getTitleScalarExpressionParserRuleCall_5_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleScalarExpression_in_ruleWebView5986);
            lv_title_5_0=ruleScalarExpression();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getWebViewRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"title",
            	        		lv_title_5_0, 
            	        		"ScalarExpression", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3367:2: ( (lv_buttons_6_0= ruleButton ) )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( LA53_0 ==33 && getUnorderedGroupHelper().canSelect(grammarAccess.getButtonAccess().getUnorderedGroup(), 0) ) {
                    alt53=1;
                }
                else if ( LA53_0 ==14 && getUnorderedGroupHelper().canSelect(grammarAccess.getButtonAccess().getUnorderedGroup(), 1) ) {
                    alt53=1;
                }
                else if ( LA53_0 >=35 && LA53_0<=36 && getUnorderedGroupHelper().canSelect(grammarAccess.getButtonAccess().getUnorderedGroup(), 2) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3368:1: (lv_buttons_6_0= ruleButton )
            	    {
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3368:1: (lv_buttons_6_0= ruleButton )
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3369:3: lv_buttons_6_0= ruleButton
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getWebViewAccess().getButtonsButtonParserRuleCall_6_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleButton_in_ruleWebView6007);
            	    lv_buttons_6_0=ruleButton();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getWebViewRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"buttons",
            	    	        		lv_buttons_6_0, 
            	    	        		"Button", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3391:3: ( (lv_header_7_0= ruleViewHeader ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==60) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3392:1: (lv_header_7_0= ruleViewHeader )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3392:1: (lv_header_7_0= ruleViewHeader )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3393:3: lv_header_7_0= ruleViewHeader
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getWebViewAccess().getHeaderViewHeaderParserRuleCall_7_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleViewHeader_in_ruleWebView6029);
                    lv_header_7_0=ruleViewHeader();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getWebViewRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"header",
                    	        		lv_header_7_0, 
                    	        		"ViewHeader", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3415:3: ( (lv_forAllSections_8_0= ruleViewForAllSections ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==65) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3416:1: (lv_forAllSections_8_0= ruleViewForAllSections )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3416:1: (lv_forAllSections_8_0= ruleViewForAllSections )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3417:3: lv_forAllSections_8_0= ruleViewForAllSections
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getWebViewAccess().getForAllSectionsViewForAllSectionsParserRuleCall_8_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleViewForAllSections_in_ruleWebView6051);
                    lv_forAllSections_8_0=ruleViewForAllSections();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getWebViewRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"forAllSections",
                    	        		lv_forAllSections_8_0, 
                    	        		"ViewForAllSections", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3439:3: ( (lv_sections_9_0= ruleViewSection ) )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==64) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3440:1: (lv_sections_9_0= ruleViewSection )
            	    {
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3440:1: (lv_sections_9_0= ruleViewSection )
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3441:3: lv_sections_9_0= ruleViewSection
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getWebViewAccess().getSectionsViewSectionParserRuleCall_9_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleViewSection_in_ruleWebView6073);
            	    lv_sections_9_0=ruleViewSection();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getWebViewRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"sections",
            	    	        		lv_sections_9_0, 
            	    	        		"ViewSection", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3463:3: ( 'action' '=' ( (lv_actions_12_0= ruleAction ) ) ( ',' ( (lv_actions_14_0= ruleAction ) ) )* )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==55) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3463:5: 'action' '=' ( (lv_actions_12_0= ruleAction ) ) ( ',' ( (lv_actions_14_0= ruleAction ) ) )*
                    {
                    match(input,55,FOLLOW_55_in_ruleWebView6085); 

                            createLeafNode(grammarAccess.getWebViewAccess().getActionKeyword_10_0(), null); 
                        
                    match(input,12,FOLLOW_12_in_ruleWebView6095); 

                            createLeafNode(grammarAccess.getWebViewAccess().getEqualsSignKeyword_10_1(), null); 
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3471:1: ( (lv_actions_12_0= ruleAction ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3472:1: (lv_actions_12_0= ruleAction )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3472:1: (lv_actions_12_0= ruleAction )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3473:3: lv_actions_12_0= ruleAction
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getWebViewAccess().getActionsActionParserRuleCall_10_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleAction_in_ruleWebView6116);
                    lv_actions_12_0=ruleAction();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getWebViewRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"actions",
                    	        		lv_actions_12_0, 
                    	        		"Action", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3495:2: ( ',' ( (lv_actions_14_0= ruleAction ) ) )*
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==16) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3495:4: ',' ( (lv_actions_14_0= ruleAction ) )
                    	    {
                    	    match(input,16,FOLLOW_16_in_ruleWebView6127); 

                    	            createLeafNode(grammarAccess.getWebViewAccess().getCommaKeyword_10_3_0(), null); 
                    	        
                    	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3499:1: ( (lv_actions_14_0= ruleAction ) )
                    	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3500:1: (lv_actions_14_0= ruleAction )
                    	    {
                    	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3500:1: (lv_actions_14_0= ruleAction )
                    	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3501:3: lv_actions_14_0= ruleAction
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getWebViewAccess().getActionsActionParserRuleCall_10_3_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAction_in_ruleWebView6148);
                    	    lv_actions_14_0=ruleAction();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getWebViewRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"actions",
                    	    	        		lv_actions_14_0, 
                    	    	        		"Action", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop57;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,17,FOLLOW_17_in_ruleWebView6162); 

                    createLeafNode(grammarAccess.getWebViewAccess().getRightCurlyBracketKeyword_11(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleWebView


    // $ANTLR start entryRuleCustomView
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3535:1: entryRuleCustomView returns [EObject current=null] : iv_ruleCustomView= ruleCustomView EOF ;
    public final EObject entryRuleCustomView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomView = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3536:2: (iv_ruleCustomView= ruleCustomView EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3537:2: iv_ruleCustomView= ruleCustomView EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCustomViewRule(), currentNode); 
            pushFollow(FOLLOW_ruleCustomView_in_entryRuleCustomView6198);
            iv_ruleCustomView=ruleCustomView();
            _fsp--;

             current =iv_ruleCustomView; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCustomView6208); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleCustomView


    // $ANTLR start ruleCustomView
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3544:1: ruleCustomView returns [EObject current=null] : ( 'customview' ( (lv_name_1_0= RULE_ID ) ) ( '(' ( (lv_content_3_0= ruleParameter ) ) ')' )? 'implementedBy' ( (lv_objclass_6_0= RULE_STRING ) ) 'title' '=' ( (lv_title_9_0= ruleScalarExpression ) ) ( (lv_buttons_10_0= ruleButton ) )* ( 'action' '=' ( (lv_actions_13_0= ruleAction ) ) ( ',' ( (lv_actions_15_0= ruleAction ) ) )* )? ) ;
    public final EObject ruleCustomView() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_objclass_6_0=null;
        EObject lv_content_3_0 = null;

        EObject lv_title_9_0 = null;

        EObject lv_buttons_10_0 = null;

        EObject lv_actions_13_0 = null;

        EObject lv_actions_15_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3549:6: ( ( 'customview' ( (lv_name_1_0= RULE_ID ) ) ( '(' ( (lv_content_3_0= ruleParameter ) ) ')' )? 'implementedBy' ( (lv_objclass_6_0= RULE_STRING ) ) 'title' '=' ( (lv_title_9_0= ruleScalarExpression ) ) ( (lv_buttons_10_0= ruleButton ) )* ( 'action' '=' ( (lv_actions_13_0= ruleAction ) ) ( ',' ( (lv_actions_15_0= ruleAction ) ) )* )? ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3550:1: ( 'customview' ( (lv_name_1_0= RULE_ID ) ) ( '(' ( (lv_content_3_0= ruleParameter ) ) ')' )? 'implementedBy' ( (lv_objclass_6_0= RULE_STRING ) ) 'title' '=' ( (lv_title_9_0= ruleScalarExpression ) ) ( (lv_buttons_10_0= ruleButton ) )* ( 'action' '=' ( (lv_actions_13_0= ruleAction ) ) ( ',' ( (lv_actions_15_0= ruleAction ) ) )* )? )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3550:1: ( 'customview' ( (lv_name_1_0= RULE_ID ) ) ( '(' ( (lv_content_3_0= ruleParameter ) ) ')' )? 'implementedBy' ( (lv_objclass_6_0= RULE_STRING ) ) 'title' '=' ( (lv_title_9_0= ruleScalarExpression ) ) ( (lv_buttons_10_0= ruleButton ) )* ( 'action' '=' ( (lv_actions_13_0= ruleAction ) ) ( ',' ( (lv_actions_15_0= ruleAction ) ) )* )? )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3550:3: 'customview' ( (lv_name_1_0= RULE_ID ) ) ( '(' ( (lv_content_3_0= ruleParameter ) ) ')' )? 'implementedBy' ( (lv_objclass_6_0= RULE_STRING ) ) 'title' '=' ( (lv_title_9_0= ruleScalarExpression ) ) ( (lv_buttons_10_0= ruleButton ) )* ( 'action' '=' ( (lv_actions_13_0= ruleAction ) ) ( ',' ( (lv_actions_15_0= ruleAction ) ) )* )?
            {
            match(input,58,FOLLOW_58_in_ruleCustomView6243); 

                    createLeafNode(grammarAccess.getCustomViewAccess().getCustomviewKeyword_0(), null); 
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3554:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3555:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3555:1: (lv_name_1_0= RULE_ID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3556:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCustomView6260); 

            			createLeafNode(grammarAccess.getCustomViewAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getCustomViewRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3578:2: ( '(' ( (lv_content_3_0= ruleParameter ) ) ')' )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==21) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3578:4: '(' ( (lv_content_3_0= ruleParameter ) ) ')'
                    {
                    match(input,21,FOLLOW_21_in_ruleCustomView6276); 

                            createLeafNode(grammarAccess.getCustomViewAccess().getLeftParenthesisKeyword_2_0(), null); 
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3582:1: ( (lv_content_3_0= ruleParameter ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3583:1: (lv_content_3_0= ruleParameter )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3583:1: (lv_content_3_0= ruleParameter )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3584:3: lv_content_3_0= ruleParameter
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getCustomViewAccess().getContentParameterParserRuleCall_2_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleParameter_in_ruleCustomView6297);
                    lv_content_3_0=ruleParameter();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getCustomViewRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"content",
                    	        		lv_content_3_0, 
                    	        		"Parameter", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    match(input,22,FOLLOW_22_in_ruleCustomView6307); 

                            createLeafNode(grammarAccess.getCustomViewAccess().getRightParenthesisKeyword_2_2(), null); 
                        

                    }
                    break;

            }

            match(input,59,FOLLOW_59_in_ruleCustomView6319); 

                    createLeafNode(grammarAccess.getCustomViewAccess().getImplementedByKeyword_3(), null); 
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3614:1: ( (lv_objclass_6_0= RULE_STRING ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3615:1: (lv_objclass_6_0= RULE_STRING )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3615:1: (lv_objclass_6_0= RULE_STRING )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3616:3: lv_objclass_6_0= RULE_STRING
            {
            lv_objclass_6_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCustomView6336); 

            			createLeafNode(grammarAccess.getCustomViewAccess().getObjclassSTRINGTerminalRuleCall_4_0(), "objclass"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getCustomViewRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"objclass",
            	        		lv_objclass_6_0, 
            	        		"STRING", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,34,FOLLOW_34_in_ruleCustomView6351); 

                    createLeafNode(grammarAccess.getCustomViewAccess().getTitleKeyword_5(), null); 
                
            match(input,12,FOLLOW_12_in_ruleCustomView6361); 

                    createLeafNode(grammarAccess.getCustomViewAccess().getEqualsSignKeyword_6(), null); 
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3646:1: ( (lv_title_9_0= ruleScalarExpression ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3647:1: (lv_title_9_0= ruleScalarExpression )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3647:1: (lv_title_9_0= ruleScalarExpression )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3648:3: lv_title_9_0= ruleScalarExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getCustomViewAccess().getTitleScalarExpressionParserRuleCall_7_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleScalarExpression_in_ruleCustomView6382);
            lv_title_9_0=ruleScalarExpression();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getCustomViewRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"title",
            	        		lv_title_9_0, 
            	        		"ScalarExpression", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3670:2: ( (lv_buttons_10_0= ruleButton ) )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( LA60_0 ==33 && getUnorderedGroupHelper().canSelect(grammarAccess.getButtonAccess().getUnorderedGroup(), 0) ) {
                    alt60=1;
                }
                else if ( LA60_0 ==14 && getUnorderedGroupHelper().canSelect(grammarAccess.getButtonAccess().getUnorderedGroup(), 1) ) {
                    alt60=1;
                }
                else if ( LA60_0 >=35 && LA60_0<=36 && getUnorderedGroupHelper().canSelect(grammarAccess.getButtonAccess().getUnorderedGroup(), 2) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3671:1: (lv_buttons_10_0= ruleButton )
            	    {
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3671:1: (lv_buttons_10_0= ruleButton )
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3672:3: lv_buttons_10_0= ruleButton
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getCustomViewAccess().getButtonsButtonParserRuleCall_8_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleButton_in_ruleCustomView6403);
            	    lv_buttons_10_0=ruleButton();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getCustomViewRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"buttons",
            	    	        		lv_buttons_10_0, 
            	    	        		"Button", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3694:3: ( 'action' '=' ( (lv_actions_13_0= ruleAction ) ) ( ',' ( (lv_actions_15_0= ruleAction ) ) )* )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==55) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3694:5: 'action' '=' ( (lv_actions_13_0= ruleAction ) ) ( ',' ( (lv_actions_15_0= ruleAction ) ) )*
                    {
                    match(input,55,FOLLOW_55_in_ruleCustomView6415); 

                            createLeafNode(grammarAccess.getCustomViewAccess().getActionKeyword_9_0(), null); 
                        
                    match(input,12,FOLLOW_12_in_ruleCustomView6425); 

                            createLeafNode(grammarAccess.getCustomViewAccess().getEqualsSignKeyword_9_1(), null); 
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3702:1: ( (lv_actions_13_0= ruleAction ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3703:1: (lv_actions_13_0= ruleAction )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3703:1: (lv_actions_13_0= ruleAction )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3704:3: lv_actions_13_0= ruleAction
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getCustomViewAccess().getActionsActionParserRuleCall_9_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleAction_in_ruleCustomView6446);
                    lv_actions_13_0=ruleAction();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getCustomViewRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"actions",
                    	        		lv_actions_13_0, 
                    	        		"Action", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3726:2: ( ',' ( (lv_actions_15_0= ruleAction ) ) )*
                    loop61:
                    do {
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( (LA61_0==16) ) {
                            alt61=1;
                        }


                        switch (alt61) {
                    	case 1 :
                    	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3726:4: ',' ( (lv_actions_15_0= ruleAction ) )
                    	    {
                    	    match(input,16,FOLLOW_16_in_ruleCustomView6457); 

                    	            createLeafNode(grammarAccess.getCustomViewAccess().getCommaKeyword_9_3_0(), null); 
                    	        
                    	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3730:1: ( (lv_actions_15_0= ruleAction ) )
                    	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3731:1: (lv_actions_15_0= ruleAction )
                    	    {
                    	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3731:1: (lv_actions_15_0= ruleAction )
                    	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3732:3: lv_actions_15_0= ruleAction
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getCustomViewAccess().getActionsActionParserRuleCall_9_3_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAction_in_ruleCustomView6478);
                    	    lv_actions_15_0=ruleAction();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getCustomViewRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"actions",
                    	    	        		lv_actions_15_0, 
                    	    	        		"Action", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop61;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleCustomView


    // $ANTLR start entryRuleAction
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3762:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3763:2: (iv_ruleAction= ruleAction EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3764:2: iv_ruleAction= ruleAction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getActionRule(), currentNode); 
            pushFollow(FOLLOW_ruleAction_in_entryRuleAction6518);
            iv_ruleAction=ruleAction();
            _fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAction6528); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAction


    // $ANTLR start ruleAction
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3771:1: ruleAction returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3776:6: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3777:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3777:1: ( (lv_name_0_0= RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3778:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3778:1: (lv_name_0_0= RULE_ID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3779:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAction6569); 

            			createLeafNode(grammarAccess.getActionAccess().getNameIDTerminalRuleCall_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getActionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_0_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAction


    // $ANTLR start entryRuleViewHeader
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3809:1: entryRuleViewHeader returns [EObject current=null] : iv_ruleViewHeader= ruleViewHeader EOF ;
    public final EObject entryRuleViewHeader() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleViewHeader = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3810:2: (iv_ruleViewHeader= ruleViewHeader EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3811:2: iv_ruleViewHeader= ruleViewHeader EOF
            {
             currentNode = createCompositeNode(grammarAccess.getViewHeaderRule(), currentNode); 
            pushFollow(FOLLOW_ruleViewHeader_in_entryRuleViewHeader6609);
            iv_ruleViewHeader=ruleViewHeader();
            _fsp--;

             current =iv_ruleViewHeader; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleViewHeader6619); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleViewHeader


    // $ANTLR start ruleViewHeader
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3818:1: ruleViewHeader returns [EObject current=null] : ( () 'header' '{' ( 'title' '=' ( (lv_title_5_0= ruleScalarExpression ) ) )? ( 'subtitle' '=' ( (lv_subtitle_8_0= ruleScalarExpression ) ) )? ( 'details' '=' ( (lv_details_11_0= ruleScalarExpression ) ) )? ( 'image' '=' ( (lv_image_14_0= ruleScalarExpression ) ) )? '}' ) ;
    public final EObject ruleViewHeader() throws RecognitionException {
        EObject current = null;

        EObject lv_title_5_0 = null;

        EObject lv_subtitle_8_0 = null;

        EObject lv_details_11_0 = null;

        EObject lv_image_14_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3823:6: ( ( () 'header' '{' ( 'title' '=' ( (lv_title_5_0= ruleScalarExpression ) ) )? ( 'subtitle' '=' ( (lv_subtitle_8_0= ruleScalarExpression ) ) )? ( 'details' '=' ( (lv_details_11_0= ruleScalarExpression ) ) )? ( 'image' '=' ( (lv_image_14_0= ruleScalarExpression ) ) )? '}' ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3824:1: ( () 'header' '{' ( 'title' '=' ( (lv_title_5_0= ruleScalarExpression ) ) )? ( 'subtitle' '=' ( (lv_subtitle_8_0= ruleScalarExpression ) ) )? ( 'details' '=' ( (lv_details_11_0= ruleScalarExpression ) ) )? ( 'image' '=' ( (lv_image_14_0= ruleScalarExpression ) ) )? '}' )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3824:1: ( () 'header' '{' ( 'title' '=' ( (lv_title_5_0= ruleScalarExpression ) ) )? ( 'subtitle' '=' ( (lv_subtitle_8_0= ruleScalarExpression ) ) )? ( 'details' '=' ( (lv_details_11_0= ruleScalarExpression ) ) )? ( 'image' '=' ( (lv_image_14_0= ruleScalarExpression ) ) )? '}' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3824:2: () 'header' '{' ( 'title' '=' ( (lv_title_5_0= ruleScalarExpression ) ) )? ( 'subtitle' '=' ( (lv_subtitle_8_0= ruleScalarExpression ) ) )? ( 'details' '=' ( (lv_details_11_0= ruleScalarExpression ) ) )? ( 'image' '=' ( (lv_image_14_0= ruleScalarExpression ) ) )? '}'
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3824:2: ()
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3825:5: 
            {
             
                    temp=factory.create(grammarAccess.getViewHeaderAccess().getViewHeaderAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getViewHeaderAccess().getViewHeaderAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,60,FOLLOW_60_in_ruleViewHeader6663); 

                    createLeafNode(grammarAccess.getViewHeaderAccess().getHeaderKeyword_1(), null); 
                
            match(input,13,FOLLOW_13_in_ruleViewHeader6673); 

                    createLeafNode(grammarAccess.getViewHeaderAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3843:1: ( 'title' '=' ( (lv_title_5_0= ruleScalarExpression ) ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==34) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3843:3: 'title' '=' ( (lv_title_5_0= ruleScalarExpression ) )
                    {
                    match(input,34,FOLLOW_34_in_ruleViewHeader6684); 

                            createLeafNode(grammarAccess.getViewHeaderAccess().getTitleKeyword_3_0(), null); 
                        
                    match(input,12,FOLLOW_12_in_ruleViewHeader6694); 

                            createLeafNode(grammarAccess.getViewHeaderAccess().getEqualsSignKeyword_3_1(), null); 
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3851:1: ( (lv_title_5_0= ruleScalarExpression ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3852:1: (lv_title_5_0= ruleScalarExpression )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3852:1: (lv_title_5_0= ruleScalarExpression )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3853:3: lv_title_5_0= ruleScalarExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getViewHeaderAccess().getTitleScalarExpressionParserRuleCall_3_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleScalarExpression_in_ruleViewHeader6715);
                    lv_title_5_0=ruleScalarExpression();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getViewHeaderRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"title",
                    	        		lv_title_5_0, 
                    	        		"ScalarExpression", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3875:4: ( 'subtitle' '=' ( (lv_subtitle_8_0= ruleScalarExpression ) ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==61) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3875:6: 'subtitle' '=' ( (lv_subtitle_8_0= ruleScalarExpression ) )
                    {
                    match(input,61,FOLLOW_61_in_ruleViewHeader6728); 

                            createLeafNode(grammarAccess.getViewHeaderAccess().getSubtitleKeyword_4_0(), null); 
                        
                    match(input,12,FOLLOW_12_in_ruleViewHeader6738); 

                            createLeafNode(grammarAccess.getViewHeaderAccess().getEqualsSignKeyword_4_1(), null); 
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3883:1: ( (lv_subtitle_8_0= ruleScalarExpression ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3884:1: (lv_subtitle_8_0= ruleScalarExpression )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3884:1: (lv_subtitle_8_0= ruleScalarExpression )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3885:3: lv_subtitle_8_0= ruleScalarExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getViewHeaderAccess().getSubtitleScalarExpressionParserRuleCall_4_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleScalarExpression_in_ruleViewHeader6759);
                    lv_subtitle_8_0=ruleScalarExpression();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getViewHeaderRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"subtitle",
                    	        		lv_subtitle_8_0, 
                    	        		"ScalarExpression", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3907:4: ( 'details' '=' ( (lv_details_11_0= ruleScalarExpression ) ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==62) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3907:6: 'details' '=' ( (lv_details_11_0= ruleScalarExpression ) )
                    {
                    match(input,62,FOLLOW_62_in_ruleViewHeader6772); 

                            createLeafNode(grammarAccess.getViewHeaderAccess().getDetailsKeyword_5_0(), null); 
                        
                    match(input,12,FOLLOW_12_in_ruleViewHeader6782); 

                            createLeafNode(grammarAccess.getViewHeaderAccess().getEqualsSignKeyword_5_1(), null); 
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3915:1: ( (lv_details_11_0= ruleScalarExpression ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3916:1: (lv_details_11_0= ruleScalarExpression )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3916:1: (lv_details_11_0= ruleScalarExpression )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3917:3: lv_details_11_0= ruleScalarExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getViewHeaderAccess().getDetailsScalarExpressionParserRuleCall_5_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleScalarExpression_in_ruleViewHeader6803);
                    lv_details_11_0=ruleScalarExpression();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getViewHeaderRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"details",
                    	        		lv_details_11_0, 
                    	        		"ScalarExpression", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3939:4: ( 'image' '=' ( (lv_image_14_0= ruleScalarExpression ) ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==63) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3939:6: 'image' '=' ( (lv_image_14_0= ruleScalarExpression ) )
                    {
                    match(input,63,FOLLOW_63_in_ruleViewHeader6816); 

                            createLeafNode(grammarAccess.getViewHeaderAccess().getImageKeyword_6_0(), null); 
                        
                    match(input,12,FOLLOW_12_in_ruleViewHeader6826); 

                            createLeafNode(grammarAccess.getViewHeaderAccess().getEqualsSignKeyword_6_1(), null); 
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3947:1: ( (lv_image_14_0= ruleScalarExpression ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3948:1: (lv_image_14_0= ruleScalarExpression )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3948:1: (lv_image_14_0= ruleScalarExpression )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3949:3: lv_image_14_0= ruleScalarExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getViewHeaderAccess().getImageScalarExpressionParserRuleCall_6_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleScalarExpression_in_ruleViewHeader6847);
                    lv_image_14_0=ruleScalarExpression();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getViewHeaderRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"image",
                    	        		lv_image_14_0, 
                    	        		"ScalarExpression", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            match(input,17,FOLLOW_17_in_ruleViewHeader6859); 

                    createLeafNode(grammarAccess.getViewHeaderAccess().getRightCurlyBracketKeyword_7(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleViewHeader


    // $ANTLR start entryRuleViewSection
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3983:1: entryRuleViewSection returns [EObject current=null] : iv_ruleViewSection= ruleViewSection EOF ;
    public final EObject entryRuleViewSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleViewSection = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3984:2: (iv_ruleViewSection= ruleViewSection EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3985:2: iv_ruleViewSection= ruleViewSection EOF
            {
             currentNode = createCompositeNode(grammarAccess.getViewSectionRule(), currentNode); 
            pushFollow(FOLLOW_ruleViewSection_in_entryRuleViewSection6895);
            iv_ruleViewSection=ruleViewSection();
            _fsp--;

             current =iv_ruleViewSection; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleViewSection6905); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleViewSection


    // $ANTLR start ruleViewSection
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3992:1: ruleViewSection returns [EObject current=null] : ( () 'section' '{' ( 'title' '=' ( (lv_title_5_0= ruleScalarExpression ) ) )? ( (lv_cells_6_0= ruleSectionCell ) )* '}' ) ;
    public final EObject ruleViewSection() throws RecognitionException {
        EObject current = null;

        EObject lv_title_5_0 = null;

        EObject lv_cells_6_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3997:6: ( ( () 'section' '{' ( 'title' '=' ( (lv_title_5_0= ruleScalarExpression ) ) )? ( (lv_cells_6_0= ruleSectionCell ) )* '}' ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3998:1: ( () 'section' '{' ( 'title' '=' ( (lv_title_5_0= ruleScalarExpression ) ) )? ( (lv_cells_6_0= ruleSectionCell ) )* '}' )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3998:1: ( () 'section' '{' ( 'title' '=' ( (lv_title_5_0= ruleScalarExpression ) ) )? ( (lv_cells_6_0= ruleSectionCell ) )* '}' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3998:2: () 'section' '{' ( 'title' '=' ( (lv_title_5_0= ruleScalarExpression ) ) )? ( (lv_cells_6_0= ruleSectionCell ) )* '}'
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3998:2: ()
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:3999:5: 
            {
             
                    temp=factory.create(grammarAccess.getViewSectionAccess().getViewSectionAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getViewSectionAccess().getViewSectionAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,64,FOLLOW_64_in_ruleViewSection6949); 

                    createLeafNode(grammarAccess.getViewSectionAccess().getSectionKeyword_1(), null); 
                
            match(input,13,FOLLOW_13_in_ruleViewSection6959); 

                    createLeafNode(grammarAccess.getViewSectionAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4017:1: ( 'title' '=' ( (lv_title_5_0= ruleScalarExpression ) ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==34) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4017:3: 'title' '=' ( (lv_title_5_0= ruleScalarExpression ) )
                    {
                    match(input,34,FOLLOW_34_in_ruleViewSection6970); 

                            createLeafNode(grammarAccess.getViewSectionAccess().getTitleKeyword_3_0(), null); 
                        
                    match(input,12,FOLLOW_12_in_ruleViewSection6980); 

                            createLeafNode(grammarAccess.getViewSectionAccess().getEqualsSignKeyword_3_1(), null); 
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4025:1: ( (lv_title_5_0= ruleScalarExpression ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4026:1: (lv_title_5_0= ruleScalarExpression )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4026:1: (lv_title_5_0= ruleScalarExpression )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4027:3: lv_title_5_0= ruleScalarExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getViewSectionAccess().getTitleScalarExpressionParserRuleCall_3_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleScalarExpression_in_ruleViewSection7001);
                    lv_title_5_0=ruleScalarExpression();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getViewSectionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"title",
                    	        		lv_title_5_0, 
                    	        		"ScalarExpression", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4049:4: ( (lv_cells_6_0= ruleSectionCell ) )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==67) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4050:1: (lv_cells_6_0= ruleSectionCell )
            	    {
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4050:1: (lv_cells_6_0= ruleSectionCell )
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4051:3: lv_cells_6_0= ruleSectionCell
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getViewSectionAccess().getCellsSectionCellParserRuleCall_4_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleSectionCell_in_ruleViewSection7024);
            	    lv_cells_6_0=ruleSectionCell();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getViewSectionRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"cells",
            	    	        		lv_cells_6_0, 
            	    	        		"SectionCell", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop68;
                }
            } while (true);

            match(input,17,FOLLOW_17_in_ruleViewSection7035); 

                    createLeafNode(grammarAccess.getViewSectionAccess().getRightCurlyBracketKeyword_5(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleViewSection


    // $ANTLR start entryRuleViewForAllSections
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4085:1: entryRuleViewForAllSections returns [EObject current=null] : iv_ruleViewForAllSections= ruleViewForAllSections EOF ;
    public final EObject entryRuleViewForAllSections() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleViewForAllSections = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4086:2: (iv_ruleViewForAllSections= ruleViewForAllSections EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4087:2: iv_ruleViewForAllSections= ruleViewForAllSections EOF
            {
             currentNode = createCompositeNode(grammarAccess.getViewForAllSectionsRule(), currentNode); 
            pushFollow(FOLLOW_ruleViewForAllSections_in_entryRuleViewForAllSections7071);
            iv_ruleViewForAllSections=ruleViewForAllSections();
            _fsp--;

             current =iv_ruleViewForAllSections; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleViewForAllSections7081); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleViewForAllSections


    // $ANTLR start ruleViewForAllSections
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4094:1: ruleViewForAllSections returns [EObject current=null] : ( () 'forAllSections' '{' ( 'title' '=' ( (lv_title_5_0= ruleScalarExpression ) ) )? ( 'content' '=' ( (lv_provider_8_0= ruleProviderConstruction ) ) )? ( (lv_cells_9_0= ruleSectionCell ) )* '}' ) ;
    public final EObject ruleViewForAllSections() throws RecognitionException {
        EObject current = null;

        EObject lv_title_5_0 = null;

        EObject lv_provider_8_0 = null;

        EObject lv_cells_9_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4099:6: ( ( () 'forAllSections' '{' ( 'title' '=' ( (lv_title_5_0= ruleScalarExpression ) ) )? ( 'content' '=' ( (lv_provider_8_0= ruleProviderConstruction ) ) )? ( (lv_cells_9_0= ruleSectionCell ) )* '}' ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4100:1: ( () 'forAllSections' '{' ( 'title' '=' ( (lv_title_5_0= ruleScalarExpression ) ) )? ( 'content' '=' ( (lv_provider_8_0= ruleProviderConstruction ) ) )? ( (lv_cells_9_0= ruleSectionCell ) )* '}' )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4100:1: ( () 'forAllSections' '{' ( 'title' '=' ( (lv_title_5_0= ruleScalarExpression ) ) )? ( 'content' '=' ( (lv_provider_8_0= ruleProviderConstruction ) ) )? ( (lv_cells_9_0= ruleSectionCell ) )* '}' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4100:2: () 'forAllSections' '{' ( 'title' '=' ( (lv_title_5_0= ruleScalarExpression ) ) )? ( 'content' '=' ( (lv_provider_8_0= ruleProviderConstruction ) ) )? ( (lv_cells_9_0= ruleSectionCell ) )* '}'
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4100:2: ()
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4101:5: 
            {
             
                    temp=factory.create(grammarAccess.getViewForAllSectionsAccess().getViewForAllSectionsAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getViewForAllSectionsAccess().getViewForAllSectionsAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,65,FOLLOW_65_in_ruleViewForAllSections7125); 

                    createLeafNode(grammarAccess.getViewForAllSectionsAccess().getForAllSectionsKeyword_1(), null); 
                
            match(input,13,FOLLOW_13_in_ruleViewForAllSections7135); 

                    createLeafNode(grammarAccess.getViewForAllSectionsAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4119:1: ( 'title' '=' ( (lv_title_5_0= ruleScalarExpression ) ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==34) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4119:3: 'title' '=' ( (lv_title_5_0= ruleScalarExpression ) )
                    {
                    match(input,34,FOLLOW_34_in_ruleViewForAllSections7146); 

                            createLeafNode(grammarAccess.getViewForAllSectionsAccess().getTitleKeyword_3_0(), null); 
                        
                    match(input,12,FOLLOW_12_in_ruleViewForAllSections7156); 

                            createLeafNode(grammarAccess.getViewForAllSectionsAccess().getEqualsSignKeyword_3_1(), null); 
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4127:1: ( (lv_title_5_0= ruleScalarExpression ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4128:1: (lv_title_5_0= ruleScalarExpression )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4128:1: (lv_title_5_0= ruleScalarExpression )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4129:3: lv_title_5_0= ruleScalarExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getViewForAllSectionsAccess().getTitleScalarExpressionParserRuleCall_3_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleScalarExpression_in_ruleViewForAllSections7177);
                    lv_title_5_0=ruleScalarExpression();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getViewForAllSectionsRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"title",
                    	        		lv_title_5_0, 
                    	        		"ScalarExpression", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4151:4: ( 'content' '=' ( (lv_provider_8_0= ruleProviderConstruction ) ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==66) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4151:6: 'content' '=' ( (lv_provider_8_0= ruleProviderConstruction ) )
                    {
                    match(input,66,FOLLOW_66_in_ruleViewForAllSections7190); 

                            createLeafNode(grammarAccess.getViewForAllSectionsAccess().getContentKeyword_4_0(), null); 
                        
                    match(input,12,FOLLOW_12_in_ruleViewForAllSections7200); 

                            createLeafNode(grammarAccess.getViewForAllSectionsAccess().getEqualsSignKeyword_4_1(), null); 
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4159:1: ( (lv_provider_8_0= ruleProviderConstruction ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4160:1: (lv_provider_8_0= ruleProviderConstruction )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4160:1: (lv_provider_8_0= ruleProviderConstruction )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4161:3: lv_provider_8_0= ruleProviderConstruction
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getViewForAllSectionsAccess().getProviderProviderConstructionParserRuleCall_4_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleProviderConstruction_in_ruleViewForAllSections7221);
                    lv_provider_8_0=ruleProviderConstruction();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getViewForAllSectionsRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"provider",
                    	        		lv_provider_8_0, 
                    	        		"ProviderConstruction", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4183:4: ( (lv_cells_9_0= ruleSectionCell ) )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( (LA71_0==67) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4184:1: (lv_cells_9_0= ruleSectionCell )
            	    {
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4184:1: (lv_cells_9_0= ruleSectionCell )
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4185:3: lv_cells_9_0= ruleSectionCell
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getViewForAllSectionsAccess().getCellsSectionCellParserRuleCall_5_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleSectionCell_in_ruleViewForAllSections7244);
            	    lv_cells_9_0=ruleSectionCell();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getViewForAllSectionsRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"cells",
            	    	        		lv_cells_9_0, 
            	    	        		"SectionCell", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop71;
                }
            } while (true);

            match(input,17,FOLLOW_17_in_ruleViewForAllSections7255); 

                    createLeafNode(grammarAccess.getViewForAllSectionsAccess().getRightCurlyBracketKeyword_6(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleViewForAllSections


    // $ANTLR start entryRuleSectionCell
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4219:1: entryRuleSectionCell returns [EObject current=null] : iv_ruleSectionCell= ruleSectionCell EOF ;
    public final EObject entryRuleSectionCell() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSectionCell = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4220:2: (iv_ruleSectionCell= ruleSectionCell EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4221:2: iv_ruleSectionCell= ruleSectionCell EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSectionCellRule(), currentNode); 
            pushFollow(FOLLOW_ruleSectionCell_in_entryRuleSectionCell7291);
            iv_ruleSectionCell=ruleSectionCell();
            _fsp--;

             current =iv_ruleSectionCell; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSectionCell7301); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSectionCell


    // $ANTLR start ruleSectionCell
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4228:1: ruleSectionCell returns [EObject current=null] : ( 'cell' ( (lv_type_1_0= ruleCellType ) ) ( 'foreach' ( (lv_iterator_3_0= ruleCollectionIterator ) ) )? '{' ( 'text' '=' ( (lv_text_7_0= ruleScalarExpression ) ) )? ( 'details' '=' ( (lv_details_10_0= ruleScalarExpression ) ) )? ( 'image' '=' ( (lv_image_13_0= ruleScalarExpression ) ) )? ( 'query' '=' ( (lv_query_16_0= ruleScalarExpression ) ) )? ( 'action' '=' ( (lv_action_19_0= ruleViewAction ) ) )? ( 'button' '=' ( (lv_buttonAction_22_0= ruleViewAction ) ) )? '}' ) ;
    public final EObject ruleSectionCell() throws RecognitionException {
        EObject current = null;

        Enumerator lv_type_1_0 = null;

        EObject lv_iterator_3_0 = null;

        EObject lv_text_7_0 = null;

        EObject lv_details_10_0 = null;

        EObject lv_image_13_0 = null;

        EObject lv_query_16_0 = null;

        EObject lv_action_19_0 = null;

        EObject lv_buttonAction_22_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4233:6: ( ( 'cell' ( (lv_type_1_0= ruleCellType ) ) ( 'foreach' ( (lv_iterator_3_0= ruleCollectionIterator ) ) )? '{' ( 'text' '=' ( (lv_text_7_0= ruleScalarExpression ) ) )? ( 'details' '=' ( (lv_details_10_0= ruleScalarExpression ) ) )? ( 'image' '=' ( (lv_image_13_0= ruleScalarExpression ) ) )? ( 'query' '=' ( (lv_query_16_0= ruleScalarExpression ) ) )? ( 'action' '=' ( (lv_action_19_0= ruleViewAction ) ) )? ( 'button' '=' ( (lv_buttonAction_22_0= ruleViewAction ) ) )? '}' ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4234:1: ( 'cell' ( (lv_type_1_0= ruleCellType ) ) ( 'foreach' ( (lv_iterator_3_0= ruleCollectionIterator ) ) )? '{' ( 'text' '=' ( (lv_text_7_0= ruleScalarExpression ) ) )? ( 'details' '=' ( (lv_details_10_0= ruleScalarExpression ) ) )? ( 'image' '=' ( (lv_image_13_0= ruleScalarExpression ) ) )? ( 'query' '=' ( (lv_query_16_0= ruleScalarExpression ) ) )? ( 'action' '=' ( (lv_action_19_0= ruleViewAction ) ) )? ( 'button' '=' ( (lv_buttonAction_22_0= ruleViewAction ) ) )? '}' )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4234:1: ( 'cell' ( (lv_type_1_0= ruleCellType ) ) ( 'foreach' ( (lv_iterator_3_0= ruleCollectionIterator ) ) )? '{' ( 'text' '=' ( (lv_text_7_0= ruleScalarExpression ) ) )? ( 'details' '=' ( (lv_details_10_0= ruleScalarExpression ) ) )? ( 'image' '=' ( (lv_image_13_0= ruleScalarExpression ) ) )? ( 'query' '=' ( (lv_query_16_0= ruleScalarExpression ) ) )? ( 'action' '=' ( (lv_action_19_0= ruleViewAction ) ) )? ( 'button' '=' ( (lv_buttonAction_22_0= ruleViewAction ) ) )? '}' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4234:3: 'cell' ( (lv_type_1_0= ruleCellType ) ) ( 'foreach' ( (lv_iterator_3_0= ruleCollectionIterator ) ) )? '{' ( 'text' '=' ( (lv_text_7_0= ruleScalarExpression ) ) )? ( 'details' '=' ( (lv_details_10_0= ruleScalarExpression ) ) )? ( 'image' '=' ( (lv_image_13_0= ruleScalarExpression ) ) )? ( 'query' '=' ( (lv_query_16_0= ruleScalarExpression ) ) )? ( 'action' '=' ( (lv_action_19_0= ruleViewAction ) ) )? ( 'button' '=' ( (lv_buttonAction_22_0= ruleViewAction ) ) )? '}'
            {
            match(input,67,FOLLOW_67_in_ruleSectionCell7336); 

                    createLeafNode(grammarAccess.getSectionCellAccess().getCellKeyword_0(), null); 
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4238:1: ( (lv_type_1_0= ruleCellType ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4239:1: (lv_type_1_0= ruleCellType )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4239:1: (lv_type_1_0= ruleCellType )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4240:3: lv_type_1_0= ruleCellType
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getSectionCellAccess().getTypeCellTypeEnumRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleCellType_in_ruleSectionCell7357);
            lv_type_1_0=ruleCellType();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSectionCellRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"type",
            	        		lv_type_1_0, 
            	        		"CellType", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4262:2: ( 'foreach' ( (lv_iterator_3_0= ruleCollectionIterator ) ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==68) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4262:4: 'foreach' ( (lv_iterator_3_0= ruleCollectionIterator ) )
                    {
                    match(input,68,FOLLOW_68_in_ruleSectionCell7368); 

                            createLeafNode(grammarAccess.getSectionCellAccess().getForeachKeyword_2_0(), null); 
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4266:1: ( (lv_iterator_3_0= ruleCollectionIterator ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4267:1: (lv_iterator_3_0= ruleCollectionIterator )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4267:1: (lv_iterator_3_0= ruleCollectionIterator )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4268:3: lv_iterator_3_0= ruleCollectionIterator
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getSectionCellAccess().getIteratorCollectionIteratorParserRuleCall_2_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleCollectionIterator_in_ruleSectionCell7389);
                    lv_iterator_3_0=ruleCollectionIterator();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSectionCellRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"iterator",
                    	        		lv_iterator_3_0, 
                    	        		"CollectionIterator", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            match(input,13,FOLLOW_13_in_ruleSectionCell7401); 

                    createLeafNode(grammarAccess.getSectionCellAccess().getLeftCurlyBracketKeyword_3(), null); 
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4294:1: ( 'text' '=' ( (lv_text_7_0= ruleScalarExpression ) ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==69) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4294:3: 'text' '=' ( (lv_text_7_0= ruleScalarExpression ) )
                    {
                    match(input,69,FOLLOW_69_in_ruleSectionCell7412); 

                            createLeafNode(grammarAccess.getSectionCellAccess().getTextKeyword_4_0(), null); 
                        
                    match(input,12,FOLLOW_12_in_ruleSectionCell7422); 

                            createLeafNode(grammarAccess.getSectionCellAccess().getEqualsSignKeyword_4_1(), null); 
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4302:1: ( (lv_text_7_0= ruleScalarExpression ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4303:1: (lv_text_7_0= ruleScalarExpression )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4303:1: (lv_text_7_0= ruleScalarExpression )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4304:3: lv_text_7_0= ruleScalarExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getSectionCellAccess().getTextScalarExpressionParserRuleCall_4_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleScalarExpression_in_ruleSectionCell7443);
                    lv_text_7_0=ruleScalarExpression();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSectionCellRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"text",
                    	        		lv_text_7_0, 
                    	        		"ScalarExpression", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4326:4: ( 'details' '=' ( (lv_details_10_0= ruleScalarExpression ) ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==62) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4326:6: 'details' '=' ( (lv_details_10_0= ruleScalarExpression ) )
                    {
                    match(input,62,FOLLOW_62_in_ruleSectionCell7456); 

                            createLeafNode(grammarAccess.getSectionCellAccess().getDetailsKeyword_5_0(), null); 
                        
                    match(input,12,FOLLOW_12_in_ruleSectionCell7466); 

                            createLeafNode(grammarAccess.getSectionCellAccess().getEqualsSignKeyword_5_1(), null); 
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4334:1: ( (lv_details_10_0= ruleScalarExpression ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4335:1: (lv_details_10_0= ruleScalarExpression )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4335:1: (lv_details_10_0= ruleScalarExpression )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4336:3: lv_details_10_0= ruleScalarExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getSectionCellAccess().getDetailsScalarExpressionParserRuleCall_5_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleScalarExpression_in_ruleSectionCell7487);
                    lv_details_10_0=ruleScalarExpression();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSectionCellRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"details",
                    	        		lv_details_10_0, 
                    	        		"ScalarExpression", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4358:4: ( 'image' '=' ( (lv_image_13_0= ruleScalarExpression ) ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==63) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4358:6: 'image' '=' ( (lv_image_13_0= ruleScalarExpression ) )
                    {
                    match(input,63,FOLLOW_63_in_ruleSectionCell7500); 

                            createLeafNode(grammarAccess.getSectionCellAccess().getImageKeyword_6_0(), null); 
                        
                    match(input,12,FOLLOW_12_in_ruleSectionCell7510); 

                            createLeafNode(grammarAccess.getSectionCellAccess().getEqualsSignKeyword_6_1(), null); 
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4366:1: ( (lv_image_13_0= ruleScalarExpression ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4367:1: (lv_image_13_0= ruleScalarExpression )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4367:1: (lv_image_13_0= ruleScalarExpression )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4368:3: lv_image_13_0= ruleScalarExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getSectionCellAccess().getImageScalarExpressionParserRuleCall_6_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleScalarExpression_in_ruleSectionCell7531);
                    lv_image_13_0=ruleScalarExpression();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSectionCellRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"image",
                    	        		lv_image_13_0, 
                    	        		"ScalarExpression", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4390:4: ( 'query' '=' ( (lv_query_16_0= ruleScalarExpression ) ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==70) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4390:6: 'query' '=' ( (lv_query_16_0= ruleScalarExpression ) )
                    {
                    match(input,70,FOLLOW_70_in_ruleSectionCell7544); 

                            createLeafNode(grammarAccess.getSectionCellAccess().getQueryKeyword_7_0(), null); 
                        
                    match(input,12,FOLLOW_12_in_ruleSectionCell7554); 

                            createLeafNode(grammarAccess.getSectionCellAccess().getEqualsSignKeyword_7_1(), null); 
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4398:1: ( (lv_query_16_0= ruleScalarExpression ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4399:1: (lv_query_16_0= ruleScalarExpression )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4399:1: (lv_query_16_0= ruleScalarExpression )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4400:3: lv_query_16_0= ruleScalarExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getSectionCellAccess().getQueryScalarExpressionParserRuleCall_7_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleScalarExpression_in_ruleSectionCell7575);
                    lv_query_16_0=ruleScalarExpression();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSectionCellRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"query",
                    	        		lv_query_16_0, 
                    	        		"ScalarExpression", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4422:4: ( 'action' '=' ( (lv_action_19_0= ruleViewAction ) ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==55) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4422:6: 'action' '=' ( (lv_action_19_0= ruleViewAction ) )
                    {
                    match(input,55,FOLLOW_55_in_ruleSectionCell7588); 

                            createLeafNode(grammarAccess.getSectionCellAccess().getActionKeyword_8_0(), null); 
                        
                    match(input,12,FOLLOW_12_in_ruleSectionCell7598); 

                            createLeafNode(grammarAccess.getSectionCellAccess().getEqualsSignKeyword_8_1(), null); 
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4430:1: ( (lv_action_19_0= ruleViewAction ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4431:1: (lv_action_19_0= ruleViewAction )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4431:1: (lv_action_19_0= ruleViewAction )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4432:3: lv_action_19_0= ruleViewAction
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getSectionCellAccess().getActionViewActionParserRuleCall_8_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleViewAction_in_ruleSectionCell7619);
                    lv_action_19_0=ruleViewAction();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSectionCellRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"action",
                    	        		lv_action_19_0, 
                    	        		"ViewAction", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4454:4: ( 'button' '=' ( (lv_buttonAction_22_0= ruleViewAction ) ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==33) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4454:6: 'button' '=' ( (lv_buttonAction_22_0= ruleViewAction ) )
                    {
                    match(input,33,FOLLOW_33_in_ruleSectionCell7632); 

                            createLeafNode(grammarAccess.getSectionCellAccess().getButtonKeyword_9_0(), null); 
                        
                    match(input,12,FOLLOW_12_in_ruleSectionCell7642); 

                            createLeafNode(grammarAccess.getSectionCellAccess().getEqualsSignKeyword_9_1(), null); 
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4462:1: ( (lv_buttonAction_22_0= ruleViewAction ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4463:1: (lv_buttonAction_22_0= ruleViewAction )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4463:1: (lv_buttonAction_22_0= ruleViewAction )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4464:3: lv_buttonAction_22_0= ruleViewAction
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getSectionCellAccess().getButtonActionViewActionParserRuleCall_9_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleViewAction_in_ruleSectionCell7663);
                    lv_buttonAction_22_0=ruleViewAction();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSectionCellRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"buttonAction",
                    	        		lv_buttonAction_22_0, 
                    	        		"ViewAction", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            match(input,17,FOLLOW_17_in_ruleSectionCell7675); 

                    createLeafNode(grammarAccess.getSectionCellAccess().getRightCurlyBracketKeyword_10(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleSectionCell


    // $ANTLR start entryRuleCollectionIterator
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4498:1: entryRuleCollectionIterator returns [EObject current=null] : iv_ruleCollectionIterator= ruleCollectionIterator EOF ;
    public final EObject entryRuleCollectionIterator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionIterator = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4499:2: (iv_ruleCollectionIterator= ruleCollectionIterator EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4500:2: iv_ruleCollectionIterator= ruleCollectionIterator EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCollectionIteratorRule(), currentNode); 
            pushFollow(FOLLOW_ruleCollectionIterator_in_entryRuleCollectionIterator7711);
            iv_ruleCollectionIterator=ruleCollectionIterator();
            _fsp--;

             current =iv_ruleCollectionIterator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollectionIterator7721); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleCollectionIterator


    // $ANTLR start ruleCollectionIterator
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4507:1: ruleCollectionIterator returns [EObject current=null] : ( ( (lv_collection_0_0= ruleCollectionExpression ) ) 'as' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleCollectionIterator() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        EObject lv_collection_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4512:6: ( ( ( (lv_collection_0_0= ruleCollectionExpression ) ) 'as' ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4513:1: ( ( (lv_collection_0_0= ruleCollectionExpression ) ) 'as' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4513:1: ( ( (lv_collection_0_0= ruleCollectionExpression ) ) 'as' ( (lv_name_2_0= RULE_ID ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4513:2: ( (lv_collection_0_0= ruleCollectionExpression ) ) 'as' ( (lv_name_2_0= RULE_ID ) )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4513:2: ( (lv_collection_0_0= ruleCollectionExpression ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4514:1: (lv_collection_0_0= ruleCollectionExpression )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4514:1: (lv_collection_0_0= ruleCollectionExpression )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4515:3: lv_collection_0_0= ruleCollectionExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getCollectionIteratorAccess().getCollectionCollectionExpressionParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleCollectionExpression_in_ruleCollectionIterator7767);
            lv_collection_0_0=ruleCollectionExpression();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getCollectionIteratorRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"collection",
            	        		lv_collection_0_0, 
            	        		"CollectionExpression", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,71,FOLLOW_71_in_ruleCollectionIterator7777); 

                    createLeafNode(grammarAccess.getCollectionIteratorAccess().getAsKeyword_1(), null); 
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4541:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4542:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4542:1: (lv_name_2_0= RULE_ID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4543:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCollectionIterator7794); 

            			createLeafNode(grammarAccess.getCollectionIteratorAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getCollectionIteratorRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_2_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleCollectionIterator


    // $ANTLR start entryRuleViewAction
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4573:1: entryRuleViewAction returns [EObject current=null] : iv_ruleViewAction= ruleViewAction EOF ;
    public final EObject entryRuleViewAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleViewAction = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4574:2: (iv_ruleViewAction= ruleViewAction EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4575:2: iv_ruleViewAction= ruleViewAction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getViewActionRule(), currentNode); 
            pushFollow(FOLLOW_ruleViewAction_in_entryRuleViewAction7835);
            iv_ruleViewAction=ruleViewAction();
            _fsp--;

             current =iv_ruleViewAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleViewAction7845); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleViewAction


    // $ANTLR start ruleViewAction
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4582:1: ruleViewAction returns [EObject current=null] : (this_ViewCall_0= ruleViewCall | this_ExternalOpen_1= ruleExternalOpen | this_ActionDelegate_2= ruleActionDelegate ) ;
    public final EObject ruleViewAction() throws RecognitionException {
        EObject current = null;

        EObject this_ViewCall_0 = null;

        EObject this_ExternalOpen_1 = null;

        EObject this_ActionDelegate_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4587:6: ( (this_ViewCall_0= ruleViewCall | this_ExternalOpen_1= ruleExternalOpen | this_ActionDelegate_2= ruleActionDelegate ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4588:1: (this_ViewCall_0= ruleViewCall | this_ExternalOpen_1= ruleExternalOpen | this_ActionDelegate_2= ruleActionDelegate )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4588:1: (this_ViewCall_0= ruleViewCall | this_ExternalOpen_1= ruleExternalOpen | this_ActionDelegate_2= ruleActionDelegate )
            int alt79=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA79_1 = input.LA(2);

                if ( (LA79_1==21) ) {
                    alt79=1;
                }
                else if ( (LA79_1==EOF||LA79_1==17||LA79_1==19||LA79_1==33) ) {
                    alt79=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("4588:1: (this_ViewCall_0= ruleViewCall | this_ExternalOpen_1= ruleExternalOpen | this_ActionDelegate_2= ruleActionDelegate )", 79, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
            case 21:
            case 23:
            case 24:
                {
                alt79=2;
                }
                break;
            case 72:
                {
                alt79=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("4588:1: (this_ViewCall_0= ruleViewCall | this_ExternalOpen_1= ruleExternalOpen | this_ActionDelegate_2= ruleActionDelegate )", 79, 0, input);

                throw nvae;
            }

            switch (alt79) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4589:5: this_ViewCall_0= ruleViewCall
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getViewActionAccess().getViewCallParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleViewCall_in_ruleViewAction7892);
                    this_ViewCall_0=ruleViewCall();
                    _fsp--;

                     
                            current = this_ViewCall_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4599:5: this_ExternalOpen_1= ruleExternalOpen
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getViewActionAccess().getExternalOpenParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleExternalOpen_in_ruleViewAction7919);
                    this_ExternalOpen_1=ruleExternalOpen();
                    _fsp--;

                     
                            current = this_ExternalOpen_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4609:5: this_ActionDelegate_2= ruleActionDelegate
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getViewActionAccess().getActionDelegateParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleActionDelegate_in_ruleViewAction7946);
                    this_ActionDelegate_2=ruleActionDelegate();
                    _fsp--;

                     
                            current = this_ActionDelegate_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleViewAction


    // $ANTLR start entryRuleActionDelegate
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4625:1: entryRuleActionDelegate returns [EObject current=null] : iv_ruleActionDelegate= ruleActionDelegate EOF ;
    public final EObject entryRuleActionDelegate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionDelegate = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4626:2: (iv_ruleActionDelegate= ruleActionDelegate EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4627:2: iv_ruleActionDelegate= ruleActionDelegate EOF
            {
             currentNode = createCompositeNode(grammarAccess.getActionDelegateRule(), currentNode); 
            pushFollow(FOLLOW_ruleActionDelegate_in_entryRuleActionDelegate7981);
            iv_ruleActionDelegate=ruleActionDelegate();
            _fsp--;

             current =iv_ruleActionDelegate; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActionDelegate7991); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleActionDelegate


    // $ANTLR start ruleActionDelegate
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4634:1: ruleActionDelegate returns [EObject current=null] : ( () 'delegate' ) ;
    public final EObject ruleActionDelegate() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4639:6: ( ( () 'delegate' ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4640:1: ( () 'delegate' )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4640:1: ( () 'delegate' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4640:2: () 'delegate'
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4640:2: ()
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4641:5: 
            {
             
                    temp=factory.create(grammarAccess.getActionDelegateAccess().getActionDelegateAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getActionDelegateAccess().getActionDelegateAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,72,FOLLOW_72_in_ruleActionDelegate8035); 

                    createLeafNode(grammarAccess.getActionDelegateAccess().getDelegateKeyword_1(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleActionDelegate


    // $ANTLR start entryRuleExternalOpen
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4663:1: entryRuleExternalOpen returns [EObject current=null] : iv_ruleExternalOpen= ruleExternalOpen EOF ;
    public final EObject entryRuleExternalOpen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalOpen = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4664:2: (iv_ruleExternalOpen= ruleExternalOpen EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4665:2: iv_ruleExternalOpen= ruleExternalOpen EOF
            {
             currentNode = createCompositeNode(grammarAccess.getExternalOpenRule(), currentNode); 
            pushFollow(FOLLOW_ruleExternalOpen_in_entryRuleExternalOpen8071);
            iv_ruleExternalOpen=ruleExternalOpen();
            _fsp--;

             current =iv_ruleExternalOpen; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExternalOpen8081); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleExternalOpen


    // $ANTLR start ruleExternalOpen
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4672:1: ruleExternalOpen returns [EObject current=null] : ( (lv_url_0_0= ruleScalarExpression ) ) ;
    public final EObject ruleExternalOpen() throws RecognitionException {
        EObject current = null;

        EObject lv_url_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4677:6: ( ( (lv_url_0_0= ruleScalarExpression ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4678:1: ( (lv_url_0_0= ruleScalarExpression ) )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4678:1: ( (lv_url_0_0= ruleScalarExpression ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4679:1: (lv_url_0_0= ruleScalarExpression )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4679:1: (lv_url_0_0= ruleScalarExpression )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4680:3: lv_url_0_0= ruleScalarExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getExternalOpenAccess().getUrlScalarExpressionParserRuleCall_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleScalarExpression_in_ruleExternalOpen8126);
            lv_url_0_0=ruleScalarExpression();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getExternalOpenRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"url",
            	        		lv_url_0_0, 
            	        		"ScalarExpression", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleExternalOpen


    // $ANTLR start entryRuleViewCall
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4710:1: entryRuleViewCall returns [EObject current=null] : iv_ruleViewCall= ruleViewCall EOF ;
    public final EObject entryRuleViewCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleViewCall = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4711:2: (iv_ruleViewCall= ruleViewCall EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4712:2: iv_ruleViewCall= ruleViewCall EOF
            {
             currentNode = createCompositeNode(grammarAccess.getViewCallRule(), currentNode); 
            pushFollow(FOLLOW_ruleViewCall_in_entryRuleViewCall8161);
            iv_ruleViewCall=ruleViewCall();
            _fsp--;

             current =iv_ruleViewCall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleViewCall8171); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleViewCall


    // $ANTLR start ruleViewCall
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4719:1: ruleViewCall returns [EObject current=null] : ( ( ( RULE_ID ) ) '(' ( (lv_provider_2_0= ruleProviderConstruction ) ) ( ')' )? ( (lv_action_4_0= ruleNestedObjectReference ) )? ) ;
    public final EObject ruleViewCall() throws RecognitionException {
        EObject current = null;

        EObject lv_provider_2_0 = null;

        EObject lv_action_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4724:6: ( ( ( ( RULE_ID ) ) '(' ( (lv_provider_2_0= ruleProviderConstruction ) ) ( ')' )? ( (lv_action_4_0= ruleNestedObjectReference ) )? ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4725:1: ( ( ( RULE_ID ) ) '(' ( (lv_provider_2_0= ruleProviderConstruction ) ) ( ')' )? ( (lv_action_4_0= ruleNestedObjectReference ) )? )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4725:1: ( ( ( RULE_ID ) ) '(' ( (lv_provider_2_0= ruleProviderConstruction ) ) ( ')' )? ( (lv_action_4_0= ruleNestedObjectReference ) )? )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4725:2: ( ( RULE_ID ) ) '(' ( (lv_provider_2_0= ruleProviderConstruction ) ) ( ')' )? ( (lv_action_4_0= ruleNestedObjectReference ) )?
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4725:2: ( ( RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4726:1: ( RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4726:1: ( RULE_ID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4727:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getViewCallRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleViewCall8214); 

            		createLeafNode(grammarAccess.getViewCallAccess().getViewViewCrossReference_0_0(), "view"); 
            	

            }


            }

            match(input,21,FOLLOW_21_in_ruleViewCall8224); 

                    createLeafNode(grammarAccess.getViewCallAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4743:1: ( (lv_provider_2_0= ruleProviderConstruction ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4744:1: (lv_provider_2_0= ruleProviderConstruction )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4744:1: (lv_provider_2_0= ruleProviderConstruction )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4745:3: lv_provider_2_0= ruleProviderConstruction
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getViewCallAccess().getProviderProviderConstructionParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleProviderConstruction_in_ruleViewCall8245);
            lv_provider_2_0=ruleProviderConstruction();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getViewCallRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"provider",
            	        		lv_provider_2_0, 
            	        		"ProviderConstruction", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4767:2: ( ')' )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==22) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4767:4: ')'
                    {
                    match(input,22,FOLLOW_22_in_ruleViewCall8256); 

                            createLeafNode(grammarAccess.getViewCallAccess().getRightParenthesisKeyword_3(), null); 
                        

                    }
                    break;

            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4771:3: ( (lv_action_4_0= ruleNestedObjectReference ) )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==19) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4772:1: (lv_action_4_0= ruleNestedObjectReference )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4772:1: (lv_action_4_0= ruleNestedObjectReference )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4773:3: lv_action_4_0= ruleNestedObjectReference
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getViewCallAccess().getActionNestedObjectReferenceParserRuleCall_4_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleNestedObjectReference_in_ruleViewCall8279);
                    lv_action_4_0=ruleNestedObjectReference();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getViewCallRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"action",
                    	        		lv_action_4_0, 
                    	        		"NestedObjectReference", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleViewCall


    // $ANTLR start ruleCellType
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4803:1: ruleCellType returns [Enumerator current=null] : ( ( 'Default' ) | ( 'DefaultWithDisclosure' ) | ( 'Value2' ) | ( 'Double' ) | ( 'Subtitle' ) | ( 'Map' ) ) ;
    public final Enumerator ruleCellType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4807:6: ( ( ( 'Default' ) | ( 'DefaultWithDisclosure' ) | ( 'Value2' ) | ( 'Double' ) | ( 'Subtitle' ) | ( 'Map' ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4808:1: ( ( 'Default' ) | ( 'DefaultWithDisclosure' ) | ( 'Value2' ) | ( 'Double' ) | ( 'Subtitle' ) | ( 'Map' ) )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4808:1: ( ( 'Default' ) | ( 'DefaultWithDisclosure' ) | ( 'Value2' ) | ( 'Double' ) | ( 'Subtitle' ) | ( 'Map' ) )
            int alt82=6;
            switch ( input.LA(1) ) {
            case 73:
                {
                alt82=1;
                }
                break;
            case 74:
                {
                alt82=2;
                }
                break;
            case 75:
                {
                alt82=3;
                }
                break;
            case 76:
                {
                alt82=4;
                }
                break;
            case 77:
                {
                alt82=5;
                }
                break;
            case 78:
                {
                alt82=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("4808:1: ( ( 'Default' ) | ( 'DefaultWithDisclosure' ) | ( 'Value2' ) | ( 'Double' ) | ( 'Subtitle' ) | ( 'Map' ) )", 82, 0, input);

                throw nvae;
            }

            switch (alt82) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4808:2: ( 'Default' )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4808:2: ( 'Default' )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4808:4: 'Default'
                    {
                    match(input,73,FOLLOW_73_in_ruleCellType8328); 

                            current = grammarAccess.getCellTypeAccess().getDefaultEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getCellTypeAccess().getDefaultEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4814:6: ( 'DefaultWithDisclosure' )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4814:6: ( 'DefaultWithDisclosure' )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4814:8: 'DefaultWithDisclosure'
                    {
                    match(input,74,FOLLOW_74_in_ruleCellType8343); 

                            current = grammarAccess.getCellTypeAccess().getDefaultWithDisclosureEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getCellTypeAccess().getDefaultWithDisclosureEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4820:6: ( 'Value2' )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4820:6: ( 'Value2' )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4820:8: 'Value2'
                    {
                    match(input,75,FOLLOW_75_in_ruleCellType8358); 

                            current = grammarAccess.getCellTypeAccess().getValue2EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getCellTypeAccess().getValue2EnumLiteralDeclaration_2(), null); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4826:6: ( 'Double' )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4826:6: ( 'Double' )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4826:8: 'Double'
                    {
                    match(input,76,FOLLOW_76_in_ruleCellType8373); 

                            current = grammarAccess.getCellTypeAccess().getDoubleEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getCellTypeAccess().getDoubleEnumLiteralDeclaration_3(), null); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4832:6: ( 'Subtitle' )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4832:6: ( 'Subtitle' )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4832:8: 'Subtitle'
                    {
                    match(input,77,FOLLOW_77_in_ruleCellType8388); 

                            current = grammarAccess.getCellTypeAccess().getSubtitleEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getCellTypeAccess().getSubtitleEnumLiteralDeclaration_4(), null); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4838:6: ( 'Map' )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4838:6: ( 'Map' )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4838:8: 'Map'
                    {
                    match(input,78,FOLLOW_78_in_ruleCellType8403); 

                            current = grammarAccess.getCellTypeAccess().getMapsEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getCellTypeAccess().getMapsEnumLiteralDeclaration_5(), null); 
                        

                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleCellType


    // $ANTLR start rulePosition
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4848:1: rulePosition returns [Enumerator current=null] : ( ( 'left' ) | ( 'center' ) | ( 'right' ) ) ;
    public final Enumerator rulePosition() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4852:6: ( ( ( 'left' ) | ( 'center' ) | ( 'right' ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4853:1: ( ( 'left' ) | ( 'center' ) | ( 'right' ) )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4853:1: ( ( 'left' ) | ( 'center' ) | ( 'right' ) )
            int alt83=3;
            switch ( input.LA(1) ) {
            case 79:
                {
                alt83=1;
                }
                break;
            case 80:
                {
                alt83=2;
                }
                break;
            case 81:
                {
                alt83=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("4853:1: ( ( 'left' ) | ( 'center' ) | ( 'right' ) )", 83, 0, input);

                throw nvae;
            }

            switch (alt83) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4853:2: ( 'left' )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4853:2: ( 'left' )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4853:4: 'left'
                    {
                    match(input,79,FOLLOW_79_in_rulePosition8446); 

                            current = grammarAccess.getPositionAccess().getDefaultEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getPositionAccess().getDefaultEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4859:6: ( 'center' )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4859:6: ( 'center' )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4859:8: 'center'
                    {
                    match(input,80,FOLLOW_80_in_rulePosition8461); 

                            current = grammarAccess.getPositionAccess().getCenterEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getPositionAccess().getCenterEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4865:6: ( 'right' )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4865:6: ( 'right' )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4865:8: 'right'
                    {
                    match(input,81,FOLLOW_81_in_rulePosition8476); 

                            current = grammarAccess.getPositionAccess().getRightEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getPositionAccess().getRightEnumLiteralDeclaration_2(), null); 
                        

                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulePosition


 

    public static final BitSet FOLLOW_ruleApplauseModel_in_entryRuleApplauseModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplauseModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplication_in_ruleApplauseModel131 = new BitSet(new long[]{0x0720252000000802L});
    public static final BitSet FOLLOW_ruleModelElement_in_ruleApplauseModel152 = new BitSet(new long[]{0x0720252000000802L});
    public static final BitSet FOLLOW_ruleModelElement_in_entryRuleModelElement189 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelElement199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleModelElement246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContentProvider_in_ruleModelElement273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleView_in_ruleModelElement300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstant_in_ruleModelElement327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNavigationBarItem_in_ruleModelElement354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNavigationBarItem_in_entryRuleNavigationBarItem389 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNavigationBarItem399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleNavigationBarItem434 = new BitSet(new long[]{0x0000000000000000L,0x0000000000038000L});
    public static final BitSet FOLLOW_rulePosition_in_ruleNavigationBarItem455 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleNavigationBarItem465 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleNavigationBarItem475 = new BitSet(new long[]{0x000000000002C000L});
    public static final BitSet FOLLOW_14_in_ruleNavigationBarItem528 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleNavigationBarItem538 = new BitSet(new long[]{0x0000000001A00030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleNavigationBarItem559 = new BitSet(new long[]{0x000000000002C000L});
    public static final BitSet FOLLOW_15_in_ruleNavigationBarItem621 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleNavigationBarItem631 = new BitSet(new long[]{0x0000000001A00030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleNavigationBarItem652 = new BitSet(new long[]{0x000000000003C000L});
    public static final BitSet FOLLOW_16_in_ruleNavigationBarItem663 = new BitSet(new long[]{0x0000000001A00030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleNavigationBarItem684 = new BitSet(new long[]{0x000000000003C000L});
    public static final BitSet FOLLOW_17_in_ruleNavigationBarItem736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDescription_in_entryRuleTypeDescription774 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeDescription784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypeDescription827 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleTypeDescription845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter895 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDescription_in_ruleParameter951 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameter968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectReference_in_entryRuleObjectReference1009 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectReference1019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleObjectReference1062 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleNestedObjectReference_in_ruleObjectReference1083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNestedObjectReference_in_entryRuleNestedObjectReference1120 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNestedObjectReference1130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleNestedObjectReference1165 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNestedObjectReference1183 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleNestedObjectReference_in_ruleNestedObjectReference1204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression1241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression1251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleExpression1298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringFunction_in_ruleExpression1325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionLiteral_in_ruleExpression1352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionFunction_in_ruleExpression1379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectReference_in_ruleExpression1406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_entryRuleScalarExpression1441 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScalarExpression1451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleScalarExpression1498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringFunction_in_ruleScalarExpression1525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectReference_in_ruleScalarExpression1552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionExpression_in_entryRuleCollectionExpression1587 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollectionExpression1597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionLiteral_in_ruleCollectionExpression1644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionFunction_in_ruleCollectionExpression1671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectReference_in_ruleCollectionExpression1698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral1733 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral1743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral1784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredefinedParameter_in_entryRulePredefinedParameter1824 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredefinedParameter1834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSectionId_in_rulePredefinedParameter1880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSectionId_in_entryRuleSectionId1914 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSectionId1924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleSectionId1968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringFunction_in_entryRuleStringFunction2004 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringFunction2014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleStringFunction2059 = new BitSet(new long[]{0x0000000001A00030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleStringFunction2080 = new BitSet(new long[]{0x0000000001E00030L});
    public static final BitSet FOLLOW_22_in_ruleStringFunction2091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleStringFunction2118 = new BitSet(new long[]{0x0000000001A00030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleStringFunction2139 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleStringFunction2149 = new BitSet(new long[]{0x0000000001A00030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleStringFunction2170 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleStringFunction2180 = new BitSet(new long[]{0x0000000001A00030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleStringFunction2201 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleStringFunction2211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleStringFunction2238 = new BitSet(new long[]{0x0000000001A00030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleStringFunction2259 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleStringFunction2269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionLiteral_in_entryRuleCollectionLiteral2306 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollectionLiteral2316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleCollectionLiteral2351 = new BitSet(new long[]{0x0000000001A00030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleCollectionLiteral2372 = new BitSet(new long[]{0x0000000004010000L});
    public static final BitSet FOLLOW_16_in_ruleCollectionLiteral2383 = new BitSet(new long[]{0x0000000001A00030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleCollectionLiteral2404 = new BitSet(new long[]{0x0000000004010000L});
    public static final BitSet FOLLOW_26_in_ruleCollectionLiteral2416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionFunction_in_entryRuleCollectionFunction2452 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollectionFunction2462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleCollectionFunction2506 = new BitSet(new long[]{0x0000000001A00030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleCollectionFunction2527 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleCollectionFunction2537 = new BitSet(new long[]{0x0000000001A00030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleCollectionFunction2558 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleCollectionFunction2568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplication_in_entryRuleApplication2604 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplication2614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleApplication2658 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_29_in_ruleApplication2687 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleApplication2705 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleApplication2720 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleApplication2730 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleApplication2740 = new BitSet(new long[]{0x0000000001A00030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleApplication2761 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleApplication2771 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleApplication2781 = new BitSet(new long[]{0x0000000001A00030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleApplication2802 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleApplication2812 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleApplication2822 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleViewCall_in_ruleApplication2843 = new BitSet(new long[]{0x0000001A00024000L});
    public static final BitSet FOLLOW_ruleButton_in_ruleApplication2864 = new BitSet(new long[]{0x0000001A00024000L});
    public static final BitSet FOLLOW_17_in_ruleApplication2875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButton_in_entryRuleButton2911 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleButton2921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleButton2998 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleButton3008 = new BitSet(new long[]{0x0000001E00004002L});
    public static final BitSet FOLLOW_34_in_ruleButton3019 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleButton3029 = new BitSet(new long[]{0x0000000001A00030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleButton3050 = new BitSet(new long[]{0x0000001A00004002L});
    public static final BitSet FOLLOW_14_in_ruleButton3114 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleButton3124 = new BitSet(new long[]{0x0000000001A00030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleButton3145 = new BitSet(new long[]{0x0000001A00004002L});
    public static final BitSet FOLLOW_35_in_ruleButton3209 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleButton3219 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleViewCall_in_ruleButton3240 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_36_in_ruleButton3258 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleButton3268 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleButton3285 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleButton3302 = new BitSet(new long[]{0x0000001A00004002L});
    public static final BitSet FOLLOW_ruleConstant_in_entryRuleConstant3383 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstant3393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleConstant3437 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstant3454 = new BitSet(new long[]{0x000000C001A00030L});
    public static final BitSet FOLLOW_38_in_ruleConstant3479 = new BitSet(new long[]{0x0000000001A00030L});
    public static final BitSet FOLLOW_39_in_ruleConstant3508 = new BitSet(new long[]{0x0000000001A00030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleConstant3546 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleConstant3557 = new BitSet(new long[]{0x000000C001A00030L});
    public static final BitSet FOLLOW_38_in_ruleConstant3577 = new BitSet(new long[]{0x0000000001A00030L});
    public static final BitSet FOLLOW_39_in_ruleConstant3606 = new BitSet(new long[]{0x0000000001A00030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleConstant3644 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType3682 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType3692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleType_in_ruleType3739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_ruleType3766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleType_in_entryRuleSimpleType3801 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleType3811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleSimpleType3846 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSimpleType3863 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleSimpleType3878 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSimpleType3895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity3936 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity3946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleEntity3981 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity3998 = new BitSet(new long[]{0x0000080000002000L});
    public static final BitSet FOLLOW_43_in_ruleEntity4014 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity4032 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleEntity4044 = new BitSet(new long[]{0x0000100000020010L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleEntity4065 = new BitSet(new long[]{0x0000100000020010L});
    public static final BitSet FOLLOW_17_in_ruleEntity4076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty4112 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty4122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleProperty4165 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTypeDescription_in_ruleProperty4200 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProperty4217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContentProvider_in_entryRuleContentProvider4258 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContentProvider4268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleContentProvider4303 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContentProvider4320 = new BitSet(new long[]{0x0001C00000200000L});
    public static final BitSet FOLLOW_21_in_ruleContentProvider4336 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleContentProvider4357 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleContentProvider4367 = new BitSet(new long[]{0x0001C00000000000L});
    public static final BitSet FOLLOW_46_in_ruleContentProvider4381 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_47_in_ruleContentProvider4405 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContentProvider4437 = new BitSet(new long[]{0x0001000000040000L});
    public static final BitSet FOLLOW_18_in_ruleContentProvider4455 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleContentProvider4481 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_49_in_ruleContentProvider4500 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_50_in_ruleContentProvider4537 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleContentProvider4561 = new BitSet(new long[]{0x0000000001A00030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleContentProvider4582 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_ruleContentProvider4593 = new BitSet(new long[]{0x0000000001A00030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleContentProvider4614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProviderConstruction_in_entryRuleProviderConstruction4652 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProviderConstruction4662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProviderConstruction4705 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleProviderConstruction4715 = new BitSet(new long[]{0x000000000BF00030L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleProviderConstruction4737 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rulePredefinedParameter_in_ruleProviderConstruction4764 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleProviderConstruction4776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleView_in_entryRuleView4812 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleView4822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSectionedView_in_ruleView4869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomView_in_ruleView4896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWebView_in_ruleView4923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSectionedView_in_entryRuleSectionedView4958 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSectionedView4968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableView_in_ruleSectionedView5015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDetailsView_in_ruleSectionedView5042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableView_in_entryRuleTableView5077 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTableView5087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleTableView5122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTableView5139 = new BitSet(new long[]{0x0040000000202000L});
    public static final BitSet FOLLOW_21_in_ruleTableView5155 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleTableView5176 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleTableView5186 = new BitSet(new long[]{0x0040000000002000L});
    public static final BitSet FOLLOW_54_in_ruleTableView5199 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTableView5217 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleTableView5229 = new BitSet(new long[]{0x0080001E00024000L,0x0000000000000003L});
    public static final BitSet FOLLOW_34_in_ruleTableView5240 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleTableView5250 = new BitSet(new long[]{0x0000000001A00030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleTableView5271 = new BitSet(new long[]{0x0080001A00024000L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleButton_in_ruleTableView5294 = new BitSet(new long[]{0x0080001A00024000L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleViewForAllSections_in_ruleTableView5316 = new BitSet(new long[]{0x0080000000020000L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleViewSection_in_ruleTableView5338 = new BitSet(new long[]{0x0080000000020000L,0x0000000000000001L});
    public static final BitSet FOLLOW_55_in_ruleTableView5350 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleTableView5360 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAction_in_ruleTableView5381 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleTableView5392 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAction_in_ruleTableView5413 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_17_in_ruleTableView5427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDetailsView_in_entryRuleDetailsView5463 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDetailsView5473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleDetailsView5508 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDetailsView5525 = new BitSet(new long[]{0x0040000000202000L});
    public static final BitSet FOLLOW_21_in_ruleDetailsView5541 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleDetailsView5562 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleDetailsView5572 = new BitSet(new long[]{0x0040000000002000L});
    public static final BitSet FOLLOW_54_in_ruleDetailsView5585 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDetailsView5603 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDetailsView5615 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleDetailsView5625 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleDetailsView5635 = new BitSet(new long[]{0x0000000001A00030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleDetailsView5656 = new BitSet(new long[]{0x1080001A00024000L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleButton_in_ruleDetailsView5677 = new BitSet(new long[]{0x1080001A00024000L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleViewHeader_in_ruleDetailsView5699 = new BitSet(new long[]{0x0080000000020000L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleViewForAllSections_in_ruleDetailsView5721 = new BitSet(new long[]{0x0080000000020000L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleViewSection_in_ruleDetailsView5743 = new BitSet(new long[]{0x0080000000020000L,0x0000000000000001L});
    public static final BitSet FOLLOW_55_in_ruleDetailsView5755 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleDetailsView5765 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAction_in_ruleDetailsView5786 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleDetailsView5797 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAction_in_ruleDetailsView5818 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_17_in_ruleDetailsView5832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWebView_in_entryRuleWebView5868 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWebView5878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleWebView5913 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWebView5930 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleWebView5945 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleWebView5955 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleWebView5965 = new BitSet(new long[]{0x0000000001A00030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleWebView5986 = new BitSet(new long[]{0x1080001A00024000L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleButton_in_ruleWebView6007 = new BitSet(new long[]{0x1080001A00024000L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleViewHeader_in_ruleWebView6029 = new BitSet(new long[]{0x0080000000020000L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleViewForAllSections_in_ruleWebView6051 = new BitSet(new long[]{0x0080000000020000L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleViewSection_in_ruleWebView6073 = new BitSet(new long[]{0x0080000000020000L,0x0000000000000001L});
    public static final BitSet FOLLOW_55_in_ruleWebView6085 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleWebView6095 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAction_in_ruleWebView6116 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleWebView6127 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAction_in_ruleWebView6148 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_17_in_ruleWebView6162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomView_in_entryRuleCustomView6198 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCustomView6208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleCustomView6243 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCustomView6260 = new BitSet(new long[]{0x0800000000200000L});
    public static final BitSet FOLLOW_21_in_ruleCustomView6276 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleCustomView6297 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleCustomView6307 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_ruleCustomView6319 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCustomView6336 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleCustomView6351 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleCustomView6361 = new BitSet(new long[]{0x0000000001A00030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleCustomView6382 = new BitSet(new long[]{0x0080001A00004002L});
    public static final BitSet FOLLOW_ruleButton_in_ruleCustomView6403 = new BitSet(new long[]{0x0080001A00004002L});
    public static final BitSet FOLLOW_55_in_ruleCustomView6415 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleCustomView6425 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAction_in_ruleCustomView6446 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleCustomView6457 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAction_in_ruleCustomView6478 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleAction_in_entryRuleAction6518 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAction6528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAction6569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleViewHeader_in_entryRuleViewHeader6609 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleViewHeader6619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleViewHeader6663 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleViewHeader6673 = new BitSet(new long[]{0xE000000400020000L});
    public static final BitSet FOLLOW_34_in_ruleViewHeader6684 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleViewHeader6694 = new BitSet(new long[]{0x0000000001A00030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleViewHeader6715 = new BitSet(new long[]{0xE000000000020000L});
    public static final BitSet FOLLOW_61_in_ruleViewHeader6728 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleViewHeader6738 = new BitSet(new long[]{0x0000000001A00030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleViewHeader6759 = new BitSet(new long[]{0xC000000000020000L});
    public static final BitSet FOLLOW_62_in_ruleViewHeader6772 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleViewHeader6782 = new BitSet(new long[]{0x0000000001A00030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleViewHeader6803 = new BitSet(new long[]{0x8000000000020000L});
    public static final BitSet FOLLOW_63_in_ruleViewHeader6816 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleViewHeader6826 = new BitSet(new long[]{0x0000000001A00030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleViewHeader6847 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleViewHeader6859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleViewSection_in_entryRuleViewSection6895 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleViewSection6905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleViewSection6949 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleViewSection6959 = new BitSet(new long[]{0x0000000400020000L,0x0000000000000008L});
    public static final BitSet FOLLOW_34_in_ruleViewSection6970 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleViewSection6980 = new BitSet(new long[]{0x0000000001A00030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleViewSection7001 = new BitSet(new long[]{0x0000000000020000L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleSectionCell_in_ruleViewSection7024 = new BitSet(new long[]{0x0000000000020000L,0x0000000000000008L});
    public static final BitSet FOLLOW_17_in_ruleViewSection7035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleViewForAllSections_in_entryRuleViewForAllSections7071 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleViewForAllSections7081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleViewForAllSections7125 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleViewForAllSections7135 = new BitSet(new long[]{0x0000000400020000L,0x000000000000000CL});
    public static final BitSet FOLLOW_34_in_ruleViewForAllSections7146 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleViewForAllSections7156 = new BitSet(new long[]{0x0000000001A00030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleViewForAllSections7177 = new BitSet(new long[]{0x0000000000020000L,0x000000000000000CL});
    public static final BitSet FOLLOW_66_in_ruleViewForAllSections7190 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleViewForAllSections7200 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleProviderConstruction_in_ruleViewForAllSections7221 = new BitSet(new long[]{0x0000000000020000L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleSectionCell_in_ruleViewForAllSections7244 = new BitSet(new long[]{0x0000000000020000L,0x0000000000000008L});
    public static final BitSet FOLLOW_17_in_ruleViewForAllSections7255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSectionCell_in_entryRuleSectionCell7291 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSectionCell7301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleSectionCell7336 = new BitSet(new long[]{0x0000000000000000L,0x0000000000007E00L});
    public static final BitSet FOLLOW_ruleCellType_in_ruleSectionCell7357 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleSectionCell7368 = new BitSet(new long[]{0x000000000A000010L});
    public static final BitSet FOLLOW_ruleCollectionIterator_in_ruleSectionCell7389 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleSectionCell7401 = new BitSet(new long[]{0xC080000200020000L,0x0000000000000060L});
    public static final BitSet FOLLOW_69_in_ruleSectionCell7412 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSectionCell7422 = new BitSet(new long[]{0x0000000001A00030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleSectionCell7443 = new BitSet(new long[]{0xC080000200020000L,0x0000000000000040L});
    public static final BitSet FOLLOW_62_in_ruleSectionCell7456 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSectionCell7466 = new BitSet(new long[]{0x0000000001A00030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleSectionCell7487 = new BitSet(new long[]{0x8080000200020000L,0x0000000000000040L});
    public static final BitSet FOLLOW_63_in_ruleSectionCell7500 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSectionCell7510 = new BitSet(new long[]{0x0000000001A00030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleSectionCell7531 = new BitSet(new long[]{0x0080000200020000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_ruleSectionCell7544 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSectionCell7554 = new BitSet(new long[]{0x0000000001A00030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleSectionCell7575 = new BitSet(new long[]{0x0080000200020000L});
    public static final BitSet FOLLOW_55_in_ruleSectionCell7588 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSectionCell7598 = new BitSet(new long[]{0x0000000001A00030L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleViewAction_in_ruleSectionCell7619 = new BitSet(new long[]{0x0000000200020000L});
    public static final BitSet FOLLOW_33_in_ruleSectionCell7632 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSectionCell7642 = new BitSet(new long[]{0x0000000001A00030L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleViewAction_in_ruleSectionCell7663 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSectionCell7675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionIterator_in_entryRuleCollectionIterator7711 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollectionIterator7721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionExpression_in_ruleCollectionIterator7767 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_ruleCollectionIterator7777 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCollectionIterator7794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleViewAction_in_entryRuleViewAction7835 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleViewAction7845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleViewCall_in_ruleViewAction7892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalOpen_in_ruleViewAction7919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionDelegate_in_ruleViewAction7946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionDelegate_in_entryRuleActionDelegate7981 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActionDelegate7991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleActionDelegate8035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalOpen_in_entryRuleExternalOpen8071 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExternalOpen8081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleExternalOpen8126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleViewCall_in_entryRuleViewCall8161 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleViewCall8171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleViewCall8214 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleViewCall8224 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleProviderConstruction_in_ruleViewCall8245 = new BitSet(new long[]{0x0000000000480002L});
    public static final BitSet FOLLOW_22_in_ruleViewCall8256 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleNestedObjectReference_in_ruleViewCall8279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleCellType8328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleCellType8343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleCellType8358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleCellType8373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleCellType8388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleCellType8403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_rulePosition8446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_rulePosition8461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_rulePosition8476 = new BitSet(new long[]{0x0000000000000002L});

}
