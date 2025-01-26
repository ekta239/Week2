package packages.employeemanagementsystem;

public class Main {
    public static void main(String[]args) {
        fullTimeEmployee obj=new fullTimeEmployee("001", "bhola", 50000, "HR");
        obj.displayDetails();

        partTimeEmployee obj1=new partTimeEmployee("002", "sorha", 6, 500, "IT");
        obj1.displayDetails();

    }
}
