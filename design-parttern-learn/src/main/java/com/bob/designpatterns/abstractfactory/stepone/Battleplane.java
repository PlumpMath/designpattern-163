package com.bob.designpatterns.abstractfactory.stepone;

/**
 * 战斗机
 * @author bob
 *
 */
public class Battleplane {
	/**
	 * 初级逃生舱
	 */
	private PrimaryEscapeCompartment primaryEscapeCompartment;
	
	/**
	 * 初级防御罩
	 */
	private PrimaryShield primaryShield;
	
	/**
	 * 初级武器
	 */
	private PrimaryWeapon primaryWeapon;

	public PrimaryEscapeCompartment getPrimaryEscapeCompartment() {
		return primaryEscapeCompartment;
	}

	public void setPrimaryEscapeCompartment(PrimaryEscapeCompartment primaryEscapeCompartment) {
		this.primaryEscapeCompartment = primaryEscapeCompartment;
	}

	public PrimaryShield getPrimaryShield() {
		return primaryShield;
	}

	public void setPrimaryShield(PrimaryShield primaryShield) {
		this.primaryShield = primaryShield;
	}

	public PrimaryWeapon getPrimaryWeapon() {
		return primaryWeapon;
	}

	public void setPrimaryWeapon(PrimaryWeapon primaryWeapon) {
		this.primaryWeapon = primaryWeapon;
	}
	
}
