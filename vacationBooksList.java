import java.util.Scanner;
public class vacationBooksList {
    public static void main(String[] Strings) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Pages = ");
        int pages = Integer.parseInt(scan.nextLine());
        System.out.print("Pages per hour = ");
        int pagesPerHour = Integer.parseInt(scan.nextLine());
        System.out.print("Days = ");
        int days = Integer.parseInt(scan.nextLine());

        int hoursPerDay = (pages / pagesPerHour) / days;

        System.out.println("Hours Per Days = "+ hoursPerDay);

    }
}
