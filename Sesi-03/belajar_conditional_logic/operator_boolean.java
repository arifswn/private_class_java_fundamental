public class operator_boolean {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;

        boolean hasil;

        hasil = x < y;
        // kenapa x < y ? karena x = 5 dan y = 10,
        // maka 5 < 10, maka hasilnya true
        hasil = x > y;

        hasil = x <= 5;
        // kenapa x <= y ? karena x = 5 dan 5 <= 5,
        // maka hasilnya true

        hasil = y >= 11;
        // kenapa y >= 11 ? karena y = 10 dan 11 > 10,
        // maka hasilnya false

        hasil = x == y;
        // kenapa x == y ? karena x = 5 dan y = 10,
        // maka 5 == 10, maka hasilnya false

        hasil = x != y;
        // kenapa x != y ? karena x = 5 dan y = 10,
        // maka 5 != 10, maka hasilnya true

        hasil = x > y || x < y;
        // kenapa x > y || x < y ? karena x = 5 dan y = 10,
        // maka 5 > 10 || 5 < 10, maka hasilnya true

        hasil = 3 < x && x < 6;
        // kenapa 3 < x && x < 6 ? karena x = 5 dan y = 10,
        // maka 3 < 5 && 5 < 6, maka hasilnya true

        hasil = !hasil;
        // kenapa !hasil ? karena hasil = true, maka !hasil = false

        // output
        System.out.println(hasil);
    }
}
