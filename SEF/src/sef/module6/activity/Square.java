package sef.module6.activity;

public class Square extends Rectangle {

	//Parameterized constructor
	public Square (double length, String color){
		this.breadth = length;
		this.length = length;
		this.color= color ;
	}
	public double calculatePerimeter(){
		double perimeter=4*this.length;
		return perimeter;
	}
}
