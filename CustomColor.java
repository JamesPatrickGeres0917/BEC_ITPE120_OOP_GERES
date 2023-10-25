public enum CustomColor {
    RED(255, 0, 0),
    GREEN(0, 255, 0),
    BLUE(0, 0, 255),
    YELLOW(255, 255, 0),
    CYAN(0, 255, 255),
    MAGENTA(255, 0, 255),
    WHITE(255, 255, 255),
    BLACK(0, 0, 0);

    private int red;
    private int green;
    private int blue;

    CustomColor(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public String getRGBValues() {
        return "RGB(" + red + ", " + green + ", " + blue + ")";
    }

    public static void main(String[] args) {
        for (CustomColor color : CustomColor.values()) {
            System.out.println(color + " - " + color.getRGBValues());
        }
    }
}
