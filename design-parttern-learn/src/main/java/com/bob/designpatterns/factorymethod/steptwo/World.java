package com.bob.designpatterns.factorymethod.steptwo;

public class World {

	public static void main(String[] args) {
		LittleC littleC = new LittleC();
		System.out.println("小明：我要吃面包！");
		littleC.setFoodShop(new BreadShop());
		littleC.work();

		System.out.println("小明：我要吃饺子！");
		littleC.setFoodShop(new DumplingShop());
		littleC.work();

		System.out.println("小明：我要吃披萨！");
		littleC.setFoodShop(new PizzaShop());
		littleC.work();
	}
}