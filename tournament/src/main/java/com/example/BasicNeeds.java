package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BasicNeeds {
    public static void main(String[] args)
    {
        Tournament tournament = new Tournament();
        Scanner scan = new Scanner(System.in);
        boolean cont = true;
        int decision;
        int matchNum;
        int winner;
        int round = 1;
        int matches = 0;
        int matchesSet = 0;
        

        tournament.createPlayers();
        tournament.shuffle();
        tournament.createEvenBracket();
        tournament.getBracket();
        System.out.println(tournament.getBracket());

        do
        {
            System.out.println("Choose an option: \n1. Reprint bracket\n2. Set match winner\n3. quit ");
            decision = scan.nextInt();

            switch (decision)
            {
                case 1: //prints the bracket
                    System.out.println(tournament.getBracket());
                    break;
                case 2:
                    //code that allows user to set match winner belongs here
                    matches = tournament.PlayerList.size()/2;
                    if(round % 2 == 0)
                    {
                        tournament.setEvenWinner();
                    }
                    else
                    {
                        tournament.setOddWinner();
                    }
                    matchesSet++;
                    if(matchesSet == matches)
                    {
                        tournament.removeLosers();
                        if(round % 2 == 0)
                        {
                            tournament.createEvenBracket();
                        }
                        else
                        {
                            tournament.createOddBracket();
                        }
                        tournament.resetWinners();
                        System.out.println(tournament.getBracket());
                        round++;
                        matchesSet = 0;
                    }
                    break;
                case 3: //recreates bracket after removing losers
                    cont = false;
                    break;
            }
            if(tournament.PlayerList.size() == 1)
            {
                cont = false;
            }
        }while(cont);
        System.out.println(tournament.getPlayer(0).getName() + " wins!!!!!!!");



    }




}
