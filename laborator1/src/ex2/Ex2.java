package ex2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int sum=0, k=0, min, max=0;
		float ma=0;
		Scanner s=new Scanner(new File("in.txt"));

		do 
		{
			k++;
			int x = s.nextInt(); 
			if(max<x) max=x;
			min=max;
			if(min>x) min=x;
			sum=sum+x;
		}
		while(s.hasNext());
		ma=(float)sum/k;
		System.out.println("Suma = " +sum);
		System.out.println("Media aritmetica = " +ma);
		System.out.println("Minim = " +min);
		System.out.println("Maxim = " +max);
		
		PrintStream f_out = new PrintStream (new FileOutputStream("out.txt")); 
		System.setOut(f_out);
		System.out.printf("Suma= %d \nMedia = %.1f \nMin = %d \nMax = %d", sum, ma, min, max);

	}
	
}