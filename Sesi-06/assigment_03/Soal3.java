public class Soal3 {
    public static void main(String[] args) {
        /*
         * Soal 3
         * Buatlah sebuah method untuk mendapatkan nilai terbesar dari sebuah array.
         * Parameter dari methodnya adalah array of integers dan
         * output dari methodnya
         * adalah integer (yang merupakan angka paling besar)
         * 
         */

        // Create an array of integers
        int[] numbers = { 1, 2, 3, 4, 5 };

        // Print the largest number
        System.out.println(getLargestNumber(numbers));

    }

    // Create a method to get the largest number
    static int getLargestNumber(int[] numbers) {
        int largestNumber = numbers[0];
        for (int number : numbers) {
            if (number > largestNumber) {
                largestNumber = number;
            }
        }
        return largestNumber;
    }
}
