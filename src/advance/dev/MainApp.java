package advance.dev;

public class MainApp {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[10];
        // Gọi các phương thức input() và print() tại đây
    }

    // Phương thức tìm diện tích lớn nhất
    public static double findMaxArea(Shape[] shapes) {
        double maxArea = Double.MIN_VALUE;
        for (Shape shape : shapes) {
            if (shape.dienTich() > maxArea) {
                maxArea = shape.dienTich();
            }
        }
        return maxArea;
    }

    // Phương thức tìm diện tích lớn nhất của mỗi hình
    public static void findMaxAreaForEachShape(Shape[] shapes) {
        double maxCircleArea = Double.MIN_VALUE;
        double maxRectangleArea = Double.MIN_VALUE;
        double maxTriangleArea = Double.MIN_VALUE;

        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                double area = shape.dienTich();
                if (area > maxCircleArea) {
                    maxCircleArea = area;
                }
            } else if (shape instanceof Rectangle) {
                double area = shape.dienTich();
                if (area > maxRectangleArea) {
                    maxRectangleArea = area;
                }
            } else if (shape instanceof Triangle) {
                double area = shape.dienTich();
                if (area > maxTriangleArea) {
                    maxTriangleArea = area;
                }
            }
        }

        System.out.println("Max Circle Area: " + maxCircleArea);
        System.out.println("Max Rectangle Area: " + maxRectangleArea);
        System.out.println("Max Triangle Area: " + maxTriangleArea);
    }
}