package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square angle: bottom-left");
            System.out.println("3. Print the square angle: top-left");
            System.out.println("4. Print the isosceles triangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();

            System.out.println("Nhập chiều cao:");
            int height = input.nextInt();
            System.out.println("Nhập chiều rộng:");
            int width = input.nextInt();

            switch (choice) {
                case 1:
                    for (int i = 0; i < height; i++) {
                        System.out.println();
                        for (int j = 0; j < width; j++) {
                            System.out.print("* ");
                        }
                    }
                    break;
                case 2:
                    for (int i = 0; i < height; i++) {
                        System.out.println();
                        for (int j = 1; j <i; j++) {
                            System.out.print("* ");
                        }
                    }
                    break;
                case 3:
                    for (int i = height; i >= 0; i--) {
                        System.out.println();
                        for (int j = 1; j < i; j++) {
                            System.out.print("*");
                        }
                    }
                    break;
                case 4:
                    int j = 0;
                    for (int i = 1; i <= height; ++i, j = 0) {
                        for (int space = 1; space <= height - i; ++space) {
                            System.out.print("  ");
                        }
                        while (j != 2 * i - 1) {
                            System.out.print("* ");
                            ++j;
                        }
                        System.out.println();
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
                    break;
            }

        }

    }
}



