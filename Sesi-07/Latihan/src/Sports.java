public class Sports {
    /*
     * Write a Java program to create a base class Sports with a method called
     * play(). Create three subclasses: Football, Basketball, and Rugby.
     * Override the
     * play() method in each subclass to play a specific statement for each sport.
     */

    void play() {
        System.out.println("Playing sports");
    }

    static class Football extends Sports {
        @Override
        void play() {
            System.out.println("Playing football");
        }
    }

    static class Basketball extends Sports {
        @Override
        void play() {
            System.out.println("Playing basketball");
        }
    }

    static class Rugby extends Sports {
        @Override
        void play() {
            System.out.println("Playing rugby");
        }
    }

}
