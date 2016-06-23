package com.bob.designpatterns.abstractfactory.steptwo;

/**
 * 战斗准备系统
 * 
 * @author bob
 *
 */
public abstract class FightPrepareSys {

	/**
	 * 获得一个逃生舱
	 * @return
	 */
	public abstract EscapeCompartment getEscapeCompartment();

	/**
	 * 获得一个防御罩
	 * @return
	 */
	public abstract Shield getShield();

	/**
	 * 获得一个武器
	 * @return
	 */
	public abstract Weapon getWeapon();

}
