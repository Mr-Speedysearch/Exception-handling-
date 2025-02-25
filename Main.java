public class Main {

    public static void main(String[] args) {

        // create a method that takes any animal object and executes its 3 methods.

        // create instance
        Animal animal = new Animal("Generic Animal", "Huge", 400);
        doAnimalStuff(animal, "slow");

        // create dog instance
        Dog dog = new Dog();
        doAnimalStuff(dog, "fast");

        Dog yorkie = new Dog("Yorkie", 15);
        doAnimalStuff(yorkie, "slow");

        Dog retriever = new Dog("Retriever", 65, "floppy", "Pointy");
        doAnimalStuff(retriever, "fast");

        Fish goldie = new Fish("Goldfish", 0.25, 3, 5 );
        doAnimalStuff(goldie, "fast");
    }

    public static void doAnimalStuff(Animal animal, String speed) {
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_____________");

    }
}


