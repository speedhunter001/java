package animalstuff;

public class Cat extends Animal implements Pet{
    private String name;

    public Cat(String name) {
        super(4);
        this.name = name;
    }

    public Cat() {
        this("");
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void play() {
        System.out.println("Meow.. Meow.. (I am a cat so whenever you try to pet me or play wiht me I will show attitude as I am pet cat)");
    }

    @Override
    public void eat() {
        System.out.println("Meow.. Meow.. (Let me have a chicken piece or anything tasty you stupid humans eat)");
    }
}
