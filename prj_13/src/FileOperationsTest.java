import java.util.Scanner;

public class FileOperationsTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Задание 1: Запись в файл введенной с клавиатуры информации
        WriteToFile writeToFile = new WriteToFile();
        System.out.println("Задание 1: Запись в файл");
        writeToFile.writeToFileFromConsole();

        // Задание 2: Вывод информации из файла на экран
        ReadFromFile readFromFile = new ReadFromFile();
        System.out.println("\nЗадание 2: Чтение из файла");
        readFromFile.readFromFileAndPrint();

        // Задание 3: Замена информации в файле на информацию, введенную с клавиатуры
        ReplaceInFile replaceInFile = new ReplaceInFile();
        System.out.println("\nЗадание 3: Замена информации в файле");
        replaceInFile.replaceInFileFromConsole();

        // Задание 4: Добавление в конец исходного файла текста, введенного с клавиатуры
        AppendToFile appendToFile = new AppendToFile();
        System.out.println("\nЗадание 4: Добавление в файл");
        appendToFile.appendToFileFromConsole();
    }
}
