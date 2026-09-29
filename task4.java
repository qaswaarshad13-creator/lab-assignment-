class Marks {
    int m1, m2, m3;
    Marks() {
        m1 = 0;
        m2 = 0;
        m3 = 0;
    }
    Marks(int a, int b, int c) {
        m1 = a;
        m2 = b;
        m3 = c;
    }
    int sum() {
        return m1 + m2 + m3;
    }
}
public class Main {
    public static void main(String[] args) {
        Marks s = new Marks(80, 70, 90);
        System.out.println(s.sum());
    }
}
