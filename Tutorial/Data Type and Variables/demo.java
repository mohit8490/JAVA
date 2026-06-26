

public class demo {
    public static void main(String[] args) {
       
        // Integers => byte, short, int, long
        byte a = 127; // 1 byte
        short b = 32767; // 2 bytes
        int c = 2147483647; // 4 bytes
        long d = 9223372036854775807L; // 8 bytes

        // Floating-point numbers => float, double
        float e = 3.14f; // 4 bytes {single precision}
        double f = 3.141592653589793; // 8 bytes {double precision}

        // Characters => char
        char g = 'A'; // 2 bytes

        // Boolean => boolean
        boolean h = true; // 1 byte (size may vary)

        // Output the values
        System.out.println("Byte value: " + a);
        System.out.println("Short value: " + b);
        System.out.println("Int value: " + c);
        System.out.println("Long value: " + d);
        System.out.println("Float value: " + e);
        System.out.println("Double value: " + f);
        System.out.println("Char value: " + g);
        System.out.println("Boolean value: " + h);


        // but we can Also write numbers in different formats
        int decimal = 100; // Decimal format
        int binary = 0b1100100; // Binary format (prefix 0b)  and 100 = 1100100 in binary
        int octal = 0144; // Octal format (prefix 0) and 100 = 144 in octal
        int hexadecimal = 0x64; // Hexadecimal format (prefix 0x) and 100 = 64 in hexadecimal

        System.out.println("Decimal value: " + decimal);
        System.out.println("Binary value: " + binary);
        System.out.println("Octal value: " + octal);
        System.out.println("Hexadecimal value: " + hexadecimal);


        // if we want to write our scientific numbers we can use the 'E' notation
        double scientific = 1.23e4; // 1.23 x 10^4 = 12300
        System.out.println("Scientific notation value: " + scientific);
    }
}
