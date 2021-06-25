package trisenaii;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.lang.Thread;
import java.util.Scanner;
import java.util.Random;

class pubstatints {
  public static String invitems;
  public static String currentweapon;
  public static int location;
  public static boolean successornot;
}

class createFile extends Thread {
  public void run() {
	  File inv = new File("inventory.txt");
	  File weapon = new File("weapon.txt");
      try {
    	if (inv.exists() == false) {
    		inv.createNewFile();
    	}
    	if (weapon.exists() == false) {
    		weapon.createNewFile();
    	}
		if (inv.exists() && weapon.exists()) {
		    pubstatints.successornot = true;
		} else {
			pubstatints.successornot = false;
		}
	} catch (IOException e) {}
  }
    /*
     * String heavystick = "Heavy stick"; String policebaton = "Police baton";
     * String wackywhacker = "Wacky whacker"; String velociraptortooth =
     * "Velociraptor tooth"; String woodensword = "Wooden sword"; String ironsword =
     * "Iron sword"; String streetmagicianwand = "Street magician wand"; String
     * magestaff = "Mage staff"; String houdinisscepter = "Houdini's scepter";
     * String damagedcable = "Damaged cable"; String lightningrod = "Lightning rod";
     * String zeuslightningbolt = "Zeus' lightning bolt"; try { FileWriter newWriter
     * = new FileWriter("inventory.txt"); newWriter.close(); } catch (Exception e)
     * {}
     */
}

class menu extends Thread {
  public void run() {
    Scanner anytimeObj = new Scanner(System.in);
    for (int i = 10; i > 0;) {
      String typeanytime = anytimeObj.nextLine();
      if (typeanytime.equals("Quit")) {
        break;
      }
      if (typeanytime.equals("Menu")) {
        System.out.println("\n");
        System.out.println("Menu:");
        try {
          File inv = new File("inventory.txt");
          Scanner newReader = new Scanner(inv);
          File weapon = new File("weapon.txt");
          Scanner anothernewReader = new Scanner(weapon);
          System.out.println("Items in inventory:");
          while (newReader.hasNextLine()) {
            pubstatints.invitems = newReader.nextLine();
            System.out.println(pubstatints.invitems);
          }
          newReader.close();
          System.out.println("Current weapon:");
          while (anothernewReader.hasNextLine()) {
        	  pubstatints.currentweapon = anothernewReader.nextLine();
        	  System.out.println(pubstatints.currentweapon);
          }
          anothernewReader.close();
          switch (pubstatints.location) {
          case 0:
            System.out.println("Location: Outside your house (Tutorial).");
            break;
          case 1:
            System.out.println("Location: Reo-Nonepre.");
            break;
          case 2:
            System.out.println("Location: Wilderness.");
            break;
          case 3:
            System.out.println("Location: Yevvinir.");
            break;
          case 4:
            System.out.println("Location: Dareuth.");
            break;
          }
        } catch (FileNotFoundException e) {
        }
      } else {
        System.out.println("Error: User input not recognized. Do you mean: 'Menu'?");
      }
    } // for ends here
  }
}

