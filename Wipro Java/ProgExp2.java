/*Write a function to find whether the given input number is Odd.
If the given number is odd, the function should return 2 else it should return 1.
Note: The number passed to the function can either be negative, positive or zero.
Zero should NOT be treated as Odd. */
import java.io.*;
import java.util.*;
class ProgExp2
{
    public static int isOdd(int input1)
    {
    if(input1%2!=0){
        return 2;
    }
    else{
        return 1;
    }
}
public static void main(String a[])
{
    int num,res;
    Scanner sc=new Scanner(System.in);
     System.out.println("Enter the number: ");
     num=sc.nextInt();
     res=isOdd(num);
     System.out.println(res);
}
}