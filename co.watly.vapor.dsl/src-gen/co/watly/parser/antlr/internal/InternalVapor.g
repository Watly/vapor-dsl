/*
 * generated by Xtext 2.13.0
 */
grammar InternalVapor;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package co.watly.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleScheduledFlight
entryRuleScheduledFlight returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getScheduledFlightRule()); }
	iv_ruleScheduledFlight=ruleScheduledFlight
	{ $current=$iv_ruleScheduledFlight.current; }
	EOF;

// Rule ScheduledFlight
ruleScheduledFlight returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='scheduled'
		{
			newLeafNode(otherlv_0, grammarAccess.getScheduledFlightAccess().getScheduledKeyword_0());
		}
		otherlv_1='vapor'
		{
			newLeafNode(otherlv_1, grammarAccess.getScheduledFlightAccess().getVaporKeyword_1());
		}
		otherlv_2='flight'
		{
			newLeafNode(otherlv_2, grammarAccess.getScheduledFlightAccess().getFlightKeyword_2());
		}
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getScheduledFlightAccess().getLeftCurlyBracketKeyword_3());
		}
		otherlv_4='date:'
		{
			newLeafNode(otherlv_4, grammarAccess.getScheduledFlightAccess().getDateKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getScheduledFlightAccess().getDateDATEParserRuleCall_5_0());
				}
				lv_date_5_0=ruleDATE
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getScheduledFlightRule());
					}
					set(
						$current,
						"date",
						lv_date_5_0,
						"co.watly.Vapor.DATE");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_6=','
		{
			newLeafNode(otherlv_6, grammarAccess.getScheduledFlightAccess().getCommaKeyword_6());
		}
		otherlv_7='model:'
		{
			newLeafNode(otherlv_7, grammarAccess.getScheduledFlightAccess().getModelKeyword_7());
		}
		(
			(
				lv_model_8_0=RULE_STRING
				{
					newLeafNode(lv_model_8_0, grammarAccess.getScheduledFlightAccess().getModelSTRINGTerminalRuleCall_8_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getScheduledFlightRule());
					}
					setWithLastConsumed(
						$current,
						"model",
						lv_model_8_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_9=','
		{
			newLeafNode(otherlv_9, grammarAccess.getScheduledFlightAccess().getCommaKeyword_9());
		}
		otherlv_10='cost:'
		{
			newLeafNode(otherlv_10, grammarAccess.getScheduledFlightAccess().getCostKeyword_10());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getScheduledFlightAccess().getCostLONGParserRuleCall_11_0());
				}
				lv_cost_11_0=ruleLONG
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getScheduledFlightRule());
					}
					set(
						$current,
						"cost",
						lv_cost_11_0,
						"co.watly.Vapor.LONG");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_12='drops'
		{
			newLeafNode(otherlv_12, grammarAccess.getScheduledFlightAccess().getDropsKeyword_12());
		}
		otherlv_13=','
		{
			newLeafNode(otherlv_13, grammarAccess.getScheduledFlightAccess().getCommaKeyword_13());
		}
		otherlv_14='commands:'
		{
			newLeafNode(otherlv_14, grammarAccess.getScheduledFlightAccess().getCommandsKeyword_14());
		}
		otherlv_15='['
		{
			newLeafNode(otherlv_15, grammarAccess.getScheduledFlightAccess().getLeftSquareBracketKeyword_15());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getScheduledFlightAccess().getCommandsCommandParserRuleCall_16_0());
				}
				lv_commands_16_0=ruleCommand
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getScheduledFlightRule());
					}
					add(
						$current,
						"commands",
						lv_commands_16_0,
						"co.watly.Vapor.Command");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_17=','
			{
				newLeafNode(otherlv_17, grammarAccess.getScheduledFlightAccess().getCommaKeyword_17_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getScheduledFlightAccess().getCommandsCommandParserRuleCall_17_1_0());
					}
					lv_commands_18_0=ruleCommand
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getScheduledFlightRule());
						}
						add(
							$current,
							"commands",
							lv_commands_18_0,
							"co.watly.Vapor.Command");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_19=']'
		{
			newLeafNode(otherlv_19, grammarAccess.getScheduledFlightAccess().getRightSquareBracketKeyword_18());
		}
		otherlv_20='}'
		{
			newLeafNode(otherlv_20, grammarAccess.getScheduledFlightAccess().getRightCurlyBracketKeyword_19());
		}
	)
