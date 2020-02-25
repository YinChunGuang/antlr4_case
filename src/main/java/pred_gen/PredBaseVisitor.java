// Generated from D:/sbt_code_base/antlr4_case/src/main/antlr4/errors\Pred.g4 by ANTLR 4.8

package pred_gen;

import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link PredVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class PredBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements PredVisitor<T> {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitAssign(PredParser.AssignContext ctx) { return visitChildren(ctx); }
}