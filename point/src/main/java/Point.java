public class Point {
  public int x;
  public int y;

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public double distance(Point to) {
    double distance = Math.sqrt(Math.pow(to.x - this.x, 2) + Math.pow(to.y - this.y, 2));
    System.out.println("Дистанция , полученная вызовом метода объекта  от точки " + this + " до точки " + to + ": " + distance);
    return distance;
  }

  @Override
  public String toString() {
    return "(" + x + "," + y + ")";
  }
}
