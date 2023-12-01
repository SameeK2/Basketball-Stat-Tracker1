import java.util.Arrays;

public class BasketballStats {
    private int points;
    private int rebounds;
    private int assists;
    private String name;

    public BasketballStats() {
        points = 0;
        rebounds = 0;
        assists = 0;
        name = "lebron";
    }

    public BasketballStats(int points, int rebounds, int assists, String name) {
        this.points = points;
        this.rebounds = rebounds;
        this.assists = assists;
        this.name = name;
    }

    public void recordPoints(int points) {
        this.points += points;
    }

    public void recordRebounds(int rebounds) {
        this.rebounds += rebounds;
    }

    public void recordAssists(int assists) {
        this.assists += assists;
    }

    public void recordName(String name){
      this.name = name;
    }

    public void displayStats() {
        System.out.println("\n" + this.toString());
    }

    public String toString(){
        String point1 = "Points:" + points + "\n";
        String rebound1 = "Rebounds:" + rebounds + "\n";
        String assist1 = "Assists:" + assists + "\n";
        String name1 = "Name:" + name;
        return point1 + rebound1 + assist1 + name1;
    }

    public void JerseyNumber() {
        int jerseyNumber = (int) (Math.random() * 100 + 1);  
        System.out.println("Randomly generated jersey number: " + jerseyNumber);
        String jerseyStr = String.valueOf(jerseyNumber);
        System.out.println("Length of jersey number: " + jerseyStr.length());
    }
  
}
