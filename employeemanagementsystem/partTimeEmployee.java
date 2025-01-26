package packages.employeemanagementsystem;

class partTimeEmployee extends Employee implements Department {
    private int workedHours;
    private double hourlyRate;
    private String department;

    partTimeEmployee(String employeeId, String name, int workedHours,double hourlyRate, String d) {
        super( employeeId, name,workedHours*hourlyRate );
        this.department=d;
    }
    @Override
    double calculateSalary() {
        return super.baseSalary;
    } 
    @Override
    public void displayDetails() {
        // TODO Auto-generated method stub
        super.displayDetails();
        assignDepartment();
        System.out.println("------------------------------------------------------");
    }
    public void assignDepartment() {
        System.out.println("Department: "+getDepartmentDetails());
        
    }
    @Override
    public String getDepartmentDetails() {
        return department;
    
}
}
