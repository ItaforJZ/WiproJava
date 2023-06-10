public class Addition{
    public int addNum(int n1,int n2){
        int sum=n1+n2;
        return sum;
    }
    public static void main(String args[]){
        int a=23;
        int b=45;
        Addition obj=new Addition();
        int result=obj.addNum(a, b);
        System.out.println("Sum is : "+ result);
       }
}