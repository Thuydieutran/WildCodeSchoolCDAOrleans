public class Animal{
	
	private String name;
	protected String sound;
	protected String movement;
	
	
	public Animal(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void scream(){
		System.out.print("Je fais" + this.sound);
	}
	
	public void move() {
		System.out.print("Je " + this.movement);
	}
		
}