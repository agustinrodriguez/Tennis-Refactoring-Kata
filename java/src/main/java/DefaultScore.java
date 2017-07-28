import java.util.HashMap;
import java.util.Map;

public class DefaultScore extends Score {

	private static final String LOVE = "Love";
	private static final String FIFTEEN = "Fifteen";
	private static final String THIRTY = "Thirty";
	private static final String FORTY = "Forty";
	private Map<Integer, String> scoreTitles = new HashMap<Integer, String>();

	public DefaultScore(Player player1, Player player2) {
		super(player1, player2);
		scoreTitles.put(0, LOVE);
		scoreTitles.put(1, FIFTEEN);
		scoreTitles.put(2, THIRTY);
		scoreTitles.put(3, FORTY);
	}

	@Override
	public String show() {
		return scoreTitleFromPlayer(player1) + "-" + scoreTitleFromPlayer(player2);
	}

	private String scoreTitleFromPlayer(Player player) {
		return scoreTitles.get(player.getScore());
	}
}
