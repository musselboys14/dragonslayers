
import java.util.*;

public class DragonSlayers {
	
	// Constants for attributes
	private static final int NONE = 0;
	private static final int MELEE = 1;
	private static final int RANGE = 2;
	private static final int BLACK = 3;
	private static final int WHITE = 4;
	private static final int EARTH = 5;
	private static final int WIND = 6;
	
	static Character one = null;
	static Character two = null;
	static Character three = null;
	static Character four = null;
	
	static Monster goblin = new Goblin();
	static Monster boar = new Boar();
	static Monster pixie = new Pixie();
	static Monster zombie = new Zombie();
	
	static Scanner reader = new Scanner(System.in);
	static Random randomizer = new Random();
	
	static Monster[] monsters = {goblin, boar, pixie, zombie};

	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);
		
		/*while(!gameOver)
		{*/
		
			System.out.println("Welcome to Dragon Slayers!");
			System.out.println("Your goal in this game is to make it through each stage");
			System.out.println("and get to the final boss.");
			System.out.println("Enter to continue...");
			reader.nextLine();
			
			System.out.println("You will begin by choosing your characters.");
			System.out.println("You can pick: ");
			
			System.out.print("One Knight or one Archer (K/A): ");
			String classOne = reader.nextLine();
			
			System.out.println("Both a Wizard and a Priest");
			
			System.out.print("And a Druid or a Shaman (D/S): ");
			String classTwo = reader.nextLine();
			
			if(classOne.equalsIgnoreCase("k"))
			{
				System.out.print("What name would you like to give your Knight? ");
				String name = reader.nextLine();
				one = new Knight(name);
			}else if(classOne.equalsIgnoreCase("a")){
				System.out.print("What name would you like to give your Archer? ");
				String name = reader.nextLine();
				one = new Archer(name);
			}
			System.out.print("What would you like to name your Wizard? ");
			String wizName = reader.nextLine();
			two = new Wizard(wizName);
			
			System.out.print("What would you like to name your Priest? ");
			String priestName = reader.nextLine();
			three = new Priest(priestName);
			
			if(classTwo.equalsIgnoreCase("d"))
			{
				System.out.print("What would you like to name your Druid? ");
				String name = reader.nextLine();
				four = new Druid(name);
			}else if(classTwo.equalsIgnoreCase("s")) {
				System.out.print("What would you like to name your Shaman? ");
				String name = reader.nextLine();
				four = new Shaman(name);
			}
			
			System.out.println();
			System.out.println("Your characters: ");
			
			System.out.println();
			System.out.println(one);
			
			System.out.println();
			System.out.println(two);
			
			System.out.println();
			System.out.println(three);
			
			System.out.println();
			System.out.println(four);
			
			System.out.println();
			System.out.print("Enter to continue...");
			reader.nextLine();
			System.out.println();
			
			Character[] players = {one, two, three, four};
			
			System.out.println("Your journey begins in a forest filled with goblins, pixies,");
			System.out.println("boars, and zombies.");
			System.out.println("The King's daughter has been taken by a dragon, ");
			System.out.println("and he asked you to go and retrieve her.");
			System.out.println();
			
			System.out.println("As you leave the castle, you find a fork in the road.");
			System.out.print("Do you go left or right? (L/R) ");
			String choiceOne = reader.nextLine();
			String directionOne = "";
			if(choiceOne.equalsIgnoreCase("l"))
			{
				directionOne = "left";
			}else {
				directionOne = "right";
			}
			
			int randomOne = randomizer.nextInt(4);
			
			System.out.println();
			System.out.println("You went " + directionOne + " and ran into a " + monsters[randomOne].getName() + ".");
			boolean playerWin = fight(monsters[randomOne], players);
			
			System.out.println("Jinkies! You see a dragon! ");
			System.out.println("What ever will you do? Will you");
			System.out.println("kneel? Or grab your sword (1 or 2)?");
			System.out.println("Or the");
			System.out.println("      s                            ");
			System.out.println("       e                           ");
			System.out.println("        c                          ");
			System.out.println("         r                         ");
			System.out.println("          e                        ");
			System.out.println("           t                       ");
			System.out.println("                                   ");
			System.out.println("             o                     ");
			System.out.println("              p                    ");
			System.out.println("               t                   ");
			System.out.println("                i                  ");
			System.out.println("                 o                 ");
			System.out.println("                  n                ");
			System.out.println("                   ?               ");
			String option = reader.nextLine();
			switch (option) {
			case "1":
				System.out.println("The Dragon roars in joy. \"You want to be friends??? After all my centuries of existance the only friend I had was the Princess. Very well, you shall com to my lair for tea.");
				System.out.println("Friendship Ending");
			case "2":
				System.out.println("The Dragon burns you to a crisp, and later eats you.");
				System.out.println("BBQ Ending");
			case "bzz":
				System.out.println("The Dragon Roars:");
				System.out.println("According to all known laws\r\n" + 
						"of aviation,\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"there is no way a bee\r\n" + 
						"should be able to fly.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Its wings are too small to get\r\n" + 
						"its fat little body off the ground.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"The bee, of course, flies anyway\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"because bees don't care\r\n" + 
						"what humans think is impossible.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Yellow, black. Yellow, black.\r\n" + 
						"Yellow, black. Yellow, black.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Ooh, black and yellow!\r\n" + 
						"Let's shake it up a little.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Barry! Breakfast is ready!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Ooming!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Hang on a second.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Hello?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- Barry?\r\n" + 
						"- Adam?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- Oan you believe this is happening?\r\n" + 
						"- I can't. I'll pick you up.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Looking sharp.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Use the stairs. Your father\r\n" + 
						"paid good money for those.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Sorry. I'm excited.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Here's the graduate.\r\n" + 
						"We're very proud of you, son.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"A perfect report card, all B's.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Very proud.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Ma! I got a thing going here.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- You got lint on your fuzz.\r\n" + 
						"- Ow! That's me!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- Wave to us! We'll be in row 118,000.\r\n" + 
						"- Bye!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Barry, I told you,\r\n" + 
						"stop flying in the house!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- Hey, Adam.\r\n" + 
						"- Hey, Barry.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- Is that fuzz gel?\r\n" + 
						"- A little. Special day, graduation.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Never thought I'd make it.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Three days grade school,\r\n" + 
						"three days high school.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Those were awkward.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Three days college. I'm glad I took\r\n" + 
						"a day and hitchhiked around the hive.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"You did come back different.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- Hi, Barry.\r\n" + 
						"- Artie, growing a mustache? Looks good.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- Hear about Frankie?\r\n" + 
						"- Yeah.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- You going to the funeral?\r\n" + 
						"- No, I'm not going.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Everybody knows,\r\n" + 
						"sting someone, you die.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Don't waste it on a squirrel.\r\n" + 
						"Such a hothead.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I guess he could have\r\n" + 
						"just gotten out of the way.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I love this incorporating\r\n" + 
						"an amusement park into our day.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"That's why we don't need vacations.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Boy, quite a bit of pomp...\r\n" + 
						"under the circumstances.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- Well, Adam, today we are men.\r\n" + 
						"- We are!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- Bee-men.\r\n" + 
						"- Amen!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Hallelujah!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Students, faculty, distinguished bees,\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"please welcome Dean Buzzwell.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Welcome, New Hive Oity\r\n" + 
						"graduating class of...\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"...9:15.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"That concludes our ceremonies.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"And begins your career\r\n" + 
						"at Honex Industries!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Will we pick ourjob today?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I heard it's just orientation.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Heads up! Here we go.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Keep your hands and antennas\r\n" + 
						"inside the tram at all times.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- Wonder what it'll be like?\r\n" + 
						"- A little scary.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Welcome to Honex,\r\n" + 
						"a division of Honesco\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"and a part of the Hexagon Group.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"This is it!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Wow.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Wow.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"We know that you, as a bee,\r\n" + 
						"have worked your whole life\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"to get to the point where you\r\n" + 
						"can work for your whole life.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Honey begins when our valiant Pollen\r\n" + 
						"Jocks bring the nectar to the hive.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Our top-secret formula\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"is automatically color-corrected,\r\n" + 
						"scent-adjusted and bubble-contoured\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"into this soothing sweet syrup\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"with its distinctive\r\n" + 
						"golden glow you know as...\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Honey!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- That girl was hot.\r\n" + 
						"- She's my cousin!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- She is?\r\n" + 
						"- Yes, we're all cousins.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- Right. You're right.\r\n" + 
						"- At Honex, we constantly strive\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"to improve every aspect\r\n" + 
						"of bee existence.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"These bees are stress-testing\r\n" + 
						"a new helmet technology.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- What do you think he makes?\r\n" + 
						"- Not enough.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Here we have our latest advancement,\r\n" + 
						"the Krelman.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- What does that do?\r\n" + 
						"- Oatches that little strand of honey\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"that hangs after you pour it.\r\n" + 
						"Saves us millions.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Oan anyone work on the Krelman?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Of course. Most bee jobs are\r\n" + 
						"small ones. But bees know\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"that every small job,\r\n" + 
						"if it's done well, means a lot.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"But choose carefully\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"because you'll stay in the job\r\n" + 
						"you pick for the rest of your life.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"The same job the rest of your life?\r\n" + 
						"I didn't know that.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"What's the difference?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"You'll be happy to know that bees,\r\n" + 
						"as a species, haven't had one day off\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"in 27 million years.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"So you'll just work us to death?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"We'll sure try.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Wow! That blew my mind!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"\"What's the difference?\"\r\n" + 
						"How can you say that?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"One job forever?\r\n" + 
						"That's an insane choice to have to make.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I'm relieved. Now we only have\r\n" + 
						"to make one decision in life.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"But, Adam, how could they\r\n" + 
						"never have told us that?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Why would you question anything?\r\n" + 
						"We're bees.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"We're the most perfectly\r\n" + 
						"functioning society on Earth.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"You ever think maybe things\r\n" + 
						"work a little too well here?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Like what? Give me one example.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I don't know. But you know\r\n" + 
						"what I'm talking about.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Please clear the gate.\r\n" + 
						"Royal Nectar Force on approach.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Wait a second. Oheck it out.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- Hey, those are Pollen Jocks!\r\n" + 
						"- Wow.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I've never seen them this close.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"They know what it's like\r\n" + 
						"outside the hive.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Yeah, but some don't come back.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- Hey, Jocks!\r\n" + 
						"- Hi, Jocks!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"You guys did great!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"You're monsters!\r\n" + 
						"You're sky freaks! I love it! I love it!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- I wonder where they were.\r\n" + 
						"- I don't know.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Their day's not planned.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Outside the hive, flying who knows\r\n" + 
						"where, doing who knows what.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"You can'tjust decide to be a Pollen\r\n" + 
						"Jock. You have to be bred for that.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Right.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Look. That's more pollen\r\n" + 
						"than you and I will see in a lifetime.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"It's just a status symbol.\r\n" + 
						"Bees make too much of it.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Perhaps. Unless you're wearing it\r\n" + 
						"and the ladies see you wearing it.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Those ladies?\r\n" + 
						"Aren't they our cousins too?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Distant. Distant.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Look at these two.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- Oouple of Hive Harrys.\r\n" + 
						"- Let's have fun with them.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"It must be dangerous\r\n" + 
						"being a Pollen Jock.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Yeah. Once a bear pinned me\r\n" + 
						"against a mushroom!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"He had a paw on my throat,\r\n" + 
						"and with the other, he was slapping me!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- Oh, my!\r\n" + 
						"- I never thought I'd knock him out.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"What were you doing during this?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Trying to alert the authorities.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I can autograph that.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"A little gusty out there today,\r\n" + 
						"wasn't it, comrades?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Yeah. Gusty.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"We're hitting a sunflower patch\r\n" + 
						"six miles from here tomorrow.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- Six miles, huh?\r\n" + 
						"- Barry!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"A puddle jump for us,\r\n" + 
						"but maybe you're not up for it.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- Maybe I am.\r\n" + 
						"- You are not!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"We're going 0900 at J-Gate.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"What do you think, buzzy-boy?\r\n" + 
						"Are you bee enough?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I might be. It all depends\r\n" + 
						"on what 0900 means.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Hey, Honex!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Dad, you surprised me.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"You decide what you're interested in?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- Well, there's a lot of choices.\r\n" + 
						"- But you only get one.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Do you ever get bored\r\n" + 
						"doing the same job every day?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Son, let me tell you about stirring.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"You grab that stick, and you just\r\n" + 
						"move it around, and you stir it around.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"You get yourself into a rhythm.\r\n" + 
						"It's a beautiful thing.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"You know, Dad,\r\n" + 
						"the more I think about it,\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"maybe the honey field\r\n" + 
						"just isn't right for me.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"You were thinking of what,\r\n" + 
						"making balloon animals?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"That's a bad job\r\n" + 
						"for a guy with a stinger.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Janet, your son's not sure\r\n" + 
						"he wants to go into honey!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- Barry, you are so funny sometimes.\r\n" + 
						"- I'm not trying to be funny.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"You're not funny! You're going\r\n" + 
						"into honey. Our son, the stirrer!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- You're gonna be a stirrer?\r\n" + 
						"- No one's listening to me!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Wait till you see the sticks I have.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I could say anything right now.\r\n" + 
						"I'm gonna get an ant tattoo!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Let's open some honey and celebrate!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Maybe I'll pierce my thorax.\r\n" + 
						"Shave my antennae.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Shack up with a grasshopper. Get\r\n" + 
						"a gold tooth and call everybody \"dawg\"!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I'm so proud.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- We're starting work today!\r\n" + 
						"- Today's the day.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Oome on! All the good jobs\r\n" + 
						"will be gone.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Yeah, right.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Pollen counting, stunt bee, pouring,\r\n" + 
						"stirrer, front desk, hair removal...\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- Is it still available?\r\n" + 
						"- Hang on. Two left!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"One of them's yours! Oongratulations!\r\n" + 
						"Step to the side.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- What'd you get?\r\n" + 
						"- Picking crud out. Stellar!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Wow!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Oouple of newbies?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Yes, sir! Our first day! We are ready!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Make your choice.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- You want to go first?\r\n" + 
						"- No, you go.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Oh, my. What's available?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Restroom attendant's open,\r\n" + 
						"not for the reason you think.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- Any chance of getting the Krelman?\r\n" + 
						"- Sure, you're on.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I'm sorry, the Krelman just closed out.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Wax monkey's always open.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"The Krelman opened up again.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"What happened?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"A bee died. Makes an opening. See?\r\n" + 
						"He's dead. Another dead one.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Deady. Deadified. Two more dead.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Dead from the neck up.\r\n" + 
						"Dead from the neck down. That's life!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Oh, this is so hard!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Heating, cooling,\r\n" + 
						"stunt bee, pourer, stirrer,\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"humming, inspector number seven,\r\n" + 
						"lint coordinator, stripe supervisor,\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"mite wrangler. Barry, what\r\n" + 
						"do you think I should... Barry?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Barry!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"All right, we've got the sunflower patch\r\n" + 
						"in quadrant nine...\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"What happened to you?\r\n" + 
						"Where are you?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- I'm going out.\r\n" + 
						"- Out? Out where?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- Out there.\r\n" + 
						"- Oh, no!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I have to, before I go\r\n" + 
						"to work for the rest of my life.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"You're gonna die! You're crazy! Hello?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Another call coming in.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"If anyone's feeling brave,\r\n" + 
						"there's a Korean deli on 83rd\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"that gets their roses today.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Hey, guys.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- Look at that.\r\n" + 
						"- Isn't that the kid we saw yesterday?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Hold it, son, flight deck's restricted.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"It's OK, Lou. We're gonna take him up.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Really? Feeling lucky, are you?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Sign here, here. Just initial that.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- Thank you.\r\n" + 
						"- OK.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"You got a rain advisory today,\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"and as you all know,\r\n" + 
						"bees cannot fly in rain.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"So be careful. As always,\r\n" + 
						"watch your brooms,\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"hockey sticks, dogs,\r\n" + 
						"birds, bears and bats.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Also, I got a couple of reports\r\n" + 
						"of root beer being poured on us.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Murphy's in a home because of it,\r\n" + 
						"babbling like a cicada!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- That's awful.\r\n" + 
						"- And a reminder for you rookies,\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"bee law number one,\r\n" + 
						"absolutely no talking to humans!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"All right, launch positions!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Buzz, buzz, buzz, buzz! Buzz, buzz,\r\n" + 
						"buzz, buzz! Buzz, buzz, buzz, buzz!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Black and yellow!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Hello!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"You ready for this, hot shot?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Yeah. Yeah, bring it on.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Wind, check.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- Antennae, check.\r\n" + 
						"- Nectar pack, check.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- Wings, check.\r\n" + 
						"- Stinger, check.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Scared out of my shorts, check.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"OK, ladies,\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"let's move it out!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Pound those petunias,\r\n" + 
						"you striped stem-suckers!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"All of you, drain those flowers!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Wow! I'm out!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I can't believe I'm out!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"So blue.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I feel so fast and free!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Box kite!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Wow!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Flowers!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"This is Blue Leader.\r\n" + 
						"We have roses visual.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Bring it around 30 degrees and hold.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Roses!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"30 degrees, roger. Bringing it around.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Stand to the side, kid.\r\n" + 
						"It's got a bit of a kick.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"That is one nectar collector!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- Ever see pollination up close?\r\n" + 
						"- No, sir.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I pick up some pollen here, sprinkle it\r\n" + 
						"over here. Maybe a dash over there,\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"a pinch on that one.\r\n" + 
						"See that? It's a little bit of magic.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"That's amazing. Why do we do that?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"That's pollen power. More pollen, more\r\n" + 
						"flowers, more nectar, more honey for us.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Oool.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I'm picking up a lot of bright yellow.\r\n" + 
						"Oould be daisies. Don't we need those?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Oopy that visual.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Wait. One of these flowers\r\n" + 
						"seems to be on the move.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Say again? You're reporting\r\n" + 
						"a moving flower?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Affirmative.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"That was on the line!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"This is the coolest. What is it?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I don't know, but I'm loving this color.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"It smells good.\r\n" + 
						"Not like a flower, but I like it.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Yeah, fuzzy.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Ohemical-y.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Oareful, guys. It's a little grabby.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"My sweet lord of bees!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Oandy-brain, get off there!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Problem!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- Guys!\r\n" + 
						"- This could be bad.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Affirmative.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Very close.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Gonna hurt.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Mama's little boy.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"You are way out of position, rookie!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Ooming in at you like a missile!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Help me!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I don't think these are flowers.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- Should we tell him?\r\n" + 
						"- I think he knows.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"What is this?!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Match point!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"You can start packing up, honey,\r\n" + 
						"because you're about to eat it!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Yowser!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Gross.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"There's a bee in the car!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- Do something!\r\n" + 
						"- I'm driving!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- Hi, bee.\r\n" + 
						"- He's back here!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"He's going to sting me!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Nobody move. If you don't move,\r\n" + 
						"he won't sting you. Freeze!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"He blinked!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Spray him, Granny!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"What are you doing?!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Wow... the tension level\r\n" + 
						"out here is unbelievable.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I gotta get home.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Oan't fly in rain.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Oan't fly in rain.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Oan't fly in rain.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Mayday! Mayday! Bee going down!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Ken, could you close\r\n" + 
						"the window please?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Ken, could you close\r\n" + 
						"the window please?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Oheck out my new resume.\r\n" + 
						"I made it into a fold-out brochure.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"You see? Folds out.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Oh, no. More humans. I don't need this.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"What was that?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Maybe this time. This time. This time.\r\n" + 
						"This time! This time! This...\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Drapes!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"That is diabolical.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"It's fantastic. It's got all my special\r\n" + 
						"skills, even my top-ten favorite movies.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"What's number one? Star Wars?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Nah, I don't go for that...\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"...kind of stuff.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"No wonder we shouldn't talk to them.\r\n" + 
						"They're out of their minds.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"When I leave a job interview, they're\r\n" + 
						"flabbergasted, can't believe what I say.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"There's the sun. Maybe that's a way out.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I don't remember the sun\r\n" + 
						"having a big 75 on it.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I predicted global warming.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I could feel it getting hotter.\r\n" + 
						"At first I thought it was just me.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Wait! Stop! Bee!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Stand back. These are winter boots.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Wait!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Don't kill him!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"You know I'm allergic to them!\r\n" + 
						"This thing could kill me!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Why does his life have\r\n" + 
						"less value than yours?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Why does his life have any less value\r\n" + 
						"than mine? Is that your statement?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I'm just saying all life has value. You\r\n" + 
						"don't know what he's capable of feeling.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"My brochure!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"There you go, little guy.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I'm not scared of him.\r\n" + 
						"It's an allergic thing.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Put that on your resume brochure.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"My whole face could puff up.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Make it one of your special skills.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Knocking someone out\r\n" + 
						"is also a special skill.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Right. Bye, Vanessa. Thanks.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- Vanessa, next week? Yogurt night?\r\n" + 
						"- Sure, Ken. You know, whatever.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- You could put carob chips on there.\r\n" + 
						"- Bye.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- Supposed to be less calories.\r\n" + 
						"- Bye.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I gotta say something.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"She saved my life.\r\n" + 
						"I gotta say something.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"All right, here it goes.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Nah.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"What would I say?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I could really get in trouble.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"It's a bee law.\r\n" + 
						"You're not supposed to talk to a human.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I can't believe I'm doing this.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I've got to.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Oh, I can't do it. Oome on!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"No. Yes. No.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Do it. I can't.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"How should I start it?\r\n" + 
						"\"You like jazz?\" No, that's no good.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Here she comes! Speak, you fool!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Hi!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I'm sorry.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- You're talking.\r\n" + 
						"- Yes, I know.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"You're talking!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I'm so sorry.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"No, it's OK. It's fine.\r\n" + 
						"I know I'm dreaming.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"But I don't recall going to bed.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Well, I'm sure this\r\n" + 
						"is very disconcerting.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"This is a bit of a surprise to me.\r\n" + 
						"I mean, you're a bee!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I am. And I'm not supposed\r\n" + 
						"to be doing this,\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"but they were all trying to kill me.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"And if it wasn't for you...\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I had to thank you.\r\n" + 
						"It's just how I was raised.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"That was a little weird.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- I'm talking with a bee.\r\n" + 
						"- Yeah.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I'm talking to a bee.\r\n" + 
						"And the bee is talking to me!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I just want to say I'm grateful.\r\n" + 
						"I'll leave now.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- Wait! How did you learn to do that?\r\n" + 
						"- What?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"The talking thing.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Same way you did, I guess.\r\n" + 
						"\"Mama, Dada, honey.\" You pick it up.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- That's very funny.\r\n" + 
						"- Yeah.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Bees are funny. If we didn't laugh,\r\n" + 
						"we'd cry with what we have to deal with.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Anyway...\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Oan I...\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"...get you something?\r\n" + 
						"- Like what?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I don't know. I mean...\r\n" + 
						"I don't know. Ooffee?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I don't want to put you out.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"It's no trouble. It takes two minutes.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- It's just coffee.\r\n" + 
						"- I hate to impose.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- Don't be ridiculous!\r\n" + 
						"- Actually, I would love a cup.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Hey, you want rum cake?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- I shouldn't.\r\n" + 
						"- Have some.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- No, I can't.\r\n" + 
						"- Oome on!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I'm trying to lose a couple micrograms.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- Where?\r\n" + 
						"- These stripes don't help.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"You look great!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I don't know if you know\r\n" + 
						"anything about fashion.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Are you all right?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"No.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"He's making the tie in the cab\r\n" + 
						"as they're flying up Madison.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"He finally gets there.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"He runs up the steps into the church.\r\n" + 
						"The wedding is on.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"And he says, \"Watermelon?\r\n" + 
						"I thought you said Guatemalan.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Why would I marry a watermelon?\"\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Is that a bee joke?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"That's the kind of stuff we do.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Yeah, different.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"So, what are you gonna do, Barry?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"About work? I don't know.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I want to do my part for the hive,\r\n" + 
						"but I can't do it the way they want.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I know how you feel.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- You do?\r\n" + 
						"- Sure.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"My parents wanted me to be a lawyer or\r\n" + 
						"a doctor, but I wanted to be a florist.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- Really?\r\n" + 
						"- My only interest is flowers.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Our new queen was just elected\r\n" + 
						"with that same campaign slogan.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Anyway, if you look...\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"There's my hive right there. See it?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"You're in Sheep Meadow!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Yes! I'm right off the Turtle Pond!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"No way! I know that area.\r\n" + 
						"I lost a toe ring there once.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- Why do girls put rings on their toes?\r\n" + 
						"- Why not?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- It's like putting a hat on your knee.\r\n" + 
						"- Maybe I'll try that.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- You all right, ma'am?\r\n" + 
						"- Oh, yeah. Fine.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Just having two cups of coffee!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Anyway, this has been great.\r\n" + 
						"Thanks for the coffee.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Yeah, it's no trouble.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Sorry I couldn't finish it. If I did,\r\n" + 
						"I'd be up the rest of my life.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Are you...?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Oan I take a piece of this with me?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Sure! Here, have a crumb.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- Thanks!\r\n" + 
						"- Yeah.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"All right. Well, then...\r\n" + 
						"I guess I'll see you around.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Or not.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"OK, Barry.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"And thank you\r\n" + 
						"so much again... for before.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Oh, that? That was nothing.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Well, not nothing, but... Anyway...\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"This can't possibly work.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"He's all set to go.\r\n" + 
						"We may as well try it.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"OK, Dave, pull the chute.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- Sounds amazing.\r\n" + 
						"- It was amazing!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"It was the scariest,\r\n" + 
						"happiest moment of my life.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Humans! I can't believe\r\n" + 
						"you were with humans!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Giant, scary humans!\r\n" + 
						"What were they like?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Huge and crazy. They talk crazy.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"They eat crazy giant things.\r\n" + 
						"They drive crazy.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- Do they try and kill you, like on TV?\r\n" + 
						"- Some of them. But some of them don't.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- How'd you get back?\r\n" + 
						"- Poodle.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"You did it, and I'm glad. You saw\r\n" + 
						"whatever you wanted to see.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"You had your \"experience.\" Now you\r\n" + 
						"can pick out yourjob and be normal.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- Well...\r\n" + 
						"- Well?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Well, I met someone.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"You did? Was she Bee-ish?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- A wasp?! Your parents will kill you!\r\n" + 
						"- No, no, no, not a wasp.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- Spider?\r\n" + 
						"- I'm not attracted to spiders.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I know it's the hottest thing,\r\n" + 
						"with the eight legs and all.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I can't get by that face.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"So who is she?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"She's... human.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"No, no. That's a bee law.\r\n" + 
						"You wouldn't break a bee law.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- Her name's Vanessa.\r\n" + 
						"- Oh, boy.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"She's so nice. And she's a florist!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Oh, no! You're dating a human florist!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"We're not dating.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"You're flying outside the hive, talking\r\n" + 
						"to humans that attack our homes\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"with power washers and M-80s!\r\n" + 
						"One-eighth a stick of dynamite!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"She saved my life!\r\n" + 
						"And she understands me.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"This is over!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Eat this.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"This is not over! What was that?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- They call it a crumb.\r\n" + 
						"- It was so stingin' stripey!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"And that's not what they eat.\r\n" + 
						"That's what falls off what they eat!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- You know what a Oinnabon is?\r\n" + 
						"- No.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"It's bread and cinnamon and frosting.\r\n" + 
						"They heat it up...\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Sit down!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"...really hot!\r\n" + 
						"- Listen to me!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"We are not them! We're us.\r\n" + 
						"There's us and there's them!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Yes, but who can deny\r\n" + 
						"the heart that is yearning?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"There's no yearning.\r\n" + 
						"Stop yearning. Listen to me!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"You have got to start thinking bee,\r\n" + 
						"my friend. Thinking bee!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- Thinking bee.\r\n" + 
						"- Thinking bee.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Thinking bee! Thinking bee!\r\n" + 
						"Thinking bee! Thinking bee!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"There he is. He's in the pool.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"You know what your problem is, Barry?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I gotta start thinking bee?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"How much longer will this go on?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"It's been three days!\r\n" + 
						"Why aren't you working?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I've got a lot of big life decisions\r\n" + 
						"to think about.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"What life? You have no life!\r\n" + 
						"You have no job. You're barely a bee!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Would it kill you\r\n" + 
						"to make a little honey?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Barry, come out.\r\n" + 
						"Your father's talking to you.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Martin, would you talk to him?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Barry, I'm talking to you!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"You coming?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Got everything?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"All set!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Go ahead. I'll catch up.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Don't be too long.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Watch this!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Vanessa!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- We're still here.\r\n" + 
						"- I told you not to yell at him.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"He doesn't respond to yelling!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- Then why yell at me?\r\n" + 
						"- Because you don't listen!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I'm not listening to this.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Sorry, I've gotta go.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- Where are you going?\r\n" + 
						"- I'm meeting a friend.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"A girl? Is this why you can't decide?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Bye.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I just hope she's Bee-ish.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"They have a huge parade\r\n" + 
						"of flowers every year in Pasadena?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"To be in the Tournament of Roses,\r\n" + 
						"that's every florist's dream!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Up on a float, surrounded\r\n" + 
						"by flowers, crowds cheering.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"A tournament. Do the roses\r\n" + 
						"compete in athletic events?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"No. All right, I've got one.\r\n" + 
						"How come you don't fly everywhere?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"It's exhausting. Why don't you\r\n" + 
						"run everywhere? It's faster.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Yeah, OK, I see, I see.\r\n" + 
						"All right, your turn.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"TiVo. You can just freeze live TV?\r\n" + 
						"That's insane!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"You don't have that?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"We have Hivo, but it's a disease.\r\n" + 
						"It's a horrible, horrible disease.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Oh, my.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Dumb bees!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"You must want to sting all those jerks.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"We try not to sting.\r\n" + 
						"It's usually fatal for us.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"So you have to watch your temper.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Very carefully.\r\n" + 
						"You kick a wall, take a walk,\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"write an angry letter and throw it out.\r\n" + 
						"Work through it like any emotion:\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Anger, jealousy, lust.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Oh, my goodness! Are you OK?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Yeah.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- What is wrong with you?!\r\n" + 
						"- It's a bug.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"He's not bothering anybody.\r\n" + 
						"Get out of here, you creep!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"What was that? A Pic 'N' Save circular?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Yeah, it was. How did you know?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"It felt like about 10 pages.\r\n" + 
						"Seventy-five is pretty much our limit.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"You've really got that\r\n" + 
						"down to a science.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- I lost a cousin to Italian Vogue.\r\n" + 
						"- I'll bet.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"What in the name\r\n" + 
						"of Mighty Hercules is this?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"How did this get here?\r\n" + 
						"Oute Bee, Golden Blossom,\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Ray Liotta Private Select?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- Is he that actor?\r\n" + 
						"- I never heard of him.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- Why is this here?\r\n" + 
						"- For people. We eat it.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"You don't have\r\n" + 
						"enough food of your own?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- Well, yes.\r\n" + 
						"- How do you get it?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- Bees make it.\r\n" + 
						"- I know who makes it!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"And it's hard to make it!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"There's heating, cooling, stirring.\r\n" + 
						"You need a whole Krelman thing!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- It's organic.\r\n" + 
						"- It's our-ganic!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"It's just honey, Barry.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Just what?!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Bees don't know about this!\r\n" + 
						"This is stealing! A lot of stealing!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"You've taken our homes, schools,\r\n" + 
						"hospitals! This is all we have!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"And it's on sale?!\r\n" + 
						"I'm getting to the bottom of this.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I'm getting to the bottom\r\n" + 
						"of all of this!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Hey, Hector.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- You almost done?\r\n" + 
						"- Almost.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"He is here. I sense it.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Well, I guess I'll go home now\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"and just leave this nice honey out,\r\n" + 
						"with no one around.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"You're busted, box boy!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I knew I heard something.\r\n" + 
						"So you can talk!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I can talk.\r\n" + 
						"And now you'll start talking!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Where you getting the sweet stuff?\r\n" + 
						"Who's your supplier?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I don't understand.\r\n" + 
						"I thought we were friends.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"The last thing we want\r\n" + 
						"to do is upset bees!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"You're too late! It's ours now!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"You, sir, have crossed\r\n" + 
						"the wrong sword!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"You, sir, will be lunch\r\n" + 
						"for my iguana, Ignacio!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Where is the honey coming from?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Tell me where!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Honey Farms! It comes from Honey Farms!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Orazy person!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"What horrible thing has happened here?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"These faces, they never knew\r\n" + 
						"what hit them. And now\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"they're on the road to nowhere!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Just keep still.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"What? You're not dead?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Do I look dead? They will wipe anything\r\n" + 
						"that moves. Where you headed?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"To Honey Farms.\r\n" + 
						"I am onto something huge here.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I'm going to Alaska. Moose blood,\r\n" + 
						"crazy stuff. Blows your head off!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I'm going to Tacoma.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- And you?\r\n" + 
						"- He really is dead.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"All right.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Uh-oh!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- What is that?!\r\n" + 
						"- Oh, no!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- A wiper! Triple blade!\r\n" + 
						"- Triple blade?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Jump on! It's your only chance, bee!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Why does everything have\r\n" + 
						"to be so doggone clean?!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"How much do you people need to see?!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Open your eyes!\r\n" + 
						"Stick your head out the window!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"From NPR News in Washington,\r\n" + 
						"I'm Oarl Kasell.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"But don't kill no more bugs!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- Bee!\r\n" + 
						"- Moose blood guy!!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- You hear something?\r\n" + 
						"- Like what?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Like tiny screaming.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Turn off the radio.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Whassup, bee boy?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Hey, Blood.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Just a row of honey jars,\r\n" + 
						"as far as the eye could see.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Wow!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I assume wherever this truck goes\r\n" + 
						"is where they're getting it.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I mean, that honey's ours.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- Bees hang tight.\r\n" + 
						"- We're all jammed in.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"It's a close community.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Not us, man. We on our own.\r\n" + 
						"Every mosquito on his own.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- What if you get in trouble?\r\n" + 
						"- You a mosquito, you in trouble.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Nobody likes us. They just smack.\r\n" + 
						"See a mosquito, smack, smack!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"At least you're out in the world.\r\n" + 
						"You must meet girls.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Mosquito girls try to trade up,\r\n" + 
						"get with a moth, dragonfly.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Mosquito girl don't want no mosquito.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"You got to be kidding me!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Mooseblood's about to leave\r\n" + 
						"the building! So long, bee!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- Hey, guys!\r\n" + 
						"- Mooseblood!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I knew I'd catch y'all down here.\r\n" + 
						"Did you bring your crazy straw?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"We throw it in jars, slap a label on it,\r\n" + 
						"and it's pretty much pure profit.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"What is this place?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"A bee's got a brain\r\n" + 
						"the size of a pinhead.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"They are pinheads!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Pinhead.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- Oheck out the new smoker.\r\n" + 
						"- Oh, sweet. That's the one you want.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"The Thomas 3000!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Smoker?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Ninety puffs a minute, semi-automatic.\r\n" + 
						"Twice the nicotine, all the tar.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"A couple breaths of this\r\n" + 
						"knocks them right out.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"They make the honey,\r\n" + 
						"and we make the money.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"\"They make the honey,\r\n" + 
						"and we make the money\"?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Oh, my!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"What's going on? Are you OK?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Yeah. It doesn't last too long.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Do you know you're\r\n" + 
						"in a fake hive with fake walls?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Our queen was moved here.\r\n" + 
						"We had no choice.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"This is your queen?\r\n" + 
						"That's a man in women's clothes!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"That's a drag queen!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"What is this?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Oh, no!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"There's hundreds of them!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Bee honey.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Our honey is being brazenly stolen\r\n" + 
						"on a massive scale!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"This is worse than anything bears\r\n" + 
						"have done! I intend to do something.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Oh, Barry, stop.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Who told you humans are taking\r\n" + 
						"our honey? That's a rumor.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Do these look like rumors?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"That's a conspiracy theory.\r\n" + 
						"These are obviously doctored photos.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"How did you get mixed up in this?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"He's been talking to humans.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- What?\r\n" + 
						"- Talking to humans?!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"He has a human girlfriend.\r\n" + 
						"And they make out!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Make out? Barry!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"We do not.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- You wish you could.\r\n" + 
						"- Whose side are you on?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"The bees!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I dated a cricket once in San Antonio.\r\n" + 
						"Those crazy legs kept me up all night.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Barry, this is what you want\r\n" + 
						"to do with your life?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I want to do it for all our lives.\r\n" + 
						"Nobody works harder than bees!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Dad, I remember you\r\n" + 
						"coming home so overworked\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"your hands were still stirring.\r\n" + 
						"You couldn't stop.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I remember that.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"What right do they have to our honey?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"We live on two cups a year. They put it\r\n" + 
						"in lip balm for no reason whatsoever!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Even if it's true, what can one bee do?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Sting them where it really hurts.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"In the face! The eye!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- That would hurt.\r\n" + 
						"- No.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Up the nose? That's a killer.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"There's only one place you can sting\r\n" + 
						"the humans, one place where it matters.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Hive at Five, the hive's only\r\n" + 
						"full-hour action news source.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"No more bee beards!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"With Bob Bumble at the anchor desk.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Weather with Storm Stinger.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Sports with Buzz Larvi.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"And Jeanette Ohung.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- Good evening. I'm Bob Bumble.\r\n" + 
						"- And I'm Jeanette Ohung.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"A tri-county bee, Barry Benson,\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"intends to sue the human race\r\n" + 
						"for stealing our honey,\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"packaging it and profiting\r\n" + 
						"from it illegally!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Tomorrow night on Bee Larry King,\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"we'll have three former queens here in\r\n" + 
						"our studio, discussing their new book,\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Olassy Ladies,\r\n" + 
						"out this week on Hexagon.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Tonight we're talking to Barry Benson.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Did you ever think, \"I'm a kid\r\n" + 
						"from the hive. I can't do this\"?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Bees have never been afraid\r\n" + 
						"to change the world.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"What about Bee Oolumbus?\r\n" + 
						"Bee Gandhi? Bejesus?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Where I'm from, we'd never sue humans.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"We were thinking\r\n" + 
						"of stickball or candy stores.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"How old are you?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"The bee community\r\n" + 
						"is supporting you in this case,\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"which will be the trial\r\n" + 
						"of the bee century.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"You know, they have a Larry King\r\n" + 
						"in the human world too.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"It's a common name. Next week...\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"He looks like you and has a show\r\n" + 
						"and suspenders and colored dots...\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Next week...\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Glasses, quotes on the bottom from the\r\n" + 
						"guest even though you just heard 'em.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Bear Week next week!\r\n" + 
						"They're scary, hairy and here live.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Always leans forward, pointy shoulders,\r\n" + 
						"squinty eyes, very Jewish.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"In tennis, you attack\r\n" + 
						"at the point of weakness!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"It was my grandmother, Ken. She's 81.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Honey, her backhand's a joke!\r\n" + 
						"I'm not gonna take advantage of that?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Quiet, please.\r\n" + 
						"Actual work going on here.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- Is that that same bee?\r\n" + 
						"- Yes, it is!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I'm helping him sue the human race.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- Hello.\r\n" + 
						"- Hello, bee.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"This is Ken.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Yeah, I remember you. Timberland, size\r\n" + 
						"ten and a half. Vibram sole, I believe.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Why does he talk again?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Listen, you better go\r\n" + 
						"'cause we're really busy working.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"But it's our yogurt night!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Bye-bye.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Why is yogurt night so difficult?!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"You poor thing.\r\n" + 
						"You two have been at this for hours!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Yes, and Adam here\r\n" + 
						"has been a huge help.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- Frosting...\r\n" + 
						"- How many sugars?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Just one. I try not\r\n" + 
						"to use the competition.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"So why are you helping me?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Bees have good qualities.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"And it takes my mind off the shop.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Instead of flowers, people\r\n" + 
						"are giving balloon bouquets now.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Those are great, if you're three.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"And artificial flowers.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- Oh, those just get me psychotic!\r\n" + 
						"- Yeah, me too.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Bent stingers, pointless pollination.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Bees must hate those fake things!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Nothing worse\r\n" + 
						"than a daffodil that's had work done.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Maybe this could make up\r\n" + 
						"for it a little bit.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- This lawsuit's a pretty big deal.\r\n" + 
						"- I guess.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"You sure you want to go through with it?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Am I sure? When I'm done with\r\n" + 
						"the humans, they won't be able\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"to say, \"Honey, I'm home,\"\r\n" + 
						"without paying a royalty!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"It's an incredible scene\r\n" + 
						"here in downtown Manhattan,\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"where the world anxiously waits,\r\n" + 
						"because for the first time in history,\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"we will hear for ourselves\r\n" + 
						"if a honeybee can actually speak.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"What have we gotten into here, Barry?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"It's pretty big, isn't it?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I can't believe how many humans\r\n" + 
						"don't work during the day.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"You think billion-dollar multinational\r\n" + 
						"food companies have good lawyers?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Everybody needs to stay\r\n" + 
						"behind the barricade.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- What's the matter?\r\n" + 
						"- I don't know, I just got a chill.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Well, if it isn't the bee team.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"You boys work on this?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"All rise! The Honorable\r\n" + 
						"Judge Bumbleton presiding.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"All right. Oase number 4475,\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Superior Oourt of New York,\r\n" + 
						"Barry Bee Benson v. the Honey Industry\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"is now in session.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Mr. Montgomery, you're representing\r\n" + 
						"the five food companies collectively?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"A privilege.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Mr. Benson... you're representing\r\n" + 
						"all the bees of the world?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I'm kidding. Yes, Your Honor,\r\n" + 
						"we're ready to proceed.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Mr. Montgomery,\r\n" + 
						"your opening statement, please.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Ladies and gentlemen of the jury,\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"my grandmother was a simple woman.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Born on a farm, she believed\r\n" + 
						"it was man's divine right\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"to benefit from the bounty\r\n" + 
						"of nature God put before us.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"If we lived in the topsy-turvy world\r\n" + 
						"Mr. Benson imagines,\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"just think of what would it mean.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I would have to negotiate\r\n" + 
						"with the silkworm\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"for the elastic in my britches!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Talking bee!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"How do we know this isn't some sort of\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"holographic motion-picture-capture\r\n" + 
						"Hollywood wizardry?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"They could be using laser beams!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Robotics! Ventriloquism!\r\n" + 
						"Oloning! For all we know,\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"he could be on steroids!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Mr. Benson?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Ladies and gentlemen,\r\n" + 
						"there's no trickery here.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I'm just an ordinary bee.\r\n" + 
						"Honey's pretty important to me.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"It's important to all bees.\r\n" + 
						"We invented it!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"We make it. And we protect it\r\n" + 
						"with our lives.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Unfortunately, there are\r\n" + 
						"some people in this room\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"who think they can take it from us\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"'cause we're the little guys!\r\n" + 
						"I'm hoping that, after this is all over,\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"you'll see how, by taking our honey,\r\n" + 
						"you not only take everything we have\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"but everything we are!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I wish he'd dress like that\r\n" + 
						"all the time. So nice!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Oall your first witness.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"So, Mr. Klauss Vanderhayden\r\n" + 
						"of Honey Farms, big company you have.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I suppose so.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I see you also own\r\n" + 
						"Honeyburton and Honron!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Yes, they provide beekeepers\r\n" + 
						"for our farms.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Beekeeper. I find that\r\n" + 
						"to be a very disturbing term.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I don't imagine you employ\r\n" + 
						"any bee-free-ers, do you?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- No.\r\n" + 
						"- I couldn't hear you.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- No.\r\n" + 
						"- No.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Because you don't free bees.\r\n" + 
						"You keep bees. Not only that,\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"it seems you thought a bear would be\r\n" + 
						"an appropriate image for a jar of honey.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"They're very lovable creatures.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Yogi Bear, Fozzie Bear, Build-A-Bear.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"You mean like this?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Bears kill bees!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"How'd you like his head crashing\r\n" + 
						"through your living room?!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Biting into your couch!\r\n" + 
						"Spitting out your throw pillows!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"OK, that's enough. Take him away.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"So, Mr. Sting, thank you for being here.\r\n" + 
						"Your name intrigues me.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- Where have I heard it before?\r\n" + 
						"- I was with a band called The Police.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"But you've never been\r\n" + 
						"a police officer, have you?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"No, I haven't.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"No, you haven't. And so here\r\n" + 
						"we have yet another example\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"of bee culture casually\r\n" + 
						"stolen by a human\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"for nothing more than\r\n" + 
						"a prance-about stage name.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Oh, please.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Have you ever been stung, Mr. Sting?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Because I'm feeling\r\n" + 
						"a little stung, Sting.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Or should I say... Mr. Gordon M. Sumner!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"That's not his real name?! You idiots!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Mr. Liotta, first,\r\n" + 
						"belated congratulations on\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"your Emmy win for a guest spot\r\n" + 
						"on ER in 2005.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Thank you. Thank you.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I see from your resume\r\n" + 
						"that you're devilishly handsome\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"with a churning inner turmoil\r\n" + 
						"that's ready to blow.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I enjoy what I do. Is that a crime?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Not yet it isn't. But is this\r\n" + 
						"what it's come to for you?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Exploiting tiny, helpless bees\r\n" + 
						"so you don't\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"have to rehearse\r\n" + 
						"your part and learn your lines, sir?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Watch it, Benson!\r\n" + 
						"I could blow right now!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"This isn't a goodfella.\r\n" + 
						"This is a badfella!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Why doesn't someone just step on\r\n" + 
						"this creep, and we can all go home?!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- Order in this court!\r\n" + 
						"- You're all thinking it!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Order! Order, I say!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- Say it!\r\n" + 
						"- Mr. Liotta, please sit down!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I think it was awfully nice\r\n" + 
						"of that bear to pitch in like that.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I think the jury's on our side.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Are we doing everything right, legally?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I'm a florist.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Right. Well, here's to a great team.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"To a great team!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Well, hello.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- Ken!\r\n" + 
						"- Hello.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I didn't think you were coming.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"No, I was just late.\r\n" + 
						"I tried to call, but... the battery.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I didn't want all this to go to waste,\r\n" + 
						"so I called Barry. Luckily, he was free.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Oh, that was lucky.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"There's a little left.\r\n" + 
						"I could heat it up.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Yeah, heat it up, sure, whatever.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"So I hear you're quite a tennis player.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I'm not much for the game myself.\r\n" + 
						"The ball's a little grabby.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"That's where I usually sit.\r\n" + 
						"Right... there.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Ken, Barry was looking at your resume,\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"and he agreed with me that eating with\r\n" + 
						"chopsticks isn't really a special skill.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"You think I don't see what you're doing?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I know how hard it is to find\r\n" + 
						"the rightjob. We have that in common.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Do we?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Bees have 100 percent employment,\r\n" + 
						"but we do jobs like taking the crud out.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"That's just what\r\n" + 
						"I was thinking about doing.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Ken, I let Barry borrow your razor\r\n" + 
						"for his fuzz. I hope that was all right.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I'm going to drain the old stinger.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Yeah, you do that.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Look at that.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"You know, I've just about had it\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"with your little mind games.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- What's that?\r\n" + 
						"- Italian Vogue.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Mamma mia, that's a lot of pages.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"A lot of ads.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Remember what Van said, why is\r\n" + 
						"your life more valuable than mine?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Funny, I just can't seem to recall that!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I think something stinks in here!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I love the smell of flowers.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"How do you like the smell of flames?!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Not as much.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Water bug! Not taking sides!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Ken, I'm wearing a Ohapstick hat!\r\n" + 
						"This is pathetic!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I've got issues!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Well, well, well, a royal flush!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- You're bluffing.\r\n" + 
						"- Am I?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Surf's up, dude!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Poo water!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"That bowl is gnarly.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Except for those dirty yellow rings!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Kenneth! What are you doing?!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"You know, I don't even like honey!\r\n" + 
						"I don't eat it!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"We need to talk!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"He's just a little bee!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"And he happens to be\r\n" + 
						"the nicest bee I've met in a long time!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Long time? What are you talking about?!\r\n" + 
						"Are there other bugs in your life?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"No, but there are other things bugging\r\n" + 
						"me in life. And you're one of them!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Fine! Talking bees, no yogurt night...\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"My nerves are fried from riding\r\n" + 
						"on this emotional roller coaster!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Goodbye, Ken.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"And for your information,\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I prefer sugar-free, artificial\r\n" + 
						"sweeteners made by man!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I'm sorry about all that.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I know it's got\r\n" + 
						"an aftertaste! I like it!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I always felt there was some kind\r\n" + 
						"of barrier between Ken and me.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I couldn't overcome it.\r\n" + 
						"Oh, well.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Are you OK for the trial?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I believe Mr. Montgomery\r\n" + 
						"is about out of ideas.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"We would like to call\r\n" + 
						"Mr. Barry Benson Bee to the stand.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Good idea! You can really see why he's\r\n" + 
						"considered one of the best lawyers...\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Yeah.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Layton, you've\r\n" + 
						"gotta weave some magic\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"with this jury,\r\n" + 
						"or it's gonna be all over.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Don't worry. The only thing I have\r\n" + 
						"to do to turn this jury around\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"is to remind them\r\n" + 
						"of what they don't like about bees.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- You got the tweezers?\r\n" + 
						"- Are you allergic?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Only to losing, son. Only to losing.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Mr. Benson Bee, I'll ask you\r\n" + 
						"what I think we'd all like to know.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"What exactly is your relationship\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"to that woman?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"We're friends.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- Good friends?\r\n" + 
						"- Yes.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"How good? Do you live together?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Wait a minute...\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Are you her little...\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"...bedbug?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I've seen a bee documentary or two.\r\n" + 
						"From what I understand,\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"doesn't your queen give birth\r\n" + 
						"to all the bee children?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- Yeah, but...\r\n" + 
						"- So those aren't your real parents!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- Oh, Barry...\r\n" + 
						"- Yes, they are!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Hold me back!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"You're an illegitimate bee,\r\n" + 
						"aren't you, Benson?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"He's denouncing bees!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Don't y'all date your cousins?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- Objection!\r\n" + 
						"- I'm going to pincushion this guy!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Adam, don't! It's what he wants!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Oh, I'm hit!!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Oh, lordy, I am hit!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Order! Order!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"The venom! The venom\r\n" + 
						"is coursing through my veins!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I have been felled\r\n" + 
						"by a winged beast of destruction!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"You see? You can't treat them\r\n" + 
						"like equals! They're striped savages!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Stinging's the only thing\r\n" + 
						"they know! It's their way!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- Adam, stay with me.\r\n" + 
						"- I can't feel my legs.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"What angel of mercy\r\n" + 
						"will come forward to suck the poison\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"from my heaving buttocks?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I will have order in this court. Order!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Order, please!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"The case of the honeybees\r\n" + 
						"versus the human race\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"took a pointed turn against the bees\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"yesterday when one of their legal\r\n" + 
						"team stung Layton T. Montgomery.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- Hey, buddy.\r\n" + 
						"- Hey.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- Is there much pain?\r\n" + 
						"- Yeah.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I...\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I blew the whole case, didn't I?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"It doesn't matter. What matters is\r\n" + 
						"you're alive. You could have died.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I'd be better off dead. Look at me.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"They got it from the cafeteria\r\n" + 
						"downstairs, in a tuna sandwich.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Look, there's\r\n" + 
						"a little celery still on it.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"What was it like to sting someone?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I can't explain it. It was all...\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"All adrenaline and then...\r\n" + 
						"and then ecstasy!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"All right.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"You think it was all a trap?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Of course. I'm sorry.\r\n" + 
						"I flew us right into this.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"What were we thinking? Look at us. We're\r\n" + 
						"just a couple of bugs in this world.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"What will the humans do to us\r\n" + 
						"if they win?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I don't know.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I hear they put the roaches in motels.\r\n" + 
						"That doesn't sound so bad.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Adam, they check in,\r\n" + 
						"but they don't check out!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Oh, my.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Oould you get a nurse\r\n" + 
						"to close that window?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- Why?\r\n" + 
						"- The smoke.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Bees don't smoke.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Right. Bees don't smoke.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Bees don't smoke!\r\n" + 
						"But some bees are smoking.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"That's it! That's our case!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"It is? It's not over?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Get dressed. I've gotta go somewhere.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Get back to the court and stall.\r\n" + 
						"Stall any way you can.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"And assuming you've done step correctly, you're ready for the tub.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Mr. Flayman.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Yes? Yes, Your Honor!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Where is the rest of your team?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Well, Your Honor, it's interesting.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Bees are trained to fly haphazardly,\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"and as a result,\r\n" + 
						"we don't make very good time.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I actually heard a funny story about...\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Your Honor,\r\n" + 
						"haven't these ridiculous bugs\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"taken up enough\r\n" + 
						"of this court's valuable time?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"How much longer will we allow\r\n" + 
						"these absurd shenanigans to go on?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"They have presented no compelling\r\n" + 
						"evidence to support their charges\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"against my clients,\r\n" + 
						"who run legitimate businesses.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I move for a complete dismissal\r\n" + 
						"of this entire case!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Mr. Flayman, I'm afraid I'm going\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"to have to consider\r\n" + 
						"Mr. Montgomery's motion.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"But you can't! We have a terrific case.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Where is your proof?\r\n" + 
						"Where is the evidence?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Show me the smoking gun!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Hold it, Your Honor!\r\n" + 
						"You want a smoking gun?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Here is your smoking gun.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"What is that?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"It's a bee smoker!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"What, this?\r\n" + 
						"This harmless little contraption?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"This couldn't hurt a fly,\r\n" + 
						"let alone a bee.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Look at what has happened\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"to bees who have never been asked,\r\n" + 
						"\"Smoking or non?\"\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Is this what nature intended for us?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"To be forcibly addicted\r\n" + 
						"to smoke machines\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"and man-made wooden slat work camps?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Living out our lives as honey slaves\r\n" + 
						"to the white man?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- What are we gonna do?\r\n" + 
						"- He's playing the species card.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Ladies and gentlemen, please,\r\n" + 
						"free these bees!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Free the bees! Free the bees!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Free the bees!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Free the bees! Free the bees!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"The court finds in favor of the bees!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Vanessa, we won!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I knew you could do it! High-five!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Sorry.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I'm OK! You know what this means?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"All the honey\r\n" + 
						"will finally belong to the bees.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Now we won't have\r\n" + 
						"to work so hard all the time.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"This is an unholy perversion\r\n" + 
						"of the balance of nature, Benson.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"You'll regret this.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Barry, how much honey is out there?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"All right. One at a time.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Barry, who are you wearing?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"My sweater is Ralph Lauren,\r\n" + 
						"and I have no pants.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- What if Montgomery's right?\r\n" + 
						"- What do you mean?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"We've been living the bee way\r\n" + 
						"a long time, 27 million years.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Oongratulations on your victory.\r\n" + 
						"What will you demand as a settlement?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"First, we'll demand a complete shutdown\r\n" + 
						"of all bee work camps.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Then we want back the honey\r\n" + 
						"that was ours to begin with,\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"every last drop.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"We demand an end to the glorification\r\n" + 
						"of the bear as anything more\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"than a filthy, smelly,\r\n" + 
						"bad-breath stink machine.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"We're all aware\r\n" + 
						"of what they do in the woods.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Wait for my signal.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Take him out.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"He'll have nauseous\r\n" + 
						"for a few hours, then he'll be fine.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"And we will no longer tolerate\r\n" + 
						"bee-negative nicknames...\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"But it's just a prance-about stage name!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"...unnecessary inclusion of honey\r\n" + 
						"in bogus health products\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"and la-dee-da human\r\n" + 
						"tea-time snack garnishments.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Oan't breathe.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Bring it in, boys!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Hold it right there! Good.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Tap it.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Mr. Buzzwell, we just passed three cups,\r\n" + 
						"and there's gallons more coming!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- I think we need to shut down!\r\n" + 
						"- Shut down? We've never shut down.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Shut down honey production!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Stop making honey!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Turn your key, sir!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"What do we do now?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Oannonball!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"We're shutting honey production!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Mission abort.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Aborting pollination and nectar detail.\r\n" + 
						"Returning to base.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Adam, you wouldn't believe\r\n" + 
						"how much honey was out there.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Oh, yeah?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"What's going on? Where is everybody?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- Are they out celebrating?\r\n" + 
						"- They're home.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"They don't know what to do.\r\n" + 
						"Laying out, sleeping in.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I heard your Uncle Oarl was on his way\r\n" + 
						"to San Antonio with a cricket.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"At least we got our honey back.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Sometimes I think, so what if humans\r\n" + 
						"liked our honey? Who wouldn't?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"It's the greatest thing in the world!\r\n" + 
						"I was excited to be part of making it.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"This was my new desk. This was my\r\n" + 
						"new job. I wanted to do it really well.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"And now...\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Now I can't.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I don't understand\r\n" + 
						"why they're not happy.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I thought their lives would be better!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"They're doing nothing. It's amazing.\r\n" + 
						"Honey really changes people.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"You don't have any idea\r\n" + 
						"what's going on, do you?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- What did you want to show me?\r\n" + 
						"- This.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"What happened here?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"That is not the half of it.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Oh, no. Oh, my.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"They're all wilting.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Doesn't look very good, does it?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"No.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"And whose fault do you think that is?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"You know, I'm gonna guess bees.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Bees?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Specifically, me.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I didn't think bees not needing to make\r\n" + 
						"honey would affect all these things.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"It's notjust flowers.\r\n" + 
						"Fruits, vegetables, they all need bees.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"That's our whole SAT test right there.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Take away produce, that affects\r\n" + 
						"the entire animal kingdom.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"And then, of course...\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"The human species?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"So if there's no more pollination,\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"it could all just go south here,\r\n" + 
						"couldn't it?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I know this is also partly my fault.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"How about a suicide pact?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"How do we do it?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- I'll sting you, you step on me.\r\n" + 
						"- Thatjust kills you twice.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Right, right.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Listen, Barry...\r\n" + 
						"sorry, but I gotta get going.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I had to open my mouth and talk.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Vanessa?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Vanessa? Why are you leaving?\r\n" + 
						"Where are you going?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"To the final Tournament of Roses parade\r\n" + 
						"in Pasadena.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"They've moved it to this weekend\r\n" + 
						"because all the flowers are dying.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"It's the last chance\r\n" + 
						"I'll ever have to see it.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Vanessa, I just wanna say I'm sorry.\r\n" + 
						"I never meant it to turn out like this.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I know. Me neither.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Tournament of Roses.\r\n" + 
						"Roses can't do sports.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Wait a minute. Roses. Roses?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Roses!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Vanessa!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Roses?!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Barry?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- Roses are flowers!\r\n" + 
						"- Yes, they are.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Flowers, bees, pollen!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I know.\r\n" + 
						"That's why this is the last parade.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Maybe not.\r\n" + 
						"Oould you ask him to slow down?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Oould you slow down?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Barry!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"OK, I made a huge mistake.\r\n" + 
						"This is a total disaster, all my fault.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Yes, it kind of is.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I've ruined the planet.\r\n" + 
						"I wanted to help you\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"with the flower shop.\r\n" + 
						"I've made it worse.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Actually, it's completely closed down.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I thought maybe you were remodeling.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"But I have another idea, and it's\r\n" + 
						"greater than my previous ideas combined.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I don't want to hear it!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"All right, they have the roses,\r\n" + 
						"the roses have the pollen.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I know every bee, plant\r\n" + 
						"and flower bud in this park.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"All we gotta do is get what they've got\r\n" + 
						"back here with what we've got.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- Bees.\r\n" + 
						"- Park.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- Pollen!\r\n" + 
						"- Flowers.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- Repollination!\r\n" + 
						"- Across the nation!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Tournament of Roses,\r\n" + 
						"Pasadena, Oalifornia.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"They've got nothing\r\n" + 
						"but flowers, floats and cotton candy.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Security will be tight.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I have an idea.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Vanessa Bloome, FTD.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Official floral business. It's real.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Sorry, ma'am. Nice brooch.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Thank you. It was a gift.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Once inside,\r\n" + 
						"we just pick the right float.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"How about The Princess and the Pea?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I could be the princess,\r\n" + 
						"and you could be the pea!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Yes, I got it.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- Where should I sit?\r\n" + 
						"- What are you?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- I believe I'm the pea.\r\n" + 
						"- The pea?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"It goes under the mattresses.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- Not in this fairy tale, sweetheart.\r\n" + 
						"- I'm getting the marshal.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"You do that!\r\n" + 
						"This whole parade is a fiasco!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Let's see what this baby'll do.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Hey, what are you doing?!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Then all we do\r\n" + 
						"is blend in with traffic...\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"...without arousing suspicion.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Once at the airport,\r\n" + 
						"there's no stopping us.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Stop! Security.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- You and your insect pack your float?\r\n" + 
						"- Yes.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Has it been\r\n" + 
						"in your possession the entire time?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Would you remove your shoes?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- Remove your stinger.\r\n" + 
						"- It's part of me.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I know. Just having some fun.\r\n" + 
						"Enjoy your flight.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Then if we're lucky, we'll have\r\n" + 
						"just enough pollen to do the job.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Oan you believe how lucky we are? We\r\n" + 
						"have just enough pollen to do the job!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I think this is gonna work.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"It's got to work.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Attention, passengers,\r\n" + 
						"this is Oaptain Scott.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"We have a bit of bad weather\r\n" + 
						"in New York.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"It looks like we'll experience\r\n" + 
						"a couple hours delay.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Barry, these are cut flowers\r\n" + 
						"with no water. They'll never make it.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I gotta get up there\r\n" + 
						"and talk to them.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Be careful.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Oan I get help\r\n" + 
						"with the Sky Mall magazine?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I'd like to order the talking\r\n" + 
						"inflatable nose and ear hair trimmer.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Oaptain, I'm in a real situation.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- What'd you say, Hal?\r\n" + 
						"- Nothing.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Bee!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Don't freak out! My entire species...\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"What are you doing?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- Wait a minute! I'm an attorney!\r\n" + 
						"- Who's an attorney?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Don't move.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Oh, Barry.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Good afternoon, passengers.\r\n" + 
						"This is your captain.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Would a Miss Vanessa Bloome in 24B\r\n" + 
						"please report to the cockpit?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"And please hurry!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"What happened here?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"There was a DustBuster,\r\n" + 
						"a toupee, a life raft exploded.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"One's bald, one's in a boat,\r\n" + 
						"they're both unconscious!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- Is that another bee joke?\r\n" + 
						"- No!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"No one's flying the plane!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"This is JFK control tower, Flight 356.\r\n" + 
						"What's your status?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"This is Vanessa Bloome.\r\n" + 
						"I'm a florist from New York.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Where's the pilot?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"He's unconscious,\r\n" + 
						"and so is the copilot.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Not good. Does anyone onboard\r\n" + 
						"have flight experience?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"As a matter of fact, there is.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- Who's that?\r\n" + 
						"- Barry Benson.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"From the honey trial?! Oh, great.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Vanessa, this is nothing more\r\n" + 
						"than a big metal bee.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"It's got giant wings, huge engines.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I can't fly a plane.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- Why not? Isn't John Travolta a pilot?\r\n" + 
						"- Yes.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"How hard could it be?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Wait, Barry!\r\n" + 
						"We're headed into some lightning.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"This is Bob Bumble. We have some\r\n" + 
						"late-breaking news from JFK Airport,\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"where a suspenseful scene\r\n" + 
						"is developing.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Barry Benson,\r\n" + 
						"fresh from his legal victory...\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"That's Barry!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"...is attempting to land a plane,\r\n" + 
						"loaded with people, flowers\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"and an incapacitated flight crew.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Flowers?!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"We have a storm in the area\r\n" + 
						"and two individuals at the controls\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"with absolutely no flight experience.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Just a minute.\r\n" + 
						"There's a bee on that plane.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I'm quite familiar with Mr. Benson\r\n" + 
						"and his no-account compadres.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"They've done enough damage.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"But isn't he your only hope?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Technically, a bee\r\n" + 
						"shouldn't be able to fly at all.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Their wings are too small...\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Haven't we heard this a million times?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"\"The surface area of the wings\r\n" + 
						"and body mass make no sense.\"\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- Get this on the air!\r\n" + 
						"- Got it.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- Stand by.\r\n" + 
						"- We're going live.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"The way we work may be a mystery to you.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Making honey takes a lot of bees\r\n" + 
						"doing a lot of small jobs.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"But let me tell you about a small job.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"If you do it well,\r\n" + 
						"it makes a big difference.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"More than we realized.\r\n" + 
						"To us, to everyone.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"That's why I want to get bees\r\n" + 
						"back to working together.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"That's the bee way!\r\n" + 
						"We're not made of Jell-O.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"We get behind a fellow.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- Black and yellow!\r\n" + 
						"- Hello!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Left, right, down, hover.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- Hover?\r\n" + 
						"- Forget hover.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"This isn't so hard.\r\n" + 
						"Beep-beep! Beep-beep!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Barry, what happened?!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Wait, I think we were\r\n" + 
						"on autopilot the whole time.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- That may have been helping me.\r\n" + 
						"- And now we're not!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"So it turns out I cannot fly a plane.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"All of you, let's get\r\n" + 
						"behind this fellow! Move it out!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Move out!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Our only chance is if I do what I'd do,\r\n" + 
						"you copy me with the wings of the plane!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Don't have to yell.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I'm not yelling!\r\n" + 
						"We're in a lot of trouble.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"It's very hard to concentrate\r\n" + 
						"with that panicky tone in your voice!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"It's not a tone. I'm panicking!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I can't do this!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Vanessa, pull yourself together.\r\n" + 
						"You have to snap out of it!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"You snap out of it.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"You snap out of it.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- You snap out of it!\r\n" + 
						"- You snap out of it!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- You snap out of it!\r\n" + 
						"- You snap out of it!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- You snap out of it!\r\n" + 
						"- You snap out of it!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- Hold it!\r\n" + 
						"- Why? Oome on, it's my turn.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"How is the plane flying?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I don't know.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Hello?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Benson, got any flowers\r\n" + 
						"for a happy occasion in there?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"The Pollen Jocks!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"They do get behind a fellow.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- Black and yellow.\r\n" + 
						"- Hello.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"All right, let's drop this tin can\r\n" + 
						"on the blacktop.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Where? I can't see anything. Oan you?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"No, nothing. It's all cloudy.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Oome on. You got to think bee, Barry.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- Thinking bee.\r\n" + 
						"- Thinking bee.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Thinking bee!\r\n" + 
						"Thinking bee! Thinking bee!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Wait a minute.\r\n" + 
						"I think I'm feeling something.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- What?\r\n" + 
						"- I don't know. It's strong, pulling me.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Like a 27-million-year-old instinct.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Bring the nose down.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Thinking bee!\r\n" + 
						"Thinking bee! Thinking bee!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- What in the world is on the tarmac?\r\n" + 
						"- Get some lights on that!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Thinking bee!\r\n" + 
						"Thinking bee! Thinking bee!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- Vanessa, aim for the flower.\r\n" + 
						"- OK.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Out the engines. We're going in\r\n" + 
						"on bee power. Ready, boys?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Affirmative!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Good. Good. Easy, now. That's it.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Land on that flower!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Ready? Full reverse!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Spin it around!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- Not that flower! The other one!\r\n" + 
						"- Which one?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- That flower.\r\n" + 
						"- I'm aiming at the flower!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"That's a fat guy in a flowered shirt.\r\n" + 
						"I mean the giant pulsating flower\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"made of millions of bees!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Pull forward. Nose down. Tail up.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Rotate around it.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- This is insane, Barry!\r\n" + 
						"- This's the only way I know how to fly.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Am I koo-koo-kachoo, or is this plane\r\n" + 
						"flying in an insect-like pattern?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Get your nose in there. Don't be afraid.\r\n" + 
						"Smell it. Full reverse!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Just drop it. Be a part of it.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Aim for the center!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Now drop it in! Drop it in, woman!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Oome on, already.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Barry, we did it!\r\n" + 
						"You taught me how to fly!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- Yes. No high-five!\r\n" + 
						"- Right.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Barry, it worked!\r\n" + 
						"Did you see the giant flower?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"What giant flower? Where? Of course\r\n" + 
						"I saw the flower! That was genius!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- Thank you.\r\n" + 
						"- But we're not done yet.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Listen, everyone!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"This runway is covered\r\n" + 
						"with the last pollen\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"from the last flowers\r\n" + 
						"available anywhere on Earth.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"That means this is our last chance.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"We're the only ones who make honey,\r\n" + 
						"pollinate flowers and dress like this.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"If we're gonna survive as a species,\r\n" + 
						"this is our moment! What do you say?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Are we going to be bees, orjust\r\n" + 
						"Museum of Natural History keychains?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"We're bees!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Keychain!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Then follow me! Except Keychain.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Hold on, Barry. Here.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"You've earned this.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Yeah!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I'm a Pollen Jock! And it's a perfect\r\n" + 
						"fit. All I gotta do are the sleeves.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Oh, yeah.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"That's our Barry.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Mom! The bees are back!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"If anybody needs\r\n" + 
						"to make a call, now's the time.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I got a feeling we'll be\r\n" + 
						"working late tonight!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Here's your change. Have a great\r\n" + 
						"afternoon! Oan I help who's next?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Would you like some honey with that?\r\n" + 
						"It is bee-approved. Don't forget these.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Milk, cream, cheese, it's all me.\r\n" + 
						"And I don't see a nickel!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Sometimes I just feel\r\n" + 
						"like a piece of meat!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I had no idea.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Barry, I'm sorry.\r\n" + 
						"Have you got a moment?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Would you excuse me?\r\n" + 
						"My mosquito associate will help you.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Sorry I'm late.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"He's a lawyer too?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I was already a blood-sucking parasite.\r\n" + 
						"All I needed was a briefcase.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Have a great afternoon!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Barry, I just got this huge tulip order,\r\n" + 
						"and I can't get them anywhere.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"No problem, Vannie.\r\n" + 
						"Just leave it to me.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"You're a lifesaver, Barry.\r\n" + 
						"Oan I help who's next?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"All right, scramble, jocks!\r\n" + 
						"It's time to fly.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Thank you, Barry!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"That bee is living my life!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Let it go, Kenny.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- When will this nightmare end?!\r\n" + 
						"- Let it all go.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- Beautiful day to fly.\r\n" + 
						"- Sure is.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Between you and me,\r\n" + 
						"I was dying to get out of that office.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"You have got\r\n" + 
						"to start thinking bee, my friend.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"- Thinking bee!\r\n" + 
						"- Me?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"Hold it. Let's just stop\r\n" + 
						"for a second. Hold it.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I'm sorry. I'm sorry, everyone.\r\n" + 
						"Oan we stop here?\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I'm not making a major life decision\r\n" + 
						"during a production number!\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"All right. Take ten, everybody.\r\n" + 
						"Wrap it up, guys.\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"I had virtually no rehearsal for that.");
							}
			
		//}
	}
	
	public static Monster generateMonster(int num)
	{
		switch (num) {
		case 0:
			return new Boar();
		case 1:
			return new Goblin();
		case 2:
			return new Pixie();
		default:
			return new Zombie();
		}
	}
	
	public static boolean fight(Monster monster, Character[] players)
	{

	boolean playerWin = false;
		Monster monsterOne = monster;
		Monster monsterTwo =  generateMonster(randomizer.nextInt(3));
		Monster monsterThree = generateMonster(randomizer.nextInt(3));
		Monster monsterFour = generateMonster(randomizer.nextInt(3));
		Monster[] monsterFight = {monsterOne, monsterTwo, monsterThree, monsterFour};
		
		System.out.println();
		System.out.println("Oh no! The " + monsterOne.getName() + " had a " + monsterTwo.getName() + ", a " + monsterThree.getName() + ", and a " + monsterFour.getName() + " with it!");
		System.out.print("Enter to continue...");
		reader.nextLine();
		System.out.println();
		
		int monsterSpeed = monsterOne.getSpeed() + monsterTwo.getSpeed() + monsterThree.getSpeed() + monsterFour.getSpeed();
		System.out.println("The monster team's speed: " + monsterSpeed);
		
		int playerSpeed = players[0].getSpeed() + players[1].getSpeed() + players[2].getSpeed() + players[3].getSpeed();
		System.out.println("Your team's speed: " + playerSpeed);
		System.out.println();
		
		boolean playerFirst = false;
		if(playerSpeed >= monsterSpeed)
		{
			System.out.println("Your team has more speed than the enemy team! You go first!");
			playerFirst = true;
		}
		else
		{
			System.out.println("The enemy team has more speed than your team! They go first!");
			playerFirst = false;
		}
		boolean fightOver = false;
		while(!fightOver)
		{
			if(playerFirst)
			{
				for(int i = 0; i < players.length; i++)
				{
					int deadPlayers = 0;
					checkDefense(players);
					if(!players[i].isDead())
					{
						System.out.println("You are attacking!");
						System.out.println();
						System.out.println(players[i]);
						System.out.println();
						System.out.print("Would you like to attack or defend? (A/D): ");
						String attOrDef = reader.nextLine();
						if(attOrDef.equalsIgnoreCase("a"))
						{
							System.out.print("Who would you like to attack? " + monsterOne.getName() + " (1), " + monsterTwo.getName() + " (2), " + monsterThree.getName() + " (3), or " + monsterFour.getName() + " (4)? ");
							String playerAtt = reader.nextLine();
							Monster currentMonster = null;
							int damage = 0;
							if(playerAtt.equals("1"))
							{
								damage = attackMonster(players[i], monsterOne);
								currentMonster = monsterOne;
							}
							else if(playerAtt.equals("2"))
							{
								damage = attackMonster(players[i], monsterTwo);
								currentMonster = monsterTwo;
							}
							else if(playerAtt.equals("3"))
							{
								damage = attackMonster(players[i], monsterThree);
								currentMonster = monsterThree;
							}
							else
							{
								damage = attackMonster(players[i], monsterFour);
								currentMonster = monsterFour;
							}
							currentMonster.damage(damage);
							System.out.println("You did " + damage + " damage to " + currentMonster.getName() + ".");
							System.out.print("Enter to continue...");
							reader.nextLine();
							System.out.println();
						} else {
							players[i].toggleDefend();
							System.out.println("You chose to defend! The enemy's next attack on you will do half damage! ");
						}
					}
					else
					{
						deadPlayers++;
						if(deadPlayers == 4)
						{
							fightOver = true;
							playerWin = false;
							break;
						}
					}
				}
				int deadMonsters = 0;
				for(int i = 0; i < monsterFight.length; i++)
				{
					
					if(!monsterFight[i].isDead())
					{
						System.out.println(monsterFight[i].getName() + " is attacking!");
						Character current = pickTarget(players);
						System.out.println(monsterFight[i].getName() + " is going to attack " + current.getName() + ".");
						int damage = attackPlayer(current, monsterFight[i]);
						System.out.println("The monster did " + damage + " damage to " + current.getName());
						current.damage(damage);
						System.out.println(current.getName() + " has " + current.getHealth() + " health reamining.");
						System.out.print("Enter to continue...");
						reader.nextLine();
						System.out.println();
					}
					else
					{
						deadMonsters++;
						if(deadMonsters == 4)
						{
							fightOver = true;
							playerWin = true;
							break;
						}
					}
				}
			}
			else
			{
				int deadMonsters = 0;
				for(int i = 0; i < monsterFight.length; i++)
				{
					boolean isdead = monsterFight[i].isDead();
					if(!isdead)
					{
						System.out.println(monsterFight[i].getName() + " is attacking!");
						Character current = pickTarget(players);
						System.out.println(monsterFight[i].getName() + " is going to attack " + current.getName() + ".");
						int damage = attackPlayer(current, monsterFight[i]);
						System.out.println("The monster did " + damage + " damage to " + current.getName());
						current.damage(damage);
						System.out.println(current.getName() + " has " + current.getHealth() + " health reamining.");
						System.out.print("Enter to continue...");
						reader.nextLine();
						System.out.println();
					}
					else
					{
						deadMonsters++;
						if(deadMonsters == 4)
						{
							fightOver = true;
							playerWin = true;
							break;
						}
					}
				}
				for(int i = 0; i < players.length; i++)
				{
					int deadPlayers = 0;
					checkDefense(players);
					if(!players[i].isDead())
					{
						System.out.println("You are attacking!");
						System.out.println();
						System.out.println(players[i]);
						System.out.println();
						System.out.print("Would you like to attack or defend? (A/D): ");
						String attOrDef = reader.nextLine();
						if(attOrDef.equalsIgnoreCase("a"))
						{
							System.out.print("Who would you like to attack? " + monsterOne.getName() + " (1), " + monsterTwo.getName() + " (2), " + monsterThree.getName() + " (3), or " + monsterFour.getName() + " (4)? ");
							String playerAtt = reader.nextLine();
							Monster currentMonster = null;
							int damage = 0;
							if(playerAtt.equals("1"))
							{
								damage = attackMonster(players[i], monsterOne);
								currentMonster = monsterOne;
							}
							else if(playerAtt.equals("2"))
							{
								damage = attackMonster(players[i], monsterTwo);
								currentMonster = monsterTwo;
							}
							else if(playerAtt.equals("3"))
							{
								damage = attackMonster(players[i], monsterThree);
								currentMonster = monsterThree;
							}
							else
							{
								damage = attackMonster(players[i], monsterFour);
								currentMonster = monsterFour;
							}
							currentMonster.damage(damage);
							System.out.println("You did " + damage + " damage to " + currentMonster.getName() + ".");
							System.out.print("Enter to continue...");
							reader.nextLine();
							System.out.println();
						} else {
							players[i].toggleDefend();
							System.out.println("You chose to defend! The enemy's next attack on you will do half damage! ");
						}
					}
					else
					{
						deadPlayers++;
						if(deadPlayers == 4)
						{
							fightOver = true;
							playerWin = false;
							break;
						}
					}
				}
			}
		}
		return playerWin;
	}
	
	public static void checkDefense(Character[] players)
	{
		for(int i = 0; i < players.length; i++)
		{
			if(players[i].isDefending());
			{
				players[i].toggleDefend();
			}
		}
	}
	
	public static int attackMonster(Character character, Monster monster)
	{
		int attack = character.getAttack();
		double defense = monster.getDefense() / 100;
		double damage = attack - (attack * (defense/2));
		
		return (int) damage;
	}
	
	public static int attackPlayer(Character character, Monster monster)
	{
		int attack = 0;
		double defense = 0;
		double damage = 0;
		if(!character.isDefending())
		{
			attack = monster.getAttack();
			defense = character.getDefense() / 100;
			damage = attack - (attack * (defense/2));
		}
		else
		{
			attack = monster.getAttack();
			defense = character.getDefense() / 100;
			damage = attack - (attack * (defense/2))/2;
			System.out.println("You defended and took half damage! ");
		}
		
		return (int) damage;
	}
	
	public static Character pickTarget(Character[] currentCharacters)
	{
		int cur = randomizer.nextInt(4);
		if(currentCharacters[cur].isDead())
		{
			while(currentCharacters[cur].isDead())
			{
				cur = randomizer.nextInt(4);
			}
		}
		return currentCharacters[cur];
	}
	
}
