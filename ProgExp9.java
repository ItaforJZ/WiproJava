/*Of the given 5 numbers, How many are ven or odd?
Write a function that accepts 6 inputs parameters.
The first 5 input parameters  are of type int.
The sixth input parameter is of type string.
If sixth parameter contains the value “even”, the function is supposed to return the count of how many of the first five input parameters are even.
If sixth parameter contains the value “odd”, the function is supposed to return the count of how many of the first five input parameters are odd.
For example – 
If the five input parameters are 12, 17, 19, 14 and 115, and the sixth parameter is “odd”, the function must return 3, because there are three odd numbers 17,19 and 115.
If the five input parameters are 12, 17, 19,14 and 115, and the sixth parameter is “even”, the function must return 2,because there are two even numbers 12 and 14.
Note that zero is considered an even number. */
import java.util.*;
import java.io.*;
class ProgExp9{
    public static int countEvenOdds(int input1,int input2,int input3,int input4,int input5,String input6)
{
    int count=0;
    if(input6.equalsIgnoreCase("odd")){
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
    }
    else if(input6.equalsIgnoreCase("even")){
        if(input1%2==0){
            count++;
        }
        if(input2%2==0){
            count++;
        }
        if(input3%2==0){
            count++;
        }
        if(input4%2==0){
            count++;
        }
        if(input5%2==0){
            count++;
        }
    }
    return count;
}
public static void main(String a[]){
    int n,n1,n2,n3,n4,s1;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the numbers: ");
    n=sc.nextInt();
    n1=sc.nextInt();
    n2=sc.nextInt();
    n3=sc.nextInt();
    n4=sc.nextInt();
    System.out.println("Enter the string: ");
    String opt=sc.next();
    s1=countEvenOdds(n,n1,n2,n3,n4,opt);
    System.out.println(s1);
}
}