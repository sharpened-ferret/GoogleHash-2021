import java.util.ArrayList;

public class Intersection {

    public int ID;
    public ArrayList<Street> inStreets;
    public ArrayList<Street> outStreets;
    public String schedule;

    public Intersection(int ID) {
        this.ID = ID;
        inStreets = new ArrayList<Street>();
        outStreets = new ArrayList<Street>();
    }

    public String toString() {
        String outString = "";

        outString += ID + "\n";
        outString += inStreets.size() + "\n";
        for (int i = 0; i < inStreets.size(); i++) {
            String currString = inStreets.get(i).name + " 1\n";
            outString += currString;
        }

        return outString;
    }

}
