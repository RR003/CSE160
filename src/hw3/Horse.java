package hw3;

public class Horse {
    private String name;
    private int weight;

    public Horse(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "hw3.Horse{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
