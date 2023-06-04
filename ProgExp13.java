/*NthPrime?
Write a function that finds and returns the Nth prime number. N will be passed as input to the function.
Assumption: 1 is less or equal to N is less than or equal to 1000, where N is the position of the prime number.
- The first prime number is 2
- The second prime number is 3
- The third prime number is 5..... and so on.
Example1: If the given number N is 10, the method must return the 10th prime number i.e. 29
Example2: If the given number N is 13, the method must return the 13th prime number  i.e. 41. */
import java.util.*;
import java.io.*;
public class ProgExp13{
    public static int NthPrime(int input){
        int count=0,flag=0;
        for(int i=2;i>0;i++){
            flag=0;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                count++;
            }
            if(count==input){
                return i;
            }
        }
        return 0;
    }
    public static void main(String a[]){
        int n,res;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        n=sc.nextInt();
        res=NthPrime(n);
        System.out.println(res);
    }
}