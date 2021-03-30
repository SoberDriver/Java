import java.util.Random;
import java.util.Scanner;

public class HomeWorkFour {
    public static char[][] map;
    public static final int SIZE = 3;
    public static final int SIZE_FIVE = 5;
    public static final char DOT_MARK = '*';
    public static final char X_MARK = 'X';
    public static final char O_MARK = 'O';
    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

//  Все методы со словом Five для поля 5Х5.

    public static void main(String[] args) {
    initMap();
    printMap();
//    initMapFive();
//    printMapFive();
    while (true) {
        humanTurn();
        printMap();
        if (winCheckThree_Two(X_MARK)) {
            System.out.println("Поздравляю, Вы победили!");
            break;
        }
        if (noFreeSpace()) {
            System.out.println("Ничья!");
            break;
        }
        compTurn();
        printMap();
//        compTurnFive();
//        printMapFive();
        if (winCheckThree_Two(O_MARK)) {
            System.out.println("Победил Ваш противник!");
            break;
        }
        if (noFreeSpace()) {
            System.out.println("Ничья!");
            break;
        }
    } System.out.println("Game Over!!!");


    }


    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j <SIZE; j++) {
                map[i][j] = DOT_MARK;
            }
        }
    }

    public static void initMapFive() {
        map = new char[SIZE_FIVE][SIZE_FIVE];
        for (int i = 0; i < SIZE_FIVE; i++) {
            for (int j = 0; j < SIZE_FIVE; j++) {
                map[i][j] = DOT_MARK;
            }
        }
    }

    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void printMapFive() {
        for (int i = 0; i <= SIZE_FIVE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE_FIVE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE_FIVE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void humanTurn() {
        int x;
        int y;
        do {
            System.out.println("Введите координаты Х и У:");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!cellCheck(x, y));
        map[y][x] = X_MARK;
    }

    public static void humanTurnFive() {
        int x;
        int y;
        do {
            System.out.println("Введите координаты Х и У:");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!cellCheckFive(x, y));
        map[y][x] = X_MARK;
    }

    public static void compTurn() {
        int x;
        int y;

        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
            // Поле 1 1
            if ((map[0][1] == 'X' && map[0][2] == 'X') || (map[1][0] == 'X' && map[2][0] == 'X') || (map[1][1] == 'X' && map[2][2] == 'X')) {
                x = 0;
                y = 0;
                if (map[y][x] == 'O') {
                    x = random.nextInt(SIZE);
                    y = random.nextInt(SIZE);
                }
            }
            // Поле 2 1
            if ((map[0][0] == 'X' && map[0][2] == 'X') || (map[1][1] == 'X' && map[2][1] == 'X')) {
                x = 1;
                y = 0;
                if (map[y][x] == 'O') {
                    x = random.nextInt(SIZE);
                    y = random.nextInt(SIZE);
                }
            }
            // Поле 3 1
            if ((map[0][0] == 'X' && map[0][1] == 'X') || (map[1][2] == 'X' && map[2][2] == 'X') || (map[1][1] == 'X' && map[2][0] == 'X')) {
                x = 2;
                y = 0;
                if (map[y][x] == 'O') {
                    x = random.nextInt(SIZE);
                    y = random.nextInt(SIZE);
                }
            }
            // Поле 1 2
            if ((map[1][1] == 'X' && map[1][2] == 'X') || (map[0][0] == 'X' && map[2][0] == 'X')) {
                x = 0;
                y = 1;
                if (map[y][x] == 'O') {
                    x = random.nextInt(SIZE);
                    y = random.nextInt(SIZE);
                }
            }
            // Поле 1 3
            if ((map[2][1] == 'X' && map[2][2] == 'X') || (map[1][0] == 'X' && map[2][0] == 'X') || (map[1][1] == 'X' && map[0][2] == 'X')) {
                x = 0;
                y = 2;
                if (map[y][x] == 'O') {
                    x = random.nextInt(SIZE);
                    y = random.nextInt(SIZE);
                }
            }
            // Поле 2 2
            if ((map[0][1] == 'X' && map[2][1] == 'X') || (map[1][0] == 'X' && map[1][2] == 'X') || (map[0][0] == 'X' && map[2][2] == 'X') || (map[0][2] == 'X' && map[2][0] == 'X') ) {
                x = 1;
                y = 1;
                if (map[y][x] == 'O') {
                    x = random.nextInt(SIZE);
                    y = random.nextInt(SIZE);
                }
            }
            // Поле 3 2
            if ((map[0][2] == 'X' && map[2][2] == 'X') || (map[1][1] == 'X' && map[1][0] == 'X')) {
                x = 2;
                y = 1;
                if (map[y][x] == 'O') {
                    x = random.nextInt(SIZE);
                    y = random.nextInt(SIZE);
                }
            }
            // Поле 2 3
            if ((map[0][1] == 'X' && map[1][1] == 'X') || (map[2][0] == 'X' && map[2][2] == 'X')) {
                x = 1;
                y = 2;
                if (map[y][x] == 'O') {
                    x = random.nextInt(SIZE);
                    y = random.nextInt(SIZE);
                }
            }
            // Поле 3 3
            if ((map[0][2] == 'X' && map[1][2] == 'X') || (map[2][1] == 'X' && map[2][0] == 'X') || (map[0][0] == 'X' && map[1][1] == 'X')) {
                x = 2;
                y = 2;
                if (map[y][x] == 'O') {
                    x = random.nextInt(SIZE);
                    y = random.nextInt(SIZE);
                }
            }


        } while (!cellCheck(x, y));
        System.out.println("Ваш противник поставил нолик в точке " + (x + 1) + " " + (y + 1));
        map[y][x] = O_MARK;
    }

    public static void compTurnFive() {
        int x;
        int y;
        do {
            x = random.nextInt(SIZE_FIVE);
            y = random.nextInt(SIZE_FIVE);
        } while (!cellCheckFive(x, y));
        System.out.println("Ваш противник поставил нолик в точке " + (x + 1) + " " + (y + 1));
        map[y][x] = O_MARK;
    }

    public static boolean cellCheck(int x, int y) {
        if ( x < 0 || x >= SIZE || y < 0 || y >= SIZE) {
            return false;
        }
        if (map[y][x] == DOT_MARK) {
            return true;
        }
        return false;
    }

    public static boolean cellCheckFive (int x, int y) {
        if ( x < 0 || x >= SIZE_FIVE || y < 0 || y >= SIZE_FIVE) {
            return false;
        }
        if (map[y][x] == DOT_MARK) {
            return true;
        }
        return false;
    }

    // Первый вариант для проверки поля 3Х3
     public static boolean winCheckThree_One(char win) {
            for (int i = 0; i < SIZE; i++) {
                if ((map[i][0] == win && map[i][1] == win && map[i][2] == win) || (map[0][i] == win && map[1][i] == win && map[2][i] == win)) {
                    return true;
                }
                if ((map[0][0] == win && map[1][1] == win && map[2][2] == win) || (map[2][0] == win && map[1][1] == win && map[0][2] == win)) {
                    return true;
                }
            } return false;
        }

        // Второй вариант проверки для поля 3Х3. Он мне больше нравится :)
    public static boolean winCheckThree_Two(char win) {

        boolean firstDiagonal = true;
        boolean secondDiagonal = true;
        for (int i = 0; i < SIZE; i++) {
            boolean column = true;
            boolean row = true;
            for (int j = 0; j < SIZE; j++) {
                column &= (map[i][j] == win);
                row &= (map[j][i] == win);
            } if (column || row) {
                return true;
            }
        }
        for (int i = 0; i < SIZE; i++) {
                firstDiagonal &= (map[i][i] == win);
                secondDiagonal &= (map[SIZE - i - 1][i] == win);
            } if (firstDiagonal || secondDiagonal) {
                return true;
            }

        return false;
    }


    public static boolean winCheckFive(char win) {
        boolean column, columnOne, columnTwo, columnThree;
        boolean row, rowOne, rowTwo, rowThree;
        boolean firstDiagonal = true;
        boolean firstDiagonalOne = true;
        boolean firstDiagonalTwo = true;
        boolean firstDiagonalThree = true;
        boolean secondDiagonal = true;
        boolean secondDiagonalOne = true;
        boolean secondDiagonalTwo = true;
        boolean secondDiagonalThree = true;
        // проверка столбцов и рядом
        for (int i = 0; i < SIZE_FIVE - 1; i++) {
            column = true;
            columnOne = true;
            columnTwo = true;
            columnThree = true;
            row = true;
            rowOne = true;
            rowTwo = true;
            rowThree = true;
            for (int j = 0; j < SIZE_FIVE - 1; j++) {
                // много условий, чтобы по всему полю можно было в ряд 4 Х поставить и победить. Это проверка столбцов и рядов :)
                column &= (map[i][j + 1] == win);
                columnOne &= (map[i + 1][j] == win);
                columnTwo &= (map[i + 1][j + 1] == win);
                columnThree &= (map[i][j] == win);
                row &= (map[j][i + 1] == win);
                rowOne &= (map[j + 1][i] == win);
                rowTwo &= (map[j + 1][i + 1] == win);
                rowThree &= (map[j][i] == win);

            } if ((column || row) || (columnOne || rowOne) || (columnTwo || rowTwo) || (columnThree || rowThree))  {
                return true;
            }
        }
        for (int i = 0; i < SIZE_FIVE - 1; i++) {
            // Проверка диагоналей.
                firstDiagonal &= (map[i][i] == win);
                firstDiagonalOne &= (map[i + 1][i] == win);
                firstDiagonalTwo &= (map[i][i + 1] == win);
                firstDiagonalThree &= (map[i + 1][i + 1] == win);
                secondDiagonal &= (map[SIZE_FIVE - i - 1][i] == win);
                secondDiagonalOne &= (map[SIZE_FIVE - i - 1][i + 1] == win);
                secondDiagonalTwo &= (map[SIZE_FIVE - i - 2][i] == win);
                secondDiagonalThree &= (map[SIZE_FIVE - i - 2][i + 1] == win);

            } if ((firstDiagonal || secondDiagonal) || (firstDiagonalOne || secondDiagonalOne) || (firstDiagonalTwo || secondDiagonalTwo) || (firstDiagonalThree || secondDiagonalThree)) {
                return true;
            }
        return false;
    }

    public static boolean noFreeSpace() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_MARK) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean noFreeSpaceFive() {
        for (int i = 0; i < SIZE_FIVE; i++) {
            for (int j = 0; j < SIZE_FIVE; j++) {
                if (map[i][j] == DOT_MARK) {
                    return false;
                }
            }
        }
        return true;
    }

    //КОнец класса

}
