import java.io.BufferedReader;
import java.io.FileReader;
import  java.io.IOException;
import  java.util.ArrayList;



public class DistanceCalc {
    private static ArrayList<RouteClass> arDist;
    private static RouteClass objRoute;
    public static int varDistance;
    public static String varDestination;
    public  static String varStart;
    private static FileReader readFile;
    private static BufferedReader buffReader;

    public DistanceCalc(FileReader reader) {
        this.readFile =  reader;
    }

    enum location{
        A,B,C,D,E
    }

    public static void main(String[] args) throws IOException {
        getRoutes();

    }

    public static void getRoutes() throws IOException{
        try{
            readFile = new FileReader( "routes.txt" );
            buffReader = new BufferedReader( readFile );
            char c[] = new char[3];

            if (!buffReader.markSupported()){
                System.out.println("Mark not supported");
            }else{
                //reading file lines
                System.out.println(buffReader.readLine());
                //reading characters
                buffReader.read(c);
                for (int i = 0; i < 20; i++) {
                    System.out.println(c[i]);

                }
                System.out.println();
                //reset buffer
                buffReader.reset();
                //read method
                for (int i = 0; i < 8; i++) {
                    System.out.println((char) buffReader.read());

                }
            }
        }catch (Exception e){throw new IOException( e.getMessage() );}

    }

    public static void arrDistance(){
        objRoute = new RouteClass( varStart,varDestination,varDistance );

    arDist.add( objRoute );
    }
}
