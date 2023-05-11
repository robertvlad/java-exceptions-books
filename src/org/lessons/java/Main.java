package org.lessons.java;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Numero di libri: ");
		
		int numLibri = sc.nextInt();
		
		sc.nextLine();
		
		Libro[] libri = new Libro[numLibri];
		
		for ( int i = 0; i < numLibri; i++ ) {
			
			System.out.print("Titolo: ");			
			String titolo = sc.nextLine();
			
			System.out.print("Numero di pagine: ");			
			int numPagine = sc.nextInt();
			
			sc.nextLine();
			
			System.out.print("Autore: ");			
			String autore = sc.nextLine();
			
			System.out.print("Editore: ");
			String editore = sc.nextLine();
			
			try {
				
				Libro l = new Libro(titolo, numPagine, autore, editore);
				libri[i] = l;
			} catch (Exception e) {
				
				i--;
				
				System.err.println("Valori errati, provare di nuovo!");
				System.err.println(e.getMessage());
			}
		}
		
		try {
			
			FileWriter myWriter = new FileWriter("C:\\Users\\vladr\\Desktop\\books.txt");
			
			for ( int i = 0; i < numLibri; i++ ) {
				
				Libro l = libri[i];
				
				myWriter.write(l.toString() + "\n");
			}

			myWriter.close();
		} catch (Exception e) {
			
			System.err.println("Errore: " + e.getMessage());
		}
		
		try {
			
			File fileLibri = new File("C:\\Users\\vladr\\Desktop\\books.txt");
			Scanner reader = new Scanner(fileLibri);
			
			while (reader.hasNextLine()) {
				
			   String line = reader.nextLine();
			   System.out.println(line);
			}

			reader.close();
		} catch (Exception e) {
			
			System.err.println("Errore: " + e.getMessage());
		}
	}

}
