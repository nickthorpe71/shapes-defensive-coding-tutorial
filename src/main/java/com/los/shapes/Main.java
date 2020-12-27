package com.los.shapes;

public class Main {
    public static void main(String[] args) {
        try {
            Circle c1 = new Circle(0, 0, 0);
            System.out.println(c1);
        } catch( IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}