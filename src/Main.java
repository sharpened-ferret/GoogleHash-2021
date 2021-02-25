public class Main {

    public static void main(String[] args) {
	    Parser aData = new Parser("src/a.txt");
        Parser bData = new Parser("src/b.txt");
        Parser cData = new Parser("src/c.txt");
        Parser dData = new Parser("src/d.txt");
        Parser eData = new Parser("src/e.txt");
        Parser fData = new Parser("src/f.txt");



        FileWrite.FileWrite("a",aData);

        FileWrite.FileWrite("b",bData);
        FileWrite.FileWrite("c",cData);
        FileWrite.FileWrite("d",dData);
        FileWrite.FileWrite("e",eData);
        FileWrite.FileWrite("f",fData);



        System.out.println("A: " + aData.toString());
        System.out.println("B: " + bData.toString());
        System.out.println("C: " + cData.toString());
        System.out.println("D: " + dData.toString());
        System.out.println("E: " + eData.toString());
        System.out.println("F: " + fData.toString());
    }
}
