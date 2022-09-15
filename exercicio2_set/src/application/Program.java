package application;

import entities.LogEntry;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Set<LogEntry> logEntrySet = new HashSet<>();

        System.out.print("Enter file full path: ");
        String path = input.nextLine();

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String log = bufferedReader.readLine();
            while (log != null) {
                String[] logData = log.split(" ");
                String username = logData[0];
                Date moment = Date.from(Instant.parse(logData[1]));
                LogEntry logEntry = new LogEntry(username, moment);
                logEntrySet.add(logEntry);
                log = bufferedReader.readLine();
            }

            System.out.print("Total users: ");
            System.out.print(logEntrySet.size());
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        input.close();
    }
}
