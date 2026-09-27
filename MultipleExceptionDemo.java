public class MultipleExceptionDemo {
    public static void main(String[] args) {
        try{
            int[]numbers={10,20,30};
            System.out.println(numbers[5]);
            int result=10/0;
            System.out.println(result);

        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("array index is invalid.");
        }
        catch(ArithmeticException e){
            System.out.println("cannot divide by zero.");
        }
    }
}
