package main;

public class Toy {
    private String name;
    private String type;
    private String color;
    private String size;
    private String material;
    private double cost;

    public Toy(String name, String type, String color, String size, String material, Double cost) {
        this.name = name;
        this.type = type;
        this.color = color;
        this.size = size;
        this.material = material;
        this.cost = cost;
    }

    public String getMaterial() {
        return material;
    }

    public String getSize() {
        return size;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", material='" + material + '\'' +
                ", cost=" + cost;
    }
}
