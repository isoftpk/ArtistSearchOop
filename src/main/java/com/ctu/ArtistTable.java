package com.ctu;

/**
 *
 * @author PK <pk@cortecsystems.com>
 */
public abstract class ArtistTable implements Interface1 {

    int rowSum;
    int colSum;

    public ArtistTable(int rowSum, int colSum) {
        this.rowSum = rowSum;
        this.colSum = colSum;
    }

    @Override
    public void salesSummary() {

        String[] artistNames = {"Master KG", "Foo Fighters"};
        Integer[] artistSales = {500, 600};

//        artistNames[row]
        System.out.println("---------------------------------");
        System.out.println("Summary:");
        for (int inc = 0; inc < artistNames.length; inc++)   {
            System.out.println(artistNames[inc] + " : " + artistSales[inc]);
        }
        System.out.println("---------------------------------");
        
    }
   
}

