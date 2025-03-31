package vut.data;

import vut.data.PatientClass;

import java.sql.*;
import java.util.*;



public class PatientDA {

    private static Connection conn;
    private static PreparedStatement prepstat;
    private static ResultSet resSet;

    private static final ArrayList<PatientClass> arPatients = new ArrayList<>();
    private static final ArrayList<String> arID = new ArrayList<>();

    public static void initConnection() throws DataStorageException {

        final String USERNAME = "root";
        final String PASSWORD = "";
        final String URL = "jdbc:mysql//localhost/patientdb";
        final String DRIVER = "com.mysql.jdbc.Driver";

        //initialising connection by signing in

        try{
            Class.forName( DRIVER );
            conn = DriverManager.getConnection( URL,USERNAME,PASSWORD );

        }catch (ClassNotFoundException e) {
            throw new DataStorageException( "Driver missing" + e.getMessage() );

        }catch (SQLException ex){
            throw new DataStorageException( "Connection failed" + ex.getMessage() );
        }

    }

    public static ArrayList<PatientClass> getAll() throws NotFoundException{

        //clearing arrayList
        arPatients.clear();

        //using try catch to handle errors while accessing data

    try {
      prepstat = conn.prepareStatement( "SELECT * FROM tblPatients" );
      resSet = prepstat.executeQuery();
    // getting the string values from the database and putting it on the result set
      while (resSet.next()){
          arPatients.add( new PatientClass(resSet.getString( "surname" ),
                  resSet.getString( "id_number" ),
                  PatientClass.TypePatient.valueOf( resSet.getString( "patient_type" ) ),
                  resSet.getDouble( "amount_Due" )) );
      }
    }catch (SQLException ex){
        throw new NotFoundException(ex.getMessage() );

    }
    return arPatients;
    }

    public static ArrayList<String> getIDNumbers() throws NotFoundException{
        // clearing the arraylist
        arID.clear();

        //executing the statement for the ID field
        try {
            prepstat = conn.prepareStatement( "Select id_number FROM tblpatients" );
            resSet = prepstat.executeQuery();

            while (resSet.next()){
                arID.add( resSet.getString( "id_number" ) );
            }
        }catch (SQLException ex){
            throw new NotFoundException( ex.getMessage() );


        }
        return arID;
    }

public static PatientClass getPatientObj(String idNumber)throws NotFoundException{
        //declarations
    PatientClass objPatient = null;

    //executing SQL commands to get the patient information from the table to display in resultset
    try {
        prepstat = conn.prepareStatement( "Select * From tblpatients Where id_number =?" );
        prepstat.setString( 1,idNumber ); //assigning prepared statement to IDnumber variable
        resSet = prepstat.executeQuery();

        while (resSet.next()){ //looping the result set to get Label names for result set columns
            objPatient= new PatientClass( resSet.getString( "surname" ),
                    resSet.getString( "id_number" ),
                    PatientClass.TypePatient.valueOf( "patient_type" ),
                    resSet.getDouble( "amount_due" ));
        }

    }catch (SQLException ex){
        throw new NotFoundException( ex.getMessage() );

    }
    return objPatient; //returning the object for any method calls


}
public static void UpdateAmountDue(double amt,String idNumber)throws  NotFoundException{

        try {
            prepstat= conn.prepareStatement( "Update tblpatients Set amount_due =? Where id_number = ?" );
            prepstat.setDouble( 1,amt );
            prepstat.setString( 1,idNumber );
            prepstat.executeUpdate();


        } catch (SQLException ex){
            throw new NotFoundException( ex.getMessage() );


        }
}

public static ArrayList<PatientClass> returnPatientType(String  typePatient) throws NotFoundException{
        //clear patients arraylist
    arPatients.clear();

    //executing SQL commands to assign to object

    try {
        //query declarations
        prepstat = conn.prepareStatement( "Select * From tblpatients Where patient_type = ?" );
        prepstat.setString( 1,typePatient );
        resSet = prepstat.executeQuery();

        while (resSet.next()){
            arPatients.add( new PatientClass( resSet.getString( "surname" ),
                    resSet.getString( "id_number" ),
                    PatientClass.TypePatient.valueOf( resSet.getString( "patient_type" ) ),
                    resSet.getDouble( "amount_due" )) );
        }

    }catch (SQLException ex){
        throw new NotFoundException( ex.getMessage() );
    }
    return arPatients;
}
public static void addPatient(PatientClass objPatient) throws DuplicateException{

        //executing sql command
    try {
        prepstat = conn.prepareStatement( "Insert Into tblpatients VALUES(?,?,?,?)" );

        //inserting values from variables into patient record
        prepstat.setString( 1,objPatient.getID());
        prepstat.setString( 1,objPatient.getSurname() );
        prepstat.setString( 1,String.valueOf( objPatient.getTypePatientObj() ) );
        prepstat.setDouble( 1,objPatient.getAmtDue() );

        //execute update
        prepstat.executeUpdate();

    }catch (SQLException ex){
        throw new DuplicateException( ex.getMessage() );
    }

}

public static double calculateTotalAmountDue() throws NotFoundException{
        //declarations
    double sum = 0;

    try {
        prepstat = conn.prepareStatement( "Select sum(amount_due) as total from tblpatients" );

        resSet = prepstat.executeQuery();

        while (resSet.next()){
            sum = resSet.getDouble( "total" );
        }
    }catch (SQLException ex){
        throw new NotFoundException( ex.getMessage() );
    }
    return sum;
}

public static double calculateTotalOutPatients() throws NotFoundException{
        //declarations
    double sum = 0;

    try {

        prepstat = conn.prepareStatement( "Select sum(Amount_due) as total from tblpatients"+
                "Where patient_type LIKE 'out_p%'" ); //used to find sum of column amount due then it assigns to variable total
        resSet = prepstat.executeQuery();
        while (resSet.next()){
            sum = resSet.getDouble( "total" );
        }
    }catch (SQLException ex){
        throw new NotFoundException( ex.getMessage() );

    }
    return sum;
}

public static double calculateTotalInPatients() throws  NotFoundException{
        //declarations
    double sum = 0;

    try {
        prepstat = conn.prepareStatement( "Select sum(amount_due) as total from tblpatients" +
                "Where patient_type LIKE 'in_p%'");
        resSet = prepstat.executeQuery();
        while (resSet.next()){
            sum = resSet.getDouble( "total" );
        }



    }catch (SQLException ex){
        throw new NotFoundException( ex.getMessage() );
    }
    return sum;
}
}
