package sea_battle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Player {
    private String name;
    private String[][] fieldShips;
    private String[][] fieldShots;
    private List<Ship> ships;
    private Scanner scanner = new Scanner(System.in);
    private static final int FIELD_WIDTH = 11;
    private static final int FIELD_HEIGHT = 11;
    private static final String EMPTY = "⬜";
    private static final String SHIP = "🛥";
    private static final String HALO = "🟦";
    private static final String HIT = "❌";
    private static final String MISSED = "🟥";
    private static final int FOUR_DECK_SHIP = 4;
    private static final int THREE_DECK_SHIP = 3;
    private static final int TWO_DECK_SHIP = 2;
    private static final int ONE_DECK_SHIP = 1;
    private static final String ZERO = "0️⃣";
    private static final String ONE = "1️⃣";
    private static final String TWO = "2️⃣";
    private static final String THREE = "3️⃣";
    private static final String FOUR = "4️⃣";
    private static final String FIVE = "5️⃣";
    private static final String SIX = "6️⃣";
    private static final String SEVEN = "7️⃣";
    private static final String EIGHT = "8️⃣";
    private static final String NINE = "9️⃣";
    private static final String NUM = "🔢";

    public Player() {
        fieldShips = new String[FIELD_HEIGHT][FIELD_WIDTH];
        fieldShots = new String[FIELD_HEIGHT][FIELD_WIDTH];
        implementsBattleShips(fieldShips);
        implementsBattleShips(fieldShots);
        ships = new ArrayList<>();
    }

    public void shots(Player player) {
        while (true) {
            System.out.println("Стреляет игрок с именем " + name);
            System.out.println("Введите координаты выстрела(формат: x,y):");
            String[] coordShot = scanner.nextLine().replaceAll(" ", "").split(",");

            if (coordShot.length != 2) {
                System.out.println("Неверный формат координат, попробуйте еще раз");
                shots(player);
            }

            int x = Integer.parseInt(coordShot[0]) + 1;
            int y = Integer.parseInt(coordShot[1]) + 1;

            if (x < 0 || x > 10 || y < 0 || y > 10) {
                System.out.println("Координаты вне поля, попробуйте еще раз");
                shots(player);
            }

            if (player.fieldShips[x][y].equals(SHIP)) {
                System.out.println("Попал, стреляйте еще раз");
                player.fieldShips[x][y] = HIT;
                fieldShots[x][y] = HIT;
                System.out.println("Поле кораблей игрока " + name);
                printField(fieldShips);
                System.out.println();
                System.out.println("Поле выстрелов игрока " + name);
                printField(fieldShots);
            } else if (player.fieldShips[x][y].equals(HIT)) {
                System.out.println("Вы уже сюда стреляли, повторите ввод");
            } else {
                System.out.println("Мимо, ход переходит другому игроку");
                player.fieldShips[x][y] = MISSED;
                fieldShots[x][y] = MISSED;
                System.out.println("Поле кораблей игрока " + player.name);
                printField(player.fieldShips);
                System.out.println("Поле выстрелов игрока " + player.name);
                printField(player.fieldShots);
                break;
            }

            if (endGame(player)) {
                System.out.println("Поле выстрелов игрока " + name);
                printField(fieldShots);
                System.out.println("Поле кораблей игрока " + player.name);
                printField(player.fieldShips);
                break;
            }
        }
    }

    public boolean endGame(Player player) {
        for (int col = 0; col < fieldShips.length; col++) {
            for (int row = 0; row < fieldShips.length; row++) {
                if (player.fieldShips[col][row].equals(SHIP)) {
                    return false;
                }
            }
        }

        System.out.println("Выиграл игрок " + name);
        return true;
    }

    public void implementsFieldShips() {
        System.out.println("Постройте четырех-палубный корабль(формат координат: x,y;x,y;x,y;x,y)");
        createShip(FOUR_DECK_SHIP);
        System.out.println("Постройте первый трех-палубный корабль(формат координат: x,y;x,y;x,y)");
        createShip(THREE_DECK_SHIP);
        System.out.println("Постройте второй трех-палубный корабль(формат координат: x,y;x,y;x,y)");
        createShip(THREE_DECK_SHIP);
        System.out.println("Постройте первый двух-палубный корабль(формат координат: x,y;x,y)");
        createShip(TWO_DECK_SHIP);
        System.out.println("Постройте второй двух-палубный корабль(формат координат: x,y;x,y)");
        createShip(TWO_DECK_SHIP);
        System.out.println("Постройте третий двух-палубный корабль(формат координат: x,y;x,y)");
        createShip(TWO_DECK_SHIP);
        System.out.println("Постройте первый одно-палубный корабль(формат координат: x,y)");
        createShip(ONE_DECK_SHIP);
        System.out.println("Постройте второй одно-палубный корабль(формат координат: x,y)");
        createShip(ONE_DECK_SHIP);
        System.out.println("Постройте третий одно-палубный корабль(формат координат: x,y)");
        createShip(ONE_DECK_SHIP);
        System.out.println("Постройте четвертый одно-палубный корабль(формат координат: x,y)");
        createShip(ONE_DECK_SHIP);
    }

    public void createHalo(List<int[]> shipCoordinates) {
        for (int[] coord : shipCoordinates) {
            int x = coord[0];
            int y = coord[1];

            for (int j = x - 1; j <= x + 1; j++) {
                if (j < 0 || j > 10) {
                    continue;
                }

                for (int k = y - 1; k <= y + 1; k++) {
                    if (k < 0 || k > 10) {
                        continue;
                    }

                    if (!fieldShips[j][k].equals(EMPTY)) continue;

                    if (fieldShips[j][k].equals(SHIP)) continue;
                    fieldShips[j][k] = HALO;
                }
            }
        }

    }

    public void deleteShip(List<int[]> shipCoordinates) {
        for (int[] coord : shipCoordinates) {
            fieldShips[coord[0]][coord[1]] = EMPTY;
        }
    }

    public boolean isCorrectPosition(List<int[]> shipCoordinates) {
        List<Integer> numX = new ArrayList<>();
        List<Integer> numY = new ArrayList<>();

        for (int[] coord : shipCoordinates) {
            numX.add(coord[0]);
            numY.add(coord[1]);
        }

        boolean isEqualX = false;
        boolean isEqualY = false;

        for (int i = 0; i < numX.size(); i++) {
            if (!numX.get(i).equals(numX.get(0))) {
                isEqualX = true;
                break;
            }
        }

        for (int i = 0; i < numY.size(); i++) {
            if (!numY.get(i).equals(numY.get(0))) {
                isEqualY = true;
                break;
            }
        }

        if (!isEqualY || !isEqualX) {
            return true;
        }

        return false;
    }

    public void createShip(int value) {
        List<int[]> shipCoordinates = new ArrayList<>();
        while (true) {
            printField(fieldShips);
            System.out.println("Введите координаты:");
            String[] line = scanner.nextLine().replaceAll(" ", "").split(";");

            if (line.length != value) {
                System.out.println("Неправильное количество координат, попробуйте еще раз");
                continue;
            }

            boolean error = false;

            for (int i = 0; i < line.length; i++) {
                String[] coordinates = line[i].split(",");

                if (coordinates.length != 2) {
                    System.out.println("Неверный формат координат, попробуйте еще раз");
                    error = true;
                    break;
                }

                int x = Integer.parseInt(coordinates[0]) + 1;
                int y = Integer.parseInt(coordinates[1]) + 1;

                if (x < 0 || x > 10 || y < 0 || y > 10) {
                    System.out.println("Координаты вне поля, попробуйте еще раз");
                    error = true;
                    break;
                }

                shipCoordinates.add(new int[]{x,y});
            }

            if (!isCorrectPosition(shipCoordinates)) {
                System.out.println("Корабль должен располагаться строго по вертикали или по горизонтали, повторите ввод");
                error = true;
            }

            if (error) {
                shipCoordinates.clear();
                continue;
            }

            boolean isBusy = false;

            for (int[] xy : shipCoordinates) {
                int x = xy[0];
                int y = xy[1];

                if (fieldShips[x][y].equals(SHIP)) {

                    System.out.println("Это место уже занято другим кораблем, повторите ввод");
                    isBusy = true;
                    break;
                } else if (fieldShips[x][y].equals(HALO)) {
                    System.out.println("Корабли не должны касаться друг друга(вокруг каждого корабля есть синий ореол)");
                    isBusy = true;
                    break;
                } else {
                    fieldShips[x][y] = SHIP;
                }
            }

            if (isBusy) {
                deleteShip(shipCoordinates);
                shipCoordinates.clear();
                continue;
            }

            ships.add(new Ship(shipCoordinates));
            createHalo(shipCoordinates);
            printField(fieldShips);
            break;
        }

    }

    public void fieldNumberHeight(String[][] field) {
        field[1][0] = ZERO;
        field[2][0] = ONE;
        field[3][0] = TWO;
        field[4][0] = THREE;
        field[5][0] = FOUR;
        field[6][0] = FIVE;
        field[7][0] = SIX;
        field[8][0] = SEVEN;
        field[9][0] = EIGHT;
        field[10][0] = NINE;
    }

    public void fieldNumberWidth(String[][] field) {
        field[0][0] = NUM;
        field[0][1] = ZERO;
        field[0][2] = ONE;
        field[0][3] = TWO;
        field[0][4] = THREE;
        field[0][5] = FOUR;
        field[0][6] = FIVE;
        field[0][7] = SIX;
        field[0][8] = SEVEN;
        field[0][9] = EIGHT;
        field[0][10] = NINE;
    }

    public void implementsBattleShips(String[][] field) {
        fieldNumberHeight(field);
        fieldNumberWidth(field);

        for (int col = 1; col < field.length; col++) {
            for (int row = 1; row < field.length; row++) {
                field[col][row] = EMPTY;
            }
        }
    }

    public void printField(String[][] field) {
        for (int col = 0; col < field.length; col++) {
            for (int row = 0; row < field.length; row++) {
                System.out.print(field[col][row]);
            }
            System.out.println();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
