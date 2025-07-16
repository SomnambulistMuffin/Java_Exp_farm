package vut.data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import org.omg.CosNaming.NamingContextPackage.NotFound;

/**
 *
 * @author DeOxy
 */
public class athleteDA {

    private static ArrayList<clsAthlete> arAthlete = new ArrayList<>();
    private static File athleteFile = new File("athlete.dat");//create text file

    static void initialise() throws DataStorageException {
        if (athleteFile.exists()) {//check if file has been created
            try {
                FileInputStream fReader = new FileInputStream(athleteFile);//declare stream reader
                ObjectInputStream fRead = new ObjectInputStream(fReader);//declare reader to read stream

                arAthlete = (ArrayList<clsAthlete>) fRead.readObject();
                fReader.close();

            } catch (IOException | ClassNotFoundException e) {
                throw new DataStorageException(e.getMessage());
            }
        } else {
            arAthlete = new ArrayList<>();
        }
    }

    /**
     * create new athlete
     * 
     * @param objAthlete
     * @throws DuplicateException 
     */
    static void addNew(clsAthlete objAthlete) throws DuplicateException {
        boolean dup = false;
        clsAthlete objTemp = null;

        //check all elements in array while dup = null
        for (int i = 0; i < arAthlete.size() && !dup; i++) {
            objTemp = arAthlete.get(i);

            //check for duplicate
            if (objAthlete.getID() == objTemp.getID()) {
                dup = true;
            }
        }

        //throw exception or create new athlete
        if (dup == true) {
            throw new DuplicateException("Athlete already exists.\n");
        } else {
            arAthlete.add(objAthlete);
        }

    }

    static void terminate() throws DataStorageException {

        try {
            FileOutputStream fwriter = new FileOutputStream(athleteFile);
            ObjectOutputStream fwrite = new ObjectOutputStream(fwriter);

            fwrite.writeObject(arAthlete);
            fwriter.close();

        } catch (IOException e) {
            throw new DataStorageException(e.getMessage());
        }

    }

    /**
     * find an athlete based on their ID's
     * 
     * @param id
     * @return
     * @throws NotFoundException 
     */
    static clsAthlete find(int id) throws NotFoundException {

        boolean found = false;//create flag
        clsAthlete objTemp = null;

        //look for athlete in athlete array
        for (int i = 0; i < arAthlete.size() && !found; i++) {
            objTemp = arAthlete.get(i);

            
            if (id == objTemp.getID()) {
                found = true;
                break;
            }
        }

        //send back data or error
        if (found) {
            return objTemp;
        } else {
            throw new NotFoundException("Athlete not found! ");
        }
    }
    
    /**
     * get current array of athletes
     * 
     * @return 
     */
    static ArrayList<clsAthlete> getAll() {

        return arAthlete;
    }

    /**
     * get all athletes from a specific sport
     * 
     * @param sport
     * @return 
     */
    static ArrayList<clsAthlete> getAll(String sport) {

        //create array to store a temporay list of specific athletes
        ArrayList arTemp = new ArrayList();

        //populate array
        for (clsAthlete athl : arAthlete) {
            if (athl.getSport().equalsIgnoreCase(sport)) {
                arTemp.add(athl);
            }
        }

        return arTemp;
    }

    static ArrayList<athleteDA> getAthlete(String sport) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * get athlete data based on info in input boxes
     * 
     * @param objAthlete
     * @param sport
     * @throws NotFoundException 
     */ 
    static void updateSport(clsAthlete objAthlete, String sport) throws NotFoundException {

        boolean found = false;

        //look for sport in array
        for (int i = 0; i < arAthlete.size() && !found; i++) {

            //update sport and exit loop
            if (objAthlete.equals(arAthlete.get(i).getID())) {
                found = true;
                arAthlete.get(i).setSport(sport);
                break;
            }
        }
        if (found) {
            throw new NotFoundException("ID was not found");
        }

    }

    /**
     * update specific sport 
     * 
     * @param sport
     * @param objAthlete
     * @throws NotFoundException 
     */
    static void updateSport(String sport,clsAthlete objAthlete) throws NotFoundException {
        boolean found = false;
        
        //check for sport
        for(int i = 0;i<arAthlete.size() && !found; i++){
            //update and break if found
            if(objAthlete.equals(arAthlete.get(i).getID())){
                found = true;
                //get array index of sport and set sport string
                arAthlete.get(i).setSport(sport);
            }
            
            //check if not found
            if(found){
                throw new NotFoundException("Sport ID Not Found");
            }
        }
        
    }

}
