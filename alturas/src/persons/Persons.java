package persons;

public class Persons {
	private String name;
	private int age;
	private double height;
	
	public Persons(String name, int age, double height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public double getHeight() {
		return height;
	}

	public String toString() {
		return "Person [name=" + name + "]";
	}
	
}
