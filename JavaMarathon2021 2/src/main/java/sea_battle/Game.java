package sea_battle;

import java.util.Random;
import java.util.Scanner;

public class Game {
    Player player1;
    Player player2;
    private Scanner scanner = new Scanner(System.in);

    public Game() {
        player1 = new Player();
        player2 = new Player();
    }

    public void startGame() {
        whoseMove();
        shipPlacement();
        game();
    }

    public void game() {
        while (true) {
            if (player2.endGame(player1)) {
                break;
            }

            player1.shots(player2);

            if (player1.endGame(player2)) {
                break;
            }

            player2.shots(player1);
        }
    }

    public void shipPlacement() {
        System.out.println("Расставляет свои корабли " + player1.getName());
        player1.implementsFieldShips();

        System.out.println("Расставляет свои корабли " + player2.getName());
        player2.implementsFieldShips();
    }

    public void whoseMove() {
        System.out.println("Напишите имя первого игрока:");
        String firstName = scanner.nextLine();
        System.out.println("Напишите имя второго игрока:");
        String secondName = scanner.nextLine();
        Random random = new Random();
        int num = random.nextInt(2);

        if (num == 0) {
            player1.setName(firstName);
            player2.setName(secondName);
        } else {
            player1.setName(secondName);
            player2.setName(firstName);
        }
    }

}
