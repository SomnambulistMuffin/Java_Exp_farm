
package vut.data;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author **********
 */
public class Athlete implements Serializable
{
    
        private int athleteID,age;
        private String name;
        private Gender gender;
        private String sport;
        private String province;
       
        public enum Gender{FEMALE,MALE}

    public Athlete()
    {
        athleteID=age=0;
        name=sport=province="";
        gender = Gender.FEMALE;
    }

    public Athlete(int athleteID, int age, String name, Gender gender, String sport, String province) {
        this.athleteID = athleteID;
        this.age = age;
        this.name = name;
        this.gender = gender;
        this.sport = sport;
        this.province = province;
    }

    public int getAthleteID() {
        return athleteID;
    }

    public void setAthleteID(int athleteID) {
        this.athleteID = athleteID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    @Override
    public String toString() {
        return athleteID + "\t" + age + "\t" + name + "\t" + gender + "\t" + sport + "\t" + province;
    }
    
    public static void initialise() throws DataStorageException
    {
        AthleteDA.initialise();
    }
    
     public static void terminate() throws DataStorageException
    {
        AthleteDA.terminate();
    }
     
     public  void addNewAthlete(Athlete objAthlete) throws DuplicateException
    {
        AthleteDA.addNewAthlete(this);
    } 
     
    public static Athlete findAthlete(int id) throws NotFoundException
    {
       return AthleteDA.findAthlete(id);
    }
    
    public  void updateSport(String nSport) throws NotFoundException
    {
         AthleteDA.updateSport(this,nSport);
    }
     
    public void deleteAthlete(int id) throws NotFoundException
    {
         AthleteDA.deleteAthlete(id);
    }
    
    public static ArrayList<Athlete> getAllAthlete()
   {
       return AthleteDA.getAllAthlete();
   }
    
    public static ArrayList<Athlete> getAllAthlete(String nSport) 
   {
    return AthleteDA.getAllAthlete(nSport);
   }
}
