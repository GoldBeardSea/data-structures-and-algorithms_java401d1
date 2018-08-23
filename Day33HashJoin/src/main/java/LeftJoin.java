import java.util.*;

public class LeftJoin {

    public static void main(String[] args) {
        Hashtable one = new Hashtable();
        Hashtable two = new Hashtable();

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
        System.out.println(leftJoin(one, two));
    }

    public static Map<Object, List<Object>> leftJoin(Hashtable one, Hashtable two) {
        Map<Object, List<Object>> result = new HashMap<>();
        for (Object key : one.keySet()) {
            List<Object> join = new ArrayList<>();
                join.add(one.get(key));
                join.add(two.get(key));
                result.put(key, join);
            }
        return result;
    }
}