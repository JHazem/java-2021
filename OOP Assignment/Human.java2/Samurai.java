public class Samurai {
  public Samurai() {
    this.health = 200;
  }

  public void deathBlow(Human human) {
    human.setHealth(human.getHealth() - human.getHealth());
  }
  
  public void meditate(Human human) {
    
  }
  
  public void howMany(Human human) {
    
  }
  
}
