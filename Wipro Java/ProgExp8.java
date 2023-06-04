/*Of the given 5 numbers, How many are odd?
Write a function that accepts 5 input parameters and returns the count of how many of those 5 are odd. 
For example:
If the five input parameters are 12, 17, 19, 14 and 115, there are three odd numbers 17, 19 and 115. So, the function must return 3.
Similarly,
If the five input parameters are 15, 0, -12, 19, and 28, there are two odd numbers 15 and 19. So, the function must return 2.

Observe that zero is considered an even number. */
import java.util.*;
import java.io.*;
public class ProgExp8{
    public static int areOdd(int input1,int input2,int input3,int input4,int input5){
        int count=0;
        if(input1%2!=0){
            count++;
        }
        if(input2%2!=0){
            count++;
        }
        if(input3%2!=0){
            count++;
        }
        if(input4%2!=0){
            count++;
        }
        if(input5%2!=0){
            count++;
        }
        return count;
    }
    public static void main(String a[]){
        int n,n1,n2,n3,n4,res;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        n=sc.nextInt();
        n1=sc.nextInt();
        n2=sc.nextInt();
        n3=sc.nextInt();
        n4=sc.nextInt();
        res=areOdd(n,n1,n2,n3,n4);
        System.out.println(res);
        
    }

}