import java.util.Scanner;
public class Compound_Interest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("enter the principal");
        double principal=input.nextDouble();

         System.out.println("enter the rate");
        double rate =input.nextDouble();

         System.out.println("enter the Time");
        double time=input.nextDouble();

        double CI=principal*Math.pow((1+rate/100),time)-principal;

        System.out.println("The Compound Interest is "+ CI);



        
    }
    
}
