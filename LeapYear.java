import java.util.*;
public class LeapYear{
    public static void main(String args[]){
        int year;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year: ");
        year=sc.nextInt();
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
 
            // Both conditions true- Print leap year
            System.out.println(year + " : Leap Year");
        }
 
        else {
            // Any condition fails- Print Non-leap year
            System.out.println(year + " : Non - Leap Year");
        }
    }
}