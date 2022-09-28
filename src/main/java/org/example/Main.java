package org.example;

import org.example.application.demo.DemoApp;
import org.example.server.Server;

public class Main {

    public static void main(String[] args) {
        Server server = new Server(new DemoApp());

        String response = server.handle("HTTP REQUEST STRING");

        System.out.println(response);
    }
}

//static = man braucht keine Instanz, wenn static dabeisteht und man die funktion in einer anderen klasse aufrufen will;
// sonst schreibt man ja immer new() bevor man auf eine andere klasse zugreifen kann