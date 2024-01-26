package ColorGame_Variable_Scopes;
import java.util.Random;
public class Game {
	
	Random random = new Random();
	int number = 0;
	
	public Game() {
		random = new Random();
		int number = 0;
		roll(random, number);
	}
	
	void roll(Random random, int number) {
		number = random.nextInt(6) + 1;
		displayColor(number);
	}
	
	void displayColor(int number) {
		switch (number) {
		case 1:
			System.out.println("Red");
			break;
		case 2:
			System.out.println("Blue");
			break;
		case 3:
			System.out.println("Green");
			break;
		case 4:
			System.out.println("Yellow");
			break;
		case 5:
			System.out.println("Orange");
			break;
		case 6:
			System.out.println("Purple");
			break;
		default:
			System.out.println("Invalid token");
			break;
		}
	}
	
	
}
