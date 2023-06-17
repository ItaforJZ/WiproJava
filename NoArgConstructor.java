public class NoArgConstructor{
    int i;
    private NoArgConstructor(){
        i=5;
        System.out.println("constructor is invoked");
    }
    public static void main(String args[]){
        NoArgConstructor obj=new NoArgConstructor();
        System.out.println("the value of is: "+ obj.i);
    }
}