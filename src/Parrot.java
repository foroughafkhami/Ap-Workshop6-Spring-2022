public class Parrot extends Bird implements Prey{

    public Parrot(String name, int age, String properties, float flyHeight) {
        super(name, age, properties, flyHeight);
    }
    @Override
    public void show() {
        System.out.println("name:" + getName() + " ,age:" + getAge() + " ,height:" + getFlyHeight() + " ,properties:" + getProperties());
    }

    @Override
    public String getName() {
        return name;
    }
}
