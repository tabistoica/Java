package ex1;

import java.util.ArrayList;
import java.util.List;

public class Banca {
	
	private String denumire_banca;
	private List<Client> cl = new ArrayList<Client>();
	
	public Banca(String den, List<Client> l) {
		denumire_banca = den;
		cl = l;
	}
	
	@SuppressWarnings("unused")
	private String getD() {
		return denumire_banca;
	}
	
	@SuppressWarnings("unused")
	private void setD(String den) {
		denumire_banca = den;
	}
	
	@Override
	public String toString() {
		return denumire_banca+" "+cl.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}