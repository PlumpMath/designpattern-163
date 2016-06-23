package com.bob.designpatterns.abstractfactory.stepone;

/**
 * 机场
 * @author bob
 *
 */
public class Airport {
	
	public static void main(String[] args) {
		//起飞前的准备
		Battleplane battleplane = new Battleplane();
		prepareToFly(battleplane);
		
		//起飞
	}
	
	/**
	 * 战斗机起飞前的准备工作
	 * @param battleplane
	 */
	public static void prepareToFly(Battleplane battleplane){
		battleplane.setPrimaryEscapeCompartment(new PrimaryEscapeCompartment());
		battleplane.setPrimaryShield(new PrimaryShield());
		battleplane.setPrimaryWeapon(new PrimaryWeapon());
	}
	

}
