public class calculator {
    public static void main(String[] args) {
        int sumResult = MathUtil.add(3, 2);
        int subResult = MathUtil.subtract(4, 1);
        System.out.println("Hasil penjumlahan: " + sumResult);
        System.out.println("Hasil pengurangan: " + subResult);
    }
}

class MathUtil {
    static int add(int a, int b) {
        return a + b;
    }

    static int subtract(int a, int b) {
        return a - b;
    }
}
