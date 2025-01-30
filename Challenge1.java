import java.util.Scanner;

public class Challenge1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // declare variables, we're allowing decimals
        int counter = 1;
        double sum = 0;

        // using while to check input before executing statement
        //do {*
        while (counter <= 5){
            System.out.println("Enter number #" + counter + ":"); // prompt user to enter number and we include counter
            String nextNumber = scanner.nextLine(); // input from console we turn into next number

            // we want to exclude anything that isn't a whole number
            try {
                // this is out number input
                double number = Double.parseDouble(nextNumber);
                // increment by +1 until 5
                counter++;
                // total each number
                sum += number;
            } catch (NumberFormatException e) {
                System.out.println("invalid number");
            }

        } // while (counter < 5 );

        System.out.println("Sum of all numbers = " + sum);
    }
} //for the counter to end input at 4
