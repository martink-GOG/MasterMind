package masterMind;

import java.util.Scanner;
import java.util.Random;

public class MasterMind
{

    public static void main(String[] args)
    {
	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	Random num= new Random();
//code maker
	String goedenKleurfoutenPlekPrint = "0";
	String goedenKleurEnPlekPrint = "x";

//code vak
	

	int[] codeVak = new int[4];
	codeVak[0] = num.nextInt(6)+1;
	codeVak[1] = num.nextInt(6)+1;
	codeVak[2] = num.nextInt(6)+1;
	codeVak[3] = num.nextInt(6)+1;
	System.out.println("eerste poging   =" + codeVak[0] + codeVak[1] + codeVak[2] + codeVak[3]);
	int levens = 10;
	do {//start loop
	    // 1st poging
	    int[] poging = new int[4];
	        System.out.println("code kraker kiest een cijfer uit 1 t/m 6");
		poging[0] = sc.nextInt();
		System.out.println("code kraker kiest een cijfer uit 1 t/m 6");
		poging[1] = sc.nextInt();
		System.out.println("code kraker kiest een cijfer uit 1 t/m 6");
		poging[2] = sc.nextInt();
		System.out.println("code kraker kiest een cijfer uit 1 t/m 6");
		poging[3] = sc.nextInt();

		System.out.println("x is goed ");
		System.out.println("0 is verkeerde plek ");
		System.out.println("* zit er niet in");
		// controle 1
	String[] controle = new String[4];
		controle[0] = "*";
		controle[1] = "*";
		 controle[2] = "*";
		controle[3] = "*";
	    // poging1_1 contole check
		boolean eersteControle = poging[0] == codeVak[0];
		if (eersteControle)
		{
		    controle[0] = goedenKleurEnPlekPrint;
		} else
		{
		    if (poging[0] == codeVak[1] || poging[0] == codeVak[2] || poging[0] == codeVak[3])
		    {
			controle[0] = goedenKleurfoutenPlekPrint;
		    } 
		}
		// poging1_2 contole check
		boolean tweedenControle = poging[1] == codeVak[1];
		if (tweedenControle)
		{
		    controle[1] = goedenKleurEnPlekPrint;
		} else
		{
		    if (poging[1] == codeVak[0] || poging[1] == codeVak[2] || poging[1] == codeVak[3])
		    {
			controle[1] = goedenKleurfoutenPlekPrint;
		    }
		}
		// poging1_3 contole check
		boolean derdenControle =poging[2] == codeVak[2];
		if (derdenControle)
		{
		    controle[2] = goedenKleurEnPlekPrint;
		} else
		{
		    if (poging[2] == codeVak[1] || poging[2] == codeVak[0] || poging[2] == codeVak[3])
		    {
			controle[2] = goedenKleurfoutenPlekPrint;
		    } 
		}
		// poging1_4 contole check
		boolean vierdenControle =poging[3] == codeVak[3];
		if (vierdenControle)
		{
		    controle[3] = goedenKleurEnPlekPrint;
		} else
		{
		    if (poging[3] == codeVak[1] || poging[3] == codeVak[2] || poging[3] == codeVak[0])
		    {
			controle[3] = goedenKleurfoutenPlekPrint;
		    } 
		}
		//poging1 feedback
		System.out.println("eerste poging   =" + poging[0] + poging[1] + poging[2] + poging[3]);
		System.out.println("controle poging =" + controle[0] + controle[1] + controle[2] + controle[3]);
		//winst controle
		if (eersteControle && tweedenControle && derdenControle && vierdenControle)
		{
		    System.out.println("je hebt alles goed je wint");
		    levens = 0;
		} else
		{
		    System.out.println("je hebt niet alles goed");
		    levens = levens - 1;
		    System.out.println("je hebt " + levens + " levens over");
		}
	
	}while(levens > 0);// eind loop
	sc.close();

    }

}
