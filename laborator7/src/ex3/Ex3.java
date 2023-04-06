package ex3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JCheckBox;
import javax.swing.border.TitledBorder;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ListSelectionModel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

@SuppressWarnings("serial")
public class Ex3 extends JFrame {

	private JPanel contentPane;
	private JTextField txtFilm;
	private JTextField txtActori;
	private String text;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex3 frame = new Ex3();
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
	public Ex3() {
		setTitle("Filme");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 348);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);		
		
		JTable table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Film", "Actori", "An Lansare", "Genuri"
			}
		));
		table.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		DefaultTableModel tabmod = (DefaultTableModel) table.getModel();
		table.setBounds(40, 237, 460, 60);
		contentPane.add(table);
		
		txtFilm = new JTextField();
		txtFilm.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				txtFilm.getText();
			}
		});
		txtFilm.setBounds(170, 12, 200, 18);
		txtFilm.setColumns(10);
		
		JLabel lblFilm = new JLabel("Film");
		lblFilm.setBounds(130, 14, 55, 14);
		
		txtActori = new JTextField();
		txtActori.setBounds(170, 42, 200, 18);
		txtActori.setColumns(10);
		
		JLabel lblActori = new JLabel("Actori");
		lblActori.setBounds(130, 42, 55, 14);
		
		JLabel lblAnLansare = new JLabel("An lansare");
		lblAnLansare.setBounds(130, 76, 82, 14);
		
		JSpinner spinnerAn = new JSpinner();
		spinnerAn.setBounds(220, 74, 100, 18);
		spinnerAn.setModel(new SpinnerNumberModel(2020, 2015, 2020, 1));
		
		contentPane.setLayout(null);
		contentPane.add(txtFilm);
		contentPane.add(lblFilm);
		contentPane.add(txtActori);
		contentPane.add(lblActori);
		contentPane.add(lblAnLansare);
		contentPane.add(spinnerAn);
		
		JPanel Genuri = new JPanel();
		Genuri.setBorder(new TitledBorder(null, "Genuri", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		Genuri.setBounds(100, 102, 325, 86);
		contentPane.add(Genuri);
		Genuri.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JCheckBox chckbxRomantic = new JCheckBox("romantic");
		Genuri.add(chckbxRomantic);
		
		JCheckBox chckbxComedie = new JCheckBox("comedie");
		Genuri.add(chckbxComedie);
		
		JCheckBox chckbxDrama = new JCheckBox("drama");
		Genuri.add(chckbxDrama);
		
		JCheckBox chckbxIstoric = new JCheckBox("istoric");
		Genuri.add(chckbxIstoric);
		
		JCheckBox chckbxActiune = new JCheckBox("actiune");
		Genuri.add(chckbxActiune);
		
		
		JButton btnAdauga = new JButton("Adauga");
		btnAdauga.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				text="";
				if (chckbxRomantic.isSelected())
				text+=chckbxRomantic.getText()+" ";
				if (chckbxComedie.isSelected())
				text+=chckbxComedie.getText()+" ";
				if (chckbxDrama.isSelected())
				text+=chckbxDrama.getText()+" ";
				if (chckbxIstoric.isSelected())
				text+=chckbxIstoric.getText()+" ";
				if (chckbxActiune.isSelected())
				text+=chckbxActiune.getText()+" ";
				Object[] data = {txtFilm.getText(), txtActori.getText(), spinnerAn.getValue(), text};
				tabmod.addRow(data);
			}
		});
		btnAdauga.setBounds(110, 200, 100, 25);
		contentPane.add(btnAdauga);
		
		JButton btnSterge = new JButton("Sterge");
		btnSterge.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tabmod.removeRow(table.getSelectedRow());
			}
		});
		btnSterge.setBounds(315, 200, 100, 25);
		contentPane.add(btnSterge);
	}
}
