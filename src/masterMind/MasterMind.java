package masterMind;

import java.util.Scanner;
import java.util.Random;

public class MasterMind
{

    public static void main(String[] args)
    {
	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);

	Helper helper = new Helper();
	int[] codeVak = helper.createCode();

////	 test random code generator
//	for (int idx = 0; idx < codeVak.length; idx= idx +1) {
//            System.out.print(codeVak[idx] + "");};
//     System.out.println("");
//
     int levens = helper.levens;
	do
	{// start loop
	 
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
//	    1
	     levens = helper.spelerwinst();
	} while (levens > 0);// eind loop
	if (levens == 0)
	{
	    System.out.println("je hebt geen levens meer je hebt verloren");
	}
	sc.close();

    }

}
