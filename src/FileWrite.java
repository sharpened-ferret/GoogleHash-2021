
import java.io.File;  // Import the File class
import java.io.FileWriter;
import java.io.IOException;  // Import the IOException class to handle errors
public class FileWrite {


    public static void FileWrite(String solName, Parser data){
        try {
            FileWriter myWriter = new FileWriter(solName + "_solution.txt");

            String aSolution = Integer.toString(data.numIntersections) + "\n";
            for(int i = 0; i < data.numIntersections; i++) {
                aSolution += data.InterMap.get(i).toString(data);
            }
            myWriter.write(aSolution);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void FileWriterPlus(String solName, Parser data){
        try {
            FileWriter myWriter = new FileWriter(solName + "_solution.txt");

            String aSolution = Integer.toString(data.numIntersections) + "\n";
            for(int i = 0; i < data.numIntersections; i++) {
                if (data.InterMap.get(i).numStartCars != 0){
                    aSolution += data.InterMap.get(i).toString();
                }
            }
            myWriter.write(aSolution);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}


