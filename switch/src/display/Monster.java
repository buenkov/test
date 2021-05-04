package display;

public abstract class Monster {
    String name;
    int damage;
    int hp = 15;
    //здоровье
    int force;
    //сила повреждения
    boolean destroyed = false;
    // состояние жизни
String growls;


    public Monster(String name, int damage) {
        this.name = name;
        this.damage = damage;
        System.out.println("Monster "+this.name+ " was created");
    }

    public void attack(){
    System.out.println("Monster "+this.name+ " attacked with damage "+this.damage);}

    protected int getForce(){
        return force;
    }

    public boolean isDestroyed(){
        return destroyed;
    }
    protected boolean damage(int dhp){
        hp -= dhp;
        if (hp < 0){
            destroyed = true;
            System.out.println("Monster " + name + " was destroyed");
            return true;
        }
        return false;
    }






    public void growl(String growls){
        System.out.println(growls+ " "+ this.name+"growled");
    }
public void growl(){
    growls = "buuu";
        System.out.println(growls+ " "+ this.name+"growled");
}
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
