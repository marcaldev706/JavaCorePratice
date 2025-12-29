import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        addingPoints();

    }

    public static void addingPoints() {
        Scanner scanner = new Scanner(System.in);

        try {
        System.out.println("enter quantity: ");
        int quantityEnteringIn = scanner.nextInt();

        List<Double> listingPoints = new ArrayList<>();
        List<String> listingAthletsNames = new ArrayList<>();

        for (int index = 0; index < quantityEnteringIn; index++) {
            System.out.println("Enter the athlet name: :");
            String athletName = scanner.next();
            System.out.println("Enter points: ");
            Double athletPoint = scanner.nextDouble();


            listingAthletsNames.add(athletName);
            listingPoints.add(athletPoint);
        }

        int temporaryVariable = 0;

            do {


                System.out.println("Show information inside lists? (Names[1], Points[2] or Both[3]) ");
                temporaryVariable = scanner.nextInt();


                if (temporaryVariable == 1) {
                    System.out.println("Names: ");
                    listingAthletsNames.stream().forEach(System.out::println);
                } else if (temporaryVariable == 2) {
                    System.out.println("Points:");
                    listingPoints.stream().forEach(System.out::println);
                } else if (temporaryVariable == 3) {
                    System.out.println("Name: ");
                    listingAthletsNames.stream().forEach(System.out::println);
                    System.out.println("Points: ");
                    listingPoints.stream().forEach(System.out::println);
                } else {
                    System.out.println("Invalid Answer");
                }

            } while (temporaryVariable != 1 && temporaryVariable != 2 && temporaryVariable != 3);
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Invalid input, it missmatch's program's especifications!");
        }

    }
}