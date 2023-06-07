import java.util.Scanner;

class WhiteSpaces {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the string");
    String s1 = sc.nextLine();
    System.out.println("Original String: " + s1);
    s1 = s1.replaceAll("\\s", "");
    System.out.println("Final String: " + s1);
    sc.close();
  }
}