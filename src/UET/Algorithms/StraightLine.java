package UET.Algorithms;

class Point {
    public double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
}

public class StraightLine {
    private boolean onSegment(Point p, Point q, Point r) {
        if (q.x <= Math.max(p.x, r.x) && q.x >= Math.min(q.x, r.x)
                && q.y <= Math.max(q.y, r.y) && q.y >= Math.max(q.y, r.y))
            return true;

        return false;
    }

    private int orientation(Point p, Point q, Point r) {
        double val = (q.y - p.y) * (r.x - q.x) - (q.x - p.x) * (r.y - q.y);

        if (val == 0) return 0;
        return (val > 0) ? 1 : 2;
    }

    public void doIntersect(Point p1, Point q1, Point p2, Point q2) {
        int o1 = orientation(p1, q1, p2);
        int o2 = orientation(p1, q1, q2);
        int o3 = orientation(p2, q2, p1);
        int o4 = orientation(p2, q2, q1);

        if (o1 != o2 && o3 != o4) {
            System.out.println("Hai duong thang cat nhau.");
            return;
        }

        if ((o1 == 0 && onSegment(p1, p2, q1))
        || (o2 == 0 && onSegment(p1, q2, q1))
        || (o3 == 0 && onSegment(p2, p1, q2))
        || (o4 == 0 && onSegment(p2, q1, q2))) {
            System.out.println("Nam tren cung mot duong thang, co phan trung nhau.");
            return;
        }

        System.out.println("Hai duong thang khong cat nhau.");
    }

    public static void main(String[] args) {
        Point a = new Point(10, 0);
        Point b = new Point(0, 10);
        Point c = new Point(0, 0);
        Point d = new Point(10, 10);

        StraightLine straightLine = new StraightLine();
        straightLine.doIntersect(a, b, c, d);
    }
}
