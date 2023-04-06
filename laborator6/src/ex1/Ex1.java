package ex1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

@SuppressWarnings("serial")
class Exceptie extends Exception {
	
	private int a, b;
	
	public Exceptie(int nr1, int nr2)
	{
		a = nr1;
		b = nr2;
	}
	
	@Override
	public String toString() {
		return "Numarul "+a+" este mai mare decat "+b;
	}
}

public class Ex1 {
	
	public static void Verific(int a, int b, PrintStream out) throws Exceptie
	{
		if(a < b)
			out.println(a+" "+b);
		else
			throw new Exceptie(a,b);
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		PrintStream out = new PrintStream("out.txt");
		
		boolean gata=false;
		
		do {
			
			System.out.println("primul numar: ");
			String nr1 = rd.readLine();
			System.out.println("al doilea numar: ");
			String nr2 = rd.readLine();
			
			int a = Integer.parseInt(nr1);
			int b = Integer.parseInt(nr2);
			
			try {
				Ex1.Verific(a, b, out);
				gata = true;
			}
			catch(Exceptie e) {
				System.out.println("Exceptie: "+ e);
			}
			
		}while(!gata);
		
		System.out.println("Perechea de numere este corecta!");
		
		rd.close();
		out.close();
	}

}
