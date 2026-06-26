

public class demo {
    public static void main(String[] args) {
        // Type Conversion in Java


        // Implicit Type Conversion (Widening)
        
        // 1. byte to short
        byte num1 = 10;
        short num2 = num1; // byte to short conversion

        // 2. short to int
        short num3 = 5; // short to int conversion
        int num4 = num3; // short to int conversion

        // 3. int to long
        int num5 = 100; // int to long conversion
        long num6 = num5; // int to long conversion

        System.out.println("Implicit Type Conversion: " + num2);
        System.out.println("Implicit Type Conversion: " + num4);
        System.out.println("Implicit Type Conversion: " + num6);



        // Explicit Type Conversion (Narrowing)

        // 1. short to byte
        short num7 = 100;
        byte num8 = (byte) num7; // short to byte conversion

        // 2. int to short
        int num9 = 1000;
        short num10 = (short) num9; // int to short conversion

        // 3. long to int
        long num11 = 100000L;
        int num12 = (int) num11; // long to int conversion
 
        System.out.println("Explicit Type Conversion: " + num8);
        System.out.println("Explicit Type Conversion: " + num10);
        System.out.println("Explicit Type Conversion: " + num12);


        // Truncation during narrowing conversion
        double num16 = 9.99;
        int num17 = (int) num16; // double to int conversion (truncation)

        float num18 = 3.99f;
        int num19 = (int) num18; // float to int conversion (truncation)  
        System.out.println("Truncation during Narrowing Conversion: " + num17);
        System.out.println("Truncation during Narrowing Conversion: " + num19);



        // character to integer conversion
        char ch = 'A';
        int asciiValue = (int) ch; // char to int conversion
        System.out.println("Character to Integer Conversion: " + asciiValue);

        // integer to character conversion
        int num13 = 66;
        char ch2 = (char) num13; // int to char conversion
        System.out.println("Integer to Character Conversion: " + ch2);

        // float to double conversion
        float num14 = 3.14f;
        double num15 = (double) num14; // float to double conversion
        System.out.println("Float to Double Conversion: " + num15);

        
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = .1234;
        double result = (f * b) + (i / c) - (d * s);
        System.out.println((f * b)+ " + " + (i / c) + " - " + (d * s));
        System.out.println("The result is: " + result);

        // f * b => float * byte => float
        // i / c => int / char => int
        // d * s => double * short => double

        // The final expression is evaluated as:
        // float + int - double => double (the largest type among the operands)
        

    }
}
