package com.arkansascodingacademy;

import java.util.ArrayList;
import java.util.Random;


public class Numbers {
    private ArrayList<Integer> uncalledNumbers;
    private ArrayList<Integer> calledNumbers;

    Random random;


    public Numbers(int maxNumber, int minNumber)
    {
        uncalledNumbers = new ArrayList<>();

        for (int i = minNumber; i <= maxNumber; i++)
        {
            uncalledNumbers.add(i);
        }


        calledNumbers = new ArrayList<>();
        random = new Random();
    }

    public int draw()
    {
        int randomNumber = random.nextInt(uncalledNumbers.size());

        int calledNumber = uncalledNumbers.remove(randomNumber);

        calledNumbers.add(calledNumber);

        return calledNumber;

    }

    public void printCalledNumbers()
    {
        for (int number : calledNumbers)
        {
            System.out.print(number + " ");

        }
        System.out.println();
    }

    public void printUnCalledNumbers()
    {
        for (int number : uncalledNumbers)
        {
            System.out.print(number + " ");

        }
        System.out.println();
    }





    public static void main(String[] args)
    {
        Numbers numbers = new Numbers(75,1);
        numbers.draw();
        numbers.draw();
        numbers.printCalledNumbers();
        numbers.printUnCalledNumbers();

    }


}


