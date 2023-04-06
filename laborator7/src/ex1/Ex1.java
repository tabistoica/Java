package ex1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class Ex1 extends JFrame {

	private JPanel contentPane;
	private JTextField txtop1;
	private JTextField txtop2;
	@SuppressWarnings("unused")
	private	String text;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex1 frame = new Ex1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ex1() {
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 295, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblOp1 = new JLabel("Operand 1");
		lblOp1.setBounds(30, 23, 86, 31);
		contentPane.add(lblOp1);
		
		JLabel lblOp2 = new JLabel("Operand 2");
		lblOp2.setBounds(30, 66, 86, 31);
		contentPane.add(lblOp2);
		
		JLabel label = new JLabel("");
		label.setOpaque(true);
		label.setBackground(Color.WHITE);
		label.setBounds(12, 196, 271, 24);
		contentPane.add(label);
		
			txtop1 = new JTextField();
			txtop1.setBounds(134, 29, 114, 18);
			contentPane.add(txtop1);
			txtop1.setColumns(10);
			
			txtop2 = new JTextField();
			txtop2.setBounds(134, 72, 114, 18);
			contentPane.add(txtop2);
			txtop2.setColumns(10);
		
		JButton btnAdunare = new JButton("Adunare");
		btnAdunare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try
				{
					text="";
					String op1 = txtop1.getText();
					String op2 = txtop2.getText();
					int rez = Integer.parseInt(op1)+Integer.parseInt(op2);
					label.setText(""+rez);
				}
				catch(NumberFormatException e)
				{
					label.setText("Introduceti numere");
				}
			}
		});
		btnAdunare.setBounds(47, 124, 98, 24);
		contentPane.add(btnAdunare);
		
		JButton btnScadere = new JButton("Scadere");
		btnScadere.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try
				{
					text="";
					String op1 = txtop1.getText();
					String op2 = txtop2.getText();
					int rez = Integer.parseInt(op1)-Integer.parseInt(op2);
					label.setText(""+rez);
				}
				catch(NumberFormatException e)
				{
					label.setText("Introduceti numere");
				}
			}
		});
		btnScadere.setBounds(157, 124, 98, 24);
		contentPane.add(btnScadere);
		
		JButton btnInmultire = new JButton("Inmultire");
		btnInmultire.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try
				{
					text="";
					String op1 = txtop1.getText();
					String op2 = txtop2.getText();
					int rez = Integer.parseInt(op1)*Integer.parseInt(op2);
					label.setText(""+rez);
				}
				catch(NumberFormatException e)
				{
					label.setText("Introduceti numere");
				}
			}
		});
		btnInmultire.setBounds(47, 160, 98, 24);
		contentPane.add(btnInmultire);
		
		JButton btnImpartire = new JButton("Impartire");
		btnImpartire.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try
				{
					text="";
					String op1 = txtop1.getText();
					String op2 = txtop2.getText();
					if(Integer.parseInt(op2)==0) throw new ArithmeticException();
					float rez = (float)Integer.parseInt(op1)/Integer.parseInt(op2);
					label.setText(""+rez);
				}
				catch(ArithmeticException ae) 
				{
					label.setText("Operand 2 trebuie sa fie mai mare decat 0");
				}
				catch(NumberFormatException e)
				{
					label.setText("Introduceti numere");
				}
			}
		});
		btnImpartire.setBounds(157, 160, 98, 24);
		contentPane.add(btnImpartire);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				label.setText(null);
				txtop1.setText(null);
				txtop2.setText(null);
			}
		});
		btnClear.setBounds(47, 225, 208, 24);
		contentPane.add(btnClear);
				
	}
}
