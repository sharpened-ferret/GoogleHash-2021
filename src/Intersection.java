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

    public String toString(Parser data) {
        String outString = "";
        Collections.sort(inStreets, new CarNumComparator());
        Collections.reverse(inStreets);
        outString += ID + "\n";
        String someOutString = "";
        int numStreets = 0;
        String currString = "";
        for (int i = 0; i < inStreets.size(); i++) {
            if (data.usedStreets.contains(inStreets.get(i).name)) {
                currString = inStreets.get(i).name + " 1\n";
                numStreets++;
            }
            //String currString = inStreets.get(i).name + " " + numStartCars +"\n";
            someOutString += currString;
        }
        outString += numStreets + "\n";
        outString += someOutString;
        /*
        for (int i = inStreets.size()/2; i < inStreets.size(); i++) {
            String currString = inStreets.get(i).name + " 1\n";
            outString += currString;
        }

         */

        return outString;
    }

}
