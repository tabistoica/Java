package ex1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;


public class Echipament implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String denumire, zona_mag;
	private int nr_inv;
	private float pret;
	enum stare{achizitionat,expus,vandut};
	
	public Echipament(String denumire, String zona_mag, int nr_inv, float pret, stare s) 
	{
		this.denumire=denumire;
		this.zona_mag=zona_mag;
		this.nr_inv=nr_inv;
		this.pret=pret;
	}
	
	@Override
	public String toString() {
		return denumire+", "+zona_mag+", "+nr_inv+", "+pret+", ";
	}
}
	
//----------------------CLASE DERIVATE---------------------------------//

	class Imprimanta extends Echipament implements Serializable {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		private int ppm, p_car;
		private String dpi;
		enum tip{color,alb_negru};
		
		public Imprimanta(String denumire, String zona_mag, int nr_inv, float pret, stare n, int ppm, String dpi, int p_car, tip t) {
			super(denumire, zona_mag, nr_inv, pret, n);
			this.ppm=ppm;
			this.dpi=dpi;
			this.p_car=p_car;
		}
		
		@Override
		public String toString() {
			return ppm+", "+dpi+", "+p_car;
		}
		
	}
	
	class Copiator extends Echipament implements Serializable{
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		private int ppm, p_ton;
		enum format{A3,A4};
		
		public Copiator(String denumire, String zona_mag, int nr_inv, float pret, stare s, int ppm, int p_ton, format f) {
			super(denumire, zona_mag, nr_inv, pret, s);
			this.ppm=ppm;
			this.p_ton=p_ton;
		}
		
		@Override
		public String toString() {
			return ppm+", "+p_ton;
		}
		
	}
	
	class Sistem_de_calcul extends Echipament implements Serializable{
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		private String tip_mon;
		private float vit_proc, c_hdd;
		enum instal{Windows,Linux};
		
		public Sistem_de_calcul(String denumire, String zona_mag, int nr_inv, float pret, stare s, String tip_mon, float vit_proc, float c_hdd, instal i) {
			super(denumire, zona_mag, nr_inv, pret, s);
			this.tip_mon=tip_mon;
			this.vit_proc=vit_proc;
			this.c_hdd=c_hdd;
		}
		
		@Override
		public String toString() {
			return tip_mon+", "+vit_proc+", "+c_hdd;
		}
		
	}

//----------------------------MAIN---------------------------------------//
	
class MainApp {
		static Object citeste(String fis) {
		try {
		FileInputStream f = new FileInputStream(fis);
		ObjectInputStream ois = new ObjectInputStream(f);
		Object o=ois.readObject();
		ois.close();
		f.close();
		return o;
		}
		catch (IOException | ClassNotFoundException e) {
		e.printStackTrace();
		}
		return null;
		}
	public static void main(String[] args) {
			// TODO Auto-generated method stub
		Echipament[] t=new Echipament[6];
		t=(Echipament[])citeste("echipamente.txt");
		for(Echipament n:t)
			System.out.println(n.toString());
	}
}
