
public class Pixie extends Monster {

	// Constants for attributes
	private static final int NONE = 0;
	private static final int MELEE = 1;
	private static final int RANGE = 2;
	private static final int BLACK = 3;
	private static final int WHITE = 4;
	private static final int EARTH = 5;
	private static final int WIND = 6;
	
	public Pixie()
	{
		super("Pixie", 5, 5, 20, 20, 15, 8, 15);
		super.setWeaknesses(RANGE, MELEE, NONE);
		super.setStrengths(NONE, NONE, NONE , NONE);
	}
	
}
