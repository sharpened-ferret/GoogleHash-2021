import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Parser {
    public static void parse(String filepath) {
        //Local vars for data store [as required]
        int duration;
        int numIntersections;
        int numStreets = 0;
        int numCars;
        int bonusPoints;

        //HashMap to reference data objects [replace object ref with real data object class name]
        HashMap<Integer, Object> CarMap = new HashMap<Integer, Object>();
        HashMap<String, Object> StreetMap = new HashMap<String, Object>();

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
                }

                //Writes data to object [replace with real data object]
                else if (increment <= numStreets) {
                    String[] parameters = data.split(" ");
                    int startIntersection = Integer.parseInt(parameters[0]);
                    int endIntersection = Integer.parseInt(parameters[1]);
                    String streetName = parameters[2];
                    int travelTime = Integer.parseInt(parameters[3]);
                    StreetMap.put(parameters[2], new Street(startIntersection, endIntersection, streetName, travelTime));
                }
                else {
                    String[] parameters = data.split(" ");
                    int routeLength = Integer.parseInt(parameters[0]);
                    String[] route = new String[routeLength - 1];
                    for (int i = 0; i < routeLength; i++) {
                        route[i] = parameters[i+1];
                    }
                    CarMap.put(increment, new Car(routeLength, route));
                }
            }
            InputReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
