package masterMind;

import java.util.Random;
import java.util.Scanner;

public class Helper extends MasterMind
{

    private String goedenKleurfoutenPlekPrint = "0";
    private String goedenKleurEnPlekPrint = "x";
    public int codenGrooten = 4;
    Random num = new Random();
    private int[] codeVak = new int [codenGrooten];
    public int levens = 10;
    Scanner sc = new Scanner(System.in);
    private int[] poging = new int[codenGrooten];
    private boolean[] mainControle = new boolean[codenGrooten];
    private String[] controle = new String[codenGrooten];
//code vak

    public int[] createCode()
    {
	for (int idx = 0; idx < codeVak.length; idx = idx + 1)
	{
	    codeVak[idx] = num.nextInt(6) + 1;
	}
	return codeVak;
    }
    public int [] pogingSpeler() {
	
	    for (int idx = 0; idx < poging.length; idx = idx + 1)
	    {
		System.out.println("code kraker kiest een cijfer uit 1 t/m 6");
		poging[idx] = sc.nextInt();
	    }
	    return poging;
    }
    public String[] controlenCheck() {
	 
	    for (int idx = 0; idx < controle.length; idx = idx + 1)
	    {
		controle[idx] = "*";
	    }

	    
	    for (int idx = 0; idx < controle.length; idx = idx + 1)
	    {
		mainControle[idx] = false;
	    }
	    // 1st contole checks
	    for (int idx = 0; idx < poging.length; idx = idx + 1)
	    {
		if (poging[idx] == codeVak[idx])
		{
		    controle[idx] = goedenKleurEnPlekPrint;
		    mainControle[idx] = true;
		}

		else
		    for (int y = 0; y < codeVak.length; y = y + 1)
		    {
			if (poging[idx] != codeVak[idx] && poging[idx] == codeVak[y])
			{
			    controle[idx] = goedenKleurfoutenPlekPrint;
			}
		    }
	    }
	    return controle;
    } 
 public int spelerwinst() {
//     winst controle
	    boolean spelerWinst = true;
	    for (int idx = 0; idx < mainControle.length; idx = idx + 1)
	    {
		if (mainControle[idx] == false)
		{
		    spelerWinst = false;
		    System.out.println("je hebt niet alles goed");
		    levens = levens - 1;
		    System.out.println("je hebt " + levens + " levens over");
		    break;
		}

	    }
	    if (spelerWinst)
	    {
		System.out.println("je hebt alles goed je wint");
		levens = -1;
	    }
	    return levens;
 }
}

