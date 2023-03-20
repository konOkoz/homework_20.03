public class Rectangle implements Shape{

    double length;
    double width;
    Rectangle(double length,double width){
        this.length=length;
        this.width=width;
    }
    public void perimetr(){
        System.out.println("Периметр вашего прямоугольника: "+(2*(length+width)));
    }
    public void ploshad() {
        System.out.println("Площадь вашего прямоугольника: "+(length*width));
    }
}

