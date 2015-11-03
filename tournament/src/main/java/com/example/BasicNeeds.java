package com.example;

import java.util.ArrayList;
import java.util.Scanner;

public class BasicNeeds {
    public static void main(String[] args)
    {
        ArrayList<String> PlayerList = new ArrayList<String>();
        int amountOfPlayers;
        Scanner scan = new Scanner(System.in);
        String bracket= "";

        System.out.print("How many players are going to be playing? ");
        amountOfPlayers = scan.nextInt();

        for(int i =0; i < amountOfPlayers; i++)
        {
            int Playernum = i + 1;
            String playerName;
            System.out.print("What is the name of player " + Playernum + " ? ");
            playerName = scan.next();
            PlayerList.add(playerName);
        }

        for(int i =0; i < amountOfPlayers; i++)
        {
            if(i == amountOfPlayers - 1)
            {
                bracket += PlayerList.get(i);
            }
            else
            {
                bracket += PlayerList.get(i) +"\n |\n |\n";
            }
        }
        System.out.print(bracket);

    }


}
