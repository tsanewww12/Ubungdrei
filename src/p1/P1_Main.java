package p1;
public class P1_Main {

	public static void main(String[] args) 
	{
		int wuerfel = (int) (Math.random()*6)+1;
		System.out.println("Deine Nummer ist"+ wuerfel);
		if(wuerfel==1)
		{System.out.println("Gewonnen");}
		else if(wuerfel==4)
		{System.out.println("Gewonnen");}
		else if (wuerfel==2) 
		{
			System.out.println("Du hast verloren");
		}
		else if (wuerfel==5)
		{
			System.out.println("Das Ergebnis ist unentschieden.");
		}
		else
		{
			System.out.println("Das Ergebnis bleibt unklar");
		}
	}

}
