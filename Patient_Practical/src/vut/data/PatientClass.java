package vut.data;

import java.util.*;




public class PatientClass {

    private String surname;
    private String id;
    public enum TypePatient{
        OUT_PATIENT,IN_PATIENT
    }
    private TypePatient typePatientObj;
    private Double amtDue;

    public PatientClass() {
        this.id = "";
        this.surname = " ";
        this.amtDue= 0.0;
        this.typePatientObj = TypePatient.OUT_PATIENT;

    }

    public PatientClass(String surname, String id, TypePatient typePatientObj, Double amtDue) {
        setSurname( surname );
        setID( id );
        setTypePatientObj( typePatientObj );
        setAmtDue( amtDue );
    }

    public TypePatient getTypePatientObj() {
        return typePatientObj;
    }

    public void setTypePatientObj(TypePatient typePatientObj) {
        this.typePatientObj = typePatientObj;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if (surname.equals("")) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.surname = surname;
    }

    public String getID() {
        return id;
    }

    public void setID(String ID) {
        if (id.equals(" ")|| id.length() != 13) {
            throw new IllegalArgumentException(" ID must not be empty and must be 13 characters long");
        }
        this.id = id;
    }

    public Double getAmtDue() {
        return amtDue;
    }

    public void setAmtDue(Double amtDue) {
        this.amtDue = amtDue;
    }

    @Override
    public String toString() {
        return id + "\t" + surname + "\t" + typePatientObj + "\t" + "R "+ amtDue +"\n";

    }
}
