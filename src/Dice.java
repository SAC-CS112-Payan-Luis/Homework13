import java.util.Random;

public class Dice {
	int numOfDice = 0;
	int valueOfRoll = 0;
	String history = "";

	public Dice(int amount) {
		numOfDice = amount;
	}
	public void SetDices(int amount) {
		numOfDice = amount;
	}

	public int roll() {
		Random random = new Random();
		valueOfRoll = random.nextInt(numOfDice * 6) + 1;
		history = history + valueOfRoll;
		return valueOfRoll;
	}

	public int ValueOfRoll() {
		return valueOfRoll;
	}

	public String history() {
		return history;

	}

	@Override
	public String toString() {
		return "SetDiceClass [getClass()=" + ", toString()=" + super.toString() + "]";
	}
}










