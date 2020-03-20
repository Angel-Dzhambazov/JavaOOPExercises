package oop.exercises.e01definingClasses.p01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class Main {
    private static Map<String, Department> departments = new HashMap<>();

    public static void main(String[] args) throws NoSuchMethodException, IOException, IllegalAccessException, InvocationTargetException, InstantiationException {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(isr);

        int n = Integer.parseInt(reader.readLine());

        for (int i = 0; i < n; i++) {
            String[] currentPerson = reader.readLine().split("\\s+");
            readCurrentLine(currentPerson);
        }
        Department highestPayedDepartment = departments.get(departments.keySet().toArray()[0]);
        for (Map.Entry<String, Department> currentDepartment : departments.entrySet()) {
            if (currentDepartment.getValue().getAverageSalary() > highestPayedDepartment.getAverageSalary()) {
                highestPayedDepartment = currentDepartment.getValue();
            }
        }
        System.out.println(highestPayedDepartment.toString());
//        departments.forEach((s, department) -> department.getAverageSalary().compareTo(highestPayedDepartment.getAverageSalary())

    }

    private static void readCurrentLine(String[] currentPerson) {
        Employee employee;
        switch (currentPerson.length) {
            case 4:
                employee = new Employee(currentPerson[0], Double.parseDouble(currentPerson[1]), currentPerson[2], currentPerson[3]);
                addEmployeeToDepartment(employee);
                break;
            case 5:
                try {
                    int age = Integer.parseInt(currentPerson[4]);
                    employee = new Employee(currentPerson[0], Double.parseDouble(currentPerson[1]), currentPerson[2], currentPerson[3], age);
                    addEmployeeToDepartment(employee);
                } catch (NumberFormatException e) {
                    employee = new Employee(currentPerson[0], Double.parseDouble(currentPerson[1]), currentPerson[2], currentPerson[3], currentPerson[4]);
                    addEmployeeToDepartment(employee);
                }
                break;
            case 6:
                employee = new Employee(
                        currentPerson[0],
                        Double.parseDouble(currentPerson[1]),
                        currentPerson[2],
                        currentPerson[3],
                        currentPerson[4],
                        Integer.parseInt(currentPerson[5]));
                addEmployeeToDepartment(employee);
                break;
        }
    }

    private static void addEmployeeToDepartment(Employee employee) {
        String department = employee.getDepartment();
        if (!departments.containsKey(department)) {
            departments.put(department, new Department(department));
        }
        departments.get(department).addEmployee(employee);
    }
}
