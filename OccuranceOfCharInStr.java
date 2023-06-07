public class OccuranceOfCharInStr{
    public static void main(String args[]){
        String S="Harshamar";
        char ch='a';
        int count=0;
        for(int i=0;i<S.length();i++){
            if(ch==S.charAt(i)){
                count++;
            }

        }
        System.out.println("Frequency of " + ch + " = " + count);
    }
}