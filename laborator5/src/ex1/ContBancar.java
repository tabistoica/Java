package ex1;

import java.util.Calendar;

public class ContBancar implements Operatiuni{
	
	private String numarCont;
	private float suma;
	private String moneda;
	private Calendar data_deschiderii =Calendar.getInstance(); 
	private Calendar data_ultimei_operatiuni =Calendar.getInstance();
	
	public ContBancar(String nr, float s, String m, Calendar dd, Calendar duo) {
		numarCont = nr;
		suma = s;
		moneda = m;
		data_deschiderii = dd;
		data_ultimei_operatiuni = duo;
	}
	
	@SuppressWarnings("unused")
	private String getNr() {
		return numarCont;
	}
	
	@SuppressWarnings("unused")
	private void setNr(String nr) {
		numarCont = nr;
	}
	
	@SuppressWarnings("unused")
	private float getS() {
		return suma;
	}
	
	@SuppressWarnings("unused")
	private void setS(float s) {
		suma = s;
	}
	
	@SuppressWarnings("unused")
	private String getM() {
		return moneda;
	}
	
	@SuppressWarnings("unused")
	private void setM(String m) {
		moneda = m;
	}
	
	@SuppressWarnings("unused")
	private Calendar getDD() {
		return data_deschiderii;
	}
	
	@SuppressWarnings("unused")
	private void setDD(Calendar dd) {
		data_deschiderii = dd;
	}
	
	@SuppressWarnings("unused")
	private Calendar getDUO() {
		return data_ultimei_operatiuni;
	}
	
	@SuppressWarnings("unused")
	private void setDUO(Calendar duo) {
		data_ultimei_operatiuni = duo;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public float calculeaza_dobanda() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float actualizare_suma() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void depunere(float suma) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void extragere(float suma) {
		// TODO Auto-generated method stub
		
	}

}
