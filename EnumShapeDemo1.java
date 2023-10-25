public class EnumShapeDemo1 {
    public static void main(String[] args) {
        for (EnumShapeDemo shape : EnumShapeDemo.values()) {
            System.out.println("Shape: " + shape);
            System.out.println("Area: " + shape.calculateArea());
            System.out.println("Perimeter: " + shape.calculatePerimeter());
            System.out.println();
        }
    }
}
