package com.sample.java.practice;
class Parent {
  public static void staticMethod() {
    System.out.println("This is the static method from the parent class");
  }
}

class Child extends Parent {
  // This will not override the staticMethod() method in the parent class
  public static void staticMethod() {
    System.out.println("This is the static method from the child class");
  }
}

public class TestClass1 {
  public static void main(String[] args) {
    // Child.staticMethod() will be called
    Child.staticMethod();
  }
}