import java.util.Random;
import java.util.Scanner;

public class HomeWorkThree {
    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();
    public static void main(String[] args) {
        firstTask();
        secondTask();
    }

    private static void firstTask() {

        int a = 0;
        int r = 0;
        do {
            r = random.nextInt(10);
            System.out.println("Угадайте число от 0 до 9");
            a = scanner.nextInt();

            if ( a == r) {
                System.out.println("Победа!!! Вы угадали!");
                System.out.println("Повторить игру еще раз? 1 - да / 0 - нет");
                int c = scanner.nextInt();
                if ( c == 0) {
                    break;
                }
            }
            if (a != r) {
                System.out.println("Вы не угадали!");
                System.out.println("Повторить игру еще раз? 1 - да / 0 - нет");
                int b = scanner.nextInt();
                if (b == 0) {
                    break;
                }
            }
        } while (a != r || a ==r);
        scanner.close();
    }


       // Метод получился, только без условия, что "ap############# (15 символов, чтобы пользователь не мог узнать длину слова)"
    public static void secondTask() {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        int r = random.nextInt(25);
        String input = "";
        String hastag = "#########";
        System.out.println(words[r]);
        do {
            System.out.println("  " + "Угадайте слово!!");
            input = scanner.nextLine();
            if (input.equals(words[r])) {
                System.out.println("Победа, Вы угадали!!!");
            } else {
                input += hastag;
                for (int i = 0; i < words[r].length(); i++) {
                    if ((input.charAt(i) == words[r].charAt(i))) {
                        System.out.print(words[r].charAt(i));
                    } else {
                        System.out.print('#');
                    }
                }
            }
        }while (!input.equals(words[r]));
    }


}

