import java.util.Scanner;
public class Add_Complex2Num {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Enter first real1 number");
        int real1=input.nextInt();

         System.out.println("Enter first Imaginary1 number");
        int Imaginary1=input.nextInt();

         System.out.println("Enter second real2 number");
        int real2=input.nextInt();

         System.out.println("Enter second Imaginary2 number");
        int Imaginary2=input.nextInt();

        int real =real1+real2;
        int imag =Imaginary1+Imaginary2;

        System.out.println("The Addition of Complex number is " +real+" + "+imag+"i");

        
    }
}
