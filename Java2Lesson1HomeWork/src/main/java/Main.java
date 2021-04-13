import java.util.Arrays;

public class Main {



    public static void main(String[] args) {
        int a;
        RunAndJump[] participant = new RunAndJump[3];
        participant[0] = new Cat("Мурзик", 30, 80);
        participant[1] = new Human("Степан", 20, 60);
        participant[2] = new Robot("R2D2", 15, 40);

        Obstacle[] obstacles = new Obstacle[7];
        obstacles[0] = new Wall(35);
        obstacles[1] = new Track(10);
        obstacles[2] = new Wall(45);
        obstacles[3] = new Track(25);
        obstacles[4] = new Wall(65);
        obstacles[5] = new Wall(14);
        obstacles[6] = new Track(10);

        // решение через каст
        for (RunAndJump part : participant) {
            a = 0;
            for (Obstacle obst : obstacles) {
                if (obst instanceof Wall) {
                    if (part.silentJump((Wall) obst) == 1) {
                        part.jump((Wall) obst);
                    } else {
                        if (a > 0) {
                            break;
                        }
                        System.out.println(part.getName() + " Не преодолел стену высотой " + ((Wall) obst).getHeight() + " сантиметров!");
                        a++;
                    }
                } else {
                    if (part.silentRun((Track) obst) == 1) {
                        part.run((Track) obst);
                    } else {
                        if (a > 0) {
                            break;
                        }
                        System.out.println(part.getName() + " не смог пробежать дорожку длиной " + ((Track) obst).getDistance() + " метров!");
                        a++;
                    }
                }
            }
        }


    }
}
