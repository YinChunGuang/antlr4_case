// Generated from D:/sbt_code_base/antlr4_case/src/main/antlr4/lexmagic\ModeTagsParser.g4 by ANTLR 4.8

package modetags_gen;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ModeTagsParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ModeTagsParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ModeTagsParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(ModeTagsParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModeTagsParser#tag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTag(ModeTagsParser.TagContext ctx);
}