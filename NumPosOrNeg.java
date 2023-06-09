import java.util.*;
public class NumPosOrNeg{
    public static void main(String args[]){
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        num=sc.nextInt();
        if(num<0){
            System.out.println("Negative");
        }
        else{
            System.out.println("Postive");
        }
    }
}