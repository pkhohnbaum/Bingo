package com.arkansascodingacademy;

public class Card {

    private Square square[][];


    public Card() {
        square = new Square[5][5];

        square[0][0] = new Square(2);
        square[0][1] = new Square(29);
        square[0][2] = new Square(40);
        square[0][3] = new Square(49);
        square[0][4] = new Square(61);

        square[1][0] = new Square(10);
        square[1][1] = new Square(26);
        square[1][2] = new Square(36);
        square[1][3] = new Square(50);
        square[1][4] = new Square(73);

        square[2][0] = new Square(14);
        square[2][1] = new Square(20);
        square[2][2] = new Square(0);
        square[2][2].cover();
        square[2][3] = new Square(51);
        square[2][4] = new Square(63);

        square[3][0] = new Square(15);
        square[3][1] = new Square(18);
        square[3][2] = new Square(32);
        square[3][3] = new Square(55);
        square[3][4] = new Square(64);

        square[4][0] = new Square(8);
        square[4][1] = new Square(19);
        square[4][2] = new Square(31);
        square[4][3] = new Square(47);
        square[4][4] = new Square(68);
    }

    public void print() {
        for (int row = 0; row < 5; row++) {
            for (int column = 0; column < 5; column++) {

                square[row][column].print();
                System.out.print(" ");
            }

            System.out.println();
        }
    }


    public static void main(String[] args) {
        Card card = new Card();
        card.print();


    }

    public void play(int number) {
        for (int row = 0; row < 5; row++) {
            for (int column = 0; column < 5; column++) {
                if (square[row][column].getNumber() == number) {
                    square[row][column].cover();

                }

            }


        }
    }

    public boolean bingo() {
        boolean bingo = false;
        if (bingoByColumn() || bingoByRow() || bingoByDiagonal())
        {
            bingo = true;
        }
        return bingo;
    }

    private boolean bingoByRow()
    {
        boolean bingo = false;

        for (int row = 0; row < 5; row++)
        {
            for (int column = 0; column < 5; column++)
            {

                if (square[row][column].isCovered()) ;
                {
                    if (square[row][0].isCovered() &&
                            square[row][1].isCovered() &&
                            square[row][2].isCovered() &&
                            square[row][3].isCovered() &&
                            square[row][4].isCovered())


                    {
                        bingo = true;
                    }
                }




            }

        }
        return bingo;
    }
    private boolean bingoByColumn()
    {
        boolean bingo = false;


        for (int column = 0; column < 5; column++)
        {

            if

                    (square[0][column].isCovered() &&
                     square[1][column].isCovered() &&
                     square[2][column].isCovered() &&
                     square[3][column].isCovered() &&
                     square[4][column].isCovered())
            {
                bingo = true;
            }
        }
        return bingo;
    }
    private boolean bingoByDiagonal()
    {
        boolean bingo = false;
        for (int row = 0; row < 5; row++)
        {
            for (int column = 0; column < 5; column++)
            {

                if (square[row][column].isCovered()) ;
                {
                    if (square[0][0].isCovered() &&
                            square[1][1].isCovered() &&
                            square[2][2].isCovered() &&
                            square[3][3].isCovered() &&
                            square[4][4].isCovered())


                    {
                        bingo = true;
                    }
                }
                if (square[row][column].isCovered()) ;
                {
                    if (square[0][4].isCovered() &&
                            square[1][3].isCovered() &&
                            square[2][2].isCovered() &&
                            square[3][1].isCovered() &&
                            square[4][0].isCovered())


                    {
                        bingo = true;
                    }
                }

            }

            return bingo;
        }
        return bingo;
    }
    private boolean bingoByStamp()
    {
        boolean bingo = false;
        //TODO code this test

        return bingo;
    }





}
