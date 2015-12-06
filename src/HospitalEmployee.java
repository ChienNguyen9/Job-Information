//COSC 1320 Fall 2015
//Chien Nguyen
//ProgrammingAssignment 1
//This is my own work; I will not post.

public class HospitalEmployee 
{
    private String name;
    private int roomNumber;
    public HospitalEmployee()
    {
        name = "";
        roomNumber = 0;
    }
    public void setName(String newName)
    {
        this.name = newName;
    }
    public void setRoomNumber(int newRoomNumber)
    {
        this.roomNumber = newRoomNumber;
    }
    public String getName()
    {
        return name;
    }
    public int getRoomNumber()
    {
        return roomNumber;
    }
    public String toString(String hosName, int hosRoomNumber)
    {
        return ("Name: " + hosName + " Employee Number: " + hosRoomNumber);
    }
}
