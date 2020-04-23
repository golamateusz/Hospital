package data;

public class Patient {
    private String firstName;
    private String lastName;
    private String pesel;

    public Patient(String fistName, String lastName, String pesel) {
        this.firstName = fistName;
        this.lastName = lastName;
        this.pesel = pesel;
    }

    public Patient(){

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String fistName) {
        this.firstName = fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + ", pesel: " + pesel;
    }
}
