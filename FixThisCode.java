import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class FixThisCode {
    private static FileWriter getFileWriter(String filePath) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(filePath, true);
        } catch (IOException e) { //ако append е false - извиква грешка
            throw new RuntimeException(e); //НО продължава да изпълнява кода надолу
        }
        return fileWriter; //ако е true, връща/отваря fileWriter
    }
    protected static void closeFileWriter(FileWriter fileWriter) throws IOException {
        fileWriter.close();
    }
    public static void printToFile(FileWriter fileWriter, String text, int repeat) throws IOException {
        for (int i = 0; i < repeat; i++) {
            fileWriter.write(text + "\n"); //hello 5 - изписва 5 пъти hello
            closeFileWriter(fileWriter);
        }
    }
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String filePath = scanner.nextLine();
        int howManyTimesToPrintTheTextToFile = scanner.nextInt();
        String textToAdd = scanner.nextLine();
        printToFile(getFileWriter(filePath), textToAdd, howManyTimesToPrintTheTextToFile);
        //3 аргумента - първото създава, после добавя текст, накрая колко пъти ще се принтира текста във файла
    }
}