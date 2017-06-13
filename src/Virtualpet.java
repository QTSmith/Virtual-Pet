import java.util.Random;

public class Virtualpet {

	public String name;
	public String breed;
	int hunger;
	int thirst;
	int boredom;

	public Virtualpet(String name, String breed) {
		this.name = name;
		this.breed = breed;
		hunger = 30;
		thirst = 30;
		boredom = 30;

	}

	public Virtualpet(String newName, String newBreed, int hungerNum, int thirstNum, int boredNum) {
		name = newName;
		 breed = newBreed;
		 hunger = hungerNum;
		  thirst =thirstNum;
		  boredom = boredNum;

	}

	Random r = new Random();

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
		thirst = thirst - 10; // hunger -=10
	}

	boolean isThirst() {
		return thirst >= 50;
	}

	int getThirst() {
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

	// tick here
	void tick() {

		hunger = hunger + r.nextInt(10);
		thirst = thirst + r.nextInt(10);
		boredom = boredom + r.nextInt(10);

	}

	@Override // turn object into String (toString)
	public String toString() {
		return name + " " + breed + " " + hunger + " " + thirst + " " + boredom;
	}

	
	}
}