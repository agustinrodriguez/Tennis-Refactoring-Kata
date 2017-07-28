import java.util.HashMap;
import java.util.Map;

public class TieScore extends Score {

	private static final String LOVE = "Love-All";
	private static final String FIFTEEN = "Fifteen-All";
	private static final String THIRTY = "Thirty-All";
	private static final String DEUCE = "Deuce";
	private Map<Integer, String> scoreTitles = new HashMap<Integer, String>();

	public TieScore(Player player1, Player player2) {
		super(player1, player2);
		scoreTitles.put(0, LOVE);
		scoreTitles.put(1, FIFTEEN);
		scoreTitles.put(2, THIRTY);
	}

	public String show() {
		if (player1.getScore() > 2)
			return DEUCE;

		return scoreTitles.get(player1.getScore());
	}
}
