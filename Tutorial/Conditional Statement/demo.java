

public class demo {
    public static void main(String[] args) {

        // Flow of control

        // If statement
        int number = 10;
        if (number > 0) {
            System.out.println("The number is positive.");
        }

        // If-else statement
        int number2 = -5;
        if (number2 > 0) {
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is negative.");
        }

        // If-else-if ladder
        int number3 = 0;
        if (number3 > 0) {
            System.out.println("The number is positive.");
        } else if (number3 < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        // Nested if statement
        int number4 = 15;
        if (number4 > 0) {
            if (number4 % 2 == 0) {
                System.out.println("The number is positive and even.");
            } else {
                System.out.println("The number is positive and odd.");
            }
        } else {
            System.out.println("The number is not positive.");
        }

        // Switch statement
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day.");
        }

        // Ternary operator
        int number5 = 10;
        String result = (number5 % 2 == 0) ? "Even" : "Odd";
        System.out.println("The number is " + result + ".");

        
    
    }
    
}
