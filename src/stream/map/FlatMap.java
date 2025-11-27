package stream.map;

import java.util.List;

public class FlatMap {

    public static void main(String[] args) {

        List<List<String>> projects = List.of(
                List.of("Kafka", "Spring"),
                List.of("Docker", "Kubernetes"),
                List.of("splunk", "Grafana")
        );

       List<String>  all = projects.stream()
                .flatMap(list-> list.stream())
              .toList();

        System.out.println(all);
    }
}
