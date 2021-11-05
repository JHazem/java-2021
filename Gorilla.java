public class Gorilla extends Mammal{

  public void throwSomeThing() {
    System.out.println("throwing bannanas");
    energyLevel -= 5;
  }
  
  public void eatBananas() {
    System.out.println("Energy going up, when Gorilla eat 10 bannanas");
    energyLevel += 10;
  }

  public void climb() {
    System.out.println("when Gorilla climbed a tree, energy going down ");
    energyLevel -= 10;
  }      
}
