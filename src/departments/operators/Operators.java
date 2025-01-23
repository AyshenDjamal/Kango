package departments.operators;
import Kango.Employees;

// subClass Operators
public class Operators extends Employees {
    protected double monthlySalary;
    protected String currency;

    // Operators Konstruktoru
    public Operators(String nameSurname, int age, String profession, String location, double monthlySalary, String currency) {
        super(nameSurname, age, profession, location); // super method hemishe birinci yazilir
        this.monthlySalary = monthlySalary;
        this.currency = currency;
    }


    public void trainNewEmployee() {
        System.out.println("Operators also can train new employees when needed.");
    }

    // created get methods
    public double getMonthlySalary() {
       return monthlySalary;
    }

    public String getCurrency(){
        return currency;
    }
}

