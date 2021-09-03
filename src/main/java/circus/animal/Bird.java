package circus.animal;

public abstract class Bird extends Animal {
    public void fly() {
        System.out.println("Whee ...");
    }

    @Override
    public int getValue() {
        return 20;
    }
}
