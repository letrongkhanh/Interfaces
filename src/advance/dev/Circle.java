package advance.dev;

//Định nghĩa lớp Hình tròn kế thừa từ lớp Shape và thực thi interface IShape
class Circle extends Shape implements IShape {
 double radius;

 Circle(double radius) {
     this.radius = radius;
 }

 @Override
 double chuVi() {
     return 2 * Math.PI * radius;
 }

 @Override
 double dienTich() {
     return Math.PI * radius * radius;
 }

 @Override
 public void input(Shape[] shapes) {
     // Nhập thông tin hình tròn
 }

 @Override
 public void print(Shape[] shapes) {
     // In thông tin hình tròn
 }
}

