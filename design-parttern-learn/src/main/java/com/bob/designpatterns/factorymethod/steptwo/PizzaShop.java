package com.bob.designpatterns.factorymethod.steptwo;

public class PizzaShop extends FoodShop {

	@Override
	public Food createFood() {
		return new Pizza();
	}

}
