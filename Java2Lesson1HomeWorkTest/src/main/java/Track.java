public class Track implements Obstacles, Moves{
    private int distance;

    public Track(int distance) {
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public void check() {
        if (distance > obstacles.getRunDistance()) {
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

    @Override
    public void check(Robot robot) {

    }
}
