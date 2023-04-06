package ex2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Carte {

	private String titlu;
	private String autor;
	private int an;
	
	public Carte(String tit, String aut, int a) {
		titlu=tit;
		autor=aut;
		an=a;
	}
	
	public String getTitlu() {
		return this.titlu;
	}
	
	public String getAutor() {
		return this.autor;
	}
	
	public int getAn() {
		return this.an;
	}
	
	public void setTitlu(String t) {
		titlu = t;
	}
	
	public void setAutor(String a) {
		autor = a;
	}
	
	public void setAn(int a) {
		an = a;
	}
	
	@Override
	public String toString() {
		return titlu+","+autor+","+an;
	}
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub		
		BufferedReader buf=new BufferedReader(new InputStreamReader(new FileInputStream("in.txt")));
		
		Carte c[]=new Carte[3];
		String[] str=new String[3];
		String sir;
		int n=0;
		int[] id=new int[3];
		
		while((sir=buf.readLine())!=null)
		{
			str=sir.split("; ");
			c[n]=new Carte(str[1],str[2],Integer.parseInt(str[3]));
			id[n]=Integer.parseInt(str[0]);
			n++;
		}
		buf.close();
		
		Map<Integer,Carte> mp= new HashMap<Integer,Carte>();
		List<Carte> ls=new ArrayList<Carte>();
		
		for(int i=0; i<n; i++) {
			mp.put(id[i],c[i]);
			ls.add(c[i]);
		}
		System.out.println(mp);
		
		for (Carte l:ls)
			System.out.println(l);
		
		Collections.sort(ls, new ComparaTitlu());
		System.out.println(ls);
	}

}

@SuppressWarnings("rawtypes")
class ComparaTitlu implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		return (((Carte)o1).getTitlu().compareTo(((Carte) o2).getTitlu()));
	}
}
