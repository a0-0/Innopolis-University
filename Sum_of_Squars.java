package Innopolis;

import java.util.Scanner;

public class Sum_of_Squars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long A = input.nextLong();
        long B = input.nextLong();
        if (A >= 1 && B >=1 && A <= Math.pow(10,9) && B <=  Math.pow(10,9) ){
            System.out.println(Square(A)+ Square(B));
        }
    }
    public static long Square(long Number){
        return Number * Number ;
    }
}
