public class Cheetah extends Mammal implements Hunter{
    public Cheetah(String name, int age, String properties, float speed_run) {
        super(name, age, properties, speed_run);
    }
    @Override
    public void show() {
        System.out.println("name:" + name + " ,age:" + getAge() + " ,speed:" + getSpeed_run() + " ,properties:" + getProperties());
    }

    @Override
    public void hunt(Prey prey) {
        System.out.println("Cheetah hunted " + prey.getName() + ".");

    }
}
