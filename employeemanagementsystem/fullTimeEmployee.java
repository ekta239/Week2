package packages.employeemanagementsystem;

class fullTimeEmployee extends Employee implements Department {
    private double anuualSalary;
    private String department;
    

    fullTimeEmployee(String employeeId, String name, double annualSalary,String department) {
        super(employeeId, name, annualSalary);
        this.department=department;

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
        System.out.println("-----------------------------------------------------------");
    }

    public void assignDepartment() {
        System.out.println("Department: "+getDepartmentDetails());
        
    }
    @Override
    public String getDepartmentDetails() {
        return department;
    }


}
