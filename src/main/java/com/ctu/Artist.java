package com.ctu;

/**
 *
 * @author PK <pk@cortecsystems.com>
 */
public class Artist extends ArtistTable {

    int Index;

    public Artist(int Index, int rowSum, int colSum) {
        super(rowSum, colSum);
        this.Index = Index;
    }

//    @Override
//    public void salesSummary() {
//        
//    }
    
    public void salesSummary(int artistPosition) {
        
        String[] artistNames = {"", "Master KG", "Foo Fighters"};
        Integer[] artistSales = {0, 500, 600};

            switch(artistPosition){
                case 1:
                    System.out.println("Artist name: " + artistNames[artistPosition]);
                    System.out.println("Artist DVD Sales: " + artistSales[artistPosition]);
                break;

                case 2:
                    System.out.println("Artist name: " + artistNames[artistPosition]);
                    System.out.println("Artist DVD Sales: " + artistSales[artistPosition]);
                break;

                default:
                       System.out.println("not a valid entry: should be between 1 & 2 only!\nTry again");
                               
            }
        
    }
    
    


    
    
    
    
    
}
