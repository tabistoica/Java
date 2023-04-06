package ex3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

@SuppressWarnings("serial")
class Exceptie extends Exception
{
	Exceptie(String s)
	{
		super(s);
	}
}

class Verifica
{
	public static void Verific(String a) throws Exceptie
	{
		if(a.length()!=13)
			throw new Exceptie("CNP-ul trebuie sa contina 13 caractere!");
		String numere="0123456789";
		for(int i=0; i<a.length(); i++)
			if(!(numere.contains(a.substring(i, i+1))))
			{
				throw new Exceptie("CNP-ul trebuie sa contina doar cifre!");
			}
		int prima=Integer.parseInt(a.substring(0, 1));
		if(!(prima>=1 && prima<=6))
			throw new Exceptie("Prima cifra invalida!");
		String luna=a.substring(3, 5);
		if(luna.charAt(0)!='0')
		{
			int l=Integer.parseInt(luna);
			if(l>12)
				throw new Exceptie("Numar luna invalid!!");
		}
		String ziua=a.substring(5, 7);
		if(ziua.charAt(0)!='0')
		{
			int z=Integer.parseInt(ziua);
			if(z>31)
				throw new Exceptie("Numarul zi invalid!");
		}
				
	}
	
	public static void calculeaza(String a) {
		int zi,luna,an = 0;
		String anul;
		char p=a.charAt(0);
		if(p=='3' || p=='4') {
			anul="18";
			an=Integer.parseInt(anul.concat(a.substring(1, 3)));
		}
		else
			if(p=='1' || p=='2') {
				anul="19";
				an=Integer.parseInt(anul.concat(a.substring(1, 3)));
			}
			else
				if(p=='5' || p=='6') {
					anul="20";
					an=Integer.parseInt(anul.concat(a.substring(1, 3)));
				}
			if((a.charAt(3))=='0') {
				luna=Integer.parseInt(a.substring(4, 5));
			}
			else
				luna=Integer.parseInt(a.substring(3, 5));
			if((a.charAt(5))=='0') {
				zi=Integer.parseInt(a.substring(6, 7));
			}
			else
				zi=Integer.parseInt(a.substring(5, 7));
			
			Calendar today=Calendar.getInstance();
			int varsta=today.get(Calendar.YEAR)-an;
			if(luna>today.get(Calendar.MONTH)) {
				varsta--;
			}
			else
				if(luna==today.get(Calendar.MONTH))
				{
					if(zi>today.get(Calendar.DATE))
						varsta--;
				}
				
		System.out.println("Data nasterii: "+zi+"/"+luna+"/"+an+" Varsta: "+varsta+" ani");
	}
}

public class CNP {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader rd=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Nume: ");
		String nume=rd.readLine();
		System.out.println("CNP: ");
		String CNP=rd.readLine();
		try {
			Verifica.Verific(CNP);
			System.out.println(nume);
			Verifica.calculeaza(CNP);
		}
		catch(Exceptie e)
		{
			System.out.println(e);
		}
	}

}