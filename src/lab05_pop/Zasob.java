package lab05_pop;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JOptionPane;


public class Zasob 
{ 
	public List<Przyprawa> zasoby = new ArrayList<>();
	Random generator = new Random();
	
	public List<Przyprawa> utworz(String dane, int ilosc)
	{
		try
		{
		String tekst[] = null;
		tekst = dane.split(":");
		for(int i=0; i<ilosc;i++)
		{
			Przyprawa p1 = new Przyprawa(i,tekst[i]);
			zasoby.add(p1);
		}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
		}
		return zasoby;
	}
	
	public synchronized String dodaj() 
	{
		String tekst="";
		int i = generator.nextInt(zasoby.size());
		while(zasoby.get(i).pelny==true)
		{
				try
				{
					wait();
				}
				catch(InterruptedException e) {}
		}
		tekst = tekst + zasoby.get(i).nazwa + " , ";
		zasoby.get(i).pelny=true;
		notifyAll();
		return tekst;
	}
	
	public synchronized String pobierz()
	{
		int i = generator.nextInt(zasoby.size());
		String tekst="";
		while(zasoby.get(i).pelny==false)
		{
				try
				{
					wait();
				}
				catch(InterruptedException e) {}
		}

		zasoby.get(i).pelny=false;
		tekst = tekst  + zasoby.get(i).nazwa + " , ";
		notifyAll();
		return tekst;
	}
}


