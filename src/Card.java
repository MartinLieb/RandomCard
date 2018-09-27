public class Card {

    String rank;
    String color;

    public Card(String rank, String color){
        this.rank = rank;
        this.color = color;
    }

    public String getCard(){
        return rank + " of " + color;

    }
}
