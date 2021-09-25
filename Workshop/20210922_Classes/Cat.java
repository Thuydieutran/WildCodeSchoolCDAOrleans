
public class Cat extends Animal implements AnimalWithPaws {
	
	private int nbPaws = 4;
	
	public Cat(String name) {
		super(name);
		super.sound = "meow meow";
		super.movement = "cours";
	}

	public int getNbPaws() {
		return this.nbPaws;
	}
	
}
