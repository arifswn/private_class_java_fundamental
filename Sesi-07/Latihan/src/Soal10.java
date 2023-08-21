public class Soal10 {

    public static void main(String[] args) {

        Sports[] sports = new Sports[3];
        sports[0] = new Sports.Football();
        sports[1] = new Sports.Basketball();
        sports[2] = new Sports.Rugby();

        for (Sports sport : sports) {
            sport.play();
        }

        /*
         * Expected output:
         *
         * Playing football
         * Playing basketball
         * Playing rugby
         */
    }
}
