import java.util.ArrayList;

public class Location {
  private String name;
  private ArrayList<Location> connections = new ArrayList<>();
  private ArrayList<Location> players = new ArrayList<>();
  private int diseaseCount;
  private boolean hasResearchStation;
  
  public Location(String n) {
    this.name = n;
    this.diseaseCount = 0;
    this.hasResearchStation = false;
  }

  public void selectLocation() {
    
  }
}