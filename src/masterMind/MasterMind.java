package masterMind;

import java.util.Scanner;

public class MasterMind
{

    public static void main(String[] args)
    {
	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
//code kraker
//	int kleur1 = 1;
//	int kleur2 = 2;
//	int kleur3 = 3;
//	int kleur4 = 4;
//	int kleur5 = 5;
//	int kleur6 = 6;
//code maker
	String goedenKleurfoutenPlekPrint = "0";
	String goedenKleurEnPlekPrint = "x";

//code vak
	System.out.println("code maker kiest een cijfer uit 1 t/m 6");
	int codeVak1 = sc.nextInt();
	System.out.println("code maker kiest een cijfer uit 1 t/m 6");
	int codeVak2 = sc.nextInt();
	System.out.println("code maker kiest een cijfer uit 1 t/m 6");
	int codeVak3 = sc.nextInt();
	System.out.println("code maker kiest een cijfer uit 1 t/m 6");
	int codeVak4 = sc.nextInt();
	
	int levens = 10;
	do {//start loop
	    // 1st poging
		System.out.println("code kraker kiest een cijfer uit 1 t/m 6");
		int poging1_1 = sc.nextInt();
		System.out.println("code kraker kiest een cijfer uit 1 t/m 6");
		int poging1_2 = sc.nextInt();
		System.out.println("code kraker kiest een cijfer uit 1 t/m 6");
		int poging1_3 = sc.nextInt();
		System.out.println("code kraker kiest een cijfer uit 1 t/m 6");
		int poging1_4 = sc.nextInt();

		System.out.println("x is goed ");
		System.out.println("0 is verkeerde plek ");
		System.out.println("* zit er niet in");
		// controle 1
		String controle1_1 = "*";
		String controle1_2 = "*";
		String controle1_3 = "*";
		String controle1_4 = "*";
	    // poging1_1 contole check
		if (poging1_1 == codeVak1)
		{
		    controle1_1 = goedenKleurEnPlekPrint;
		} else
		{
		    if (poging1_1 == codeVak2)
		    {
			controle1_1 = goedenKleurfoutenPlekPrint;
		    } else
		    {
			if (poging1_1 == codeVak3)
			{
			    controle1_1 = goedenKleurfoutenPlekPrint;
			} else
			{
			    if (poging1_1 == codeVak4)
			    {
				controle1_1 = goedenKleurfoutenPlekPrint;
			    }
			}
		    }
		}
		// poging1_2 contole check
		if (poging1_2 == codeVak2)
		{
		    controle1_2 = goedenKleurEnPlekPrint;
		} else
		{
		    if (poging1_2 == codeVak1)
		    {
			controle1_2 = goedenKleurfoutenPlekPrint;
		    } else
		    {
			if (poging1_2 == codeVak3)
			{
			    controle1_2 = goedenKleurfoutenPlekPrint;
			} else
			{
			    if (poging1_2 == codeVak4)
			    {
				controle1_2 = goedenKleurfoutenPlekPrint;
			    }
			}
		    }
		}
		// poging1_3 contole check
		if (poging1_3 == codeVak3)
		{
		    controle1_3 = goedenKleurEnPlekPrint;
		} else
		{
		    if (poging1_3 == codeVak2)
		    {
			controle1_3 = goedenKleurfoutenPlekPrint;
		    } else
		    {
			if (poging1_3 == codeVak1)
			{
			    controle1_3 = goedenKleurfoutenPlekPrint;
			} else
			{
			    if (poging1_3 == codeVak4)
			    {
				controle1_3 = goedenKleurfoutenPlekPrint;
			    }
			}
		    }
		}
		// poging1_4 contole check
		if (poging1_4 == codeVak4)
		{
		    controle1_4 = goedenKleurEnPlekPrint;
		} else
		{
		    if (poging1_4 == codeVak2)
		    {
			controle1_4 = goedenKleurfoutenPlekPrint;
		    } else
		    {
			if (poging1_4 == codeVak3)
			{
			    controle1_4 = goedenKleurfoutenPlekPrint;
			} else
			{
			    if (poging1_4 == codeVak1)
			    {
				controle1_4 = goedenKleurfoutenPlekPrint;
			    }
			}
		    }
		}
		//poging1 feedback
		System.out.println("eerste poging   =" + poging1_1 + poging1_2 + poging1_3 + poging1_4);
		System.out.println("controle poging =" + controle1_1 + controle1_2 + controle1_3 + controle1_4);
		//winst controle
		String controle1 = controle1_1 + controle1_2 + controle1_3 + controle1_4;
		String win = "xxxx";
		if (controle1.equals(win))
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
