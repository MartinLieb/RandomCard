public class Deck {

    Card[] deck = new Card[52];
    public Deck(){
        deck[0] = new Card("ace", "hearts");
        deck[1] = new Card("2", "hearts");
        deck[2] = new Card("3", "hearts");
        deck[3] = new Card("4", "hearts");
        deck[4] = new Card("5", "hearts");
        deck[5] = new Card("6", "hearts");
        deck[6] = new Card("7", "hearts");
        deck[7] = new Card("8", "hearts");
        deck[8] = new Card("9", "hearts");
        deck[9] = new Card("10", "hearts");
        deck[10] = new Card("jack", "hearts");
        deck[11] = new Card("queen", "hearts");
        deck[12] = new Card("king", "hearts");
        deck[13] = new Card("ace", "spades");
        deck[14] = new Card("2", "spades");
        deck[15] = new Card("3", "spades");
        deck[16] = new Card("4", "spades");
        deck[17] = new Card("5", "spades");
        deck[18] = new Card("6", "spades");
        deck[19] = new Card("7", "spades");
        deck[20] = new Card("8", "spades");
        deck[21] = new Card("9", "spades");
        deck[22] = new Card("10", "spades");
        deck[23] = new Card("jack", "spades");
        deck[24] = new Card("queen", "spades");
        deck[25] = new Card("king", "spades");
        deck[26] = new Card("ace", "diamonds");
        deck[27] = new Card("2", "diamonds");
        deck[28] = new Card("3", "diamonds");
        deck[29] = new Card("4", "diamonds");
        deck[30] = new Card("5", "diamonds");
        deck[31] = new Card("6", "diamonds");
        deck[32] = new Card("7", "diamonds");
        deck[33] = new Card("8", "diamonds");
        deck[34] = new Card("9", "diamonds");
        deck[35] = new Card("10", "diamonds");
        deck[36] = new Card("jack", "diamonds");
        deck[37] = new Card("queen", "diamonds");
        deck[38] = new Card("king", "diamonds");
        deck[39] = new Card("ace", "clubs");
        deck[40] = new Card("2", "clubs");
        deck[41] = new Card("3", "clubs");
        deck[42] = new Card("4", "clubs");
        deck[43] = new Card("5", "clubs");
        deck[44] = new Card("6", "clubs");
        deck[45] = new Card("7", "clubs");
        deck[46] = new Card("8", "clubs");
        deck[47] = new Card("9", "clubs");
        deck[48] = new Card("10", "clubs");
        deck[49] = new Card("jack", "clubs");
        deck[50] = new Card("queen", "clubs");
        deck[51] = new Card("king", "clubs");
    }

    public String getCard(int card){
        return deck[card].getCard();
    }
}
