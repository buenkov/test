package display;

public class Battle  {
    final static private int MAX = 5;

    private Monster[] monsters;
    private int n = 0;

    Battle(){
        monsters = new Monster[MAX];
    }

    public void add(Monster monster){
        if (n < MAX) {
            monsters[n++] = monster;
        }
        else{
            System.out.println("No more monsters!");
        }
    }

    public void run(){
        for (int i = 0; i < n; i++) {
            if (monsters[i] != null){
                monsters[i].attack();
            }
        }
    }

    public void start(){
        run();
    }

    public static void main(String[] args) {
        Battle battle = new Battle();
        battle.add(new Zombie("Alice"));
        battle.add(new Zombie("Bob"));
        battle.start();

    }
}