package tutorial_80_inheritance;

public class Dog extends Animal {

	private int eyes;
	private int legs;
	private int tail;
	private int teeth;
	private String coat;

	public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
		super(name, 1, 1, size, weight);
		this.eyes = eyes;
		this.legs = legs;
		this.tail = tail;
		this.teeth = teeth;
		this.coat = coat;
	}

	private void chew() {
		System.out.println("Dog.chew() called");
	}

	@Override
	public void eat() {
		System.out.println("Dog.eat() called");
		chew();
		super.eat();
	}

	public void walk() {//TODO tee inheritance part 2
		System.out.println();
	}

	//printaa 82. reference vs object vs instance bv class
}
