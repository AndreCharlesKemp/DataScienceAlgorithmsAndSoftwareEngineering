package com.company;
import java.util.Scanner;
import static org.junit.jupiter.api.Assertions.*;

class PrimeNumberMethodTest {

    @org.junit.jupiter.api.Test
    void main() {

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