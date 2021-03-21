package example;

public class Cat {
    public static void main(String[] args) {
Cat barsic = new Cat(3000,"Barsic",5,"grey");
barsic.meow();
    }


    public Cat(double weight, String name, int age, String color) {
        this.weight = weight;
        this.name = name;
        this.age = age;
        this.color = color;
    }


            //Поля класса
        double weight;
        String name;
        int age;
        String color;
        //Методы класса
        void meow () {
            System.out.println("Meow");
        }

        void pee () {
            weight -= 20;
        }

        void eat () {
            weight += 50;
        }

}

