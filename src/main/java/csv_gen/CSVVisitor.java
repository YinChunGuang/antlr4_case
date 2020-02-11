// Generated from D:/sbt_code_base/antlr4_case/src/main/antlr4\CSV.g4 by ANTLR 4.8
package csv_gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CSVParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CSVVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CSVParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(CSVParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSVParser#hdr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHdr(CSVParser.HdrContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSVParser#row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRow(CSVParser.RowContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSVParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(CSVParser.FieldContext ctx);
}