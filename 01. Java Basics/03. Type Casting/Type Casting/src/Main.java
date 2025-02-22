public class Main {
    public static void main(String[] args) {

        //Widening type casting (implicit) example
        int intValue1 = 5;
        double doubleValue1 = intValue1 + 1.5;

        System.out.println("int to double: " + doubleValue1);

        //Narrowing type casting (explicit) example
        double doubleValue2 = 2.5;
        int intValue2 = (int) doubleValue2;

        System.out.println("double to int: " + intValue2);
    }
}