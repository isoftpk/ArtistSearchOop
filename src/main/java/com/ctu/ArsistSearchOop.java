package com.ctu;

/**
 *
 * @author PK <pk@cortecsystems.com>
 */
public class ArsistSearchOop {

    public static void main(String[] args) {
    
    ///instantiate a single artist object
    Artist singleArtist = new Artist(2, 2, 2);
    
    ///Upcasting from Artist Subclass to ArtistTable Parent class
    ArtistTable artistTable = singleArtist;
    
    artistTable.salesSummary();
    System.out.println("");
    singleArtist.salesSummary(1);
    }
}
