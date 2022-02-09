package week5lab2;

public class Rectangle extends Shape {

    public Rectangle(int dim1, int dim2){
        super(dim1, dim2);

    }
    public double area(){
        double area = getDim1() * getDim2();
        return area;
    }
}
