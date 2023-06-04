/*Sum of last digits of two given numbers
Rohit wants to add the last digits of the given numbers. For example,
If the given numbers are 267 and 154, the output should be 11.
Below is the explanation –
Last digit of the 267 is 7
Last digit of the 154 is 4
Sum of 7 and 4 = 11
Write a program to help Rohit achieve this for any given two numbers.
The prototype of the method should be –
int addLastDigits(int input1, int input2);
where input1 and input2 denote the two numbers whose last digits are to be added.
Note: The sign of the input numbers should be ignored. i.e.
- If the input numbers are 267 and 154, the sum of last two digits should be 11.
- If the input numbers are 267 and -154, the sum of last two digits should be 11.
- If the input numbers are -267 and 154, the sum of last two digits should be 11.
- If the input numbers are -267 and -154, the sum of last two digits should be 11. */
import java.io.*;
import java.util.*;
public class ProgExp5{
    public static int addLastTwoDigits(int input1,int input2){
        if(input1<0){
            input1=input1*(-1);
        }
        if(input2<0){
            input2=input2*(-1);
        }
        return input1%10 + input2%10;
    }
public static void main(String a[]){
    int n,n1,sum;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter two numbers: ");
    n=sc.nextInt();
    n1=sc.nextInt();
    sum=addLastTwoDigits(n,n1);
    System.out.println(sum);
}
}