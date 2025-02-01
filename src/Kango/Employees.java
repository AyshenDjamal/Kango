package Kango;

//superClass
public class Employees {
    protected static String nameSurname;
    private  static int age;
    public static String profession;
    protected static String location;


    protected Employees(String nameSurname, int age, String profession, String location) {
        nameSurname = nameSurname;
        age = age;
        profession = profession;
        location = location;
    }

    protected static void info() {
        System.out.println("Name and Surname: " + nameSurname + "\nAge: " + age +  "\nProfession: " + profession + "\nLocation: " + location);
    }

}

