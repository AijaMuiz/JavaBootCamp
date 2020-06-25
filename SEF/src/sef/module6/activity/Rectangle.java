package sef.module6.activity;

public class Rectangle extends Shape {
 
	
	// Create a class Rectangle that extends to Shape
		
	// Define parameter length and breadth
	public double length;
	public double breadth;
	
	//Parameterized constructor
	public Rectangle (double length, double breadth, String color){
		this.length = length;
		this.breadth = breadth;
		this.color= color ;
	}
	
	//Default constructor
	public Rectangle (){
		this.length = 1;
		this.breadth = 1;
		this.color = "blue";
	}
	
	// Define method calculateArea()
	public double calculateArea() {
		double area = this.length * this.breadth;
		return area;
	}
	
	//Define method calculatePerimeter()
	public double calculatePerimeter(){
		double perimeter = 2*(this.length+this.breadth);
		return perimeter;
	}

}
