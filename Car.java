public class Car {

//    Define fields in the body of the class and not in the method

    private String make = "BMW";
    private String model = "M3";
    private String colour = " Merlin Purple ";
    private int doors = 5;
    private boolean convertible = false;


//    use some getter methods for main class access
    // use getters for all fields

    // code > generate > getters > select fields
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColour() {
        return colour;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    //     add method are public because they interact with the object

    public void describeCar(){

//        Add print statement
        System.out.println(doors + "door" + colour +  "  " + model +  " " + (convertible ? "convertible" : " "));
    }

//    now we need to create an object in the main class from this class, this class is just a template.
}
