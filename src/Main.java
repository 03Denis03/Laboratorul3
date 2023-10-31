// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Max", 2);
        Dog dog2 = new Dog("Maia",4);
        System.out.println("Values of objects before using setter method:");
        System.out.println("Name: " + dog1.name + " " + "Age: " + dog1.age);
        System.out.println("Name: " + dog2.name + " " + "Age: " + dog2.age);
        dog1.setNameAndAge("Rex", 5);
        dog2.setNameAndAge("Linda", 3);
        System.out.println("Values of objects after using setter method:");
        System.out.println("Name: " + dog1.name + " " + "Age: " + dog1.age);
        System.out.println("Name: " + dog2.name + " " + "Age: " + dog2.age);
    }
}