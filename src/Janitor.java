//COSC 1320 Fall 2015
//Chien Nguyen
//ProgrammingAssignment 1
//This is my own work; I will not post.

public class Janitor extends Administrator
{
    private String sweeping;
    private String department;
    private char type = 'j';
    
    public void setType(char newType)
    {
        type = newType;
    }
    public char getType()
    {
        return type;
    }
    public void setSweeping(String newSweeping)
    {
        sweeping = newSweeping;
    }
    public void setDepartment(String newDepartment)
    {
        department = newDepartment;
    }
    public String getSweeping()
    {
        return sweeping;
    }
    public String getDepartment()
    {
        return department;
    }
    public String toString(String janName, int janRoomNumber, String janDepartment, String janSweeping)
    {
        return ("Name: "+janName+ " Employee Number: "+janRoomNumber+
                    " Department: "+janDepartment+" Sweeping: "+janSweeping);
    }

}
