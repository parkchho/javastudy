package chapter11.classex;

import chapter14.generics.GenericPrinter;
import chapter14.generics.Plastic;
import chapter14.generics.Power;

public class GenericPrinterTest {

	public static void main(String[] args) {
		// 제네릭 클래스를 사용. 객체생성
		GenericPrinter<Power> powerPrinter = new GenericPrinter<Power>();
		powerPrinter.setMaterial(new Power());
		Power power = powerPrinter.getMaterial();
		System.out.println(powerPrinter);
		
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
		plasticPrinter.setMaterial(new Plastic());
		Plastic plastic = plasticPrinter.getMaterial();
		System.out.println(plasticPrinter);
	}

}
