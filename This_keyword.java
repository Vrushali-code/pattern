


public class This_keyword {
    
        String name;
        int age;
        void printInfo() { 
       System.out.println (this.name);
       System.out.println (this.age);
        }
        public static void main (String[]args)
        {
            This_keyword S1= new This_keyword();
            S1. name="xyz";
            S1. age= 19;
           S1.printInfo();
        }
    }

