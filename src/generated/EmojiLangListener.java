// Generated from src/EmojiLang.g4 by ANTLR 4.13.1
package generated;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link EmojiLangParser}.
 */
public interface EmojiLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link EmojiLangParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(EmojiLangParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmojiLangParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(EmojiLangParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmojiLangParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(EmojiLangParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmojiLangParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(EmojiLangParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmojiLangParser#if}.
	 * @param ctx the parse tree
	 */
	void enterIf(EmojiLangParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmojiLangParser#if}.
	 * @param ctx the parse tree
	 */
	void exitIf(EmojiLangParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmojiLangParser#blockif}.
	 * @param ctx the parse tree
	 */
	void enterBlockif(EmojiLangParser.BlockifContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmojiLangParser#blockif}.
	 * @param ctx the parse tree
	 */
	void exitBlockif(EmojiLangParser.BlockifContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmojiLangParser#equal}.
	 * @param ctx the parse tree
	 */
	void enterEqual(EmojiLangParser.EqualContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmojiLangParser#equal}.
	 * @param ctx the parse tree
	 */
	void exitEqual(EmojiLangParser.EqualContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmojiLangParser#equalFactor}.
	 * @param ctx the parse tree
	 */
	void enterEqualFactor(EmojiLangParser.EqualFactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmojiLangParser#equalFactor}.
	 * @param ctx the parse tree
	 */
	void exitEqualFactor(EmojiLangParser.EqualFactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmojiLangParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(EmojiLangParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmojiLangParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(EmojiLangParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmojiLangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(EmojiLangParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmojiLangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(EmojiLangParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code single0}
	 * labeled alternative in {@link EmojiLangParser#expression0}.
	 * @param ctx the parse tree
	 */
	void enterSingle0(EmojiLangParser.Single0Context ctx);
	/**
	 * Exit a parse tree produced by the {@code single0}
	 * labeled alternative in {@link EmojiLangParser#expression0}.
	 * @param ctx the parse tree
	 */
	void exitSingle0(EmojiLangParser.Single0Context ctx);
	/**
	 * Enter a parse tree produced by the {@code add}
	 * labeled alternative in {@link EmojiLangParser#expression0}.
	 * @param ctx the parse tree
	 */
	void enterAdd(EmojiLangParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code add}
	 * labeled alternative in {@link EmojiLangParser#expression0}.
	 * @param ctx the parse tree
	 */
	void exitAdd(EmojiLangParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sub}
	 * labeled alternative in {@link EmojiLangParser#expression0}.
	 * @param ctx the parse tree
	 */
	void enterSub(EmojiLangParser.SubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sub}
	 * labeled alternative in {@link EmojiLangParser#expression0}.
	 * @param ctx the parse tree
	 */
	void exitSub(EmojiLangParser.SubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code single1}
	 * labeled alternative in {@link EmojiLangParser#expression1}.
	 * @param ctx the parse tree
	 */
	void enterSingle1(EmojiLangParser.Single1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code single1}
	 * labeled alternative in {@link EmojiLangParser#expression1}.
	 * @param ctx the parse tree
	 */
	void exitSingle1(EmojiLangParser.Single1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code mult}
	 * labeled alternative in {@link EmojiLangParser#expression1}.
	 * @param ctx the parse tree
	 */
	void enterMult(EmojiLangParser.MultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mult}
	 * labeled alternative in {@link EmojiLangParser#expression1}.
	 * @param ctx the parse tree
	 */
	void exitMult(EmojiLangParser.MultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code div}
	 * labeled alternative in {@link EmojiLangParser#expression1}.
	 * @param ctx the parse tree
	 */
	void enterDiv(EmojiLangParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code div}
	 * labeled alternative in {@link EmojiLangParser#expression1}.
	 * @param ctx the parse tree
	 */
	void exitDiv(EmojiLangParser.DivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link EmojiLangParser#expression2}.
	 * @param ctx the parse tree
	 */
	void enterInt(EmojiLangParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link EmojiLangParser#expression2}.
	 * @param ctx the parse tree
	 */
	void exitInt(EmojiLangParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code real}
	 * labeled alternative in {@link EmojiLangParser#expression2}.
	 * @param ctx the parse tree
	 */
	void enterReal(EmojiLangParser.RealContext ctx);
	/**
	 * Exit a parse tree produced by the {@code real}
	 * labeled alternative in {@link EmojiLangParser#expression2}.
	 * @param ctx the parse tree
	 */
	void exitReal(EmojiLangParser.RealContext ctx);
	/**
	 * Enter a parse tree produced by the {@code var}
	 * labeled alternative in {@link EmojiLangParser#expression2}.
	 * @param ctx the parse tree
	 */
	void enterVar(EmojiLangParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code var}
	 * labeled alternative in {@link EmojiLangParser#expression2}.
	 * @param ctx the parse tree
	 */
	void exitVar(EmojiLangParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code par}
	 * labeled alternative in {@link EmojiLangParser#expression2}.
	 * @param ctx the parse tree
	 */
	void enterPar(EmojiLangParser.ParContext ctx);
	/**
	 * Exit a parse tree produced by the {@code par}
	 * labeled alternative in {@link EmojiLangParser#expression2}.
	 * @param ctx the parse tree
	 */
	void exitPar(EmojiLangParser.ParContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmojiLangParser#read}.
	 * @param ctx the parse tree
	 */
	void enterRead(EmojiLangParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmojiLangParser#read}.
	 * @param ctx the parse tree
	 */
	void exitRead(EmojiLangParser.ReadContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmojiLangParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(EmojiLangParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmojiLangParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(EmojiLangParser.PrintContext ctx);
}