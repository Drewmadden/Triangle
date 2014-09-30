
public class Triangle extends GeometricObject {
	private double side1;
	private double side2;
	private double side3;
	
	public Triangle(){
		side1= 1.0;
		side2= 1.0;
		side3= 1.0;
	}
	public Triangle(double side1, double side2, double side3){
		this.side1=side1;
		this.side2=side2;
		this.side3=side3;
	}
	public double getside1(){
		return side1;
	}
	public double getside2(){
		return side2;
	}
	public double getside3(){
		return side3;
	}
	public double getPerimeter(){
		double p;
		p=(side1+side2+side3);
		return(p);
	}
	public double getArea(){
		double s;
		s = getPerimeter();
		double a;
		a=(s*(s-side1)*(s-side2)*(s-side3));
		double area;
		area= Math.sqrt(a);
		return(area);
		}
	public String toString(){
		return("This is a triangle with sides:" + this.side1 + "," +this.side2 +"and" +this.side3 +". This triangle's perimeter is: " +getPerimeter() +". This triangles area is: " +getArea()  );
	}
}
