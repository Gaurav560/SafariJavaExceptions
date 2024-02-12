package com.dancingcloudservices;

record X(String s) {}
public class Main {
  public static void main(String[] args) {
    Object obj = new X("Java 21 World!");

    System.out.println(switch(obj) {
      case X(String msg) -> "Hello " + msg;
      default -> "What?!";
    });
  }
}