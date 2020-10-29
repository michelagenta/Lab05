package it.polito.tdp.model;

import java.util.HashSet;
import java.util.Set;

import it.polito.tdp.anagrammiDAO.AnagrammaDAO;

public class AnagrammiModel {
	
	AnagrammaDAO dao= new AnagrammaDAO();
	
	public Set<String> calcolaAnagrammi(String parola){
		Set<String> anagrammi = new HashSet<>();
		String parziale="";
		
		calcola(parziale,parola,0,anagrammi);
		
		return anagrammi ;
	}
	
	private static int charCounter(String string, char c) {
		int count=0;
		
		for(int i=0;i<string.length();i++) {
			if(string.charAt(i)==c) {
				count++;
			}
		}
		return count; 
	}

	private void calcola(String parziale, String parola, int livello, Set<String> anagrammi) {
		
		//se sono arrivata alla fine
		if(livello==parola.length()) {
			anagrammi.add(parziale);
			return; 
		}
		
		for(int i=0;i<parola.length();i++) {
			if(charCounter(parziale,parola.charAt(i))<charCounter(parola,parola.charAt(i))) {
			parziale+=parola.charAt(i);
			calcola(parziale,parola,livello+1,anagrammi);
			parziale=parziale.substring(0,parziale.length()-1);
			}	
	
		}
		
	}
	
	public boolean isCorrect(String anagramma) {
		return dao.isCorrect(anagramma);
	}

}
