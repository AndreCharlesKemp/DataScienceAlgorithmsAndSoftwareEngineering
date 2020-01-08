package com.company;
import java.util.Scanner;

public class PrimeNumberMethod {

    public static void main(String[] args)
    {
        boolean flag = false;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a digit to check if it is a prime number:");
        int num = scan.nextInt();

        for (int i = 2; i <= num/2; i++)
        {
            //Condition for non-prime number.
            if(num % i == 0)
            {
                flag = true;
                break;
            }
        }
        if (!flag)
        {
            System.out.println(num + " is a prime number.");
        }
        else
        {
            System.out.println(num + " is not a prime number.");
        }
    }
}
