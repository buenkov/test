package display;

public class Amain extends Alphabet{
    Amain(int a, int b) {
        super(a);
        this.b = b;
    }

    @Override
    public int add(int v) {
        System.out.println("super add"+ super.add(v)+"a in subclass" + a);
        return super.add(v) + a;
    }

    public static void main(String args[]) {
        Amain s = new Amain(10, 12);
        System.out.println(s.add(10));
    }
}