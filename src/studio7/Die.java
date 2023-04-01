package studio7;

public class Die {
private double sides;

private Die (int n) {
	this.sides =n;
}


public double getSides() {
	return sides;
}


public int random() {
	int number= (int) (Math.random()*sides+1);
	return number;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
