OOP Object Oriented Programming
OOP itu apa ?
OOP adalah sebuah paradigma pemrograman yang berorientasi kepada objek. 
Tujuan dari OOP diciptakan adalah untuk mempermudah pengembangan program dengan cara mengikuti model yang telah ada di kehidupan sehari-hari.

Jadi setiap bagian dari suatu permasalahan adalah objek, nah objek itu sendiri merupakan gabungan dari beberapa objek yang lebih kecil lagi. 
Contoh : Manusia adalah objek, manusia terdiri dari kepala, tangan, kaki, dan lain-lain. 
Nah disini kita akan membuat sebuah program sederhana yang berorientasi kepada objek. 
Program ini akan dibuat dengan menggunakan bahasa pemrograman PHP.

Contoh Program OOP Java
```java

public class Main {
    public static void main(String[] args) {
        // membuat objek dari class Hero
        Hero hero1 = new Hero();
        hero1.name = "ucup";
        hero1.display();
        HeroStrength hero2 = new HeroStrength();
        hero2.name = "otong";
        hero2.display();
    }
}
```
```java

public class Hero {
    String name;
    void display(){
        System.out.println("Name : " + this.name);
    }
}
```
```java

public class HeroStrength extends Hero {
    double defencePower;
}
```

## Class dan Object

Class adalah sebuah blueprint atau cetakan untuk menciptakan suatu instant dari object.
Class juga merupakan grup dari object yang mempunyai kemiripan.
Class hanya digunakan untuk membuat kerangka dasar.
Sedangkan object adalah sebuah variabel yang merupakan instance atau perwujudan dari class.

