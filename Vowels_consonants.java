import java.util.Scanner;
public class Vowels_consonants {
    public static void main(String[]args){

        Scanner input=new Scanner(System.in);

        System.out.println("Enter any alphabate");
        char A=input.next().charAt(0);

        if(A=='A'||A=='E'||A=='I'||A=='O'||A=='U'||A=='a'||A=='e'||A=='i'||A=='o'||A=='u'){
            System.out.println(A+" is Vowel ");
        }
        else{
            System.out.println(A+" is consonant");
        }

    }
}