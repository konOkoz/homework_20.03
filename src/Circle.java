public class Circle implements Shape{
    double radius;
    double result;

    Circle(double radius){
        this.radius=radius;
    }

    public double perimetr(){
     return result =2*Math.PI*radius;
    }
    public double ploshad(){
       return result = Math.PI*Math.pow(radius,2);

    }

}
