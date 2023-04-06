package ex5;

import java.util.Random;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random=new Random();
		int n = random.nextInt(21);
		System.out.println(n);
		int a,b,c = 0, k=0;
		a=0;
		b=1;
		for(int i=3;i<=21;i++)
		{
			c=a+b;
			a=b;
			b=c;
			if(n==b) k=1;
		}
		if(k==0 && n!=0)
			System.out.println("nu apartine sirului Fibonacci");
		else
			System.out.println("apartine sirului Fibonacci");
	}

}