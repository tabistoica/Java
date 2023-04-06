package ex4;

import java.util.Random;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, m;
		Random random=new Random();
		n = random.nextInt(30)+1;
		System.out.println(n);
		m = random.nextInt(30)+1;
		System.out.println(m);
		while(m!=0)
		{
			int r=n%m;
			n=m;
			m=r;
		}
		System.out.println("cmmdc = " +n);
	}

}