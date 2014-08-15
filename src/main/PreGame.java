/**
 * Prepare Deck and Player Cards
 * Author: Shady Ibrahim
 */

package main;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Shady
 */

public class PreGame
{   
    public static ArrayList<String> createShuffle()
    {
        ArrayList<String> cards = new ArrayList<>();

        for (int i = 2; i <= 14; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                cards.add(Integer.toString(i));
            }
        }

        for (int i = 0; i < 52; i++)
        {
            if (i % 4 == 0)
            {
                cards.set(i + 0, "4" + cards.get(i + 0));
                cards.set(i + 1, "3" + cards.get(i + 1));
                cards.set(i + 2, "2" + cards.get(i + 2));
                cards.set(i + 3, "1" + cards.get(i + 3));
            }
        }
        
        for(int i = 0; i < 52; i++)
        {
            if(Integer.parseInt(cards.get(i)) < 100)
            {
                cards.set(i, (cards.get(i).substring(0, 1) + "0" + cards.get(i).substring(cards.get(i).length() - 1)));
            }       
        }

        Collections.shuffle(cards);

        return cards;

    }
    
    public static ArrayList<String> playerAssign(ArrayList<String> x)
    {
        ArrayList<String> player = new ArrayList<>();
        
        for(int i = 0; i < 2; i++)
        {
            player.add(x.get(i));
        }
        
        ArrayList<Integer> sortIt = new ArrayList<>();
        
        while(player.size() >= 1)
        {
            sortIt.add(Integer.parseInt(player.get(0)));
            player.remove(0);
        }
        
        Collections.sort(sortIt);
        
        for (Integer sortIt1 : sortIt) {
            player.add(Integer.toString(sortIt1));
        }
        
        return player;
    }
    
//    public static ArrayList<String> playerAdd(ArrayList<String> cards, ArrayList<String> player)
//    {
//        player.add(cards.get(0));
//        
//        ArrayList<Integer> sortIt = new ArrayList<>();
//        
//        while(player.size() >= 1)
//        {
//            sortIt.add(Integer.parseInt(player.get(0)));
//            player.remove(0);
//        }
//        
//        Collections.sort(sortIt);
//        
//        for (Integer sortIt1 : sortIt) {
//            player.add(Integer.toString(sortIt1));
//        }
//        
//        return player;
//    }
}