package com.bob.designpatterns.abstractfactory.steptwo;

/**
 * 初级战斗准备系统
 * 
 * @author bob
 *
 */
public class PrimaryFightPrepareSys extends FightPrepareSys {

	@Override
	public EscapeCompartment getEscapeCompartment() {
		return new PrimaryEscapeCompartment();
	}

	@Override
	public Shield getShield() {
		return new PrimaryShield();
	}

	@Override
	public Weapon getWeapon() {
		return new PrimaryWeapon();
	}

}
