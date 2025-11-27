package stream;

import java.util.Comparator;
import java.util.List;

public class SecondLargestSalary {
    // find 2nd highest salary & remove Dublicate no.

    public static void main(String[] args) {

        List<Employee> employees = List.of(
                new Employee(1, "Amit", 50000),
                new Employee(2, "Raj", 60000),
                new Employee(3, "Sita", 70000),
                new Employee(4, "Gita", 70000),
                new Employee(4, "Gita", 55000)
        );

        Double salary = employees.stream()
                                      .map(Employee::getSalary) //    e->e.getSalary()
                                      .sorted(Comparator.reverseOrder())   // print highest to lowest salary
                                      .distinct()                        // remove duplicates
                                      .skip(1)      // skip the highest salary
                                   // .limit(2).toList();
                                       .findFirst()
                                       .orElse(null);

        System.out.println(salary);
    }
}
