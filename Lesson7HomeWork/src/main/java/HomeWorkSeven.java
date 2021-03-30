public class HomeWorkSeven {
    public static void main(String[] args) {
        Plate plate = new Plate(25);
        Cat[] cats = new Cat[4];
        cats[0] = new Cat("Мурзик", 4, false);
        cats[1] = new Cat("Барсик", 17, false);
        cats[2] = new Cat("Васька", 6, false);
        cats[3] = new Cat("Матроскин", 11, false);

        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println("В тарелке осталось " + plate.getFood() + " кусочков");
        }

        for (Cat cat : cats) {
            if (cat.isBellyful()) {
                System.out.println(cat.getCatName() + " - сыт");
            } else {
                System.out.println(cat.getCatName() + " - голоден");
            }
        }

    }
}
