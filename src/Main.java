import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		String input = ""; 

		int num = 0;
		int answer = 0;
		TrippleDice threedice = new TrippleDice(4);
		TrippleDice1 threediceE = new TrippleDice1(4);
		threedice.toString();
		threediceE.toString();
		threediceE.Throw();
		threediceE.Throw();
		threediceE.Throw();
		threediceE.Throw();
		do {
			System.out.println("Please enter the number of dice you would like? (you may enter q to quit)");
			Scanner scanner = new Scanner(System.in); // to read in user's input
			input = scanner.nextLine();
			if (input.toLowerCase().equals("q")) {
				break;
			}
			try {
				num = Integer.parseInt(input);
			} catch (Exception e) {
				System.out.println("That's not a number, please try again.");
				continue;
			}
			Dice dice = new Dice(num);
			answer = dice.roll();

			do {
				System.out.println("Please guess a number: ");
				num = scanner.nextInt();
			} while (num != answer); 
		} while (true);

	}
}