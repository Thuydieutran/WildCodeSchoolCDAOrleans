
public class Dog  extends Animal implements AnimalWithPaws {

	private int nbPaws = 4;
	
	public Dog(String name) {
		super(name);
		super.sound = "wouf wouf";
		super.movement = "cours";
	}

	public int getNbPaws() {
		return this.nbPaws;
	}

}
