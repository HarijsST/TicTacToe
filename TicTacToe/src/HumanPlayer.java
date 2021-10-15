import java.util.Scanner;

public class HumanPlayer extends Board implements Player {
	public void makeMove() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Ievad�t g�jienu (1-9) ");
		
		int move = scan.nextInt();

		boolean result = checkMove(move, gameBoard);
		while (!result) {
			System.out.print("Nepareizi ievad�ts g�jiens. M��ini v�lreiz..." + "\n" + "Ievad�t g�jienu (1-9) ");
			move = scan.nextInt();
			result = checkMove(move, gameBoard);
		}

		System.out.println("Ievad�tais g�jiens : " + move);
		updateBoard(move, 1, gameBoard);
		
	}
}