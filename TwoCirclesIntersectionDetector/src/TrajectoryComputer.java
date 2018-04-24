
public class TrajectoryComputer {

    public static double distanceX_axis(Circle objectA, Circle objectB) {
        double distanceX = objectA.getCoordinateX() - objectB.getCoordinateX();
        return distanceX;
    }

    public static double distanceY_axis(Circle objectA, Circle objectB) {
        double distanceY = objectA.getCoordinateY() - objectB.getCoordinateY();
        return distanceY;
    }

    public static boolean intersectionOfTwoCircles(Circle objectA, Circle objectB) {
        double totalDistance = Math.sqrt(Math.pow(distanceX_axis(objectA, objectB), 2) + Math.pow(distanceY_axis(objectA, objectB), 2));

        return (totalDistance <= (objectA.getRadius() + objectB.getRadius())) && (totalDistance >= Math.abs(objectA.getRadius() - objectB.getRadius()));
    }
}