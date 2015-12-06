//COSC 1320 Fall 2015
//Chien Nguyen
//ProgrammingAssignment 1
//This is my own work; I will not post.

public class Receptionist extends Administrator
{
    private String answering;
    private String department;
    private char type = 'r';

    public void setType(char newType)
    {
        type = newType;
    }
    public char getType()
    {
        return type;
    }
    public void setAnswering(String newAnswering){
        answering = newAnswering;
    }
    public String getAnswering(){
        return answering;
    }
    public void setDepartment(String newDepartment){
        department = newDepartment;
    }
    public String getDepartment(){
        return department;
    }
    public String toString(String reName, int reRoomNumber, String reDepartment, String reAnswering)
    {
        return ("Name: "+reName + " Employee Number: "+reRoomNumber +
                    " Department: "+reDepartment +" Answering: "+reAnswering);
    }
}
