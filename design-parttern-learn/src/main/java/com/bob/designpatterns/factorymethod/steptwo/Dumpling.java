package com.bob.designpatterns.factorymethod.steptwo;

public class Dumpling extends Food {

	@Override
	public String getName() {
		return "饺子";
	}

	@Override
	public String getTaste() {
		return "皮薄，馅多，真香";
	}

}
