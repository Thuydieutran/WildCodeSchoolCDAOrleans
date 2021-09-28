package wcscda;

public class Hero implements Comparable<Hero> {
	private String name;
	private Integer age;
	
	public Hero() {}
	public Hero(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public int compareTo(Hero arg0) {
		return -2*name.compareTo(arg0.getName()) + age.compareTo(arg0.getAge());
	}
	@Override
	public String toString() {
		return "Hero [name=" + name + ", age=" + age + "]";
	}
}
