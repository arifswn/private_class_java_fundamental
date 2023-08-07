public class hello_logic {
    public static void main(String[] args) {
        // langkah 1
        int x = 5; // nilai x = 5
        boolean y = x == 5; // jika x == 5, maka y = true

        if (y) { // jika y = true, maka print "True"
            System.out.println("True");
        }

        // langkah 2
        int e = 5;
        if (e == 5) { // jika e == 5, maka print "True"
            System.out.println("True atau e bernilai 5");
        }else{
            System.out.println("False atau e tidak bernilai 5");
        }

        // langkah 3 (versi pendek)
        int f = 5;
        if (f == 5) 
            System.out.println("True atau f bernilai 5");
        else
            System.out.println("False atau f tidak bernilai 5");
    }
}
