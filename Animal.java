public class Animal {

    // create our given fields
    private String type;
    private String size;
    private double weight;

    // add the super() constructor
    public Animal() {
    }

    // add constructor
    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    // use toString to print into
    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", weight=" + weight +
                '}';
    }

    // add methods for move and noise
    //how animal moves
    public void move (String speed){
        System.out.println(type + " move " + speed);
    }

    // what noise animal makes
    public void makeNoise (){
        System.out.println(type + " is making noise ");
    }

}
