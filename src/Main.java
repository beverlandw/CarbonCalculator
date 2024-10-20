import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean travel;
        int travelmethod;
        float distance;
        int score = 0;
        double carbonemitted;


        System.out.println("CARBON FOOTPRINT CALCULATOR" +
                "\n==========" +
                "\nDid you travel today?");

        travel = scanner.nextBoolean();

        if (travel) {
            while (true) {
                System.out.println("How did you travel?" +
                        "\n1. Foot/Bike" +
                        "\n2. Petrol Car" +
                        "\n3. Electric Car" +
                        "\n4. Train" +
                        "\n5. Bus");

                travelmethod = scanner.nextInt();

                switch (travelmethod) {
                    case 1:
                        System.out.println("Congrats you had no carbon footprint travelling today!");
                        carbonemitted = 0;
                        score = scoreCalculator(carbonemitted);
                        break;

                    case 2:
                        System.out.println("How far did you travel today? (miles)");
                        distance = scanner.nextFloat();
                        carbonemitted = distance * 400; //400g of C02 emitted per mile
                        score = scoreCalculator(carbonemitted);
                        break;

                    case 3:
                        System.out.println("How far did you travel today? (miles)");
                        distance = scanner.nextFloat();
                        carbonemitted = distance * 80; //80g of C02 emitted per mile
                        score = scoreCalculator(carbonemitted);
                        break;

                    case 4:
                        System.out.println("How far did you travel today? (miles)");
                        distance = scanner.nextFloat();
                        carbonemitted = distance * 32.5; //32.5g of C02 emitted per mile
                        score = scoreCalculator(carbonemitted);
                        break;

                    case 5:
                        System.out.println("How far did you travel today? (miles)");
                        distance = scanner.nextFloat();
                        carbonemitted = distance * 176; //176g of C02 emitted per mile
                        score = scoreCalculator(carbonemitted);
                        break;

                    default:
                        System.out.println("Error, invalid input. Please choose a valid option.");
                        continue;
                }
                System.out.println(score +"/5");
                break;
            }
        } else {
            System.out.println("User didn't travel today.");
        }


    }
    public static int scoreCalculator(double carbonemitted) {
        // Average co2 a day is ~28,000
        if (carbonemitted <= 5600) {
            return 5;
        } else if (carbonemitted > 5600 && carbonemitted <=11200){
            return 4;
        } else if (carbonemitted > 11200 && carbonemitted <=16800) {
            return 3;
        } else if (carbonemitted > 16800 && carbonemitted <=28000) {
            return 2;
        } else {
            return 1;
        }
    }
}