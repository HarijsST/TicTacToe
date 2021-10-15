import java.util.Random;

public class ComputerPlayer extends Board implements Player {
	public void makeMove() {
		Random rand = new Random();
		int move = rand.nextInt(9) + 1;
		
		boolean result = checkMove(move, gameBoard);
		while(!result) {
			move = rand.nextInt(9) +1;
			result = checkMove(move, gameBoard);
		}
		System.out.println("CPU gâjiens : " + move);
		updateBoard(move, 2, gameBoard);
	}
}
