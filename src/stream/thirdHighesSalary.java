package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class thirdHighesSalary {

         public static void main(String[] args) {



            List<Project> list= Arrays.asList(
                    new Project("Ram Finance App", "ACTIVE","1000"),
                    new Project("E-commerce System", "COMPLETED" ,"2000"),
                    new Project("Ram Billing App", "ACTIVE", "5000"),
                    new Project("Banking Portal", "ON_HOLD", "3000")
            );  // data comes from project class= name, status


                   int s=  list.stream()
                    .map(e-> Integer.parseInt (e.getSalary())) // converting String to int
                    .distinct()
                    .sorted(Comparator.reverseOrder())
                    .skip(2)
                    .findFirst()
                    .orElse(0);

            System.out.println("third highest salary : " + s);

        }
    }


