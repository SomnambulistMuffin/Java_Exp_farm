

public class RouteClass {
    private String start;
    private String destination;
    private int distance;

    public RouteClass() {
        start = "";
        destination = "";
        distance = 0;
    }

    public RouteClass(String start, String destination, int distance) {
        setStart(start);
        setDestination(destination);
        setDistance(distance);
    }

    public void setStart(String start) {
        if (start.length() != 1) {
            throw new ArithmeticException( "please insert a valid start location" );
        }else{
            this.start = start;
        }

    }

    public void setDestination(String destination) {
        if (destination.length()!= 1){
            throw new ArithmeticException( "please insert a vlid final destination" );
        }else {
            this.destination = destination;
        }

    }

    public void setDistance(int distance) {
        if (distance< 0 || distance> 10){
            throw new ArithmeticException( "please insert Valid Distance" );
        }else{
            this.distance = distance;
        }

    }
}
