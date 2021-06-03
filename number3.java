package Innopolis;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class number3 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(
                new InputStreamReader(
                        System.in));
        String[] input = new String[2];
        int a;
        int b;
        input = in.readLine().split(" ");

        a = Integer.parseInt(input[0]);
        b = Integer.parseInt(input[1]);

        if (a <= 1000 && b <= 1000){
            if ( a >= b ){

                for (int i = a ; i >= b ; i-- ){
                    System.out.print(i+" ");
                }
            }
            else if (a <= b){
                for (int i = a ; i <= b ; i++){
                    System.out.print(i+" ");
                }
            }
        }
    }
}