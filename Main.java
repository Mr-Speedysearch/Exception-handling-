import com.sun.jdi.Mirror;

public class Main {

// access modifiers are top level when defined in the src and not in the code block.
// top level access modifiers are either Public or None (blank)

// Access modifiers for Classes: Public, Protected, None and Private
//we'd use Private for encapsulation - this hides the way the method works.

    public static void main(String[] args) {

      // define new variable
        // this is Type Car from other class, with variable called car.
        Car car = new Car();

        // refers to describeCar method
        car.describeCar();

//        to access the private fields we can use getters and setters.
//        Getters retrieves values and returns in, setters set the value of a private field.

        System.out.println("make = " + car.getMake());
        System.out.println("model = " + car.getModel());

    }
}