package com.bob.designpatterns.abstractfactory.steptwo;

/**
 * 中级战斗准备系统
 * 
 * @author bob
 *
 */
public class MidFightPrepareSys extends FightPrepareSys {

	@Override
	public EscapeCompartment getEscapeCompartment() {
		return new MidEscapeCompartment();
	}

	@Override
	public Shield getShield() {
		return new MidShield();
	}

	@Override
	public Weapon getWeapon() {
		return new MidWeapon();
	}

}
