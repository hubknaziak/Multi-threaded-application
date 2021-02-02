//package lab05_pop;
//
//public class Bufor 
//{
//	public int wartosc;
//	public boolean dostepny = false; 
//	
//	public synchronized int get()
//	{
//		while(dostepny==false)
//		{
//			try 
//			{ 
//				wait();
//			} catch (InterruptedException e) { } 
//		}
//		dostepny = false;
//		notifyAll();
//		
//		return wartosc;
//	}
//	
//	public synchronized void set(int w)
//	{
//		while(dostepny==true)
//		{
//			try 
//			{ 
//				wait(); 
//			} catch (InterruptedException e) { } 
//		}
//		wartosc = w;
//		dostepny = true;
//		
//		notifyAll(); 
//	}
//}
