package Kango;

//superClass
public class Employees {
    protected String nameSurname;
    private  int age;
    public String profession;
    protected String location;


    protected Employees(String nameSurname, int age, String profession, String location) {
        this.nameSurname = nameSurname;
        this.age = age;
        this.profession = profession;
        this.location = location;
    }

    protected void info() {
        System.out.println("Name and Surname: " + nameSurname + "\nAge: " + age +  "\nProfession: " + profession + "\nLocation: " + location);
    }

}

