/*Is N an exact multiple of M?
Write a function that accepts two parameters and finds whether the first
parameter is an exact multiple of the second parameter.

If the first parameter is an exact multiple of the second parameter, the
function should return 2 else it should return 1.

If either of the parameter are zero, the function should return 3. 
Assumption: Within the scope of this question, assume that-
The first parameter can be positive, negative or zero.
The second parameter will always be greater than or equal to 0. */
import java.io.*;
import java.util.*;
public class ProgExp6{
    public static int isMul(int input1,int input2){
        if(input1==0 || input2==0){
            return 3;
        }
        else if(input2>=0){
            if(input1%input2==0){
                return 2;
            }
            else{
                return 1;
            }
        }
        return 0;
    }
    public static void main(String a[]){
        int n,n1,res;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        n=sc.nextInt();
        n1=sc.nextInt();
        res=isMul(n,n1);
        System.out.println(res);
    }
}