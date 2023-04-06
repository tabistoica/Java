package ex2;

public class Parabola {
	private double a,b,c;//coeficientii
	public Parabola(double d1, double d2, double d3)//constructor cu 3 parametrii
	{
		a=d1;
		b=d2;
		c=d3;
	}
	public Parabola(Parabola n)//constructor cu un parametru de tip Parabola
	{
		a=n.a;
		b=n.b;
		c=n.c;
	}
	public void afisare()
	{
		System.out.println("f(x) = "+a+"x^2 +"+b+"x +"+c);
	}
	public double getX(){
		return -b/(2*a);
	}
	public double getY(){
		return (-b+4*a*c)/(4*a);
	}
	public static void coordonate(Parabola p1, Parabola p2)
	{
		double x, y;
		x = (p1.getX() + p2.getX())/2;
		System.out.println("x = "+x);
		y = (p1.getY() + p2.getY())/2;
		System.out.println("y = "+y);
	}

}

