public abstract class Mammal extends Animal {
    private float speed_run;


    public Mammal(String name, int age, String properties, float speed_run) {
        super(name, age, properties);
        this.speed_run = speed_run;
    }

    public float getSpeed_run() {
        return speed_run;
    }
}
