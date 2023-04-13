public class RectangleArea {
    double width;
    double height;

    public void getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter width: ");
        width = scanner.nextDouble();
        System.out.print("Enter height: ");
        height = scanner.nextDouble();
    }

    public double computeField() {
        return width * height;
    }

    public void fieldDisplay() {
        System.out.println("Rectangle width: " + width);
        System.out.println("Rectangle height: " + height);
        System.out.println("Rectangle area: " + computeField());
    }
}

