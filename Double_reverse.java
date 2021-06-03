package Innopolis;

import java.util.Scanner;

public class Double_reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, a, b, c, d;
        String user_input = input.nextLine();
        String[] stringsArray = user_input.split(" ");
        int[] intArray = new int[stringsArray.length];
        for (int i = 0; i < stringsArray.length; i++) {
            intArray[i] = Integer.parseInt(stringsArray[i]);
        }
        n = intArray[0];
        a = intArray[1];
        b = intArray[2];
        c = intArray[3];
        d = intArray[4];
        String A = input.nextLine();
        String[] St = A.split(" ");
        int[] Ar = new int[St.length];
        for (int i = 0; i < St.length; i++) {
            Ar[i] = Integer.parseInt(St[i]);
        }


        int m = (a - 1) - (b - 1);
        int temp;
        for (int i = a - 1, l = b - 1; i <= l; i++, l--) {
            temp = Ar[i];
            Ar[i] = Ar[l];
            Ar[l] = temp;
        }
        int temp1;
        for (int i = c - 1, l = d - 1; i <= l; i++, l--) {
            temp1 = Ar[i];
            Ar[i] = Ar[l];
            Ar[l] = temp1;
        }
        for (int i = 0; i <= Ar.length - 1; i++) {
            System.out.print(Ar[i] + " ");
        }
    }
}