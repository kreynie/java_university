import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AppendToFile {
    public static void appendToFileFromConsole() {
        try {
            FileWriter writer = new FileWriter("output.txt", true);
            Scanner scanner = new Scanner(System.in);

            System.out.println("Введите текст для добавления в файл:");
            String input = scanner.nextLine();

            writer.write("\n" + input);  // Добавляем новую строку перед введенным текстом
            writer.close();

            System.out.println("Текст успешно добавлен в файл.");
        } catch (IOException e) {
            System.err.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }
}
