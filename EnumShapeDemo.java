public enum EnumShapeDemo {
    Circle(3.0), Square(4.0), Triangle(6.0);

    private double parameter;

    private EnumShapeDemo(double parameter) {
        this.parameter = parameter;
    }

    public double calculateArea() {
        switch (this) {
            case Circle:
                return Math.PI * Math.pow(parameter, 2);
            case Square:
                return Math.pow(parameter, 2);
            case Triangle:
                return (Math.sqrt(3) / 4) * Math.pow(parameter, 2);
            default:
                return 0.0;
        }
    }

    public double calculatePerimeter() {
        switch (this) {
            case Circle:
                return 2 * Math.PI * parameter;
            case Square:
                return 4 * parameter;
            case Triangle:
                return 3 * parameter;
            default:
                return 0.0;
        }
    }
}

