package display;

public class Zombie extends Monster {
    public Zombie(String name) {
        super(name + " the Zombie", 5);
    }

    @Override
    public void growl(){
        growls = "Raaaauuughhhh";
        super.growl(growls);

    }

    @Override
    public void attack(){
        super.attack();
        growl();
    }

    public static void main(String[] args) {
        Zombie z = new Zombie("Bob");
        z.growl();
        z.attack();
    }
}
