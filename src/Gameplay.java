
public class Gameplay {

    public void introduction()
    {
        System.out.println("You wake up in a dark cave head throbbing and unable to remember anything from the last day");
        System.out.println("You get up and fumble around hugging the closest wall until you see a dim source of light");
        System.out.println("Do you move closer ?");
    }

    public boolean decision(String decision)
    {
     if (decision.charAt(0) == 'Y' ||decision.charAt(0) == 'L')
     {
         return true;
     }else return false;
    }

    public void quest() {
        System.out.println("I know what you might be thinking but I have not hurt you");
        System.out.println("You and your idiot friends decided to descend into this cavern looking for treasure got lost without a map");
        System.out.println("Unsurprisingly you guys got lost so it didnt take long for you to get hurt");
        System.out.println("This is a dangerous area these are the hunting grounds of The Black Spider a powerful mage with a hatred of dwarves");
        System.out.println("He used paralysis and stunned both of your buddies and took them with him");
        System.out.println("I symphatize with your situation but Im also in need of a favor");
        System.out.println("Do you LISTEN to him 'Y' or DEMAND for the location of your Kin 'N': ");
    }

    public void battle(int muliplier , int damage, int enemyHealth, String enemy)
    {

       for (int i = 0; i < 10;i++ )
       {
           System.out.println("You strike the "+ enemy +" and do "+ damage*muliplier + " damage");
           enemyHealth -= (damage*muliplier);
           if(enemyHealth <= 0) enemyHealth =0;
           System.out.println("The "+enemy+" has "+enemyHealth+" hit points left");
          if(enemyHealth == 0)T
          {
              System.out.println("You have landed the killing blow Battle mode is over");
              break;
          }
       }

    }
}
