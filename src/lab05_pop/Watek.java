//package lab05_pop;
//
//import javax.swing.JOptionPane;
//
//public class Watek extends Thread
//{
//	private String typ;
//	private Zasob z;
//	/*
//	private String text;
//    private Przyprawa przyprawa;
//
//    public Watek(String name, String text, Message message){
//       super(name);
//       this.text = text;
//       this.message = message;
//       }
//	*/
//	public String getTyp() { //do poprawy
//		return typ;
//	}
//
//	public void setTyp(Zasob z) {
//		this.typ = typ;
//	}
//
//	
//	public Zasob getZ() {
//		return z;
//	}
//
//	public void setZ(Zasob z) {
//		this.z = z;
//	}
//	
//	@Override
//	public void run() //KLASA DO ZAPOZNANIA I POPRAWY! TU ZNAJDUJE SIE, CO SIE BEDZIE DZIALO JAK ODPALI SIE WATEK!
//	{
//		
//		for(int i=0; i<10;i++)
//		{
//			if(typ.compareTo("Producent")==0)
//			{
//				//z.dodaj("1");
//				//System.out.println("Dodalem 1");
//				//JOptionPane.showMessageDialog(null, "Dodalem 1");
//			}
//			if(typ.compareTo("Konsument")==0)
//			{
//				//z.pobierz("1");
//				System.out.println("Pobralem 1"/*+ z.pobierz()*/);
//				//JOptionPane.showMessageDialog(null, "Pobralem 1");
//			}
//		}
//	}
//
//	
//}
//
