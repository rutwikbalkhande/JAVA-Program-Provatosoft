package stream.filter;

import stream.Project;

import java.util.Arrays;
import java.util.List;

public class SearchName {
    public static void main(String[] args) {



        List<Project> projectList= Arrays.asList(
                new Project("Ram Finance App", "ACTIVE","1651"),
                new Project("E-commerce System", "COMPLETED" ,"65465"),
                new Project("Ram Billing App", "ACTIVE", "5465"),
                new Project("Banking Portal", "ON_HOLD", "5468")
        );  // data comes from project class= name, status


        String name="ram";     // search name
/*
        List<Project> result = projectList.stream()
                .filter(p -> p.getName().toLowerCase().contains(name.toLowerCase()))
                .toList();

        result.forEach(p -> System.out.println(p.getName()));

 */
    }
}
