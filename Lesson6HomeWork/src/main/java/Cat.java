public class Cat extends Animal{
    public static int catAmount;

    public Cat(String name) {
        this.name = name;
        number++;
        catAmount++;
    }

    @Override
    public void run(int run) {
        if (run > 200) {
            System.out.println("Котик может бегать только 150 метров");
        } else { super.run(run);
        }
    }

    @Override
    public void swim(int swim) {
        if (swim > 0) {
            System.out.println("Коты не умеют плавать");
        } else { super.run(swim);
        }
    }

    public void totalCatAmount() {
        System.out.println("Количество котов: " + catAmount);
    }
}

