package com.javacreed.examples.oop.part2;

public class Example1 {
  public static void main(final String[] args) {
    final Data data = new Data(10);
    data.setValue(0, 5);

    final int[] values = data.getValues();
    values[0] = -10;

    System.out.println(data);
  }
}
