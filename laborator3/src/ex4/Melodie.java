package ex4;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Melodie {
	
	private String nume,artist;
	private int an,viz;
	
	private Melodie(String n,String a,int an, int vi) {
		this.nume=n;
		this.artist=a;
		this.an=an;
		this.viz=vi;
	}
	
	public String getN() {
		return this.nume;
	}
	
	public String getA() {
		return this.artist;
	}
	
	public int getAN() {
		return this.an;
	}
	
	public int getV() {
		return this.viz;
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader buf=new BufferedReader(new InputStreamReader(new FileInputStream("in.txt")));
		Melodie m[]=new Melodie[5];
		String[] str=new String[5];
		String sir;
		int n=0, i;
		Melodie aux;
		boolean sw=true;
		while((sir=buf.readLine())!=null)
		{
			str=sir.split("; ");
			m[n]=new Melodie(str[0],str[1],Integer.parseInt(str[2]),Integer.parseInt(str[3]));
			n++;
		}
		buf.close();
		for(i=0; i<n; i++) 
			System.out.println(m[i].getN()+" "+m[i].getA()+" "+m[i].getAN()+" "+m[i].getV());
		
		while(sw)
		{
			sw=false;
			for(i=0;i<n-1;i++)
				if(m[i].getV()<m[i+1].getV())
				{
					aux=m[i];
					m[i]=m[i+1];
					m[i+1]=aux;
					sw=true;
				}
		}
		
		System.out.println("\nOrdonare descrescatoare vizualizari:\n");
		for(i=0;i<n;i++)
			System.out.println(m[i].getN()+" "+m[i].getA()+" "+m[i].getAN()+" "+m[i].getV());
		
		System.out.println();
		for(i=0;i<n;i++)
			if((m[i].getA()).equals("Brad Paisley"))
				System.out.println(m[i].getN()+" "+m[i].getA()+" "+m[i].getAN()+" "+m[i].getV());
	}

}
