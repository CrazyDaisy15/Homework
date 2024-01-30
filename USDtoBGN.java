import java.util.Scanner;
public class USDtoBGN {
    public static void main(String[] Strings) {

        Scanner scan = new Scanner(System.in);
        System.out.print("USD = ");
double USD = Double.parseDouble(scan.nextLine());
double BGN = USD * 1.79549;
        System.out.println("BGN = "+ BGN);
    }
}
