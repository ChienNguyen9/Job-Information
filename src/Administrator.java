//COSC 1320 Fall 2015
//Chien Nguyen
//ProgrammingAssignment 1
//This is my own work; I will not post.

public class Administrator extends HospitalEmployee
{
    private String department;
    private char type = 'a';

    public void setType(char newType)
    {
        type = newType;
    }
    public char getType()
    {
        return type;
    }
    public void setDepartment(String newDepartment){
        department = newDepartment;
    }
    public String getDepartment(){
        return department;
    }
    public String toString(String adName, int adRoomNumber, String adDepartment)
    {
        return ("Name: "+ adName + " Employee Number: "+ adRoomNumber+
                    " Department: "+ adDepartment);
    }
}
