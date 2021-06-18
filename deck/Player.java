package deck;

public class Player {

	String playerName;
	int turn;
	
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public int getTurn() {
		return turn;
	}
	public void setTurn(int turn) {
		this.turn = turn;
	}
	
	@Override
	public String toString() {
		return "Player [playerName=" + playerName + ", turn=" + turn + "]";
	}
	
}
