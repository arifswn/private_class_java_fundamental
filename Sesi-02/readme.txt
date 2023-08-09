Pada materi sebelumnya, kita sudah membahas mengenai variabel dan tipe data. 
Tipe-tipe data yang kita bahas sebelumnya merupakan tipe data primitif, 
atau hanya bisa menyimpan satu value saja. 

Di sini kitaakan mempelajari tipe data yang baru yaitu array.

Array adalah sebuah tipe data di mana kita bisa menyimpan 
sekumpulan value dengan tipe data yang sama.

Meskipun array bisa menyimpan sekumpulan data, 
namun tetap harus berurutan dan memiliki ukuran panjang dalam penyimpanannya.

Dalam array kita mengenal yang namanya indeks, 
berfungsi sebagai tempat kita mengetahui letak data di dalam array.

Bisa dibayangkan indeks di dalam array sama seperti nomor loker 
di dalam tempat gym, kita harus melihat nomor loker tersebut untuk 
mengetahui isi didalamnya.

Indeks akan dimulai dari 0, sehingga jika sebuah array memiliki panjang 10, 
maka indeks pertamanya adalah 0 dan indeks terakhirnya adalah 9.


=====================================================================

apa itu array?
Array adalah sebuah tipe data di mana kita bisa menyimpan sekumpulan value dengan tipe data yang sama.
 
apa itu indeks?
Indeks adalah nomor yang digunakan untuk mengetahui letak data di dalam array.

apa itu panjang array?
Panjang array adalah jumlah data yang bisa disimpan di dalam array.

=====================================================================

apa itu array multidimensi?
Array multidimensi adalah array yang memiliki lebih dari satu dimensi.

apa itu array asosiatif?
Array asosiatif adalah array yang menggunakan string sebagai indeksnya.

contoh array multidimensi?
Array multidimensi adalah array yang memiliki lebih dari satu dimensi.
=====================================================================

apa itu operator?
Operator adalah simbol yang digunakan untuk melakukan operasi tertentu.

ada berapa macam operator?
Ada 6 macam operator, yaitu 
- operator aritmatika,
- operator perbandingan,
- operator logika,
- operator assignment,
- operator increment dan decrement,
- operator string.

apa itu operator aritmatika?
Operator aritmatika adalah operator yang digunakan untuk melakukan operasi matematika.
contoh kode java :
int a = 10;
int b = 5;
int c = a + b;
System.out.println(c);

apa itu operator perbandingan?
Operator perbandingan adalah operator yang digunakan untuk membandingkan dua buah nilai.
contoh kode java :
int a = 10;
int b = 5;
System.out.println(a > b);

apa itu operator logika?
Operator logika adalah operator yang digunakan untuk mengkombinasikan dua buah nilai boolean.
contoh kode java :
boolean a = true;
boolean b = false;
System.out.println(a && b);
output :
false

// kenapa false
// karena && itu adalah operator AND, jadi jika ada salah satu false maka hasilnya false

apa itu operator assignment?
Operator assignment adalah operator yang digunakan untuk mengisi nilai.
contoh kode java :
int a = 10;
int b = 5;
a += b;
System.out.println(a);
output :
15

// kenapa 15
// karena += itu adalah operator assignment, jadi a = a + b

apa itu operator increment dan decrement?
Operator increment dan decrement adalah operator yang digunakan untuk menambah atau mengurangi nilai sebanyak 1.
contoh kode java :
int a = 10;
a++;
System.out.println(a);
output :
11

// kenapa 11
// karena ++ itu adalah operator increment, jadi a = a + 1

apa itu operator string?
Operator string adalah operator yang digunakan untuk menggabungkan dua buah string.
contoh kode java :
String a = "Hello";
String b = "World";
System.out.println(a + b);
output :
HelloWorld

// kenapa HelloWorld
// karena + itu adalah operator string, jadi a + b = HelloWorld

=====================================================================