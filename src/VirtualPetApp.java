import java.util.Scanner;


public class VirtualPetApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Virtualpet venusFly = new Virtualpet("Aubrey II", "Venus Fly Trap");

		//Short intro
		writeLine(
				"An unknown alien plant species has been dropped off to your door. It's up to you to meet all of his needs. Good luck!" );
		
		
		
		while (!venusFly.dead()) {
			writeLine("Aubrey II");
			writeLine("Hunger: " + venusFly.getHunger());
			writeLine("Water Level: " + venusFly.getDry());
			writeLine("Boredom Level: " + venusFly.getBored());
//			writeLine("Health Level: " + venusFly.getSickness());
			writeLine("What do you want to do? ");
			writeLine("1. Feed Aubrey II");
			writeLine("2. Water Aubrey II");
			writeLine("3. Entertain Aubrey II");
//			writeLine("4. Spray for mites");
			writeLine("4. Quit");
			// show a menu of the things the pet can do
// loop is not looping!!
			String options = input.next();

			switch (options) {

			case "1":
				if (venusFly.isHungry()) {
					writeLine("Feeeeed meeee Seeeeymooouuurrrr!");
				} else {
					writeLine("I do not require sustenance little human!");
				}
				break;
			case "2":
				if (venusFly.isDry()) {
					writeLine("Waaaattteeerr meeee Seeeeymooouuurrrr!");
				} else {
					writeLine("Everything in moderation. No more water!!");
				}
				break;
			case "3":
				if (venusFly.isBored()) {
					writeLine("Dance human! Dance!! Whilst I serenede you. ");
				} else {
					writeLine("Be gone! Your prescence has become a burden");
				}
//			case "4":
//				if (venusFly.isSick()) {
//					writeLine("I require pesticides, immediatley!");
//				} else {
//					writeLine("There ain't no bugs on me");
//				}
			case "4":
				writeLine("Don't stay away too long! <3 ");
				venusFly.quit();

				venusFly.tick();
			}
		}

	}

	// if the user want to feed the pet mypet.feed();
	// if(mypet.isHUngry()) { System.out.println("Feed me!");

	// writeLine("How are you feeling AudreyII?");
	// writeLine("Hunger:" + venusFly.getHunger());

	public static void writeLine(String message) {
		System.out.println(message);
	}

	public static void writeInt(int message) {
		System.out.println(message);

	}
}
