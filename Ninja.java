public class Ninja {
  public Ninja() {
    this.stealth = 10;
      }

      public void steal(Human human) {
        human.setHealth(human.gethealth() - stealth);
        
    
  }
}
