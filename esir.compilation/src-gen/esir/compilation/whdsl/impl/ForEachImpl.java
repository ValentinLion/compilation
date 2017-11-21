/**
 * generated by Xtext 2.13.0
 */
package esir.compilation.whdsl.impl;

import esir.compilation.whdsl.Commands;
import esir.compilation.whdsl.Expr;
import esir.compilation.whdsl.ForEach;
import esir.compilation.whdsl.WhdslPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>For Each</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link esir.compilation.whdsl.impl.ForEachImpl#getElem <em>Elem</em>}</li>
 *   <li>{@link esir.compilation.whdsl.impl.ForEachImpl#getEnsemb <em>Ensemb</em>}</li>
 *   <li>{@link esir.compilation.whdsl.impl.ForEachImpl#getCommands <em>Commands</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ForEachImpl extends MinimalEObjectImpl.Container implements ForEach
{
  /**
   * The cached value of the '{@link #getElem() <em>Elem</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElem()
   * @generated
   * @ordered
   */
  protected Expr elem;

  /**
   * The cached value of the '{@link #getEnsemb() <em>Ensemb</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnsemb()
   * @generated
   * @ordered
   */
  protected Expr ensemb;

  /**
   * The cached value of the '{@link #getCommands() <em>Commands</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCommands()
   * @generated
   * @ordered
   */
  protected Commands commands;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ForEachImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return WhdslPackage.Literals.FOR_EACH;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr getElem()
  {
    return elem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetElem(Expr newElem, NotificationChain msgs)
  {
    Expr oldElem = elem;
    elem = newElem;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WhdslPackage.FOR_EACH__ELEM, oldElem, newElem);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElem(Expr newElem)
  {
    if (newElem != elem)
    {
      NotificationChain msgs = null;
      if (elem != null)
        msgs = ((InternalEObject)elem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WhdslPackage.FOR_EACH__ELEM, null, msgs);
      if (newElem != null)
        msgs = ((InternalEObject)newElem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WhdslPackage.FOR_EACH__ELEM, null, msgs);
      msgs = basicSetElem(newElem, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WhdslPackage.FOR_EACH__ELEM, newElem, newElem));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr getEnsemb()
  {
    return ensemb;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEnsemb(Expr newEnsemb, NotificationChain msgs)
  {
    Expr oldEnsemb = ensemb;
    ensemb = newEnsemb;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WhdslPackage.FOR_EACH__ENSEMB, oldEnsemb, newEnsemb);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEnsemb(Expr newEnsemb)
  {
    if (newEnsemb != ensemb)
    {
      NotificationChain msgs = null;
      if (ensemb != null)
        msgs = ((InternalEObject)ensemb).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WhdslPackage.FOR_EACH__ENSEMB, null, msgs);
      if (newEnsemb != null)
        msgs = ((InternalEObject)newEnsemb).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WhdslPackage.FOR_EACH__ENSEMB, null, msgs);
      msgs = basicSetEnsemb(newEnsemb, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WhdslPackage.FOR_EACH__ENSEMB, newEnsemb, newEnsemb));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Commands getCommands()
  {
    return commands;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCommands(Commands newCommands, NotificationChain msgs)
  {
    Commands oldCommands = commands;
    commands = newCommands;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WhdslPackage.FOR_EACH__COMMANDS, oldCommands, newCommands);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCommands(Commands newCommands)
  {
    if (newCommands != commands)
    {
      NotificationChain msgs = null;
      if (commands != null)
        msgs = ((InternalEObject)commands).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WhdslPackage.FOR_EACH__COMMANDS, null, msgs);
      if (newCommands != null)
        msgs = ((InternalEObject)newCommands).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WhdslPackage.FOR_EACH__COMMANDS, null, msgs);
      msgs = basicSetCommands(newCommands, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WhdslPackage.FOR_EACH__COMMANDS, newCommands, newCommands));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case WhdslPackage.FOR_EACH__ELEM:
        return basicSetElem(null, msgs);
      case WhdslPackage.FOR_EACH__ENSEMB:
        return basicSetEnsemb(null, msgs);
      case WhdslPackage.FOR_EACH__COMMANDS:
        return basicSetCommands(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case WhdslPackage.FOR_EACH__ELEM:
        return getElem();
      case WhdslPackage.FOR_EACH__ENSEMB:
        return getEnsemb();
      case WhdslPackage.FOR_EACH__COMMANDS:
        return getCommands();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case WhdslPackage.FOR_EACH__ELEM:
        setElem((Expr)newValue);
        return;
      case WhdslPackage.FOR_EACH__ENSEMB:
        setEnsemb((Expr)newValue);
        return;
      case WhdslPackage.FOR_EACH__COMMANDS:
        setCommands((Commands)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case WhdslPackage.FOR_EACH__ELEM:
        setElem((Expr)null);
        return;
      case WhdslPackage.FOR_EACH__ENSEMB:
        setEnsemb((Expr)null);
        return;
      case WhdslPackage.FOR_EACH__COMMANDS:
        setCommands((Commands)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case WhdslPackage.FOR_EACH__ELEM:
        return elem != null;
      case WhdslPackage.FOR_EACH__ENSEMB:
        return ensemb != null;
      case WhdslPackage.FOR_EACH__COMMANDS:
        return commands != null;
    }
    return super.eIsSet(featureID);
  }

} //ForEachImpl
