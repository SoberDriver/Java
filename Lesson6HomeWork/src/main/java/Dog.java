public class Dog extends Animal {
    public static int dogAmount;

    public Dog(String name) {
        this.name = name;
        number++;
        dogAmount++;
    }

    @Override
    public void run(int run) {
        if (run > 500) {
            System.out.println("Собаки могут пробежать только 500 метров");
        } else { super.run(run);
        }
    }

    @Override
    public void swim(int swim) {
        if (swim > 10) {
            System.out.println("Собаки могут проплыть только 10 метров");
        } else { super.swim(swim);
        }
    }
    public void totalDogAmount() {
        System.out.println("Количество собак: " + dogAmount);
    }
}
