import java.util.Random;

public class Virtualpet {

	public String name;
	public String breed;
	int hunger;
	int drySoil
	;
	int boredom;

	public Virtualpet(String name, String breed) {
		this.name = name;
		this.breed = breed;
		hunger = 30;
		drySoil = 30;
		boredom = 30;

	}

	public Virtualpet(String newName, String newBreed, int hungerNum, int thirstNum, int boredNum) {
		name = newName;
		 breed = newBreed;
		 hunger = hungerNum;
		  drySoil =thirstNum;
		  boredom = boredNum;

	}

	Random r = new Random();
	
	boolean dead() {
		return hunger > 60 && drySoil > 60 && boredom > 60;
	}

	public String getName() {
		return name;
	}

	// hunger
	public void feedPets() {
		hunger = hunger - 10; // hunger -=10
	}

	boolean isHungry() {
		return hunger >= 50;
	}

	int getHunger() {
		return hunger;
	}

	// thirst
	public void waterPets() {
		drySoil = drySoil - 10; // hunger -=10
	}

	boolean isDry() {
		return drySoil >= 50;
	}

	int getDry() {
		return hunger;

	}

	// boredom
	void entertain() {
		boredom = boredom - 10;
	}

	boolean isBored() {
		return boredom >= 50;
	}

	int getBored() {
		return boredom;
	}
	void quit() {
		System.exit(0);
	}
	// tick here
	void tick() {

		hunger = hunger + r.nextInt(10);
		drySoil = drySoil + r.nextInt(10);
		boredom = boredom + r.nextInt(10);

	}

	@Override // turn object into String (toString)
	public String toString() {
		return name + " " + breed + " " + hunger + " " + drySoil + " " + boredom;
	}

	
	}
