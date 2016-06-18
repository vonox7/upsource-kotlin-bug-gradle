package com.moshbit.upsource.kotlin.bug;

public class MainJava {
  public static void main() {
    String helloWorld = "Hello_World";
    helloWorld = helloWorld.split("_")[0];

    String helloWorldWithSpaces = helloWorld; // "     Hello#World"
    System.out.println(helloWorldWithSpaces.replace("#", " ").trim()); // "Hello World"

    //noinspection deprecation
    deprecatedFunction(); // "Hello world from a deprecated function"

    String[] helloWorldArray = { "hello", "wwworld" };
    System.out.println(helloWorldArray[0]+ " " + helloWorldArray[1]); // "Hello world"
  }

  @Deprecated()
  static void deprecatedFunction() {
    System.out.println("Hello world from a deprecated function");
  }
}