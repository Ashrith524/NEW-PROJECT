import java.nio.file.*;
        import java.util.*;
        import java.util.stream.*;

public class Sails {
    public static void main(String[] args) throws Exception {

        Map<String, Long> logLevelCounts = Files.lines(Paths.get("src/logs.txt"))
                .map(line -> line.split("]")[1].trim())
                .map(level -> level.replace("[", "").replace("]", ""))
                .collect(Collectors.groupingBy(level -> level, Collectors.counting()));

        logLevelCounts.forEach((level, count) ->
                System.out.println(level + ": " + count)
        );
    }
}
