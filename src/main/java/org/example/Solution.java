package org.example;

import java.util.Scanner;

/*
School or college
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your age?");
        int age = scanner.nextInt();

        if (age >= 18)
            System.out.println("Your college class starts soon");
        else if (age >= 6)
            System.out.println("Off to school with you, my child");
    }
}