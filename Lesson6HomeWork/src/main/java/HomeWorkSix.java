public class HomeWorkSix {
    public static void main(String[] args) {
    Cat catMurzik = new Cat("Мурзик");
    Cat catBarsik = new Cat("Барсик");
    Dog dogSharik = new Dog("Шарик");
    Dog dogPolkan = new Dog("Полкан");
    Dog dogBarbos = new Dog("Барбос");

    catMurzik.run(100);
    catMurzik.swim(5);
    dogSharik.run(200);
    dogSharik.swim(9);
    // вроде сделал правильно, но не нравится то что обращаться приходится к обьекту для вызова функции посчета всех животных
    //

    catMurzik.totalCatAmount();
    dogSharik.totalDogAmount();
    dogSharik.animalsAmount();



    }
}
