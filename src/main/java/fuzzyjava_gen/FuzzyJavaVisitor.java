// Generated from D:/sbt_code_base/antlr4_case/src/main/antlr4\FuzzyJava.g4 by ANTLR 4.8
package fuzzyjava_gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FuzzyJavaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FuzzyJavaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FuzzyJavaParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(FuzzyJavaParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link FuzzyJavaParser#altfile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAltfile(FuzzyJavaParser.AltfileContext ctx);
	/**
	 * Visit a parse tree produced by {@link FuzzyJavaParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(FuzzyJavaParser.ConstantContext ctx);
}