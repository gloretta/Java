public class Dog {
    String breed;
    boolean hasOwner;
    int age;
    boolean isHealthy;

    public Dog(String dogBreed, boolean dogOwned, int dogYears, boolean healthy) {
        System.out.println("Constructor invoked!");
        breed = dogBreed;
        hasOwner = dogOwned;
        age = dogYears;
        isHealthy = healthy;
    }
}



//This is only the Dog.java file! Look out for the Main.java file that goes with it!
