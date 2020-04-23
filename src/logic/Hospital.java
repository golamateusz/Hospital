package logic;

import data.Patient;

import java.util.ArrayList;

public class Hospital {

    private ArrayList<Patient> patients = new ArrayList<>();

    public void addPatient(Patient patient) {

        if (patients.size() == 10) {
            System.out.println("Lista pacjentów osiągnęła maksymalną liczbę, spróbuj ponownie później!");
            return;
        }

        patients.add(patient);
        System.out.println("Dodano pacjenta: " + patient.toString());
    }

    public void printPatients() {
        if (patients.isEmpty())
            System.out.println("Lista pacjentów jest pusta ");
        else {
            System.out.println("Lista pacjentów: ");
            int i = 1;
            for (Patient p : patients) {
                System.out.println(i + ". " + p.toString());
                i++;
            }
        }
    }
}
