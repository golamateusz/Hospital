package app;

import data.Patient;
import logic.Hospital;

import java.util.Scanner;

public class HospitalApp {
    public static void main(String[] args) {

        final int exit = 0;
        final int addPatient = 1;
        final int printPatients = 2;
        System.out.println("Witaj w aplikacji szpitala.");

        Hospital hospital = new Hospital();

        Scanner scanner = new Scanner(System.in);
        int userInput = -1;

        while(userInput != exit){

            System.out.println("Dostępne opcje: ");
            System.out.println(exit + " - wyjdź z programu");
            System.out.println(addPatient + " - dodaj pacjenta");
            System.out.println(printPatients + " - wyświetl wszystkich pacjentów");
            userInput = scanner.nextInt();
            scanner.nextLine();

            switch (userInput) {
                case exit:
                    System.out.println("Zamykanie programu...");
                    break;

                case addPatient:
                    Patient patient = new Patient();
                    System.out.println("Podaj imię pacjenta: ");
                    patient.setFirstName(scanner.nextLine());

                    System.out.println("Podaj nazwisko pacjenta: ");
                    patient.setLastName(scanner.nextLine());

                    System.out.println("Podaj pesel pacjenta: ");
                    patient.setPesel(scanner.nextLine());

                    //Ewentualnie sprawdzanie, czy pacjent jest na liście ;)

                    hospital.addPatient(patient);
                    break;

                case printPatients:
                    hospital.printPatients();
                    break;

                default:
                    System.out.println("Nieprawidłowa opcja!");
            }
        }

        scanner.close();
    }
}
