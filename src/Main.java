import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        Gameplay newgameplay = new Gameplay();
        Scanner keyboard = new Scanner(System.in);
        int multi = 0;
        int baseDamage = 2;
       System.out.println("Our story begins in a tavern \nA collection of rouges is being put together to challenge draconus a massive dragon with tons\nof treasure the king wants returned \n And who are you ");
        System.out.println("Class choices: \n Archer || Thief || Soldier || Mage");
        int num = 0;
        String playerClass;
        do {
        System.out.print("Enter your class: ");
         playerClass = keyboard.nextLine();

            switch (playerClass) {
                case "Archer":
                    num++;
                    break;
                case "Thief":
                    num++;
                    break;
                case "Soldier":
                    num++;
                    break;
                case "Mage":
                    num++;
                    break;
                default:
                    System.out.println("Enter a valid class ");
                    break;
            }
        } while (num == 0);


        System.out.print("Enter Name: ");
        String playerName = keyboard.nextLine();
        if( playerName.isEmpty())
        {
            playerName = "Blank";
        }

        System.out.println("You are "+ playerName+ " a "+ playerClass);

        System.out.println("LOADING AREA: CAVE");

        newgameplay.introduction();
        String d = keyboard.nextLine();

        boolean dec = newgameplay.decision(d);
        if( dec == false)
        {
            System.out.println("The ground beneath you gives way\nYou fall to your doom");
            System.exit(0);
        }else System.out.println("Ah you're finally awake\nsays the gerblin\nCome closer to my fire we have much to discuss ");

        newgameplay.quest();
        String d2 = keyboard.nextLine();
        boolean dec2 = newgameplay.decision(d2);
        if (dec2 = false)
        {
            System.out.println("You get thrown into fire for your impatience");
            System.exit(0);
        } else System.out.println("\"Well then ill take that as a yes\" says the goblin");

        System.out.println("You see there's an heirloom ive lost a coin some pesky rabbit has stolen it if you can retrive it ill tell you which way the Black Spider was headed now run off ");
        System.out.println("Do you ask for some supplies for your quest");
        String d3 = keyboard.nextLine();
        boolean dec3 = newgameplay.decision(d3);
        if (dec3 = false)
        {
            System.out.println("You leave in a hurry.");
        } else {
            System.out.println("What oh well heres some gerblin wine and a cut of mysterioussss sausege i swear its not your friends");
            System.out.println("You are invigorated by the subpar meal you gain a bonus ");
            multi = rand.nextInt(4) +2;
            System.out.println("You get a "+ multi +"x Multiplier to damage" );
        }

        System.out.println("LOADING AREA: MARKARTH FOREST ");

        System.out.println("You leave the cave and you find yourself in a wooded area walking north oyu find rolling greens perfect country side");
        System.out.println("You find a small group of rabbits one with defined musculature and a shiny piece of metal in its mouth you ready your weapon");

        String enemy1 = "Buff Bunny";
        int rabbitHealth = 25;

        newgameplay.battle(multi,baseDamage, rabbitHealth, enemy1);
        System.out.println("Congratulations you have murdered and recovered the COIN was it worth it???");
        System.out.println("Coin added to pocket You return to the cave");

        System.out.println("You make your way back to the cave: ");
        System.out.println("Tutorial ended eject disc 1 insert disc 2");

    }
}


