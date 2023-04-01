package studio7;

//import assignment7.Student;
import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {
private double length;
private double width;
private double area;
private double perimeter;
private boolean square;
public Rectangle(int length, int width) {// WORKS
	this.length = length;
	this.width = width;// THIS NEEDS TO SHIFT FOR VARIATY OF ID NUMBERS
	this.area = length*width;
	this.perimeter = (length*2)+(width*2);// ROSTER
	this.square = length == width;
}




	public double getLength() {
	return length;
}







public double getWidth() {
	return width;
}







public double getArea() {
	return area;
}







public double getPerimeter() {
	return perimeter;
}







public boolean isSquare() {
	return square;
}


public boolean compareRect(Rectangle B) {
	if(this.getArea()>B.getArea()) {
		return true;

	}
	else {
		return false;
	}
	
}
public void drawRect() {
StdDraw.rectangle(0, 0, length, width);	
	
}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
