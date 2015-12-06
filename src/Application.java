//COSC 1320 Fall 2015
//Chien Nguyen
//ProgrammingAssignment 1
//This is my own work; I will not post.
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class Application 
{
    private static final int MAX_SIZE = 5;
    private Administrator administrator[] = new Administrator[MAX_SIZE];
    private Doctor doctor[] = new Doctor[MAX_SIZE];
    private HospitalEmployee hospitalEmployee[] = new HospitalEmployee[MAX_SIZE];
    private Janitor janitor[] = new Janitor[MAX_SIZE];
    private Nurse nurse[] = new Nurse[MAX_SIZE];
    private Receptionist receptionist[] = new Receptionist[MAX_SIZE];
    private Surgeon surgeon[] = new Surgeon[MAX_SIZE];
    private String type, name, ava, spec, user, info = null;
    private int code, numberOfPatient, number, nop, empty = 55;;
    private int count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0, count6 = 0, count7 = 0;
    private boolean found = false;
    
    public Application()
    {
        for (int i=0;i<5;i++)
            administrator[i] = new Administrator();
        for (int i=0;i<5;i++)
            doctor[i] = new Doctor();
        for (int i=0;i<5;i++)
            hospitalEmployee[i] = new HospitalEmployee();
        for (int i=0;i<5;i++)
            janitor[i] = new Janitor();
        for (int i=0;i<5;i++)
            nurse[i] = new Nurse();
        for (int i=0;i<5;i++)
            receptionist[i] = new Receptionist();
        for (int i=0;i<5;i++)
            surgeon[i] = new Surgeon();   
    }
    public void readFile()
    {
        Scanner inputStream = null;
        try 
        {
            inputStream = new Scanner(new FileInputStream("Data.txt"));
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File was not found!");
        }
        
        while(inputStream.hasNext())
        {
            type = inputStream.next();
            //System.out.println(type);
            if(type.equalsIgnoreCase("h"))
            {
                name=inputStream.next();
               //  System.out.println(name);
                code=inputStream.nextInt();
                // System.out.println(code);
                hospitalEmployee[count1].setName(name);
               // System.out.println(hemp[count1].getName());
                hospitalEmployee[count1].setRoomNumber(code);
               // System.out.println(hemp[count1].getNumber());
                count1++;
            }
            else if(type.equalsIgnoreCase("d")) 
            {
                name = inputStream.next();
                code = inputStream.nextInt();
                spec = inputStream.next();
                doctor[count2].setName(name);
                doctor[count2].setRoomNumber(code);
                doctor[count2].setSpecialty(spec);
//              System.out.println(doc[count2].getName());
//              System.out.println(doc[count2].getNumber());
//              System.out.println(doc[count2].getSpecialty());
                count2++;
            }
            else if(type.equalsIgnoreCase("s"))
            {
                name = inputStream.next();
                code = inputStream.nextInt();
                spec = inputStream.next();
                ava = inputStream.next();

                surgeon[count3].setName(name);
                surgeon[count3].setRoomNumber(code);
                surgeon[count3].setSpecialty(spec);
                surgeon[count3].setOperating(ava);
//                System.out.println(surgeon[count3].getName());
//               System.out.println(surgeon[count3].getNumber());
//               System.out.println(surgeon[count3].getSpec());
//               System.out.println(surgeon[count3].getOperating());
               
                count3++;
            }
            else if(type.equalsIgnoreCase("n"))
            {
                name=inputStream.next();
                code=inputStream.nextInt();
                numberOfPatient=inputStream.nextInt();

                nurse[count4].setName(name);
                nurse[count4].setRoomNumber(code);
                nurse[count4].setNumberPatients(numberOfPatient);
//               System.out.println(nurse[count4].getName());
//               System.out.println(nurse[count4].getNumber());
//               System.out.println(nurse[count4].getNumpatients());
                count4++;
            }
            else if(type.equalsIgnoreCase("a"))
            {
                name = inputStream.next();
                code = inputStream.nextInt();
                spec = inputStream.next();
                administrator[count5].setName(name);
                administrator[count5].setRoomNumber(code);
                administrator[count5].setDepartment(spec);
//              System.out.println(adm[count5].getName());
//              System.out.println(adm[count5].getNumber());
//              System.out.println(adm[count5].getDepartment());
                count5++;
            }
            else if (type.equalsIgnoreCase("r"))
            {
                name = inputStream.next();
                code = inputStream.nextInt();
                spec = inputStream.next();
                ava = inputStream.next();

                receptionist[count6].setName(name);
                receptionist[count6].setRoomNumber(code);
                receptionist[count6].setDepartment(spec);
                receptionist[count6].setAnswering(ava);
  
//              System.out.println(recep[count6].getName());
//              System.out.println(recep[count6].getNumber());
//              System.out.println(recep[count6].getDepart());
//              System.out.println(recep[count6].getAnswering());
                count6++;
            }
            else //"j"
            {
                name = inputStream.next();
                code = inputStream.nextInt();
                spec = inputStream.next();
                ava = inputStream.next();

                janitor[count7].setName(name);
                janitor[count7].setRoomNumber(code);
                janitor[count7].setDepartment(spec);
                janitor[count7].setSweeping(ava);
                
//              System.out.println(janitor[count7].getName());
//              System.out.println(janitor[count7].getNumber());
//              System.out.println(janitor[count7].getDepartment());
//              System.out.println(janitor[count7].getSweeping());
                count7++;
            }
        }
        inputStream.close();
    }
    public void deleteData(String name, String type)
    {
        if (type.equalsIgnoreCase("h"))
        {
            for (int i = 0; i < 5; i++)
            {
                if(hospitalEmployee[i].getName().equalsIgnoreCase(name))
                {
                    hospitalEmployee[i].setName("");
                    found = true;
                    break;
                }    
            }   
        }
        else if(type.equalsIgnoreCase("d")) 
        {
                for (int i = 0; i < 5; i++)
                {
                    if(doctor[i].getName().equalsIgnoreCase(name))
                    {
                        doctor[i].setName("");
                        found = true;
                        break;
                    }    
                } 
        }
        else if (type.equalsIgnoreCase("s"))
        {
            for (int i = 0; i < 5; i++)
            {
                if(surgeon[i].getName().equalsIgnoreCase(name))
                {
                    surgeon[i].setName("");
                    found = true;
                    break;
                }  
            }             
        }
        else if (type.equalsIgnoreCase("n"))
        {
            for (int i = 0; i < 5; i++)
            {
                if(nurse[i].getName().equalsIgnoreCase(name))
                {
                    nurse[i].setName("");
                    found = true;
                    break;
                }     
            }
        }
        else if (type.equalsIgnoreCase("a"))
        {
            for (int i = 0; i < 5; i++)
            {
                if(administrator[i].getName().equalsIgnoreCase(name))
                {
                    administrator[i].setName("");
                    found = true;
                    break;
                }   
            }               
        }
        else if (type.equalsIgnoreCase("r"))
        {
            for (int i = 0; i < 5; i++)
            {
                if(receptionist[i].getName().equalsIgnoreCase(name))
                {
                    receptionist[i].setName("");
                    found = true;
                    break;
                }
            }
        }
        else //"j"
        {
            for (int i = 0; i < 5; i++)
            {
                if(janitor[i].getName().equalsIgnoreCase(name))
                {
                    janitor[i].setName("");
                    found=true;
                    break;
                }   
            }
        }
        if(found)
            System.out.println("Employee deleted");
        else
            System.out.println("Could not find employee");

    }
    public void addData(String type)
    {
        Scanner keyboard = new Scanner(System.in);
        if (type.equalsIgnoreCase("h"))
        {
            System.out.println("Please enter name: ");
            user = keyboard.next();
            System.out.println("Please enter a employee number: ");
            number = keyboard.nextInt();
            for (int i=0;i<5;i++)
            {
                if(hospitalEmployee[i].getName().equalsIgnoreCase(""))
                {
                    empty = i;
                    break;
                }
                   
            }
            hospitalEmployee[empty].setName(user);
            hospitalEmployee[empty].setRoomNumber(number);
              
        }
        else if(type.equalsIgnoreCase("d")) 
        {
            System.out.println("Please enter name:");
            user = keyboard.next();
            System.out.println("Please enter a employee number:");
            number = keyboard.nextInt();
            System.out.println("Please enter specialty:");
            spec = keyboard.next();
            for (int i=0;i<5;i++)
            {
                if(doctor[i].getName().equalsIgnoreCase(""))
                {
                    empty = i;
                    break;
                }
                   
            }
            doctor[empty].setName(user);
            doctor[empty].setRoomNumber(number);
            doctor[empty].setSpecialty(spec);   
        }
        else if (type.equalsIgnoreCase("s"))
        {
          
            System.out.println("Please enter name:");
            user = keyboard.next();
            System.out.println("Please enter a employee number:");
            number = keyboard.nextInt();
            System.out.println("Please enter specialty:");
            spec = keyboard.next();
            System.out.println("Operating?");
            ava = keyboard.next();
            for (int i=0;i<5;i++)
            {
                if(surgeon[i].getName().equalsIgnoreCase(""))
                {
                    empty = i;
                    break;
                }
            }
            surgeon[empty].setName(user);
            surgeon[empty].setRoomNumber(number);
            surgeon[empty].setSpecialty(spec);
            surgeon[empty].setOperating(ava);
        }
        else if (type.equalsIgnoreCase("n"))
        {
            System.out.println("Please enter name:");
            user = keyboard.next();
            System.out.println("Please enter a employee number:");
            number = keyboard.nextInt();
            System.out.println("Please enter number of patients:");
            nop = keyboard.nextInt();
            for (int i=0;i<5;i++)
            {
                if(nurse[i].getName().equalsIgnoreCase(""))
                {
                    empty = i;
                    break;
                }    
            }
            nurse[empty].setName(user);
            nurse[empty].setRoomNumber(number);
            nurse[empty].setNumberPatients(nop);          
        }
        else if (type.equalsIgnoreCase("a"))
        {
            System.out.println("Please enter name:");
            user = keyboard.next();
            System.out.println("Please enter a employee number:");
            number = keyboard.nextInt();
            System.out.println("Please enter department:");
            spec = keyboard.next();
            for (int i=0;i<5;i++)
            {
                if(administrator[i].getName().equalsIgnoreCase(""))
                {
                    empty = i;
                    break;
                }
                   
            }
            administrator[empty].setName(user);
            administrator[empty].setRoomNumber(number);
            administrator[empty].setDepartment(spec);
        }
        else if (type.equalsIgnoreCase("r"))
        {
            System.out.println("Please enter name:");
            user = keyboard.next();
            System.out.println("Please enter a employee number:");
            number = keyboard.nextInt();
            System.out.println("Please enter department:");
            spec = keyboard.next();
            System.out.println("Answering?");
            ava = keyboard.next();
            for (int i=0;i<5;i++)
            {
                if(receptionist[i].getName().equalsIgnoreCase(""))
                {
                    empty = i;
                    break;
                }
                   
            }
            receptionist[empty].setName(user);
            receptionist[empty].setRoomNumber(number);
            receptionist[empty].setDepartment(spec);
            receptionist[empty].setAnswering(ava);
            }
            else //"j"
            {
                System.out.println("Please enter name:");
                user = keyboard.next();
                System.out.println("Please enter a employee number:");
                number = keyboard.nextInt();
                System.out.println("Please enter department:");
                spec = keyboard.next();
                System.out.println("Sweeping?");
                ava = keyboard.next();
                for (int i=0;i<5;i++)
                {
                    if(janitor[i].getName().equalsIgnoreCase(""))
                    {
                        empty = i;
                        break;
                    }
                   
                }
            janitor[empty].setName(user);
            janitor[empty].setRoomNumber(number);
            janitor[empty].setDepartment(spec);
            janitor[empty].setSweeping(ava);
            }
            System.out.println("Employee added!");
    }
    public String toString()
    {
        int a=0, d=0, he=0, j=0, n=0, r=0, s=0;
        for(int i=0;i<5;i++)
            if(!administrator[i].getName().equalsIgnoreCase(""))
                a++;
        for(int i=0;i<5;i++)
            if(!doctor[i].getName().equalsIgnoreCase(""))
                d++;
        for(int i=0;i<5;i++)
            if(!hospitalEmployee[i].getName().equalsIgnoreCase(""))
                he++;
        for(int i=0;i<5;i++)
            if(!janitor[i].getName().equalsIgnoreCase(""))
                j++;
        for(int i=0;i<5;i++)
            if(!nurse[i].getName().equalsIgnoreCase(""))
                n++;
        for(int i=0;i<5;i++)
            if(!receptionist[i].getName().equalsIgnoreCase(""))
                r++;
        for(int i=0;i<5;i++)
            if(!surgeon[i].getName().equalsIgnoreCase(""))
                s++;        
        System.out.println("The Hospital has the following employees:\n");
        System.out.println("Hospital Employees : " + he);
        for (int i=0;i<5;i++)
            if(!hospitalEmployee[i].getName().equalsIgnoreCase(""))  
                System.out.println("Name: " + hospitalEmployee[i].getName() + " Employee Number: " + hospitalEmployee[i].getRoomNumber());
        System.out.println();
        System.out.println("Doctor : "+ d);
        for (int i=0;i<5;i++)
            if(!doctor[i].getName().equalsIgnoreCase(""))
                System.out.println("Name: " + doctor[i].getName() + " Employee Number: " + doctor[i].getRoomNumber()+
                    " Specialty: " + doctor[i].getSpecialty());
        System.out.println();
        System.out.println("Surgeons: " + s);
        for (int i=0;i<5;i++)
            if(!surgeon[i].getName().equalsIgnoreCase(""))
                System.out.println("Name: " + surgeon[i].getName()+ " Employee Number: " + surgeon[i].getRoomNumber() +
                    " Specialty: " + surgeon[i].getSpecialty()+" Operating: " + surgeon[i].getOperating());
        System.out.println();
        System.out.println("Nurse : " + n);
        for (int i=0;i<5;i++)
            if(!nurse[i].getName().equalsIgnoreCase(""))
                System.out.println("Name: " + nurse[i].getName()+ " Employee Number: " + nurse[i].getRoomNumber() + 
                    " Number of Patients: " + nurse[i].getNumberPatients());
        System.out.println();
        System.out.println("Administrator: " + a);
        for (int i=0;i<5;i++)
            if(!administrator[i].getName().equalsIgnoreCase(""))
                System.out.println("Name: "+administrator[i].getName()+ " Employee Number: "+administrator[i].getRoomNumber()+
                    " Department: "+administrator[i].getDepartment());
        System.out.println();
        System.out.println("Receptionists: "+r);
        for (int i=0;i<5;i++)
            if(!receptionist[i].getName().equalsIgnoreCase(""))
                System.out.println("Name: "+receptionist[i].getName()+ " Employee Number: "+receptionist[i].getRoomNumber()+
                    " Department: "+receptionist[i].getDepartment()+" Answering: "+receptionist[i].getAnswering());
        System.out.println();
        System.out.println("Janitors: "+j);
        for (int i=0;i<5;i++)
            if(!janitor[i].getName().equalsIgnoreCase(""))
                System.out.println("Name: "+janitor[i].getName()+ " Employee Number: "+janitor[i].getRoomNumber()+
                    " Department: "+janitor[i].getDepartment()+" Sweeping: "+janitor[i].getSweeping()); 
        System.out.println();
        System.out.println("Total number of Employees: "+(he+d+s+n+a+r+j));
        return info;
    }
    public void saveFile()
    {
        PrintWriter outputStream = null;
        try
        {
            outputStream = new PrintWriter(new FileOutputStream("Data.txt")); 
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Error opening file");
            System.exit(0);
        }
        for (int i=0;i<5;i++)
            if(!administrator[i].getName().equalsIgnoreCase(""))
                outputStream.println("a "+administrator[i].getName()+" "+administrator[i].getRoomNumber()+" "+administrator[i].getDepartment());
        for (int i=0;i<5;i++)
            if(!hospitalEmployee[i].getName().equalsIgnoreCase(""))
                outputStream.println("h "+hospitalEmployee[i].getName()+" "+hospitalEmployee[i].getRoomNumber());
        for (int i=0;i<5;i++)
            if(!doctor[i].getName().equalsIgnoreCase(""))
                outputStream.println("d "+doctor[i].getName()+" "+doctor[i].getRoomNumber()+" "+doctor[i].getSpecialty());
        for (int i=0;i<5;i++)
            if(!surgeon[i].getName().equalsIgnoreCase(""))
                outputStream.println("s "+surgeon[i].getName()+" "+surgeon[i].getRoomNumber()+" "+surgeon[i].getSpecialty()+" "+surgeon[i].getOperating());
        for (int i=0;i<5;i++)
            if(!nurse[i].getName().equalsIgnoreCase(""))
                outputStream.println("n "+nurse[i].getName()+" "+nurse[i].getRoomNumber()+" "+nurse[i].getNumberPatients());
        for (int i=0;i<5;i++)
            if(!receptionist[i].getName().equalsIgnoreCase(""))
                outputStream.println("r "+receptionist[i].getName()+" "+receptionist[i].getRoomNumber()+" "+receptionist[i].getDepartment()+" "+receptionist[i].getAnswering());
        for (int i=0;i<5;i++)
            if(!janitor[i].getName().equalsIgnoreCase(""))
                outputStream.println("j "+janitor[i].getName()+" "+janitor[i].getRoomNumber()+" "+janitor[i].getDepartment()+" "+janitor[i].getSweeping());
        
        outputStream.close();
        System.out.println("Data Saved. Thanks for using the program! ");
        System.exit(0);
    }
}
