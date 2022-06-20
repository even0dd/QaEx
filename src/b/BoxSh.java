package b;

public class BoxSh extends Box {
    private static final String type = "Box with shampoo";
    private int shampooVolume;

    public String getType() {
        return type;
    }

    public int getShampooVolume() {
        return shampooVolume;
    }

    public void setShampooVolume(int shampooVolume) {
        this.shampooVolume = shampooVolume;
    }

    @Override
    public String typesVolumeString() {
        return shampooVolume + "ml";
    }

    @Override
    public String toString() {
        return type + "|" + getName() + '|' + getVolume() + '|' + typesVolumeString();
    }
}