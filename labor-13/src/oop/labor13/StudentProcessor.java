package oop.labor13;

import java.io.*;
import java.nio.file.*;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class StudentProcessor {

    public static void processStudentData(String inputFilePath, String warningFilePath) {
        try (Scanner scanner = new Scanner(new File(inputFilePath)); PrintStream ps = new PrintStream(warningFilePath)) {
            while (scanner.hasNextLine()) {

                Path inputPath = Paths.get(inputFilePath);
                Path warningPath = Paths.get(warningFilePath);

                if (!Files.exists(inputPath)) {
                    System.err.println("ERROR: Input file does not exist.");
                    return;
                }

                try (BufferedReader reader = Files.newBufferedReader(inputPath);
                     BufferedWriter writer = Files.newBufferedWriter(warningPath)) {

                    String line;
                    while ((line = reader.readLine()) != null) {
                        line=scanner.nextLine();
                        String[] data = line.split(",");

                        if (data.length < 7) {
                            System.err.println("INCOMPLETE LINE: " + line);
                            continue;
                        }

                        String neptunId = data[0].trim();
                        String firstName = data[1].trim();
                        String lastName = data[2].trim();
                        int credits;
                        int birthYear;
                        int birthMonth;
                        int birthDay;

                        try {
                            credits = Integer.parseInt(data[3].trim());
                            birthYear = Integer.parseInt(data[4].trim());
                            birthMonth = Integer.parseInt(data[5].trim());
                            birthDay = Integer.parseInt(data[6].trim());
                        } catch (NumberFormatException e) {
                            System.err.println("NUMBER FORMAT EXCEPTION: " + line);
                            continue;
                        }

                        try {
                            LocalDate birthDate = LocalDate.of(birthYear, birthMonth, birthDay);
                        } catch (DateTimeException | IllegalArgumentException e) {
                            System.err.println("INVALID DATE: " + line);
                            continue;
                        }

                        if (credits < 30) {
                            writer.write(line);
                            writer.newLine();
                        }
                    }

                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}