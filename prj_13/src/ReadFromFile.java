import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFromFile {
    public static void readFromFileAndPrint() {
        try {
            FileReader reader = new FileReader("output.txt");
            Scanner scanner = new Scanner(reader);

            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }

            reader.close();
        } catch (IOException e) {
            System.err.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }
}
