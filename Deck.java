package com.yl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * Hello world!
 *
 */
public class Deck 
{

    static ArrayList<Card> cardList = new ArrayList<>();
    
    String[] values = {"Ace","2","3","4","5","6","7","8","9","10","J","Q","K"};
    String[] suit = {"Club", "Spade", "Diamond", "Heart"};

    public Deck(){
        for(int i = 0; i < suit.length; i ++){
            for(int x = 0; x < values.length; x ++){
                cardList.add(new Card(suit[i], values[x]));
            }
        }
        
    }

    public void shuffle(){
        Collections.shuffle(cardList);
        System.out.println("Shuffled Cards: " + cardList);
    }


    public Card randomCard(ArrayList<Card> cardList){
        Random rand = new Random();
        int index = rand.nextInt(cardList.size());
        return cardList.get(index);
    }


    public ArrayList<Card> getDeck(){
        return cardList;    
    }

    

    
    public static void main( String[] args )
    {
        Deck deck = new Deck();
        //deck.shuffle();
        //System.out.println(Arrays.toString(deck.getDeck().toArray()));
        Card randomCard = deck.randomCard(cardList);
        System.out.println("Random Card: " + randomCard);
        
    }
}
