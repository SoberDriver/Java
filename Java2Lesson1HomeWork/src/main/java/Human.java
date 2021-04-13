public class Human implements RunAndJump {
    private String name;
    private int runDistance;
    private int jumpHeight;
    public boolean check = true;

    public Human(String name, int runDistance, int jumpHeight) {
        this.name = name;
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
    }

    @Override
    public int silentRun(Track track) {
        if (runDistance < track.getDistance()) {
            return 0;
        } else {
            return 1;
        }
    }

    @Override
    public int silentJump(Wall wall) {
        if (jumpHeight < wall.getHeight()) {
            return 0;
        } else {
            return 1;
        }
    }

    @Override
    public void run(Track track) {
        System.out.println(name + " пробежал " + track.getDistance() + " метров!");
    }

    @Override
    public void jump(Wall wall) {
        System.out.println(name + " прыгнул на " + wall.getHeight() + " сантиметров!");
    }

    @Override
    public String getName() {
        return name;
    }

}
