import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;


  class Main {

    //Static ArrayList
  public static ArrayList<String> tools = new ArrayList<String>();
 public static Scanner sc = new Scanner(System.in);
     static  int random = (int)(Math.random()*Main.tools.size());
   static Boolean  Userchoice = true;

  public static void main(String[] args) {


    String sword = "Sword";
    Main.tools.add(sword);
    String hammer = "Hammer";
    Main.tools.add(hammer);
    String dagger = "Dagger";
    Main.tools.add(dagger);

  
   while (Userchoice) {
    //Call static method from menu class
     Menu.MainMenu(random);

      String  choice = sc.nextLine();
     System.out.print("\nDo you want to Play again? (Y/N) :");
      choice = sc.nextLine();

    if (choice.equals("y") || choice.equals("Y"))
    {
       Menu.MainMenu(random);      
    }
    else
    {
      Userchoice =true;
      
          //Printing Main Banner
      System.out.print("\033[H\033[2J");
      System.out.println("\n\n\n\n\n\n\n\n\t=================================");
      System.out.println("\t     Thank You For Playing   \n\t  Random Death Battle Arena Game");
      System.out.println("\t=================================");

      System.exit(0);
    }
  } // while (Userchoice == true);

 }
  }

  