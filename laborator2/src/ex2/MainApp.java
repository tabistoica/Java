package ex2;

public class MainApp {
	public static void main(String[ ] arg) { 
		Parabola p1=new Parabola(6,-9,3); //instante a clasei Parabola
		Parabola p2=new Parabola(4,8,2);
		p1.afisare();
		p2.afisare();
		System.out.println("x1= " +p1.getX());
		System.out.println("x2= " +p2.getX());
		System.out.println("y1= " +p1.getY());
		System.out.println("y2= " +p2.getY());
		Parabola.coordonate(p1, p2);
	}
}
