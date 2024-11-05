package service.serviceImpl;

import database.Database;
import enums.Gender;
import models.Library;
import models.Reader;
import service.ReaderService;

import java.util.Scanner;

public class ReaderServiceImpl implements ReaderService {
    @Override
    public String register() {
        Reader reader = new Reader();
        try {
            System.out.println("Please write id: ");
            reader.setId(new Scanner(System.in).nextLong());
            System.out.println("Please write name: ");
            reader.setName(new Scanner(System.in).nextLine());
            System.out.println("Please write gender (Female/Male): ");
            String gender = new Scanner(System.in).nextLine();
            if (gender.equalsIgnoreCase("FEMALE")) {
                reader.setGender(Gender.FEMALE);
            } else if (gender.equalsIgnoreCase("MALE")) {
                reader.setGender(Gender.MAlE);
            } else {
                throw new IllegalArgumentException("Please choose Male or Female");
            }
            System.out.println("Please write phoneNumber: ");
            String phoneNumber = new Scanner(System.in).nextLine();
            if (phoneNumber.matches("\\+996\\d{9}")) {
                reader.setPhoneNumber(phoneNumber);
            } else {
                throw new IllegalArgumentException("Incorrect phone number");
            }
            System.out.println("Please write email: ");
            String email = new Scanner(System.in).nextLine();
            if (!email.contains("@")) {
                throw new IllegalArgumentException("Email must contains '@'");
            } else {
                reader.setEmail(email);
            }
            System.out.println("Please write password: ");
            reader.setPassword(new Scanner(System.in).nextLine());

            for (Library library : Database.libraries) {
                library.addReader(reader);
            }
            return "Successfully registration!!";
        } catch (IllegalArgumentException e) {
            return "Registration failed : " + e.getMessage();
        }

    }

    @Override
    public String login() {
        try {
            System.out.println("Write email: ");
            String email = new Scanner(System.in).nextLine();
            System.out.println("Write password: ");
            String password = new Scanner(System.in).nextLine();
            for (Library library : Database.libraries) {
                for (Reader reader : library.getReaders()) {
                    if (reader.getEmail().equals(email) && reader.getPassword().equals(password)) {
                        return "Successfully!";
                    } else {
                        throw new IllegalArgumentException("incorrect login or password");
                    }
                }

            }
        }catch (IllegalArgumentException e){
            return "Login failed" + e.getMessage();
        }
        return "User not found!";
    }
}
