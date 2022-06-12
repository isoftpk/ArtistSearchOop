package com.ctu;

import java.util.Scanner;

/**
 *
 * @author PK <pk@cortecsystems.com>
 */
public class ArtistSearchOop {

    public static void main(String[] args) {
    
    ///instantiate a single artist object
    Artist singleArtist = new Artist(0, 0, 2);
    
    ///Upcasting from Artist Subclass object to ArtistTable Parent class ojbect to access the salesSummary in the ArtistTable Parent Class
    ArtistTable artistTable = singleArtist;
    artistTable.salesSummary();
    
    Scanner sc = new Scanner(System.in);
    
    int select = 1;
   
        while (select > 0 && select < 3)   {
            System.out.println("Please Enter a Number between 1 - 2");
            select = sc.nextInt();
            singleArtist.salesSummary(select);
            System.out.println();
        }
    }
}