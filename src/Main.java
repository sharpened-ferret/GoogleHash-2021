public class Main {

    public static void main(String[] args) {
	    Parser aData = new Parser("src/a.txt");
        Parser bData = new Parser("src/b.txt");
        Parser cData = new Parser("src/c.txt");
        Parser dData = new Parser("src/d.txt");
        Parser eData = new Parser("src/e.txt");
        Parser fData = new Parser("src/f.txt");


        for(int i = 0; i < aData.numIntersections; i++) {
            System.out.println(aData.InterMap.get(i).numStartCars);
        }
        FileWrite.FileWriterPlus("a",aData);
        FileWrite.FileWriterPlus("b",bData);
        FileWrite.FileWriterPlus("c",cData);
        FileWrite.FileWriterPlus("d",dData);
        FileWrite.FileWriterPlus("e",eData);
        FileWrite.FileWriterPlus("f",fData);

        System.out.println("A: " + aData.toString());
        System.out.println("B: " + bData.toString());
        System.out.println("C: " + cData.toString());
        System.out.println("D: " + dData.toString());
        System.out.println("E: " + eData.toString());
        System.out.println("F: " + fData.toString());
    }
}
