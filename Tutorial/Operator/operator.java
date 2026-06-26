package Tutorial.Operator;

public class operator {
    public static void main(String[] args) {

        // =====================================================
        // Arithmetic Operators
        // =====================================================

        int a = 10;
        int b = 5;

        System.out.println("Addition: " + (a + b)); // 15
        System.out.println("Subtraction: " + (a - b)); // 5
        System.out.println("Multiplication: " + (a * b)); // 50
        System.out.println("Division: " + (a / b)); // 2
        System.out.println("Modulus: " + (a % b)); // 0

        // Increment and Decrement Operators
        int c = 10;
        System.out.println("Post-increment: " + (c++)); // 10, then c becomes 11
        System.out.println("Pre-increment: " + (c--)); // c becomes 10, then prints 10

        // post increment
        int k = 10;
        k++;
        int j = k++; // j is assigned the value of k (11), then k becomes 12
        System.out.println("Value of j: " + j); // 11
        System.out.println("Value of k: " + k); // 12

        // pre increment
        int i = ++k;
        System.out.println("Value of i: " + i); // 13
        System.out.println("Value of k: " + k); // 13
        
        // =====================================================
        // Relational Operators
        // =====================================================
        int e = 10;
        int f = 20;

        System.out.println("Equal to: " + (e == f)); // false
        System.out.println("Not equal to: " + (e != f)); // true
        System.out.println("Greater than: " + (e > f)); // false
        System.out.println("Less than: " + (e < f)); // true
        System.out.println("Greater than or equal to: " + (e >= f)); // false
        System.out.println("Less than or equal to: " + (e <= f)); // true

        // =====================================================
        // Assignment Operators
        // =====================================================

        int g = 10;
        g += 5; // g = g + 5 => g becomes 15
        System.out.println("After += operator: " + g); // 15
        g -= 3; // g = g - 3 => g becomes 12
        System.out.println("After -= operator: " + g); // 12
        g *= 2; // g = g * 2 => g becomes 24
        System.out.println("After *= operator: " + g); // 24
        g /= 4; // g = g / 4 => g becomes 6
        System.out.println("After /= operator: " + g); // 6
        g %= 5; // g = g % 5 => g becomes 1
        System.out.println("After %= operator: " + g); // 1


        // =====================================================
        // Logical Operators
        // =====================================================

        boolean h = true;
        boolean m = false;
        System.out.println("Logical AND: " + (h && m)); // false
        System.out.println("Logical OR: " + (h || m)); // true
        System.out.println("Logical NOT: " + (!h)); // false

        // =====================================================
        // Bitwise Operators
        // =====================================================

        int n = 5; // 0101 in binary
        int o = 3; // 0011 in binary
        System.out.println("Bitwise AND: " + (n & oneDarray)); // 1 (0001 in binary)
        System.out.println("Bitwise OR: " + (n | oneDarray)); // 7
        System.out.println("Bitwise XOR: " + (n ^ oneDarray)); // 6 (0110 in binary)
        System.out.println("Bitwise NOT: " + (~n)); // -6 (in
        System.out.println("Left Shift: " + (n << 1)); // 10 (1010 in binary)
        System.out.println("Right Shift: " + (n >> 1)); // 2
        System.out.println("Unsigned Right Shift: " + (n >>> 1)); // 2

        byte x = 8;
        x = (byte) (x << 7); // Left shift by 7 positions
        System.out.println("After left shift: " + x); // -128

        x = (byte) (x << 1); // left shift by more 1 position
        System.out.println("After left shift: " + x); // 0
        // here compiler promotes byte to int before performing the shift operation, and the result is then cast back to byte, which can lead to unexpected results due to overflow.
        
        
        int y = 1;
        y = y >> 31; // Right shift by 31 position
        System.out.println("After right shift: " + y); // -2147483648
        // here compiler promotes int to int before performing the shift operation, and the result is then cast back to int, which can lead to unexpected results due to overflow.

        y = y >> 1; // right shift by more 1 position
        System.out.println("After right shift: " + y); // y = 1
        // int can't be right shifted by more than 31 positions, as it would result in undefined behavior. The right shift operator (>>) shifts the bits to the right, and if you try to shift by more than the number of bits in the data type (32 for int), it can lead to unexpected results due to overflow or underflow.
        // y >> 32 = y >> 0 (since shifting by the number of bits or more results in a shift of 0) => y remains unchanged (1 in this case)
        

        byte z = -128; // 1000 0000 in binary
        z = (byte) (z >>> 1); // Unsigned right shift by 1 position
        System.out.println("After unsigned right shift: " + z); // +64


        
        // =====================================================
        // Ternary Operator
        // =====================================================

        int p = 10;
        int q = 20;
        int max = (p > q) ? p : q; // if p is greater than q, max is p; otherwise, max is q
        System.out.println("Maximum value: " + max); // 20

        // =====================================================
        // instanceof Operator
        String str = "Hello";
        boolean isString = str instanceof String; // checks if str is an instance of String
        System.out.println("Is str an instance of String? " + isString); // true

        // =====================================================
        // Type Comparison Operator (instanceof)
        Object obj = new String("Hello");
        boolean isStringObj = obj instanceof String; // checks if obj is an instance of String
        System.out.println("Is obj an instance of String? " + isStringObj); //

        // =====================================================
        // Unary Operators
        int r = 5;
        System.out.println("Unary plus: " + (+r)); // 5
        System.out.println("Unary minus: " + (-r)); // -5
        boolean s = true;




    }
}
