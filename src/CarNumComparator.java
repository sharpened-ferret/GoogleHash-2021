import java.util.Comparator;

public class CarNumComparator implements Comparator {
    public int compare(Object o1, Object o2) {
        Street s1 = (Street)o1;
        Street s2 = (Street)o2;

        if (s1.numCarsAtStart == s2.numCarsAtStart) {
            return 0;
        }
        else if (s1.numCarsAtStart > s2.numCarsAtStart) {
            return 1;
        }
        else {
            return -1;
        }
    }
}
