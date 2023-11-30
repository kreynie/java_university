import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReplaceInFile {
    public static void replaceInFileFromConsole() {
        try {
            FileWriter writer = new FileWriter("output.txt");
            Scanner scanner = new Scanner(System.in);

            System.out.println("Введите новую информацию для замены в файле:");
            String input = scanner.nextLine();

            writer.write(input);
            writer.close();

            System.out.println("Информация успешно заменена в файле.");
        } catch (IOException e) {
            System.err.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }
}
