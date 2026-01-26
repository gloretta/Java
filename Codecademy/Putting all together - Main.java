public static void main(String[] args) {
    System.out.println("Main method started");
    Dog fido = new Dog("poodle", false, 4, true);
    Dog nunzio = new Dog("shiba inu", true, 12, true);
    boolean isFidoOlder = fido.age > nunzio.age;
    int totalDogYears = nunzio.age + fido.age;
    System.out.println("Two dogs created: a " + fido.breed + " and a " + nunzio.breed);
    System.out.println("The " + fido.breed + " is healthy: " + fido.isHealthy);
    System.out.println("The " + nunzio.breed + " is healthy: " + nunzio.isHealthy);
    System.out.println("The statement that fido is an older dog is: " + isFidoOlder);
    System.out.println("The total age of the dogs is: " + totalDogYears);
    System.out.println("Main method finished");
}




//This is only the Dog.java file! Look out for the Main.java file that goes with it!
