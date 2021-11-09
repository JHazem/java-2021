public class Wizard {
  public Wizard() {
    this.health = 50;
    this.intelligence = 8;
  }

  public void heal(Human human) {
    human.setHealth(human.getHealth() + intelligence);
    System.out.println("You are Healthy");
  }
  
  public void fireball(Human human) {
    human.setHealth(human.getHealth() - (intelligence * 3));
    System.out.println("HHH");
  }
  
}
