
public class AnimalDiscovery {

	public static void main(String[] args) {
		Cat misa = new Cat("Mi Sa");
		System.out.println("Je m'appelle " + misa.getName() + ", je fais " + misa.sound + " et je " + misa.movement + " avec mes " + misa.getNbPaws() + " pattes.");
		
		Dog bin = new Dog("Bin");
		System.out.println("Je m'appelle " + bin.getName() + ", je fais " + bin.sound + " et je " + bin.movement + " avec mes " + bin.getNbPaws() + " pattes.");
		
		Horse bolt = new Horse("Bolt");
		System.out.println("Je m'appelle " + bolt.getName() + ", je fais " + bolt.sound + " et je " + bolt.movement + " avec mes " + bolt.getNbPaws() + " pattes.");
		
		Bird chip = new Bird("Chip");
		System.out.println("Je m'appelle " + chip.getName() + ", je fais " + chip.sound + " et je " + chip.movement + " et j'ai " + chip.getNbPaws() + " pattes.");
		
		Fish nemo = new Fish("Nemo");
		System.out.println("Je m'appelle " + nemo.getName() + ", je fais " + nemo.sound + " et je " + nemo.movement);
		
		Dolphin winter = new Dolphin("Winter");
		System.out.println("Je m'appelle " + winter.getName() + ", je fais " + winter.sound + " et je " + winter.movement);
		
		Snake snake = new Snake("Snake Eyes");
		System.out.println("Je m'appelle " + snake.getName() + ", je fais " + snake.sound + " et je " + snake.movement);
		
	}

}
