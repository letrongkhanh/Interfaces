package advance.dev;

//Định nghĩa lớp Tam giác kế thừa từ lớp Shape và thực thi interface IShape
class Triangle extends Shape implements IShape {
 double a, b, c;

 Triangle(double a, double b, double c) {
     this.a = a;
     this.b = b;
     this.c = c;
 }

 @Override
 double chuVi() {
     return a + b + c;
 }

 @Override
 double dienTich() {
     double p = (a + b + c) / 2;
     return Math.sqrt(p * (p - a) * (p - b) * (p - c));
 }

 @Override
 public void input(Shape[] shapes) {
     // Nhập thông tin tam giác
 }

 @Override
 public void print(Shape[] shapes) {
     // In thông tin tam giác
 }
}