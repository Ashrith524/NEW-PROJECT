import java.nio.file.*;
import java.util.*;
import java.util.stream.*;

public class Programming {
    public static void main(String[] args) throws Exception {
        Files.lines(Paths.get("src/logs.txt"))
                .collect(Collectors.groupingBy(
                        line -> line.substring(1, 11),
                        LinkedHashMap::new,
                        Collectors.toList()
                ))
                .forEach((date, logs) -> {
                    System.out.println("Date: " + date);
                    logs.forEach(log -> System.out.println("  " + log));
                    System.out.println();
                });
    }
}
