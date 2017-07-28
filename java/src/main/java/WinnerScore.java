public class WinnerScore extends Score {

	private static final String WIN_PREFIX = "Win for ";

	public WinnerScore(Player player1, Player player2) {
		super(player1, player2);
	}

	public String show() {
		return WIN_PREFIX + getWinner().getName();
	}

	private Player getWinner() {
		if (player1Won()) return player1;
		return player2;
	}

	private Boolean player1Won() {
		return player1.getScore() - player2.getScore() >= 2;
	}
}
