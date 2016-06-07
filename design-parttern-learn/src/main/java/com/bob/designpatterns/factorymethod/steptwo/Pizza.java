package com.bob.designpatterns.factorymethod.steptwo;

public class Pizza extends Food {

	@Override
	public String getName() {
		return "披萨";
	}

	@Override
	public String getTaste() {
		return "好好吃，好多肉";
	}

}
