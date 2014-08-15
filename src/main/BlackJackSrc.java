/**
 * BlackJack Functions Class
 * Author: Shady Ibrahim
 */

package main;

import java.util.ArrayList;

public class BlackJackSrc
{
    static ArrayList<String> player1 = new ArrayList<>(); static ArrayList<String> player2 = new ArrayList<>();
    
    public BlackJackSrc()
    {   
        for(int i = 0; i < 2; i++)
        {
            if(i == 0)
            {
                player1 = PreGame.playerAssign(BlackJack.cards);
                
                for(int j = 0; j < 2; j++)
                {
                    BlackJack.cards.remove(BlackJack.cards.indexOf(player1.get(j)));
                }   
            }
            else if(i == 1)
            {
                player2 = PreGame.playerAssign(BlackJack.cards);
                
                for(int j = 0; j < 2; j++)
                {
                    BlackJack.cards.remove(BlackJack.cards.indexOf(player2.get(j)));
                }
            }
        }
    }
    
    public static ArrayList<String> playerAdd()
    {
        player1.add(BlackJack.cards.get(0));
        BlackJack.cards.remove(0);
        return player1;
    }
    public static ArrayList<String> dealerAdd()
    {
        player2.add(BlackJack.cards.get(0));
        BlackJack.cards.remove(0);
        return player2;
    }
}