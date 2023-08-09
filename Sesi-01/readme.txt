JDK (Java development kit) merupakan software utama untuk membuat dan menjalankan kode Java. 
Pada JDK ini terdapat API, loader, compiler, runtime environment, dan banyak lagi yang lainnya.
JDK ini merupakan software yang paling penting untuk membuat kode Java.
JDK ini berisi JRE dan development tools (Javac, Java).

JRE (Java Runtime Environment) merupakan software yang digunakan untuk menjalankan kode Java.
JRE ini merupakan bagian dari JDK, sehingga jika kita menginstal JDK, maka JRE juga akan terinstal.
JRE ini hanya berisi runtime environment dan library yang dibutuhkan untuk menjalankan kode Java.

JVM (Java Virtual Machine) merupakan software yang digunakan untuk menjalankan kode Java.
JVM ini merupakan bagian dari JRE, sehingga jika kita menginstal JRE, maka JVM juga akan terinstal.
JVM ini berfungsi untuk menjalankan kode Java yang telah dikompilasi menjadi bytecode.

JDK = JRE + Development Tools (Javac, Java)
JRE = JVM + Library Classes
JVM = Interpreter + JIT Compiler

akses laman jdk
https://learn.microsoft.com/en-us/java/openjdk/download


install extension vscode
--
extension pack for java

cek version java
--
java -version
javac -version

mac cek semua verison
--
/usr/libexec/java_home -V
export JAVA_HOME=`/usr/libexec/java_home -v 17.0.8`
export JAVA_HOME=`/usr/libexec/java_home -v 1.8.0_302`

config java
--
which java // untuk melihat lokasi java
output : /usr/bin/java

config vscode java
--
"java.home": "/Library/Java/JavaVirtualMachines/jdk-17.0.2.jdk/Contents/Home",

running java
--
javac hello_wolrd.java //compile java
java hello_world //run java