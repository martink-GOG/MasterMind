package masterMind;

import java.util.Scanner;
import java.util.Random;

public class MasterMind
{

    public static void main(String[] args)
    {
	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
//	Random num = new Random();
//code maker
//	String goedenKleurfoutenPlekPrint = "0";
//	String goedenKleurEnPlekPrint = "x";
//	int codenGrooten = 4;
	Helper helper = new Helper();
	//helper.createCode();
	int[] codeVak = helper.createCode();
////code vak
//	int[] codeVak = new int[codenGrooten];
//	for (int idx = 0; idx < codeVak.length; idx = idx + 1)
//	{
//	    codeVak[idx] = num.nextInt(6) + 1;
//	}

//	 test random code generator
//	for (int idx = 0; idx < codeVak.length; idx= idx +1) {
//            System.out.print(codeVak[idx] + "");};
//     System.out.println("");
//
     int levens = helper.levens;
	do
	{// start loop
	 // pogingen
//	    int[] poging = new int[codenGrooten];
//	    for (int idx = 0; idx < poging.length; idx = idx + 1)
//	    {
//		System.out.println("code kraker kiest een cijfer uit 1 t/m 6");
//		poging[idx] = sc.nextInt();
//	    }

	   
	    // controle aan maak
//	    String[] controle = new String[codenGrooten];
//	    for (int idx = 0; idx < controle.length; idx = idx + 1)
//	    {
//		controle[idx] = "*";
//	    }
//
//	    boolean[] mainControle = new boolean[codenGrooten];
//	    for (int idx = 0; idx < controle.length; idx = idx + 1)
//	    {
//		mainControle[idx] = false;
//	    }
//	    // 1st contole checks
//	    for (int idx = 0; idx < poging.length; idx = idx + 1)
//	    {
//		if (poging[idx] == codeVak[idx])
//		{
//		    controle[idx] = goedenKleurEnPlekPrint;
//		    mainControle[idx] = true;
//		}
//
//		else
//		    for (int y = 0; y < codeVak.length; y = y + 1)
//		    {
//			if (poging[idx] != codeVak[idx] && poging[idx] == codeVak[y])
//			{
//			    controle[idx] = goedenKleurfoutenPlekPrint;
//			}
//		    }
//	    }
//	    boolean[] mainControle= helper.
	    int[] poging = helper.pogingSpeler();
	    String[] controle = helper.controlenCheck();
	    // poging feedback
	    System.out.println("feedback poging:");
	    System.out.println("x is goed ");
	    System.out.println("0 is verkeerde plek ");
	    System.out.println("* zit er niet in");
	    for (int idx = 0; idx < poging.length; idx = idx + 1)
	    {
		System.out.print(poging[idx]);
	    }
	    System.out.println("");
	    for (int idx = 0; idx < controle.length; idx = idx + 1)
	    {
		System.out.print(controle[idx]);
	    }
	    System.out.println("");
//	     winst controle
//	    boolean spelerWinst = true;
//	    for (int idx = 0; idx < mainControle.length; idx = idx + 1)
//	    {
//		if (mainControle[idx] == false)
//		{
//		    spelerWinst = false;
//		    System.out.println("je hebt niet alles goed");
//		    levens = levens - 1;
//		    System.out.println("je hebt " + levens + " levens over");
//		    break;
//		}
//
//	    }
//	    if (spelerWinst)
//	    {
//		System.out.println("je hebt alles goed je wint");
//		levens = -1;
//	    }
	     levens = helper.spelerwinst();
	} while (levens > 0);// eind loop
	if (levens == 0)
	{
	    System.out.println("je hebt geen levens meer je hebt verloren");
	}
	sc.close();

    }

}
