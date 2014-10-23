package net.xavihurtado;

import java.util.Arrays;
import java.util.Random;

public class MilersDeNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int busco = 457343;
		int aux = 0;
		boolean trobat = false;
		int[] numeros = new int[500000];
		long startTime, stopTime;
		long elapsedTime = 0;
		
		startTime = System.currentTimeMillis();
		for(int i = 0; i < 500000; i++)
		{
			Random r = new Random();
			int numRand = r.nextInt(500000);
			numeros[i] = numRand;
		}
		
		Arrays.sort(numeros);
		
		while(aux < numeros.length && !trobat)
		{
			if(numeros[aux] == busco)
			{
				System.out.println("S'ha trobat el número");
				stopTime = System.currentTimeMillis();
				elapsedTime = stopTime - startTime;
				trobat = true;
			}
			aux++;
		}
		if (!trobat)
		{
			stopTime = System.currentTimeMillis();
			elapsedTime = stopTime - startTime;
			System.out.println("No s'ha trobat el número");
		}
		System.out.println(elapsedTime + " milisegons." );
	}

}
