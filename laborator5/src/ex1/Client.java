package ex1;

import java.util.HashSet;
import java.util.Set;

public class Client {

	private String nume;
	private String adresa;
	private Set<ContBancar> cb= new HashSet<ContBancar>();
	
	public Client(String n, String a, Set<ContBancar> cont) {
		nume = n;
		adresa = a;
		cb = cont;
	}
	
	@SuppressWarnings("unused")
	private String getN() {
		return nume;
	}
	
	@SuppressWarnings("unused")
	private String getA() {
		return adresa;
	}
	
	@SuppressWarnings("unused")
	private void setN(String n) {
		nume = n;
	}
	
	@SuppressWarnings("unused")
	private void setA(String a) {
		adresa = a;
	}
	
	@Override
	public String toString() {
		return nume+" "+adresa+" "+cb.toString();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
