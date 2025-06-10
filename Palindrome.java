import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
     Scanner input=new Scanner(System.in);

     System.out.println("Enter the word:");
     String S1=input .next();

     String S2=new StringBuilder(S1).reverse().toString();

     if(S1.equals(S2)){
        System.out.println(S1+ " is a palindrome");
     }
     else{
        System.out.println(S1+" is not a palindrome");
         }
    }
}
