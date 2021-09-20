package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the score out of 100");
        int score = input.nextInt();

        if (score < 40) {
            System.out.println("U");
        } else {
            if (score >= 49) {
                System.out.println("E");
            } else {
                if (score >= 59) {
                    System.out.println("D");
                } else {
                    if (score >= 69) {

                        System.out.println("C");
                    } else {
                        if (score >= 79) {
                            System.out.println("B");
                        } else {
                            if (score =< 80) {
                                System.out.println("A");
                            }
                        }
                    }
                }

            }
        }
    }
}
