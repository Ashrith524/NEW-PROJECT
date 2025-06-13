
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
import java.nio.file.NoSuchFileException;

public class Ashrith{
    public static void main(String[] args) {
        try {
            long errorCount = Files.lines(Paths.get("src/logs.txt"))
                    .filter(line -> line.contains("ERROR"))
                    .count();

            System.out.println("Number of ERROR logs: " + errorCount);
        } catch (NoSuchFileException e) {
            System.out.println("The file 'logs.txt' was not found.");
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}

