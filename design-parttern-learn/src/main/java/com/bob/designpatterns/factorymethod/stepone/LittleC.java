package com.bob.designpatterns.factorymethod.stepone;

/**
 * 小C
 * @author bob
 */
public class LittleC {
	public void work() {
		   Bread bread = new Bread();
		   System.out.print(bread.getName()+"做好了！");
		   System.out.println(bread.getTaste());
		 }
}
