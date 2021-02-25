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

        String bSolution = Integer.toString(bData.numIntersections) + "\n";
        for(int i = 0; i < bData.numIntersections; i++) {
            bSolution += bData.InterMap.get(i).toString();
        }

        String cSolution = Integer.toString(cData.numIntersections) + "\n";
        for(int i = 0; i < cData.numIntersections; i++) {
            cSolution += cData.InterMap.get(i).toString();
        }

        String dSolution = Integer.toString(dData.numIntersections) + "\n";
        for(int i = 0; i < dData.numIntersections; i++) {
            dSolution += dData.InterMap.get(i).toString();
        }

        String eSolution = Integer.toString(eData.numIntersections) + "\n";
        for(int i = 0; i < eData.numIntersections; i++) {
            eSolution += eData.InterMap.get(i).toString();
        }

        String fSolution = Integer.toString(fData.numIntersections) + "\n";
        for(int i = 0; i < fData.numIntersections; i++) {
            fSolution += fData.InterMap.get(i).toString();
        }

        FileWrite.FileWrite("a",aSolution);
        FileWrite.FileWrite("b",bSolution);
        FileWrite.FileWrite("c",cSolution);
        FileWrite.FileWrite("d",dSolution);
        FileWrite.FileWrite("e",eSolution);
        FileWrite.FileWrite("f",fSolution);

        System.out.println("A: " + aData.toString());
        System.out.println("B: " + bData.toString());
        System.out.println("C: " + cData.toString());
        System.out.println("D: " + dData.toString());
        System.out.println("E: " + eData.toString());
        System.out.println("F: " + fData.toString());
    }
}
