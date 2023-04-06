package ex2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;

class Ex {
	@SuppressWarnings("unused")
	public static float Impartire(int dem, int imp) throws ArithmeticException, InputMismatchException, IOException 
	{
		Object o;
		
		if((o=((Object)dem).getClass())==String.class)
			throw new InputMismatchException();
		if((o=((Object)imp).getClass())==String.class)
			throw new InputMismatchException();
		
		if(imp==0)
			throw new ArithmeticException("Impartitorul trebuie sa fie diferit de 0");
		
		return (float)dem/imp;
	}
}

public class Ex2 {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

		boolean gata=false;
		
		do {
			
			System.out.println("Deimpartitul: ");
			String nr1 = rd.readLine();
			System.out.println("Impartitorul: ");
			String nr2 = rd.readLine();
			
			int dem = Integer.parseInt(nr1);
			int imp = Integer.parseInt(nr2);
			
			try 
			{
				Ex.Impartire(dem,imp);
				gata = true;
				System.out.println(Ex.Impartire(dem,imp));
			}
			catch(ArithmeticException ae) 
			{
				System.out.println("Exceptie: "+ ae);
			}
			catch(InputMismatchException ime)
			{
				System.out.println("Exceptie: introduceti numere!");
			}
			
		}while(!gata);
				
		rd.close();
	}

}
