//COSC 1320 Fall 2015
//Chien Nguyen
//ProgrammingAssignment 1
//This is my own work; I will not post.

public class Nurse extends HospitalEmployee
{
    private int numberPatients;
    private char type = 'n';

    public void setType(char newType)
    {
        type = newType;
    }
    public char getType()
    {
        return type;
    }
    public void setNumberPatients(int newNumberPatients){
        numberPatients = newNumberPatients;
    }
    public int getNumberPatients(){
        return numberPatients;
    }
    public String toString(String nurseName, int nurseRoomNumber, int nurseNumberPatients)
    {
        return ("Name: " + nurseName + " Employee Number: " + nurseRoomNumber + 
                    " Number of Patients: " + nurseNumberPatients);
    }
}
