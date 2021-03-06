 abstract class Shape1{
int a=2,b=8;
void print_area(){

}
}

class Rectangle extends Shape1{
void print_area(){
System.out.println("Area of Rectangle: "+ (a*b));
}
}
class Triangle extends Shape1{
void print_area(){
System.out.println("Area of Triangle : "+(0.5 * (a*b)));
}
}
class Circle extends Shape1{
void print_area(){
	System.out.println("Area of circle : "+ (3.14 * (a*a)));

}
}

class  Shape{
	public static void main(String[] args) {
		Rectangle obj1 = new Rectangle();
		Triangle obj2 = new Triangle();
		Circle obj3 = new Circle();
		obj1. print_area();
		obj2.print_area();
		obj3.print_area();
	}
}