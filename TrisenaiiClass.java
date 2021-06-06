package trisenaii;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.lang.Thread;
import java.util.Scanner;
import java.util.Random;

class pubstatints {
  public static String data;
  public static int location;
  public static boolean successornot;
}

class createandwriteFile extends Thread {
  public void run() {
	  File inv = new File("inventory.txt");
      try {
		if (inv.createNewFile()) {
		    pubstatints.successornot = true;
		  } else {
		    pubstatints.successornot = false;
		  }
	} catch (IOException e) {}
  }
    /*
     * String heavystick = "Heavy stick"; String policebaton = "Police baton";
     * String wackywhacker = "Wacky whacker™"; String velociraptortooth =
     * "Velociraptor tooth"; String woodensword = "Wooden sword"; String ironsword =
     * "Iron sword"; String streetmagicianwand = "Street magician wand"; String
     * magestaff = "Mage staff"; String houdinisscepter = "Houdini's scepter";
     * String damagedcable = "Damaged cable"; String lightningrod = "Lightning rod";
     * String zeuslightningbolt = "Zeus' lightning bolt"; try { FileWriter newWriter
     * = new FileWriter("inventory.txt"); newWriter.close(); } catch (Exception e)
     * {}
     */
  }

class readFile extends Thread {
  public void run() {
    try {
      File inv = new File("inventory.txt");
      Scanner newReader = new Scanner(inv);
      while (newReader.hasNextLine()) {
        pubstatints.data = newReader.nextLine();
      }
      newReader.close();
    } catch (FileNotFoundException e) {
    }
  }
}

