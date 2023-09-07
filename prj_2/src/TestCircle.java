import java.util.ArrayList;

public class TestCircle {
    private ArrayList<Circle> arrayList;
    private int length;

    public TestCircle() {
        this.arrayList = new ArrayList<>();
    }

    public void addCircle(Circle circle) {
        this.arrayList.add(circle);
        setLength(this.arrayList.size());
    }

    public int getLength() {
        return length;
    }

    private void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "TestCircle{" +
                "arrayList=" + arrayList +
                ", length=" + length +
                '}';
    }

    public static void main(String[] args) {
        TestCircle tester = new TestCircle();
        Circle circle = new Circle(new Point(5.0, 4.0));

        tester.addCircle(circle);
        System.out.println(tester);
        tester.addCircle(circle);
        System.out.println(tester);
    }
}
