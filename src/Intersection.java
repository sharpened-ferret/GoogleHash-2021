import java.util.ArrayList;
import java.util.Collections;

public class Intersection {

    public int ID;
    public ArrayList<Street> inStreets;
    public ArrayList<Street> outStreets;
    public String schedule;
    public int numStartCars = 0;

    public Intersection(int ID) {
        this.ID = ID;

        inStreets = new ArrayList<Street>();
        outStreets = new ArrayList<Street>();
    }

    public String toString() {
        String outString = "";
        Collections.sort(inStreets, new CarNumComparator());
        outString += ID + "\n";
        outString += inStreets.size() + "\n";
        for (int i = 0; i < inStreets.size()/2; i++) {
            String currString = inStreets.get(i).name + " 2\n";
            outString += currString;
        }

        return outString;
    }

}
