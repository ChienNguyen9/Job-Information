//COSC 1320 Fall 2015
//Chien Nguyen
//ProgrammingAssignment 1
//This is my own work; I will not post.

public class Doctor extends HospitalEmployee
{
    private String specialty;
    private char type='d';
    
    public void setType(char newType)
    {
        type = newType;
    }
    public char getType()
    {
        return type;
    }
    public void setSpecialty(String newSpecialty){
        specialty = newSpecialty;
    }
    public String getSpecialty(){
        return specialty;
    }
    public String toString(String docName, int docRoomNumber, String docSpecialty)
    {
        return ("Name: " + docName + " Employee Number: " + docRoomNumber+
                    " Specialty: " + docSpecialty);
    }
}
