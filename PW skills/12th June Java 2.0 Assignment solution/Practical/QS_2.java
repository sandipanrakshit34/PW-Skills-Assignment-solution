package ai.ineuron.trail;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class Person implements Externalizable {
	private String name;
	private int age;

	public Person() {
		// Default constructor required for externalization
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(name);
		out.writeObject(age);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name = (String) in.readObject();
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Person p1 = new Person("John", 30);

		// Write object to file
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.ser"));
		oos.writeObject(p1);
		oos.close();

		// Read object from file
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.ser"));
		Person p2 = (Person) ois.readObject();
		ois.close();

		System.out.println("Original object: " + p1);
		System.out.println("Deserialized object: " + p2);
	}

}
