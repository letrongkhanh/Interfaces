package advance.dev;

// Định nghĩa lớp cơ sở trừu tượng Shape
abstract class Shape {
	abstract double chuVi();

	abstract double dienTich();
}

interface IShape {
	void input(Shape[] shapes);

	void print(Shape[] shapes);
}