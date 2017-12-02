
public abstract class Monster {

	// Constants for attributes
	private static final int NONE = 0;
	private static final int MELEE = 1;
	private static final int RANGE = 2;
	private static final int BLACK = 3;
	private static final int WHITE = 4;
	private static final int EARTH = 5;
	private static final int WIND = 6;
	
	private static final String[] attributes = {"none", "melee", "range", "black", "white", "earth", "wind"};
	
	private int[] weaknesses = {NONE, NONE, NONE};
	private int[] strengths = {NONE, NONE, NONE, NONE};
	private String name;
	private int attack;
	private int defense;
	private int speed;
	private int agility;
	private int luck;
	private int level;
	private int vitality;
	private int health;
	private boolean dead = false;
	
	public Monster(String name, int attack, int defense, int speed, int agility, int luck, int vitality, int health)
	{
		this.name = name;
		this.attack = attack;
		this.defense = defense;
		this.speed = speed;
		this.agility = agility;
		this.luck = luck;
		this.vitality = vitality;
		this.health = health + vitality;
	}
	
	public void setName()
	{
		name = "dead";
	}
	
	public void damage(int damage)
	{
		health -= damage;
		if(health <= 0)
		{
			health = 0;
			kill();
		}
	}
	
	public boolean isDead()
	{
		return dead;
	}
	
	public void kill()
	{
		dead = true;
		setName();
	}
	
	public int getHealth()
	{
		return health;
	}
	
	public int getVitality()
	{
		return vitality;
	}

	public String getName()
	{
		return name;
	}
	
	public void setLevel(int level)
	{
		this.level = level;
	}
	
	public int getLevel()
	{
		return level;
	}
	
	public int getLuck()
	{
		return luck;
	}
	
	public int getAgility()
	{
		return agility;
	}
	
	public int getSpeed()
	{
		return speed;
	}
	
	public int getDefense()
	{
		return defense;
	}
	
	public int getAttack()
	{
		return attack;
	}
	
	public void setStrengths(int strOne, int strTwo, int strThree, int strFour)
	{
		strengths[0] = strOne;
		strengths[1] = strTwo;
		strengths[2] = strThree;
		strengths[3] = strFour;
	}
	
	public void setWeaknesses(int weakOne, int weakTwo, int weakThree)
	{
		weaknesses[0] = weakOne;
		weaknesses[1] = weakTwo;
		weaknesses[2] = weakThree;
	}
	
	public String getWeaknesses()
	{
		String cur = "";
		for(int i = 0; i < weaknesses.length; i++)
		{
			cur += attributes[weaknesses[i]];
			if(i == 0 || i == 1)
			{
				cur += ", ";
			}
		}
		return cur;
	}
	
	public String getStrengths()
	{
		String cur = "";
		for(int i = 0; i < strengths.length; i++)
		{
			cur += attributes[strengths[i]];
			if(i == 0 || i == 1 || i == 2)
			{
				cur += ", ";
			}
		}
		return cur;
	}
	
	public String toString()
	{
		return name + " has " + health + " health, " + attack + " attack, " + defense + " defense, " + speed + " speed, " + agility + " agility, " + vitality + " vitality, and " + luck + " luck." + "\n" 
				+ name + " has strengths: " + getStrengths() + " and weaknesses: " + getWeaknesses() + ".";
	}
}
