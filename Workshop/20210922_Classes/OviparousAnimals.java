public class OviparousAnimals extends Animal {
	
	public OviparousAnimals(String name) {
		super(name);
	}
	
	public Egg giveEgg() {
		return new Egg();
	}
}
