import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShapeCalculator {

@Test
    void givenCircleAndRectangleSquares_checkingTheirSumMethod(){
    Circle cir1 = new Circle(5);
    Rectangle rec1 = new Rectangle(3,5);
     assertEquals(93.53981633974483,Shape.totalSquare(cir1,rec1));
     /*
     Tests passed: 1 of 1 test - 20ms
      */
}
}
