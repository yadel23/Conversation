import java.util.Scanner;

public class Conversation {

	public static void main(String[] args) {
		Scanner keyboardInput = new Scanner(System.in);
		System.out.println("Hi, my name is Alex, what's your name?");
		String name = keyboardInput.nextLine();
		System.out.println("Nice to meet you " + name + "!");
		System.out.println("Do you like online school?");
		String answer = keyboardInput.nextLine();
		if (answer.equals("No")) {
			System.out.println("Same! I miss my podium. :(");
		} else {
			System.out.println("I do not miss parking in North Lot.");
		}

	}

}
