public class Circle implements Shape{
    double radius;

    Circle(double radius){
        this.radius=radius;
    }

    public void perimetr(){
        System.out.println("Периметр вашего круга: "+(2*Math.PI*radius));
    }
    public void ploshad(){
        System.out.println("Площадь вашего круга: "+(Math.PI*Math.pow(radius,2)));
    }

}
