package stream.filter;

import stream.Project;

import java.util.Arrays;
import java.util.List;

public class Database_Filter {
    public static void main(String[] args) {


   List<Project> projects= Arrays.asList();  // data comes from project class= name, status
       // List<Project> projects= projectRepo.findAll();

        List<Project> rs= projects.stream().filter(e -> e.getStatus().equals("completed")).toList();

        System.out.println(rs);
    }
}
