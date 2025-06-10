import java.util.Scanner;
public class Quotient_Remainder {
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);

        System.out.println("enter Dividend");
        int A=input.nextInt();

        System.out.println("enter Divisor");
        int B=input.nextInt();

        int C=A/B;
        int D=A%B;
         System.out.println("Quotient is "+C);
         System.out.println("Remainder is "+D);
         


    }
}
