import java.time.LocalDate;
import java.time.Period;
public class calculateAge {
    public static void main(String[] args) {
        String EGN = "XXXXXXYYYY";
        int age = calculateAge(EGN);
    }
    public static int calculateAge(String EGN) {
        int year = Integer.parseInt(EGN.substring(0, 2));
        int month = Integer.parseInt(EGN.substring(2, 4));
        int day = Integer.parseInt(EGN.substring(4, 6));

        if (month > 20) {
            year += 2000;
            month -= 20;
        } else {
            year += 1900;
        }
        LocalDate birthDate = LocalDate.of(year, month, day);
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(birthDate, currentDate);

        return period.getYears();
    }
}
