import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.*;

import static org.junit.Assert.*;

public class LeftJoinTest {

    @Test
    public void leftJoin() {
        Hashtable one = new Hashtable();
        Hashtable two = new Hashtable();
        Map<Object, List<Object>> result = new HashMap<>();
        one.put("fond", "enamored");
        one.put("wrath", "anger");
        one.put("diligent", "employed");
        one.put("outfit", "garb");
        one.put("guide", "usher");

        two.put("fond", "averse");
        two.put("wrath", "delight");
        two.put("diligent", "idle");
        two.put("guide", "follow");
        two.put("flow", "jam");

//        result.put("guide", "usher");
//        result.put("guide", "follow");
//        result.put("wrath", "anger");
//        result.put("wrath", "delight");
//
//        result.put("fond", "enamored");
//        result.put("fond", "averse");
//
//        result.put("outfit", "garb");
//        result.put("outfit", "null");
//
//        result.put("diligent", "employed");
//        result.put("diligent", "idle");


        System.out.println(result);
        Map<Object, List<Object>> actual = (LeftJoin.leftJoin(one, two));
        System.out.println(actual);



    }
}