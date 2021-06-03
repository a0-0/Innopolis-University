package Innopolis;

import java.util.Scanner;

public class Music_Chair {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String user_input = input.nextLine();
        String[] stringsArray = user_input.split(" ");
        int[] intArray = new int[stringsArray.length];
        for (int i = 0; i < stringsArray.length; i++) {
            intArray[i] = Integer.parseInt(stringsArray[i]);
        }
        int n = intArray[0];
        int k = intArray[1];
        int d = intArray[2];

        if (k - 1 != d % n)
            System.out.println("Clockwise");
        else if (n - k + 1 != d % n)
            System.out.println("Counterclockwise");
        else
            System.out.println("Impossible");

    }
}
