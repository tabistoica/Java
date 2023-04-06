package ex2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sir {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader (System.in)); 
		System.out.println("sir: ");
		StringBuilder builder=new StringBuilder(reader.readLine());
		/*System.out.println("pozitie: ");
		int i=reader.read();*/
		System.out.println("subsir: ");
		String s=reader.readLine(); 
		System.out.println(builder.insert(7, " "+s+" "));
		int lenght=3;
		System.out.println(builder.delete(4, 4+lenght));
	}

}
