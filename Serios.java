package Innopolis;
/***
 *    created by:   Ahmed Elsaid Abdelhameid E.A
 *
 *     17.04.2021
 *
 * ***/

import java.util.Scanner;

public class Serios {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String user_input = input.nextLine();
        String[] stringsArray = user_input.split(" ");
        int[] intArray = new int[stringsArray.length];
        for (int i = 0; i < stringsArray.length; i++) {
            intArray[i] = Integer.parseInt(stringsArray[i]);
        }
        int n = intArray[0];
        int m = intArray[1];

        String A = input.nextLine();
        String[] St = A.split(" ");
        int[] a = new int[St.length];
        for (int i = 0; i < St.length; i++) {
            a[i] = Integer.parseInt(St[i]);
        }

        A = input.nextLine();
        St = A.split(" ");
        int[] b = new int[St.length];
        for (int i = 0; i < St.length; i++) {
            b[i] = Integer.parseInt(St[i]);
        }
        /*
        double sum = 0;

        for (int num: b) {
            sum += num;
        }
        sum = sum/m;
        System.out.println(sum);

        double min = a[0] - sum;
        if (min < 0) min = - min;
        int minId = 0;

        for (int num = 0; num < n; num ++) {
            double tmp = a[num] - sum;
            if (tmp < 0) tmp = - tmp;
            if (tmp < min) { min = tmp; minId = num;}
        }
        int x = a[minId];

        int count = 0;

        for (int num : b) {
            if (num - x > 0){
                while (num != x){
                    num--;
                    count++;
                }
            }
            else {
                while (num != x){
                    num++;
                    count++;
                }
            }
        }
        System.out.println(count); */

        int[] bTmp = b;
        int count = 0;

        for (int num : a) {
            int countT = 0;
            for (int val : bTmp) {
                if (val - num > 0) {
                    while (val != num) {
                        val--;
                        countT++;
                    }
                } else {
                    while (val != num) {
                        val++;
                        countT++;
                    }
                }
            }
            if (count == 0)
                count = countT;
            else if (countT < count)
                count = countT;
            countT = 0;
            bTmp = b;
        }
        System.out.println(count);
    }
}
