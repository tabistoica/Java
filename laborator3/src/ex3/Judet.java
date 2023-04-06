package ex3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Judet {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader buf=new BufferedReader(new InputStreamReader(new FileInputStream("judete_in.txt")));
		BufferedReader reader = new BufferedReader(new InputStreamReader (System.in)); 
		
		String judet[]=new String[41];
		int i;
		
		while(buf.readLine()!=null) 
		{
			for(i=0;i<judet.length;i++) 
			{
				judet[i]=buf.readLine();
				System.out.println(judet[i]);			
			}
			
			System.out.println("Dati judetul: ");
			String jud=reader.readLine();
			
			System.out.println("JUDETE SORTATE: ");
			Arrays.sort(judet);
			for(i=0;i<judet.length;i++)
				System.out.println(judet[i]);
			
			int poz=Arrays.binarySearch(judet,jud);
			System.out.println(poz>=0?"Gasit pe pozitia "+poz:"Nu se gaseste!");
		}
		buf.close();
		reader.close();
	}
}
