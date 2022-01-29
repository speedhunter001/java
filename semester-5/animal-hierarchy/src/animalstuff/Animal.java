package animalstuff;

abstract public class Animal {
    protected int legs;

    protected Animal(int legs) {
        this.legs = legs;
    }

    abstract public void eat();

    public void walk() {
        System.out.println("I can walk using " + this.legs);
    }
}
