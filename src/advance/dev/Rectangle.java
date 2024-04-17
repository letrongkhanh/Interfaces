package advance.dev;

//Định nghĩa lớp Hình chữ nhật kế thừa từ lớp Shape và thực thi interface IShape
class Rectangle extends Shape implements IShape {
 double length, width;

 Rectangle(double length, double width) {
     this.length = length;
     this.width = width;
 }

 @Override
 double chuVi() {
     return 2 * (length + width);
 }

 @Override
 double dienTich() {
     return length * width;
 }

 @Override
 public void input(Shape[] shapes) {
     // Nhập thông tin hình chữ nhật
 }

 @Override
 public void print(Shape[] shapes) {
     // In thông tin hình chữ nhật
 }
}


