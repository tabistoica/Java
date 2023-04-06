package ex3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int d, prim=0;
		BufferedReader read=new BufferedReader(new InputStreamReader (System.in)); 
		System.out.println("n = ");
		String s = read.readLine();
		int n = Integer.parseInt(s);
		for(d=1; d<=n; d++)
			if(n%d==0)
			{
				System.out.println(d);
				prim++;
			}
		if(prim==2)
			System.out.println("n e prim");
		else
			System.out.println("n nu e prim");
	}

}