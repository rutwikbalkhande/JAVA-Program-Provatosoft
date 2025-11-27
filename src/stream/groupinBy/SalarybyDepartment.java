package stream.groupinBy;

import stream.Employee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SalarybyDepartment {

    public static void main(String[] args) {

        List<Employee> list = List.of(
                new Employee(1, "Amit", 50000),
                new Employee(2, "Raj", 60000),
                new Employee(3, "Sita", 70000)
        );

        Map<String, Double> avgSalary =
                list.stream()
                        .collect(
                                Collectors.groupingBy(Employee::getName,
                                        Collectors.averagingDouble(Employee::getSalary))
                        );

        System.out.println(avgSalary);
    }
}
