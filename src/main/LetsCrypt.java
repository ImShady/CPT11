/**
 * Functions for BlackJack Deck Class
 * Author: Shady Ibrahim
 */

package main;

import java.util.ArrayList;

public class LetsCrypt
{
    public static String encrypt(String x)
    {
        String y = "";
        
        if(x.charAt(0) == 'S')
        {
            if(x.charAt(1) == 'K')
            {
                y = "413"; 
            }
            else if(x.charAt(1) == 'Q')
            {
                y = "412";
            }
            else if(x.charAt(1) == 'J')
            {
                y = "411";
            }
            else if(x.charAt(1) == 'A')
            {
                y = "414";
            }
            else if(x.charAt(1) == '1' && x.charAt(2) == '0')
            {
                y = "410";
            }
            else
            {
                y = "4" + "0" + x.substring(1);
            }
        }
        else if(x.charAt(0) == 'H')
        {
            if(x.charAt(1) == 'K')
            {
                y = "313"; 
            }
            else if(x.charAt(1) == 'Q')
            {
                y = "312";
            }
            else if(x.charAt(1) == 'J')
            {
                y = "311";
            }
            else if(x.charAt(1) == 'A')
            {
                y = "314";
            }
            else if(x.charAt(1) == '1' && x.charAt(2) == '0')
            {
                y = "310";
            }
            else
            {
                y = "3" + "0" + x.substring(1);
            }
        }
        else if(x.charAt(0) == 'D')
        {
            if(x.charAt(1) == 'K')
            {
                y = "213"; 
            }
            else if(x.charAt(1) == 'Q')
            {
                y = "212";
            }
            else if(x.charAt(1) == 'J')
            {
                y = "211";
            }
            else if(x.charAt(1) == 'A')
            {
                y = "214";
            }
            else if(x.charAt(1) == '1' && x.charAt(2) == '0')
            {
                y = "210";
            }
            else
            {
                y = "2" + "0" + x.substring(1);
            }
        }
        else if(x.charAt(0) == 'C')
        {
            if(x.charAt(1) == 'K')
            {
                y = "113"; 
            }
            else if(x.charAt(1) == 'Q')
            {
                y = "112";
            }
            else if(x.charAt(1) == 'J')
            {
                y = "111";
            }
            else if(x.charAt(1) == 'A')
            {
                y = "114";
            }
            else if(x.charAt(1) == '1' && x.charAt(2) == '0')
            {
                y = "210";
            }
            else
            {
                y = "2" + "0" + x.substring(1);
            }
        }
        
        return y;
    }
    
    public static void decrypt(ArrayList<String> x)
    {
        for(int i = x.size() - 1; i >= 0; i--)
        {
            if(x.get(i).charAt(0) == '1')
            {
                switch (x.get(i).substring(1)) {
                    case "10":
                        System.out.print("C10 ");
                        break;
                    case "11":
                        System.out.print("CJ ");
                        break;
                    case "12":
                        System.out.print("CQ ");
                        break;
                    case "13":
                        System.out.print("CK ");
                    case "14":
                        System.out.print("CA ");
                        break;
                    default:
                        System.out.print("C" + x.get(i).substring(2) + " ");
                        break;
                }
            }
            else if(x.get(i).charAt(0) == '2')
            {
                switch (x.get(i).substring(1)) {
                    case "10":
                        System.out.print("D10 ");
                        break;
                    case "11":
                        System.out.print("DJ ");
                        break;
                    case "12":
                        System.out.print("DQ ");
                        break;
                    case "13":
                        System.out.print("DK ");
                        break;
                    case "14":
                        System.out.print("DA ");
                        break;
                    default:
                        System.out.print("D" + x.get(i).substring(2) + " ");
                        break;
                }
            }
            else if(x.get(i).charAt(0) == '3')
            {
                switch (x.get(i).substring(1)){
                    case "10":
                        System.out.print("H10 ");
                        break;
                    case "11":
                        System.out.print("HJ ");
                        break;
                    case "12":
                        System.out.print("HQ ");
                        break;
                    case "13":
                        System.out.print("HK ");
                        break;
                    case "14":
                        System.out.print("HA ");
                        break;
                    default:
                        System.out.print("H" + x.get(i).substring(2) + " ");
                        break;
                }
            }
            if(x.get(i).charAt(0) == '4')
            {
                switch (x.get(i).substring(1)){
                    case "10":
                        System.out.print("S10 ");
                        break;
                    case "11":
                        System.out.print("SJ ");
                        break;
                    case "12":
                        System.out.print("SQ ");
                        break;
                    case "13":
                        System.out.print("SK ");
                        break;
                    case "14":
                        System.out.print("SA ");
                        break;
                    default:
                        System.out.print("S" + x.get(i).substring(2) + " ");
                        break;
                }
            }
        }
    }   
}