class menu extends Thread {
  public void run() {
    Scanner anytimeObj = new Scanner(System.in);
    String quit = "Quit";
    String menu = "Menu";
    for (int i = 10; i > 0;) {
      String typeanytime = anytimeObj.nextLine();
      if (typeanytime.equals(quit)) {
        break;
      }
      if (typeanytime.equals(menu)) {
        System.out.println("\n");
        System.out.println("Menu:");
        try {
          File inv = new File("inventory.txt");
          Scanner newReader = new Scanner(inv);
          System.out.println("Items in inventory:");
          while (newReader.hasNextLine()) {
            pubstatints.data = newReader.nextLine();
            System.out.println(pubstatints.data);
          }
          newReader.close();
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
      inv.delete();
    }
    readFile rf = new readFile();
    createandwriteFile cwf = new createandwriteFile();
    menu mnu = new menu();
    cwf.start();
    rf.start();
    System.out.print("\033[H\033[2J");
    if (pubstatints.successornot == true) {
      System.out.println("Game files created successfully.");
      Thread.sleep(1000);
    } else {
      System.out.println("Error: At least one file has not been successfully created. Parts of the game might not work correctly. Please try restarting the program.");
      Thread.sleep(86400000);
    }
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
    }
    Thread.sleep(3000);
    System.out.println("You yawn, stretch, get dressed, and open the door.");
    Thread.sleep(4500);
    System.out.println("Whoever was knocking on your door is gone. There is a note taped to the door, however.");
    Thread.sleep(4500);
    System.out.println("The note reads: ATTENTION, CITIZEN. You have been woken at this untimely hour to report immediately at the town hall for a town meeting. Make haste!");
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
    System.out.println("Now let's get started on decisions. Throughout the game, you'll be presented with a few choices about what to do in a situation. You will have to type the choice you choose. When you have options to talk to NPCs, to get out of the situation, type 'Walk' to walk away.");
    Thread.sleep(6000);
    System.out.println("Example:");
    Thread.sleep(4000);
    System.out.println("You arrive at Berryblood Street, Lichalade. Looks like there's a few people about.");
    Thread.sleep(4000);
    System.out.println("                      Actions:");
    System.out.println("Walk               Talk to man               Talk to other man               Talk to woman            Talk to other woman");
    String walk = "Walk";
    String talktoman = "Talk to man";
    String talktootherman = "Talk to other man";
    String talktowoman = "Talk to woman";
    String talktootherwoman = "Talk to other woman";
    boolean done = false;
    Scanner tutorialObj = new Scanner(System.in);
    while (done == false) {
      String tutorialexample = tutorialObj.nextLine();
      if (tutorialexample.equals(walk)) { // walk
        System.out.println("You walk past the people.");
        done = true;
      } else if (tutorialexample.equals(talktoman)) {// man
        System.out.println("Man: <Welcome, stranger!>");
      } else if (tutorialexample.equals(talktootherman)) {// talktootherman
        System.out.println("Other man: <What 'r you lookin' at?>");
      } else if (tutorialexample.equals(talktowoman)) {// woman
        System.out.println("Woman: <Nice weather, isn't it?>");
      } else if (tutorialexample.equals(talktootherwoman)) {// otherwoman
        System.out.println("Other woman: <Tutorials sure are stupid, aren't they? They always treat you like you're five and it's your first videogame.>");
      } else { // wrong
        System.out.println("Error: User input not recognized. Try again?");
        System.out.println("                      Actions:");
        System.out.println("Walk               Talk to man               Talk to other man               Talk to woman            Talk to other woman");
      }
    }
    Thread.sleep(4000);
    System.out.println("Let's talk about the menu now. The menu contains important things you may want to know about your character. For example, if you want to check your inventory, you can type in 'Menu' to go to the menu and see what's in your inventory. To close the menu,just type 'Quit'.You can open the menu at any point in the game. Now, you try opening the menu.");
    mnu.start();
    mnu.join();
    System.out.println("Finally, we arrive at the fun part: BATTLES! To discuss that, however, we have to go over weapons. All weapons have a primary attack and a secondary attack (except clubs, which just have a primary attack). Primary attacks deal damage, while secondary attacks can be pretty much anything, from increasing attacking damage,to blocking enenmy attacks. Keep in mind that the status effects secondary attacks give you (block, damage up, etc.) usually just last for a turn or two.");
    Thread.sleep(18000);
    System.out.println("There are 4 different types of weapons.");
    System.out.println("First weapon type: Clubs. These only deal damage, and have no secondary attacks. The damage they do deal, however, is the most of any weapon type.");
    Thread.sleep(4000);
    System.out.println("Second weapon type: Swords. Their primary attacks deal damage, and their secondary attacks block enemy attacks, which lowers the amount of damage an enemy deals to you.");
    Thread.sleep(4000);
    System.out.println("Third weapon type: Magic weapons. Their primary attacks deal damage. Unlike the other weapon types, the secondary attacks for these change from weapon to weapon. For example, one magic weapon's secondary attack might be leeching an enemy's health, while another's would be, well, different from that.");
    Thread.sleep(5000);
    System.out.println("Fourth and final weapon type: Electric weapons. Their primary attacks deal damage and chain damage to other enemies if there are more than one. Their secondary attacks increase attack damage.");
    Thread.sleep(5000);
    System.out.println("This tutorial's already gone on for long enough. Let's end it by pitting you against an Olbap, a pretty common enemy in the game. Which starter weapon do you choose to use to fight against it and use in the game until you find a better weapon? (You can always switch weapon types. For example, just because you picked the starter sword right now doesn't mean you can't use electric weapons later on.)");
    Thread.sleep(6000);
    System.out.println("                      Weapons:");
    System.out.println("Heavy stick (club)     Velociraptor tooth (sword)     Street magician wand (magic weapon)    Damaged cable (electric weapon)");
    System.out.println("Type in the name of the weapon you want. Don't type in the weapon type it belongs to. For example, just type 'Damaged cable'.");
    String heavystick = "Heavy stick";
    String velociraptortooth = "Velociraptor tooth";
    String streetmagicianwand = "Street magician wand";
    String damagedcable = "Damaged cable";
    FileWriter newWriter = new FileWriter("inventory.txt");
    boolean exitforloop = false;
    Scanner startwponObj = new Scanner(System.in);
    String startwponpick = startwponObj.nextLine();
    for (; !exitforloop;) {
      exitforloop = true;
      switch (startwponpick) {
      case "Heavy stick":
        System.out.println("Your starter weapon: " + heavystick);
        newWriter.write(heavystick);
        newWriter.write("\n");
        newWriter.close();
        break;
      case "Velociraptor tooth":
        System.out.println("Your starter weapon: " + velociraptortooth);
        newWriter.write(velociraptortooth);
        newWriter.write("\n");
        newWriter.close();
        break;
      case "Street magician wand":
        System.out.println("Your starter weapon: " + streetmagicianwand);
        newWriter.write(streetmagicianwand);
        newWriter.write("\n");
        newWriter.close();
        break;
      case "Damaged cable":
        System.out.println("Your starter weapon: " + damagedcable);
        newWriter.write(damagedcable);
        newWriter.write("\n");
        newWriter.close();
        break;
      default:
        exitforloop = false;
        for (; !startwponpick.equals(heavystick) && !startwponpick.equals(velociraptortooth)
            && !startwponpick.equals(streetmagicianwand) && !startwponpick.equals(damagedcable);) {
          System.out.println("Error: User input not recognized. Try again?");
          startwponpick = startwponObj.nextLine();
        }
      }
    } // exitforloop end
    System.out.println("Battle time!");
    Thread.sleep(4000);
    System.out.print("\033[H\033[2J");
    int olbaphealth = 75;
    int yourhealth = 50;
    int money = 0;
    System.out.println("Enemy Olbap health: " + olbaphealth);
    System.out.println("Your health: " + yourhealth);
    System.out.println("Your turn:");
    switch (startwponpick) {
    case "Heavy stick":
      System.out.println("Primary attack: Heavy hit[20-30 damage dealt]");
      break;
    case "Velociraptor tooth":
      System.out.println("Primary attack: Vicious slice[15-20 damage dealt]   Secondary attack: Block[1/4 less damage taken from enemy attacks, 1 turn]");
      break;
    case "Street magician wand":
      System.out.println("Primary attack: Health goes poof[10-15 damage dealt]    Secondary attack: Leech[+8-10 health per attack, 2 turns]");
      break;
    case "Damaged cable":
      System.out.println("Primary attack: Electric shock[10 damage dealt, 5-10 damage chained to other enemies]  Secondary attack: Static touch[+5 damage dealt, 2 turns]");
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
    int yourdmgevelotth = rng2.nextInt(5) + 15;
    Random rng3 = new Random();
    int olbapattckdmgevt = rng3.nextInt(18) + 5;
    int olbapdcreasedmgebruh = olbapattckdmgevt/4;
    int olbapdcreasedmge = olbapattckdmgevt - olbapdcreasedmgebruh;
    switch (tutrlbttl) {
    case "Heavy hit":
      yourdmgeheavystick = rng1.nextInt(10) + 20;
      Thread.sleep(2000);
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
      }
      if (yourhealth <= 0) {
        System.out.println("You lost the battle... kinda nooby ngl");
      }
      break;
    case "Vicious slice":
      yourdmgevelotth = rng2.nextInt(5) + 15;
      Thread.sleep(2000);
      System.out.println("You dealt " + yourdmgevelotth + " damage to the enemy Olbap.");
      olbaphealth = olbaphealth - yourdmgevelotth;
      System.out.println("Enemy Olbap health: " + olbaphealth);
      for (; olbaphealth > 0 && yourhealth > 0;) {
        olbapattckdmgevt = rng3.nextInt(18) + 5;
        Thread.sleep(2000);
        System.out.println("You took " + olbapattckdmgevt + " damage from the enemy Olbap.");
        yourhealth = yourhealth - olbapattckdmgevt;
        System.out.println("Your health: " + yourhealth);
        Thread.sleep(2000);
        System.out.println("Your turn:");
        System.out.println("Primary attack: Vicious slice[15-20 damage dealt]   Secondary attack: Block[1/4 less damage taken from enemy attacks, 1 turn]");
        tutrlbttl = tutrlbttlObj.nextLine();
        if (!tutrlbttl.equals("Vicious slice") && !tutrlbttl.equals("Block")) {
          for (; !tutrlbttl.equals("Vicious slice") && !tutrlbttl.equals("Block");) {
            System.out.println("Error: User input not recognized. Try again?");
            tutrlbttl = tutrlbttlObj.nextLine();
          }
        }
        if (tutrlbttl.equals("Vicious slice")) {
          yourdmgevelotth = rng2.nextInt(5) + 15;
          Thread.sleep(2000);
          System.out.println("You dealt " + yourdmgevelotth + " damage to the enemy Olbap.");
          olbaphealth = olbaphealth - yourdmgevelotth;
          System.out.println("Enemy Olbap health: " + olbaphealth);
          continue;
        } else if (tutrlbttl.equals("Block")) {
          System.out.println("You blocked. The damage that incoming enemy attacks will do to you will be reduced by 1/4.");
          for (int counter = 0; olbaphealth > 0 && yourhealth > 0 && counter < 2; ++counter) {
            olbapattckdmgevt = rng3.nextInt(18) + 5;
            olbapdcreasedmgebruh = olbapattckdmgevt / 4;
            olbapdcreasedmge = olbapattckdmgevt - olbapdcreasedmgebruh;
            Thread.sleep(2000);
            System.out.println("You took " + olbapdcreasedmge + " damage from the enemy Olbap.");
            yourhealth = yourhealth - olbapdcreasedmge;
            System.out.println("Your health: " + yourhealth);
            Thread.sleep(2000);
            System.out.println("Your turn:");
            System.out.println("Primary attack: Vicious slice[15-20 damage dealt]   Secondary attack: Block[On cooldown]");
            tutrlbttl = tutrlbttlObj.nextLine();
            if (tutrlbttl.equals("Vicious slice")) {
              yourdmgevelotth = rng2.nextInt(5) + 15;
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
            yourdmgevelotth = rng2.nextInt(5) + 15;
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
            Thread.sleep(2000);
            System.out.println("Your turn:");
            System.out.println("Primary attack: Vicious slice[15-20 damage dealt]   Secondary attack: Block[On cooldown]");
            tutrlbttl = tutrlbttlObj.nextLine();
            if (tutrlbttl.equals("Vicious slice")) {
              yourdmgevelotth = rng2.nextInt(5) + 15;
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
            yourdmgevelotth = rng2.nextInt(5) + 15;
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
      }
      if (yourhealth <= 0) {
        System.out.println("You lost the battle... kinda nooby ngl");
      }
      break;
    case "Block":
      System.out.println("You blocked. The damage that incoming enemy attacks will do to you will be reduced by 1/4.");
      for (int counter = 0; olbaphealth > 0 && yourhealth > 0 && counter < 2; ++counter) {
        olbapattckdmgevt = rng3.nextInt(18) + 5;
        olbapdcreasedmgebruh = olbapattckdmgevt / 4;
        olbapdcreasedmge = olbapattckdmgevt - olbapdcreasedmgebruh;
        Thread.sleep(2000);
        System.out.println("You took " + olbapdcreasedmge + " damage from the enemy Olbap.");
        yourhealth = yourhealth - olbapdcreasedmge;
        System.out.println("Your health: " + yourhealth);
        Thread.sleep(2000);
        System.out.println("Your turn:");
        System.out.println("Primary attack: Vicious slice[15-20 damage dealt]   Secondary attack: Block[On cooldown]");
        tutrlbttl = tutrlbttlObj.nextLine();
        if (tutrlbttl.equals("Vicious slice")) {
          yourdmgevelotth = rng2.nextInt(5) + 15;
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
        yourdmgevelotth = rng2.nextInt(5) + 15;
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
        Thread.sleep(2000);
        System.out.println("Your turn:");
        System.out.println("Primary attack: Vicious slice[15-20 damage dealt]   Secondary attack: Block[On cooldown]");
        tutrlbttl = tutrlbttlObj.nextLine();
        if (tutrlbttl.equals("Vicious slice")) {
          yourdmgevelotth = rng2.nextInt(5) + 15;
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
        yourdmgevelotth = rng2.nextInt(5) + 15;
        Thread.sleep(2000);
        System.out.println("You dealt " + yourdmgevelotth + " damage to the enemy Olbap.");
        olbaphealth = olbaphealth - yourdmgevelotth;
        System.out.println("Enemy Olbap health: " + olbaphealth);
      }
      if (olbaphealth <= 0) {
        money = money + 15;
        System.out.println("You won the battle and rid the world of one wicked Olbap! Rewards: $15");
      }
      if (yourhealth <= 0) {
        System.out.println("You lost the battle... kinda nooby ngl");
      }
      for (; olbaphealth > 0 && yourhealth > 0;) {
        olbapattckdmgevt = rng3.nextInt(18) + 5;
        Thread.sleep(2000);
        System.out.println("You took " + olbapattckdmgevt + " damage from the enemy Olbap.");
        yourhealth = yourhealth - olbapattckdmgevt;
        System.out.println("Your health: " + yourhealth);
        Thread.sleep(2000);
        System.out.println("Your turn:");
        System.out.println("Primary attack: Vicious slice[15-20 damage dealt]   Secondary attack: Block[1/4 less damage taken from enemy attacks, 1 turn]");
        tutrlbttl = tutrlbttlObj.nextLine();
        if (!tutrlbttl.equals("Vicious slice") && !tutrlbttl.equals("Block")) {
          for (; !tutrlbttl.equals("Vicious slice") && !tutrlbttl.equals("Block");) {
            System.out.println("Error: User input not recognized. Try again?");
            tutrlbttl = tutrlbttlObj.nextLine();
          }
        }
        if (tutrlbttl.equals("Vicious slice")) {
          yourdmgevelotth = rng2.nextInt(5) + 15;
          Thread.sleep(2000);
          System.out.println("You dealt " + yourdmgevelotth + " damage to the enemy Olbap.");
          olbaphealth = olbaphealth - yourdmgevelotth;
          System.out.println("Enemy Olbap health: " + olbaphealth);
          continue;
        } else if (tutrlbttl.equals("Block")) {
          System.out.println("You blocked. The damage that incoming enemy attacks will do to you will be reduced by 1/4.");
          for (int counter = 0; olbaphealth > 0 && yourhealth > 0 && counter < 2; ++counter) {
            olbapattckdmgevt = rng3.nextInt(18) + 5;
            olbapdcreasedmgebruh = olbapattckdmgevt / 4;
            olbapdcreasedmge = olbapattckdmgevt - olbapdcreasedmgebruh;
            Thread.sleep(2000);
            System.out.println("You took " + olbapdcreasedmge + " damage from the enemy Olbap.");
            yourhealth = yourhealth - olbapdcreasedmge;
            System.out.println("Your health: " + yourhealth);
            Thread.sleep(2000);
            System.out.println("Your turn:");
            System.out.println("Primary attack: Vicious slice[15-20 damage dealt]   Secondary attack: Block[On cooldown]");
            tutrlbttl = tutrlbttlObj.nextLine();
            if (tutrlbttl.equals("Vicious slice")) {
              yourdmgevelotth = rng2.nextInt(5) + 15;
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
            yourdmgevelotth = rng2.nextInt(5) + 15;
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
            Thread.sleep(2000);
            System.out.println("Your turn:");
            System.out.println("Primary attack: Vicious slice[15-20 damage dealt]   Secondary attack: Block[On cooldown]");
            tutrlbttl = tutrlbttlObj.nextLine();
            if (tutrlbttl.equals("Vicious slice")) {
              yourdmgevelotth = rng2.nextInt(5) + 15;
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
            yourdmgevelotth = rng2.nextInt(5) + 15;
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
      }
      if (yourhealth <= 0) {
        System.out.println("You lost the battle... kinda nooby ngl");
      }
      break;
    case "":
    default:
      for (; !tutrlbttl.equals("Heavy hit") && !tutrlbttl.equals("Vicious slice") && !tutrlbttl.equals("Block")
          && !tutrlbttl.equals("Health goes poof") && !tutrlbttl.equals("Leech") && !tutrlbttl.equals("Electric shock")
          && !tutrlbttl.equals("Static touch");) {
        System.out.println("Error: User input not recognized. Try again?");
        tutrlbttl = tutrlbttlObj.nextLine();
      }
    }
  }
}