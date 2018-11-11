package com.company;

public class Guard extends Player {
    private int numOfBlocks = 4;

    public Guard(String firstName, String birthdate, int height, int shirtNo, int pctFromTwo, int pctFromTheLine, int pctFromTheThree, String category, int numOfBlocks) {
        super(firstName, birthdate, height, shirtNo, pctFromTwo, pctFromTheLine, pctFromTheThree, category);

        //extends
        this.numOfBlocks = numOfBlocks;
    }

    public Guard() {
        super();
        this.numOfBlocks = IO.nextInt("Enter Num Blocks");
    }

    @Override
    public String toString() {
        return "Guard{" +
                "numOfBlocks=" + numOfBlocks +
                "} " + super.toString();
    }


    //GUARD  + numBlocks


    @Override
    public void print() {
        super.print();
        System.out.println("Num Blocks: " + numOfBlocks);
    }
}
