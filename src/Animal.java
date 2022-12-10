public abstract class Animal {
    protected String name;
    private int age;
    private String properties;
    public Animal(String name,int age,String properties){
        this.name = name;
        this.age = age;
        this.properties = properties;

    }
    public abstract void show();

    public int getAge() {
        return age;
    }

    public String getProperties() {
        return properties;
    }
}
