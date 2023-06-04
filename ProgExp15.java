/*All Digits Count
Write a function to find the count of ALL digits in a given number N. The number will be passed to the function as an input parameter of type int.
Assumption: The input number will be positive integer number is greater than or equal to 1 and is less than or equal to 25000.

For e.g.
- If the given number is 292, the function should return 3 because there are 3 digits in this number.
- If the given number is 1015, the function should return 4 because there are 4 digits in this number.  */
import java.io.*;
import java.util.*;
public class ProgExp15{
    public static int CountAllDigit(int input){
        int count=0;
        while(input!=0){
            input=input/10;
            count++;
        }
        return count;
    }
    public static void main(String a[]){
        int n,res;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        n=sc.nextInt();
        res=CountAllDigit(n);
        System.out.println(res);
    }
}