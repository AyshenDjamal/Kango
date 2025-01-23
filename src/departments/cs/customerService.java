package departments.cs;
import Kango.Employees;


//Subclass Customer Service
public class customerService extends Employees {
    private int employeeCount;
    String contactMethod;



    // Customer Service Konstruktor
    public customerService(String nameSurname, int age, String profession, String location, int employeeCount, String contactMethod) {
        super(nameSurname, age, profession, location);
        this.employeeCount = employeeCount;
        this.contactMethod = contactMethod;
    }

    protected void respondToCustomers() {
        System.out.println("They respond to customers " + contactMethod);
    }

    //get ve call method yaratdim
    public int getEmployeeCount(){ /// niye protected olmadi?
        return employeeCount;
    }

   public void callRespondToCustomers() { /// call method istifade etdim metodu public etdim
        respondToCustomers();
   }
}

