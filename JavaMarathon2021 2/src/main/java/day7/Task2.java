package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int staminaRandom = random.nextInt(90, 100);

        for (int i = 0; i < 6; i++) {
            Player player = new Player(staminaRandom);
        }

        System.out.println(Player.getCountPlayers());

        Player player = new Player(staminaRandom);
        Player.info();

        System.out.println(Player.getCountPlayers());
    }
}
