package p2;

public class P2_main {

	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = 10;
		int d = 5;
		d=0;
		boolean E1 = a==b;
		boolean E2 = a==b||a==c;
		boolean E3 = a+b>=c;
		boolean E4 = a+b+c>=100;
		if(E1) {d++;}
		if(E2) {d++;}
		if(E3) {d++;}
		if(E4) {d++;}
		if(!E1&&!E2&&!E3&&!E4)
		{d=0;}
		System.out.println("Ergebnis" + d);
			
		

		
        
		

	}

}
