package animalstuff;

public class Spider extends Animal{
    public Spider() {
        super(8);
    }

    @Override
    public void eat() {
        System.out.println("I will eat flies and everything else tasty that gets trapped in my web buhahaha");
    }
}
