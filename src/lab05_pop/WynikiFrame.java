package lab05_pop;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.TextArea;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WynikiFrame {

	public JFrame frame;
	public TextArea textArea = new TextArea();
	public String tekst;
	public int ilosc;
	private final JButton btnSymuluj = new JButton("Symuluj");

	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	public WynikiFrame(String tekst, int ilosc) {
		this.tekst = tekst;
		this.ilosc = ilosc;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblWynikiSymulacji = new JLabel("Wyniki Symulacji:");
		lblWynikiSymulacji.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblWynikiSymulacji.setBounds(158, 11, 108, 17);
		frame.getContentPane().add(lblWynikiSymulacji);
		
		textArea.setBounds(10, 34, 414, 187);
		frame.getContentPane().add(textArea);
		Zasob z = new Zasob();
		z.utworz(tekst, ilosc);
		
		btnSymuluj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				Dostawca d1 = new Dostawca(z);
				Kucharz k1 = new Kucharz(z);
				
				d1.start();
				k1.start();
			}
		});
		
		btnSymuluj.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnSymuluj.setBounds(177, 227, 89, 23);
		frame.getContentPane().add(btnSymuluj);
	}
	
	 class Dostawca extends Thread
	 {
	 	public Zasob zas;

	 	public Dostawca (Zasob z)
	 	{
	 		zas = z;
	 	}
	 	
	 	public void run()
	 	{
	 		String przyprawy="";
	 		String linia="";
	 		while(true)
	 		{
	 			przyprawy = zas.dodaj() + "\n";
	 			linia=textArea.getText();
	 			textArea.setText(linia +"Dostawca uzupelnil: "+przyprawy);
	 			try 
	 			{
	 				sleep((int)(Math.random() * 1000));
	 			} catch (InterruptedException e) { } 
	 		}
	 	}
	
}
	 
	 class Kucharz extends Thread
	 {
	 	public Zasob zas;
	 	
	 	public Kucharz (Zasob z)
	 	{
	 		zas=z;
	 	}
	 	
	 	public void run()
	 	{
	 		String przyprawy = "";
	 		String linia="";
	 		while(true)
	 		{
	 			przyprawy=zas.pobierz() + "\n";
	 			linia=textArea.getText();
	 			textArea.setText(linia+"Kucharz pobral: "+przyprawy);
	 			try 
	 			{
	 				sleep((int)(Math.random() * 1000));
	 			} catch (InterruptedException e) { } 
	 		}
	 		
	 	}
	 	
	 }
}
