/*Number of Prime numbers in a specified range
Write a function to the count of the number of prime numbers in a specified
range. The starting and ending number of the range will be provided as input parameters to the function.
Assumption: 2 is less than or equal to starting number of the range is less than or equal to ending number of the range is less than or equal to 7919.

Example1: If the starting and ending number of the range is given as 2 and 20, the method must return 8, because there are 8 prime numbers in the specified range from 2 to 20, namely (2, 3, 5, 7, 11, 13, 17, 19). */
import java.util.*;
import java.io.*;
public class ProgExp14{
    public static int countPrimesInRange(int input1,int input2){
        int k=0,count=0;
        while(input1<=input2){
            for(int i=2;i<input1;i++){
                if(input1%i==0){
                    k++;
                }
            }
            if(k==0){
                count++;
            }
            input1++;
            k=0;
        }
        return count;
    }
    public static void main(String a[]){
    int n1,n2,res;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number: ");
    n1=sc.nextInt();
    n2=sc.nextInt();
    res=countPrimesInRange(n1,n2);
    System.out.println(res);
    }
}