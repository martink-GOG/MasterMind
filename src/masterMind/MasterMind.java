package masterMind;

import java.util.Scanner;
import java.util.Random;

public class MasterMind
{

    public static void main(String[] args)
    {
	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	Random num = new Random();
//code maker
	String goedenKleurfoutenPlekPrint = "0";
	String goedenKleurEnPlekPrint = "x";
int codenGrooten = 4;
//code vak
	int[] codeVak = new int[codenGrooten];
	for (int idx = 0; idx < codeVak.length; idx = idx +1) {
	codeVak[idx] = num.nextInt(6) + 1;}
//	 System.out.println("code =" + codeVak[0] + codeVak[1] + codeVak[2] + codeVak[3]);
	//test random code generator
	int levens = 10;
	do
	{// start loop
	 // pogingen
	    int[] poging = new int[codenGrooten];
	    for (int idx = 0; idx < poging.length; idx = idx +1) {
	    System.out.println("code kraker kiest een cijfer uit 1 t/m 6");
	    poging[idx] = sc.nextInt();}
	    

	    System.out.println("x is goed ");
	    System.out.println("0 is verkeerde plek ");
	    System.out.println("* zit er niet in");
	    // controle aan maak
	    String[] controle = new String[codenGrooten];
	    for (int idx = 0; idx < controle.length; idx = idx +1) {
	    controle[idx] = "*";}
	    boolean[] mainControle = new boolean[codenGrooten];
	    for (int idx = 0; idx < controle.length; idx = idx +1) {
	    mainControle[idx] = false;}
	    // 1st contole checks
	    for (int idx = 0 ; idx < poging.length; idx = idx + 1 ) {
		if(poging[idx] == codeVak[idx]) {
		    controle[idx] = goedenKleurEnPlekPrint;
		    mainControle[idx] = true;}
		    
		else for (int y= 0 ;y < codeVak.length; y= y+1) {
		    if (poging[idx] != codeVak[idx] && poging[idx] == codeVak[y]) {
			controle[idx] = goedenKleurfoutenPlekPrint;
		    }
		}
	    }

	    // poging feedback
	    System.out.println("poging          =" + poging[0] + poging[1] + poging[2] + poging[3]);
	    System.out.println("controle poging =" + controle[0] + controle[1] + controle[2] + controle[3]);
	    // winst controle
	    if (mainControle[0] && mainControle[1] && mainControle[2] && mainControle[3])
	    {
		System.out.println("je hebt alles goed je wint");
		levens = -1;
	    } else
	    {
		System.out.println("je hebt niet alles goed");
		levens = levens - 1;
		System.out.println("je hebt " + levens + " levens over");
	    }

	} while (levens > 0);// eind loop
	if(levens == 0) {
	    System.out.println("je hebt geen levens meer je hebt verloren");
	}
	sc.close();

    }

}
