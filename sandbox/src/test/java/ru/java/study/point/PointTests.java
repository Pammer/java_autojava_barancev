package ru.java.study.point;

import org.testng.annotations.Test;

import java.io.UnsupportedEncodingException;

import static org.testng.Assert.assertEquals;

public class PointTests {

  @Test
  public void distanceBase() throws UnsupportedEncodingException {
    Point from = new Point(1, 1);
    Point to = new Point(1, 20);
    assertEquals(from.distance(to), 19.0);
    assertEquals(to.distance(from), 19.0);
  }

  @Test
  public void distanceFailed() throws UnsupportedEncodingException {
    Point from = new Point(1, 1);
    Point to = new Point(1, 20);
    assertEquals(from.distance(to), 18.0);
  }

  @Test
  public void distanceZero() throws UnsupportedEncodingException {
    Point from = new Point(1, 1);
    Point to = new Point(1, 1);
    assertEquals(from.distance(to), 0.0);
  }


  @Test
  public void distanceDouble() throws UnsupportedEncodingException {
    Point from = new Point(6, 5);
    Point to = new Point(4, 6);
    assertEquals(from.distance(to), 2.23606797749979);
  }


  @Test
  public void distanceBig() throws UnsupportedEncodingException {
    Point from = new Point(6, 5);
    Point to = new Point(4000, 6000);
    assertEquals(from.distance(to), 7203.6144399877485);
  }
}
