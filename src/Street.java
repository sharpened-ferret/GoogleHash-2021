public class Street {

    String name;
    int startingIntersection;
    int endingIntersection;
    int time;

    public Street(int startingIntersection, int endingIntersection, String name, int time) {
        this.startingIntersection = startingIntersection;
        this.endingIntersection = endingIntersection;
        this.name = name;
        this.time = time;
    }
}
