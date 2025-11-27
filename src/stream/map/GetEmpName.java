package stream.map;

import stream.Employee;

import java.util.List;

public class GetEmpName {

    public static void main(String[] args) {

    List<Employee> list = List.of(
            new Employee(1, "Amit", 50000),
            new Employee(2, "Raj", 60000),
            new Employee(3, "Sita", 70000)
    );

    List<String> names = list.stream()
            .map(Employee::getName)
            //.map(String::length)
            .toList();

    // filter name Starts with "A"
        List<String> filterName = list.stream()
                .map(Employee::getName)
                .filter(n->n.startsWith("A"))
                .toList();

        //salary
        List<Double> salary = list.stream().map(e->e.getSalary())
                .filter(e->e>50000)
                .toList();


        System.out.println(names);
        System.out.println(filterName);
        System.out.println(salary);

}
}
