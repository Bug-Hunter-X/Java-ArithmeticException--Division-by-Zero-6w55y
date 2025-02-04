public class MyClass {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        try {
            y = 5 / x;
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero!");
            //Handle the exception appropriately, for example by setting a default value, or logging the error
            y = -1; //Set a default value
        }
        System.out.println(y);
    }
}