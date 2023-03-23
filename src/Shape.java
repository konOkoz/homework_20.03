public interface Shape {

    double perimetr();
    double ploshad();
    static double totalSquare(Circle oc,Rectangle or){
       return oc.ploshad()+or.ploshad();
    }

}
