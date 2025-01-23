package departments.smm;
import Kango.Employees;

// Subclass SMM
public class SMM extends Employees {
    public final int ageRestriction;
    public boolean isFullTime;

    // SMM Konstruktoru
    public SMM(String nameSurname, int age, String profession, String location, int ageRestriction, boolean isFullTime){
        super(nameSurname, age, profession, location);
        this.ageRestriction = ageRestriction;
        this.isFullTime = isFullTime;
    }



    public void details(){
        checkJobStatus();
        System.out.println("SMM employees' age should be under " + ageRestriction);
        System.out.println("SMM employees create and share content to promote the company on social media as well.");
    }

    public void checkJobStatus() {
        if (isFullTime) System.out.println("She is full-time");
        else System.out.println("She is part-time");
        }

}

