import java.util.Scanner;

public class HomeWorkThree {
    public static void main(String[] args) {
        scannerMethod();
    }

    private static void scannerMethod() {
        Scanner x = new Scanner(System.in);
        int a;
        do {
            System.out.println("Введи число от 1 до 10");
            a = x.nextInt();
        }
        while (a > 10 || a < 1);
        System.out.println(" Да красава " + a);
        x.close();
    }


}

