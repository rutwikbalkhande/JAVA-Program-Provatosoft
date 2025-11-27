package stream.filter;

import stream.Project;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SearchName {
    public static void main(String[] args) {



        List<Project> list= Arrays.asList(
                new Project("Ram Finance App", "ACTIVE","1000"),
                new Project("E-commerce System", "COMPLETED" ,"2000"),
                new Project("Ram Billing App", "ACTIVE", "5000"),
                new Project("Banking Portal", "ON_HOLD", "3000")
        );  // data comes from project class= name, status


        String name="ram";     // search name

       /* List<Project> result = projectList.stream()
                .filter(p -> p.getName().toLowerCase().contains(name.toLowerCase()))
                .toList();
          */

       String s=  list.stream()
                .map(Project::getSalary)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(2)
                .findFirst()
                .orElse(null);

        System.out.println("third highest salary : " + s);

    }
}
