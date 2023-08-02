public class OperatorPembanding {
    public static void main(String[] args) {
        int a = 2;
        int b = 2;

        boolean c = a == b;
        // output dan keterangan
        // a == b: true
        System.out.println("a == b: " + c);

        boolean d = a != b;
        // output dan keterangan
        // a != b: false
        System.out.println("a != b: " + d);

        boolean e = a > b;
        // output dan keterangan
        // a > b: false
        System.out.println("a > b: " + e);

        boolean f = a < b;
        // output dan keterangan
        // a < b: false
        System.out.println("a < b: " + f);

        boolean g = a >= b;
        // output dan keterangan
        // a >= b: true
        System.out.println("a >= b: " + g);

        boolean h = a <= b;
        // output dan keterangan
        // a <= b: true
        System.out.println("a <= b: " + h);

        // tahapn 2

        int nilaiA = 12;
        int nilaiB = 4;
        boolean hasil;

        // apakah nilaiA sama dengan nilaiB?
        hasil = nilaiA == nilaiB;
        // output dan keterangan
        // nilaiA == nilaiB: false
        System.out.println("nilaiA == nilaiB: " + hasil);

        // apakah nilaiA tidak sama dengan nilaiB?
        hasil = nilaiA != nilaiB;
        // output dan keterangan
        // nilaiA != nilaiB: true
        System.out.println("nilaiA != nilaiB: " + hasil);

        // apakah nilaiA lebih besar dari nilaiB?
        hasil = nilaiA > nilaiB;
        // output dan keterangan
        // nilaiA > nilaiB: true
        System.out.println("nilaiA > nilaiB: " + hasil);

        // apakah nilaiA kurang dari nilaiB?
        hasil = nilaiA < nilaiB;
        // output dan keterangan
        // nilaiA < nilaiB: false
        System.out.println("nilaiA < nilaiB: " + hasil);

        // apakah nilaiA lebih besar atau sama dengan nilaiB?
        hasil = nilaiA >= nilaiB;
        // output dan keterangan
        // nilaiA >= nilaiB: true
        System.out.println("nilaiA >= nilaiB: " + hasil);

        // apakah nilaiA kurang atau sama dengan nilaiB?
        hasil = nilaiA <= nilaiB;
        // output dan keterangan
        // nilaiA <= nilaiB: false
        System.out.println("nilaiA <= nilaiB: " + hasil);

    }
}
