package com.google.sps.data;

public final class Event  {

  private final int month;
  private final int day;
  private final String  title;
  private final String link;

  public Event(int month, int day, String title,  String link) {
    this.month = month;
    this.day = day;
    this.title = title;
    this.link = link;
  }
}