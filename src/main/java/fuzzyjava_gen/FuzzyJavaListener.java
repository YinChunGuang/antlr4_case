// Generated from D:/sbt_code_base/antlr4_case/src/main/antlr4\FuzzyJava.g4 by ANTLR 4.8
package fuzzyjava_gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FuzzyJavaParser}.
 */
public interface FuzzyJavaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FuzzyJavaParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(FuzzyJavaParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyJavaParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(FuzzyJavaParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyJavaParser#altfile}.
	 * @param ctx the parse tree
	 */
	void enterAltfile(FuzzyJavaParser.AltfileContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyJavaParser#altfile}.
	 * @param ctx the parse tree
	 */
	void exitAltfile(FuzzyJavaParser.AltfileContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyJavaParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(FuzzyJavaParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyJavaParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(FuzzyJavaParser.ConstantContext ctx);
}