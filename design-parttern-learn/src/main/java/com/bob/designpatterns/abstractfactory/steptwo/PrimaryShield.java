package com.bob.designpatterns.abstractfactory.steptwo;

/**
 * 初级防护罩
 * 
 * @author bob
 *
 */
public class PrimaryShield extends Shield{

	@Override
	public String protect(){
		return "防御了一次攻击，但是防御罩受损";
	}
}
