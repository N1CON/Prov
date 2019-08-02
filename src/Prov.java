public class Prov {
    public static void main(String args[]) {
        int a, b, c;
        a = 12;
        b = 8;
        if (a < b) System.out.println("a меньше Ь");
        if (a == b) System.out.println("a равен b");
        if (a > b) System.out.println( "a больше b");
        System.out.println();
        c = a - b;
        System.out.println("c содержит -");
        if (c >= 0) System.out.println("c - не отрицательное число");
        if (c < 0) System.out.println("c - отрицательное число");
        System.out.println();
        c = b - a;
        System.out.println("c содержит +");
        if (c >= 0) System.out.println("c - не отрицательное число");
        if (c < 0) System.out.println("c - отрицательное число");
    }
}