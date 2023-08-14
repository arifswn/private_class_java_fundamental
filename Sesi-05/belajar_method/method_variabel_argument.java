public class method_variabel_argument {
    public static void main(String[] args) {
        int[] values = { 1, 2, 3, 4 };
        int average = findAverage(values);

        System.out.println("Average is " + average);
    }

    static int findAverage(int[] values) {
        int sum = 0;

        for (int value : values) {
            sum = sum + value;
        }

        return sum / values.length;
    }
}
