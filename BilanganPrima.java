package spe_skill_test_qa;

import java.util.Scanner;
public class BilanganPrima {

	public static void main(String[] args) {
		int i,j;
		boolean bil;
		Scanner input = new Scanner(System.in);
		System.out.print("Bilangan Prima n = "); 
		int batas = input.nextInt();
		long bilprima[] = new long[batas];
		for (i = 1; i<=batas; i++) {
			{
		bil=false;
		if (i==2)
		bil=true;
		else {
			for (j = 2; j<i; j++)
			{
				if (i%j== 0)
				{
					bil=false;
					break;
				}
				else
					bil=true;
			}
		}
		if (bil) {
			System.out.printf(i + " , ", args);
		}
		}
		// TODO Auto-generated method stub

	}

}
}