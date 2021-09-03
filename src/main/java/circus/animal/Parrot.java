package circus.animal;

public class Parrot extends Bird {
    @Override
    public String speak() {
        return "Polly wants a cracker";
    }

    @Override
    public int getValue() {
        return 10;
    }

    @Override
    public String toString() {
        return "I'm a parrot";
    }
}
