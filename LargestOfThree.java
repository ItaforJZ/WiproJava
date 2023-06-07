public class LargestOfThree{
    public static void main(String args[]){
        int a=3;
        int b=6;
        int c=1;
        if(a>b && a>c){
            System.out.println("a is Largest");
        }
        else if(b>a && b>c){
            System.out.println("b is Largest");
        }
        else{
            System.out.println("c is Largest");
        }
    }
}