package model;

public class Game {
	
	private static final String name = "CHU-VA-CHI";
	
	private final Player[] players;
	
	private final Field field = new Field();

	public Game(Player[] players) {
		super();
		this.players = players;
	}

	public static String getName() {
		return name;
	}

	public Player[] getPlayers() {
		return players;
	}

	public Field getField() {
		return field;
	}
	
	
	

}
