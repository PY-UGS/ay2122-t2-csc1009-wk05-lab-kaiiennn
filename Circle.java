package week5lab;

import static java.lang.Math.pow;

import static java.lang.Math.PI;

public class Circle extends GeometricObject {
    private double radius;

    public Circle(){

    }

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;

    }

    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getArea(){
        double area = PI*pow(radius, 2);
        return area;
    }

    public double getPerimeter(){
        double perimeter = 2*PI*radius;
        return perimeter;
    }

    public double getDiameter(){
        double diameter = 2*radius;
        return diameter;
    }

    public void printCircle(){
        //Print what?
    }

}
