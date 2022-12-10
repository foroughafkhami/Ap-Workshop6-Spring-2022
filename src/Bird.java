public abstract class Bird extends Animal{
    private float flyHeight;

    public Bird(String name, int age, String properties, float flyHeight) {
        super(name, age, properties);
        this.flyHeight = flyHeight;
    }

    public float getFlyHeight() {
        return flyHeight;
    }

}
