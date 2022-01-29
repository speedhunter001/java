package animalstuff;

public class Fish extends Animal implements Pet {
    private String name;

    public Fish() {
        super(0);
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
        System.out.println("Fssh.. Fssh.. (I want to play so when I grow up I become a shark)");
    }

    @Override
    public void eat() {
        System.out.println("Fssh.. Fssh.. (I want to eat some tasty food so please give me some tasty food so I can grow up and become a shark eventually)");
    }
}
