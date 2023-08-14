
pembelajaran tentang method
-----
method adalah sebuah fungsi yang ada di dalam sebuah class
method adalah sebuah fungsi yang ada di dalam sebuah object
method adalah sebuah fungsi yang ada di dalam sebuah class yang bisa diakses oleh object

void main() {
    print('hello world');
}

digunakan untuk menampilkan sesuatu di layar
void tidak mengembalikan nilai apapun

void main() {
    int a = 1;
    int b = 2;
    int c = a + b;
    print(c);
}
fungsi diatas akan mengembalikan nilai 3
tetapi kita harus menambahkan print di depannya
tidak bisa digunakan untuk mengembalikan nilai
tapi bisa digunakan untuk menampilkan sesuatu di layar

int main() {
    int a = 1;
    int b = 2;
    int c = a + b;
    return c;
}
fungsi diatas akan mengembalikan nilai 3
tetapi kita harus menambahkan return di depannya
tidak bisa digunakan untuk menampilkan sesuatu di layar
tapi bisa digunakan untuk mengembalikan nilai


//tambah-tambahan
1 + 1 = 2
5 + 7 = 12

//kurang-kurangan
1 - 1 = 0

jika kita menggunakan method di java

add(1, 1) = 2
add(5, 7) = 12

function add(int a, int b) {
    return a + b;
}

apa itu recursive function?
function yang memanggil dirinya sendiri

apa itu reverse string?
string yang dibalik

apa itu reverse integer?
integer yang dibalik

apa itu changeLocal variable?
variable yang diubah nilainya
contoh:
int a = 1;
a = 2;

apa itu override method?
method yang diubah nilainya
contoh override method di java:

class A {
    void print() {
        System.out.println("A");
    }
}

class B extends A {
    void print() {
        System.out.println("B");
    }
}

penjelasan diatas : 
class A adalah parent class
class B adalah child class
class B extends A artinya class B mewarisi class A
void print() adalah method yang ada di class A
void print() adalah method yang ada di class B
void print() di class B akan mengoverride void print() di class A
artinya 
void print() di class B akan mengubah isi dari void print() di class A
sehingga jika kita memanggil void print() di class B
dengan output :
B


apa itu overloading method?
method yang memiliki nama yang sama tapi parameter yang berbeda

contoh overloading method di java:

class A {
    void print() {
        System.out.println("A");
    }
    void print(int a) {
        System.out.println("A");
    }
}
penjelasan diatas :
void print() adalah method yang ada di class A
void print(int a) adalah method yang ada di class A
void print() dan void print(int a) memiliki nama yang sama
void print() dan void print(int a) memiliki parameter yang berbeda
void print() dan void print(int a) adalah overloading method

apa itu constructor?
method yang akan dijalankan pertama kali ketika object dibuat

contoh constructor di java:

class A {
    A() {
        System.out.println("A");
    }
}

penjelasan diatas :
A() adalah constructor yang ada di class A
A() adalah method yang akan dijalankan pertama kali ketika object dibuat