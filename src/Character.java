
public abstract class Character {
	
	// Constants for attributes
	private static final int NONE = 0;
	private static final int MELEE = 1;
	private static final int RANGE = 2;
	private static final int BLACK = 3;
	private static final int WHITE = 4;
	private static final int EARTH = 5;
	private static final int WIND = 6;
	
	private static final String[] attributes = {"none", "melee", "range", "black", "white", "earth", "wind"};
	private static final int startingExp = 0;
	private static final int expIncrement = 100;
	
	private String name;
	private int attack;
	private int defense;
	private int speed;
	private int vitality;
	private int agility;
	private int luck;
	private int health;
	private int[] weaknesses = {NONE, NONE, NONE};
	private int[] strengths = {NONE, NONE, NONE};
	private int numWeaknesses;
	private int numStrengths;
	private int level;
	private int maxExp;
	private int currentExp;
	private boolean dead = false;
	private boolean defend = false;
	
	public Character(String name, int attack, int defense, int speed, int vitality, int agility, int luck, int strength, int weakness, int health)
	{
		this.name = name;
		this.attack = attack;
		this.defense = defense;
		this.speed = speed;
		this.vitality = vitality;
		this.agility = agility;
		this.luck = luck;
		this.health = health + vitality;
		strengths[0] = strength;
		weaknesses[0] = weakness;
		numWeaknesses = 1;
		numStrengths = 1;
		level = 1;
		currentExp = startingExp;
		maxExp = 100;
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
	
	public boolean isDefending()
	{
		return defend;
	}
	
	public void toggleDefend()
	{
		defend = !defend;
	}
	
	public boolean isDead()
	{
		return dead;
	}
	
	public void kill()
	{
		dead = true;
	}
	
	public int getHealth()
	{
		return health;
	}
	
	public void addHealth(int hp)
	{
		health += hp;
	}
	
	public void addLuck(int lck)
	{
		luck += lck;
	}
	
	public void addAgility(int agil)
	{
		agility += agil;
	}
	
	public void addVitality(int vit)
	{
		health += vit;
		vitality += vit;
		
	}
	
	public void addSpeed(int spd)
	{
		speed += spd;
	}
	
	public void addDefense(int def)
	{
		defense += def;
	}
	
	public void addAttack(int att)
	{
		attack += att;
	}
	
	public void addExp(int exp)
	{
		currentExp += exp;
	}
	
	public int getLevel()
	{
		return level;
	}
	
	public int getExp()
	{
		return currentExp;
	}
	
	public int getMaxExp()
	{
		return maxExp;
	}
	
	public void checkLevel()
	{
		while(currentExp >= maxExp)
		{
			currentExp -= maxExp;
			maxExp += expIncrement;
			level++;
		}
	}
	
	public void addStrength(int str)
	{
		if(numStrengths < 3)
		{
			strengths[numStrengths] = str;
			numStrengths++;
		}
	}
	
	public void addWeakness(int wkns)
	{
		if(numWeaknesses < 3)
		{
			weaknesses[numWeaknesses] = wkns;
			numWeaknesses++;
		}
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getAttack()
	{
		return attack;
	}
	
	public int getDefense()
	{
		return defense;
	}
	
	public int getSpeed()
	{
		return speed;
	}
	
	public int getVitality()
	{
		return vitality;
	}
	
	public int getAgility()
	{
		return agility;
	}
	
	public int getLuck()
	{
		return luck;
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
			if(i == 0 || i == 1)
			{
				cur += ", ";
			}
		}
		return cur;
	}
	
	public String toString()
	{
		return name + " has " + health + " health, " + attack + " attack, " + defense + " defense, " + speed + " speed, " + vitality + " vitality, " + agility + " agility, and " + luck + " luck. " + "\n"
				+ name + " has strengths: " + getStrengths() + " and weaknesses: " + getWeaknesses() + "." + "\n" 
				+ name + " is level " + level + " and has " + currentExp + "/" + maxExp + " experience.";
	}
}
