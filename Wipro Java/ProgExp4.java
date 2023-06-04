/*Return second last digit of the given number
Write a function that returns the second last digit of the given number.
Second last digit is being referred to the digit in the tens place in the given number.
For example,
If the given number is 197, the second last digit is 9
Note-1: The second last digit should be returned as a positive number. i.e. If the given number is -197, the second last digit is 9
Note-2: If the given number is a single digit number, then the second last digit does not exist. In such cases, the function should return -1. i.e. if the
given number is 5, the second last digit should be returned as -1. */
import java.io.*;
import java.util.*;
class ProgExp4{
    public static int secondLastDigitOf(int input1){
        if(input1<0){
            input1=input1*(-1);
        }
        int count=0,rem=0;
        int len=Integer.toString(input1).length();
        if(len==1){
            return -1;
        }
        else{
            while(input1>0){
                rem=input1%10;
                count++;
                input1=input1/10;
                if(count==2){
                    break;
                }
            }
            return rem;
        }
    }
    public static void main(String a[]){
        int  num,secondLastDigit;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        num=sc.nextInt();
        secondLastDigit=secondLastDigitOf(num);
        System.out.println(secondLastDigit);
    }
}