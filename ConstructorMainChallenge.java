public class ConstructorMainChallenge {

    public static void main(String[] args) {

        // 4th input into our fields
        CustomerMainChallenge customerMainChallenge = new CustomerMainChallenge("Jay", 8000, "jaysmoney@outlook.com");
        System.out.println(customerMainChallenge.getName() + " " + customerMainChallenge.getCreditLimit() + " " + customerMainChallenge.getEmailAddress());

/* to add another customer we need to use a no args constructor in our customer class because a constructor already
    exists. We go back into Customer class for step 5.
*/

// 8th Add in your call constructor

    CustomerMainChallenge secondcustomer = new CustomerMainChallenge();
        System.out.println(secondcustomer.getName() + " " + secondcustomer.getCreditLimit() + " " +
                secondcustomer.getEmailAddress());
    }


}
