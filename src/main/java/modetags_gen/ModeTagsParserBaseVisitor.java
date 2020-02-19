// Generated from D:/sbt_code_base/antlr4_case/src/main/antlr4/lexmagic\ModeTagsParser.g4 by ANTLR 4.8

package modetags_gen;

import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link ModeTagsParserVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class ModeTagsParserBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements ModeTagsParserVisitor<T> {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitFile(ModeTagsParser.FileContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitTag(ModeTagsParser.TagContext ctx) { return visitChildren(ctx); }
}