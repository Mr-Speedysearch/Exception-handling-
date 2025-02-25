public class Dog extends Animal {
    /* Extend - this specifies the superclass(or parent class) that we're declaring
    here Dog is a subclass/child class of the parent class Animal
     */

    // create fields for ear and tail shape
    private String earShape;
    private String tailShape;

    public Dog () {
        super("Staffy", "Big", 300); //is similar to this(), a way to call a superclass constructor from the subclass
    }

    // add constructor
    public Dog(String type, double weight){
        this(type, weight, "perky", "curled");
    }

    // we change size and add ternary operator
    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type, weight < 15 ? "small" : (weight < 35 ? "medium" : "large"), weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    //make noise method on Dog
    public void makeNoise(){
        bark();
        System.out.println();
    }

    public void move (String speed){
        super.move(speed);
       // System.out.println("Dog walk, run and wag their tail");
        if (speed == "slow") {
            walk();
            wag();
        }   else{
            run();
            bark();
        }
        System.out.println();
    }

    // private bark method
    private void bark(){
        System.out.print("Woof ");
    }

    private void run(){
        System.out.print("Running ");
    }

    private void wag(){
        System.out.print("Tail Wagging ");
    }

    private void walk(){
        System.out.print("Walking ");

    }
}
