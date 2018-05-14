import java.util.Scanner;
class Hangman
{
  public static void main(String[] args)
  {
    Scanner guess = new Scanner(System.in);
    System.out.println("Welcome to Hangman");
    System.out.println("Difficulty(1-3): ");
    int diff = guess.nextInt();
    if(diff==1)
    {
      Play obj = new Play();
        obj.Start(diff);
    }else{
      if(diff==2)
      {
        Play obj = new Play();
        obj.Start(diff);
      }else{
        Play obj = new Play();
        obj.Start(3);
      }
    }
    switch (diff)
    {
      case 1:
        Play obj = new Play();
        obj.Start(diff);
        break;
      case 2:
        Play obj = new Play();
        obj.Start(diff);
        break;
      case 3:
        Play obj = new Play();
        obj.Start(diff);
        break;
      default:
        Play obj = new Play();
        obj.Start(diff);
    }
  }
}
