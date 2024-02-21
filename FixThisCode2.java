import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class FixThisCode2 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the filename: ");
        String filePath = scanner.nextLine();
        System.out.print("Enter the text to be written in the file: ");
        String textToAdd = scanner.nextLine();
        System.out.print("How many times to repeat the text: ");
        int timesRepeated = scanner.nextInt();
        printToFile(getFileWriter(filePath), textToAdd, timesRepeated);
    }

    // Create new FileWriter which open any file to read it or to write something in the file
    private static FileWriter getFileWriter(String filePath) {
        try {
            FileWriter fileWriter = new FileWriter(filePath, true);
            return fileWriter;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // Write any string n-times in the files. Accepts three arguments:
    // 1st -> fileWriter itself
    // 2nd -> the string that it will be written in the file
    // 3rd -> how many times the string will be repeated
    public static void printToFile(FileWriter fileWriter, String text, int repeat) throws IOException {
        for (int i = 0; i < repeat; i++) {
            fileWriter.write(text + "\n");
        }
        closeFileWriter(fileWriter);
    }

    // Closes the FileWrite (obligatory!!!)
    protected static void closeFileWriter(FileWriter fileWriter) throws IOException{
        fileWriter.close();
    }
}
