package packages.employeemanagementsystem;
abstract class Employee {
    public String employeeId;
    public String name;
    public double baseSalary;

Employee(String employeeId, String name, double baseSalary){
this.employeeId=employeeId;
this.name=name;
this.baseSalary=baseSalary;

}
abstract double calculateSalary() ;

public void displayDetails() {
    System.out.println("Employee Id: "+employeeId);
    System.out.println("Employee name: "+name);
    System.out.println("Base Salary of Employee: "+baseSalary);
    System.out.println("Calculated Salary: "+calculateSalary());
}
}

