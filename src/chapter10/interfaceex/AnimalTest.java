package chapter10.interfaceex;

public class AnimalTest {

	public static void main(String[] args) {
		// Animal추상클래스를 객체생성 할수없도록 설계되어 있다.
		// Animal animal = new Animal(); 에러발생.
		
		AnimalTest aTest = new AnimalTest();
		aTest.callMethodAnimal(new Cat());
		aTest.callMethodAnimal(new Dog());
		aTest.callMethodAnimal(new Lion());
		aTest.callMethodAnimal(new Tiger());
		
	}
	
	public void callMethodAnimal(Animal animal) {
		animal.cry();
		animal.run();
	}

}
