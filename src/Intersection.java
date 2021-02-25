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



}
