
public class Bird extends OviparousAnimals implements AnimalWithPaws {
	
	private int nbPaws = 2;

	public Bird(String name) {
		super(name);
		super.sound = "chew chew";
		super.movement = "vole";
	}

	@Override
	public int getNbPaws() {
		return this.nbPaws;
	}

}
