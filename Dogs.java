import java.util.Scanner;

/**
 * 
 * @author Benjamin Clark
 * The user is able to create their own custom dog based upon the limitations
 * I put in place.
 */
public class Dogs {

	public static void main(String[] args) {
		
		boolean correctGender = false;
		String string = "";
		String gender = "";
		
		System.out.println("Welcome! Design your new dog!\n");
		
		while (correctGender == false) {

			System.out.println("Male or Female?");
			Scanner scan = new Scanner(System.in);
			string = scan.nextLine();

			if (string.equals("Male")) {
				gender = "Male";
				correctGender = true;
			} else if (string.equals("Female")) {
				gender = "Female";
				correctGender = true;
			} else {
				System.err.println("Gender must be Male, or Female.\n");
			}
		}
		
		breed();
		bark();
		color();
		
		System.out.println("\nCongratulations! Enjoy your new dog!");
		
	}

	/**
	 * Allows the user to choose the breed from a limited selection
	 */
	public static void breed() {

		boolean correctBreed = false;
		String string = "";

		DogBreed breed = new DogBreed();

		System.out.println("Breed of your dog? \n");

		while (correctBreed == false) {
			
			System.out.println("Breeds to choose from. \n");
			System.out.println(breed.australianShephard());
			System.out.println(breed.goldenRetriever());
			System.out.println(breed.lab());
			System.out.println(breed.maltese());
			System.out.println(breed.pitBull());
			System.out.println(breed.poodle());
			System.out.println(breed.siberianHusky());
			System.out.println(breed.tibetanMastiff());
			System.out.println(breed.weinerDog());
			
			Scanner scan = new Scanner(System.in);
			string = scan.nextLine();

			switch (string) {

			case "Australian Shephard":
				System.out.println("Your chosen breed is " + breed.australianShephard() + "!");
				correctBreed = true;
				break;
			case "Golden Retriever":
				System.out.println("Your chosen breed is " + breed.goldenRetriever() + "!");
				correctBreed = true;
				break;
			case "Lab":
				System.out.println("Your chosen breed is " + breed.lab() + "!");
				correctBreed = true;
				break;
			case "Maltese":
				System.out.println("Your chosen breed is " + breed.maltese() + "!");
				correctBreed = true;
				break;
			case "Pit Bull":
				System.out.println("Your chosen breed is " + breed.pitBull() + "!");
				correctBreed = true;
				break;
			case "Poodle":
				System.out.println("Your chosen breed is " + breed.poodle() + "!");
				correctBreed = true;
				break;
			case "Siberian Husky":
				System.out.println("Your chosen breed is " + breed.siberianHusky() + "!");
				correctBreed = true;
				break;
			case "Tibetan Mastiff":
				System.out.println("Your chosen breed is " + breed.tibetanMastiff() + "!");
				correctBreed = true;
				break;
			case "Weiner Dog":
				System.out.println("Your chosen breed is " + breed.weinerDog() + "!");
				correctBreed = true;
				break;
			default:
				System.err.println("Error: Must choose one of the following breeds.");

			}
		}
	}
	
	/**
	 * Allows the user to select the dogs bark
	 */
	public static void bark() {
		
		boolean correctBark = false;
		String string = "";
		
		System.out.println("Select your dogs bark.\n");
		
		while(correctBark == false) {
			
			System.out.println("Barks to choose from.\n");
			
			DogBark bark = new DogBark();
			
			String averageBark = bark.averageBark();
			String loudBark = bark.loudBark();
			String multipleBarks = bark.multipleBarks();
			String quiteBark = bark.quiteBark();
			
			System.out.println(averageBark);
			System.out.println(loudBark);
			System.out.println(multipleBarks);
			System.out.println(quiteBark);
			
			Scanner scan = new Scanner(System.in);
			string = scan.nextLine();
			
			if (string.equals(bark.averageBark())) {
				System.out.println("Your dogs bark is " + string + "\n");
				correctBark = true;
			} else if (string.equals(bark.loudBark())) {
				System.out.println("Your dogs bark is " + string + "\n");
				correctBark = true;
			} else if (string.equals(bark.multipleBarks())) {
				System.out.println("Your dogs bark is " + string + "\n");
				correctBark = true;
			} else if (string.equals(bark.quiteBark())) {
				System.out.println("Your dogs bark is " + string + "\n");
				correctBark = true;
			} else {
				System.err.println("\nPlease select one of the options.");
			}
		}
	}
	public static void color() {
		
		boolean correctColor = false;
		
		System.out.println("Choose your dogs color. \n");
		
		while (correctColor == false) {
			
			System.out.println("Colors to choose from: \n");
			DogColor color = new DogColor();
			System.out.println(color.black());
			System.out.println(color.blue());
			System.out.println(color.brown());
			System.out.println(color.gray());
			System.out.println(color.green());
			System.out.println(color.purple());
			System.out.println(color.red());
			System.out.println(color.white());
			System.out.println(color.yellow());
			
			Scanner scan = new Scanner(System.in);
			String string = scan.nextLine();
			
			switch(string) {
			case "Black":
				System.out.println("Your dogs color is " + string);
				correctColor = true;
				break;
			case "Blue":
				System.out.println("Your dogs color is " + string);
				correctColor = true;
				break;
			case "Brown":
				System.out.println("Your dogs color is " + string);
				correctColor = true;
				break;
			case "Gray":
				System.out.println("Your dogs color is " + string);
				correctColor = true;
				break;
			case "Green":
				System.out.println("Your dogs color is " + string);
				correctColor = true;
				break;
			case "Purple":
				System.out.println("Your dogs color is " + string);
				correctColor = true;
				break;
			case "Red":
				System.out.println("Your dogs color is " + string);
				correctColor = true;
				break;
			case "White":
				System.out.println("Your dogs color is " + string);
				correctColor = true;
				break;
			case "Yellow":
				System.out.println("Your dogs color is " + string);
				correctColor = true;
				break;
			default:
				System.err.println("Error: Please choose one of the colors shown \n");
			}
		}
	}
}
