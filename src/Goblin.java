
public class Goblin extends Monster {

	// Constants for attributes
	private static final int NONE = 0;
	private static final int MELEE = 1;
	private static final int RANGE = 2;
	private static final int BLACK = 3;
	private static final int WHITE = 4;
	private static final int EARTH = 5;
	private static final int WIND = 6;
	
	public Goblin()
	{
		super("Goblin", 12, 12, 5, 17, 5, 6, 15);
		super.setStrengths(MELEE, NONE, NONE, NONE);
		super.setWeaknesses(EARTH, BLACK, WHITE);
	}
	
}
