import java.util.ArrayList;

public class Intersection {

    public int ID;
    public ArrayList<Street> inStreets;
    public ArrayList<Street> outStreets;
    public String schedule;

    public Intersection(int ID, ArrayList<Street> inStreets, ArrayList<Street> outStreets) {
        this.ID = ID;
        this.inStreets = inStreets;
        this.outStreets = outStreets;
    }

    public String toString() {
        String outString = "";

        outString += ID + "\n";
        outString += inStreets.size() + "\n";
        for (int i = 0; i < inStreets.size(); i++) {
            String currString = inStreets.get(i).name + " 1\n";
        }

        return outString;
    }

}
