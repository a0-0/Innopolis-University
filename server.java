package Innopolis;

import java.util.Scanner;

public class server {
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
        int sum = 0 ;
        for (int i = 0; i < St.length; i++) {
            Ar[i] = Integer.parseInt(St[i]);
            sum+=Ar[i];
        }
        int[] ar = new int[n+1];
        int sum1 = 0 ;
        for (int i = 1 ; i <= ar.length-1 ; i ++){
            ar[i]= i;
            sum1+=ar[i];
        }
        int number = sum1 - sum ;
        System.out.println(number);


    }
}
