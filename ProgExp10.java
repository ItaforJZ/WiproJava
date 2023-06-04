/*isPrime?
Write a function that finds whether the given number N is Prime or not.
If the number is prime the function should return 2 else it must return 1. */
import java.util.*;
import java.io.*;
public class ProgExp10{
    public static int isPrime(int input){
        int count=0;
        for(int i=1;i<=input;i++){
            if(input%i==0){
                count++;
            }
        }
        if(count==2){
            return 2;
        }
        else{
            return 1;
        }
    }
    public static void main(String a[]){
        int n,res;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        n=sc.nextInt();
        res=isPrime(n);
        System.out.println(res);

        }
}