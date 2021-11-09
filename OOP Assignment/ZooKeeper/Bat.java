public class Bat extends Mammal {
 
  public void fly() {
    System.out.println("The bat has a scary voice when fly");
    energyLevel += 50;
  }
  
  public void eatHumans() {
    System.out.println("That's okay");
    energyLevel += 25;
  }
  
  public void attackTown() {
    System.out.println("The Bat attack a town");
    energyLevel -= 100;
  }
  
}
