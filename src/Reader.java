
import OfficialPart.*;
import TransportationPart.Driver;
import TransportationPart.Route;

import java.io.IOException;
import java.nio.file.Path;
import java.util.*;

public class Reader {
    static Scanner scanner;

    public static Calendar readDate() {
        scanner = new Scanner(System.in);
        int day;
        do {
            System.out.print("  ->Enter the day: ");
            day = scanner.nextInt();
        } while (day > 30 || day < 1);

        int month;
        do {
            System.out.print("  ->Enter the month: ");
            month = scanner.nextInt();
        } while (month > 12 || month < 1);

        System.out.print("  ->Enter the year: ");
        int year = scanner.nextInt();

        return new GregorianCalendar(year, month, day);
    }

    public static List<Branch> readBranches() {
        List<Branch> branches = new LinkedList<>();
        try {
            scanner = new Scanner(Path.of("src\\InputFiles\\Branches.in"));
            while (scanner.hasNextLine()) {
                branches.add(new Branch(scanner.next(), scanner.next(), scanner.next(), scanner.next()));
            }
            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return branches;
    }

    public static List<Client> readClients() {
        List<Client> clients = new LinkedList<>();
        try {
            scanner = new Scanner(Path.of("src\\InputFiles\\Clients.in"));
            while (scanner.hasNextLine()) {
                clients.add(new Client(scanner.next(), scanner.next(), scanner.next()));
            }
            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return clients;
    }

    public static List<Driver> readDrivers() {
        List<Driver> drivers = new LinkedList<>();
        try {
            scanner = new Scanner(Path.of("src\\InputFiles\\Drivers.in"));
            while (scanner.hasNextLine()) {
                drivers.add(new Driver(scanner.next(), scanner.next(), scanner.nextInt(), scanner.next()));
            }
            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return drivers;
    }

    public static List<Route> readRoutes() {
        List<Route> routes = new LinkedList<>();
        try {
            scanner = new Scanner(Path.of("src\\InputFiles\\Routes.in"));
            while (scanner.hasNextLine()) {
                routes.add(new Route(scanner.next(), scanner.nextInt()));
            }
            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return routes;
    }
}