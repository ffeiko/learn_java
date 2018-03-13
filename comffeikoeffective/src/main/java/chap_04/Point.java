package chap_04;

/**
 * @author wangjingffei
 * @DESCRIPTION
 * @create 2018/3/13
 */
public class Point {
    private double x;
    private double y;

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

    public Point(double x, double y) {

        this.x = x;
        this.y = y;
    }
}
