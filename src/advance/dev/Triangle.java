package advance.dev;

public class Triangle extends Shape {
	 double a;
     double b;
     double c;
     
	public Triangle(String name, double a, double b, double c) {
		super(name);
		this.a = a;
		this.b = b;
		this.c = c;
	}
	@Override
	double chuVi() {
		// TODO Auto-generated method stub
		return a+b+c;
	}

	@Override
	double dienTich() {
		// TODO Auto-generated method stub
		double p = chuVi()/ 2;
		return Math.sqrt(p*(p-a)*(p-b)*(p-c));
	}
	@Override
	public String toString() {
		return "Triangle "+name+" [a=" + a + ", b=" + b + ", c=" + c + "]";
	}
	

}
