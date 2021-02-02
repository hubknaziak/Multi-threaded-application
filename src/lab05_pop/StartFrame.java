package lab05_pop;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StartFrame {

	private JFrame frmKreatorPrzebieguAkcji;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StartFrame window = new StartFrame();
					window.frmKreatorPrzebieguAkcji.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public StartFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmKreatorPrzebieguAkcji = new JFrame();
		frmKreatorPrzebieguAkcji.setTitle("Kreator przebiegu akcji");
		frmKreatorPrzebieguAkcji.setBounds(100, 100, 456, 295);
		frmKreatorPrzebieguAkcji.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmKreatorPrzebieguAkcji.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Witaj w kreatorze przebiegu dzialania ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(105, 11, 258, 17);
		frmKreatorPrzebieguAkcji.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("na zasobach wspoldzielonych przez dostawce i kucharza");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(42, 28, 366, 17);
		frmKreatorPrzebieguAkcji.getContentPane().add(lblNewLabel_1);
		
		JLabel lblWprowadzDaneSymulacji = new JLabel("Wprowadz dane do\r\n symulacji");
		lblWprowadzDaneSymulacji.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblWprowadzDaneSymulacji.setForeground(new Color(0, 128, 0));
		lblWprowadzDaneSymulacji.setBounds(138, 64, 181, 17);
		frmKreatorPrzebieguAkcji.getContentPane().add(lblWprowadzDaneSymulacji);
		
		JLabel lblIloscZasobnikowZ = new JLabel("Ilosc zasobnikow z przyprawami:");
		lblIloscZasobnikowZ.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblIloscZasobnikowZ.setBounds(42, 98, 181, 14);
		frmKreatorPrzebieguAkcji.getContentPane().add(lblIloscZasobnikowZ);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField.setBounds(303, 95, 86, 20);
		frmKreatorPrzebieguAkcji.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblIloscPobieranychJednoczesnie = new JLabel("Typy przypraw w zasobnikach:");
		lblIloscPobieranychJednoczesnie.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblIloscPobieranychJednoczesnie.setBounds(42, 142, 240, 14);
		frmKreatorPrzebieguAkcji.getContentPane().add(lblIloscPobieranychJednoczesnie);
		
		JLabel lblrozneSkadniki = new JLabel("(w kolejno\u015Bci oddzielane znakiem \":\")");
		lblrozneSkadniki.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblrozneSkadniki.setBounds(219, 142, 218, 14);
		frmKreatorPrzebieguAkcji.getContentPane().add(lblrozneSkadniki);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_1.setBounds(42, 167, 366, 20);
		frmKreatorPrzebieguAkcji.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnDalej = new JButton("Dalej");
		btnDalej.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				if(arg0.getSource()==btnDalej)
				{
					int ilosc;
					String przejscie=textField.getText();
					ilosc = Integer.parseInt(przejscie);
					String tekst=textField_1.getText();
					String dane[] = tekst.split(":");
					if(ilosc!=dane.length)
					{
						JOptionPane.showMessageDialog(null, "Podano zla ilosc zasobnikow badz skladnikow");
						System.exit(0);
					}
				    
				    WynikiFrame wyniki = new WynikiFrame(tekst, ilosc);
					wyniki.frame.setVisible(true);
					
//		
				}
				
			}
		});
		btnDalej.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnDalej.setBounds(175, 209, 89, 23);
		frmKreatorPrzebieguAkcji.getContentPane().add(btnDalej);
	}
}
