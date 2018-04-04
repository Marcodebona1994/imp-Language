// Generated from /home/marco/IdeaProjects/imp/src/imp.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;
import java.util.*;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;


/**
 * This class provides an empty implementation of {@link impVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class impBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements impVisitor<T> {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitProg(impParser.ProgContext ctx) {
		if (ctx.getText().contains(";")) {
			visitSt(ctx.st());
			return visitProg(ctx.prog());
		}
		else {
			visitSt(ctx.st());
		}

		return null;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitSt(impParser.StContext ctx) {
		String st= ctx.getChild(0).getText();
		String st2= ctx.getText();
		boolean x = true;
		switch (st){
			case "skip" : return null; //non fa niente?
			case "input" : visitLvar(ctx.lvar()); //chiedere differenza input/output
			case "output" : visitLvar(ctx.lvar());
			case "while" : String w=visitBexp(ctx.bexp()).toString();
				while(w=="true") { //chiedere perchè o si entra e cicla all'infinito o non si entra
					visitProg(ctx.prog(0));
					w=visitBexp((impParser.BexpContext) ctx.getChild(1)).toString();
				}
				break;
			case "if" : String i=visitBexp((impParser.BexpContext) ctx.getChild(1)).toString();
				if(i=="true")
					visitProg(ctx.prog(0));
				else
					visitProg(ctx.prog(1));
				break;
			default: x = false;
		}
		if (x==false){
			if (st2.contains(":=")) {
				int a=st2.indexOf("=");
				System.out.println(st2.substring(a+1));
			}
			else{
				if (visitExp(ctx.exp())!=null){
					System.out.println(visitExp(ctx.exp()).toString());
				}
				else
					System.out.println("_/null/botton");
			}
		}
		return null;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitLvar(impParser.LvarContext ctx) {
		return (T)ctx.getText(); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitExp(impParser.ExpContext ctx) {
		return visitChildren(ctx);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitAexp(impParser.AexpContext ctx) {
		//idea
		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByName("js");
		try {
			Object result = engine.eval(ctx.getText());
			System.out.println(result.toString());
		}
		catch (Exception e ){
			System.out.println("error");
		}
		/*String left=ctx.getChild(0).getText();
		String right=ctx.getChild(2).getText();
		String op=visitAop(ctx.aop()).toString();
		int ret=0;
		switch (op){
			case "+" : ret=Integer.parseInt(left)+Integer.parseInt(visitAexp(ctx.aexp()).toString());
				break;
			case "-" : ret=Integer.parseInt(left)-Integer.parseInt(visitAexp(ctx.aexp()).toString());
				break;
			case "*" : ret=Integer.parseInt(left)*Integer.parseInt(visitAexp(ctx.aexp()).toString());
				break;
			case "/" : ret=Integer.parseInt(left)/Integer.parseInt(visitAexp(ctx.aexp()).toString());
				break;
		}*/
		return null ;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitAop(impParser.AopContext ctx) {
		return (T)ctx.getText();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitBexp(impParser.BexpContext ctx) {
		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByName("js");
		try {
			Object result = engine.eval(ctx.getText());
			System.out.println(result.toString());
			return (T)result;
		}
		catch (Exception e ){
			System.out.println("error");
		}
		return null;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitBop(impParser.BopContext ctx) {
		return (T)ctx.getText();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitLexp(impParser.LexpContext ctx) {
		//String temp=ctx.getText();
		String x=null;
		switch (ctx.getChild(0).toString()){
			case "_": return (T)"_"; //chiedere
			case "push" :
				x=visitLexp(ctx.lexp(0)).toString();
				if(x.contains(".")==false) {
					String t;
					if (x != "_")
						t = x.toString().concat(".").concat(visitLexp(ctx.lexp(1)).toString());
					else
						t = visitLexp(ctx.lexp(1)).toString();
					if (t == "_")
						return null;
					return (T) t;
				}
				else{
					System.out.println("Inserire un elemento alla volta nel push");
					return null;
				}
			case "pop" :
				x=visitLexp(ctx.lexp(0)).toString();
				if (x.contains(".")) {
					int i = x.indexOf(".");
					return (T) x.substring(i+1);
				}
				return null;
			case "top" :
				x=visitLexp(ctx.lexp(0)).toString();
				if (x.contains(".")) {
					int j = x.indexOf(".");
					return (T) x.substring(0,j);
				}
				if (x=="_")
					return null;
				return (T)x;
			case "cons" :
				x=visitLexp(ctx.lexp(0)).toString();
				String y;
				if(x!="_")
					y=x.toString().concat(".").concat(visitLexp(ctx.lexp(1)).toString());
				else
					y=visitLexp(ctx.lexp(1)).toString();
				if(y=="_")
					return null;
				return (T)y;
			default: x = visitLvar(ctx.lvar()).toString();
		}
		return (T)x; }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitMexp(impParser.MexpContext ctx) { return visitChildren(ctx); }
}