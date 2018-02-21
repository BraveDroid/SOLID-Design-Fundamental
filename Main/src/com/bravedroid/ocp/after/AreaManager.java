package com.bravedroid.ocp.after;

import java.util.List;

public class AreaManager {
    public double calculateArea(List<Shape> shapes) {
        double area = 0;
        for (Shape shape : shapes) {
            area += shape.getArea();
        }
        return area;
    }
}