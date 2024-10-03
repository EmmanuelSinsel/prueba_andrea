package SOLID;

public class SingleResponsabilityPrinciple {
    public void run(){
        Employee employee = new Employee("John Doe", 101, "Engineering");

        // Guardar el empleado en la base de datos
        EmployeeRepository employeeRepository = new EmployeeRepository();
        employeeRepository.saveEmployee(employee);

        // Generar un reporte del empleado
        EmployeeReport employeeReport = new EmployeeReport();
        employeeReport.generateReport(employee);
    }
}

class Employee {
    private String name;
    private int id;
    private String department;

    public Employee(String name, int id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}


class EmployeeRepository {
    public void saveEmployee(Employee employee) {
        // Lógica para guardar el empleado en la base de datos
        System.out.println("Employee " + employee.getName() + " saved to the database.");
    }

    public void deleteEmployee(Employee employee) {
        // Lógica para eliminar el empleado de la base de datos
        System.out.println("Employee " + employee.getName() + " deleted from the database.");
    }
}


class EmployeeReport {
    public void generateReport(Employee employee) {
        // Lógica para generar un reporte del empleado
        System.out.println("Generating report for Employee: " + employee.getName());
        System.out.println("ID: " + employee.getId());
        System.out.println("Department: " + employee.getDepartment());
    }
}
