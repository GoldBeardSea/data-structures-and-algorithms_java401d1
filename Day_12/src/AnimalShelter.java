import java.util.LinkedList;
import java.util.Queue;

public class AnimalShelter {
    private Queue<Pet> AnimalCollective = new LinkedList<>();
    public Pet animal;


    public void enqueue (Pet pet) {
        AnimalCollective.add(pet);
    }

    public Pet dequeue (String preference) {
        Pet firstPoll;
        Pet result;
        if (AnimalCollective.isEmpty()) {
            System.out.println("No Animals in this Shelter");
            return null;
        }
        if (!AnimalCollective.toString().contains(preference)) {
            result = AnimalCollective.poll();
            System.out.println("No " + preference + " in this Shelter so here's " + result.name + ".");
            return result;
        }
        firstPoll = AnimalCollective.poll();
        int size = AnimalCollective.size() - 1;
        while (!firstPoll.toString().contains(preference)) {
            if (firstPoll.toString().contains(preference)) {
                    result = firstPoll;
                    return result;

            } else {
                    AnimalCollective.add(firstPoll);
                    firstPoll = AnimalCollective.poll();
                    size--;
                }
            }
        while (size > 0) {
            AnimalCollective.add(AnimalCollective.poll());
            size --;
        }
        return result;
    }
}
