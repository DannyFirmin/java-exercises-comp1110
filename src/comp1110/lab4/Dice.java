package comp1110.lab4;


import java.util.Random;

public class Dice {
    static int[] dice = {10, 11, 12, 13, 14, 15
    };

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++){
            Random rand = new Random();
            int rr = rand.nextInt(6);
            System.out.println(dice[rr]);
        }
    }
}
