public class Orc implements OrcImpl{
  public String name;
  public int hitPoints;

  public Orc(){
   this("Rudy The Orc", 80);
  }
  
  public Orc(String name, int hitPoints) {
    this.name = name;   
    this.hitPoints = hitPoints; 
    
   }
@Override
  public void attack(Knight knight) { 
    knight.hitPoints -= 8; 

    if(knight.hitPoints>0) {
    System.out.println("\nKnight is slashed by " + this.name + " and has " + knight.hitPoints+ " health remaining.");
      }
    
    
    if (knight.hitPoints <= 0) {
      System.out.println("\nThe knights " + knight.armor + " armor has broken and hit points have fallen below 0 and " + this.name + " screams in victory and has won the battle!");
      return;
      
    } else {
      System.out.println(knight.name + " is still going but his " + knight.armor +" armor is getting weaker.");  
      
    }
  }
}



