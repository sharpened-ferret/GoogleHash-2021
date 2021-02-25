public class Street {

    String name;
    int startingIntersection;
    int endingIntersection;
    int time;
    int numCarsAtStart = 0;

    public Street(int startingIntersection, int endingIntersection, String name, int time) {
        this.startingIntersection = startingIntersection;
        this.endingIntersection = endingIntersection;
        this.name = name;
        this.time = time;

    }

    @Override
    public String toString() {
        return "Street{" +
                "name='" + name + '\'' +
                ", startingIntersection=" + startingIntersection +
                ", endingIntersection=" + endingIntersection +
                ", time=" + time +
                '}';
    }
}
