package stream.toMap;

import stream.Employee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class KeyValue {

    //convert data into map & store in key value form   key = "id"  , "value = name

    public static void main(String[] args) {

        List<Employee> list = List.of(
                new Employee(1, "Amit", 50000),
                new Employee(2, "Raj", 60000),
                new Employee(3, "Sita", 70000)
        );

        Map<Integer, String> map = list.stream()
                .collect(Collectors.toMap(e -> e.getId(), e -> e.getName()));

        System.out.println(map);
    }
}