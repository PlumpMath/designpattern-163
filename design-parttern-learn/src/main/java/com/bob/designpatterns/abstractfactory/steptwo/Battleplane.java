package com.bob.designpatterns.abstractfactory.steptwo;

/**
 * 战斗机
 * 
 * @author bob
 *
 */
public class Battleplane {
	/**
	 * 逃生舱
	 */
	private EscapeCompartment EscapeCompartment;

	/**
	 * 防御罩
	 */
	private Shield Shield;

	/**
	 * 武器
	 */
	private Weapon Weapon;

	public EscapeCompartment getEscapeCompartment() {
		return EscapeCompartment;
	}

	public void setEscapeCompartment(EscapeCompartment EscapeCompartment) {
		this.EscapeCompartment = EscapeCompartment;
	}

	public Shield getShield() {
		return Shield;
	}

	public void setShield(Shield Shield) {
		this.Shield = Shield;
	}

	public Weapon getWeapon() {
		return Weapon;
	}

	public void setWeapon(Weapon Weapon) {
		this.Weapon = Weapon;
	}

}
