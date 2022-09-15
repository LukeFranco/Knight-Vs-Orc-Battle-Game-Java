public class Knight extends Orc {
 public String armor;
  
  public Knight(String name, int hitPoints, String armor) {
  super(name, hitPoints);
  this.armor = armor;
    
  }
    
      public void attack(Orc orc) {
      System.out.println("\nThe Orc is attacked by " + this.name + " from the " + this.armor + " Islands.");
      orc.hitPoints -= 10;
    
    if (orc.hitPoints <= 0) {
      System.out.println(orc.name + " screams in victory and has won the battle!");
    } else {
      System.out.print(orc.name + " has " + orc.hitPoints + " health remaining and is still in the battle.\n");  
    }
  }
}
