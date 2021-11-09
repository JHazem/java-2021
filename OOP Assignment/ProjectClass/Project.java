package ProjectClass;
public class Project {
  private String name;
  private String description;
  private double cost;

  public String elevatorPitch() {
    return (name + "(" + cost + ")" + " : " + description);
  }

  public void setName(String theName) {
    this.name = theName;
  }

  public String getName() {
    return name;
  }

  public void setDescription(String theDescription) {
    this.description = theDescription;
  }

  public String getDescription() {
    return description;
  }
  
  public void setCost(double theCost) {
    this.cost = theCost;
  }

  public double getCost() {
    return (cost);
  }
}
