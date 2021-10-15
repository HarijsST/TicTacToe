
public class Board {
	static char[][] gameBoard = { { ' ', '|', ' ', '|', ' ' }, { '-', '+', '-', '+', '-' }, { ' ', '|', ' ', '|', ' ' },
			{ '-', '+', '-', '+', '-' }, { ' ', '|', ' ', '|', ' ' } };

	public static void printBoard() {
		for (char[] row : gameBoard) {
			for (char c : row) {
				System.out.print(c);
			}
			System.out.println();
		}
	}

	public static void updateBoard(int position, int player, char[][] gameBoard) {
		char character;

		if (player == 1) {
			character = 'X';
		} else {
			character = '0';
		}

		switch (position) {
		case 1:
			gameBoard[0][0] = character;
			printBoard();
			break;
		case 2:
			gameBoard[0][2] = character;
			printBoard();
			break;
		case 3:
			gameBoard[0][4] = character;
			printBoard();
			break;
		case 4:
			gameBoard[2][0] = character;
			printBoard();
			break;
		case 5:
			gameBoard[2][2] = character;
			printBoard();
			break;
		case 6:
			gameBoard[2][4] = character;
			printBoard();
			break;
		case 7:
			gameBoard[4][0] = character;
			printBoard();
			break;
		case 8:
			gameBoard[4][2] = character;
			printBoard();
			break;
		case 9:
			gameBoard[4][4] = character;
			printBoard();
			break;
		}
	}

	public boolean checkMove(int move, char[][] gameBoard) {
		switch (move) {
		case 1:
			if (gameBoard[0][0] == ' ') {
				return true;
			} else {
				return false;
			}
		case 2:
			if (gameBoard[0][2] == ' ') {
				return true;
			} else {
				return false;
			}
		case 3:
			if (gameBoard[0][4] == ' ') {
				return true;
			} else {
				return false;
			}
		case 4:
			if (gameBoard[2][0] == ' ') {
				return true;
			} else {
				return false;
			}
		case 5:
			if (gameBoard[2][2] == ' ') {
				return true;
			} else {
				return false;
			}
		case 6:
			if (gameBoard[2][4] == ' ') {
				return true;
			} else {
				return false;
			}
		case 7:
			if (gameBoard[4][0] == ' ') {
				return true;
			} else {
				return false;
			}
		case 8:
			if (gameBoard[4][2] == ' ') {
				return true;
			} else {
				return false;
			}
		case 9:
			if (gameBoard[4][4] == ' ') {
				return true;
			} else {
				return false;
			}
		default:
			return false;
		}
	}
	
	public static boolean gameOver() {
		// Horizontal line
		if(gameBoard[0][0] == 'X' && gameBoard[0][2] == 'X' && gameBoard[0][4] == 'X') {
			System.out.println("Spçlçtâjs uzvar!");
			return true;
		}
		if(gameBoard[0][0] == '0' && gameBoard[0][2] == '0' && gameBoard[0][4] == '0') {
			System.out.println("CPU uzvar!");
			return true;
		}
		if(gameBoard[2][0] == 'X' && gameBoard[2][2] == 'X' && gameBoard[2][4] == 'X') {
			System.out.println("Spçlçtâjs uzvar!");
			return true;
		}
		if(gameBoard[2][0] == '0' && gameBoard[2][2] == '0' && gameBoard[2][4] == '0') {
			System.out.println("CPU uzvar!");
			return true;
		}
		if(gameBoard[4][0] == 'X' && gameBoard[4][2] == 'X' && gameBoard[4][4] == 'X') {
			System.out.println("Spçlçtâjs uzvar!");
			return true;
		}
		if(gameBoard[4][0] == '0' && gameBoard[4][2] == '0' && gameBoard[4][4] == '0') {
			System.out.println("CPU uzvar!");
			return true;
		}
		//Vertical line
		if(gameBoard[0][0] == 'X' && gameBoard[2][0] == 'X' && gameBoard[4][0] == 'X') {
			System.out.println("Spçlçtâjs uzvar!");
			return true;
		}
		if(gameBoard[0][0] == '0' && gameBoard[2][0] == '0' && gameBoard[4][0] == '0') {
			System.out.println("CPU uzvar!");
			return true;
		}
		if(gameBoard[0][2] == 'X' && gameBoard[2][2] == 'X' && gameBoard[4][2] == 'X') {
			System.out.println("Spçlçtâjs uzvar!");
			return true;
		}
		if(gameBoard[0][2] == '0' && gameBoard[2][2] == '0' && gameBoard[4][2] == '0') {
			System.out.println("CPU uzvar!");
			return true;
		}
		if(gameBoard[0][4] == 'X' && gameBoard[2][4] == 'X' && gameBoard[4][4] == 'X') {
			System.out.println("Spçlçtâjs uzvar!");
			return true;
		}
		if(gameBoard[0][4] == '0' && gameBoard[2][4] == '0' && gameBoard[4][4] == '0') {
			System.out.println("CPU uzvar!");
			return true;
		}
		// Diagonal line
		if(gameBoard[0][0] == 'X' && gameBoard[2][2] == 'X' && gameBoard[4][4] == 'X') {
			System.out.println("Spçlçtâjs uzvar!");
			return true;
		}
		if(gameBoard[0][0] == '0' && gameBoard[2][2] == '0' && gameBoard[4][4] == '0') {
			System.out.println("CPU uzvar!");
			return true;
		}
		if(gameBoard[0][4] == 'X' && gameBoard[2][2] == 'X' && gameBoard[4][0] == 'X') {
			System.out.println("Spçlçtâjs uzvar!");
			return true;
		}
		if(gameBoard[0][4] == '0' && gameBoard[2][2] == '0' && gameBoard[4][0] == '0') {
			System.out.println("CPU uzvar!");
			return true;
		}
		return false;	
	}
}
