package com.bob.designpatterns.factorymethod.steptwo;

/**
 * 小C
 * 
 * @author bob
 */
public class LittleC {

	private FoodShop foodShop;
	
	public void setFoodShop(FoodShop foodShop){
		this.foodShop = foodShop;
	}

	public void work() {
		Food food = foodShop.createFood();
		System.out.print(food.getName() + "做好了！");
		System.out.println(food.getTaste());
	}
}
