import java.util.Queue;

public class main {
    public static void main(String[] args) {
        AnimalShelter AnimalCollective = new AnimalShelter();
        Cat cat1 = new Cat("Avey");
        Cat cat2 = new Cat("Panda");
        Cat cat3 = new Cat("Geologist");
        Dog dog1 = new Dog ("Deakin");
        Dog dog2 = new Dog ("Eric");
        Dog dog3 = new Dog ("Howdy");
        System.out.println(cat1);
        AnimalCollective.enqueue(cat1);
        AnimalCollective.enqueue(cat2);
        AnimalCollective.enqueue(cat3);
        AnimalCollective.enqueue(dog1);
        AnimalCollective.enqueue(dog2);
        AnimalCollective.enqueue(dog3);
        String printthis = AnimalCollective.toString();
        System.out.println(printthis);
        Pet result = AnimalCollective.dequeue("Eric");
        String printthis2 = AnimalCollective.toString();
        System.out.println(printthis2);
        System.out.println(result);
        }
}
