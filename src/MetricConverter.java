import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double meter = 0;
        double miles;
        double inches;
        double feet;
        final double METERS_TO_MILES = 0.00062137;
        final double METERS_TO_FEET = 3.28084;
        final double METERS_TO_INCHES = 39.37008;
        boolean valid = false;

        do {
            System.out.println("Enter a Measurement (In Meters)");
            if (scan.hasNextDouble()) {
                meter = scan.nextDouble();
                if (meter > 0) {
                    valid = true;
                }
                else {
                    scan.nextLine();
                    System.out.println("Invalid value for meters");
                    System.out.println();
                }
            }
            else {
                scan.nextLine();
                System.out.println("Invalid Data type");
                System.out.println();
            }

        } while (!valid);

        miles = meter*METERS_TO_MILES;
        inches = meter*METERS_TO_INCHES;
        feet = meter*METERS_TO_FEET;

        System.out.printf("Meters: %8.2f", meter);
        System.out.printf("\nMiles: %8.2f", miles);
        System.out.printf("\nFeet: %10.2f", feet);
        System.out.printf("\nInches: %9.2f", inches);
    }
}