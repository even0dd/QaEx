package b;

public class BoxS extends Box {
    private static final String type = "Box with soap";
    private int weight;

    public String getType() {
        return type;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String typesVolumeString() {
        return weight + "g";
    }

    @Override
    public String toString() {
        return type + "|" + getName() + '|' + getVolume() + '|' + typesVolumeString();
    }
}