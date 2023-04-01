package studio7;

public class Fraction {
	private int num;
	private int den; 

	private Fraction(int num, int den) {
		this.num=num;
		this.den = den;
	}
	
	public int getNum() {
		return num;
	}

	public int getDen() {
		return den;
	}

public int addNum(Fraction n) {
	if(this.getDen() == n.getDen()) {
return (this.getNum()+n.getNum())/this.getDen();
	}
	else {
		int denominator = this.getDen()*n.getDen();
		int numOne = this.getNum()*n.getDen();
		int numTwo = this.getDen()*n.getNum();

		return (numOne+numTwo)/denominator;
	}
}
public int  multiplyNum(Fraction n) {
	return(this.getNum()*n.getNum())/(this.getDen()*n.getDen());
}
public int reciprocal() {
	return this.getNum()/this.getDen();
}

public Fraction simplifyNum() {
	int bigger;
if(num<den) {
	 bigger=den;

}
else {
	 bigger = num;
}
	
for(int i =bigger; i>0;i--)	{
	if(num%i==0&&den%i==0) {
		int newN = num/i;
		int newD = den/i;
		Fraction D = new Fraction(newN, newD);
		return D;
	}
	
}
Fraction F = new Fraction(num, den);
return F;

}





	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
