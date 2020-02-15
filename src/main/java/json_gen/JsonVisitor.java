// Generated from D:/sbt_code_base/antlr4_case/src/main/antlr4\Json.g4 by ANTLR 4.8
package json_gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JsonParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JsonVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JsonParser#json}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJson(JsonParser.JsonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AnObject}
	 * labeled alternative in {@link JsonParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnObject(JsonParser.AnObjectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EmptyObject}
	 * labeled alternative in {@link JsonParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyObject(JsonParser.EmptyObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonParser#pair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPair(JsonParser.PairContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(JsonParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code String}
	 * labeled alternative in {@link JsonParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(JsonParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Atom}
	 * labeled alternative in {@link JsonParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(JsonParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ObjectValue}
	 * labeled alternative in {@link JsonParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectValue(JsonParser.ObjectValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayValue}
	 * labeled alternative in {@link JsonParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayValue(JsonParser.ArrayValueContext ctx);
}