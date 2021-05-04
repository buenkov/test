package display;

public class Alphabet {
    public int a;
    public int b;

    Alphabet(int a) {
        this.a = 15;
        this.b = 33;
        System.out.println("a in supercalass " +a);
    }

    public int add(int v) {
        this.a += v;
        return a;
    }
}