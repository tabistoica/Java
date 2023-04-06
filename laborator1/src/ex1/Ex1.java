package ex1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int L, l;
		BufferedReader reader = new BufferedReader(new InputStreamReader (System.in)); 
		System.out.println("Lungime=");
		String s1 = reader.readLine();
		L = Integer.parseInt(s1);
		System.out.println("latime=");
		String s2 = reader.readLine();
		l = Integer.parseInt(s2);
		int p=2*(L+l);
		System.out.println("Perimetrul = " +p);
		int a=L*l;
		System.out.println("Aria = " +a);
	}

}