public class recursive_method {
    public static void main(String[] args) {
        int val = factorialLoop(3);
        System.out.println("Hasil Faktorial adalah " + val);
    }

    static int factorialLoop(int value) {
        int factorial = 1;
        for (int i = 1; i <= value; i++) {
            factorial *= i;
            System.out.println("Faktorial dari " + i + " adalah " + factorial);
        }

        return factorial;
    }
}
