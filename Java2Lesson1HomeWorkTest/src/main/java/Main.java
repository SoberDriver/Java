public class Main {
    public static void main(String[] args) {
        Moves[] participant = new Moves[3];
        participant[0] = new Cat("Tom" , 30, 80);
        participant[1] = new Human("Popeye", 20, 60);
        participant[2] = new Robot("C3PO", 15, 40);

        Obstacles[] obstacles = new Obstacles[3];
        obstacles[0] = new Track(10);
        obstacles[1] = new Wall(35);
        obstacles[2] = new Track(40);

       participant[0].jump();

    }
}
