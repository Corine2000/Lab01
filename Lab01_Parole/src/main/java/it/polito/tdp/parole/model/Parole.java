package it.polito.tdp.parole.model;

import java.util.*;

public class Parole {
	
	List<String> listaparole;
		
	public Parole() {
		//TODO
		listaparole = new LinkedList<String>();
	}
	
	public void addParola(String p) {
		//TODO
		listaparole.add(p);
	}
	
	public List<String> getElenco() {
		//TODO
		Collections.sort(listaparole, new OrdinamentoAlfabetico());
		return listaparole;
	}
	
	public void reset() {
		// TODO
		listaparole.clear();
	}
   
	public class OrdinamentoAlfabetico implements Comparator<String>{

		@Override
		public int compare(String s1, String s2) {
			return s1.compareTo(s2);
		}

		@Override
		public String toString() {
			String ss="";
			
			for(String s: listaparole)
			  {
				ss+= s +"\n";
			  }
			return ss;
		}

		
		
		
	}
}
