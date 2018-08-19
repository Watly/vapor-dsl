/**
 * This work is licensed under the 
 * Creative Commons Attribution-ShareAlike 4.0 International License. 
 * To view a copy of this license, visit 
 * http://creativecommons.org/licenses/by-sa/4.0/ 
 * or send a letter to 
 * Creative Commons, 
 * PO Box 1866, Mountain View, 
 * CA 94042, USA.
 */
package co.watly.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import co.watly.services.VaporGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalVaporParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'scheduled'", "'vapor'", "'flight'", "'{'", "'date:'", "','", "'model:'", "'cost:'", "'drops'", "'commands:'", "'['", "']'", "'}'", "'up'", "'at'", "'cm/sec'", "'for'", "'milliseconds'", "'down'", "'left'", "'right'", "'forward'", "'back'", "'rotate'", "'degrees'", "'/'", "':'", "'.'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalVaporParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalVaporParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalVaporParser.tokenNames; }
    public String getGrammarFileName() { return "InternalVapor.g"; }



     	private VaporGrammarAccess grammarAccess;

        public InternalVaporParser(TokenStream input, VaporGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "ScheduledFlight";
       	}

       	@Override
       	protected VaporGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleScheduledFlight"
    // InternalVapor.g:64:1: entryRuleScheduledFlight returns [EObject current=null] : iv_ruleScheduledFlight= ruleScheduledFlight EOF ;
    public final EObject entryRuleScheduledFlight() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScheduledFlight = null;


        try {
            // InternalVapor.g:64:56: (iv_ruleScheduledFlight= ruleScheduledFlight EOF )
            // InternalVapor.g:65:2: iv_ruleScheduledFlight= ruleScheduledFlight EOF
            {
             newCompositeNode(grammarAccess.getScheduledFlightRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScheduledFlight=ruleScheduledFlight();

            state._fsp--;

             current =iv_ruleScheduledFlight; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleScheduledFlight"


    // $ANTLR start "ruleScheduledFlight"
    // InternalVapor.g:71:1: ruleScheduledFlight returns [EObject current=null] : (otherlv_0= 'scheduled' otherlv_1= 'vapor' otherlv_2= 'flight' otherlv_3= '{' otherlv_4= 'date:' ( (lv_date_5_0= ruleDATE ) ) otherlv_6= ',' otherlv_7= 'model:' ( (lv_model_8_0= RULE_STRING ) ) otherlv_9= ',' otherlv_10= 'cost:' ( (lv_cost_11_0= ruleLONG ) ) otherlv_12= 'drops' otherlv_13= ',' otherlv_14= 'commands:' otherlv_15= '[' ( (lv_commands_16_0= ruleCommand ) ) (otherlv_17= ',' ( (lv_commands_18_0= ruleCommand ) ) )* otherlv_19= ']' otherlv_20= '}' ) ;
    public final EObject ruleScheduledFlight() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_model_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        AntlrDatatypeRuleToken lv_date_5_0 = null;

        AntlrDatatypeRuleToken lv_cost_11_0 = null;

        EObject lv_commands_16_0 = null;

        EObject lv_commands_18_0 = null;



        	enterRule();

        try {
            // InternalVapor.g:77:2: ( (otherlv_0= 'scheduled' otherlv_1= 'vapor' otherlv_2= 'flight' otherlv_3= '{' otherlv_4= 'date:' ( (lv_date_5_0= ruleDATE ) ) otherlv_6= ',' otherlv_7= 'model:' ( (lv_model_8_0= RULE_STRING ) ) otherlv_9= ',' otherlv_10= 'cost:' ( (lv_cost_11_0= ruleLONG ) ) otherlv_12= 'drops' otherlv_13= ',' otherlv_14= 'commands:' otherlv_15= '[' ( (lv_commands_16_0= ruleCommand ) ) (otherlv_17= ',' ( (lv_commands_18_0= ruleCommand ) ) )* otherlv_19= ']' otherlv_20= '}' ) )
            // InternalVapor.g:78:2: (otherlv_0= 'scheduled' otherlv_1= 'vapor' otherlv_2= 'flight' otherlv_3= '{' otherlv_4= 'date:' ( (lv_date_5_0= ruleDATE ) ) otherlv_6= ',' otherlv_7= 'model:' ( (lv_model_8_0= RULE_STRING ) ) otherlv_9= ',' otherlv_10= 'cost:' ( (lv_cost_11_0= ruleLONG ) ) otherlv_12= 'drops' otherlv_13= ',' otherlv_14= 'commands:' otherlv_15= '[' ( (lv_commands_16_0= ruleCommand ) ) (otherlv_17= ',' ( (lv_commands_18_0= ruleCommand ) ) )* otherlv_19= ']' otherlv_20= '}' )
            {
            // InternalVapor.g:78:2: (otherlv_0= 'scheduled' otherlv_1= 'vapor' otherlv_2= 'flight' otherlv_3= '{' otherlv_4= 'date:' ( (lv_date_5_0= ruleDATE ) ) otherlv_6= ',' otherlv_7= 'model:' ( (lv_model_8_0= RULE_STRING ) ) otherlv_9= ',' otherlv_10= 'cost:' ( (lv_cost_11_0= ruleLONG ) ) otherlv_12= 'drops' otherlv_13= ',' otherlv_14= 'commands:' otherlv_15= '[' ( (lv_commands_16_0= ruleCommand ) ) (otherlv_17= ',' ( (lv_commands_18_0= ruleCommand ) ) )* otherlv_19= ']' otherlv_20= '}' )
            // InternalVapor.g:79:3: otherlv_0= 'scheduled' otherlv_1= 'vapor' otherlv_2= 'flight' otherlv_3= '{' otherlv_4= 'date:' ( (lv_date_5_0= ruleDATE ) ) otherlv_6= ',' otherlv_7= 'model:' ( (lv_model_8_0= RULE_STRING ) ) otherlv_9= ',' otherlv_10= 'cost:' ( (lv_cost_11_0= ruleLONG ) ) otherlv_12= 'drops' otherlv_13= ',' otherlv_14= 'commands:' otherlv_15= '[' ( (lv_commands_16_0= ruleCommand ) ) (otherlv_17= ',' ( (lv_commands_18_0= ruleCommand ) ) )* otherlv_19= ']' otherlv_20= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getScheduledFlightAccess().getScheduledKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getScheduledFlightAccess().getVaporKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getScheduledFlightAccess().getFlightKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getScheduledFlightAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getScheduledFlightAccess().getDateKeyword_4());
            		
            // InternalVapor.g:99:3: ( (lv_date_5_0= ruleDATE ) )
            // InternalVapor.g:100:4: (lv_date_5_0= ruleDATE )
            {
            // InternalVapor.g:100:4: (lv_date_5_0= ruleDATE )
            // InternalVapor.g:101:5: lv_date_5_0= ruleDATE
            {

            					newCompositeNode(grammarAccess.getScheduledFlightAccess().getDateDATEParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_8);
            lv_date_5_0=ruleDATE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getScheduledFlightRule());
            					}
            					set(
            						current,
            						"date",
            						lv_date_5_0,
            						"co.watly.Vapor.DATE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_6, grammarAccess.getScheduledFlightAccess().getCommaKeyword_6());
            		
            otherlv_7=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_7, grammarAccess.getScheduledFlightAccess().getModelKeyword_7());
            		
            // InternalVapor.g:126:3: ( (lv_model_8_0= RULE_STRING ) )
            // InternalVapor.g:127:4: (lv_model_8_0= RULE_STRING )
            {
            // InternalVapor.g:127:4: (lv_model_8_0= RULE_STRING )
            // InternalVapor.g:128:5: lv_model_8_0= RULE_STRING
            {
            lv_model_8_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_model_8_0, grammarAccess.getScheduledFlightAccess().getModelSTRINGTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getScheduledFlightRule());
            					}
            					setWithLastConsumed(
            						current,
            						"model",
            						lv_model_8_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_9=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_9, grammarAccess.getScheduledFlightAccess().getCommaKeyword_9());
            		
            otherlv_10=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_10, grammarAccess.getScheduledFlightAccess().getCostKeyword_10());
            		
            // InternalVapor.g:152:3: ( (lv_cost_11_0= ruleLONG ) )
            // InternalVapor.g:153:4: (lv_cost_11_0= ruleLONG )
            {
            // InternalVapor.g:153:4: (lv_cost_11_0= ruleLONG )
            // InternalVapor.g:154:5: lv_cost_11_0= ruleLONG
            {

            					newCompositeNode(grammarAccess.getScheduledFlightAccess().getCostLONGParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_12);
            lv_cost_11_0=ruleLONG();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getScheduledFlightRule());
            					}
            					set(
            						current,
            						"cost",
            						lv_cost_11_0,
            						"co.watly.Vapor.LONG");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_12=(Token)match(input,19,FOLLOW_8); 

            			newLeafNode(otherlv_12, grammarAccess.getScheduledFlightAccess().getDropsKeyword_12());
            		
            otherlv_13=(Token)match(input,16,FOLLOW_13); 

            			newLeafNode(otherlv_13, grammarAccess.getScheduledFlightAccess().getCommaKeyword_13());
            		
            otherlv_14=(Token)match(input,20,FOLLOW_14); 

            			newLeafNode(otherlv_14, grammarAccess.getScheduledFlightAccess().getCommandsKeyword_14());
            		
            otherlv_15=(Token)match(input,21,FOLLOW_15); 

            			newLeafNode(otherlv_15, grammarAccess.getScheduledFlightAccess().getLeftSquareBracketKeyword_15());
            		
            // InternalVapor.g:187:3: ( (lv_commands_16_0= ruleCommand ) )
            // InternalVapor.g:188:4: (lv_commands_16_0= ruleCommand )
            {
            // InternalVapor.g:188:4: (lv_commands_16_0= ruleCommand )
            // InternalVapor.g:189:5: lv_commands_16_0= ruleCommand
            {

            					newCompositeNode(grammarAccess.getScheduledFlightAccess().getCommandsCommandParserRuleCall_16_0());
            				
            pushFollow(FOLLOW_16);
            lv_commands_16_0=ruleCommand();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getScheduledFlightRule());
            					}
            					add(
            						current,
            						"commands",
            						lv_commands_16_0,
            						"co.watly.Vapor.Command");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalVapor.g:206:3: (otherlv_17= ',' ( (lv_commands_18_0= ruleCommand ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalVapor.g:207:4: otherlv_17= ',' ( (lv_commands_18_0= ruleCommand ) )
            	    {
            	    otherlv_17=(Token)match(input,16,FOLLOW_15); 

            	    				newLeafNode(otherlv_17, grammarAccess.getScheduledFlightAccess().getCommaKeyword_17_0());
            	    			
            	    // InternalVapor.g:211:4: ( (lv_commands_18_0= ruleCommand ) )
            	    // InternalVapor.g:212:5: (lv_commands_18_0= ruleCommand )
            	    {
            	    // InternalVapor.g:212:5: (lv_commands_18_0= ruleCommand )
            	    // InternalVapor.g:213:6: lv_commands_18_0= ruleCommand
            	    {

            	    						newCompositeNode(grammarAccess.getScheduledFlightAccess().getCommandsCommandParserRuleCall_17_1_0());
            	    					
            	    pushFollow(FOLLOW_16);
            	    lv_commands_18_0=ruleCommand();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getScheduledFlightRule());
            	    						}
            	    						add(
            	    							current,
            	    							"commands",
            	    							lv_commands_18_0,
            	    							"co.watly.Vapor.Command");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_19=(Token)match(input,22,FOLLOW_17); 

            			newLeafNode(otherlv_19, grammarAccess.getScheduledFlightAccess().getRightSquareBracketKeyword_18());
            		
            otherlv_20=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_20, grammarAccess.getScheduledFlightAccess().getRightCurlyBracketKeyword_19());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScheduledFlight"


    // $ANTLR start "entryRuleCommand"
    // InternalVapor.g:243:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // InternalVapor.g:243:48: (iv_ruleCommand= ruleCommand EOF )
            // InternalVapor.g:244:2: iv_ruleCommand= ruleCommand EOF
            {
             newCompositeNode(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommand=ruleCommand();

            state._fsp--;

             current =iv_ruleCommand; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // InternalVapor.g:250:1: ruleCommand returns [EObject current=null] : (this_CommandCommon_0= ruleCommandCommon | this_CommandRotate_1= ruleCommandRotate ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        EObject this_CommandCommon_0 = null;

        EObject this_CommandRotate_1 = null;



        	enterRule();

        try {
            // InternalVapor.g:256:2: ( (this_CommandCommon_0= ruleCommandCommon | this_CommandRotate_1= ruleCommandRotate ) )
            // InternalVapor.g:257:2: (this_CommandCommon_0= ruleCommandCommon | this_CommandRotate_1= ruleCommandRotate )
            {
            // InternalVapor.g:257:2: (this_CommandCommon_0= ruleCommandCommon | this_CommandRotate_1= ruleCommandRotate )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==24||(LA2_0>=29 && LA2_0<=33)) ) {
                alt2=1;
            }
            else if ( (LA2_0==34) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalVapor.g:258:3: this_CommandCommon_0= ruleCommandCommon
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getCommandCommonParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_CommandCommon_0=ruleCommandCommon();

                    state._fsp--;


                    			current = this_CommandCommon_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalVapor.g:267:3: this_CommandRotate_1= ruleCommandRotate
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getCommandRotateParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_CommandRotate_1=ruleCommandRotate();

                    state._fsp--;


                    			current = this_CommandRotate_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleCommandCommon"
    // InternalVapor.g:279:1: entryRuleCommandCommon returns [EObject current=null] : iv_ruleCommandCommon= ruleCommandCommon EOF ;
    public final EObject entryRuleCommandCommon() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommandCommon = null;


        try {
            // InternalVapor.g:279:54: (iv_ruleCommandCommon= ruleCommandCommon EOF )
            // InternalVapor.g:280:2: iv_ruleCommandCommon= ruleCommandCommon EOF
            {
             newCompositeNode(grammarAccess.getCommandCommonRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommandCommon=ruleCommandCommon();

            state._fsp--;

             current =iv_ruleCommandCommon; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCommandCommon"


    // $ANTLR start "ruleCommandCommon"
    // InternalVapor.g:286:1: ruleCommandCommon returns [EObject current=null] : (this_CommandUp_0= ruleCommandUp | this_CommandDown_1= ruleCommandDown | this_CommandLeft_2= ruleCommandLeft | this_CommandRight_3= ruleCommandRight | this_CommandForward_4= ruleCommandForward | this_CommandBack_5= ruleCommandBack ) ;
    public final EObject ruleCommandCommon() throws RecognitionException {
        EObject current = null;

        EObject this_CommandUp_0 = null;

        EObject this_CommandDown_1 = null;

        EObject this_CommandLeft_2 = null;

        EObject this_CommandRight_3 = null;

        EObject this_CommandForward_4 = null;

        EObject this_CommandBack_5 = null;



        	enterRule();

        try {
            // InternalVapor.g:292:2: ( (this_CommandUp_0= ruleCommandUp | this_CommandDown_1= ruleCommandDown | this_CommandLeft_2= ruleCommandLeft | this_CommandRight_3= ruleCommandRight | this_CommandForward_4= ruleCommandForward | this_CommandBack_5= ruleCommandBack ) )
            // InternalVapor.g:293:2: (this_CommandUp_0= ruleCommandUp | this_CommandDown_1= ruleCommandDown | this_CommandLeft_2= ruleCommandLeft | this_CommandRight_3= ruleCommandRight | this_CommandForward_4= ruleCommandForward | this_CommandBack_5= ruleCommandBack )
            {
            // InternalVapor.g:293:2: (this_CommandUp_0= ruleCommandUp | this_CommandDown_1= ruleCommandDown | this_CommandLeft_2= ruleCommandLeft | this_CommandRight_3= ruleCommandRight | this_CommandForward_4= ruleCommandForward | this_CommandBack_5= ruleCommandBack )
            int alt3=6;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt3=1;
                }
                break;
            case 29:
                {
                alt3=2;
                }
                break;
            case 30:
                {
                alt3=3;
                }
                break;
            case 31:
                {
                alt3=4;
                }
                break;
            case 32:
                {
                alt3=5;
                }
                break;
            case 33:
                {
                alt3=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalVapor.g:294:3: this_CommandUp_0= ruleCommandUp
                    {

                    			newCompositeNode(grammarAccess.getCommandCommonAccess().getCommandUpParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_CommandUp_0=ruleCommandUp();

                    state._fsp--;


                    			current = this_CommandUp_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalVapor.g:303:3: this_CommandDown_1= ruleCommandDown
                    {

                    			newCompositeNode(grammarAccess.getCommandCommonAccess().getCommandDownParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_CommandDown_1=ruleCommandDown();

                    state._fsp--;


                    			current = this_CommandDown_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalVapor.g:312:3: this_CommandLeft_2= ruleCommandLeft
                    {

                    			newCompositeNode(grammarAccess.getCommandCommonAccess().getCommandLeftParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_CommandLeft_2=ruleCommandLeft();

                    state._fsp--;


                    			current = this_CommandLeft_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalVapor.g:321:3: this_CommandRight_3= ruleCommandRight
                    {

                    			newCompositeNode(grammarAccess.getCommandCommonAccess().getCommandRightParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_CommandRight_3=ruleCommandRight();

                    state._fsp--;


                    			current = this_CommandRight_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalVapor.g:330:3: this_CommandForward_4= ruleCommandForward
                    {

                    			newCompositeNode(grammarAccess.getCommandCommonAccess().getCommandForwardParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_CommandForward_4=ruleCommandForward();

                    state._fsp--;


                    			current = this_CommandForward_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalVapor.g:339:3: this_CommandBack_5= ruleCommandBack
                    {

                    			newCompositeNode(grammarAccess.getCommandCommonAccess().getCommandBackParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_CommandBack_5=ruleCommandBack();

                    state._fsp--;


                    			current = this_CommandBack_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommandCommon"


    // $ANTLR start "entryRuleCommandUp"
    // InternalVapor.g:351:1: entryRuleCommandUp returns [EObject current=null] : iv_ruleCommandUp= ruleCommandUp EOF ;
    public final EObject entryRuleCommandUp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommandUp = null;


        try {
            // InternalVapor.g:351:50: (iv_ruleCommandUp= ruleCommandUp EOF )
            // InternalVapor.g:352:2: iv_ruleCommandUp= ruleCommandUp EOF
            {
             newCompositeNode(grammarAccess.getCommandUpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommandUp=ruleCommandUp();

            state._fsp--;

             current =iv_ruleCommandUp; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCommandUp"


    // $ANTLR start "ruleCommandUp"
    // InternalVapor.g:358:1: ruleCommandUp returns [EObject current=null] : (otherlv_0= 'up' otherlv_1= 'at' ( (lv_speed_2_0= RULE_INT ) ) otherlv_3= 'cm/sec' otherlv_4= 'for' ( (lv_millisecs_5_0= RULE_INT ) ) otherlv_6= 'milliseconds' ) ;
    public final EObject ruleCommandUp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_speed_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_millisecs_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalVapor.g:364:2: ( (otherlv_0= 'up' otherlv_1= 'at' ( (lv_speed_2_0= RULE_INT ) ) otherlv_3= 'cm/sec' otherlv_4= 'for' ( (lv_millisecs_5_0= RULE_INT ) ) otherlv_6= 'milliseconds' ) )
            // InternalVapor.g:365:2: (otherlv_0= 'up' otherlv_1= 'at' ( (lv_speed_2_0= RULE_INT ) ) otherlv_3= 'cm/sec' otherlv_4= 'for' ( (lv_millisecs_5_0= RULE_INT ) ) otherlv_6= 'milliseconds' )
            {
            // InternalVapor.g:365:2: (otherlv_0= 'up' otherlv_1= 'at' ( (lv_speed_2_0= RULE_INT ) ) otherlv_3= 'cm/sec' otherlv_4= 'for' ( (lv_millisecs_5_0= RULE_INT ) ) otherlv_6= 'milliseconds' )
            // InternalVapor.g:366:3: otherlv_0= 'up' otherlv_1= 'at' ( (lv_speed_2_0= RULE_INT ) ) otherlv_3= 'cm/sec' otherlv_4= 'for' ( (lv_millisecs_5_0= RULE_INT ) ) otherlv_6= 'milliseconds'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getCommandUpAccess().getUpKeyword_0());
            		
            otherlv_1=(Token)match(input,25,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getCommandUpAccess().getAtKeyword_1());
            		
            // InternalVapor.g:374:3: ( (lv_speed_2_0= RULE_INT ) )
            // InternalVapor.g:375:4: (lv_speed_2_0= RULE_INT )
            {
            // InternalVapor.g:375:4: (lv_speed_2_0= RULE_INT )
            // InternalVapor.g:376:5: lv_speed_2_0= RULE_INT
            {
            lv_speed_2_0=(Token)match(input,RULE_INT,FOLLOW_19); 

            					newLeafNode(lv_speed_2_0, grammarAccess.getCommandUpAccess().getSpeedINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCommandUpRule());
            					}
            					setWithLastConsumed(
            						current,
            						"speed",
            						lv_speed_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,26,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getCommandUpAccess().getCmSecKeyword_3());
            		
            otherlv_4=(Token)match(input,27,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getCommandUpAccess().getForKeyword_4());
            		
            // InternalVapor.g:400:3: ( (lv_millisecs_5_0= RULE_INT ) )
            // InternalVapor.g:401:4: (lv_millisecs_5_0= RULE_INT )
            {
            // InternalVapor.g:401:4: (lv_millisecs_5_0= RULE_INT )
            // InternalVapor.g:402:5: lv_millisecs_5_0= RULE_INT
            {
            lv_millisecs_5_0=(Token)match(input,RULE_INT,FOLLOW_21); 

            					newLeafNode(lv_millisecs_5_0, grammarAccess.getCommandUpAccess().getMillisecsINTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCommandUpRule());
            					}
            					setWithLastConsumed(
            						current,
            						"millisecs",
            						lv_millisecs_5_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_6=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getCommandUpAccess().getMillisecondsKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommandUp"


    // $ANTLR start "entryRuleCommandDown"
    // InternalVapor.g:426:1: entryRuleCommandDown returns [EObject current=null] : iv_ruleCommandDown= ruleCommandDown EOF ;
    public final EObject entryRuleCommandDown() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommandDown = null;


        try {
            // InternalVapor.g:426:52: (iv_ruleCommandDown= ruleCommandDown EOF )
            // InternalVapor.g:427:2: iv_ruleCommandDown= ruleCommandDown EOF
            {
             newCompositeNode(grammarAccess.getCommandDownRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommandDown=ruleCommandDown();

            state._fsp--;

             current =iv_ruleCommandDown; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCommandDown"


    // $ANTLR start "ruleCommandDown"
    // InternalVapor.g:433:1: ruleCommandDown returns [EObject current=null] : (otherlv_0= 'down' otherlv_1= 'at' ( (lv_speed_2_0= RULE_INT ) ) otherlv_3= 'cm/sec' otherlv_4= 'for' ( (lv_millisecs_5_0= RULE_INT ) ) otherlv_6= 'milliseconds' ) ;
    public final EObject ruleCommandDown() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_speed_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_millisecs_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalVapor.g:439:2: ( (otherlv_0= 'down' otherlv_1= 'at' ( (lv_speed_2_0= RULE_INT ) ) otherlv_3= 'cm/sec' otherlv_4= 'for' ( (lv_millisecs_5_0= RULE_INT ) ) otherlv_6= 'milliseconds' ) )
            // InternalVapor.g:440:2: (otherlv_0= 'down' otherlv_1= 'at' ( (lv_speed_2_0= RULE_INT ) ) otherlv_3= 'cm/sec' otherlv_4= 'for' ( (lv_millisecs_5_0= RULE_INT ) ) otherlv_6= 'milliseconds' )
            {
            // InternalVapor.g:440:2: (otherlv_0= 'down' otherlv_1= 'at' ( (lv_speed_2_0= RULE_INT ) ) otherlv_3= 'cm/sec' otherlv_4= 'for' ( (lv_millisecs_5_0= RULE_INT ) ) otherlv_6= 'milliseconds' )
            // InternalVapor.g:441:3: otherlv_0= 'down' otherlv_1= 'at' ( (lv_speed_2_0= RULE_INT ) ) otherlv_3= 'cm/sec' otherlv_4= 'for' ( (lv_millisecs_5_0= RULE_INT ) ) otherlv_6= 'milliseconds'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getCommandDownAccess().getDownKeyword_0());
            		
            otherlv_1=(Token)match(input,25,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getCommandDownAccess().getAtKeyword_1());
            		
            // InternalVapor.g:449:3: ( (lv_speed_2_0= RULE_INT ) )
            // InternalVapor.g:450:4: (lv_speed_2_0= RULE_INT )
            {
            // InternalVapor.g:450:4: (lv_speed_2_0= RULE_INT )
            // InternalVapor.g:451:5: lv_speed_2_0= RULE_INT
            {
            lv_speed_2_0=(Token)match(input,RULE_INT,FOLLOW_19); 

            					newLeafNode(lv_speed_2_0, grammarAccess.getCommandDownAccess().getSpeedINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCommandDownRule());
            					}
            					setWithLastConsumed(
            						current,
            						"speed",
            						lv_speed_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,26,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getCommandDownAccess().getCmSecKeyword_3());
            		
            otherlv_4=(Token)match(input,27,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getCommandDownAccess().getForKeyword_4());
            		
            // InternalVapor.g:475:3: ( (lv_millisecs_5_0= RULE_INT ) )
            // InternalVapor.g:476:4: (lv_millisecs_5_0= RULE_INT )
            {
            // InternalVapor.g:476:4: (lv_millisecs_5_0= RULE_INT )
            // InternalVapor.g:477:5: lv_millisecs_5_0= RULE_INT
            {
            lv_millisecs_5_0=(Token)match(input,RULE_INT,FOLLOW_21); 

            					newLeafNode(lv_millisecs_5_0, grammarAccess.getCommandDownAccess().getMillisecsINTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCommandDownRule());
            					}
            					setWithLastConsumed(
            						current,
            						"millisecs",
            						lv_millisecs_5_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_6=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getCommandDownAccess().getMillisecondsKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommandDown"


    // $ANTLR start "entryRuleCommandLeft"
    // InternalVapor.g:501:1: entryRuleCommandLeft returns [EObject current=null] : iv_ruleCommandLeft= ruleCommandLeft EOF ;
    public final EObject entryRuleCommandLeft() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommandLeft = null;


        try {
            // InternalVapor.g:501:52: (iv_ruleCommandLeft= ruleCommandLeft EOF )
            // InternalVapor.g:502:2: iv_ruleCommandLeft= ruleCommandLeft EOF
            {
             newCompositeNode(grammarAccess.getCommandLeftRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommandLeft=ruleCommandLeft();

            state._fsp--;

             current =iv_ruleCommandLeft; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCommandLeft"


    // $ANTLR start "ruleCommandLeft"
    // InternalVapor.g:508:1: ruleCommandLeft returns [EObject current=null] : (otherlv_0= 'left' otherlv_1= 'at' ( (lv_speed_2_0= RULE_INT ) ) otherlv_3= 'cm/sec' otherlv_4= 'for' ( (lv_millisecs_5_0= RULE_INT ) ) otherlv_6= 'milliseconds' ) ;
    public final EObject ruleCommandLeft() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_speed_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_millisecs_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalVapor.g:514:2: ( (otherlv_0= 'left' otherlv_1= 'at' ( (lv_speed_2_0= RULE_INT ) ) otherlv_3= 'cm/sec' otherlv_4= 'for' ( (lv_millisecs_5_0= RULE_INT ) ) otherlv_6= 'milliseconds' ) )
            // InternalVapor.g:515:2: (otherlv_0= 'left' otherlv_1= 'at' ( (lv_speed_2_0= RULE_INT ) ) otherlv_3= 'cm/sec' otherlv_4= 'for' ( (lv_millisecs_5_0= RULE_INT ) ) otherlv_6= 'milliseconds' )
            {
            // InternalVapor.g:515:2: (otherlv_0= 'left' otherlv_1= 'at' ( (lv_speed_2_0= RULE_INT ) ) otherlv_3= 'cm/sec' otherlv_4= 'for' ( (lv_millisecs_5_0= RULE_INT ) ) otherlv_6= 'milliseconds' )
            // InternalVapor.g:516:3: otherlv_0= 'left' otherlv_1= 'at' ( (lv_speed_2_0= RULE_INT ) ) otherlv_3= 'cm/sec' otherlv_4= 'for' ( (lv_millisecs_5_0= RULE_INT ) ) otherlv_6= 'milliseconds'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getCommandLeftAccess().getLeftKeyword_0());
            		
            otherlv_1=(Token)match(input,25,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getCommandLeftAccess().getAtKeyword_1());
            		
            // InternalVapor.g:524:3: ( (lv_speed_2_0= RULE_INT ) )
            // InternalVapor.g:525:4: (lv_speed_2_0= RULE_INT )
            {
            // InternalVapor.g:525:4: (lv_speed_2_0= RULE_INT )
            // InternalVapor.g:526:5: lv_speed_2_0= RULE_INT
            {
            lv_speed_2_0=(Token)match(input,RULE_INT,FOLLOW_19); 

            					newLeafNode(lv_speed_2_0, grammarAccess.getCommandLeftAccess().getSpeedINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCommandLeftRule());
            					}
            					setWithLastConsumed(
            						current,
            						"speed",
            						lv_speed_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,26,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getCommandLeftAccess().getCmSecKeyword_3());
            		
            otherlv_4=(Token)match(input,27,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getCommandLeftAccess().getForKeyword_4());
            		
            // InternalVapor.g:550:3: ( (lv_millisecs_5_0= RULE_INT ) )
            // InternalVapor.g:551:4: (lv_millisecs_5_0= RULE_INT )
            {
            // InternalVapor.g:551:4: (lv_millisecs_5_0= RULE_INT )
            // InternalVapor.g:552:5: lv_millisecs_5_0= RULE_INT
            {
            lv_millisecs_5_0=(Token)match(input,RULE_INT,FOLLOW_21); 

            					newLeafNode(lv_millisecs_5_0, grammarAccess.getCommandLeftAccess().getMillisecsINTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCommandLeftRule());
            					}
            					setWithLastConsumed(
            						current,
            						"millisecs",
            						lv_millisecs_5_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_6=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getCommandLeftAccess().getMillisecondsKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommandLeft"


    // $ANTLR start "entryRuleCommandRight"
    // InternalVapor.g:576:1: entryRuleCommandRight returns [EObject current=null] : iv_ruleCommandRight= ruleCommandRight EOF ;
    public final EObject entryRuleCommandRight() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommandRight = null;


        try {
            // InternalVapor.g:576:53: (iv_ruleCommandRight= ruleCommandRight EOF )
            // InternalVapor.g:577:2: iv_ruleCommandRight= ruleCommandRight EOF
            {
             newCompositeNode(grammarAccess.getCommandRightRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommandRight=ruleCommandRight();

            state._fsp--;

             current =iv_ruleCommandRight; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCommandRight"


    // $ANTLR start "ruleCommandRight"
    // InternalVapor.g:583:1: ruleCommandRight returns [EObject current=null] : (otherlv_0= 'right' otherlv_1= 'at' ( (lv_speed_2_0= RULE_INT ) ) otherlv_3= 'cm/sec' otherlv_4= 'for' ( (lv_millisecs_5_0= RULE_INT ) ) otherlv_6= 'milliseconds' ) ;
    public final EObject ruleCommandRight() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_speed_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_millisecs_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalVapor.g:589:2: ( (otherlv_0= 'right' otherlv_1= 'at' ( (lv_speed_2_0= RULE_INT ) ) otherlv_3= 'cm/sec' otherlv_4= 'for' ( (lv_millisecs_5_0= RULE_INT ) ) otherlv_6= 'milliseconds' ) )
            // InternalVapor.g:590:2: (otherlv_0= 'right' otherlv_1= 'at' ( (lv_speed_2_0= RULE_INT ) ) otherlv_3= 'cm/sec' otherlv_4= 'for' ( (lv_millisecs_5_0= RULE_INT ) ) otherlv_6= 'milliseconds' )
            {
            // InternalVapor.g:590:2: (otherlv_0= 'right' otherlv_1= 'at' ( (lv_speed_2_0= RULE_INT ) ) otherlv_3= 'cm/sec' otherlv_4= 'for' ( (lv_millisecs_5_0= RULE_INT ) ) otherlv_6= 'milliseconds' )
            // InternalVapor.g:591:3: otherlv_0= 'right' otherlv_1= 'at' ( (lv_speed_2_0= RULE_INT ) ) otherlv_3= 'cm/sec' otherlv_4= 'for' ( (lv_millisecs_5_0= RULE_INT ) ) otherlv_6= 'milliseconds'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getCommandRightAccess().getRightKeyword_0());
            		
            otherlv_1=(Token)match(input,25,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getCommandRightAccess().getAtKeyword_1());
            		
            // InternalVapor.g:599:3: ( (lv_speed_2_0= RULE_INT ) )
            // InternalVapor.g:600:4: (lv_speed_2_0= RULE_INT )
            {
            // InternalVapor.g:600:4: (lv_speed_2_0= RULE_INT )
            // InternalVapor.g:601:5: lv_speed_2_0= RULE_INT
            {
            lv_speed_2_0=(Token)match(input,RULE_INT,FOLLOW_19); 

            					newLeafNode(lv_speed_2_0, grammarAccess.getCommandRightAccess().getSpeedINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCommandRightRule());
            					}
            					setWithLastConsumed(
            						current,
            						"speed",
            						lv_speed_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,26,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getCommandRightAccess().getCmSecKeyword_3());
            		
            otherlv_4=(Token)match(input,27,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getCommandRightAccess().getForKeyword_4());
            		
            // InternalVapor.g:625:3: ( (lv_millisecs_5_0= RULE_INT ) )
            // InternalVapor.g:626:4: (lv_millisecs_5_0= RULE_INT )
            {
            // InternalVapor.g:626:4: (lv_millisecs_5_0= RULE_INT )
            // InternalVapor.g:627:5: lv_millisecs_5_0= RULE_INT
            {
            lv_millisecs_5_0=(Token)match(input,RULE_INT,FOLLOW_21); 

            					newLeafNode(lv_millisecs_5_0, grammarAccess.getCommandRightAccess().getMillisecsINTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCommandRightRule());
            					}
            					setWithLastConsumed(
            						current,
            						"millisecs",
            						lv_millisecs_5_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_6=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getCommandRightAccess().getMillisecondsKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommandRight"


    // $ANTLR start "entryRuleCommandForward"
    // InternalVapor.g:651:1: entryRuleCommandForward returns [EObject current=null] : iv_ruleCommandForward= ruleCommandForward EOF ;
    public final EObject entryRuleCommandForward() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommandForward = null;


        try {
            // InternalVapor.g:651:55: (iv_ruleCommandForward= ruleCommandForward EOF )
            // InternalVapor.g:652:2: iv_ruleCommandForward= ruleCommandForward EOF
            {
             newCompositeNode(grammarAccess.getCommandForwardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommandForward=ruleCommandForward();

            state._fsp--;

             current =iv_ruleCommandForward; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCommandForward"


    // $ANTLR start "ruleCommandForward"
    // InternalVapor.g:658:1: ruleCommandForward returns [EObject current=null] : (otherlv_0= 'forward' otherlv_1= 'at' ( (lv_speed_2_0= RULE_INT ) ) otherlv_3= 'cm/sec' otherlv_4= 'for' ( (lv_millisecs_5_0= RULE_INT ) ) otherlv_6= 'milliseconds' ) ;
    public final EObject ruleCommandForward() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_speed_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_millisecs_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalVapor.g:664:2: ( (otherlv_0= 'forward' otherlv_1= 'at' ( (lv_speed_2_0= RULE_INT ) ) otherlv_3= 'cm/sec' otherlv_4= 'for' ( (lv_millisecs_5_0= RULE_INT ) ) otherlv_6= 'milliseconds' ) )
            // InternalVapor.g:665:2: (otherlv_0= 'forward' otherlv_1= 'at' ( (lv_speed_2_0= RULE_INT ) ) otherlv_3= 'cm/sec' otherlv_4= 'for' ( (lv_millisecs_5_0= RULE_INT ) ) otherlv_6= 'milliseconds' )
            {
            // InternalVapor.g:665:2: (otherlv_0= 'forward' otherlv_1= 'at' ( (lv_speed_2_0= RULE_INT ) ) otherlv_3= 'cm/sec' otherlv_4= 'for' ( (lv_millisecs_5_0= RULE_INT ) ) otherlv_6= 'milliseconds' )
            // InternalVapor.g:666:3: otherlv_0= 'forward' otherlv_1= 'at' ( (lv_speed_2_0= RULE_INT ) ) otherlv_3= 'cm/sec' otherlv_4= 'for' ( (lv_millisecs_5_0= RULE_INT ) ) otherlv_6= 'milliseconds'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getCommandForwardAccess().getForwardKeyword_0());
            		
            otherlv_1=(Token)match(input,25,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getCommandForwardAccess().getAtKeyword_1());
            		
            // InternalVapor.g:674:3: ( (lv_speed_2_0= RULE_INT ) )
            // InternalVapor.g:675:4: (lv_speed_2_0= RULE_INT )
            {
            // InternalVapor.g:675:4: (lv_speed_2_0= RULE_INT )
            // InternalVapor.g:676:5: lv_speed_2_0= RULE_INT
            {
            lv_speed_2_0=(Token)match(input,RULE_INT,FOLLOW_19); 

            					newLeafNode(lv_speed_2_0, grammarAccess.getCommandForwardAccess().getSpeedINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCommandForwardRule());
            					}
            					setWithLastConsumed(
            						current,
            						"speed",
            						lv_speed_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,26,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getCommandForwardAccess().getCmSecKeyword_3());
            		
            otherlv_4=(Token)match(input,27,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getCommandForwardAccess().getForKeyword_4());
            		
            // InternalVapor.g:700:3: ( (lv_millisecs_5_0= RULE_INT ) )
            // InternalVapor.g:701:4: (lv_millisecs_5_0= RULE_INT )
            {
            // InternalVapor.g:701:4: (lv_millisecs_5_0= RULE_INT )
            // InternalVapor.g:702:5: lv_millisecs_5_0= RULE_INT
            {
            lv_millisecs_5_0=(Token)match(input,RULE_INT,FOLLOW_21); 

            					newLeafNode(lv_millisecs_5_0, grammarAccess.getCommandForwardAccess().getMillisecsINTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCommandForwardRule());
            					}
            					setWithLastConsumed(
            						current,
            						"millisecs",
            						lv_millisecs_5_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_6=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getCommandForwardAccess().getMillisecondsKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommandForward"


    // $ANTLR start "entryRuleCommandBack"
    // InternalVapor.g:726:1: entryRuleCommandBack returns [EObject current=null] : iv_ruleCommandBack= ruleCommandBack EOF ;
    public final EObject entryRuleCommandBack() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommandBack = null;


        try {
            // InternalVapor.g:726:52: (iv_ruleCommandBack= ruleCommandBack EOF )
            // InternalVapor.g:727:2: iv_ruleCommandBack= ruleCommandBack EOF
            {
             newCompositeNode(grammarAccess.getCommandBackRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommandBack=ruleCommandBack();

            state._fsp--;

             current =iv_ruleCommandBack; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCommandBack"


    // $ANTLR start "ruleCommandBack"
    // InternalVapor.g:733:1: ruleCommandBack returns [EObject current=null] : (otherlv_0= 'back' otherlv_1= 'at' ( (lv_speed_2_0= RULE_INT ) ) otherlv_3= 'cm/sec' otherlv_4= 'for' ( (lv_millisecs_5_0= RULE_INT ) ) otherlv_6= 'milliseconds' ) ;
    public final EObject ruleCommandBack() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_speed_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_millisecs_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalVapor.g:739:2: ( (otherlv_0= 'back' otherlv_1= 'at' ( (lv_speed_2_0= RULE_INT ) ) otherlv_3= 'cm/sec' otherlv_4= 'for' ( (lv_millisecs_5_0= RULE_INT ) ) otherlv_6= 'milliseconds' ) )
            // InternalVapor.g:740:2: (otherlv_0= 'back' otherlv_1= 'at' ( (lv_speed_2_0= RULE_INT ) ) otherlv_3= 'cm/sec' otherlv_4= 'for' ( (lv_millisecs_5_0= RULE_INT ) ) otherlv_6= 'milliseconds' )
            {
            // InternalVapor.g:740:2: (otherlv_0= 'back' otherlv_1= 'at' ( (lv_speed_2_0= RULE_INT ) ) otherlv_3= 'cm/sec' otherlv_4= 'for' ( (lv_millisecs_5_0= RULE_INT ) ) otherlv_6= 'milliseconds' )
            // InternalVapor.g:741:3: otherlv_0= 'back' otherlv_1= 'at' ( (lv_speed_2_0= RULE_INT ) ) otherlv_3= 'cm/sec' otherlv_4= 'for' ( (lv_millisecs_5_0= RULE_INT ) ) otherlv_6= 'milliseconds'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getCommandBackAccess().getBackKeyword_0());
            		
            otherlv_1=(Token)match(input,25,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getCommandBackAccess().getAtKeyword_1());
            		
            // InternalVapor.g:749:3: ( (lv_speed_2_0= RULE_INT ) )
            // InternalVapor.g:750:4: (lv_speed_2_0= RULE_INT )
            {
            // InternalVapor.g:750:4: (lv_speed_2_0= RULE_INT )
            // InternalVapor.g:751:5: lv_speed_2_0= RULE_INT
            {
            lv_speed_2_0=(Token)match(input,RULE_INT,FOLLOW_19); 

            					newLeafNode(lv_speed_2_0, grammarAccess.getCommandBackAccess().getSpeedINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCommandBackRule());
            					}
            					setWithLastConsumed(
            						current,
            						"speed",
            						lv_speed_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,26,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getCommandBackAccess().getCmSecKeyword_3());
            		
            otherlv_4=(Token)match(input,27,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getCommandBackAccess().getForKeyword_4());
            		
            // InternalVapor.g:775:3: ( (lv_millisecs_5_0= RULE_INT ) )
            // InternalVapor.g:776:4: (lv_millisecs_5_0= RULE_INT )
            {
            // InternalVapor.g:776:4: (lv_millisecs_5_0= RULE_INT )
            // InternalVapor.g:777:5: lv_millisecs_5_0= RULE_INT
            {
            lv_millisecs_5_0=(Token)match(input,RULE_INT,FOLLOW_21); 

            					newLeafNode(lv_millisecs_5_0, grammarAccess.getCommandBackAccess().getMillisecsINTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCommandBackRule());
            					}
            					setWithLastConsumed(
            						current,
            						"millisecs",
            						lv_millisecs_5_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_6=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getCommandBackAccess().getMillisecondsKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommandBack"


    // $ANTLR start "entryRuleCommandRotate"
    // InternalVapor.g:801:1: entryRuleCommandRotate returns [EObject current=null] : iv_ruleCommandRotate= ruleCommandRotate EOF ;
    public final EObject entryRuleCommandRotate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommandRotate = null;


        try {
            // InternalVapor.g:801:54: (iv_ruleCommandRotate= ruleCommandRotate EOF )
            // InternalVapor.g:802:2: iv_ruleCommandRotate= ruleCommandRotate EOF
            {
             newCompositeNode(grammarAccess.getCommandRotateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommandRotate=ruleCommandRotate();

            state._fsp--;

             current =iv_ruleCommandRotate; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCommandRotate"


    // $ANTLR start "ruleCommandRotate"
    // InternalVapor.g:808:1: ruleCommandRotate returns [EObject current=null] : (otherlv_0= 'rotate' otherlv_1= 'at' ( (lv_speed_2_0= RULE_INT ) ) otherlv_3= 'cm/sec' ( (lv_degrees_4_0= ruleDOUBLE ) ) otherlv_5= 'degrees' ) ;
    public final EObject ruleCommandRotate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_speed_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_degrees_4_0 = null;



        	enterRule();

        try {
            // InternalVapor.g:814:2: ( (otherlv_0= 'rotate' otherlv_1= 'at' ( (lv_speed_2_0= RULE_INT ) ) otherlv_3= 'cm/sec' ( (lv_degrees_4_0= ruleDOUBLE ) ) otherlv_5= 'degrees' ) )
            // InternalVapor.g:815:2: (otherlv_0= 'rotate' otherlv_1= 'at' ( (lv_speed_2_0= RULE_INT ) ) otherlv_3= 'cm/sec' ( (lv_degrees_4_0= ruleDOUBLE ) ) otherlv_5= 'degrees' )
            {
            // InternalVapor.g:815:2: (otherlv_0= 'rotate' otherlv_1= 'at' ( (lv_speed_2_0= RULE_INT ) ) otherlv_3= 'cm/sec' ( (lv_degrees_4_0= ruleDOUBLE ) ) otherlv_5= 'degrees' )
            // InternalVapor.g:816:3: otherlv_0= 'rotate' otherlv_1= 'at' ( (lv_speed_2_0= RULE_INT ) ) otherlv_3= 'cm/sec' ( (lv_degrees_4_0= ruleDOUBLE ) ) otherlv_5= 'degrees'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getCommandRotateAccess().getRotateKeyword_0());
            		
            otherlv_1=(Token)match(input,25,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getCommandRotateAccess().getAtKeyword_1());
            		
            // InternalVapor.g:824:3: ( (lv_speed_2_0= RULE_INT ) )
            // InternalVapor.g:825:4: (lv_speed_2_0= RULE_INT )
            {
            // InternalVapor.g:825:4: (lv_speed_2_0= RULE_INT )
            // InternalVapor.g:826:5: lv_speed_2_0= RULE_INT
            {
            lv_speed_2_0=(Token)match(input,RULE_INT,FOLLOW_19); 

            					newLeafNode(lv_speed_2_0, grammarAccess.getCommandRotateAccess().getSpeedINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCommandRotateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"speed",
            						lv_speed_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,26,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getCommandRotateAccess().getCmSecKeyword_3());
            		
            // InternalVapor.g:846:3: ( (lv_degrees_4_0= ruleDOUBLE ) )
            // InternalVapor.g:847:4: (lv_degrees_4_0= ruleDOUBLE )
            {
            // InternalVapor.g:847:4: (lv_degrees_4_0= ruleDOUBLE )
            // InternalVapor.g:848:5: lv_degrees_4_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getCommandRotateAccess().getDegreesDOUBLEParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_22);
            lv_degrees_4_0=ruleDOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCommandRotateRule());
            					}
            					set(
            						current,
            						"degrees",
            						lv_degrees_4_0,
            						"co.watly.Vapor.DOUBLE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,35,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getCommandRotateAccess().getDegreesKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommandRotate"


    // $ANTLR start "entryRuleDATE"
    // InternalVapor.g:873:1: entryRuleDATE returns [String current=null] : iv_ruleDATE= ruleDATE EOF ;
    public final String entryRuleDATE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDATE = null;


        try {
            // InternalVapor.g:873:44: (iv_ruleDATE= ruleDATE EOF )
            // InternalVapor.g:874:2: iv_ruleDATE= ruleDATE EOF
            {
             newCompositeNode(grammarAccess.getDATERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDATE=ruleDATE();

            state._fsp--;

             current =iv_ruleDATE.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDATE"


    // $ANTLR start "ruleDATE"
    // InternalVapor.g:880:1: ruleDATE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '/' this_INT_2= RULE_INT kw= '/' this_INT_4= RULE_INT this_INT_5= RULE_INT kw= ':' this_INT_7= RULE_INT kw= ':' this_INT_9= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleDATE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;
        Token this_INT_4=null;
        Token this_INT_5=null;
        Token this_INT_7=null;
        Token this_INT_9=null;


        	enterRule();

        try {
            // InternalVapor.g:886:2: ( (this_INT_0= RULE_INT kw= '/' this_INT_2= RULE_INT kw= '/' this_INT_4= RULE_INT this_INT_5= RULE_INT kw= ':' this_INT_7= RULE_INT kw= ':' this_INT_9= RULE_INT ) )
            // InternalVapor.g:887:2: (this_INT_0= RULE_INT kw= '/' this_INT_2= RULE_INT kw= '/' this_INT_4= RULE_INT this_INT_5= RULE_INT kw= ':' this_INT_7= RULE_INT kw= ':' this_INT_9= RULE_INT )
            {
            // InternalVapor.g:887:2: (this_INT_0= RULE_INT kw= '/' this_INT_2= RULE_INT kw= '/' this_INT_4= RULE_INT this_INT_5= RULE_INT kw= ':' this_INT_7= RULE_INT kw= ':' this_INT_9= RULE_INT )
            // InternalVapor.g:888:3: this_INT_0= RULE_INT kw= '/' this_INT_2= RULE_INT kw= '/' this_INT_4= RULE_INT this_INT_5= RULE_INT kw= ':' this_INT_7= RULE_INT kw= ':' this_INT_9= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_23); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getDATEAccess().getINTTerminalRuleCall_0());
            		
            kw=(Token)match(input,36,FOLLOW_7); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getDATEAccess().getSolidusKeyword_1());
            		
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_23); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getDATEAccess().getINTTerminalRuleCall_2());
            		
            kw=(Token)match(input,36,FOLLOW_7); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getDATEAccess().getSolidusKeyword_3());
            		
            this_INT_4=(Token)match(input,RULE_INT,FOLLOW_7); 

            			current.merge(this_INT_4);
            		

            			newLeafNode(this_INT_4, grammarAccess.getDATEAccess().getINTTerminalRuleCall_4());
            		
            this_INT_5=(Token)match(input,RULE_INT,FOLLOW_24); 

            			current.merge(this_INT_5);
            		

            			newLeafNode(this_INT_5, grammarAccess.getDATEAccess().getINTTerminalRuleCall_5());
            		
            kw=(Token)match(input,37,FOLLOW_7); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getDATEAccess().getColonKeyword_6());
            		
            this_INT_7=(Token)match(input,RULE_INT,FOLLOW_24); 

            			current.merge(this_INT_7);
            		

            			newLeafNode(this_INT_7, grammarAccess.getDATEAccess().getINTTerminalRuleCall_7());
            		
            kw=(Token)match(input,37,FOLLOW_7); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getDATEAccess().getColonKeyword_8());
            		
            this_INT_9=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_9);
            		

            			newLeafNode(this_INT_9, grammarAccess.getDATEAccess().getINTTerminalRuleCall_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDATE"


    // $ANTLR start "entryRuleDOUBLE"
    // InternalVapor.g:954:1: entryRuleDOUBLE returns [String current=null] : iv_ruleDOUBLE= ruleDOUBLE EOF ;
    public final String entryRuleDOUBLE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDOUBLE = null;


        try {
            // InternalVapor.g:954:46: (iv_ruleDOUBLE= ruleDOUBLE EOF )
            // InternalVapor.g:955:2: iv_ruleDOUBLE= ruleDOUBLE EOF
            {
             newCompositeNode(grammarAccess.getDOUBLERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDOUBLE=ruleDOUBLE();

            state._fsp--;

             current =iv_ruleDOUBLE.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDOUBLE"


    // $ANTLR start "ruleDOUBLE"
    // InternalVapor.g:961:1: ruleDOUBLE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleDOUBLE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalVapor.g:967:2: ( (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) )
            // InternalVapor.g:968:2: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            {
            // InternalVapor.g:968:2: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            // InternalVapor.g:969:3: this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )?
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_25); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_0());
            		
            // InternalVapor.g:976:3: (kw= '.' this_INT_2= RULE_INT )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==38) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalVapor.g:977:4: kw= '.' this_INT_2= RULE_INT
                    {
                    kw=(Token)match(input,38,FOLLOW_7); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getDOUBLEAccess().getFullStopKeyword_1_0());
                    			
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_2);
                    			

                    				newLeafNode(this_INT_2, grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_1_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDOUBLE"


    // $ANTLR start "entryRuleLONG"
    // InternalVapor.g:994:1: entryRuleLONG returns [String current=null] : iv_ruleLONG= ruleLONG EOF ;
    public final String entryRuleLONG() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLONG = null;


        try {
            // InternalVapor.g:994:44: (iv_ruleLONG= ruleLONG EOF )
            // InternalVapor.g:995:2: iv_ruleLONG= ruleLONG EOF
            {
             newCompositeNode(grammarAccess.getLONGRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLONG=ruleLONG();

            state._fsp--;

             current =iv_ruleLONG.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLONG"


    // $ANTLR start "ruleLONG"
    // InternalVapor.g:1001:1: ruleLONG returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleLONG() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalVapor.g:1007:2: (this_INT_0= RULE_INT )
            // InternalVapor.g:1008:2: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            		current.merge(this_INT_0);
            	

            		newLeafNode(this_INT_0, grammarAccess.getLONGAccess().getINTTerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLONG"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000007E1000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000004000000002L});

}