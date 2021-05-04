package example;

public class AmphibiTank extends Tank{
    public void swim(){
        System.out.println("Я плыву");
    }

    public static void main(String[] args) {
        AmphibiTank t = new AmphibiTank();
                t.swim();
                t.getTankount();
    }
}
