package com.javaprogramming;

public class Box {
    double height;
    double width;
    double depth;

    public Box(double height, double width, double depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    public double volume(){
        return height * width * depth;
    }


}
