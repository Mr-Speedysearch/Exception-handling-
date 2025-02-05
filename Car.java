import java.util.Locale;

public class Car {

//    Define fields in the body of the class and not in the method

    private String make = "BMW ";
    private String model = "M3 ";
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

    public void setMake(String make){
        this.make = make; // this refers to the instance in this object. We also have String make above ln5.

    }

    // we can also use an if

//    public void setMake(String make){
//        if (make == null) make ="unknown";
//        String lowercaseMake = make.toLowerCase();
//        switch (lowercaseMake){
//            case "Mercedes", "Porsche", "BMW", "Renault" -> this.make = make;
//            default -> {
//                this.make = "Unsupported";
//            }
//        }
//      }




    // add more setter
    public void setModel(String model) {
        this.model = model;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }


    //     add method are public because they interact with the object

    public void describeCar(){

//        Add print statement
        System.out.println(make + " " + model + " " + colour +  " " + (convertible ? "convertible" : " "));
    }

//    now we need to create an object in the main class from this class, this class is just a template.
}
