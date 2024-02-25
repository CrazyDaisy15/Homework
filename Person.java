public class Person {
    public final String name;
    public final char gender;
    public final String religion;
    public final String languageSpoken;
    public String job;
    public final String nationality;
    public final String EGN;
    public final int age;
    public final String countryOfResidence;

    public Person(String name, char gender, String religion, String languageSpoken, String job, String nationality,
                  String EGN, String countryOfResidence) throws Exception {

        if (gender != 'M' && != 'F'){
            throw new Exception("Invalid gender provided!");
        }
        if (EGN.length() != 10 || !EGN.matches("\\d+")) {
            throw new Exception("Invalid EGN provided");
        }
        this.name = name;
        this.gender = gender;
        this.religion = religion;
        this.languageSpoken = languageSpoken;
        this.job = job;
        this.nationality = nationality;
        this.EGN = EGN;
        this.age = calculateAge(EGN);
        this.countryOfResidence = countryOfResidence;
    }
public void setJob(String job) {
        this.job = job;
    }
    public void setCountryOfResidence(String countryOfResidence) {

    }
}
