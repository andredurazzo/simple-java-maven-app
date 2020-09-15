package com.mycompany.app;

import java.util.Optional;

/**
 * Hello world!
 */
public class App
{

    private final String message = "Hello World!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
      var text = " Java 11";
        return message.concat(text);
    }

}
