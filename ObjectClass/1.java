public class Point implements Cloneable {
    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public Point clone() {
        try {
            return (Point) super.clone();
        } catch (CloneNotSupportedException e) {
            // This will never happen since Point supports cloning
            return null;
        }
    }
}

public class Point3D extends Point {
    private int z;

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public Point3D clone() {
        try {
            Point3D copy = (Point3D) super.clone();
            copy.z = this.z;
            return copy;
        } catch (CloneNotSupportedException e) {
            // This will never happen since Point3D supports cloning
            return null;
        }
    }
}
