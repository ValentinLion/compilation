/**
 * generated by Xtext 2.13.0
 */
package esir.compilation.whdsl.util;

import esir.compilation.whdsl.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see esir.compilation.whdsl.WhdslPackage
 * @generated
 */
public class WhdslSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static WhdslPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WhdslSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = WhdslPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case WhdslPackage.PROGRAM:
      {
        Program program = (Program)theEObject;
        T result = caseProgram(program);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WhdslPackage.FUNCTION:
      {
        Function function = (Function)theEObject;
        T result = caseFunction(function);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WhdslPackage.DEFINITION:
      {
        Definition definition = (Definition)theEObject;
        T result = caseDefinition(definition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WhdslPackage.INPUT:
      {
        Input input = (Input)theEObject;
        T result = caseInput(input);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WhdslPackage.OUTPUT:
      {
        Output output = (Output)theEObject;
        T result = caseOutput(output);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WhdslPackage.VARS:
      {
        Vars vars = (Vars)theEObject;
        T result = caseVars(vars);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WhdslPackage.COMMANDS:
      {
        Commands commands = (Commands)theEObject;
        T result = caseCommands(commands);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WhdslPackage.COMMAND:
      {
        Command command = (Command)theEObject;
        T result = caseCommand(command);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WhdslPackage.IF:
      {
        If if_ = (If)theEObject;
        T result = caseIf(if_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WhdslPackage.AFFECT:
      {
        Affect affect = (Affect)theEObject;
        T result = caseAffect(affect);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WhdslPackage.FOR:
      {
        For for_ = (For)theEObject;
        T result = caseFor(for_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WhdslPackage.WHILE:
      {
        While while_ = (While)theEObject;
        T result = caseWhile(while_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WhdslPackage.NOP:
      {
        Nop nop = (Nop)theEObject;
        T result = caseNop(nop);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WhdslPackage.FOR_EACH:
      {
        ForEach forEach = (ForEach)theEObject;
        T result = caseForEach(forEach);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WhdslPackage.EXPRS:
      {
        Exprs exprs = (Exprs)theEObject;
        T result = caseExprs(exprs);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WhdslPackage.LEXPR:
      {
        LExpr lExpr = (LExpr)theEObject;
        T result = caseLExpr(lExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WhdslPackage.EXPR:
      {
        Expr expr = (Expr)theEObject;
        T result = caseExpr(expr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WhdslPackage.EXPR_AND:
      {
        ExprAnd exprAnd = (ExprAnd)theEObject;
        T result = caseExprAnd(exprAnd);
        if (result == null) result = caseExpr(exprAnd);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WhdslPackage.EXPR_OR:
      {
        ExprOr exprOr = (ExprOr)theEObject;
        T result = caseExprOr(exprOr);
        if (result == null) result = caseExpr(exprOr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WhdslPackage.EXPR_NOT:
      {
        ExprNot exprNot = (ExprNot)theEObject;
        T result = caseExprNot(exprNot);
        if (result == null) result = caseExpr(exprNot);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WhdslPackage.EXPR_EQ:
      {
        ExprEq exprEq = (ExprEq)theEObject;
        T result = caseExprEq(exprEq);
        if (result == null) result = caseExpr(exprEq);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WhdslPackage.NILL:
      {
        Nill nill = (Nill)theEObject;
        T result = caseNill(nill);
        if (result == null) result = caseExpr(nill);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WhdslPackage.VARIABLE:
      {
        Variable variable = (Variable)theEObject;
        T result = caseVariable(variable);
        if (result == null) result = caseExpr(variable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WhdslPackage.SYMBOL:
      {
        Symbol symbol = (Symbol)theEObject;
        T result = caseSymbol(symbol);
        if (result == null) result = caseExpr(symbol);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WhdslPackage.CONS:
      {
        Cons cons = (Cons)theEObject;
        T result = caseCons(cons);
        if (result == null) result = caseExpr(cons);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WhdslPackage.LIST:
      {
        List list = (List)theEObject;
        T result = caseList(list);
        if (result == null) result = caseExpr(list);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WhdslPackage.HD:
      {
        Hd hd = (Hd)theEObject;
        T result = caseHd(hd);
        if (result == null) result = caseExpr(hd);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WhdslPackage.TL:
      {
        Tl tl = (Tl)theEObject;
        T result = caseTl(tl);
        if (result == null) result = caseExpr(tl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WhdslPackage.CALL:
      {
        Call call = (Call)theEObject;
        T result = caseCall(call);
        if (result == null) result = caseExpr(call);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WhdslPackage.ENCLOSED_EXPR:
      {
        EnclosedExpr enclosedExpr = (EnclosedExpr)theEObject;
        T result = caseEnclosedExpr(enclosedExpr);
        if (result == null) result = caseExpr(enclosedExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Program</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Program</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProgram(Program object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunction(Function object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDefinition(Definition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Input</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Input</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInput(Input object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Output</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Output</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOutput(Output object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Vars</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Vars</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVars(Vars object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Commands</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Commands</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCommands(Commands object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Command</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Command</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCommand(Command object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>If</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>If</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIf(If object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Affect</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Affect</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAffect(Affect object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>For</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>For</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFor(For object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>While</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>While</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWhile(While object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Nop</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Nop</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNop(Nop object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>For Each</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>For Each</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseForEach(ForEach object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Exprs</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Exprs</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExprs(Exprs object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>LExpr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>LExpr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLExpr(LExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpr(Expr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expr And</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expr And</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExprAnd(ExprAnd object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expr Or</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expr Or</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExprOr(ExprOr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expr Not</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expr Not</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExprNot(ExprNot object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expr Eq</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expr Eq</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExprEq(ExprEq object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Nill</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Nill</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNill(Nill object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariable(Variable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Symbol</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Symbol</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSymbol(Symbol object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cons</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cons</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCons(Cons object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseList(List object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Hd</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Hd</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHd(Hd object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Tl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTl(Tl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Call</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Call</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCall(Call object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enclosed Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enclosed Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnclosedExpr(EnclosedExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //WhdslSwitch
