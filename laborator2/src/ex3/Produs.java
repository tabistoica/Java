package ex3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Produs {
	private String denumire;
	private double pret, cantitate;
	
	public String getden() {
		return this.denumire;
	}
	
	public double getpret() {
		return this.pret;
	}
	
	public double getcan() {
		return this.cantitate;
	}
	
	public void setden(String den) {
		denumire = den;
	}

	public void setpret(double pr) {
		pret = pr;
	}
	
	public void setcan(double can) {
		cantitate = can;
	}
	
	public String toString() {
		return denumire+";"+pret+";"+cantitate;
	}

	public static void main(String[] args) throws IOException 
	{
		BufferedReader buf=new BufferedReader(new InputStreamReader(new FileInputStream("prod.txt")));
		PrintStream out=new PrintStream("out.txt");
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		
		Produs p[]=new Produs[5];
		String[] str=new String[5];
		String sir;
		int n=0;
		double min=999, max=0, aux;
		
		while((sir=buf.readLine())!=null)
		{
			str=sir.split(";");
			double x=Double.parseDouble(str[1]);
			double y=Double.parseDouble(str[2]);
			p[n]=new Produs();
			p[n].setden(str[0]);
			p[n].setpret(x);
			p[n].setcan(y);
			n++;
		}
		for(int i=0; i<n; i++)
		{
			System.out.println(p[i].toString());
		}
		
		for(int i=0; i<n; i++) 
		{
			if((aux=p[i].getpret())>max)
			{
				max=aux;
			}
			if((aux=p[i].getpret())<min)
			{
				min=aux;
			}
		}
		
		for(int i=0; i<n; i++)
		{
			if((aux=p[i].getpret())==max)
			{
				out.println(p[i].toString());
			}
		}
		for(int i=0; i<n; i++)
		{
			if((aux=p[i].getpret())==min)
			{
				out.println(p[i].toString());
			}
		}
		
		System.out.print("Dati o valoare: ");
		String val=in.readLine();
		double q=Double.parseDouble(val);
		
		for(int i=0; i<n; i++) 
		{
			double can=p[i].getcan();
			if(can<q)
			{
				System.out.println(p[i].toString());
			}
		}
		buf.close();
		out.close();
	}
}
	