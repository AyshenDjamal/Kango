package Kango;
import departments.cs.customerService;
import departments.hr.HR;
import departments.operators.Operators;
import departments.smm.SMM;
import departments.it.IT;
import java.util.ArrayList;
import java.util.List;


// Main Class
public class Main {
    public static void main(String[] args) {

        List<Operators> operatorsList = new ArrayList<>();
        List<SMM> smmList = new ArrayList<>();
        List<customerService> customerServiceList = new ArrayList<>();
        List<IT> itList = new ArrayList<>();

        operatorsList.add(new Operators("Abbasova Vusale", 23, "Operator","Plaza", 700, "AZN"));
        operatorsList.add(new Operators("Memmedova Sevinc", 25, "Operator","Plaza", 650, "AZN"));
        smmList.add(new SMM("Eliyeva Aysel", 21, "SMM", "Branch", 25, true));
        smmList.add(new SMM("Rzayeva Aygun", 22, "SMM", "Branch", 25, false));
        customerServiceList.add(new customerService("Memmedov Ugur", 20, "Customer Service", "Head Office", 5,"directly, over the phone, or via email"));
        customerServiceList.add(new customerService("Aliyeva Sema", 26, "Customer Service", "Head Office", 5, "directly, over the phone, or via email"));
        HR hr = new HR("Hesenli Gulay", 24, "HR", "Branch", "responsible for accounting tasks.", "from Monday to Friday");
        itList.add(new IT ("Resulov Emin", 30, "IT", "Aztex Plaza", "from 11 a.m to 7 p.m", "He manages systems", 10));
        itList.add(new IT ("Aliyev Rza", 28, "IT", "Aztex Plaza", "from 11 a.m to 7 p.m", "He updates systems", 3));

        System.out.println("\n\t---------Operators---------\n");
        for(Operators operator : operatorsList) {
            operator.info();
            System.out.println("Her salary is " + operator.getMonthlySalary() + " " + operator.getCurrency());
            operator.trainNewEmployee();
            System.out.println();
        }

        System.out.println("\n\t------SMM Employees-------\n");
        for(SMM smm : smmList) {
            smm.info();
            smm.details();
            System.out.println();
        }

        System.out.println("\n\t------Customer Service Employees----------\n");
        for(customerService customerService : customerServiceList) {
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
        for(IT it : itList) {
            it.info();
            it.details();
            System.out.println();
        }

    }
}
