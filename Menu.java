import java.util.InputMismatchException;

class Menu
  {

    public static void MainMenu(int random)
    {

     //Print random
      System.out.println(random); 

      //Printing Main Banner
      System.out.print("\033[H\033[2J");
      System.out.println("\t=================================");
      System.out.println("\t  Random Death Battle Arena \n      May the odds be in your favor ");
      System.out.println("\t=================================");
      System.out.println("\n      One of the following weapons\n       will be randomly selected:\n"); 

      //Printing Array List
      for(String tool:Main.tools){
        System.out.println(tool);
      }
      
   System.out.print("\n   Would you like to be an Orc or a Knight?\n");
      System.out.print("\n1. Orc" + "\n2. Knight\n\nEnter Choice :");
        try{
       int choice = Main.sc.nextInt();

      Orc orc = new Orc();
      Knight knight = new Knight("Theon Greyjoy", 150, "Iron");

      switch(choice) {
      case 1: System.out.println("\nYou are an Orc and you have a " + Main.tools.get(random) + ".\n\nGet ready to meet your Doom!\n"); 
          do{
          orc.attack(knight);
          
          }while(knight.hitPoints > 0 );
          break; 

      case 2: System.out.println("\nYou are a Brave Knight and are weilded a Mightly " + Main.tools.get(random) + ".\n\nGet Ready to battle the Orc!\n");
         do{
          knight.attack(orc);
           
          }while(orc.hitPoints >0 );
          break; 
          //Catches user selecting wrong character
        default:

          //System.out.println("\nPlease pick 1 for Orc or 2 for Knight"); 
          System.out.println("\n\nPress a number and enter to restart!\n");
              char letter = (char) Main.sc.nextInt();
            MainMenu(Main.random);
      }
        }catch(InputMismatchException ex)  {

        System.out.println("\nWrong entry or " + ex);

   }
    }
  }