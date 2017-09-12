package com.arkansascodingacademy;

public class RandomCard {

    private Square square[][];


    public RandomCard() {
        square = new Square[5][5];

        Numbers numbers = new Numbers(15, 1);

        for (int row =0; row < 5; row++)
        {
            square [row][0] = new Square (numbers.draw());
        }

        numbers = new Numbers(30, 16);
        for (int row =0; row < 5; row++)
        {
            square [row][1] = new Square (numbers.draw());
        }

        numbers = new Numbers(45, 31);
        for (int row =0; row < 5; row++)
        {
            square [row][2] = new Square (numbers.draw());
        }

        numbers = new Numbers(60, 46);
        for (int row =0; row < 5; row++)
        {
            square [row][3] = new Square (numbers.draw());
        }

        numbers = new Numbers(75, 61);
        for (int row =0; row < 5; row++)
        {
            square [row][4] = new Square (numbers.draw());
        }



        square [2][2] = new Square (0);
        square[2][2].cover();

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
        if (bingoByColumn()|| bingoByRow()|| bingoByDiagonal()|| bingoByStamp())
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
        }


        return bingo;
    }

    public boolean bingoByStamp()
    {
        boolean bingo = false;
        for (int row = 0; row < 4; row++)
        {
            for (int column = 0; column < 4; column++)
            {
                if (square[row][column].isCovered() &&
                        square[row + 1][column].isCovered() &&
                        square[row][column + 1].isCovered() &&
                        square[row + 1][column + 1].isCovered())

                {
                    bingo = true;
                }
            }
        }

        return bingo;
    }




}
