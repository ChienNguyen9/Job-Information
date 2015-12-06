//COSC 1320 Fall 2015
//Chien Nguyen
//ProgrammingAssignment 1
//This is my own work; I will not post.
import java.util.Scanner;

public class ProgrammingAssignment1 
{
    private static int choice = 0;
    private static String name, role;
    public static void main(String[] args)
    {
        Controller controllerObject = new Controller();
        View viewObject = new View();
                
        Scanner keyboard = new Scanner(System.in);
        controllerObject.UCReadFile();
        
        while(choice != 4)
        {
            viewObject.showSelection();
            choice = keyboard.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println("Please enter employee name to be deleted: ");
                    name=keyboard.next();
                    System.out.println("Please enter role (one letter)");
                    role=keyboard.next();
                    controllerObject.UCDeleteData(name, role);
                    break;
                case 2:
                    System.out.println("Please enter role to be added (one letter):");
                    role=keyboard.next();
                    controllerObject.UCAddData(role);
                    break;
                case 3: 
                    controllerObject.toString();
                    break;
                case 4: 
                    controllerObject.UCSaveFile();
                    break;
                default:
                    System.out.println("Invalid Selection. ");
            }           
        }

    }
}
