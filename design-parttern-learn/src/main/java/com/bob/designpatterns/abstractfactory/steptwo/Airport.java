package com.bob.designpatterns.abstractfactory.steptwo;

/**
 * 机场
 * 
 * @author bob
 *
 */
public class Airport {

	/**
	 * 战斗准备系统
	 */
	private static FightPrepareSys fightPrepareSys;

	public static void setFightPrepareSys(FightPrepareSys fightPrepareSys) {
		Airport.fightPrepareSys = fightPrepareSys;
	}

	public static void main(String[] args) {
		// 设置初级战斗准备系统
		// Airport.setFightPrepareSys(new PrimaryFightPrepareSys());
		// 设置中级战斗准备系统
		Airport.setFightPrepareSys(new MidFightPrepareSys());

		// 起飞前的准备
		Battleplane battleplane = new Battleplane();
		prepareToFly(battleplane);

		// 起飞
	}

	/**
	 * 战斗机起飞前的准备工作
	 * 
	 * @param battleplane
	 */
	public static void prepareToFly(Battleplane battleplane) {
		battleplane.setEscapeCompartment(fightPrepareSys.getEscapeCompartment());
		battleplane.setShield(fightPrepareSys.getShield());
		battleplane.setWeapon(fightPrepareSys.getWeapon());
	}

}
