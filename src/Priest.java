
public class Priest extends Character {

	// Constants for attributes
	private static final int NONE = 0;
	private static final int MELEE = 1;
	private static final int RANGE = 2;
	private static final int BLACK = 3;
	private static final int WHITE = 4;
	private static final int EARTH = 5;
	private static final int WIND = 6;

	private static final int lowValue = 5;
	private static final int midValue = 10;
	private static final int highValue = 15;
	
	public Priest(String name)
	{
		super(name, lowValue, midValue, highValue, lowValue, midValue, highValue, BLACK, MELEE, 15);
	}
	
}
