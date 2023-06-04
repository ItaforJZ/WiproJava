/*Unique Digits Count
Write a function to find the count of unique digits in a given number N. The
number will be passed to the function as an input parameter of type int.
Assumption: The input number will be positive integer number is greater than or equal to 1 and is less than or equal to 25000.
For e.g.
- If the given number is 292, the function should return 2 because there are 2 unique digits ‘2’ and ‘9’ in this number.
- If the given number is 1015, the function should return 3 because there are 3 unique digits in this number , ‘1’, ‘0’ and ‘5’. */
import java.util.*;
import java.io.*;
public class ProgExp16{
    public static int unquieDigitCount(int input){
            int rem=0,count=0;
            if(input>=1&&input<=25000){
                int arr[]=new int[10];
                while(input!=0){
                    rem=input%10;
                    if(arr[rem]==0){
                        arr[rem]=1;
                        count++;
                    }
                    input=input/10;
                }
                return count;
            }
            return 0;
    }
    public static void main(String a[]){
        int num,res;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        num=sc.nextInt();
        res=unquieDigitCount(num);
        System.out.println(res);

    }
}