package com.bravedroid.ocp.after;

public class Rectangle implements Shape {
    private double length;
    private double height;
    // getters/setters ... 

    @Override
    public double getArea() {
        return (length * height);
    }
}