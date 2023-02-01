public class Disease {
  private String name;
  private int remainingDiseaseCubes;
  private boolean cured, eradicated;
  private static int infectionRate;
  
  public Disease(String n) {
    this.name = n;
    this.remainingDiseaseCubes = 100;
    this.cured = false;
    this.eradicated = false;
  }

  // add disease cubes to a  location
  public void spread(Location l) {
    
  }

  // add disease cubes to a location and all of its connections
  public void epidemic(Location l) {
    
  }
} 