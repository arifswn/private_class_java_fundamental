public class Soal3 {
    public static void main(String[] args) {
        /*
         * Soal 3
         * 
         * Write a Java program to create a class called Animal with a method
         * named move().
         * 
         * Create a subclasscalled Cheetah that overrides the move() method to run.
         */

        Animal animal = new Animal();
        animal.move();

        Cheetah cheetah = new Cheetah();
        cheetah.move();
        cheetah.run();

    }

    static class Animal {
        public void move() {
            System.out.println("Animal can move");
        }
    }

    static class Cheetah extends Animal {
        // * Create a subclasscalled Cheetah that overrides the move() change method to
        // run.
        @Override
        public void move() {
            System.out.println("Cheetah can run");
        }

        // change method move to method run
        public void run() {
            System.out.println("Cheetah is running");
        }

    }
}
