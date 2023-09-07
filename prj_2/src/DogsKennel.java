import java.util.ArrayList;
import java.util.Arrays;

public class DogsKennel {
    private ArrayList<Dog> kennel;

    public DogsKennel() {
        this.kennel = new ArrayList<>(1);
    }

    public void add(Dog dog) {
        kennel.add(dog);
    }

    public void add(Dog ... dogs) {
        kennel.addAll(Arrays.asList(dogs));
    }

    @Override
    public String toString() {
        return "DogsKennel{" +
                "kennel=" + kennel +
                '}';
    }

    public static void main(String[] args) {
        DogsKennel dogsKennel = new DogsKennel();
        Dog bullTerrier = new Dog("Spotty", 7);
        dogsKennel.add(bullTerrier);
        System.out.println(dogsKennel);

        Dog shepherd = new Dog("Vovan", 5);
        Dog dachshund = new Dog("Sosiska", 3);
        dogsKennel.add(shepherd, dachshund);
        System.out.println(dogsKennel);
    }
}
