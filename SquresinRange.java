public class SquresinRange{
    private static int getSquares(int x){
        return x*x;
    }
    public static void main(String args[]){
        for(int i=1;i<=5;i++){
            int result=getSquares(i);
            System.out.println("Squares are: "+result);
        }
    }
}