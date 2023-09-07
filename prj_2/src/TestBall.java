public class TestBall {
    public static void main(String[] args) {
        Ball first_ball = new Ball();
        first_ball.setXY(-4.0, 1.0);
        System.out.println(first_ball);
        first_ball.move(6.0, 5.0);
        System.out.println(first_ball);


        Ball second_ball = new Ball(10.0, 10.0);
        second_ball.move(4.0, 2.0);
        System.out.println(second_ball);
    }
}
