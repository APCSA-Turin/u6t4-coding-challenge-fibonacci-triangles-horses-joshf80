package com.example.project;

public class Point {
  private int x;
  private int y;
  
  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }
  
  // Returns distance between this Point object and another Point object
  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public int setX(int num) {
    return x + num;
  }

  public int setY(int num) {
    return y + num;
  }


  public double distanceTo(Point other) {
    int x2 = other.getX();
    int y2 = other.getY();
  
    return Math.sqrt((double) Math.pow(x2 - x, 2) + Math.pow(y2 - y, 2));
  }

  // Returns a string in the format: (x, y)
  public String pointInfo() {
      return "(" + x + ", " + y + ")";
  }
}