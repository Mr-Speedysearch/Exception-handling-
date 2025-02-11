public class CustomerMainChallenge {

// 1st create 3 fields
        private String name;
        private double creditLimit;
        private String emailAddress;

// 7th add constructor
// this is done if we have 2 parameters which is then passed below.
    public CustomerMainChallenge(){
        this("nobody", "nobody@outlook.com");

    }

// 5th add another constructor
// these 3 parameters are then passed below
    public CustomerMainChallenge(String name, String emailAddress) {
        // 6th we can only call another constructor by using this. 200 is hardcoded for name and email only.
        this(name, 200, emailAddress);
    }

// 3rd add in the constructor
    public CustomerMainChallenge(String name, double creditLimit, String emailAddress) {
        this.name = name;                               // our parameters == to our field names
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }


// 2nd use our getter for our fields
    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }




}
