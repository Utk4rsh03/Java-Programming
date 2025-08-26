import java.util.Random;
import java.util.Scanner;

public class Rockpapercissors {
    public static final String ROCK = "rock";
    public static final String PAPER = "paper";
    public static final String SCISSORS = "scissors";

    public static String getComputerChoice() {
        String[] choices = {ROCK, PAPER, SCISSORS};
        Random rand = new Random();
        return choices[rand.nextInt(3)];
    }

    public static String findWinner(String userChoice, String computerChoice) {
        if (userChoice.equals(computerChoice)) {
            return "Draw";
        }
        switch (userChoice) {
            case ROCK:
                return (computerChoice.equals(SCISSORS)) ? "User" : "Computer";
            case PAPER:
                return (computerChoice.equals(ROCK)) ? "User" : "Computer";
            case SCISSORS:
                return (computerChoice.equals(PAPER)) ? "User" : "Computer";
            default:
                return "Invalid";
        }
    }

    public static String[][] calculateStats(int userWins, int compWins, int draws, int totalGames) {
        double userWinPercent = totalGames == 0 ? 0 : ((double) userWins / totalGames) * 100;
        double compWinPercent = totalGames == 0 ? 0 : ((double) compWins / totalGames) * 100;
        double drawPercent = totalGames == 0 ? 0 : ((double) draws / totalGames) * 100;

        return new String[][]{
            {"User Wins", String.valueOf(userWins), String.format("%.2f%%", userWinPercent)},
            {"Computer Wins", String.valueOf(compWins), String.format("%.2f%%", compWinPercent)},
            {"Draws", String.valueOf(draws), String.format("%.2f%%", drawPercent)}
        };
    }

    public static void displayResults(String[][] gameResults, String[][] stats) {
        System.out.println("\n--- Game Results ---");
        System.out.println("+------+------------+------------+----------+");
        System.out.println("| Game | User Choice| Comp Choice|  Winner  |");
        System.out.println("+------+------------+------------+----------+");
        for (int i = 0; i < gameResults.length; i++) {
            System.out.printf("| %-4d | %-10s | %-10s | %-8s |\n",
                    i + 1, gameResults[i][0], gameResults[i][1], gameResults[i][2]);
        }
        System.out.println("+------+------------+------------+----------+");

        System.out.println("\n--- Summary Stats ---");
        System.out.println("+---------------+-------+------------+");
        System.out.println("| Outcome       | Count | Percentage |");
        System.out.println("+---------------+-------+------------+");
        for (String[] stat : stats) {
            System.out.printf("| %-13s | %-5s | %-10s |\n", stat[0], stat[1], stat[2]);
        }
        System.out.println("+---------------+-------+------------+");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of games to play: ");
        int numGames = scanner.nextInt();
        scanner.nextLine(); // consume newline

        String[][] gameResults = new String[numGames][3];
        int userWins = 0, compWins = 0, draws = 0;

        for (int i = 0; i < numGames; i++) {
            System.out.printf("Game %d - Enter your choice (rock/paper/scissors): ", i + 1);
            String userChoice = scanner.nextLine().trim().toLowerCase();

            if (!userChoice.equals(ROCK) && !userChoice.equals(PAPER) && !userChoice.equals(SCISSORS)) {
                System.out.println("❌ Invalid choice. Please enter rock, paper, or scissors.");
                i--; // repeat this round
                continue;
            }

            String computerChoice = getComputerChoice();
            String winner = findWinner(userChoice, computerChoice);

            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) compWins++;
            else draws++;

            gameResults[i][0] = userChoice;
            gameResults[i][1] = computerChoice;
            gameResults[i][2] = winner;
        }

        String[][] stats = calculateStats(userWins, compWins, draws, numGames);
        displayResults(gameResults, stats);

        scanner.close();
    }
}
