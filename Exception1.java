import java.util.Scanner;

public class Exception1 {


//    Here scanner won't work, this is how we can handle an exception which is an error in code
//    First we create a code block around the code with the error - try statement codeblock
//    try { *statement that gets error*
//     } catch (exception e){
//      }

    public static void main (String[] args){

        int currentYear = 2025;

        try {
            System.out.println(getInputFromConsole(currentYear));
        } catch (NullPointerException e) {
            // include variable name
            System.out.println(getInputFromScanner(currentYear));
        }

    }

// method using input from console
    public static String getInputFromConsole(int currentYear) {


        String name = System.console().readLine("Hi, what's your name?");
        System.out.println("Hi " + name + " Welcome!");

        String dateOfBirth = System.console().readLine("What year were you born?");
        int age = currentYear - Integer.parseInt(dateOfBirth);

        return "so you are " + age + "years old";

    }

//    scanner class can scan text form user input, first we create an instance.
//    import java.util.scanner; lets us import from other peoples code

    public static String getInputFromScanner(int currentYear) {

        // create new scanner variable (scanner) and new object of type input
        Scanner scanner = new Scanner(System.in); // system in inputs info

        // here we take input from console method

        //this doesn't support the prompt below so we have to change it, commented out*
//          String name = System.console().readLine("Hi, what's your name?");

        System.out.println("Hi, what's your name?");
        // take the user input by scanner above
        String name = scanner.nextLine();

        System.out.println("Hi " + name + " Welcome!");

        //System.out.println("what year were you born?");

        System.out.println("Enter year of birth between" + (currentYear - 100) + (currentYear));
        boolean validation = false;
        int age = 0;

        do {

//            String dateOfBirth = scanner.nextLine();
//
//            // our age is from our int - the data the user input from dob, which we convert into an integer
//            age = currentYear - Integer.parseInt(dateOfBirth);

            // now we use our other method and call it here
            // scanner.nextLine will take user input
            age = checkData(currentYear,scanner.next());
            validation =  age < 0 ? false : true; // if age is less than 0 then its false otherwise true
        } while (!validation); // validation is false


        return "So you are " + age + " years old";

    }

// what happens if we get out of range numbers from the input like age = 1000
//    what we can do is a do while loop with conditions so the user can retry until conditions are met.
//    we create a rule cant be older than 99, this is also for -neg years


    public static int checkData(int currentYear, String dateOfBirth) {

        // declare variables
        int dob = Integer.parseInt(dateOfBirth);
        int minimumYear = currentYear - 100;
        int maxYear = currentYear -1;

        // create conditions

        if ((dob < minimumYear) || (dob > maxYear)) {
            return -1; // this indicates failure
        }

        // return the age back to checkData
        return (currentYear - dob);
    }

    // if we want them to have attempts if they enter incorrect data we input do and while. Set it to false and only
    // enter out the loop when the input dob fits within our range of age

}


