package comp1110.lab2;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //enter height
        int h = in.nextInt();
//draw space, decrease
        for (int i = 1; i <= h; i++) {
            for (int s = 1; s <= h - i; s++) {
                System.out.print(" ");
            }
            for (int x = 1; x <= 2 * i - 1; x++) {
//first and last line, special
                if (i == 1 || i == h) {
                    System.out.print("*");
                } else {
//middle line, draw first and last star because it is special
                    if (x == 1 || x == 2 * i - 1) {
                        System.out.print("*");
                        //draw space in middle
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
//inspired by tutor yaya, special thanks.