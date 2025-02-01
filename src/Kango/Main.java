package Kango;
import departments.cs.CustomerService;
import departments.hr.HR;
import departments.operators.Operators;
import departments.smm.SMM;
import departments.it.IT;


// Main Class
public class Main {

    public static void main(String[] args) {

        Operators[] department = {
                new Operators("Abbasova Vusale", 23, "Operator", "Plaza", 700, "AZN"),
                new Operators("Memmedova Sevinc", 25, "Operator", "Plaza", 650, "AZN")
        };
        SMM[] department1 = {
                new SMM("Eliyeva Aysel", 21, "SMM", "Branch", 25, true),
                new SMM("Rzayeva Aygun", 22, "SMM", "Branch", 25, false)
        };
        CustomerService[] department2 = {
                new CustomerService("Memmedov Ugur", 20, "Customer Service", "Head Office", 5, "directly, over the phone, or via email"),
                new CustomerService("Aliyeva Sema", 26, "Customer Service", "Head Office", 5, "directly, over the phone, or via email")
        };

        HR hr = new HR("Hesenli Gulay", 24, "HR", "Branch", "responsible for accounting tasks.", "from Monday to Friday");
        IT[] department3 = {
                new IT("Resulov Emin", 30, "IT", "Aztex Plaza", "from 11 a.m to 7 p.m", "He manages systems", 10),
                new IT("Aliyev Rza", 28, "IT", "Aztex Plaza", "from 11 a.m to 7 p.m", "He updates systems", 3)
        };


        System.out.println("\n\t---------Operators---------\n");
        for (Operators operator : department) {
            operator.info();
            System.out.println("Her salary is " + operator.getMonthlySalary() + " " + operator.getCurrency());
            operator.trainNewEmployee();
            System.out.println();
        }

        System.out.println("\n\t------SMM Employees-------\n");
        for (SMM smm : department1) {
            smm.info();
            smm.details();
            System.out.println();
        }

        System.out.println("\n\t------Customer Service Employees----------\n");
        for (CustomerService customerService : department2) {
            customerService.info();
            customerService.callRespondToCustomers();
            System.out.println("The total number of employees in Customer Service is " + customerService.getEmployeeCount());
            System.out.println();
        }

        System.out.println("\n\t--------HR Employees---------\n");
        hr.info();
        hr.postJob();
        System.out.println();

        System.out.println("\n\t----------IT Employees------------\n");
        for (IT it : department3) {
            it.info();
            it.details();
            System.out.println();
        }

    }
}
