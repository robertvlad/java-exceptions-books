package org.lessons.java;

public class Libro {
	
	private String titolo;
	private int nrPagine;
	private String autore;
	private String editore;
	
	public Libro(String titolo, int nrPagine, String autore, String editore) throws Exception {
		
		setTitolo(titolo);
		setNrPagine(nrPagine);
		setAutore(autore);
		setEditore(editore);
	}
	
	public String getTitolo() {
		
		return titolo;
	}
	
	public void setTitolo(String titolo) throws Exception {
		
		if (titolo.isEmpty()) {
			
			throw new Exception("Il titolo non può essere vuoto!");
		}
		
		this.titolo = titolo;
	}
	
	public int getNrPagine() {
		
		return nrPagine;
	}
	
	public void setNrPagine(int nrPagine) throws Exception {
		
		if (nrPagine <= 0) {
			
			throw new Exception("Il numero di pagine non può essere 0 o inferiore a 0!");
		}
		
		this.nrPagine = nrPagine;
	}
	
	public String getAutore() {
		
		return autore;
	}
	
	public void setAutore(String autore) throws Exception {
		
		if (autore.isEmpty()) {
			
			throw new Exception("Il titolo non può essere vuoto!");
		}
		this.autore = autore;
	}
	
	public String getEditore() {
		
		return editore;
	}
	
	public void setEditore(String editore) {
		
		this.editore = editore;
	}
	
	
	@Override
	public String toString() {
		
		return "| Titolo: " + getTitolo() + " | Numero di pagine: " + getNrPagine() + " | Autore: " + getAutore() + " | Editore: " + getEditore() + " |";
	}
}
