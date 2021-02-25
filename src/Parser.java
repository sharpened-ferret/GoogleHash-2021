import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Parser {
    public static void parse(String filepath) {
        //Local vars for data store [as required]
        String example;

        //HashMap to reference data objects [replace object ref with real data object class name]
        HashMap<Integer, Object> DataMap = new HashMap<Integer, Object>();

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
                    example=dataArray[0];
                }

                //Writes data to object [replace with real data object]
                else {
                    String[] parameters =data.split(" ");
                    DataMap.put(increment, new Object());
                }
            }
            InputReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
