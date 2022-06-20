package b;

public class BoxD extends Box {
    private static final String type = "Block with drinks";
    private int bottleVolume;

    public String getType() {
        return type;
    }

    public int getBottleVolume() {
        return bottleVolume;
    }

    public void setBottleVolume(int bottleVolume) {
        this.bottleVolume = bottleVolume;
    }

    @Override
    public String typesVolumeString() {
        return bottleVolume + "l";
    }

    @Override
    public String toString() {
        return type + "|" + getName() + '|' + getVolume() + '|' + typesVolumeString();
    }
}