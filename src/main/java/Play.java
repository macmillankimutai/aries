import java.util.Random;
import java.util.Scanner;
public class Play
{
    public Play()
    {

    }
    public void Start(int diff)
    {
      String words[] = new String[26];
      String hints[] = new String[26];
      switch(diff)
      {
        case 1:

          words[0] = "cat";
          hints[0] = "Animal";
          words[1] = "dog";
          hints[1] = "Animal";
          words[2] = "book";
          hints[2] = "Reading";
          words[3] = "breakfeast";
          hints[3] = "Meals";
          words[4] = "telephone";
          hints[4] = "Communication";
          words[5] = "mixture";
          hints[5] = "Noun";
          words[6] = "music";
          hints[6] = "Form of Expression";
          words[7] = "animal";
          hints[7] = "Think cat, dog, tiger, etc.";
          words[8] = "school";
          hints[8] = "Building";
          words[9] = "plant";
          hints[9] = "Think grass, tree, flower, etc.";
          words[10] = "pen";
          hints[10] = "Office tool.";
          words[11] = "pencil";
          hints[11] = "Office tool.";
          words[12] = "paper";
          hints[12] = "Office tool.";
          words[13] = "note";
          hints[13] = "You can pass it around.";
          words[14] = "fog";
          hints[14] = "Form of percipitation.";
          words[15] = "smoke";
          hints[15] = "Comes from fire.";
          words[16] = "bake";
          hints[16] = "Cooking.";
          words[17] = "alone";
          hints[17] = "Without Others.";
          words[18] = "drive";
          hints[18] = "Car.";
          words[19] = "town";
          hints[19] = "Form of community.";
          words[20] = "city";
          hints[20] = "Form of community.";
          words[21] = "sunny";
          hints[21] = "Sunlight.";
          words[22] = "shine";
          hints[22] = "Glisten.";
          words[23] = "polish";
          hints[23] = "Clean.";
          words[24] = "cap";
          hints[24] = "Head.";
          words[25] = "hat";
          hints[25] = "Head.";
          break;
        case 2:
          words[0] = "president";
          hints[0] = "Leader.";
          words[1] = "exclamation";
          hints[1] = "Shout out.";
          words[2] = "statement";
          hints[2] = "To say.";
          words[3] = "television";
          hints[3] = "You watch it.";
          words[4] = "physics";
          hints[4] = "Form of Science.";
          words[5] = "algebra";
          hints[5] = "Form of math.";
          words[6] = "geometry";
          hints[5] = "Form of math.";
          words[7] = "difficult";
          hints[7] = "Hard.";
          words[8] = "extreme";
          hints[8] = "Intense.";
          words[9] = "procedure";
          hints[9] = "Steps.";
          words[10] = "ship";
          hints[10] = "Big Boat.";
          words[11] = "soldier";
          hints[11] = "Army.";
          words[12] = "lunch";
          hints[12] = "Meal.";
          words[13] = "hockey";
          hints[13] = "Sports.";
          words[14] = "tennis";
          hints[14] = "Sports.";
          words[15] = "soccer";
          hints[15] = "Sports.";
          words[16] = "football";
          hints[16] = "Sports.";
          words[17] = "basketball";
          hints[17] = "Sports.";
          words[18] = "bias";
          hints[18] = "One sided.";
          words[19] = "magazine";
          hints[19] = "Form of book.";
          words[20] = "computer";
          hints[20] = "Microsoft.";
          words[21] = "internet";
          hints[21] = "World Wide Web.";
          words[22] = "allegedly";
          hints[22] = "Supposedly.";
          words[23] = "system";
          hints[23] = "Network.";
          words[24] = "unison";
          hints[24] = "As one.";
          words[25] = "excited";
          hints[25] = "Upbeat.";
          break;
        case 3:
          words[0] = "amalgamation";
          hints[0] = "Mixture.";
          words[1] = "proclomation";
          hints[1] = "Proclaim.";
          words[2] = "establishment";
          hints[2] = "Institution.";
          words[3] = "rehabilitation";
          hints[3] = "Reform.";
          words[4] = "rhinoceros";
          hints[4] = "Animal.";
          words[5] = "velociraptor";
          hints[5] = "Dinosaur.";
          words[6] = "declaration";
          hints[6] = "Declare.";
          words[7] = "announcement";
          hints[7] = "Announce.";
          words[8] = "binomial";
          hints[8] = "Form of monomial.";
          words[9] = "polynomial";
          hints[9] = "Form of trinomial.";
          words[10] = "congregation";
          hints[10] = "Group.";
          words[11] = "obligation";
          hints[11] = "Required.";
          words[12] = "structure";
          hints[12] = "Anatomy.";
          words[13] = "description";
          hints[13] = "Describe.";
          words[14] = "perscription";
          hints[14] = "Perscribe.";
          words[15] = "subscribe";
          hints[15] = "Join.";
          words[16] = "address";
          hints[16] = "Place.";
          words[17] = "township";
          hints[17] = "Multiple Schools.";
          words[18] = "mischievous";
          hints[18] = "Sneaky.";
          words[19] = "bewildered";
          hints[19] = "Puzzled, Confused.";
          words[20] = "accusation";
          hints[20] = "To Conclude.";
          words[21] = "designation";
          hints[21] = "Assign.";
          words[22] = "disgusting";
          hints[22] = "Nasty, Gross.";
          words[23] = "prolonged";
          hints[23] = "Extend.";
          words[24] = "restoration";
          hints[24] = "Rebuild.";
          words[25] = "regeneration";
          hints[25] = "To Be Reborn.";
      }
      String word;
      Random rand = new Random();
      int w1 = rand.nextInt(26);
      word = words[w1];
      String hint = hints[w1];
      String guess = "";
      int wl = word.length()+1;
      for(int i=1;i<wl;i++)
      {
        guess += "-";
      }
      String lu = "";
      int tt = 0;
      boolean canPlay = true;
      Main(guess, tt, canPlay, lu, word, hint);
    }
    public void Main(String guess, int tt, boolean canPlay, String lu, String word, String hint)
    {
      if(tt==6)
      {
       canPlay = false;
       Lose();
      }else{
        String man[] = new String[7];
        man[0] = " --\n   |\n   |\n   |\n_____\n";
        man[1] = " --\n o |\n   |\n   |\n_____\n";
        man[2] = " --\n o |\n/  |\n   |\n_____\n";
        man[3] = " --\n o |\n/| |\n   |\n_____\n";
        man[4] = " --\n o |\n/|\\|\n   |\n_____\n";
        man[5] = " --\n o |\n/|\\|\n/  |\n_____\n";
        man[6] = " --\n o |\n/|\\|\n/ \\|\n_____\n";
        char g1[] = guess.toCharArray();
        char w2[] = word.toCharArray();
        System.out.println(man[0]);
        for(int x=0;x<g1.length;x++)
        {
          System.out.print(g1[x]);
        }
        System.out.println();
        Guess(guess, tt, canPlay, lu, word, g1, w2, man, hint);
       }
    }
    public void Guess(String guess, int tt, boolean canPlay, String lu, String word, char g1[], char w2[], String man[], String hint)
    {
        String tg1 = new String(g1);
        String tg2 = new String(w2);
        if(tg1.equals(tg2))
        {
        Win();
        }else{
        if(tt == 6)
        {
          System.out.println("\n\nYou Lost! The word was: "+word);

          Lose();
        }else{
      Scanner input = new Scanner(System.in);
      System.out.print("Guess("+hint+"): ");
      String letter = input.next();
      if(word.contains(letter))
      {
        if(lu.contains(letter))
        {
          tt +=1;
          System.out.println("Wrong!");
        }else{
        int wl = word.length();
        for(int i=0;i<wl;i++)
        {
          char aChar = letter.charAt(0);
          char bChar = w2[i];
          if(bChar==aChar)
          {
            g1[i] = aChar;
          }
        }
       }
      }else{
        tt +=1;
        System.out.println("Wrong!");
        lu += letter;
      }
      System.out.println();
      System.out.println(man[tt]);
      for(int x=0;x<g1.length;x++)
        {
          System.out.print(g1[x]);
        }
        System.out.println("\n\n");
        lu += letter;
        Guess(guess, tt, canPlay, lu, word, g1, w2, man, hint);
        }
      }
    }
    public void Lose()
    {
      Scanner input1 = new Scanner(System.in);
      System.out.print("\nPlay Again?(Y/N): ");
      String pa1 = input1.next();
      if(pa1.contains("y") || pa1.contains("Y"))
      {
        System.out.print("\nDifficulty(1-3): ");
        int diff1 = input1.nextInt();
        Start(diff1);
      }else{
      }
    }
    public void Win()
    {
    System.out.println("\n\n\\o/\n | \n/ \\");
      System.out.println("You Won!\n");
      Scanner input2 = new Scanner(System.in);
      System.out.print("\nPlay Again?(Y/N): ");
      String pa = input2.next();
      if(pa.contains("y") || pa.contains("Y"))
      {
        System.out.print("\nDifficulty(1-3): ");
        int diff2 = input2.nextInt();
        Start(diff2);
      }else{
      }
    }
}
