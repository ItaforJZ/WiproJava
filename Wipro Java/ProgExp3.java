/*Return last digit of the given number
Write a function that returns the last digit of the given number.
Last digit is being referred to the least significant digit i.e. the digit in the ones (units) place in the given number.
The last digit should be returned as a positive number.
For example,
If the given number is 197, the last digit is 7
If the given number is -197, the last digit is 7 */
import java.io.*;
import java.util.*;
class ProgExp3{
    public static int lastDigitOf(int input1){
        if(input1<0){
            input1=input1*(-1);
        }
        return input1 % 10;
    }
    public static void main(String a[]){
        int num,lastDigit;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        num=sc.nextInt();
        lastDigit=lastDigitOf(num);
        System.out.println(lastDigit);
    }
}