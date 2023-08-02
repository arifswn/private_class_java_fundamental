public class StudiKasusPembanding {
    public static void main(String[] args) {
        boolean x = true;
        boolean y = false;

        // output dan keterangan
        // x == y: false
        System.out.println("x == y: " + (x == y));
        // penjelasan: x tidak sama dengan y, maka hasilnya false

        // x != y: true
        System.out.println("x != y: " + (x != y));
        // penjelasan: x tidak sama dengan y, maka hasilnya true

        // x || y: true
        System.out.println("x || y: " + (x || y));
        // penjelasan: x atau y, maka hasilnya true

        // x && y: false
        System.out.println("x && y: " + (x && y));
        // penjelasan: x dan y, maka hasilnya false

        // !(x && y): true
        System.out.println("!(x && y): " + !(x && y));
        // penjelasan: bukan x dan y, maka hasilnya true

        // !(x || y): false
        System.out.println("!(x || y): " + !(x || y));
        // penjelasan: bukan x atau y, maka hasilnya false

        // x ^ y: true
        System.out.println("x ^ y: " + (x ^ y));
        // penjelasan: x atau y, maka hasilnya true

        // x ^ x: false
        System.out.println("x ^ x: " + (x ^ x));
        // penjelasan: x atau x, maka hasilnya false

        // y ^ y: false
        System.out.println("y ^ y: " + (y ^ y));
        // penjelasan: y atau y, maka hasilnya false

        // x ^ y ^ x: false
        System.out.println("x ^ y ^ x: " + (x ^ y ^ x));
        // penjelasan: x atau y atau x, maka hasilnya false

        // x ^ y ^ y: true
        System.out.println("x ^ y ^ y: " + (x ^ y ^ y));
        // penjelasan: x atau y atau y, maka hasilnya true

        // ==, !=, >, <, >=, <=, &&, ||, !, ^, &, |, adalah operator pembanding
        // operator pembanding akan menghasilkan nilai boolean
        // == disejajarkan dengan equals
        // != disejajarkan dengan not equals
        // > disejajarkan dengan lebih besar
        // < disejajarkan dengan lebih kecil
        // >= disejajarkan dengan lebih besar sama dengan
        // <= disejajarkan dengan lebih kecil sama dengan
        // && disejajarkan dengan and
        // || disejajarkan dengan or
        // ! disejajarkan dengan not
        // ^ disejajarkan dengan xor
        // & disejajarkan dengan and
        // | disejajarkan dengan or

        /*
         * PENJELASAN
         */

        // ^ berfungsi untuk mengecek apakah ada salah satu yang true
        // jika ada salah satu yang true, maka hasilnya true
        // jika tidak ada yang true, maka hasilnya false
        // ^ bernama XOR (exclusive or)
        // ^ hanya akan true jika salah satu true, tapi tidak keduanya

        // & berfungsi untuk mengecek apakah keduanya true
        // jika keduanya true, maka hasilnya true

        // | berfungsi untuk mengecek apakah salah satu true
        // jika salah satu true, maka hasilnya true

        // && berfungsi untuk mengecek apakah keduanya true
        // jika keduanya true, maka hasilnya true

        // || berfungsi untuk mengecek apakah salah satu true
        // jika salah satu true, maka hasilnya true

        // ! berfungsi untuk membalikkan nilai boolean
        // jika true, maka hasilnya false
        // jika false, maka hasilnya true

        // == berfungsi untuk mengecek apakah sama
        // jika sama, maka hasilnya true
        // jika tidak sama, maka hasilnya false

        // != berfungsi untuk mengecek apakah tidak sama
        // jika tidak sama, maka hasilnya true
        // jika sama, maka hasilnya false

        // > berfungsi untuk mengecek apakah lebih besar
        // jika lebih besar, maka hasilnya true
        // jika tidak lebih besar, maka hasilnya false

        // < berfungsi untuk mengecek apakah lebih kecil
        // jika lebih kecil, maka hasilnya true
        // jika tidak lebih kecil, maka hasilnya false

        // >= berfungsi untuk mengecek apakah lebih besar sama dengan
        // jika lebih besar sama dengan, maka hasilnya true
        // jika tidak lebih besar sama dengan, maka hasilnya false

        // <= berfungsi untuk mengecek apakah lebih kecil sama dengan
        // jika lebih kecil sama dengan, maka hasilnya true
        // jika tidak lebih kecil sama dengan, maka hasilnya false

    }
}
