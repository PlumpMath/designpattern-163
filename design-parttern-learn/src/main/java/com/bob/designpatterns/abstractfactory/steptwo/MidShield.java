package com.bob.designpatterns.abstractfactory.steptwo;

/**
 * 初级防护罩
 * 
 * @author bob
 *
 */
public class MidShield extends Shield{

	@Override
	public String protect(){
		return "防御了一次攻击，看样子质量不错";
	}
}
