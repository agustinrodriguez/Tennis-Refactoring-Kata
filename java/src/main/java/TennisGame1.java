public class TennisGame1 implements TennisGame {

    private static final Integer INITIAL_SCORE = 0;
    private Player player1;
    private Player player2;

    public TennisGame1(String player1Name, String player2Name) {
        this.player1 = new Player(player1Name, INITIAL_SCORE);
        this.player2 = new Player(player2Name, INITIAL_SCORE);
    }

    public void wonPoint(String playerName) {
        playerWithName(playerName).wonPoint();
    }

    public String getScore() {
        if (isTied()) return new TieScore(player1, player2).show();
        if (isAdvantage()) return new AdvantageScore(player1, player2).show();
        if (areThereWinner()) return new WinnerScore(player1, player2).show();

        return new DefaultScore(player1, player2).show();
    }

    private Player playerWithName(String playerName) {
        if (player1.isCalled(playerName)) return player1;
        return player2;
    }

    private boolean areThereWinner() {
        return scoreIsAtLeast3Both() && (player1Won() || player2Won());
    }

    private boolean isAdvantage() {
        return scoreIsAtLeast3Both() && (isAdvantageForPlayer1() || isAdvantageForPlayer2());
    }

    private Boolean player1Won() {
        return player1.getScore()-player2.getScore()>=2;
    }

    private Boolean player2Won() {
        return player1.getScore()-player2.getScore()<=-2;
    }

    private Boolean isAdvantageForPlayer2() {
        return player1.getScore()-player2.getScore() == -1;
    }

    private Boolean isAdvantageForPlayer1() {
        return player1.getScore()-player2.getScore() == 1;
    }

    private Boolean scoreIsAtLeast3Both() {
        return player1.getScore()>=4 || player2.getScore()>=4;
    }

    private boolean isTied() {
        return player1.getScore() == player2.getScore();
    }
}