;

// Entry rule entryRuleCommand
entryRuleCommand returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCommandRule()); }
	iv_ruleCommand=ruleCommand
	{ $current=$iv_ruleCommand.current; }
	EOF;

// Rule Command
ruleCommand returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getCommandAccess().getCommandCommonParserRuleCall_0());
		}
		this_CommandCommon_0=ruleCommandCommon
		{
			$current = $this_CommandCommon_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getCommandAccess().getCommandRotateParserRuleCall_1());
		}
		this_CommandRotate_1=ruleCommandRotate
		{
			$current = $this_CommandRotate_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleCommandCommon
entryRuleCommandCommon returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCommandCommonRule()); }
	iv_ruleCommandCommon=ruleCommandCommon
	{ $current=$iv_ruleCommandCommon.current; }
	EOF;

// Rule CommandCommon
ruleCommandCommon returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getCommandCommonAccess().getCommandUpParserRuleCall_0());
		}
		this_CommandUp_0=ruleCommandUp
		{
			$current = $this_CommandUp_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getCommandCommonAccess().getCommandDownParserRuleCall_1());
		}
		this_CommandDown_1=ruleCommandDown
		{
			$current = $this_CommandDown_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getCommandCommonAccess().getCommandLeftParserRuleCall_2());
		}
		this_CommandLeft_2=ruleCommandLeft
		{
			$current = $this_CommandLeft_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getCommandCommonAccess().getCommandRightParserRuleCall_3());
		}
		this_CommandRight_3=ruleCommandRight
		{
			$current = $this_CommandRight_3.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getCommandCommonAccess().getCommandForwardParserRuleCall_4());
		}
		this_CommandForward_4=ruleCommandForward
		{
			$current = $this_CommandForward_4.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getCommandCommonAccess().getCommandBackParserRuleCall_5());
		}
		this_CommandBack_5=ruleCommandBack
		{
			$current = $this_CommandBack_5.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleCommandUp
entryRuleCommandUp returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCommandUpRule()); }
	iv_ruleCommandUp=ruleCommandUp
	{ $current=$iv_ruleCommandUp.current; }
	EOF;

