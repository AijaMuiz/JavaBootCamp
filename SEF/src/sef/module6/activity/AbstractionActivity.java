package sef.module6.activity;

public class AbstractionActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write code to print color, area and perimeter of Square with side 5 and Rectangle with length 5 and breadth 6		
		Rectangle r = new Rectangle(5,6,"blue");
				
		Square s =	new Square (5,"blue");
		// Print result
		System.out.println("---------------------------");
		System.out.println("Rectangle color        : " +r.color);
		System.out.println("Rectangle area         : " +r.calculateArea());
		System.out.println("Rectangle perimeter    : " +r.calculatePerimeter());
		
		System.out.println("---------------------------");
		System.out.println("Square color        : " +s.color);
		System.out.println("Square area         : " +s.calculateArea());
		System.out.println("Square perimeter    : " +s.calculatePerimeter());
	
		
	}

}
