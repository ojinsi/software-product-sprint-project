package com.google.sps.data;

/** An item on a todo list. */
public final class Comment {

  private final String comment;
  private final long timestamp;
  private final long chat; 

  public Comment(String comment, long timestamp, long chat) {
    this.comment = comment;
    this.timestamp = timestamp;
    this.chat = chat;
  }
}