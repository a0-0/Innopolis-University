package Innopolis;

import java.util.Scanner;

public class Ministerm_Element {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String user_input = input.nextLine();
        String[] stringsArray = user_input.split(" ");
        int[] intArray = new int[stringsArray.length];
        for (int i = 0; i < stringsArray.length; i++) {
            intArray[i] = Integer.parseInt(stringsArray[i]);
        }
        int n  =  intArray[0];

        int[][] Array = new int[2][n];
        int count = 0;


        String A = input.nextLine();
        String[] St = A.split(" ");
        int[] Ar = new int[St.length];
        for (int i = 0; i < St.length; i++) {
            Ar[i] = Integer.parseInt(St[i]);
            boolean flag = true;
            int max = -1;
            int maxTmp = -1;
            int maxIndex = 0;
            for (int m = 0; m < n; m++){
                if (Array[0][m] == Ar[i]){
                    flag = false;
                    Array[1][m] += 1;
                }
                else if ( m == n-1 ) {
                    Array[0][count] = Ar[i];
                    Array[1][count] = 1;
                    count++;
                }
            }
            for (int m = 0; m < n; m++){
                if (Array[1][m] > maxTmp){
                    max = Array[1][m];
                    maxTmp = Array[1][m];
                    maxIndex = m;
                }
            }

            if (max > (i+1)/2)
                System.out.print(Array[0][maxIndex]+" ");
            else
                System.out.print("-1 ");
        }







    }
}