public class TrisenaiiClass extends Thread {
  public static void main(String[] args) throws Exception {
	{
		File inv = new File("inventory.txt");
		File weapon = new File("weapon.txt");
		inv.delete();
		weapon.delete();
	}
    createFile cf = new createFile();
    menu mnu = new menu();
    cf.start();
    System.out.print("\033[H\033[2J");
    System.out.print("Loading...");
    int dotcount = 0;
    for (;!pubstatints.successornot == true;) {
    	Thread.sleep(1500);
    	System.out.print(".");
    	dotcount = dotcount + 1;
    	if (dotcount > 10) {
    		System.out.println("Oops, something went wrong. The game's taking too much time to load. Please try restarting the program.");
    		Thread.sleep(999999999);
    	}
    }
    System.out.println();
    Thread.sleep(1000);
    System.out.print("\033[H\033[2J");
    System.out.println(" __    __  __  __    ___   ___          __   _____  ___   _____        __   __    __  ___  __    __    ___     ___  ___  ");
    Thread.sleep(800);
    System.out.println("/ / /\\ \\ \\/__\\/ /   / __\\ /___\\/\\/\\    /__\\ /__   \\/___\\ /__   \\/\\  /\\/__\\ / / /\\ \\ \\/___\\/__\\  / /   /   \\   /___\\/ __\\");
    Thread.sleep(800);
    System.out.println("\\ \\/  \\/ /_\\ / /   / /   //  //    \\  /_\\     / /\\//  //   / /\\/ /_/ /_\\   \\ \\/  \\/ //  // \\// / /   / /\\ /  //  // _\\  ");
    Thread.sleep(800);
    System.out.println(" \\  /\\  //__/ /___/ /___/ \\_// /\\/\\ \\//__    / / / \\_//   / / / __  //__    \\  /\\  / \\_// _  \\/ /___/ /_//  / \\_// /    ");
    Thread.sleep(800);
    System.out.println("  \\/  \\/\\__/\\____/\\____/\\___/\\/    \\/\\__/    \\/  \\___/    \\/  \\/ /_/\\__/     \\/  \\/\\___/\\/ \\_/\\____/___,'   \\___/\\/     ");
    Thread.sleep(4000);
    System.out.println(" _____  __   _____  __    __    __  _     _____ _____ ");
    System.out.println("/__   \\/__\\  \\_   \\/ _\\  /__\\/\\ \\ \\/_\\    \\_   \\\\_   \\");
    System.out.println("  / /\\/ \\//   / /\\/\\ \\  /_\\ /  \\/ //_\\\\    / /\\/ / /\\/");
    System.out.println(" / / / _  \\/\\/ /_  _\\ \\//__/ /\\  /  _  \\/\\/ /_/\\/ /_  ");
    System.out.println(" \\/  \\/ \\_/\\____/  \\__/\\__/\\_\\ \\/\\_/ \\_/\\____/\\____/  ");
    Scanner newObj = new Scanner(System.in);
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println("                                             Type 'Play' to continue.");
    String start = newObj.nextLine();
    String Play = "Play";
    if (start.equals(Play)) {
      System.out.print("\033[H\033[2J");
      System.out.println("You wake to the sound of someone banging on your door.");
      pubstatints.location = 0;
    } else {
      while (!start.equals(Play)) {
        System.out.println("Error: User input not recognized. Try again?");
        start = newObj.nextLine();
      }
      System.out.print("\033[H\033[2J");
      System.out.println("You wake to the sound of someone banging on your door.");
      pubstatints.location = 0;
    }
    Thread.sleep(3000);
    System.out.println("You yawn, stretch, get dressed, and open the door.");
    Thread.sleep(4500);
    System.out.println("Whoever was knocking on your door is gone. There is a note taped to the door, however.");
    Thread.sleep(4500);
    System.out.println("The note reads: ATTENTION, CITIZEN. You've been awoken at this untimely hour to report immediately at the town hall for a town meeting. Make haste!");
    Thread.sleep(8000);
    System.out.println("There's something on the back, too. You flip the paper over. The back reads: TUTORIAL TIME!");
    Thread.sleep(4500);
    System.out.println("Betcha didn't see that coming.");
    Thread.sleep(3000);
    System.out.println("Okay, let's just get this over with. We'll start off with the different types of text you'll see displayed.");
    Thread.sleep(6000);
    System.out.println("When you see text like this sentence, it means I, the narrator, am either telling you something or am describing you.");
    Thread.sleep(4500);
    System.out.println("Example 1:");
    Thread.sleep(4000);
    System.out.println("You grab the sword.");
    Thread.sleep(4000);
    System.out.println("Example 2:");
    Thread.sleep(4000);
    System.out.println("I don't think you have a good chance of survival.");
    Thread.sleep(4000);
    System.out.println("(The example ended. This and the stuff that I'll say after isn't part of it.)");
    Thread.sleep(4500);
    System.out.println("When NPCs talk, it will be a bit different from when I'm talking to you. First off, you'll be able to tell who is talking by their name, which will be in front of whatever they say. Also, everything that they say will be enclosed in brackets. P.S. some people won't have names, they'll just be called 'Man' or something.");
    Thread.sleep(7000);
    System.out.println("Example:");
    Thread.sleep(4000);
    System.out.println("Farmer Mike: <bruh.>");
    Thread.sleep(4000);
    System.out.println("Now let's get started on decisions. Throughout the game, you'll be presented with a few choices about what to do in a situation. You'll have to type in the choice that you choose. When you have options to talk to NPCs, to get out of the situation, type 'Walk' to walk away.");
    Thread.sleep(6000);
    System.out.println("Example:");
    Thread.sleep(4000);
    System.out.println("You arrive at Berryblood Street, Lichalade. Looks like there's a few people about.");
    Thread.sleep(4000);
    System.out.println("                                            			Actions:");                                            			
    System.out.println("Talk to man               Talk to other man               Talk to woman            Talk to other woman            Walk");
    boolean done = false;
    Scanner tutorialObj = new Scanner(System.in);
    while (done == false) {
      String tutorialexample = tutorialObj.nextLine();
      if (tutorialexample.equals("Walk")) { // walk
        System.out.println("You walk past the people.");
        done = true;
      } else if (tutorialexample.equals("Talk to man")) {// man
        System.out.println("Man: <Welcome, stranger!>");
      } else if (tutorialexample.equals("Talk to other man")) {// talktootherman
        System.out.println("Other man: <What 'r you lookin' at?>");
      } else if (tutorialexample.equals("Talk to woman")) {// woman
        System.out.println("Woman: <Nice weather, isn't it?>");
      } else if (tutorialexample.equals("Talk to other woman")) {// otherwoman
        System.out.println("Other woman: <Tutorials sure are stupid, aren't they? They always treat you like you're five and it's your first videogame.>");
      } else { // wrong
        System.out.println("Error: User input not recognized. Try again?");
        System.out.println("                                            			Actions:");                                            			
        System.out.println("Talk to man               Talk to other man               Talk to woman            Talk to other woman            Walk");
      }
    }
    Thread.sleep(4000);
    System.out.println("Let's talk about the menu now. The menu contains important information that you may want to know about your character. For example, if you want to check to see what's in your inventory, you can type in 'Menu' to go to the menu and see what's in it. To close the menu, just type in 'Quit'. You can open the menu at any point in the game. Now, you try opening the menu.");
    mnu.start();
    mnu.join();
    System.out.println("Finally, we arrive at the fun part: BATTLES! To discuss that, however, we have to go over weapons. All weapons have a primary attack and a secondary attack (except clubs, which just have a primary attack). Primary attacks deal damage, while secondary attacks can be pretty much anything, from increasing attacking damage, to blocking enenmy attacks. The status effects that secondary attacks give you usually just last for a turn or two.");
    Thread.sleep(23000);
    System.out.println("There are 4 different classes of weapons.");
    System.out.println("First weapon class: Clubs. These only deal damage, and have no secondary attacks. The damage they do deal, however, is the most of any weapon class.");
    Thread.sleep(9000);
    System.out.println("Second weapon class: Swords. Their primary attacks deal damage, and their secondary attacks block enemy attacks, which lowers the amount of damage an enemy deals to you.");
    Thread.sleep(9000);
    System.out.println("Third weapon class: Magic weapons. Their primary attacks deal damage. Unlike the other weapon class, the secondary attacks for these change from weapon to weapon. For example, one magic weapon's secondary attack might be leeching an enemy's health, while another's would be, well, different from that.");
    Thread.sleep(14000);
    System.out.println("Fourth and final weapon class: Electric weapons. Their primary attacks deal damage and chain damage to other enemies if there are more than one. Their secondary attacks deal damage to every enemy after some amount of turns.");
    Thread.sleep(12000);
    System.out.println("This tutorial's already gone on for long enough. Let's end this by pitting you against an Olbap, a pretty common enemy in the game. Which starter weapon do you choose to use to fight against it and use in the game until you find a better weapon? (You can always switch weapon types. For example, just because you picked the starter sword right now doesn't mean you can't use electric weapons later on.)");
    Thread.sleep(21000);
    System.out.println("                     			Weapons:");
    System.out.println("Heavy stick (club)     Velociraptor tooth (sword)     Street magician wand (magic weapon)    Damaged cable (electric weapon)");
    System.out.println("Type in the name of the weapon you choose. Don't type in the weapon class it belongs to, just the name of it. For example, just type in 'Damaged cable' if you choose that weapon.");
    FileWriter newWriter = new FileWriter("inventory.txt", true);
    boolean exitforloop = false;
    Scanner startwponObj = new Scanner(System.in);
    String startwponpick = startwponObj.nextLine();
    for (; !exitforloop;) {
      exitforloop = true;
      switch (startwponpick) {
      case "Heavy stick":
        System.out.println("Your starter weapon: Heavy stick");
        newWriter.write("Heavy stick");
        newWriter.write("\n");
        newWriter.close();
        break;
      case "Velociraptor tooth":
        System.out.println("Your starter weapon: Velociraptor tooth");
        newWriter.write("Velociraptor tooth");
        newWriter.write("\n");
        newWriter.close();
        break;
      case "Street magician wand":
        System.out.println("Your starter weapon: Street magician wand");
        newWriter.write("Street magician wand");
        newWriter.write("\n");
        newWriter.close();
        break;
      case "Damaged cable":
        System.out.println("Your starter weapon: Damaged cable");
        newWriter.write("Damaged cable");
        newWriter.write("\n");
        newWriter.close();
        break;
      default:
        exitforloop = false;
        for (; !startwponpick.equals("Heavy stick") && !startwponpick.equals("Velociraptor tooth")
            && !startwponpick.equals("Street magician wand") && !startwponpick.equals("Damaged cable");) {
          System.out.println("Error: User input not recognized. Try again?");
          startwponpick = startwponObj.nextLine();
        }
      }
    } // exitforloop end
    System.out.println("Battle time!");
    Thread.sleep(4000);
    System.out.print("\033[H\033[2J");
    int olbaphealth = 80;
    int yourhealth = 100;
    int money = 0;
    System.out.println("Enemy Olbap health: " + olbaphealth);
    System.out.println("Your health: " + yourhealth);
    System.out.println("Your turn:");
    switch (startwponpick) {
    case "Heavy stick":
      System.out.println("Primary attack: Heavy hit[20-30 damage dealt]");
      break;
    case "Velociraptor tooth":
      System.out.println("Primary attack: Vicious slice[20-25 damage dealt]   Secondary attack: Block[1/4 less damage taken from enemy attacks, lasts for 2 turns, cooldown is 1 turn]");
      break;
    case "Street magician wand":
      System.out.println("Primary attack: Health goes poof[18-22 damage dealt]    Secondary attack: Leech[+8-10 health per attack, lasts for 3 turns, cooldown is 2 turns]");
      break;
    case "Damaged cable":
      System.out.println("Primary attack: Electric shock[12-18 damage dealt, 5-10 damage chained to other enemies]    Secondary attack: Charging up [Two turns after the attack is used, 30 damage will be dealt to every enemy, cooldown is 3 turns]");
      break;
    }
    System.out.println("To do a primary attack or secondary attack, type in its name. Don't type in the damage it deals or how long it lasts, just the name.");
    Scanner tutrlbttlObj = new Scanner(System.in);
    String tutrlbttl = tutrlbttlObj.nextLine();
    Random rng1 = new Random();
    int yourdmgeheavystick = rng1.nextInt(10) + 20;
    Random rng = new Random();
    int olbapattckdmgehs = rng.nextInt(18) + 5;
    Random rng2 = new Random();
    int yourdmgevelotth = rng2.nextInt(5) + 20;
    Random rng3 = new Random();
    int olbapattckdmgevt = rng3.nextInt(18) + 5;
    int olbapdcreasedmgebruh = olbapattckdmgevt/4;
    int olbapdcreasedmge = olbapattckdmgevt - olbapdcreasedmgebruh;
    Random rng4 = new Random();
    int yourdmgestrtmagwnd = rng4.nextInt(4) + 18;
    int olbapattckdmgesmw = rng4.nextInt(18) + 5;
    int yourhealthincr = rng4.nextInt(2) + 8;
    Random rng5 = new Random();
    int yourdmgedcable = rng5.nextInt(6) + 12;
    int olbapattckdmgedcable = rng5.nextInt(18) + 5;
    boolean winornot = false;
    switch (tutrlbttl) {
    case "Heavy hit":
      yourdmgeheavystick = rng1.nextInt(10) + 20;
      Thread.sleep(1000);
      System.out.println("You dealt " + yourdmgeheavystick + " damage to the enemy Olbap.");
      olbaphealth = olbaphealth - yourdmgeheavystick;
      System.out.println("Enemy Olbap health: " + olbaphealth);
      for (; olbaphealth > 0 && yourhealth > 0;) {
        olbapattckdmgehs = rng.nextInt(18) + 5;
        Thread.sleep(2000);
        System.out.println("You took " + olbapattckdmgehs + " damage from the enemy Olbap.");
        yourhealth = yourhealth - olbapattckdmgehs;
        System.out.println("Your health: " + yourhealth);
        Thread.sleep(2000);
        System.out.println("Your turn:");
        System.out.println("Primary attack: Heavy hit[20-30 damage dealt]");
        tutrlbttl = tutrlbttlObj.nextLine();
        if (tutrlbttl.equals("Heavy hit")) {
          yourdmgeheavystick = rng1.nextInt(10) + 20;
          System.out.println("You dealt " + yourdmgeheavystick + " damage to the enemy Olbap.");
          olbaphealth = olbaphealth - yourdmgeheavystick;
          System.out.println("Enemy Olbap health: " + olbaphealth);
          continue;
        } else {
          for (; !tutrlbttl.equals("Heavy hit");) {
            System.out.println("Error: User input not recognized. Try again?");
            tutrlbttl = tutrlbttlObj.nextLine();
          }
        }
        yourdmgeheavystick = rng.nextInt(10) + 20;
        System.out.println("You dealt " + yourdmgeheavystick + " damage to the enemy Olbap.");
        olbaphealth = olbaphealth - yourdmgeheavystick;
        System.out.println("Enemy Olbap health: " + olbaphealth);
      } // end for (;olbaphealth > 0 && yourhealth > 0;)
      if (olbaphealth <= 0) {
        money = money + 15;
        System.out.println("You won the battle and rid the world of one wicked Olbap! Rewards: $15");
        System.out.println("Current amount of money: " +  money);
        winornot = true;
      }
      if (yourhealth <= 0) {
        System.out.println("You lost the battle...");
        winornot = false;
      }
      break;
    case "Vicious slice":
      yourdmgevelotth = rng2.nextInt(5) + 20;
      Thread.sleep(1000);
      System.out.println("You dealt " + yourdmgevelotth + " damage to the enemy Olbap.");
      olbaphealth = olbaphealth - yourdmgevelotth;
      System.out.println("Enemy Olbap health: " + olbaphealth);
      for (; olbaphealth > 0 && yourhealth > 0;) {
    	  if (olbaphealth <= 0) {
    		  break;
    	  }
    	  if (yourhealth <= 0) {
    		  break;
    	  }
        olbapattckdmgevt = rng3.nextInt(18) + 5;
        Thread.sleep(2000);
        System.out.println("You took " + olbapattckdmgevt + " damage from the enemy Olbap.");
        yourhealth = yourhealth - olbapattckdmgevt;
        System.out.println("Your health: " + yourhealth);
        Thread.sleep(2000);
        System.out.println("Your turn:");
        System.out.println("Primary attack: Vicious slice[20-25 damage dealt]   Secondary attack: Block[1/4 less damage taken from enemy attacks, lasts for 2 turns, cooldown is 1 turn]");
        tutrlbttl = tutrlbttlObj.nextLine();
        if (!tutrlbttl.equals("Vicious slice") && !tutrlbttl.equals("Block")) {
          for (; !tutrlbttl.equals("Vicious slice") && !tutrlbttl.equals("Block");) {
            System.out.println("Error: User input not recognized. Try again?");
            tutrlbttl = tutrlbttlObj.nextLine();
          }
        }
        if (tutrlbttl.equals("Vicious slice")) {
          yourdmgevelotth = rng2.nextInt(5) + 20;
          Thread.sleep(2000);
          System.out.println("You dealt " + yourdmgevelotth + " damage to the enemy Olbap.");
          olbaphealth = olbaphealth - yourdmgevelotth;
          System.out.println("Enemy Olbap health: " + olbaphealth);
          continue;
        } else if (tutrlbttl.equals("Block")) {
          System.out.println("You blocked. The damage that incoming enemy attacks will do to you will be reduced by 1/4.");
          for (int counter = 0; olbaphealth > 0 && yourhealth > 0 && counter < 2; ++counter) {
        	if (olbaphealth <= 0) {
        		break;
            }
        	if (yourhealth <= 0) {
        		break;
        	}
            olbapattckdmgevt = rng3.nextInt(18) + 5;
            olbapdcreasedmgebruh = olbapattckdmgevt / 4;
            olbapdcreasedmge = olbapattckdmgevt - olbapdcreasedmgebruh;
            Thread.sleep(2000);
            System.out.println("You took " + olbapdcreasedmge + " damage from the enemy Olbap.");
            yourhealth = yourhealth - olbapdcreasedmge;
            System.out.println("Your health: " + yourhealth);
            Thread.sleep(2000);
            System.out.println("Your turn:");
            System.out.println("Primary attack: Vicious slice[20-25 damage dealt]   Secondary attack: Block[On cooldown]");
            tutrlbttl = tutrlbttlObj.nextLine();
            if (tutrlbttl.equals("Vicious slice")) {
              yourdmgevelotth = rng2.nextInt(5) + 20;
              Thread.sleep(2000);
              System.out.println("You dealt " + yourdmgevelotth + " damage to the enemy Olbap.");
              olbaphealth = olbaphealth - yourdmgevelotth;
              System.out.println("Enemy Olbap health: " + olbaphealth);
              continue;
            } else if (tutrlbttl.equals("Block")) {
              for (; !tutrlbttl.equals("Vicious slice");) {
                System.out.println("Error: Attack is on cooldown. Try again?");
                tutrlbttl = tutrlbttlObj.nextLine();
              }
            } else {
              for (; !tutrlbttl.equals("Vicious slice");) {
                if (!tutrlbttl.equals("Block")) {
                  System.out.println("Error: User input not recognized. Try again?");
                } else {
                  System.out.println("Error: Attack is on cooldown. Try again?");
                }
                tutrlbttl = tutrlbttlObj.nextLine();
              }
            }
            yourdmgevelotth = rng2.nextInt(5) + 20;
            Thread.sleep(2000);
            System.out.println("You dealt " + yourdmgevelotth + " damage to the enemy Olbap.");
            olbaphealth = olbaphealth - yourdmgevelotth;
            System.out.println("Enemy Olbap health: " + olbaphealth);
          }
          for (int counter1 = 0; olbaphealth > 0 && yourhealth > 0 && counter1 < 1; ++counter1) {
            olbapattckdmgevt = rng3.nextInt(18) + 5;
            Thread.sleep(2000);
            System.out.println("You took " + olbapattckdmgevt + " damage from the enemy Olbap.");
            yourhealth = yourhealth - olbapattckdmgevt;
            System.out.println("Your health: " + yourhealth);
            if (olbaphealth <= 0) {
            	break;
            }
            if (yourhealth <= 0) {
            	break;
            }
            Thread.sleep(2000);
            System.out.println("Your turn:");
            System.out.println("Primary attack: Vicious slice[20-25 damage dealt]   Secondary attack: Block[On cooldown]");
            tutrlbttl = tutrlbttlObj.nextLine();
            if (tutrlbttl.equals("Vicious slice")) {
              yourdmgevelotth = rng2.nextInt(5) + 20;
              Thread.sleep(2000);
              System.out.println("You dealt " + yourdmgevelotth + " damage to the enemy Olbap.");
              olbaphealth = olbaphealth - yourdmgevelotth;
              System.out.println("Enemy Olbap health: " + olbaphealth);
              continue;
            } else if (tutrlbttl.equals("Block")) {
              for (; !tutrlbttl.equals("Vicious slice");) {
                System.out.println("Error: Attack is on cooldown. Try again?");
                tutrlbttl = tutrlbttlObj.nextLine();
              }
            } else {
              for (; !tutrlbttl.equals("Vicious slice");) {
                if (!tutrlbttl.equals("Block")) {
                  System.out.println("Error: User input not recognized. Try again?");
                } else {
                  System.out.println("Error: Attack is on cooldown. Try again?");
                }
                tutrlbttl = tutrlbttlObj.nextLine();
              }
            }
            yourdmgevelotth = rng2.nextInt(5) + 20;
            Thread.sleep(2000);
            System.out.println("You dealt " + yourdmgevelotth + " damage to the enemy Olbap.");
            olbaphealth = olbaphealth - yourdmgevelotth;
            System.out.println("Enemy Olbap health: " + olbaphealth);
          }
        }
      }
      if (olbaphealth <= 0) {
        money = money + 15;
        System.out.println("You won the battle and rid the world of one wicked Olbap! Rewards: $15");
        System.out.println("Current amount of money: " +  money);
        winornot = true;
      }
      if (yourhealth <= 0) {
        System.out.println("You lost the battle...");
        winornot = false;
      }
      break;
    case "Block":
      System.out.println("You blocked. The damage that incoming enemy attacks will do to you will be reduced by 1/4.");
      Thread.sleep(2000);
      for (int counter = 0; olbaphealth > 0 && yourhealth > 0 && counter < 2; ++counter) {
    	if (olbaphealth <= 0) {
    		break;
        }
      	if (yourhealth <= 0) {
      		break;
      	}
        olbapattckdmgevt = rng3.nextInt(18) + 5;
        olbapdcreasedmgebruh = olbapattckdmgevt / 4;
        olbapdcreasedmge = olbapattckdmgevt - olbapdcreasedmgebruh;
        Thread.sleep(2000);
        System.out.println("You took " + olbapdcreasedmge + " damage from the enemy Olbap.");
        yourhealth = yourhealth - olbapdcreasedmge;
        System.out.println("Your health: " + yourhealth);
        Thread.sleep(2000);
        System.out.println("Your turn:");
        System.out.println("Primary attack: Vicious slice[20-25 damage dealt]   Secondary attack: Block[On cooldown]");
        tutrlbttl = tutrlbttlObj.nextLine();
        if (tutrlbttl.equals("Vicious slice")) {
          yourdmgevelotth = rng2.nextInt(5) + 20;
          Thread.sleep(2000);
          System.out.println("You dealt " + yourdmgevelotth + " damage to the enemy Olbap.");
          olbaphealth = olbaphealth - yourdmgevelotth;
          System.out.println("Enemy Olbap health: " + olbaphealth);
          continue;
        } else if (tutrlbttl.equals("Block")) {
          for (; !tutrlbttl.equals("Vicious slice");) {
            System.out.println("Error: Attack is on cooldown. Try again?");
            tutrlbttl = tutrlbttlObj.nextLine();
          }
        } else {
          for (; !tutrlbttl.equals("Vicious slice");) {
            if (!tutrlbttl.equals("Block")) {
              System.out.println("Error: User input not recognized. Try again?");
            } else {
              System.out.println("Error: Attack is on cooldown. Try again?");
            }
            tutrlbttl = tutrlbttlObj.nextLine();
          }
        }
        yourdmgevelotth = rng2.nextInt(5) + 20;
        Thread.sleep(2000);
        System.out.println("You dealt " + yourdmgevelotth + " damage to the enemy Olbap.");
        olbaphealth = olbaphealth - yourdmgevelotth;
        System.out.println("Enemy Olbap health: " + olbaphealth);
      }
      for (int counter1 = 0; olbaphealth > 0 && yourhealth > 0 && counter1 < 1; ++counter1) {
    	if (olbaphealth <= 0) {
    		break;
        }
      	if (yourhealth <= 0) {
      		break;
      	}
        olbapattckdmgevt = rng3.nextInt(18) + 5;
        Thread.sleep(2000);
        System.out.println("You took " + olbapattckdmgevt + " damage from the enemy Olbap.");
        yourhealth = yourhealth - olbapattckdmgevt;
        System.out.println("Your health: " + yourhealth);
        Thread.sleep(2000);
        System.out.println("Your turn:");
        System.out.println("Primary attack: Vicious slice[20-25 damage dealt]   Secondary attack: Block[On cooldown]");
        tutrlbttl = tutrlbttlObj.nextLine();
        if (tutrlbttl.equals("Vicious slice")) {
          yourdmgevelotth = rng2.nextInt(5) + 20;
          Thread.sleep(2000);
          System.out.println("You dealt " + yourdmgevelotth + " damage to the enemy Olbap.");
          olbaphealth = olbaphealth - yourdmgevelotth;
          System.out.println("Enemy Olbap health: " + olbaphealth);
          continue;
        } else if (tutrlbttl.equals("Block")) {
          for (; !tutrlbttl.equals("Vicious slice");) {
            System.out.println("Error: Attack is on cooldown. Try again?");
            tutrlbttl = tutrlbttlObj.nextLine();
          }
        } else {
          for (; !tutrlbttl.equals("Vicious slice");) {
            if (!tutrlbttl.equals("Block")) {
              System.out.println("Error: User input not recognized. Try again?");
            } else {
              System.out.println("Error: Attack is on cooldown. Try again?");
            }
            tutrlbttl = tutrlbttlObj.nextLine();
          }
        }
        yourdmgevelotth = rng2.nextInt(5) + 20;
        Thread.sleep(2000);
        System.out.println("You dealt " + yourdmgevelotth + " damage to the enemy Olbap.");
        olbaphealth = olbaphealth - yourdmgevelotth;
        System.out.println("Enemy Olbap health: " + olbaphealth);
      }
      for (; olbaphealth > 0 && yourhealth > 0;) {
    	if (olbaphealth <= 0) {
    		break;
        }
      	if (yourhealth <= 0) {
      		break;
      	}
        olbapattckdmgevt = rng3.nextInt(18) + 5;
        Thread.sleep(2000);
        System.out.println("You took " + olbapattckdmgevt + " damage from the enemy Olbap.");
        yourhealth = yourhealth - olbapattckdmgevt;
        System.out.println("Your health: " + yourhealth);
        Thread.sleep(2000);
        System.out.println("Your turn:");
        System.out.println("Primary attack: Vicious slice[20-25 damage dealt]   Secondary attack: Block[1/4 less damage taken from enemy attacks, lasts for 2 turns, cooldown is 1 turn]");
        tutrlbttl = tutrlbttlObj.nextLine();
        if (!tutrlbttl.equals("Vicious slice") && !tutrlbttl.equals("Block")) {
          for (; !tutrlbttl.equals("Vicious slice") && !tutrlbttl.equals("Block");) {
            System.out.println("Error: User input not recognized. Try again?");
            tutrlbttl = tutrlbttlObj.nextLine();
          }
        }
        if (tutrlbttl.equals("Vicious slice")) {
          yourdmgevelotth = rng2.nextInt(5) + 20;
          Thread.sleep(2000);
          System.out.println("You dealt " + yourdmgevelotth + " damage to the enemy Olbap.");
          olbaphealth = olbaphealth - yourdmgevelotth;
          System.out.println("Enemy Olbap health: " + olbaphealth);
          continue;
        } else if (tutrlbttl.equals("Block")) {
          System.out.println("You blocked. The damage that incoming enemy attacks will do to you will be reduced by 1/4.");
          for (int counter = 0; olbaphealth > 0 && yourhealth > 0 && counter < 2; ++counter) {
        	if (olbaphealth <= 0) {
        		break;
            }
          	if (yourhealth <= 0) {
          		break;
          	}
            olbapattckdmgevt = rng3.nextInt(18) + 5;
            olbapdcreasedmgebruh = olbapattckdmgevt / 4;
            olbapdcreasedmge = olbapattckdmgevt - olbapdcreasedmgebruh;
            Thread.sleep(2000);
            System.out.println("You took " + olbapdcreasedmge + " damage from the enemy Olbap.");
            yourhealth = yourhealth - olbapdcreasedmge;
            System.out.println("Your health: " + yourhealth);
            if (olbaphealth <= 0) {
        		break;
            }
        	if (yourhealth <= 0) {
        		break;
        	}
            Thread.sleep(2000);
            System.out.println("Your turn:");
            System.out.println("Primary attack: Vicious slice[20-25 damage dealt]   Secondary attack: Block[On cooldown]");
            tutrlbttl = tutrlbttlObj.nextLine();
            if (tutrlbttl.equals("Vicious slice")) {
              yourdmgevelotth = rng2.nextInt(5) + 20;
              Thread.sleep(2000);
              System.out.println("You dealt " + yourdmgevelotth + " damage to the enemy Olbap.");
              olbaphealth = olbaphealth - yourdmgevelotth;
              System.out.println("Enemy Olbap health: " + olbaphealth);
              continue;
            } else if (tutrlbttl.equals("Block")) {
              for (; !tutrlbttl.equals("Vicious slice");) {
                System.out.println("Error: Attack is on cooldown. Try again?");
                tutrlbttl = tutrlbttlObj.nextLine();
              }
            } else {
              for (; !tutrlbttl.equals("Vicious slice");) {
                if (!tutrlbttl.equals("Block")) {
                  System.out.println("Error: User input not recognized. Try again?");
                } else {
                  System.out.println("Error: Attack is on cooldown. Try again?");
                }
                tutrlbttl = tutrlbttlObj.nextLine();
              }
            }
            yourdmgevelotth = rng2.nextInt(5) + 20;
            Thread.sleep(2000);
            System.out.println("You dealt " + yourdmgevelotth + " damage to the enemy Olbap.");
            olbaphealth = olbaphealth - yourdmgevelotth;
            System.out.println("Enemy Olbap health: " + olbaphealth);
          }
          for (int counter1 = 0; olbaphealth > 0 && yourhealth > 0 && counter1 < 1; ++counter1) {
        	if (olbaphealth <= 0) {
        		break;
            }
          	if (yourhealth <= 0) {
          		break;
          	}
            olbapattckdmgevt = rng3.nextInt(18) + 5;
            Thread.sleep(2000);
            System.out.println("You took " + olbapattckdmgevt + " damage from the enemy Olbap.");
            yourhealth = yourhealth - olbapattckdmgevt;
            System.out.println("Your health: " + yourhealth);
            Thread.sleep(2000);
            System.out.println("Your turn:");
            System.out.println("Primary attack: Vicious slice[20-25 damage dealt]   Secondary attack: Block[On cooldown]");
            tutrlbttl = tutrlbttlObj.nextLine();
            if (tutrlbttl.equals("Vicious slice")) {
              yourdmgevelotth = rng2.nextInt(5) + 20;
              Thread.sleep(2000);
              System.out.println("You dealt " + yourdmgevelotth + " damage to the enemy Olbap.");
              olbaphealth = olbaphealth - yourdmgevelotth;
              System.out.println("Enemy Olbap health: " + olbaphealth);
              continue;
            } else if (tutrlbttl.equals("Block")) {
              for (; !tutrlbttl.equals("Vicious slice");) {
                System.out.println("Error: Attack is on cooldown. Try again?");
                tutrlbttl = tutrlbttlObj.nextLine();
              }
            } else {
              for (; !tutrlbttl.equals("Vicious slice");) {
                if (!tutrlbttl.equals("Block")) {
                  System.out.println("Error: User input not recognized. Try again?");
                } else {
                  System.out.println("Error: Attack is on cooldown. Try again?");
                }
                tutrlbttl = tutrlbttlObj.nextLine();
              }
            }
            yourdmgevelotth = rng2.nextInt(5) + 20;
            Thread.sleep(2000);
            System.out.println("You dealt " + yourdmgevelotth + " damage to the enemy Olbap.");
            olbaphealth = olbaphealth - yourdmgevelotth;
            System.out.println("Enemy Olbap health: " + olbaphealth);
          }
        }
      }
      if (olbaphealth <= 0) {
        money = money + 15;
        System.out.println("You won the battle and rid the world of one wicked Olbap! Rewards: $15");
        System.out.println("Current amount of money: " +  money);
        winornot = true;
      }
      if (yourhealth <= 0) {
        System.out.println("You lost the battle...");
        winornot = false;
      }
      break;
    case "Health goes poof":
    	yourdmgestrtmagwnd = rng4.nextInt(4) + 18;
    	Thread.sleep(1000);
    	System.out.println("You dealt " + yourdmgestrtmagwnd + " damage to the enemy Olbap.");
    	olbaphealth = olbaphealth - yourdmgestrtmagwnd;
    	System.out.println("Enemy Olbap health: " + olbaphealth);
    	for (; olbaphealth > 0 && yourhealth > 0;) {
    		if (olbaphealth <= 0) {
                break;
            }
            if (yourhealth <= 0) {
                break;
            }
    		olbapattckdmgesmw = rng.nextInt(18) + 5;
    		Thread.sleep(2000);
    		System.out.println("You took " + olbapattckdmgesmw + " damage from the enemy Olbap.");
    		yourhealth = yourhealth - olbapattckdmgesmw;
    		System.out.println("Your health: " + yourhealth);
    		if (olbaphealth <= 0) {
                break;
             }
             if (yourhealth <= 0) {
                break;
             }
    		Thread.sleep(2000);
    		System.out.println("Your turn:");
    		System.out.println("Primary attack: Health goes poof[18-22 damage dealt]    Secondary attack: Leech[+8-10 health per attack, lasts for 3 turns, cooldown is 2 turns]");
    		tutrlbttl = tutrlbttlObj.nextLine();
    		if (!tutrlbttl.equals("Health goes poof") && !tutrlbttl.equals("Leech")) {
    			for(; !tutrlbttl.equals("Health goes poof") && !tutrlbttl.equals("Leech");) {
    				System.out.println("Error: User input not recognized. Try again?");
    				tutrlbttl = tutrlbttlObj.nextLine();
    			}
    		}
    		if (tutrlbttl.equals("Health goes poof")) {
    			yourdmgestrtmagwnd = rng4.nextInt(4) + 18;
    			Thread.sleep(2000);
    			System.out.println("You dealt " + yourdmgestrtmagwnd + " damage to the enemy Olbap.");
    			olbaphealth = olbaphealth - yourdmgestrtmagwnd;
    			System.out.println("Enemy Olbap health: " + olbaphealth);
    			if (olbaphealth <= 0) {
                    break;
                }
                if (yourhealth <= 0) {
                    break;
                }
    			continue;
    		}
    		else if (tutrlbttl.equals("Leech")) {
    			System.out.println("You leeched your enemy's health. From now on for 3 turns, whenever it's your turn and you attack the enemy, you will gain between 8 and 10 health, and of course, still damage the enemy.");
    			for (int countermagwnd = 0; olbaphealth > 0 && yourhealth > 0 && countermagwnd < 3; ++countermagwnd) {
    				if (olbaphealth <= 0) {
    	                break;
    	            }
    	            if (yourhealth <= 0) {
    	                break;
    	            }
    				olbapattckdmgesmw = rng.nextInt(18) + 5;
    	    		Thread.sleep(2000);
    	    		System.out.println("You took " + olbapattckdmgesmw + " damage from the enemy Olbap.");
    	    		yourhealth = yourhealth - olbapattckdmgesmw;
    	    		System.out.println("Your health: " + yourhealth);
    	    		if (olbaphealth <= 0) {
    	                break;
    	            }
    	            if (yourhealth <= 0) {
    	                break;
    	            }
    	    		Thread.sleep(2000);
    	    		System.out.println("Your turn:");
    	    		System.out.println("Primary attack: Health goes poof[18-22 damage dealt]    Secondary attack: Leech[On cooldown]");
    	    		tutrlbttl = tutrlbttlObj.nextLine();
    	    		if (!tutrlbttl.equals("Health goes poof") && !tutrlbttl.equals("Leech")) {
    	    			for(; !tutrlbttl.equals("Health goes poof") && !tutrlbttl.equals("Leech");) {
    	    				System.out.println("Error: User input not recognized. Try again?");
    	    				tutrlbttl = tutrlbttlObj.nextLine();
    	    			}
    	    		}
    	    		if (tutrlbttl.equals("Health goes poof")) {
    	    			yourdmgestrtmagwnd = rng4.nextInt(4) + 18;
    	    			yourhealthincr = rng4.nextInt(2) + 8;
    	    			Thread.sleep(2000);
    	    			System.out.println("You dealt " + yourdmgestrtmagwnd + " damage to the enemy Olbap.");
    	    			System.out.println("You gained " + yourhealthincr + " health.");
    	    			olbaphealth = olbaphealth - yourdmgestrtmagwnd;
    	    			yourhealth = yourhealth + yourhealthincr;
    	    			System.out.println("Enemy Olbap health: " + olbaphealth);
    	    			System.out.println("Your health: " + yourhealth);
    	    			if (olbaphealth <= 0) {
    	                    break;
    	                }
    	                if (yourhealth <= 0) {
    	                    break;
    	                }
    	    			continue;
    	    		}
    	    		else if (tutrlbttl.equals("Leech")) {
    	    			for (;!tutrlbttl.equals("Health goes poof");) {
    	    				System.out.println("Error: Attack is on cooldown. Try again?");
    	    				tutrlbttl = tutrlbttlObj.nextLine();
    	    			}
    	    		}
    	    		yourdmgestrtmagwnd = rng4.nextInt(4) + 18;
	    			yourhealthincr = rng4.nextInt(2) + 8;
	    			Thread.sleep(2000);
	    			System.out.println("You dealt " + yourdmgestrtmagwnd + " damage to the enemy Olbap.");
	    			System.out.println("You gained " + yourhealthincr + " health.");
	    			olbaphealth = olbaphealth - yourdmgestrtmagwnd;
	    			yourhealth = yourhealth + yourhealthincr;
	    			System.out.println("Enemy Olbap health: " + olbaphealth);
	    			System.out.println("Your health: " + yourhealth);
	    			if (olbaphealth <= 0) {
	                    break;
	                }
	                if (yourhealth <= 0) {
	                    break;
	                }
    			}
    			for (int cntercldwnsmw = 0; olbaphealth > 0 && yourhealth > 0 && cntercldwnsmw < 2; ++cntercldwnsmw) {
    				if (olbaphealth <= 0) {
    	                break;
    	            }
    	            if (yourhealth <= 0) {
    	                break;
    	            }
    				olbapattckdmgesmw = rng.nextInt(18) + 5;
    	    		Thread.sleep(2000);
    	    		System.out.println("You took " + olbapattckdmgesmw + " damage from the enemy Olbap.");
    	    		yourhealth = yourhealth - olbapattckdmgesmw;
    	    		System.out.println("Your health: " + yourhealth);
    	    		if (olbaphealth <= 0) {
    	                break;
    	            }
    	            if (yourhealth <= 0) {
    	                break;
    	            }
    	    		Thread.sleep(2000);
    	    		System.out.println("Your turn:");
    	    		System.out.println("Primary attack: Health goes poof[18-22 damage dealt]    Secondary attack: Leech[On cooldown]");
    	    		tutrlbttl = tutrlbttlObj.nextLine();
    	    		if (!tutrlbttl.equals("Health goes poof") && !tutrlbttl.equals("Leech")) {
    	    			for(; !tutrlbttl.equals("Health goes poof") && !tutrlbttl.equals("Leech");) {
    	    				System.out.println("Error: User input not recognized. Try again?");
    	    				tutrlbttl = tutrlbttlObj.nextLine();
    	    			}
    	    		}
    	    		if (tutrlbttl.equals("Health goes poof")) {
    	    			yourdmgestrtmagwnd = rng4.nextInt(4) + 18;
    	    			Thread.sleep(2000);
    	    			System.out.println("You dealt " + yourdmgestrtmagwnd + " damage to the enemy Olbap.");
    	    			olbaphealth = olbaphealth - yourdmgestrtmagwnd;
    	    			System.out.println("Enemy Olbap health: " + olbaphealth);
    	    			if (olbaphealth <= 0) {
    	                    break;
    	                }
    	                if (yourhealth <= 0) {
    	                    break;
    	                }
    	    			continue;
    	    		}
    	    		else if (tutrlbttl.equals("Leech")) {
    	    			for (;!tutrlbttl.equals("Health goes poof");) {
    	    				System.out.println("Error: Attack is on cooldown. Try again?");
    	    				tutrlbttl = tutrlbttlObj.nextLine();
    	    			}
    	    		}
    	    		yourdmgestrtmagwnd = rng4.nextInt(4) + 18;
	    			Thread.sleep(2000);
	    			System.out.println("You dealt " + yourdmgestrtmagwnd + " damage to the enemy Olbap.");
	    			olbaphealth = olbaphealth - yourdmgestrtmagwnd;
	    			System.out.println("Enemy Olbap health: " + olbaphealth);
	    			if (olbaphealth <= 0) {
	                    break;
	                }
	                if (yourhealth <= 0) {
	                    break;
	                }
    			}
    		}
    	}
    	if (olbaphealth <= 0) {
            money = money + 15;
            System.out.println("You won the battle and rid the world of one wicked Olbap! Rewards: $15");
            System.out.println("Current amount of money: " +  money);
            winornot = true;
          }
          if (yourhealth <= 0) {
            System.out.println("You lost the battle...");
            winornot = false;
          }
          break;
    case ("Leech"):
    	System.out.println("You leeched your enemy's health. From now on for 3 turns, whenever it's your turn and you attack the enemy, you will gain between 8 and 10 health, and of course, still damage the enemy.");
    	Thread.sleep(3500);
		for (int countermagwnd = 0; olbaphealth > 0 && yourhealth > 0 && countermagwnd < 3; ++countermagwnd) {
			if (olbaphealth <= 0) {
	            break;
	        }
	        if (yourhealth <= 0) {
	            break;
	        }
			olbapattckdmgesmw = rng.nextInt(18) + 5;
			Thread.sleep(2000);
			System.out.println("You took " + olbapattckdmgesmw + " damage from the enemy Olbap.");
			yourhealth = yourhealth - olbapattckdmgesmw;
			System.out.println("Your health: " + yourhealth);
			if (olbaphealth <= 0) {
	            break;
	        }
	        if (yourhealth <= 0) {
	            break;
	        }
			Thread.sleep(2000);
			System.out.println("Your turn:");
			System.out.println("Primary attack: Health goes poof[18-22 damage dealt]    Secondary attack: Leech[On cooldown]");
			tutrlbttl = tutrlbttlObj.nextLine();
			if (!tutrlbttl.equals("Health goes poof") && !tutrlbttl.equals("Leech")) {
				for(; !tutrlbttl.equals("Health goes poof") && !tutrlbttl.equals("Leech");) {
					System.out.println("Error: User input not recognized. Try again?");
					tutrlbttl = tutrlbttlObj.nextLine();
				}
			}
			if (tutrlbttl.equals("Health goes poof")) {
				yourdmgestrtmagwnd = rng4.nextInt(4) + 18;
				yourhealthincr = rng4.nextInt(2) + 8;
				Thread.sleep(2000);
				System.out.println("You dealt " + yourdmgestrtmagwnd + " damage to the enemy Olbap.");
				System.out.println("You gained " + yourhealthincr + " health.");
				olbaphealth = olbaphealth - yourdmgestrtmagwnd;
				yourhealth = yourhealth + yourhealthincr;
				System.out.println("Enemy Olbap health: " + olbaphealth);
				System.out.println("Your health: " + yourhealth);
				if (olbaphealth <= 0) {
	                break;
	            }
	            if (yourhealth <= 0) {
	                break;
	            }
				continue;
			}
			else if (tutrlbttl.equals("Leech")) {
				for (;!tutrlbttl.equals("Health goes poof");) {
					System.out.println("Error: Attack is on cooldown. Try again?");
					tutrlbttl = tutrlbttlObj.nextLine();
				}
			}
			yourdmgestrtmagwnd = rng4.nextInt(4) + 18;
			yourhealthincr = rng4.nextInt(2) + 8;
			Thread.sleep(2000);
			System.out.println("You dealt " + yourdmgestrtmagwnd + " damage to the enemy Olbap.");
			System.out.println("You gained " + yourhealthincr + " health.");
			olbaphealth = olbaphealth - yourdmgestrtmagwnd;
			yourhealth = yourhealth + yourhealthincr;
			System.out.println("Enemy Olbap health: " + olbaphealth);
			System.out.println("Your health: " + yourhealth);
			if (olbaphealth <= 0) {
	            break;
	        }
	        if (yourhealth <= 0) {
	            break;
	        }
		}
		for (int cntercldwnsmw = 0; olbaphealth > 0 && yourhealth > 0 && cntercldwnsmw < 2; ++cntercldwnsmw) {
			if (olbaphealth <= 0) {
                break;
            }
            if (yourhealth <= 0) {
                break;
            }
			olbapattckdmgesmw = rng.nextInt(18) + 5;
    		Thread.sleep(2000);
    		System.out.println("You took " + olbapattckdmgesmw + " damage from the enemy Olbap.");
    		yourhealth = yourhealth - olbapattckdmgesmw;
    		System.out.println("Your health: " + yourhealth);
    		if (olbaphealth <= 0) {
                break;
            }
            if (yourhealth <= 0) {
                break;
            }
    		Thread.sleep(2000);
    		System.out.println("Your turn:");
    		System.out.println("Primary attack: Health goes poof[18-22 damage dealt]    Secondary attack: Leech[On cooldown]");
    		tutrlbttl = tutrlbttlObj.nextLine();
    		if (!tutrlbttl.equals("Health goes poof") && !tutrlbttl.equals("Leech")) {
    			for(; !tutrlbttl.equals("Health goes poof") && !tutrlbttl.equals("Leech");) {
    				System.out.println("Error: User input not recognized. Try again?");
    				tutrlbttl = tutrlbttlObj.nextLine();
    			}
    		}
    		if (tutrlbttl.equals("Health goes poof")) {
    			yourdmgestrtmagwnd = rng4.nextInt(4) + 18;
    			Thread.sleep(2000);
    			System.out.println("You dealt " + yourdmgestrtmagwnd + " damage to the enemy Olbap.");
    			olbaphealth = olbaphealth - yourdmgestrtmagwnd;
    			System.out.println("Enemy Olbap health: " + olbaphealth);
    			if (olbaphealth <= 0) {
                    break;
                }
                if (yourhealth <= 0) {
                    break;
                }
    			continue;
    		}
    		else if (tutrlbttl.equals("Leech")) {
    			for (;!tutrlbttl.equals("Health goes poof");) {
    				System.out.println("Error: Attack is on cooldown. Try again?");
    				tutrlbttl = tutrlbttlObj.nextLine();
    			}
    		}
    		yourdmgestrtmagwnd = rng4.nextInt(4) + 18;
			Thread.sleep(2000);
			System.out.println("You dealt " + yourdmgestrtmagwnd + " damage to the enemy Olbap.");
			olbaphealth = olbaphealth - yourdmgestrtmagwnd;
			System.out.println("Enemy Olbap health: " + olbaphealth);
			if (olbaphealth <= 0) {
                break;
            }
            if (yourhealth <= 0) {
                break;
            }
		}
		for (; olbaphealth > 0 && yourhealth > 0;) {
    		if (olbaphealth <= 0) {
                break;
            }
            if (yourhealth <= 0) {
                break;
            }
    		olbapattckdmgesmw = rng.nextInt(18) + 5;
    		Thread.sleep(2000);
    		System.out.println("You took " + olbapattckdmgesmw + " damage from the enemy Olbap.");
    		yourhealth = yourhealth - olbapattckdmgesmw;
    		System.out.println("Your health: " + yourhealth);
    		if (olbaphealth <= 0) {
                break;
             }
             if (yourhealth <= 0) {
                break;
             }
    		Thread.sleep(2000);
    		System.out.println("Your turn:");
    		System.out.println("Primary attack: Health goes poof[18-22 damage dealt]    Secondary attack: Leech[+8-10 health per attack, lasts for 3 turns, cooldown is 2 turns]");
    		tutrlbttl = tutrlbttlObj.nextLine();
    		if (!tutrlbttl.equals("Health goes poof") && !tutrlbttl.equals("Leech")) {
    			for(; !tutrlbttl.equals("Health goes poof") && !tutrlbttl.equals("Leech");) {
    				System.out.println("Error: User input not recognized. Try again?");
    				tutrlbttl = tutrlbttlObj.nextLine();
    			}
    		}
    		if (tutrlbttl.equals("Health goes poof")) {
    			yourdmgestrtmagwnd = rng4.nextInt(4) + 18;
    			Thread.sleep(2000);
    			System.out.println("You dealt " + yourdmgestrtmagwnd + " damage to the enemy Olbap.");
    			olbaphealth = olbaphealth - yourdmgestrtmagwnd;
    			System.out.println("Enemy Olbap health: " + olbaphealth);
    			if (olbaphealth <= 0) {
                    break;
                }
                if (yourhealth <= 0) {
                    break;
                }
    			continue;
    		}
    		else if (tutrlbttl.equals("Leech")) {
    			System.out.println("You leeched your enemy's health. From now on for 3 turns, whenever it's your turn and you attack the enemy, you will gain between 8 and 10 health, and of course, still damage the enemy.");
    			for (int countermagwnd = 0; olbaphealth > 0 && yourhealth > 0 && countermagwnd < 3; ++countermagwnd) {
    				if (olbaphealth <= 0) {
    	                break;
    	            }
    	            if (yourhealth <= 0) {
    	                break;
    	            }
    				olbapattckdmgesmw = rng.nextInt(18) + 5;
    	    		Thread.sleep(2000);
    	    		System.out.println("You took " + olbapattckdmgesmw + " damage from the enemy Olbap.");
    	    		yourhealth = yourhealth - olbapattckdmgesmw;
    	    		System.out.println("Your health: " + yourhealth);
    	    		if (olbaphealth <= 0) {
    	                break;
    	            }
    	            if (yourhealth <= 0) {
    	                break;
    	            }
    	    		Thread.sleep(2000);
    	    		System.out.println("Your turn:");
    	    		System.out.println("Primary attack: Health goes poof[18-22 damage dealt]    Secondary attack: Leech[On cooldown]");
    	    		tutrlbttl = tutrlbttlObj.nextLine();
    	    		if (!tutrlbttl.equals("Health goes poof") && !tutrlbttl.equals("Leech")) {
    	    			for(; !tutrlbttl.equals("Health goes poof") && !tutrlbttl.equals("Leech");) {
    	    				System.out.println("Error: User input not recognized. Try again?");
    	    				tutrlbttl = tutrlbttlObj.nextLine();
    	    			}
    	    		}
    	    		if (tutrlbttl.equals("Health goes poof")) {
    	    			yourdmgestrtmagwnd = rng4.nextInt(4) + 18;
    	    			yourhealthincr = rng4.nextInt(2) + 8;
    	    			Thread.sleep(2000);
    	    			System.out.println("You dealt " + yourdmgestrtmagwnd + " damage to the enemy Olbap.");
    	    			System.out.println("You gained " + yourhealthincr + " health.");
    	    			olbaphealth = olbaphealth - yourdmgestrtmagwnd;
    	    			yourhealth = yourhealth + yourhealthincr;
    	    			System.out.println("Enemy Olbap health: " + olbaphealth);
    	    			System.out.println("Your health: " + yourhealth);
    	    			if (olbaphealth <= 0) {
    	                    break;
    	                }
    	                if (yourhealth <= 0) {
    	                    break;
    	                }
    	    			continue;
    	    		}
    	    		else if (tutrlbttl.equals("Leech")) {
    	    			for (;!tutrlbttl.equals("Health goes poof");) {
    	    				System.out.println("Error: Attack is on cooldown. Try again?");
    	    				tutrlbttl = tutrlbttlObj.nextLine();
    	    			}
    	    		}
    	    		yourdmgestrtmagwnd = rng4.nextInt(4) + 18;
	    			yourhealthincr = rng4.nextInt(2) + 8;
	    			Thread.sleep(2000);
	    			System.out.println("You dealt " + yourdmgestrtmagwnd + " damage to the enemy Olbap.");
	    			System.out.println("You gained " + yourhealthincr + " health.");
	    			olbaphealth = olbaphealth - yourdmgestrtmagwnd;
	    			yourhealth = yourhealth + yourhealthincr;
	    			System.out.println("Enemy Olbap health: " + olbaphealth);
	    			System.out.println("Your health: " + yourhealth);
	    			if (olbaphealth <= 0) {
	                    break;
	                }
	                if (yourhealth <= 0) {
	                    break;
	                }
    			}
    			for (int cntercldwnsmw = 0; olbaphealth > 0 && yourhealth > 0 && cntercldwnsmw < 2; ++cntercldwnsmw) {
    				if (olbaphealth <= 0) {
    	                break;
    	            }
    	            if (yourhealth <= 0) {
    	                break;
    	            }
    				olbapattckdmgesmw = rng.nextInt(18) + 5;
    	    		Thread.sleep(2000);
    	    		System.out.println("You took " + olbapattckdmgesmw + " damage from the enemy Olbap.");
    	    		yourhealth = yourhealth - olbapattckdmgesmw;
    	    		System.out.println("Your health: " + yourhealth);
    	    		if (olbaphealth <= 0) {
    	                break;
    	            }
    	            if (yourhealth <= 0) {
    	                break;
    	            }
    	    		Thread.sleep(2000);
    	    		System.out.println("Your turn:");
    	    		System.out.println("Primary attack: Health goes poof[18-22 damage dealt]    Secondary attack: Leech[On cooldown]");
    	    		tutrlbttl = tutrlbttlObj.nextLine();
    	    		if (!tutrlbttl.equals("Health goes poof") && !tutrlbttl.equals("Leech")) {
    	    			for(; !tutrlbttl.equals("Health goes poof") && !tutrlbttl.equals("Leech");) {
    	    				System.out.println("Error: User input not recognized. Try again?");
    	    				tutrlbttl = tutrlbttlObj.nextLine();
    	    			}
    	    		}
    	    		if (tutrlbttl.equals("Health goes poof")) {
    	    			yourdmgestrtmagwnd = rng4.nextInt(4) + 18;
    	    			Thread.sleep(2000);
    	    			System.out.println("You dealt " + yourdmgestrtmagwnd + " damage to the enemy Olbap.");
    	    			olbaphealth = olbaphealth - yourdmgestrtmagwnd;
    	    			System.out.println("Enemy Olbap health: " + olbaphealth);
    	    			if (olbaphealth <= 0) {
    	                    break;
    	                }
    	                if (yourhealth <= 0) {
    	                    break;
    	                }
    	    			continue;
    	    		}
    	    		else if (tutrlbttl.equals("Leech")) {
    	    			for (;!tutrlbttl.equals("Health goes poof");) {
    	    				System.out.println("Error: Attack is on cooldown. Try again?");
    	    				tutrlbttl = tutrlbttlObj.nextLine();
    	    			}
    	    		}
    	    		yourdmgestrtmagwnd = rng4.nextInt(4) + 18;
	    			Thread.sleep(2000);
	    			System.out.println("You dealt " + yourdmgestrtmagwnd + " damage to the enemy Olbap.");
	    			olbaphealth = olbaphealth - yourdmgestrtmagwnd;
	    			System.out.println("Enemy Olbap health: " + olbaphealth);
	    			if (olbaphealth <= 0) {
	                    break;
	                }
	                if (yourhealth <= 0) {
	                    break;
	                }
    			}
    		}
    	}
    	if (olbaphealth <= 0) {
    		money = money + 15;
            System.out.println("You won the battle and rid the world of one wicked Olbap! Rewards: $15");
            System.out.println("Current amount of money: " +  money);
            winornot = true;
         }
         if (yourhealth <= 0) {
        	System.out.println("You lost the battle...");
        	winornot = false;
         }
         break;
    case ("Electric shock"):
    	yourdmgedcable = rng5.nextInt(6) + 12;
    	Thread.sleep(1000);
    	System.out.println("You dealt " + yourdmgedcable + " damage to the enemy Olbap.");
    	olbaphealth = olbaphealth - yourdmgedcable;
    	System.out.println("Enemy Olbap health: " + olbaphealth);
    	for (; olbaphealth > 0 && yourhealth > 0;) {
    		if (olbaphealth <= 0) {
    			break;
    		}
    		if (yourhealth <= 0) {
    			break;
    		}
    		olbapattckdmgedcable = rng5.nextInt(18) + 5;
    		Thread.sleep(2000);
    		System.out.println("You took " + olbapattckdmgedcable + " damage from the enemy Olbap.");
    		yourhealth = yourhealth - olbapattckdmgedcable;
    		System.out.println("Your health: " + yourhealth);
    		if (olbaphealth <= 0) {
    			break;
    		}
    		if (yourhealth <= 0) {
    			break;
    		}
    		Thread.sleep(2000);
    		System.out.println("Your turn:");
    		System.out.println("Primary attack: Electric shock[12-18 damage dealt, 5-10 damage chained to other enemies]    Secondary attack: Charging up[Two turns after the attack is used, 30 damage will be dealt to every enemy, cooldown is 3 turns]");
    		tutrlbttl = tutrlbttlObj.nextLine();
    		if (!tutrlbttl.equals("Electric shock") && !tutrlbttl.equals("Charging up")) {
    			for (;!tutrlbttl.equals("Electric shock") && !tutrlbttl.equals("Charging up");) {
    				System.out.println("Error: User input not recognized. Try again?");
    				tutrlbttl = tutrlbttlObj.nextLine();
    			}
    		}
    		if (tutrlbttl.equals("Electric shock")) {
    			yourdmgedcable = rng5.nextInt(6) + 12;
    			Thread.sleep(2000);
    			System.out.println("You dealt " + yourdmgedcable + " damage to the enemy Olbap.");
    			olbaphealth = olbaphealth - yourdmgedcable;
    			System.out.println("Enemy Olbap health: " + olbaphealth);
    			if (olbaphealth <= 0) {
    				break;
    			}
    			if (yourhealth <= 0) {
    				break;
    			}
    			continue;
    		}
    		else if (tutrlbttl.equals("Charging up")) {
    			System.out.println("You started charging up. In 2 turns, 30 damage will be dealt to all enemies in addition to your normal attack.");
    			for (int counterdmgedcable = 0; olbaphealth > 0 && yourhealth > 0 && counterdmgedcable < 1; ++counterdmgedcable) {
    				if (olbaphealth <= 0) {
    					break;
    				}
    				if (yourhealth <= 0) {
    					break;
    				}
    				olbapattckdmgedcable = rng5.nextInt(18) + 5;
    				Thread.sleep(2000);
    				System.out.println("You took " + olbapattckdmgedcable + " damage from the enemy Olbap.");
    				yourhealth = yourhealth - olbapattckdmgedcable;
    				System.out.println("Your health: " + yourhealth);
    				if (olbaphealth <= 0) {
    					break;
    				}
    				if (yourhealth <= 0) {
    					break;
    				}
    				Thread.sleep(2000);
    				System.out.println("Your turn:");
    				System.out.println("Primary attack: Electric shock[12-18 damage dealt, 5-10 damage chained to other enemies]    Secondary attack: Charging up[On cooldown]");
    				tutrlbttl = tutrlbttlObj.nextLine();
    				if (!tutrlbttl.equals("Electric shock") && !tutrlbttl.equals("Charging up")) {
    					for(; !tutrlbttl.equals("Electric shock") && !tutrlbttl.equals("Charging up");) {
    						System.out.println("Error: User input not recognized. Try again?");
    						tutrlbttl = tutrlbttlObj.nextLine();
    					}
    				}
    				if (tutrlbttl.equals("Electric shock")) {
    					yourdmgedcable = rng5.nextInt(6) + 12;
    					Thread.sleep(2000);
    					System.out.println("You dealt " + yourdmgedcable + " damage to the enemy Olbap.");
    					olbaphealth = olbaphealth - yourdmgedcable;
    					System.out.println("Enemy Olbap health: " + olbaphealth);
    					if (olbaphealth <= 0) {
    						break;
    					}
    					if (yourhealth <= 0) {
    						break;
    					}
    					continue;
    				}
    				else if (tutrlbttl.equals("Charging up")) {
    					for (;!tutrlbttl.equals("Electric shock");) {
    						System.out.println("Error: Attack is on cooldown. Try again?");
    						tutrlbttl = tutrlbttlObj.nextLine();
    					}
    				}
    				yourdmgedcable = rng5.nextInt(6) + 12;
    				Thread.sleep(2000);
    				System.out.println("You dealt " + yourdmgedcable + " damage to the enemy Olbap.");
    				olbaphealth = olbaphealth - yourdmgedcable;
    				System.out.println("Enemy Olbap health: " + olbaphealth);
    				if (olbaphealth <= 0) {
    					break;
    				}
    				if (yourhealth <= 0) {
    					break;
    				}
    			}
    			if (olbaphealth <= 0) {
					break;
				}
				if (yourhealth <= 0) {
					break;
				}
    			boolean elshornot = false;
    			olbapattckdmgedcable = rng5.nextInt(18) + 5;
    			Thread.sleep(2000);
    			System.out.println("You took " + olbapattckdmgedcable + " damage from the enemy Olbap.");
    			yourhealth = yourhealth - olbapattckdmgedcable;
    			System.out.println("Your health: " + yourhealth);
    			if (olbaphealth <= 0) {
    				break;
    			}
    			if (yourhealth <= 0) {
    				break;
    			}
    			Thread.sleep(2000);
    			System.out.println("Your turn:");
    			System.out.println("The enemy Olbap took 30 damage.");
    			olbaphealth = olbaphealth - 30;
    			System.out.println("Enemy Olbap health: " + olbaphealth);
    			Thread.sleep(1500);
    			System.out.println("Primary attack: Electric shock[12-18 damage dealt, 5-10 damage chained to other enemies]    Secondary attack: Charging up[On cooldown]");
    			tutrlbttl = tutrlbttlObj.nextLine();
    			if (!tutrlbttl.equals("Electric shock") && !tutrlbttl.equals("Charging up")) {
    				for (;!tutrlbttl.equals("Electric shock") && !tutrlbttl.equals("Charging up");) {
    					System.out.println("Error: User input not recognized. Try again?");
    					tutrlbttl = tutrlbttlObj.nextLine();
    				}
    			}
    			if (tutrlbttl.equals("Electric shock")) {
    				yourdmgedcable = rng5.nextInt(6) + 12;
    				Thread.sleep(2000);
    				System.out.println("You dealt " + yourdmgedcable + " damage to the enemy Olbap.");
    				olbaphealth = olbaphealth - yourdmgedcable;
    				System.out.println("Enemy Olbap health: " + olbaphealth);
    				if (olbaphealth <= 0) {
    					break;
    				}
    				if (yourhealth <= 0) {
    					break;
    				}
    				elshornot = true;
    			}
    			else if (tutrlbttl.equals("Charging up")) {
    				for (;!tutrlbttl.equals("Electric shock");) {
    					System.out.println("Error: Attack is on cooldown. Try again?");
    					tutrlbttl = tutrlbttlObj.nextLine();
    				}
    			}
    			if (elshornot == false) {
    				yourdmgedcable = rng5.nextInt(6) + 12;
    				Thread.sleep(2000);
    				System.out.println("You dealt " + yourdmgedcable + " damage to the enemy Olbap.");
    				olbaphealth = olbaphealth - yourdmgedcable;
    				System.out.println("Enemy Olbap health: " + olbaphealth);
    				if (olbaphealth <= 0) {
    					break;
    				}
    				if (yourhealth <= 0) {
    					break;
    				}
    			}
    			System.out.println("Bruh exit");
    			for (int cldwnchrgup = 0; cldwnchrgup < 3 ; ++cldwnchrgup) {
    				if (olbaphealth <= 0) {
    					break;
    				}
    				if (yourhealth <= 0) {
    					break;
    				}
    				olbapattckdmgedcable = rng5.nextInt(18) + 5;
        			Thread.sleep(2000);
        			System.out.println("You took " + olbapattckdmgedcable + " damage from the enemy Olbap.");
        			yourhealth = yourhealth - olbapattckdmgedcable;
        			System.out.println("Your health: " + yourhealth);
        			if (olbaphealth <= 0) {
        				break;
        			}
        			if (yourhealth <= 0) {
        				break;
        			}
        			Thread.sleep(2000);
        			System.out.println("Your turn:");
        			System.out.println("Primary attack: Electric shock[12-18 damage dealt, 5-10 damage chained to other enemies]    Secondary attack: Charging up[On cooldown]");
        			tutrlbttl = tutrlbttlObj.nextLine();
        			if (!tutrlbttl.equals("Electric shock") && !tutrlbttl.equals("Charging up")) {
        				for (;!tutrlbttl.equals("Electric shock") && !tutrlbttl.equals("Charging up");) {
        					System.out.println("Error: User input not recognized.");
        					tutrlbttl = tutrlbttlObj.nextLine();
        				}
        			}
        			if (tutrlbttl.equals("Electric shock")) {
        				yourdmgedcable = rng5.nextInt(6) + 12;
        				Thread.sleep(2000);
        				System.out.println("You dealt " + yourdmgedcable + " damage to the enemy Olbap.");
        				olbaphealth = olbaphealth - yourdmgedcable;
        				System.out.println("Enemy Olbap health: " + olbaphealth);
        				if (olbaphealth <= 0) {
        					break;
        				}
        				if (yourhealth <= 0) {
        					break;
        				}
        				continue;
        			}
        			else if (tutrlbttl.equals("Charging up")) {
        				for (;!tutrlbttl.equals("Electric shock");) {
        					System.out.println("Error: Attack is on cooldown. Try again?");
        					tutrlbttl = tutrlbttlObj.nextLine();
        				}
        			}
        			yourdmgedcable = rng5.nextInt(6) + 12;
    				Thread.sleep(2000);
    				System.out.println("You dealt " + yourdmgedcable + " damage to the enemy Olbap.");
    				olbaphealth = olbaphealth - yourdmgedcable;
    				System.out.println("Enemy Olbap health: " + olbaphealth);
    				if (olbaphealth <= 0) {
    					break;
    				}
    				if (yourhealth <= 0) {
    					break;
    				}
    			}
    		}
    	}
    	if (olbaphealth <= 0) {
    		money = money + 15;
			System.out.println("You won the battle and rid the world of one wicked Olbap! Rewards: $15");
			System.out.println("Current amount of money: " +  money);
			winornot = true;
		}
		if (yourhealth <= 0) {
			System.out.println("You lost the battle...");
			winornot = false;
		}
    	break;
    case ("Charging up"):
    	System.out.println("You started charging up. In 2 turns, 30 damage will be dealt to all enemies in addition to your normal attack.");
    	Thread.sleep(2200);
		for (int counterdmgedcable = 0; olbaphealth > 0 && yourhealth > 0 && counterdmgedcable < 1; ++counterdmgedcable) {
			if (olbaphealth <= 0) {
				break;
			}
			if (yourhealth <= 0) {
				break;
			}
			olbapattckdmgedcable = rng5.nextInt(18) + 5;
			Thread.sleep(2000);
			System.out.println("You took " + olbapattckdmgedcable + " damage from the enemy Olbap.");
			yourhealth = yourhealth - olbapattckdmgedcable;
			System.out.println("Your health: " + yourhealth);
			if (olbaphealth <= 0) {
				break;
			}
			if (yourhealth <= 0) {
				break;
			}
			Thread.sleep(2000);
			System.out.println("Your turn:");
			System.out.println("Primary attack: Electric shock[12-18 damage dealt, 5-10 damage chained to other enemies]    Secondary attack: Charging up[On cooldown]");
			tutrlbttl = tutrlbttlObj.nextLine();
			if (!tutrlbttl.equals("Electric shock") && !tutrlbttl.equals("Charging up")) {
				for(; !tutrlbttl.equals("Electric shock") && !tutrlbttl.equals("Charging up");) {
					System.out.println("Error: User input not recognized. Try again?");
					tutrlbttl = tutrlbttlObj.nextLine();
				}
			}
			if (tutrlbttl.equals("Electric shock")) {
				yourdmgedcable = rng5.nextInt(6) + 12;
				Thread.sleep(2000);
				System.out.println("You dealt " + yourdmgedcable + " damage to the enemy Olbap.");
				olbaphealth = olbaphealth - yourdmgedcable;
				System.out.println("Enemy Olbap health: " + olbaphealth);
				if (olbaphealth <= 0) {
					break;
				}
				if (yourhealth <= 0) {
					break;
				}
				continue;
			}
			else if (tutrlbttl.equals("Charging up")) {
				for (;!tutrlbttl.equals("Electric shock");) {
					System.out.println("Error: Attack is on cooldown. Try again?");
					tutrlbttl = tutrlbttlObj.nextLine();
				}
			}
			yourdmgedcable = rng5.nextInt(6) + 12;
			Thread.sleep(2000);
			System.out.println("You dealt " + yourdmgedcable + " damage to the enemy Olbap.");
			olbaphealth = olbaphealth - yourdmgedcable;
			System.out.println("Enemy Olbap health: " + olbaphealth);
			if (olbaphealth <= 0) {
				break;
			}
			if (yourhealth <= 0) {
				break;
			}
		}
		if (olbaphealth <= 0) {
			break;
		}
		if (yourhealth <= 0) {
			break;
		}
		boolean elshornot = false;
		olbapattckdmgedcable = rng5.nextInt(18) + 5;
		Thread.sleep(2000);
		System.out.println("You took " + olbapattckdmgedcable + " damage from the enemy Olbap.");
		yourhealth = yourhealth - olbapattckdmgedcable;
		System.out.println("Your health: " + yourhealth);
		if (olbaphealth <= 0) {
			break;
		}
		if (yourhealth <= 0) {
			break;
		}
		Thread.sleep(2000);
		System.out.println("Your turn:");
		System.out.println("The enemy Olbap took 30 damage.");
		olbaphealth = olbaphealth - 30;
		System.out.println("Enemy Olbap health: " + olbaphealth);
		System.out.println("Primary attack: Electric shock[12-18 damage dealt, 5-10 damage chained to other enemies]    Secondary attack: Charging up[On cooldown]");
		tutrlbttl = tutrlbttlObj.nextLine();
		if (!tutrlbttl.equals("Electric shock") && !tutrlbttl.equals("Charging up")) {
			for (;!tutrlbttl.equals("Electric shock") && !tutrlbttl.equals("Charging up");) {
				System.out.println("Error: User input not recognized. Try again?");
				tutrlbttl = tutrlbttlObj.nextLine();
			}
		}
		if (tutrlbttl.equals("Electric shock")) {
			yourdmgedcable = rng5.nextInt(6) + 12;
			Thread.sleep(2000);
			System.out.println("You dealt " + yourdmgedcable + " damage to the enemy Olbap.");
			olbaphealth = olbaphealth - yourdmgedcable;
			System.out.println("Enemy Olbap health: " + olbaphealth);
			if (olbaphealth <= 0) {
				break;
			}
			if (yourhealth <= 0) {
				break;
			}
			elshornot = true;
		}
		else if (tutrlbttl.equals("Charging up")) {
			for (;!tutrlbttl.equals("Electric shock");) {
				System.out.println("Error: Attack is on cooldown. Try again?");
				tutrlbttl = tutrlbttlObj.nextLine();
			}
		}
		if (elshornot == false) {
			yourdmgedcable = rng5.nextInt(6) + 12;
			Thread.sleep(2000);
			System.out.println("You dealt " + yourdmgedcable + " damage to the enemy Olbap.");
			olbaphealth = olbaphealth - yourdmgedcable;
			System.out.println("Enemy Olbap health: " + olbaphealth);
			if (olbaphealth <= 0) {
				break;
			}
			if (yourhealth <= 0) {
				break;
			}
		}
		for (int cldwnchrgup = 0; cldwnchrgup < 3 ; ++cldwnchrgup) {
			if (olbaphealth <= 0) {
				break;
			}
			if (yourhealth <= 0) {
				break;
			}
			olbapattckdmgedcable = rng5.nextInt(18) + 5;
			Thread.sleep(2000);
			System.out.println("You took " + olbapattckdmgedcable + " damage from the enemy Olbap.");
			yourhealth = yourhealth - olbapattckdmgedcable;
			System.out.println("Your health: " + yourhealth);
			if (olbaphealth <= 0) {
				break;
			}
			if (yourhealth <= 0) {
				break;
			}
			Thread.sleep(2000);
			System.out.println("Your turn:");
			System.out.println("Primary attack: Electric shock[12-18 damage dealt, 5-10 damage chained to other enemies]    Secondary attack: Charging up[On cooldown]");
			tutrlbttl = tutrlbttlObj.nextLine();
			if (!tutrlbttl.equals("Electric shock") && !tutrlbttl.equals("Charging up")) {
				for (;!tutrlbttl.equals("Electric shock") && !tutrlbttl.equals("Charging up");) {
					System.out.println("Error: User input not recognized.");
					tutrlbttl = tutrlbttlObj.nextLine();
				}
			}
			if (tutrlbttl.equals("Electric shock")) {
				yourdmgedcable = rng5.nextInt(6) + 12;
				Thread.sleep(2000);
				System.out.println("You dealt " + yourdmgedcable + " damage to the enemy Olbap.");
				olbaphealth = olbaphealth - yourdmgedcable;
				System.out.println("Enemy Olbap health: " + olbaphealth);
				if (olbaphealth <= 0) {
					break;
				}
				if (yourhealth <= 0) {
					break;
				}
				continue;
			}
			else if (tutrlbttl.equals("Charging up")) {
				for (;!tutrlbttl.equals("Electric shock");) {
					System.out.println("Error: Attack is on cooldown. Try again?");
					tutrlbttl = tutrlbttlObj.nextLine();
				}
			}
			yourdmgedcable = rng5.nextInt(6) + 12;
			Thread.sleep(2000);
			System.out.println("You dealt " + yourdmgedcable + " damage to the enemy Olbap.");
			olbaphealth = olbaphealth - yourdmgedcable;
			System.out.println("Enemy Olbap health: " + olbaphealth);
			if (olbaphealth <= 0) {
				break;
			}
			if (yourhealth <= 0) {
				break;
			}
		}
		for (; olbaphealth > 0 && yourhealth > 0;) {
    		if (olbaphealth <= 0) {
    			break;
    		}
    		if (yourhealth <= 0) {
    			break;
    		}
    		olbapattckdmgedcable = rng5.nextInt(18) + 5;
    		Thread.sleep(2000);
    		System.out.println("You took " + olbapattckdmgedcable + " damage from the enemy Olbap.");
    		yourhealth = yourhealth - olbapattckdmgedcable;
    		System.out.println("Your health: " + yourhealth);
    		if (olbaphealth <= 0) {
    			break;
    		}
    		if (yourhealth <= 0) {
    			break;
    		}
    		Thread.sleep(2000);
    		System.out.println("Your turn:");
    		System.out.println("Primary attack: Electric shock[12-18 damage dealt, 5-10 damage chained to other enemies]    Secondary attack: Charging up[Two turns after the attack is used, 30 damage will be dealt to every enemy, cooldown is 3 turns]");
    		tutrlbttl = tutrlbttlObj.nextLine();
    		if (!tutrlbttl.equals("Electric shock") && !tutrlbttl.equals("Charging up")) {
    			for (;!tutrlbttl.equals("Electric shock") && !tutrlbttl.equals("Charging up");) {
    				System.out.println("Error: User input not recognized. Try again?");
    				tutrlbttl = tutrlbttlObj.nextLine();
    			}
    		}
    		if (tutrlbttl.equals("Electric shock")) {
    			yourdmgedcable = rng5.nextInt(6) + 12;
    			Thread.sleep(2000);
    			System.out.println("You dealt " + yourdmgedcable + " damage to the enemy Olbap.");
    			olbaphealth = olbaphealth - yourdmgedcable;
    			System.out.println("Enemy Olbap health: " + olbaphealth);
    			if (olbaphealth <= 0) {
    				break;
    			}
    			if (yourhealth <= 0) {
    				break;
    			}
    			continue;
    		}
    		else if (tutrlbttl.equals("Charging up")) {
    			System.out.println("You started charging up. In 2 turns, 30 damage will be dealt to all enemies in addition to your normal attack.");
    			for (int counterdmgedcable = 0; olbaphealth > 0 && yourhealth > 0 && counterdmgedcable < 1; ++counterdmgedcable) {
    				if (olbaphealth <= 0) {
    					break;
    				}
    				if (yourhealth <= 0) {
    					break;
    				}
    				olbapattckdmgedcable = rng5.nextInt(18) + 5;
    				Thread.sleep(2000);
    				System.out.println("You took " + olbapattckdmgedcable + " damage from the enemy Olbap.");
    				yourhealth = yourhealth - olbapattckdmgedcable;
    				System.out.println("Your health: " + yourhealth);
    				if (olbaphealth <= 0) {
    					break;
    				}
    				if (yourhealth <= 0) {
    					break;
    				}
    				Thread.sleep(2000);
    				System.out.println("Your turn:");
    				System.out.println("Primary attack: Electric shock[12-18 damage dealt, 5-10 damage chained to other enemies]    Secondary attack: Charging up[On cooldown]");
    				tutrlbttl = tutrlbttlObj.nextLine();
    				if (!tutrlbttl.equals("Electric shock") && !tutrlbttl.equals("Charging up")) {
    					for(; !tutrlbttl.equals("Electric shock") && !tutrlbttl.equals("Charging up");) {
    						System.out.println("Error: User input not recognized. Try again?");
    						tutrlbttl = tutrlbttlObj.nextLine();
    					}
    				}
    				if (tutrlbttl.equals("Electric shock")) {
    					yourdmgedcable = rng5.nextInt(6) + 12;
    					Thread.sleep(2000);
    					System.out.println("You dealt " + yourdmgedcable + " damage to the enemy Olbap.");
    					olbaphealth = olbaphealth - yourdmgedcable;
    					System.out.println("Enemy Olbap health: " + olbaphealth);
    					if (olbaphealth <= 0) {
    						break;
    					}
    					if (yourhealth <= 0) {
    						break;
    					}
    					continue;
    				}
    				else if (tutrlbttl.equals("Charging up")) {
    					for (;!tutrlbttl.equals("Electric shock");) {
    						System.out.println("Error: Attack is on cooldown. Try again?");
    						tutrlbttl = tutrlbttlObj.nextLine();
    					}
    				}
    				yourdmgedcable = rng5.nextInt(6) + 12;
    				Thread.sleep(2000);
    				System.out.println("You dealt " + yourdmgedcable + " damage to the enemy Olbap.");
    				olbaphealth = olbaphealth - yourdmgedcable;
    				System.out.println("Enemy Olbap health: " + olbaphealth);
    				if (olbaphealth <= 0) {
    					break;
    				}
    				if (yourhealth <= 0) {
    					break;
    				}
    			}
    			if (olbaphealth <= 0) {
					break;
				}
				if (yourhealth <= 0) {
					break;
				}
    			elshornot = false;
    			olbapattckdmgedcable = rng5.nextInt(18) + 5;
    			Thread.sleep(2000);
    			System.out.println("You took " + olbapattckdmgedcable + " damage from the enemy Olbap.");
    			yourhealth = yourhealth - olbapattckdmgedcable;
    			System.out.println("Your health: " + yourhealth);
    			if (olbaphealth <= 0) {
    				break;
    			}
    			if (yourhealth <= 0) {
    				break;
    			}
    			Thread.sleep(2000);
    			System.out.println("Your turn:");
    			System.out.println("The enemy Olbap took 30 damage.");
    			olbaphealth = olbaphealth - 30;
    			System.out.println("Enemy Olbap health: " + olbaphealth);
    			System.out.println("Primary attack: Electric shock[12-18 damage dealt, 5-10 damage chained to other enemies]    Secondary attack: Charging up[On cooldown]");
    			tutrlbttl = tutrlbttlObj.nextLine();
    			if (!tutrlbttl.equals("Electric shock") && !tutrlbttl.equals("Charging up")) {
    				for (;!tutrlbttl.equals("Electric shock") && !tutrlbttl.equals("Charging up");) {
    					System.out.println("Error: User input not recognized. Try again?");
    					tutrlbttl = tutrlbttlObj.nextLine();
    				}
    			}
    			if (tutrlbttl.equals("Electric shock")) {
    				yourdmgedcable = rng5.nextInt(6) + 12;
    				Thread.sleep(2000);
    				System.out.println("You dealt " + yourdmgedcable + " damage to the enemy Olbap.");
    				olbaphealth = olbaphealth - yourdmgedcable;
    				System.out.println("Enemy Olbap health: " + olbaphealth);
    				if (olbaphealth <= 0) {
    					break;
    				}
    				if (yourhealth <= 0) {
    					break;
    				}
    				elshornot = true;
    			}
    			else if (tutrlbttl.equals("Charging up")) {
    				for (;!tutrlbttl.equals("Electric shock");) {
    					System.out.println("Error: Attack is on cooldown. Try again?");
    					tutrlbttl = tutrlbttlObj.nextLine();
    				}
    			}
    			if (elshornot == false) {
    				yourdmgedcable = rng5.nextInt(6) + 12;
    				Thread.sleep(2000);
    				System.out.println("You dealt " + yourdmgedcable + " damage to the enemy Olbap.");
    				olbaphealth = olbaphealth - yourdmgedcable;
    				System.out.println("Enemy Olbap health: " + olbaphealth);
    				if (olbaphealth <= 0) {
    					break;
    				}
    				if (yourhealth <= 0) {
    					break;
    				}
    			}
    			for (int cldwnchrgup = 0; cldwnchrgup < 3 ; ++cldwnchrgup) {
    				if (olbaphealth <= 0) {
    					break;
    				}
    				if (yourhealth <= 0) {
    					break;
    				}
    				olbapattckdmgedcable = rng5.nextInt(18) + 5;
        			Thread.sleep(2000);
        			System.out.println("You took " + olbapattckdmgedcable + " damage from the enemy Olbap.");
        			yourhealth = yourhealth - olbapattckdmgedcable;
        			System.out.println("Your health: " + yourhealth);
        			if (olbaphealth <= 0) {
        				break;
        			}
        			if (yourhealth <= 0) {
        				break;
        			}
        			Thread.sleep(2000);
        			System.out.println("Your turn:");
        			System.out.println("Primary attack: Electric shock[12-18 damage dealt, 5-10 damage chained to other enemies]    Secondary attack: Charging up[On cooldown]");
        			tutrlbttl = tutrlbttlObj.nextLine();
        			if (!tutrlbttl.equals("Electric shock") && !tutrlbttl.equals("Charging up")) {
        				for (;!tutrlbttl.equals("Electric shock") && !tutrlbttl.equals("Charging up");) {
        					System.out.println("Error: User input not recognized.");
        					tutrlbttl = tutrlbttlObj.nextLine();
        				}
        			}
        			if (tutrlbttl.equals("Electric shock")) {
        				yourdmgedcable = rng5.nextInt(6) + 12;
        				Thread.sleep(2000);
        				System.out.println("You dealt " + yourdmgedcable + " damage to the enemy Olbap.");
        				olbaphealth = olbaphealth - yourdmgedcable;
        				System.out.println("Enemy Olbap health: " + olbaphealth);
        				if (olbaphealth <= 0) {
        					break;
        				}
        				if (yourhealth <= 0) {
        					break;
        				}
        				continue;
        			}
        			else if (tutrlbttl.equals("Charging up")) {
        				for (;!tutrlbttl.equals("Electric shock");) {
        					System.out.println("Error: Attack is on cooldown. Try again?");
        					tutrlbttl = tutrlbttlObj.nextLine();
        				}
        			}
        			yourdmgedcable = rng5.nextInt(6) + 12;
    				Thread.sleep(2000);
    				System.out.println("You dealt " + yourdmgedcable + " damage to the enemy Olbap.");
    				olbaphealth = olbaphealth - yourdmgedcable;
    				System.out.println("Enemy Olbap health: " + olbaphealth);
    				if (olbaphealth <= 0) {
    					break;
    				}
    				if (yourhealth <= 0) {
    					break;
    				}
    			}
    		}
    	}
    	if (olbaphealth <= 0) {
    		money = money + 15;
			System.out.println("You won the battle and rid the world of one wicked Olbap! Rewards: $15");
			System.out.println("Current amount of money: " +  money);
			winornot = true;
		}
		if (yourhealth <= 0) {
			System.out.println("You lost the battle...");
			winornot = false;
		}
    	break;
    default:
      for (; !tutrlbttl.equals("Heavy hit") && !tutrlbttl.equals("Vicious slice") && !tutrlbttl.equals("Block")
          && !tutrlbttl.equals("Health goes poof") && !tutrlbttl.equals("Leech") && !tutrlbttl.equals("Electric shock")
          && !tutrlbttl.equals("Charging up");) {
        System.out.println("Error: User input not recognized. Try again?");
        tutrlbttl = tutrlbttlObj.nextLine();
      }
    }
    if (winornot == true) {
    	System.out.println("Congratulations on winning!");
    	Thread.sleep(2000);
    }
    else {
    	System.out.println("Oof, let's hope your battle skills get better...");
    	Thread.sleep(2000);
    }
    System.out.println("Anyway, you're now done with the tutorial! Hooray. Now, you gotta get down to the town hall meeting.");
    Thread.sleep(3000);
    System.out.println("You run as fast as you can to the town hall, hoping you aren't late. Thankfully, it looks like you just made it.");
    Thread.sleep(3500);
    System.out.println("You push open the town hall doors. Wow, you think to yourself. You haven't seen these many people together since March. Anyway, time to find a seat. You look around.");
    Thread.sleep(5000);
    System.out.println("					Actions:");
    System.out.println("Talk to Professor Jerry		Talk to Charl		Talk to Lhea		Walk to chair");
    boolean twnhllconvs = false;
    Scanner twnhllObj = new Scanner(System.in);
    while (twnhllconvs == false) {
    	String twnhll = twnhllObj.nextLine();
	    switch (twnhll) {
	    case ("Talk to Professor Jerry"):
	    	System.out.println("Professor Jerry: <Hi there, Drorr. I wonder why Council called this meeting. Why, the last time they've done so was nearly 7 years ago, and even that was an accident!>");
	    	break;
	    case ("Talk to Charl"):
	    	System.out.println("Charl: <Waking up at 5:15 in the mornin' is bad, mkay. Don't wake up at 5:15 in the mornin', mkay.>");
	    	break;
	    case ("Talk to Lhea"):
	    	System.out.println("Lhea: <Arrrgh, why isn't Council just starting the meeting already? It's cold in here and I forget to bring my jacket...>");
	    	break;
	    case ("Walk to chair"):
	    	System.out.println("You walk to the chair and take a seat.");
	    	twnhllconvs = true;
	    	break;
	    default:
	    	System.out.println("Error: User input not recognized. Try again?");
	    	System.out.println("						Actions:");
	    	System.out.println("Talk to Professor Jerry		Talk to Charl		Talk to Lhea		Walk to chair");
	    }
    }
    Thread.sleep(2000);
    System.out.println("A chubby, red-faced man walks to the front of the room and takes his place at the lectern. All conversations stop and the room is quiet as the man clears his throat. You realize who the man is. He's Daniel Forrent, head of Council. Council is the governing body of your town, Reo-Nonepre.");
    Thread.sleep(7000);
    System.out.println("Daniel Forrent: <Good morning, citizens. I apologize for waking you all up so early, but I'm afraid you'll have to get used to it in the following months. He pauses. You see, this morning a missive arrived at my home. It was from a government in the Farlands.>");
    Thread.sleep(6800);
    System.out.println("Conversations begin again in low voices. Many people look intrigued. Those who had dozed off sit up in their chairs as if 5000 volts of electricity had gone through their bodies.");
    Thread.sleep(6200);
    System.out.println("Daniel Forrent: <Yes, the Farlands. For those of you who don't know what they are, they are a cluster of islands far, far from here. We first began contact with them only a few decades ago. At any rate, they have told us that they believe that Volseratan has risen.>");
    Thread.sleep(7000);
    System.out.println("Daniel Forrent: <I don't expect any of you to know who that is, so let me briefly give all of you a quick refresher on Trisenaii's history.>");
    Thread.sleep(6000);
  }
}