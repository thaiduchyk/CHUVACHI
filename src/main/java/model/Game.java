package model;

public class Game {
	
	private static final String name = "CHU-VA-CHI";
	
	private final Player[] players;
	
	private final Field field;

	public Game(Player[] players, Field field) {
		super();
		this.players = players;
		this.field = field;
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
