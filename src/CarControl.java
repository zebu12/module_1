import java.util.Scanner;

public class CarControl {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean isEngineOn = false;
        String gear = "P";
        int speed = 0;
        int choice = 0;
        /// ///////////////////////////////////////////////////////////////////////////////////////

        while (choice != 5) {
            System.out.println("---------------- Car Dashboard ------------");
            System.out.println("Speed: " + speed);
            System.out.println("Engine On: " + isEngineOn);
            System.out.println("Gear: " + gear);
            System.out.println("--------------- Car Dashboard -------------");
            System.out.println();
            System.out.println("Menu: ");
            System.out.println("1. Turn on/off the engine");
            System.out.println("2. Change gear (P, D, R)");
            System.out.println("3. Accelerate");
            System.out.println("4. Brake");
            System.out.println("5. Exit");

            System.out.println("Enter your choice: ");
            choice = sc.nextInt();

            /// //////////////////////////////////////////////////////////////////////////////////

            switch (choice) {
                case 1:
                    System.out.println("Turn on/off the engine");
                    isEngineOn = true;
                    break;
                case 2:
                    System.out.println("Change gear (P, D, R)");
                    gear = sc.next();
                    break;
                case 3:
                    System.out.println("Accelerate");
                    if (isEngineOn && !gear.equals("P")) {
                        speed += 10;
                    } else {
                        System.out.println("Cannot accelerate while the engine is off or or in park (P) gear.");
                    }
                    break;
                case 4:
                    System.out.println("Brake");
                    if (isEngineOn && speed > 0) {
                        speed -= 10;
                    } else {
                        System.out.println("Cannot apply braking while the engine is off or or car not moving");
                    }
                    break;
                case 5:
                    System.out.println("Turning off engine and exiting the car . Good bye!");
                    isEngineOn = false;
                    break;
                default:
                    System.out.println("Invalid choice");


            }
        }
        sc.close();
    }
}
