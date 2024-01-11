package ai.ineuron.StaticEncapsulationAss;

public class Encapsulation {
	// instance variables
	private String name;
	private int age;

	// constructor with parameters
	public Encapsulation(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

}

class Main {
	public static void main(String[] args) {

		Encapsulation person1 = new Encapsulation("John Doe", 25);

		// accessing instance variables
		System.out.println(person1.getName());
		System.out.println(person1.getAge());
	}
}