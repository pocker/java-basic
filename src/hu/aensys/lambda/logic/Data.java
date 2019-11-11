package hu.aensys.lambda.logic;

import java.util.Objects;

public class Data {

    private final int id;

    private final float height;

    private final float weight;


    public Data(int id, float height, float weight) {
        this.id = id;
        this.height = height;
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public float getHeight() {
        return height;
    }

    public float getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Data data = (Data) o;
        return id == data.id &&
                Float.compare(data.height, height) == 0 &&
                Float.compare(data.weight, weight) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, height, weight);
    }

    @Override
    public String toString() {
        return "Data{" +
                "id=" + id +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
