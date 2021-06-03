package Innopolis;

import java.util.Scanner;

public class Tow_points {
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
        String A = input.nextLine();
        String[] St = A.split(" ");
        int[] Ar = new int[St.length];
        for (int i = 0; i < St.length; i++) {
            Ar[i] = Integer.parseInt(St[i]);
        }
        shopping(n,Ar);
        divisibleByValue(n,k,Ar);
    }
    public static void shopping(int n, int[] array) {

        int start = array[0];
        int end = array[array.length - 1];
        for (int i = 0, j = array.length; i < array.length && j > 0; i++, j--) {
            if (array[i] != array[array.length - 1]) {
                System.out.println(array.length - i);
                break;
            }
            if (array[j] != array[0]) {
                System.out.println(j);
                break;
            }
        }
    }

    public static void divisibleByValue(int n, int k, int[] coordinates) {
        boolean found = false;
        for (int i = 0; i < n - 1 && !found; i++) {
            for (int j = i + 1; j < n && !found; j++) {
                if ((coordinates[j] - coordinates[i]) % k == 0) {
                    System.out.println((i + 1) + " " + (j + 1));
                    found = true;
                }
            }
        }
        if (!found) System.out.println((-1) + " " + (-1));
    }
}
