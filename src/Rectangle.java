public class Rectangle implements Shape{

    double length;
    double width;
    double result;
    Rectangle(double length,double width){
        this.length=length;
        this.width=width;
    }
    public double perimetr(){
        return result = 2*(length+width);
    }
    public double ploshad() {
       return result = length*width;

    }
}

