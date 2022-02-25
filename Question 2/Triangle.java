package week5lab2;

public class Triangle extends Shape{

    public Triangle(int dim1, int dim2){
        super(dim1, dim2);
    }

    public double area(){
        double area = 0.5 * getDim1() * getDim2();
        return area;
    }
}
