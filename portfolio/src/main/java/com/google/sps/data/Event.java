package com.google.sps.data;
public class Event  {

  public int month;
  public int day;
  public String  title;
  public String link;

  public void setData(int m, int d, String t,  String l) {
    this.month = m;
    this.day = d;
    this.title = t;
    this.link = l;
  }
}