public class Wall implements Obstacles, Moves{
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public void check(Robot robot) {
        if (height > robot.getJumpHeight()) {
            System.out.println(" da smojet");
        } else {
            System.out.println("NOOO");
        }

    }

    @Override
    public void run() {

    }

    @Override
    public void jump() {

    }

    @Override
    public int getJumpHeight() {
        return 0;
    }

    @Override
    public int getRunDistance() {
        return 0;
    }
}
