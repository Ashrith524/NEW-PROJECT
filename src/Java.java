
import java.nio.file.*;
import java.util.Comparator;

public class Java {
    public static void main(String[] args) throws Exception {
        String a = Files.lines(Paths.get("src/logs.txt"))
                .max(Comparator.comparing(line -> line.substring(1, 20)))
                .orElse("No logs found");

        System.out.println("Most recent log entry: " + a);
    }
}

