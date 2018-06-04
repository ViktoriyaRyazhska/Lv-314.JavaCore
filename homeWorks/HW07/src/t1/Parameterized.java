package t1;

import java.util.Set;

import static com.homework.Main.*;

public class Parameterized {

    public static void setAdd() {
        for (int i = 0; i < 10; i++) {
            set1.add((int)(Math.random() * 10));
            set2.add((int)(Math.random() * 10));
        }
    }

    public static void union(Set set1, Set set2) {
        set3.addAll(set1);
        set3.addAll(set2);
        System.out.println(set3);
    }

    public static void intersect(Set<Integer> set1, Set<Integer> set2) {
        for (Integer i : set1) {
            if (set2.contains(i)) {
                set4.add(i);
            }
        }
        System.out.println(set4);
    }
}
