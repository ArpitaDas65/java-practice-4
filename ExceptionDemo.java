import java.util.Scanner;
public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        try{
            System.out.println("enter first number:");
            int a=sc.nextInt();

            System.out.println("enter second number:");
            int b=sc.nextInt();
            
            int result=a/b;

            System.out.println("result:"+result);
        }
        catch(ArithmeticException e){
            System.out.println(
                "error:cannot divide by zero."
            );
        }finally{
            System.out.println("program completed.");
        }
        sc.close();
        
    }
    
}
