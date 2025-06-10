import java.util.Scanner;
public class Simple_Interest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("enter the principal");
        double principal=input.nextDouble();

         System.out.println("enter the rate");
        double rate =input.nextDouble();

         System.out.println("enter the Time");
        double time=input.nextDouble();
        double SI=(principal*rate*time)/100;
        System.out.println("The Simple Interest is "+ SI);

    }
    
}
