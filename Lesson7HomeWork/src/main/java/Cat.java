import java.util.Scanner;

public class Cat  {
    private String name;
    private int appetite;
    private boolean bellyful;
    Scanner scanner = new Scanner(System.in);

    public Cat(String name, int appetite, boolean bellyful) {
        this.name = name;
        this.appetite = appetite;
        this.bellyful = bellyful;
    }

    public void eat (Plate plate) {
        if (bellyful) {
            System.out.println(name + " - сыт.");
        } else if (appetite > plate.getFood()) {
            System.out.println("В тарелке мало еды!!!");
            System.out.println(name + " не поел!!!");
//            Для добавления еды в тарелку
            System.out.println("Вы хотите добавить еды??? 1 - Да / 2 - Нет");
            moreFood(plate);
            // дополнительное условие, чтобы котик поел после добавления еды
            if (appetite < plate.getFood()) {
                plate.decreaseFood(appetite);
                System.out.println(name + " поел из тарелки.");
                bellyful = true;
            }
        } else {
            plate.decreaseFood(appetite);
            System.out.println(name + " поел из тарелки.");
            bellyful = true;
        }
    }

    //Метод добавления еды в тарелку
    public void moreFood (Plate plate) {
        byte a = scanner.nextByte();
        if (a == 1) {
            System.out.println("Введите число кусочков, которое Вы хотите добавить: ");
            int b = scanner.nextInt();
            plate.setFood(b);
        }
    }

    public boolean isBellyful() {
        return bellyful;
    }

    public String getCatName() {
        return name;
    }
}
