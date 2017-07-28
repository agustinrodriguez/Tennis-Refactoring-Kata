public class Player {

	private String name;
	private Integer score;

	public Player(String name, Integer score) {
		this.name = name;
		this.score = score;
	}

	public void wonPoint() {
		score++;
	}

	public Boolean isCalled(String playerName) {
		return this.name.equals(playerName);
	}

	public Integer getScore() {
		return score;
	}

	public String getName() {
		return name;
	}
}
