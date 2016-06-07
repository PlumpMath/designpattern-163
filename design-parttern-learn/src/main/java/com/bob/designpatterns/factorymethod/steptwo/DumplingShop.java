package com.bob.designpatterns.factorymethod.steptwo;

public class DumplingShop extends FoodShop {

	@Override
	public Food createFood() {
		return new Dumpling();
	}

}
