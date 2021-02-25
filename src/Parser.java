import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Parser {
    //Local vars for data store [as required] (yes public vars are bad practice, but this is speedy code)
    public int duration;
    public int numIntersections;
    public int numStreets = 0;
    public int numCars;
    public int bonusPoints;

    //HashMap to reference data objects [replace object ref with real data object class name]
    public HashMap<Integer, Car> CarMap = new HashMap<Integer, Car>();
    public HashMap<String, Street> StreetMap = new HashMap<String, Street>();
    public HashMap<Integer, Intersection> InterMap = new HashMap<Integer, Intersection>();
    public HashMap<String, Intersection > InterStreetMap = new HashMap<String, Intersection>();

    @Override
    public String toString() {
        return "Parser{" +
                "duration=" + duration +
                ", numIntersections=" + numIntersections +
                ", numStreets=" + numStreets +
                ", numCars=" + numCars +
                ", bonusPoints=" + bonusPoints +
                '}';
    }

    public Parser(String filepath) {
        System.out.println(filepath);

        //Increment to count line no.
        int increment=0;

        try{
            File input = new File(filepath);
            Scanner InputReader = new Scanner(input);
            while (InputReader.hasNextLine()) {
                String data = InputReader.nextLine();

                //Handles First Line differently to write initial settings to local vars (if required)
                if (increment==0) {
                    String[] dataArray = data.split(" ");
                    duration = Integer.parseInt(dataArray[0]);
                    numIntersections = Integer.parseInt(dataArray[1]);
                    numStreets = Integer.parseInt(dataArray[2]);
                    numCars = Integer.parseInt(dataArray[3]);
                    bonusPoints = Integer.parseInt(dataArray[4]);

                    for (int i = 0; i < numIntersections; i++) {
                        InterMap.put(i, new Intersection(i));
                    }
                }

                //Writes data to object [replace with real data object]
                else if (increment <= numStreets) {
                    String[] parameters = data.split(" ");
                    int startIntersection = Integer.parseInt(parameters[0]);
                    int endIntersection = Integer.parseInt(parameters[1]);
                    String streetName = parameters[2];
                    int travelTime = Integer.parseInt(parameters[3]);
                    Street currStreet = new Street(startIntersection, endIntersection, streetName, travelTime);
                    InterMap.get(startIntersection).outStreets.add(currStreet);
                    InterMap.get(endIntersection).inStreets.add(currStreet);
                    StreetMap.put(parameters[2], currStreet);
                    InterStreetMap.put(streetName, InterMap.get(startIntersection));
                }
                else {
                    String[] parameters = data.split(" ");
                    int routeLength = Integer.parseInt(parameters[0]);
                    String[] route = new String[routeLength - 1];

                    for (int i = 0; i < routeLength - 1; i++) {
                        route[i] = parameters[i+1];
                    }
                    InterStreetMap.get(route[0]).numStartCars += 1;
                    CarMap.put(increment, new Car(routeLength, route));
                }
                increment++;
            }
            InputReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
