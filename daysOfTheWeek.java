import java.util.Scanner;
public class daysOfTheWeek {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Изберете число от 1 до 7: ");
            int dayOfWeek = scanner.nextInt();
            switch (dayOfWeek) {
                case 1:
                    System.out.println("The " + dayOfWeek + "st day of the week is Monday");
                    break;
                case 2:
                    System.out.println("The " + dayOfWeek + "nd day of the week is Tuesday");
                    break;
                case 3:
                    System.out.println("The " + dayOfWeek + "rd day of the week is Wednesday");
                    break;
                case 4:
                    System.out.println("The " + dayOfWeek + "th day of the week is Thursday");
                    break;
                case 5:
                    System.out.println("The " + dayOfWeek + "th day of the week is Friday");
                    break;
                case 6:
                    System.out.println("The " + dayOfWeek + "th day of the week is Saturday");
                    break;
                case 7:
                    System.out.println("The " + dayOfWeek + "th day of the week is Sunday");
                    break;

                default:
                    System.out.println("Моля, въведете число от 1 до 7!");
                    scanner.close();
            }
        }
            }