// Rule CommandUp
ruleCommandUp returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='up'
		{
			newLeafNode(otherlv_0, grammarAccess.getCommandUpAccess().getUpKeyword_0());
		}
		otherlv_1='at'
		{
			newLeafNode(otherlv_1, grammarAccess.getCommandUpAccess().getAtKeyword_1());
		}
		(
			(
				lv_speed_2_0=RULE_INT
				{
					newLeafNode(lv_speed_2_0, grammarAccess.getCommandUpAccess().getSpeedINTTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCommandUpRule());
					}
					setWithLastConsumed(
						$current,
						"speed",
						lv_speed_2_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_3='cm/sec'
		{
			newLeafNode(otherlv_3, grammarAccess.getCommandUpAccess().getCmSecKeyword_3());
		}
		otherlv_4='for'
		{
			newLeafNode(otherlv_4, grammarAccess.getCommandUpAccess().getForKeyword_4());
		}
		(
			(
				lv_millisecs_5_0=RULE_INT
				{
					newLeafNode(lv_millisecs_5_0, grammarAccess.getCommandUpAccess().getMillisecsINTTerminalRuleCall_5_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCommandUpRule());
					}
					setWithLastConsumed(
						$current,
						"millisecs",
						lv_millisecs_5_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_6='milliseconds'
		{
			newLeafNode(otherlv_6, grammarAccess.getCommandUpAccess().getMillisecondsKeyword_6());
		}
	)
;

// Entry rule entryRuleCommandDown
entryRuleCommandDown returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCommandDownRule()); }
	iv_ruleCommandDown=ruleCommandDown
	{ $current=$iv_ruleCommandDown.current; }
	EOF;

// Rule CommandDown
ruleCommandDown returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='down'
		{
			newLeafNode(otherlv_0, grammarAccess.getCommandDownAccess().getDownKeyword_0());
		}
		otherlv_1='at'
		{
			newLeafNode(otherlv_1, grammarAccess.getCommandDownAccess().getAtKeyword_1());
		}
		(
			(
				lv_speed_2_0=RULE_INT
				{
					newLeafNode(lv_speed_2_0, grammarAccess.getCommandDownAccess().getSpeedINTTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCommandDownRule());
					}
					setWithLastConsumed(
						$current,
						"speed",
						lv_speed_2_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_3='cm/sec'
		{
			newLeafNode(otherlv_3, grammarAccess.getCommandDownAccess().getCmSecKeyword_3());
		}
		otherlv_4='for'
		{
			newLeafNode(otherlv_4, grammarAccess.getCommandDownAccess().getForKeyword_4());
		}
		(
			(
				lv_millisecs_5_0=RULE_INT
				{
					newLeafNode(lv_millisecs_5_0, grammarAccess.getCommandDownAccess().getMillisecsINTTerminalRuleCall_5_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCommandDownRule());
					}
					setWithLastConsumed(
						$current,
						"millisecs",
						lv_millisecs_5_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_6='milliseconds'
		{
			newLeafNode(otherlv_6, grammarAccess.getCommandDownAccess().getMillisecondsKeyword_6());
		}
	)
;

// Entry rule entryRuleCommandLeft
entryRuleCommandLeft returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCommandLeftRule()); }
	iv_ruleCommandLeft=ruleCommandLeft
	{ $current=$iv_ruleCommandLeft.current; }
	EOF;

// Rule CommandLeft
ruleCommandLeft returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='left'
		{
			newLeafNode(otherlv_0, grammarAccess.getCommandLeftAccess().getLeftKeyword_0());
		}
		otherlv_1='at'
		{
			newLeafNode(otherlv_1, grammarAccess.getCommandLeftAccess().getAtKeyword_1());
		}
		(
			(
				lv_speed_2_0=RULE_INT
				{
					newLeafNode(lv_speed_2_0, grammarAccess.getCommandLeftAccess().getSpeedINTTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCommandLeftRule());
					}
					setWithLastConsumed(
						$current,
						"speed",
						lv_speed_2_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_3='cm/sec'
		{
			newLeafNode(otherlv_3, grammarAccess.getCommandLeftAccess().getCmSecKeyword_3());
		}
		otherlv_4='for'
		{
			newLeafNode(otherlv_4, grammarAccess.getCommandLeftAccess().getForKeyword_4());
		}
		(
			(
				lv_millisecs_5_0=RULE_INT
				{
					newLeafNode(lv_millisecs_5_0, grammarAccess.getCommandLeftAccess().getMillisecsINTTerminalRuleCall_5_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCommandLeftRule());
					}
					setWithLastConsumed(
						$current,
						"millisecs",
						lv_millisecs_5_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_6='milliseconds'
		{
			newLeafNode(otherlv_6, grammarAccess.getCommandLeftAccess().getMillisecondsKeyword_6());
		}
	)
;

// Entry rule entryRuleCommandRight
entryRuleCommandRight returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCommandRightRule()); }
	iv_ruleCommandRight=ruleCommandRight
	{ $current=$iv_ruleCommandRight.current; }
	EOF;

// Rule CommandRight
ruleCommandRight returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='right'
		{
			newLeafNode(otherlv_0, grammarAccess.getCommandRightAccess().getRightKeyword_0());
		}
		otherlv_1='at'
		{
			newLeafNode(otherlv_1, grammarAccess.getCommandRightAccess().getAtKeyword_1());
		}
		(
			(
				lv_speed_2_0=RULE_INT
				{
					newLeafNode(lv_speed_2_0, grammarAccess.getCommandRightAccess().getSpeedINTTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCommandRightRule());
					}
					setWithLastConsumed(
						$current,
						"speed",
						lv_speed_2_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_3='cm/sec'
		{
			newLeafNode(otherlv_3, grammarAccess.getCommandRightAccess().getCmSecKeyword_3());
		}
		otherlv_4='for'
		{
			newLeafNode(otherlv_4, grammarAccess.getCommandRightAccess().getForKeyword_4());
		}
		(
			(
				lv_millisecs_5_0=RULE_INT
				{
					newLeafNode(lv_millisecs_5_0, grammarAccess.getCommandRightAccess().getMillisecsINTTerminalRuleCall_5_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCommandRightRule());
					}
					setWithLastConsumed(
						$current,
						"millisecs",
						lv_millisecs_5_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_6='milliseconds'
		{
			newLeafNode(otherlv_6, grammarAccess.getCommandRightAccess().getMillisecondsKeyword_6());
		}
	)
;

// Entry rule entryRuleCommandForward
entryRuleCommandForward returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCommandForwardRule()); }
	iv_ruleCommandForward=ruleCommandForward
	{ $current=$iv_ruleCommandForward.current; }
	EOF;

// Rule CommandForward
ruleCommandForward returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='forward'
		{
			newLeafNode(otherlv_0, grammarAccess.getCommandForwardAccess().getForwardKeyword_0());
		}
		otherlv_1='at'
		{
			newLeafNode(otherlv_1, grammarAccess.getCommandForwardAccess().getAtKeyword_1());
		}
		(
			(
				lv_speed_2_0=RULE_INT
				{
					newLeafNode(lv_speed_2_0, grammarAccess.getCommandForwardAccess().getSpeedINTTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCommandForwardRule());
					}
					setWithLastConsumed(
						$current,
						"speed",
						lv_speed_2_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_3='cm/sec'
		{
			newLeafNode(otherlv_3, grammarAccess.getCommandForwardAccess().getCmSecKeyword_3());
		}
		otherlv_4='for'
		{
			newLeafNode(otherlv_4, grammarAccess.getCommandForwardAccess().getForKeyword_4());
		}
		(
			(
				lv_millisecs_5_0=RULE_INT
				{
					newLeafNode(lv_millisecs_5_0, grammarAccess.getCommandForwardAccess().getMillisecsINTTerminalRuleCall_5_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCommandForwardRule());
					}
					setWithLastConsumed(
						$current,
						"millisecs",
						lv_millisecs_5_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_6='milliseconds'
		{
			newLeafNode(otherlv_6, grammarAccess.getCommandForwardAccess().getMillisecondsKeyword_6());
		}
	)
;

// Entry rule entryRuleCommandBack
entryRuleCommandBack returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCommandBackRule()); }
	iv_ruleCommandBack=ruleCommandBack
	{ $current=$iv_ruleCommandBack.current; }
	EOF;

// Rule CommandBack
ruleCommandBack returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='back'
		{
			newLeafNode(otherlv_0, grammarAccess.getCommandBackAccess().getBackKeyword_0());
		}
		otherlv_1='at'
		{
			newLeafNode(otherlv_1, grammarAccess.getCommandBackAccess().getAtKeyword_1());
		}
		(
			(
				lv_speed_2_0=RULE_INT
				{
					newLeafNode(lv_speed_2_0, grammarAccess.getCommandBackAccess().getSpeedINTTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCommandBackRule());
					}
					setWithLastConsumed(
						$current,
						"speed",
						lv_speed_2_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_3='cm/sec'
		{
			newLeafNode(otherlv_3, grammarAccess.getCommandBackAccess().getCmSecKeyword_3());
		}
		otherlv_4='for'
		{
			newLeafNode(otherlv_4, grammarAccess.getCommandBackAccess().getForKeyword_4());
		}
		(
			(
				lv_millisecs_5_0=RULE_INT
				{
					newLeafNode(lv_millisecs_5_0, grammarAccess.getCommandBackAccess().getMillisecsINTTerminalRuleCall_5_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCommandBackRule());
					}
					setWithLastConsumed(
						$current,
						"millisecs",
						lv_millisecs_5_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_6='milliseconds'
		{
			newLeafNode(otherlv_6, grammarAccess.getCommandBackAccess().getMillisecondsKeyword_6());
		}
	)
;

// Entry rule entryRuleCommandRotate
entryRuleCommandRotate returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCommandRotateRule()); }
	iv_ruleCommandRotate=ruleCommandRotate
	{ $current=$iv_ruleCommandRotate.current; }
	EOF;

// Rule CommandRotate
ruleCommandRotate returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='rotate'
		{
			newLeafNode(otherlv_0, grammarAccess.getCommandRotateAccess().getRotateKeyword_0());
		}
		otherlv_1='at'
		{
			newLeafNode(otherlv_1, grammarAccess.getCommandRotateAccess().getAtKeyword_1());
		}
		(
			(
				lv_speed_2_0=RULE_INT
				{
					newLeafNode(lv_speed_2_0, grammarAccess.getCommandRotateAccess().getSpeedINTTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCommandRotateRule());
					}
					setWithLastConsumed(
						$current,
						"speed",
						lv_speed_2_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_3='cm/sec'
		{
			newLeafNode(otherlv_3, grammarAccess.getCommandRotateAccess().getCmSecKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCommandRotateAccess().getDegreesDOUBLEParserRuleCall_4_0());
				}
				lv_degrees_4_0=ruleDOUBLE
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCommandRotateRule());
					}
					set(
						$current,
						"degrees",
						lv_degrees_4_0,
						"co.watly.Vapor.DOUBLE");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5='degrees'
		{
			newLeafNode(otherlv_5, grammarAccess.getCommandRotateAccess().getDegreesKeyword_5());
		}
	)
;

// Entry rule entryRuleDATE
entryRuleDATE returns [String current=null]:
	{ newCompositeNode(grammarAccess.getDATERule()); }
	iv_ruleDATE=ruleDATE
	{ $current=$iv_ruleDATE.current.getText(); }
	EOF;

// Rule DATE
ruleDATE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_INT_0=RULE_INT
		{
			$current.merge(this_INT_0);
		}
		{
			newLeafNode(this_INT_0, grammarAccess.getDATEAccess().getINTTerminalRuleCall_0());
		}
		kw='/'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getDATEAccess().getSolidusKeyword_1());
		}
		this_INT_2=RULE_INT
		{
			$current.merge(this_INT_2);
		}
		{
			newLeafNode(this_INT_2, grammarAccess.getDATEAccess().getINTTerminalRuleCall_2());
		}
		kw='/'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getDATEAccess().getSolidusKeyword_3());
		}
		this_INT_4=RULE_INT
		{
			$current.merge(this_INT_4);
		}
		{
			newLeafNode(this_INT_4, grammarAccess.getDATEAccess().getINTTerminalRuleCall_4());
		}
		this_INT_5=RULE_INT
		{
			$current.merge(this_INT_5);
		}
		{
			newLeafNode(this_INT_5, grammarAccess.getDATEAccess().getINTTerminalRuleCall_5());
		}
		kw=':'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getDATEAccess().getColonKeyword_6());
		}
		this_INT_7=RULE_INT
		{
			$current.merge(this_INT_7);
		}
		{
			newLeafNode(this_INT_7, grammarAccess.getDATEAccess().getINTTerminalRuleCall_7());
		}
		kw=':'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getDATEAccess().getColonKeyword_8());
		}
		this_INT_9=RULE_INT
		{
			$current.merge(this_INT_9);
		}
		{
			newLeafNode(this_INT_9, grammarAccess.getDATEAccess().getINTTerminalRuleCall_9());
		}
	)
;

// Entry rule entryRuleDOUBLE
entryRuleDOUBLE returns [String current=null]:
	{ newCompositeNode(grammarAccess.getDOUBLERule()); }
	iv_ruleDOUBLE=ruleDOUBLE
	{ $current=$iv_ruleDOUBLE.current.getText(); }
	EOF;

// Rule DOUBLE
ruleDOUBLE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_INT_0=RULE_INT
		{
			$current.merge(this_INT_0);
		}
		{
			newLeafNode(this_INT_0, grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_0());
		}
		(
			kw='.'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getDOUBLEAccess().getFullStopKeyword_1_0());
			}
			this_INT_2=RULE_INT
			{
				$current.merge(this_INT_2);
			}
			{
				newLeafNode(this_INT_2, grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_1_1());
			}
		)?
	)
;

// Entry rule entryRuleLONG
entryRuleLONG returns [String current=null]:
	{ newCompositeNode(grammarAccess.getLONGRule()); }
	iv_ruleLONG=ruleLONG
	{ $current=$iv_ruleLONG.current.getText(); }
	EOF;

// Rule LONG
ruleLONG returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	this_INT_0=RULE_INT
	{
		$current.merge(this_INT_0);
	}
	{
		newLeafNode(this_INT_0, grammarAccess.getLONGAccess().getINTTerminalRuleCall());
	}
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
