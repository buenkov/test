package animal;

public class MainAn {
    public static void main(String[] args) {
/*

You have to override toString() method
in the class Zoo

*/

        Zoo zoo = new Zoo();
        zoo.change(new Dog(), 2);
        System.out.println(zoo);
    }
}
