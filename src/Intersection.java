import java.util.ArrayList;

public class Intersection {

    public ArrayList<Street> inStreets;
    public ArrayList<Street> outStreets;
    public String schedule;

    public Intersection(ArrayList<Street> inStreets, ArrayList<Street> outStreets) {
        this.inStreets = inStreets;
        this.outStreets = outStreets;
    }

}
