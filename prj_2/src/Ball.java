public class Ball {

    private double x = 0.0;
    private double y = 0.0;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setXY(double x, double y) {
        setX(x);
        setY(y);
    }

    Ball() {
    }

    Ball(double x, double y) {
        setXY(x, y);
    }

    public void move(double xDisp, double yDisp) {
        double old_x = getX();
        double old_y = getX();
        setXY(old_x + xDisp, old_x + yDisp);
    }

    @Override
    public String toString() {
        return "Ball{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
