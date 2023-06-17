public class ConstructorOverloading{
    int i;
    ConstructorOverloading(){
        System.out.println("First is invoked");
    }
    ConstructorOverloading(int a){
        i=a;
        System.out.println(i+"numbers");
    }
    public static void main(String args[]){
        ConstructorOverloading obj=new ConstructorOverloading();
        ConstructorOverloading obj1=new ConstructorOverloading(7);
    }
}