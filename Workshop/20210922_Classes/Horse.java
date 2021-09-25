
public class Horse extends Animal implements AnimalWithPaws{

	private int nbPaws = 4;
	
	public Horse(String name) {
		super(name);
		super.sound = "clip clap";
		super.movement = "cours";
	}

	public int getNbPaws() {
		return this.nbPaws;
	}

}
