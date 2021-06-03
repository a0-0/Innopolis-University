package Innopolis;

import java.util.Scanner;

public class Geniuses {
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

        System.out.println(countEvenSum(Ar,n));



    }
    public static long countEvenSum(int a[], int n)
    {
        // result may be large enough not to
        // fit in int;
        long res = 0;

        // to keep track of subarrays with even
        // sum starting from index i
        int s = 0;
        for (int i = n - 1; i >= 0; i--)
        {
            if (a[i] % 2 == 1)
            {
                // s is the count of subarrays starting from
                // index i+1 whose sum was even
                /*if a[i] is odd then all subarrays starting
                from index i+1 which was odd becomeseven
                when a[i] gets added to it.*/
                s = n - i - 1 - s;
            }
            else
            {
                /*if a[i] is even then all subarrays
        starting from index i+1 which was even remainseven
        and one extra a[i] even subarray gets added to it.*/
                s = s + 1;
            }
            res = res + s;
        }
        return res;
    }

}
