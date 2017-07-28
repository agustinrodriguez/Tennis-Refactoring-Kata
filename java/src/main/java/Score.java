public abstract class Score {

	protected final Player player1;
	protected final Player player2;

	public Score(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}

	public abstract String show();
}
