public class Eagle extends Bird implements Hunter{

    public Eagle(String name, int age, String properties, float flyHeight) {
        super(name, age, properties, flyHeight);
    }
    @Override
    public void show() {
        System.out.println("name:" + name + " ,age:" + getAge() + " ,height:" + getFlyHeight() + " ,properties:" + getProperties());
    }

    @Override
    public void hunt(Prey prey) {
        System.out.println("Eagle hunted " + prey.getName()+".");
    }
}
