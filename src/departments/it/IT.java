package departments.it;
import Kango.Employees;

//Subclass IT
public class IT extends Employees {
    public String shiftHours;
    protected String jobResponsibilities;
    public int yearsOfExperience;

    // IT Konstruktoru
    public IT(String nameSurname, int age, String profession, String location, String shiftHours, String jobResponsibilities, int yearsOfExperience) {
        super(nameSurname, age, profession, location);
        this.shiftHours = shiftHours;
        this.jobResponsibilities = jobResponsibilities;
        this.yearsOfExperience = yearsOfExperience;
    }

    public void details() {
        checkProfession();
        System.out.println(jobResponsibilities);
        System.out.println("The IT Employees works " + shiftHours);
    }

    public void checkProfession() {
        if (yearsOfExperience == 10) System.out.println("He is a Senior Developer");
            else System.out.println("He is a Mid-Level Developer");
        }


}
