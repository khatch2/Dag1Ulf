import java.util.Random;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
         /* exempelkkod under lekstugan
        int i = input.nextInt();
        input.nextLine();
        String s = input.nextLine();
        System.out.println("Hello world!" + i + "***" + s.toUpperCase() + "***");

        if (i < 14) {
            System.out.println("i är litet");
        } else {
            System.out.println("i är lite större");
        }

        if (s.equals("Ulf")) {
            System.out.println("LIKA!");
        }


         */
        Random random = new Random();
        int secret = random.nextInt(1,11);

        while (true) {
            System.out.println("Välj i meny:");
            System.out.println("1. Gissa tal");
            System.out.println("2. Fuska");
            System.out.println("3. Generera nytt tal");
            System.out.println("4. Avsluta");
            int choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Gissning: ");
                    int guess = input.nextInt();
                    input.nextLine();
                    if (guess < secret) {
                        System.out.println("Too small");
                    } else if (guess > secret) {
                        System.out.println("Too large");
                    } else {
                        System.out.println("Yess!!");
                    }
                    break;
                case 2:
                    System.out.println("Number is " + secret);
                    break;
                case 3:
                    System.out.println("New number generated");
                    secret = random.nextInt(1,11);
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Illegal command");

            }

        }


    }
}