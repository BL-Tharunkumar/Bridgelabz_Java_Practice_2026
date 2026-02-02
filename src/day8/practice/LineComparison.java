package day8.practice;

public class LineComparison {

    public static void main(String[] args) {

        System.out.println("Welcome to Line Comparison Computation Program on Master Branch");

        // Creating points for Line 1
        Point p1 = new Point(1, 2);
        Point p2 = new Point(4, 6);

        // Creating points for Line 2
        Point p3 = new Point(2, 3);
        Point p4 = new Point(6, 7);

        // Creating Line objects
        Line line1 = new Line(p1, p2);
        Line line2 = new Line(p3, p4);

        // UC 1: Calculate Length
        System.out.println("\nLength of Line 1: " + line1.getLength());
        System.out.println("Length of Line 2: " + line2.getLength());

        // UC 2: Check Equality
        if (line1.equals(line2)) {
            System.out.println("\nLine 1 and Line 2 are Equal");
        } else {
            System.out.println("\nLine 1 and Line 2 are Not Equal");
        }

        // UC 3: Compare Lines
        int result = line1.compareTo(line2);

        if (result == 0) {
            System.out.println("Line 1 is Equal to Line 2");
        } else if (result > 0) {
            System.out.println("Line 1 is Greater than Line 2");
        } else {
            System.out.println("Line 1 is Less than Line 2");
        }
    }
}

// Point Class
class Point {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

// Line Class implementing Comparable
class Line implements Comparable<Line> {

    Point start;
    Point end;

    Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    // UC 1: Length Calculation
    public double getLength() {
        return Math.sqrt(
                Math.pow(end.x - start.x, 2) +
                        Math.pow(end.y - start.y, 2)
        );
    }

    // UC 2: Equals Method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (!(obj instanceof Line)) return false;

        Line other = (Line) obj;
        return Double.compare(this.getLength(), other.getLength()) == 0;
    }

    // UC 3 & UC 4: compareTo Method
    @Override
    public int compareTo(Line other) {
        return Double.compare(this.getLength(), other.getLength());
    }
}

