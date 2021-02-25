public class Main {

    public static void main(String[] args) {
	    Parser aData = new Parser("src/a.txt");
        Parser bData = new Parser("src/b.txt");
        Parser cData = new Parser("src/c.txt");
        Parser dData = new Parser("src/d.txt");
        Parser eData = new Parser("src/e.txt");
        Parser fData = new Parser("src/f.txt");

        String aSolution = Integer.toString(aData.numIntersections) + "\n";
        for(int i = 0; i < aData.numIntersections; i++) {
            aSolution += aData.InterMap.get(i).toString();
        }

        String bSolution = Integer.toString(aData.numIntersections) + "\n";
        for(int i = 0; i < aData.numIntersections; i++) {
            bSolution += aData.InterMap.get(i).toString();
        }

        String cSolution = Integer.toString(aData.numIntersections) + "\n";
        for(int i = 0; i < aData.numIntersections; i++) {
            cSolution += aData.InterMap.get(i).toString();
        }

        String dSolution = Integer.toString(aData.numIntersections) + "\n";
        for(int i = 0; i < aData.numIntersections; i++) {
            dSolution += aData.InterMap.get(i).toString();
        }

        String eSolution = Integer.toString(aData.numIntersections) + "\n";
        for(int i = 0; i < aData.numIntersections; i++) {
            eSolution += aData.InterMap.get(i).toString();
        }

        String fSolution = Integer.toString(aData.numIntersections) + "\n";
        for(int i = 0; i < aData.numIntersections; i++) {
            fSolution += aData.InterMap.get(i).toString();
        }



        System.out.println("A: " + aData.toString());
        System.out.println("B: " + bData.toString());
        System.out.println("C: " + cData.toString());
        System.out.println("D: " + dData.toString());
        System.out.println("E: " + eData.toString());
        System.out.println("F: " + fData.toString());
    }
}
