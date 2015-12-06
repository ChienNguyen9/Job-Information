//COSC 1320 Fall 2015
//Chien Nguyen
//ProgrammingAssignment 1
//This is my own work; I will not post.

public class Surgeon extends Doctor
{
    private String operating;
    private String specialty;
    char type ='s';

    public void setType(char newType)
    {
        type = newType;
    }
    public char getType()
    {
        return type;
    }
    public void setOperating(String newOperating){
        operating = newOperating;
    }
    public String getOperating(){
        return operating;
    }
     public void setSpecialty(String newSpecialty){
        specialty = newSpecialty;
    }
    public String getSpecialty(){
        return specialty;
    }
    public String toString(String surName, int surRoomNumber, String surSpecialty, String surOperating)
    {
        return ("Name: " + surName + " Employee Number: " + surRoomNumber +
                    " Specialty: " + surSpecialty +" Operating: " + surOperating);
    }
}
