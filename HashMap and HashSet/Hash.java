import java.util.*;

public class Hash {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(1);

        System.out.println(set);
        set.remove(2);
        System.out.println(set);
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            list.add(it.next());
        }
        System.out.println(list);

        map.put("Aryan", 48);
        map.put("Nikshe", 48);
        map.put("Sakshi", 48);
        map.put("Harshita", 48);
        System.out.println(map);
        System.out.println(map.containsKey(""));
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key + " " + map.get(key));
        }

    }
}
