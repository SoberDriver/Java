public class Animal {
    public String name;
    public int run;
    public int swim;
    public static int number;

    public  Animal(){
    }

    public Animal(String name) {
        this.name = name;
    }

    public void run(int run){
        this.run = run;
        System.out.println(name + " пробежал " + run + " м");
    }

    public void swim(int swim){
        this.swim = swim;
        System.out.println(name + " проплыл " + swim + " м");
    }

    public void animalsAmount() {
        System.out.println("Количество всех животных: " + number);
    }
}
