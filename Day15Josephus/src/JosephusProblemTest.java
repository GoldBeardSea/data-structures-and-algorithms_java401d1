import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class JosephusProblemTest {

    @org.junit.jupiter.api.Test
    void eeneyMeeneyFiveList() {
        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("Alvin");
        nameList.add("Simon");
        nameList.add("Theodore");
        nameList.add("The Chipmunks");
        nameList.add("The Fifth Beetle");
        JosephusProblem.eeneyMeeney(nameList, 3);
        assertEquals("The Chipmunks", JosephusProblem.eeneyMeeney(nameList, 3));
    }

    @org.junit.jupiter.api.Test
    void eeneyMeeney10ListVariableCount() {
        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("Alvin");
        nameList.add("Simon");
        nameList.add("Theodore");
        nameList.add("The Chipmunks");
        nameList.add("The Fifth Beetle");
        nameList.add("Beatniks");
        nameList.add("Cinnamon Toast Crunch");
        nameList.add("Bratwurst");
        nameList.add("Diablo 3");
        nameList.add("I'm the ScatMan");
        String returnedString = JosephusProblem.eeneyMeeney(nameList, 4);
        assertEquals("The Fifth Beetle", returnedString);
    }

    @org.junit.jupiter.api.Test
    void eeneyMeeneyEmpty() {
        ArrayList<String> nameList = new ArrayList<>();
        assertEquals("List is Empty", JosephusProblem.eeneyMeeney(nameList, 7));
    }

    @org.junit.jupiter.api.Test
    void eeneyMeeneyHighCount() {
        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("Alvin");
        nameList.add("Simon");
        nameList.add("Theodore");
        nameList.add("The Chipmunks");
        nameList.add("The Fifth Beetle");
        nameList.add("Beatniks");
        nameList.add("Cinnamon Toast Crunch");
        nameList.add("Bratwurst");
        nameList.add("Diablo 3");
        nameList.add("I'm the ScatMan");
        String returnedString = JosephusProblem.eeneyMeeney(nameList, 92);
        assertEquals("I'm the ScatMan", returnedString);
    }
}