package com.pluralsight;

import java.util.Scanner;

public class Main {

    /*
    https://programmingbydoing.com/
    PokeTrader 2 - Assignment #158
     */

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String[] pokeParty = { "PIKACHU", "CHARMELEON", "GEODUDE", "GYARADOS", "BUTTERFREE", "MANKEY" };

        int a;
        int b;

        do
        {
            System.out.println("EXCHANGE POKEMON\n");
            for ( int i=0; i<pokeParty.length; i++ )
                System.out.println("    " + i + ". " + pokeParty[i]);

            System.out.print("\nChoose a Pokemon (or -1 to quit). => ");
            a = keyboard.nextInt();

            if ( a >= 0 )
            {
                System.out.print("Choose a Pokemon to exchange with " + pokeParty[a] + ". => ");
                b = keyboard.nextInt();

                System.out.println("\nExchanging " + pokeParty[a] + " with " + pokeParty[b] + ".\n");

                // add code here to swap the Pokemon in slot a with the Pokemon in slot b
                String tempForSwap = pokeParty[a];
                pokeParty[a] = pokeParty[b];
                pokeParty[b] = tempForSwap;

            }


        } while ( a >= 0 );
    }
}
