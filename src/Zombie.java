
public class Zombie extends Monster {

	// Constants for attributes
	private static final int NONE = 0;
	private static final int MELEE = 1;
	private static final int RANGE = 2;
	private static final int BLACK = 3;
	private static final int WHITE = 4;
	private static final int EARTH = 5;
	private static final int WIND = 6;
	
	public Zombie()
	{
		super("Zombie", 16, 5, 5, 14, 14, 12, 15);
		super.setStrengths(BLACK, NONE, NONE, NONE);
		super.setWeaknesses(WHITE, WIND, MELEE);
	}
	
}
