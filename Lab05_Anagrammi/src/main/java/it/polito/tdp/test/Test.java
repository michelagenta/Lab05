package it.polito.tdp.test;

import it.polito.tdp.anagrammiDAO.AnagrammaDAO;

public class Test {

	private void start() {
		
		AnagrammaDAO dao=new AnagrammaDAO();
		
		if(dao.isCorrect("ciao")) {
			System.out.println("E' nel dizionario");
		}
		else {
			System.out.println("non è presente");
		}
		
		
		if(dao.isCorrect("cola")) {
			System.out.println("E' nel dizionario");
		}
		else {
			System.out.println("non è presente");
		}
		
		
		
	}

}
