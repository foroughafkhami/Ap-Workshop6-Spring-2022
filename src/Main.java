import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Animal> animals = new ArrayList<>();
        Eagle eagle = new Eagle("Eagle", 10, "is old", 50);
        animals.add(eagle);
        Parrot parrot = new Parrot("Parrot", 1, "is clever", 30);
        animals.add(parrot);
        Cheetah cheetah = new Cheetah("Cheetah", 7, "is fast", 150);
        animals.add(cheetah);
        Giraffe giraffe = new Giraffe("Giraffe", 20, "is tall", 5);
        animals.add(giraffe);

        int count = 1;
        for (Animal i: animals) {
            System.out.print(count + ".");
            i.show();
            count++;

            if (i instanceof Cheetah)
                ((Cheetah) i).hunt(giraffe);
            if (i instanceof Eagle)
                ((Eagle) i).hunt(parrot);


        }

    }
}