package com.arkansascodingacademy;

public class Game
{
    private Numbers numbers;
    private RandomCard card;

    public Game()
    {
        numbers = new Numbers(75,1);
        card = new RandomCard();
    }

    public void play()
    {
        boolean bingo = false;

        while (!bingo)
        {
            int number = numbers.draw();

            card.play(number);
            card.print();
            System.out.println();

            if (card.bingo())
            {
                bingo = true;
            }
        }
    }

}
