//COSC 1320 Fall 2015
//Chien Nguyen
//ProgrammingAssignment 1
//This is my own work; I will not post.

public class Controller
{
    Application applicationObject = new Application();
    
    public void UCReadFile()
    {
        applicationObject.readFile();
    }
    public void UCDeleteData(String name, String type)
    {
        applicationObject.deleteData(name, type);
    }
    public void UCAddData(String type)
    {
        applicationObject.addData(type);
    }
    public void UCSaveFile()
    {
        applicationObject.saveFile();
    }
    public String toString()
    {
        return applicationObject.toString();
    }
            
}
