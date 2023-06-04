/*Write a function to find whether the given input number is Even.
If the given number is even, the function should return 2 else it should
return 1.
Note: The number passed to the function can either be negative, positive
or 0.
Zero should be treated as Even. */
import java.io.*;
import java.util.*;
class ProgExp1
{
    public static int isEven(int input1)
    {
    if(input1%2==0){
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
     res=isEven(num);
     System.out.println(res);
}
}