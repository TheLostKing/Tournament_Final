package com.example;

import java.util.ArrayList;
import java.util.Scanner;

public class BasicNeeds {
    public static void main(String[] args)
    {
        ArrayList<String> PlayerList = new ArrayList<String>();
        int amountOfPlayers;
        Scanner scan = new Scanner(System.in);

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

    }


}
