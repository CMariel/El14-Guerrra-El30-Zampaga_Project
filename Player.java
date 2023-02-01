import java.util.ArrayList;

public abstract class Player {
  // fields
  private String name, role;
  private int actionCount, cardCount, playerNumber;
  //additional stuff
  private static int totalPlayers = 0; 
  private static ArrayList<Card> hand = new ArrayList<>();
  private Location currentCity;
  
  public Player(String n, String r) {
    this.name = n;
    this.role = r;
    this.actionCount = 0;
    this.cardCount = 5;
    this.playerNumber = totalPlayers++;
    totalPlayers++;
  }

  public void chooseAction() {
    
  }

  // travel to a location directly connected with current location
  public void drive(Location destination) {
    
  }

  // remove 1 disease cube in current location
  public void treatDisease(Disease d) {
    
  }

  // give 1 card from hand to another player
  public void shareKnowledge(Card city, Player teammate) {
    
  }

  public void drawCard() {

  }
}