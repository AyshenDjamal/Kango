package departments.hr;
import Kango.Employees;

// Subclass HR
public class HR extends Employees {
    public String accountingTask;
    String workDays;

    //HR Konstruktoru
    public HR(String nameSurname, int age, String profession, String location, String accountingTask, String workDays){
        super(nameSurname, age, profession, location);
        this.accountingTask = accountingTask;
        this.workDays = workDays;
    }

    public void postJob(){
        System.out.println("She works " + workDays);
        System.out.println("She posts jobs when required, also " +accountingTask);
    }

}

