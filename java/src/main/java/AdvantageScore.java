public class AdvantageScore extends Score {

	private static final String ADVANTAGE_PREFIX = "Advantage ";

	public AdvantageScore(Player player1, Player player2) {
		super(player1, player2);
	}

	public String show() {
		return ADVANTAGE_PREFIX + getPlayerInAdvantage().getName();
	}

	private Player getPlayerInAdvantage() {
		if (isAdvantageForPlayer1()) return player1;
		return player2;
	}

	private Boolean isAdvantageForPlayer1() {
		return player1.getScore() - player2.getScore() == 1;
	}
}
