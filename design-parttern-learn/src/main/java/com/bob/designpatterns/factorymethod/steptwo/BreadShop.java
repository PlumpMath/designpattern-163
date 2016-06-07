package com.bob.designpatterns.factorymethod.steptwo;

public class BreadShop extends FoodShop {

	@Override
	public Food createFood() {
		return new Bread();
	}

}
