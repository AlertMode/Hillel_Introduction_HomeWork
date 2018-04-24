public class Circle {

    private double coordinateX;
    private double coordinateY;
    private double radius;

    public void setCoordinateX() {
        coordinateX = SecondaryMethods.checkForDouble();
    }

    public void setCoordinateY() {
        coordinateY = SecondaryMethods.checkForDouble();
    }

    public void setRadius() {
        radius = SecondaryMethods.checkForDouble();
    }

    public double getCoordinateX() {
        return coordinateX;
    }

    public double getCoordinateY() {
        return coordinateY;
    }

    public double getRadius() {
        return  radius;
    }
}
