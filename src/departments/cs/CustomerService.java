package departments.cs;
import Kango.Employees;


//Subclass Customer Service
public class CustomerService extends Employees {
    private static int employeeCount;
    static String contactMethod;



    // Customer Service Konstruktor
    public CustomerService(String nameSurname, int age, String profession, String location, int employeeCount, String contactMethod) {
        super(nameSurname, age, profession, location);
        employeeCount = employeeCount;
        contactMethod = contactMethod;
    }

    protected static void respondToCustomers() {
        System.out.println("They respond to customers " + contactMethod);
    }

    //get ve call method yaratdim
    public static int getEmployeeCount(){ /// niye protected olmadi?
        return employeeCount;
    }

   public static void callRespondToCustomers() { /// call method istifade etdim metodu public etdim
        respondToCustomers();
   }
}

