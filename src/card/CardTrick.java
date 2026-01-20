/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 * 
 * Name: Lester David T. Principio
 * ID: 991799447
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Random rnd = new Random();
        Scanner inpt = new Scanner(System.in);
        
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card(Card.SUITS[rnd.nextInt(3)],rnd.nextInt(13)+1);
            magicHand[i] = c;
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
        
        for(int i=0; i<magicHand.length; i++){
            System.out.println(magicHand[i].getSuit()+" "+magicHand[i].getValue());
        }
        
        Card uCard = new Card();
                  
        System.out.println("Enter Card Value(1-13): ");
        int val = inpt.nextInt();
        System.out.println("Enter Suit(0-3 Hearts=0,Diamonds=1,Spades=2,Clubs=3): ");
        int sut = inpt.nextInt();
        
        boolean fnd = false;
        uCard.setValue(val);       
        uCard.setSuit(uCard.SUITS[sut]);
        
        for(Card c : magicHand){
            if(c.equals(uCard)){
                System.out.print("Your card is in the magic hand!");
                fnd = true;
                break;
            }
        }
        if (!fnd){
            System.out.println("Sorry, your card is not in the magic hand.");
        }
        if(fnd == true){
            System.out.println("Your card is in the magic hand.");
        }
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        // add one luckcard hard code 2,clubs

        //This is my Hard-coded lucky card from GitHub
        boolean lucky = false;
        Card luckyCard = new Card("Spades",1);
        for(Card c : magicHand){
            if(c.equals(luckyCard)){
                System.out.println("LUCKY CARD FOUND!");
                lucky = true;
                break;
            }
        }
        if (!lucky){
            System.out.println("Bummer, no lucky card.");
        }
        
    }
    
}
