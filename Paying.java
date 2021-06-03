package Innopolis;
/***
 *    created by:   Ahmed Elsaid Abdelhameid E.A
 *
 *     17.04.2021
 *
 * ***/
import java.util.Scanner;

public class Paying {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String user_input = input.nextLine();
        String[] stringsArray = user_input.split(" ");
        int[] intArray = new int[stringsArray.length];
        for (int i = 0; i < stringsArray.length; i++) {
            intArray[i] = Integer.parseInt(stringsArray[i]);
        }
        int n = intArray[0];
        String A = input.nextLine();
        String[] St = A.split(" ");
        int[] Ar = new int[St.length];
        for (int i = 0; i < St.length; i++) {
            Ar[i] = Integer.parseInt(St[i]);
        }
        int max = 0;
        if (n % 2 == 0) {
            int sum = 0;
            for (int i = 0; i < n; i += 2)
                sum += Ar[i];
            if (sum > max)
                max = sum;
            sum = 0;
            for (int i = 1; i < n; i += 2)
                sum += Ar[i];
            if (sum > max)
                max = sum;
        } else {
            int sum = 0;
            for (int i = 0; i < n; i++) {
                for (int m = 0; m < n; m += 2)
                    sum += Ar[m];
                if (max < sum)
                    max = sum;
                int tmp = Ar[0];
                for (int m = 0; m < n - 1; m++)
                    Ar[m] = Ar[m + 1];
                Ar[n - 1] = tmp;
                sum = 0;
            }

        }
        System.out.println(max);
    }

}
