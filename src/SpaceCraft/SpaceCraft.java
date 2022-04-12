package SpaceCraft;

public abstract class SpaceCraft {

    private String name;
    private float weight;
    private float height;
    private String fuelType;
    private float speed;
    private float thrust;

    public SpaceCraft(String name, float weight, float height, String fuelType, float speed, float thrust) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.fuelType = fuelType;
        this.speed = speed;
        this.thrust = thrust;
    }

    public abstract void takeOff();
    public abstract void land();

    public float getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }
}
