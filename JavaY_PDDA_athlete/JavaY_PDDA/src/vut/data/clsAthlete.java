/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut.data;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class clsAthlete {

    private String name, sport, province;
    private int ID,age;
    private Gender gender;
    
    public enum Gender{MALE,FEMALE}

    public clsAthlete() {
        ID=age=0;
        name=sport=province="";
        gender = Gender.FEMALE;
    }

    
    public clsAthlete(String name, String sport, String province, int ID, int age, Gender gender) {
        setAge(age);
        setGender(gender);
        setID(ID);
        setName(name);
        setProvince(province);
        setSport(sport);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    
    public String getName() {
        return name;
    }

    public String getSport() {
        return sport;
    }

    public String getProvince() {
        return province;
    }

    public int getID() {
        return ID;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return  name + "\t" + sport + "\t" + province + "\t" + ID + "\t" + age + "\t" + gender;
    }

    //call from DA class
    public static void initilise()throws DataStorageException{
        athleteDA.initialise();
        
    }
    
    public void addNew(clsAthlete objAthlete) throws DuplicateException{
        athleteDA.addNew(this);
    }
    
    public static void terminate() throws DataStorageException{
        athleteDA.terminate();
    } 
    
    public static clsAthlete find(int id) throws NotFoundException{
        return athleteDA.find(id);
    }
    
    public void updateSport(String sport)throws NotFoundException{
        athleteDA.updateSport(this, sport);
    }
    
    public void delete(int id)throws NotFoundException{
         athleteDA.delete(id);
    }
    
    public static ArrayList<clsAthlete> getAll(){
        return athleteDA.getAll();
    }
    
    public static ArrayList<athleteDA> getAthlete(String sport){
        return athleteDA.getAthlete(sport);
    }
    
    
    
    
    
    
    
    
    
    
}
