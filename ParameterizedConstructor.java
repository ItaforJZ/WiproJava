public class ParameterizedConstructor{
        String languages;
        ParameterizedConstructor(String lan){
            languages=lan;
            System.out.println(languages+"programming languages");
        }
        public static void main(String args[]){
            ParameterizedConstructor obj1=new ParameterizedConstructor("Java");
            ParameterizedConstructor obj2=new ParameterizedConstructor("C");

        }
}