package ex1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Random;

public class Vers {
	private String linie;

	public int cuvinte(String s) {
		linie=s;
		int n=1;
		for(int i=0;i<linie.length();i++)
		{
			if(linie.charAt(i)!=' ')
				continue;
			n++;
		}
		return n;
	}
	
	public int vocale(String s) {
		linie=s;
		char[] v= {'a','e','i','o','u','A','E','I','O','U'};
		int n=0;
		for(int j=0;j<10;j++)
			for(int i=0;i<linie.length();i++)
			{
				if(linie.charAt(i)!=v[j])
					continue;
				n++;
			}
		return n;
	}
	
	public String grup(String s) {
		linie=s;
		String end=" ";
		if(linie.endsWith("ay"))
			end="*";
		return end;
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader buf=new BufferedReader(new InputStreamReader(new FileInputStream("cantec_in.txt")));
		PrintStream out=new PrintStream("cantec_out.txt");
		
		String lin;
		Vers v=new Vers();
		Random random=new Random();
		
		while((lin=buf.readLine())!=null)
		{
			float f=(float)random.nextFloat();
			if(f<(float)0.1)
				out.println(lin.toUpperCase()+" "+v.cuvinte(lin)+" "+v.vocale(lin)+" "+v.grup(lin)+" "+f);
			else
				out.println(lin+" "+v.cuvinte(lin)+" "+v.vocale(lin)+" "+v.grup(lin)+" "+f);
		}
		
		buf.close();
		out.close();
	}

}
