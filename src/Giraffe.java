public class Giraffe extends Mammal implements Prey {

    public Giraffe(String name, int age, String properties, float speed_run) {
        super(name, age, properties, speed_run);
    }
    @Override
    public void show() {
        System.out.println("name:" + getName() + " ,age:" + getAge() + " ,speed:" + getSpeed_run() + " ,properties:" + getProperties());
    }


    @Override
    public String getName() {
        return name;
    }

}
