import java.util.Scanner;

public class HumanPlayer extends Board implements Player {
	public void makeMove() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Ievadît gâjienu (1-9) ");
		
		int move = scan.nextInt();

		boolean result = checkMove(move, gameBoard);
		while (!result) {
			System.out.print("Nepareizi ievadîts gâjiens. Mçìini vçlreiz..." + "\n" + "Ievadît gâjienu (1-9) ");
			move = scan.nextInt();
			result = checkMove(move, gameBoard);
		}

		System.out.println("Ievadîtais gâjiens : " + move);
		updateBoard(move, 1, gameBoard);
		
	}
}