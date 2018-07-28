import java.util.ArrayList;

public class JosephusProblem {
    public static String eeneyMeeney(ArrayList<String> listOfNames, int count) {
        int eeneyMeeneyIndex = 0;
        if (listOfNames.isEmpty()) {
            return "List is Empty";
        }
        while (listOfNames.size() > 1) {
            eeneyMeeneyIndex = (eeneyMeeneyIndex + count - 1) % listOfNames.size();
            System.out.println(listOfNames);
            System.out.println("Eeney Meeney Miney Moe " + listOfNames.get(eeneyMeeneyIndex) + " was chosen let them go.");
            listOfNames.remove(eeneyMeeneyIndex);
        }
        System.out.println(listOfNames.get(0));
        return listOfNames.get(0);
    }
}
