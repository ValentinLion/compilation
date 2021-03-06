/*
 * generated by Xtext 2.13.0
 */
package esir.compilation.ide.contentassist.antlr;

import com.google.inject.Inject;
import esir.compilation.ide.contentassist.antlr.internal.InternalWhdslParser;
import esir.compilation.services.WhdslGrammarAccess;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class WhdslParser extends AbstractContentAssistParser {

	@Inject
	private WhdslGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalWhdslParser createParser() {
		InternalWhdslParser result = new InternalWhdslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getCommandAccess().getAlternatives(), "rule__Command__Alternatives");
					put(grammarAccess.getExprNotAccess().getAlternatives(), "rule__ExprNot__Alternatives");
					put(grammarAccess.getExprSimpleAccess().getAlternatives(), "rule__ExprSimple__Alternatives");
					put(grammarAccess.getExprSimpleAccess().getAlternatives_3_1(), "rule__ExprSimple__Alternatives_3_1");
					put(grammarAccess.getFunctionAccess().getGroup(), "rule__Function__Group__0");
					put(grammarAccess.getDefinitionAccess().getGroup(), "rule__Definition__Group__0");
					put(grammarAccess.getInputAccess().getGroup(), "rule__Input__Group__0");
					put(grammarAccess.getOutputAccess().getGroup(), "rule__Output__Group__0");
					put(grammarAccess.getVarsAccess().getGroup(), "rule__Vars__Group__0");
					put(grammarAccess.getVarsAccess().getGroup_1(), "rule__Vars__Group_1__0");
					put(grammarAccess.getCommandsAccess().getGroup(), "rule__Commands__Group__0");
					put(grammarAccess.getCommandsAccess().getGroup_1(), "rule__Commands__Group_1__0");
					put(grammarAccess.getIfAccess().getGroup(), "rule__If__Group__0");
					put(grammarAccess.getIfAccess().getGroup_4(), "rule__If__Group_4__0");
					put(grammarAccess.getAffectAccess().getGroup(), "rule__Affect__Group__0");
					put(grammarAccess.getForAccess().getGroup(), "rule__For__Group__0");
					put(grammarAccess.getWhileAccess().getGroup(), "rule__While__Group__0");
					put(grammarAccess.getForEachAccess().getGroup(), "rule__ForEach__Group__0");
					put(grammarAccess.getExprsAccess().getGroup(), "rule__Exprs__Group__0");
					put(grammarAccess.getExprsAccess().getGroup_1(), "rule__Exprs__Group_1__0");
					put(grammarAccess.getLExprAccess().getGroup(), "rule__LExpr__Group__0");
					put(grammarAccess.getExprAndAccess().getGroup(), "rule__ExprAnd__Group__0");
					put(grammarAccess.getExprAndAccess().getGroup_1(), "rule__ExprAnd__Group_1__0");
					put(grammarAccess.getExprOrAccess().getGroup(), "rule__ExprOr__Group__0");
					put(grammarAccess.getExprOrAccess().getGroup_1(), "rule__ExprOr__Group_1__0");
					put(grammarAccess.getExprNotAccess().getGroup_0(), "rule__ExprNot__Group_0__0");
					put(grammarAccess.getExprEqAccess().getGroup(), "rule__ExprEq__Group__0");
					put(grammarAccess.getExprEqAccess().getGroup_1(), "rule__ExprEq__Group_1__0");
					put(grammarAccess.getExprSimpleAccess().getGroup_0(), "rule__ExprSimple__Group_0__0");
					put(grammarAccess.getExprSimpleAccess().getGroup_1(), "rule__ExprSimple__Group_1__0");
					put(grammarAccess.getExprSimpleAccess().getGroup_2(), "rule__ExprSimple__Group_2__0");
					put(grammarAccess.getExprSimpleAccess().getGroup_3(), "rule__ExprSimple__Group_3__0");
					put(grammarAccess.getExprSimpleAccess().getGroup_3_1_0(), "rule__ExprSimple__Group_3_1_0__0");
					put(grammarAccess.getExprSimpleAccess().getGroup_3_1_1(), "rule__ExprSimple__Group_3_1_1__0");
					put(grammarAccess.getExprSimpleAccess().getGroup_3_1_2(), "rule__ExprSimple__Group_3_1_2__0");
					put(grammarAccess.getExprSimpleAccess().getGroup_3_1_3(), "rule__ExprSimple__Group_3_1_3__0");
					put(grammarAccess.getExprSimpleAccess().getGroup_3_1_4(), "rule__ExprSimple__Group_3_1_4__0");
					put(grammarAccess.getExprSimpleAccess().getGroup_3_1_5(), "rule__ExprSimple__Group_3_1_5__0");
					put(grammarAccess.getProgramAccess().getFunctionsAssignment(), "rule__Program__FunctionsAssignment");
					put(grammarAccess.getFunctionAccess().getNameAssignment_1(), "rule__Function__NameAssignment_1");
					put(grammarAccess.getFunctionAccess().getDefinitionAssignment_3(), "rule__Function__DefinitionAssignment_3");
					put(grammarAccess.getDefinitionAccess().getInputAssignment_0(), "rule__Definition__InputAssignment_0");
					put(grammarAccess.getDefinitionAccess().getCommandsAssignment_2(), "rule__Definition__CommandsAssignment_2");
					put(grammarAccess.getDefinitionAccess().getOutputAssignment_4(), "rule__Definition__OutputAssignment_4");
					put(grammarAccess.getInputAccess().getVarsAssignment_1(), "rule__Input__VarsAssignment_1");
					put(grammarAccess.getOutputAccess().getVarsAssignment_1(), "rule__Output__VarsAssignment_1");
					put(grammarAccess.getVarsAccess().getListAssignment_0(), "rule__Vars__ListAssignment_0");
					put(grammarAccess.getVarsAccess().getListAssignment_1_1(), "rule__Vars__ListAssignment_1_1");
					put(grammarAccess.getCommandsAccess().getListAssignment_0(), "rule__Commands__ListAssignment_0");
					put(grammarAccess.getCommandsAccess().getListAssignment_1_1(), "rule__Commands__ListAssignment_1_1");
					put(grammarAccess.getCommandAccess().getCmdAssignment_0(), "rule__Command__CmdAssignment_0");
					put(grammarAccess.getCommandAccess().getCmdAssignment_1(), "rule__Command__CmdAssignment_1");
					put(grammarAccess.getCommandAccess().getCmdAssignment_2(), "rule__Command__CmdAssignment_2");
					put(grammarAccess.getCommandAccess().getCmdAssignment_3(), "rule__Command__CmdAssignment_3");
					put(grammarAccess.getCommandAccess().getCmdAssignment_4(), "rule__Command__CmdAssignment_4");
					put(grammarAccess.getCommandAccess().getCmdAssignment_5(), "rule__Command__CmdAssignment_5");
					put(grammarAccess.getIfAccess().getConditionAssignment_1(), "rule__If__ConditionAssignment_1");
					put(grammarAccess.getIfAccess().getThenCommandsAssignment_3(), "rule__If__ThenCommandsAssignment_3");
					put(grammarAccess.getIfAccess().getElseCommandsAssignment_4_1(), "rule__If__ElseCommandsAssignment_4_1");
					put(grammarAccess.getAffectAccess().getVarsAssignment_0(), "rule__Affect__VarsAssignment_0");
					put(grammarAccess.getAffectAccess().getExprsAssignment_2(), "rule__Affect__ExprsAssignment_2");
					put(grammarAccess.getForAccess().getConditionAssignment_1(), "rule__For__ConditionAssignment_1");
					put(grammarAccess.getForAccess().getCommandsAssignment_3(), "rule__For__CommandsAssignment_3");
					put(grammarAccess.getWhileAccess().getConditionAssignment_1(), "rule__While__ConditionAssignment_1");
					put(grammarAccess.getWhileAccess().getCommandsAssignment_3(), "rule__While__CommandsAssignment_3");
					put(grammarAccess.getNopAccess().getNopAssignment(), "rule__Nop__NopAssignment");
					put(grammarAccess.getForEachAccess().getElemAssignment_1(), "rule__ForEach__ElemAssignment_1");
					put(grammarAccess.getForEachAccess().getEnsembAssignment_3(), "rule__ForEach__EnsembAssignment_3");
					put(grammarAccess.getForEachAccess().getCommandsAssignment_5(), "rule__ForEach__CommandsAssignment_5");
					put(grammarAccess.getExprsAccess().getListAssignment_0(), "rule__Exprs__ListAssignment_0");
					put(grammarAccess.getExprsAccess().getListAssignment_1_1(), "rule__Exprs__ListAssignment_1_1");
					put(grammarAccess.getLExprAccess().getListAssignment_0(), "rule__LExpr__ListAssignment_0");
					put(grammarAccess.getLExprAccess().getListAssignment_1(), "rule__LExpr__ListAssignment_1");
					put(grammarAccess.getExprAndAccess().getRightAssignment_1_2(), "rule__ExprAnd__RightAssignment_1_2");
					put(grammarAccess.getExprOrAccess().getRightAssignment_1_2(), "rule__ExprOr__RightAssignment_1_2");
					put(grammarAccess.getExprNotAccess().getExprAssignment_0_2(), "rule__ExprNot__ExprAssignment_0_2");
					put(grammarAccess.getExprEqAccess().getRightAssignment_1_2(), "rule__ExprEq__RightAssignment_1_2");
					put(grammarAccess.getExprSimpleAccess().getValueAssignment_0_1(), "rule__ExprSimple__ValueAssignment_0_1");
					put(grammarAccess.getExprSimpleAccess().getValueAssignment_1_1(), "rule__ExprSimple__ValueAssignment_1_1");
					put(grammarAccess.getExprSimpleAccess().getValueAssignment_2_1(), "rule__ExprSimple__ValueAssignment_2_1");
					put(grammarAccess.getExprSimpleAccess().getExprsAssignment_3_1_0_2(), "rule__ExprSimple__ExprsAssignment_3_1_0_2");
					put(grammarAccess.getExprSimpleAccess().getExprsAssignment_3_1_1_2(), "rule__ExprSimple__ExprsAssignment_3_1_1_2");
					put(grammarAccess.getExprSimpleAccess().getExprAssignment_3_1_2_2(), "rule__ExprSimple__ExprAssignment_3_1_2_2");
					put(grammarAccess.getExprSimpleAccess().getExprAssignment_3_1_3_2(), "rule__ExprSimple__ExprAssignment_3_1_3_2");
					put(grammarAccess.getExprSimpleAccess().getNameAssignment_3_1_4_1(), "rule__ExprSimple__NameAssignment_3_1_4_1");
					put(grammarAccess.getExprSimpleAccess().getParamsAssignment_3_1_4_2(), "rule__ExprSimple__ParamsAssignment_3_1_4_2");
					put(grammarAccess.getExprSimpleAccess().getExprAssignment_3_1_5_1(), "rule__ExprSimple__ExprAssignment_3_1_5_1");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public WhdslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(WhdslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
