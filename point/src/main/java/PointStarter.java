public class PointStarter {

  public static void main(String[] args) {
    Point from = new Point(1, 1);
    Point to = new Point(1, 20);
    distance(from, to);
    from.distance(to);
    to.distance(from);
  }

  public static double distance(Point from, Point to) {
    double distance = Math.sqrt(Math.pow(to.x - from.x, 2) + Math.pow(to.y - from.y, 2));
    System.out.println("Дистанция , полученная вызовом статичной функции от точки " + from + " до точки " + to + ": " + distance);
    return distance;
  }
}