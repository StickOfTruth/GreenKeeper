public class LightSensor {
    private String name;
    private int lightlvl;

    public LightSensor(String name) {
        this.name = name;
    }

    public int getLightlvl() {
        return lightlvl;
    }

    public void setLightlvl(int newLightlvl) {
        lightlvl = newLightlvl;
    }
}

