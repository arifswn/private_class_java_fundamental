public class hello_morning {
    public static void main(String[] args) {
        String msg = "Selamat Pagi";
        String welcome = "Selamat Datang";
        byte status = 1; // 1 = true, 0 = false

        if (msg == "Selamat Pagi") {
            System.out.println(welcome);
            if (status == 1) {
                System.out.println("Sampai Jumpa");
            } else {
                System.out.println("Tidak Jadi keluar");
            }
        } else {
            System.out.println("Nothing to say");
        }
    }
}
