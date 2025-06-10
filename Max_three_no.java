import java.util.Scanner;
public class Max_three_no {
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        System.out.println("enter first number");
        int n1=input.nextInt();
         System.out.println("enter second number");
        int n2=input.nextInt();
         System.out.println("enter third number");
        int n3=input.nextInt();
        if(n1>n2&&n1>n3){
            System.out.println(n1+" is greater");
        }
        if(n2>n1&&n2>n3){
            System.out.println(n2+" is greater");
        }
        else{
            System.out.println (n3+" is greater");
        }
        }


    }
    

