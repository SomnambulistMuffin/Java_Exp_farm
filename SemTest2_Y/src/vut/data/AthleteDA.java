/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut.data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author OPHNEY HENDRICK
 */
public class AthleteDA {

    private static ArrayList<Athlete> arAthlete = new ArrayList<>();
    private static File athleteFile = new File("athlete.dat");
    
    static void initialise()throws DataStorageException
    {
        if(athleteFile.exists())
        {
                
            try {
                
                FileInputStream fReader = new FileInputStream(athleteFile);
                ObjectInputStream fRead = new ObjectInputStream(fReader);
                
                arAthlete = (ArrayList<Athlete>) fRead.readObject();
                fReader.close();
                
            } catch (IOException | ClassNotFoundException e)
            {
                throw new DataStorageException(e.getMessage());
            }
            
        }else 
        
        {
         arAthlete = new ArrayList<>();
        }
    }

    static void terminate() throws DataStorageException
    {
        try {
            FileOutputStream fwriter = new FileOutputStream(athleteFile);
            ObjectOutputStream fwrite = new ObjectOutputStream(fwriter);
            
            fwrite.writeObject(arAthlete);
            fwriter.close();
            
        } catch (IOException e)
        {
            throw new DataStorageException(e.getMessage());
        }
    
    }

    static void addNewAthlete(Athlete objAthlete) throws DuplicateException
    {
        boolean duplicate = false;
        Athlete objtemp = null;
        
        for (int i = 0; i < arAthlete.size() && !duplicate; i++) {
            objtemp = arAthlete.get(i);
            
            if (objAthlete.getAthleteID() == objtemp.getAthleteID())
            {
                duplicate = true;
            } 
        }
        
        
        if (duplicate)
        {
            throw new DuplicateException("Athlete already exists! ");
        }else
        {
            arAthlete.add(objAthlete);
        }
    
    }

    static Athlete findAthlete(int id)throws NotFoundException
    {
        boolean isFound = false;
        Athlete objTemp = null;
        
        for (int i = 0; i < arAthlete.size() && !isFound; i++) {
            objTemp = arAthlete.get(i);
            
            if(id == objTemp.getAthleteID())
            {
                isFound = true;
            } 
        }
        
        if(isFound)
        {
            return objTemp;
        }else
        {
         throw new NotFoundException("Athlete not found! ");
        }
    }

 

    static void updateSport(Athlete objAthlete, String nSport) throws NotFoundException
    {
        boolean isFound = false;
        
        for (int i = 0; i < arAthlete.size() && !isFound; i++) {
            
            if(objAthlete.equals(arAthlete.get(i).getAthleteID()))
            {
                isFound = true;
                arAthlete.get(i).setSport(nSport);
            }
            
        }
        if (isFound)
        {
           throw new NotFoundException("ID was not found!");
        }
    }

    static void deleteAthlete(int id) throws NotFoundException
    {
        boolean isFound = false;
        
        for (int i = 0; i < arAthlete.size() && !isFound; i++) {
            
            if(id == arAthlete.get(i).getAthleteID())
            {
                isFound = true;
                arAthlete.remove(i);
            }
            
        }
        if (isFound)
        {
           throw new NotFoundException("ID was not found!");
        }
    }
    
    
   static ArrayList<Athlete> getAllAthlete()
   {
       return arAthlete;
   } 
   
   static ArrayList<Athlete> getAllAthlete(String nSport) 
   {
       ArrayList arTemp = new ArrayList();
       
       for(Athlete objAthle : arAthlete)
       {
           if (objAthle.getSport().equalsIgnoreCase(nSport))
           {
            arTemp.add(objAthle);
           }
       }
       return arTemp;
   }
    
}
