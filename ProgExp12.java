/*nthFibonacci?
Write a function to return the nth number in the fibonacci  series.
The value of N will be passed to the function as input parameter.
NOTE: Fibonacci series looks like – 
0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 .... and so on.
i.e. Fibonacci series starts with 0 and 1, and contributes generating the next
number as the sum of the previous two numbers.
First Fibonacci numbers is 0.
Second Fibonacci number is 1.
Third Fibonacci number is 1.
Fourth Fibonacci number is 2 
Fifth Fibonacci number is 3
Sixth Fibonacci number is 5, and so on. */
import java.io.*;
import java.util.*;
public class ProgExp12{
    public static int nthFibonacci(int input){
        if(input==1){
            return 0;
        }
        else if(input==2){
            return 1;
        }
        else if(input==3){
            return 1;
        }
        else{
            return nthFibonacci(input-1)+nthFibonacci(input-2);
        }
    }
    public static void main(String a[]){
        int n,res;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        n=sc.nextInt();
        res=nthFibonacci(n);
        System.out.println(res);
    }
}