public class FactoryTest {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape myCircle = shapeFactory.getShape("CIRCLE");
        myCircle.draw();

        Shape mySquare = shapeFactory.getShape("SQUARE");
        mySquare.draw();
    }
}