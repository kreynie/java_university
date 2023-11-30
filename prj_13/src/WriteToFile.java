import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteToFile {
    public static void writeToFileFromConsole() {
        try {
            FileWriter writer = new FileWriter("output.txt");
            Scanner scanner = new Scanner(System.in);

            System.out.println("Введите информацию для записи в файл:");
            String input = scanner.nextLine();

            writer.write(input);
            writer.close();

            System.out.println("Информация успешно записана в файл.");
        } catch (IOException e) {
            System.err.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }
}
