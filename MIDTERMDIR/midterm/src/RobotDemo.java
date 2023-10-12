import java.util.Random;
import java.util.Scanner;

public class RobotDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        Robot[] robots = new Robot[3];

        // Prompt the user to input the ID for each robot and create Robot instances
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter ID for Robot " + (i + 1) + ": ");
            int ID = scanner.nextInt();
            scanner.nextLine();

            robots[i] = new Robot(ID);
        }

        int iterations;

        // Prompt the user to input the number of iterations (0-10)
        do {
            System.out.print("Enter the number of iterations (0-10): ");
            iterations = scanner.nextInt();
        } while (iterations < 0 || iterations > 10);

        for (int iteration = 1; iteration <= iterations; iteration++) {
            System.out.println("Iteration " + iteration + ":");

            for (Robot robot : robots) {
                // Randomly assign a direction to each robot
                String direction = getRandomDirection(random);
                robot.setDirection(direction);
                robot.advance();
                robot.display();
            }
        }


        scanner.close();
    }

    private static String getRandomDirection(Random random) {
        String[] directions = {"North", "East", "West", "South"};
        int randomIndex = random.nextInt(directions.length);
        return directions[randomIndex];
    }
}
