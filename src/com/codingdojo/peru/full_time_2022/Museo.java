package com.codingdojo.peru.full_time_2022;

import java.util.ArrayList;
import java.util.Random;

public class Museo {

	public static void main(String[] args) {
		
		ArrayList<Arte> museo = new ArrayList<Arte> ();
		ArrayList<Arte> museoToPrint = new ArrayList<Arte> ();
		int numberOfElements = 0;
		Random random = new Random();
		
		Pintura pintura1 = new Pintura("Título 1", "Autor 1", "Descripción 1", "Óleo");
		museo.add(pintura1);
		Pintura pintura2 = new Pintura("Título 2", "Autor 2", "Descripción 2", "Acuarela");
		museo.add(pintura2);
		Pintura pintura3 = new Pintura("Título 3", "Autor 3", "Descripción 3", "Acrílico");
		museo.add(pintura3);
		
		Escultura escultura1 = new Escultura("Título 4", "Autor 4", "Descripción 4", "Mármol");
		museo.add(escultura1);
		Escultura escultura2 = new Escultura("Título 5", "Autor 5", "Descripción 5", "Bronce");
		museo.add(escultura2);
		
		numberOfElements = museo.size();
		museoToPrint.addAll(museo);
		for (int i = 0; i < numberOfElements; i++) {
			int randomIndex = random.nextInt(museoToPrint.size());
			museoToPrint.get(randomIndex).verArte();
			museoToPrint.remove(randomIndex);
		}
	}
}
