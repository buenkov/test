public class loader {
    public static void main(String[] args) {
        String str = "Hi!";
        Cat cat1 = new Cat();
        System.out.printf("Вес кошки N1: %.2f %n", cat1.getWeight());
        cat1.feed(200.0);
        cat1.meow();
        System.out.printf("Вес кошки N1 после кормежки: %.2f %n", cat1.getWeight());
    }
}
