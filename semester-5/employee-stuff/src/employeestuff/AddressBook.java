package employeestuff;

import java.util.*;

public class AddressBook {
    private ArrayList<Employee> entry = new ArrayList<Employee>();

    // Wasn't asked but implemented for sake of implementation
    public void addEmployee(Employee emp) {
        entry.add(emp);
    }

    public void displaySalaryReport(Integer baseSalary, Integer days) {
        for (Employee employee : entry) {
            System.out.println(employee.getName() + "\t $" + employee.computeSalary(baseSalary, days));
        }
    }

}

