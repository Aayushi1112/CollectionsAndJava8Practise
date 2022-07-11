package Comparator;

import java.util.Comparator;

public class AgeComparator implements Comparator<Developer> {
    @Override
    public int compare(Developer o1, Developer o2) {
        return o1.getAge() - o2.getAge();
    }
}
