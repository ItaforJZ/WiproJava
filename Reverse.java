public class Reverse{
    public static void main(String args[]){
        int num=453;
        int rev=0;
        while(num!=0){
            int rem=num%10;
            rev=rev*10+rem;
            num/=10;
        }
        System.out.println(rev);
    }
}