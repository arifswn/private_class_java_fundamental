public class AnimalFamily {

    public void sound(){
        System.out.println("Animal make sound");
    }

    static class Bird extends AnimalFamily{
        @Override
        public void sound(){
            System.out.println("Birds chirp");
        }
    }

    static class Cat extends AnimalFamily{
        @Override
        public void sound(){
            System.out.println("Cats meow");
        }
    }
}
