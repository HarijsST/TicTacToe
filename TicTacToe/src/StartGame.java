
public class StartGame extends Board {

	public static void main(String[] args) {
		HumanPlayer hp = new HumanPlayer();
		ComputerPlayer cp = new ComputerPlayer();
		boolean gameOver = false;

		while (!gameOver) {
			hp.makeMove();
			gameOver = gameOver();
			if (gameOver) {
				break;
			}

			cp.makeMove();
			gameOver = gameOver();
			if (gameOver) {
				break;
			}
		}
	}
}
