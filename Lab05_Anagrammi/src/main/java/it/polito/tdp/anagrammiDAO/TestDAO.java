package it.polito.tdp.anagrammiDAO;

import it.polito.tdp.model.AnagrammiModel;

public class TestDAO {

	public static void main(String[] args) {
		
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
			
			AnagrammiModel mod= new AnagrammiModel();
			System.out.println(mod.calcolaAnagrammi("eta"));
			
		}
		

	}


